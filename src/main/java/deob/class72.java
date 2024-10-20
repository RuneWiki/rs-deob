package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("co")
public class class72 {

    @ObfuscatedName("co.ao")
    public static int[] field875 = new int[5];

    @ObfuscatedName("co.ab")
    public static int[][] field865 = new int[5][5000];

    @ObfuscatedName("co.aw")
    public static int[] field866 = new int[1000];

    @ObfuscatedName("co.al")
    public static String[] field867 = new String[1000];

    @ObfuscatedName("co.ag")
    public static int field860 = 0;

    @ObfuscatedName("co.ai")
    public static class64[] field861 = new class64[50];

    @ObfuscatedName("co.ap")
    public static Calendar field870 = Calendar.getInstance();

    @ObfuscatedName("co.av")
    public static final String[] field869 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("co.aq")
    public static boolean field873 = false;

    @ObfuscatedName("co.am")
    public static boolean field874 = false;

    @ObfuscatedName("co.ac")
    public static ArrayList field868 = new ArrayList();

    @ObfuscatedName("co.ae")
    public static int field876 = 0;

    @ObfuscatedName("co.bc")
    public static final double field877 = Math.log(2.0D);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kl.az(Ldr;I)V")
    public static void method5202(class89 arg0) {
        method2969(arg0, 500000, 475000);
    }

    @ObfuscatedName("fn.ah(Ldr;IIS)V")
    public static void method2969(class89 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1089;
        class80 var5;
        if (class533.method4103(arg0.field1083)) {
            Statics.field872 = (class296) var3[0];
            class197 var4 = class197.method5698(Statics.field872.field3173);
            var5 = class80.method6551(arg0.field1083, var4.field2006, var4.field2025);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class80.method2836(var6);
        }
        if (var5 != null) {
            method2711(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("el.af(Ldr;Ldn;III)V")
    public static void method2711(class89 arg0, class80 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1089;
        Statics.field88 = 0;
        Statics.field3152 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1006;
        int[] var7 = arg1.field1003;
        byte var8 = -1;
        field860 = 0;
        field873 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            StringBuilder var50;
            try {
                Statics.field862 = new int[arg1.field1005];
                int var11 = 0;
                Statics.field863 = new String[arg1.field1001];
                int var12 = 0;
                for (int var13 = 1; var13 < var4.length; var13++) {
                    if (var4[var13] instanceof Integer) {
                        int var14 = (Integer) var4[var13];
                        if (var14 == -2147483647) {
                            var14 = arg0.field1081;
                        }
                        if (var14 == -2147483646) {
                            var14 = arg0.field1082;
                        }
                        if (var14 == -2147483645) {
                            var14 = arg0.field1080 == null ? -1 : arg0.field1080.field3769;
                        }
                        if (var14 == -2147483644) {
                            var14 = arg0.field1087;
                        }
                        if (var14 == -2147483643) {
                            var14 = arg0.field1080 == null ? -1 : arg0.field1080.field3744;
                        }
                        if (var14 == -2147483642) {
                            var14 = arg0.field1084 == null ? -1 : arg0.field1084.field3769;
                        }
                        if (var14 == -2147483641) {
                            var14 = arg0.field1084 == null ? -1 : arg0.field1084.field3744;
                        }
                        if (var14 == -2147483640) {
                            var14 = arg0.field1085;
                        }
                        if (var14 == -2147483639) {
                            var14 = arg0.field1086;
                        }
                        Statics.field862[var11++] = var14;
                    } else if (var4[var13] instanceof String) {
                        String var15 = (String) var4[var13];
                        if (var15.equals("event_opbase")) {
                            var15 = arg0.field1078;
                        }
                        Statics.field863[var12++] = var15;
                    }
                }
                field876 = arg0.field1088;
                while (true) {
                    var10++;
                    if (var10 > arg2) {
                        throw new RuntimeException();
                    }
                    var5++;
                    int var59 = var6[var5];
                    if (var59 >= 100) {
                        boolean var46;
                        if (arg1.field1003[var5] == 1) {
                            var46 = true;
                        } else {
                            var46 = false;
                        }
                        int var47 = method2998(var59, arg1, var46);
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
                        field866[++Statics.field88 - 1] = var7[var5];
                    } else if (var59 == 1) {
                        int var16 = var7[var5];
                        field866[++Statics.field88 - 1] = class338.field3634[var16];
                    } else if (var59 == 2) {
                        int var17 = var7[var5];
                        class338.field3634[var17] = field866[--Statics.field88];
                        client.method103(var17);
                    } else if (var59 == 3) {
                        field867[++Statics.field3152 - 1] = arg1.field1004[var5];
                    } else if (var59 == 6) {
                        var5 += var7[var5];
                    } else if (var59 == 7) {
                        Statics.field88 -= 2;
                        if (field866[Statics.field88] != field866[Statics.field88 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 8) {
                        Statics.field88 -= 2;
                        if (field866[Statics.field88] == field866[Statics.field88 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 9) {
                        Statics.field88 -= 2;
                        if (field866[Statics.field88] < field866[Statics.field88 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 10) {
                        Statics.field88 -= 2;
                        if (field866[Statics.field88] > field866[Statics.field88 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 21) {
                        if (field860 == 0) {
                            return;
                        }
                        class64 var19 = field861[--field860];
                        arg1 = var19.field463;
                        var6 = arg1.field1006;
                        var7 = arg1.field1003;
                        var5 = var19.field459;
                        Statics.field862 = var19.field460;
                        Statics.field863 = var19.field458;
                    } else if (var59 == 25) {
                        int var20 = var7[var5];
                        field866[++Statics.field88 - 1] = class338.method3618(var20);
                    } else if (var59 == 27) {
                        int var21 = var7[var5];
                        class338.method4102(var21, field866[--Statics.field88]);
                    } else if (var59 == 31) {
                        Statics.field88 -= 2;
                        if (field866[Statics.field88] <= field866[Statics.field88 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 32) {
                        Statics.field88 -= 2;
                        if (field866[Statics.field88] >= field866[Statics.field88 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 33) {
                        field866[++Statics.field88 - 1] = Statics.field862[var7[var5]];
                    } else if (var59 == 34) {
                        Statics.field862[var7[var5]] = field866[--Statics.field88];
                    } else if (var59 == 35) {
                        field867[++Statics.field3152 - 1] = Statics.field863[var7[var5]];
                    } else if (var59 == 36) {
                        Statics.field863[var7[var5]] = field867[--Statics.field3152];
                    } else if (var59 == 37) {
                        int var22 = var7[var5];
                        Statics.field3152 -= var22;
                        String var23 = class407.method6399(field867, Statics.field3152, var22);
                        field867[++Statics.field3152 - 1] = var23;
                    } else if (var59 == 38) {
                        Statics.field88--;
                    } else if (var59 == 39) {
                        Statics.field3152--;
                    } else if (var59 == 40) {
                        int var24 = var7[var5];
                        class80 var25 = class80.method2836(var24);
                        int[] var26 = new int[var25.field1005];
                        String[] var27 = new String[var25.field1001];
                        for (int var28 = 0; var28 < var25.field1002; var28++) {
                            var26[var28] = field866[Statics.field88 - var25.field1002 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field1008; var29++) {
                            var27[var29] = field867[Statics.field3152 - var25.field1008 + var29];
                        }
                        Statics.field88 -= var25.field1002;
                        Statics.field3152 -= var25.field1008;
                        class64 var30 = new class64();
                        var30.field463 = arg1;
                        var30.field459 = var5;
                        var30.field460 = Statics.field862;
                        var30.field458 = Statics.field863;
                        field861[++field860 - 1] = var30;
                        arg1 = var25;
                        var6 = var25.field1006;
                        var7 = var25.field1003;
                        var5 = -1;
                        Statics.field862 = var26;
                        Statics.field863 = var27;
                    } else if (var59 == 42) {
                        field866[++Statics.field88 - 1] = Statics.field1558.method2591(var7[var5]);
                    } else if (var59 == 43) {
                        Statics.field1558.method2590(var7[var5], field866[--Statics.field88]);
                    } else if (var59 == 44) {
                        int var31 = var7[var5] >> 16;
                        int var32 = var7[var5] & 0xFFFF;
                        int var33 = field866[--Statics.field88];
                        if (var33 < 0 || var33 > 5000) {
                            throw new RuntimeException();
                        }
                        field875[var31] = var33;
                        byte var34 = -1;
                        if (var32 == 105) {
                            var34 = 0;
                        }
                        for (int var35 = 0; var35 < var33; var35++) {
                            field865[var31][var35] = var34;
                        }
                    } else if (var59 == 45) {
                        int var36 = var7[var5];
                        int var37 = field866[--Statics.field88];
                        if (var37 < 0 || var37 >= field875[var36]) {
                            throw new RuntimeException();
                        }
                        field866[++Statics.field88 - 1] = field865[var36][var37];
                    } else if (var59 == 46) {
                        int var38 = var7[var5];
                        Statics.field88 -= 2;
                        int var39 = field866[Statics.field88];
                        if (var39 < 0 || var39 >= field875[var38]) {
                            throw new RuntimeException();
                        }
                        field865[var38][var39] = field866[Statics.field88 + 1];
                    } else if (var59 == 47) {
                        String var40 = Statics.field1558.method2595(var7[var5]);
                        if (var40 == null) {
                            var40 = class370.field4272;
                        }
                        field867[++Statics.field3152 - 1] = var40;
                    } else if (var59 == 48) {
                        Statics.field1558.method2594(var7[var5], field867[--Statics.field3152]);
                    } else if (var59 == 49) {
                        String var41 = Statics.field1558.method2596(var7[var5]);
                        field867[++Statics.field3152 - 1] = var41;
                    } else if (var59 == 50) {
                        Statics.field1558.method2602(var7[var5], field867[--Statics.field3152]);
                    } else if (var59 == 60) {
                        class508 var42 = arg1.field1000[var7[var5]];
                        class492 var43 = (class492) var42.method8177((long) field866[--Statics.field88]);
                        if (var43 != null) {
                            var5 += var43.field4949;
                        }
                    } else if (var59 == 74) {
                        Integer var44 = Statics.field85.method3024(var7[var5]);
                        if (var44 == null) {
                            field866[++Statics.field88 - 1] = -1;
                        } else {
                            field866[++Statics.field88 - 1] = var44;
                        }
                    } else if (var59 == 76) {
                        Integer var45 = Statics.field1190.method7769(var7[var5]);
                        if (var45 == null) {
                            field866[++Statics.field88 - 1] = -1;
                        } else {
                            field866[++Statics.field88 - 1] = var45;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var57) {
                var9 = true;
                var50 = new StringBuilder(30);
                var50.append("").append(arg1.field4951).append(" ");
                for (int var51 = field860 - 1; var51 >= 0; var51--) {
                    var50.append("").append(field861[var51].field463.field4951).append(" ");
                }
            }
            var50.append("").append(var8);
            class561.method3291(var50.toString(), var57);
        } finally {
            while (field868.size() > 0) {
                class104 var54 = (class104) field868.remove(0);
                client.method6336(var54.method2546(), var54.method2538(), var54.method2541(), var54.method2542(), "");
            }
            if (field873) {
                field873 = false;
                client.method1135();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class561.method3291("Warning: Script " + arg1.field1009 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("fw.at(ILdn;ZB)I")
    public static int method2998(int arg0, class80 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3945(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2588(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4566(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2703(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method7004(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5600(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2973(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3018(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return Statics.method4835(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method5642(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method1082(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2588(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4566(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2703(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method7004(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5600(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method267(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method287(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method7763(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method8155(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1082(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2617(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3014(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method5382(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2929(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2701(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2935(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2273(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method1127(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method293(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3391(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2275(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3703(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2574(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3125(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method4040(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method289(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method7329(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2081(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method6042(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method3637(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method4854(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method3360(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method4736(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4038(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method5146(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method616(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method266(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method2772(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method3968(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iv.an(ILdn;ZS)I")
    public static int method3945(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field88 -= 3;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            int var5 = field866[Statics.field88 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class350 var6 = Statics.field2621.method5681(var3);
            if (var6.field3862 == null) {
                var6.field3862 = new class350[var5 + 1];
            }
            if (var6.field3862.length <= var5) {
                class350[] var7 = new class350[var5 + 1];
                for (int var8 = 0; var8 < var6.field3862.length; var8++) {
                    var7[var8] = var6.field3862[var8];
                }
                var6.field3862 = var7;
            }
            if (var5 > 0 && var6.field3862[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class350 var9 = new class350();
            var9.field3829 = var4;
            var9.field3796 = var9.field3769 = var6.field3769;
            var9.field3744 = var5;
            var9.field3775 = true;
            if (var4 == 12) {
                var9.method6079();
                var9.method6067().method5811(new class107(var9));
                var9.method6067().method5810(new class108(var9));
            }
            var6.field3862[var5] = var9;
            if (arg2) {
                Statics.field4903 = var9;
            } else {
                Statics.field5237 = var9;
            }
            client.method4817(var6);
            return 1;
        } else if (arg0 == 101) {
            class350 var10 = arg2 ? Statics.field4903 : Statics.field5237;
            class350 var11 = Statics.field2621.method5681(var10.field3769);
            var11.field3862[var10.field3744] = null;
            client.method4817(var11);
            return 1;
        } else if (arg0 == 102) {
            class350 var12 = Statics.field2621.method5681(field866[--Statics.field88]);
            var12.field3862 = null;
            client.method4817(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field88 -= 2;
            int var13 = field866[Statics.field88];
            int var14 = field866[Statics.field88 + 1];
            class350 var15 = Statics.field2621.method5686(var13, var14);
            if (var15 == null || var14 == -1) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
                if (arg2) {
                    Statics.field4903 = var15;
                } else {
                    Statics.field5237 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class350 var16 = Statics.field2621.method5681(field866[--Statics.field88]);
            if (var16 == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
                if (arg2) {
                    Statics.field4903 = var16;
                } else {
                    Statics.field5237 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.ao(ILdn;ZI)I")
    public static int method2588(int arg0, class80 arg1, boolean arg2) {
        int var3 = -1;
        class350 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field866[--Statics.field88];
            var4 = Statics.field2621.method5681(var3);
        } else {
            var4 = arg2 ? Statics.field4903 : Statics.field5237;
        }
        if (arg0 == 1000) {
            Statics.field88 -= 4;
            var4.field3753 = field866[Statics.field88];
            var4.field3732 = field866[Statics.field88 + 1];
            var4.field3749 = field866[Statics.field88 + 2];
            var4.field3750 = field866[Statics.field88 + 3];
            client.method4817(var4);
            Statics.field1468.method1369(var4);
            if (var3 != -1 && var4.field3829 == 0) {
                client.method9048(Statics.field2621.field3646[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field88 -= 4;
            var4.field3755 = field866[Statics.field88];
            var4.field3756 = field866[Statics.field88 + 1];
            var4.field3751 = field866[Statics.field88 + 2];
            var4.field3752 = field866[Statics.field88 + 3];
            client.method4817(var4);
            Statics.field1468.method1369(var4);
            if (var3 != -1 && var4.field3829 == 0) {
                client.method9048(Statics.field2621.field3646[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field866[--Statics.field88] == 1;
            if (var4.field3866 != var5) {
                var4.field3866 = var5;
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3891 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3892 = field866[--Statics.field88] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("je.ab(ILdn;ZI)I")
    public static int method4566(int arg0, class80 arg1, boolean arg2) {
        int var3 = -1;
        class350 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field866[--Statics.field88];
            var4 = Statics.field2621.method5681(var3);
        } else {
            var4 = arg2 ? Statics.field4903 : Statics.field5237;
        }
        if (arg0 == 1100) {
            Statics.field88 -= 2;
            int var5 = field866[Statics.field88];
            int var6 = field866[Statics.field88 + 1];
            if (var4.field3829 == 12) {
                class348 var7 = var4.method6067();
                if (var7 != null && var7.method5773(var5, var6)) {
                    client.method4817(var4);
                }
            } else {
                var4.field3742 = var5;
                if (var4.field3742 > var4.field3817 - var4.field3759) {
                    var4.field3742 = var4.field3817 - var4.field3759;
                }
                if (var4.field3742 < 0) {
                    var4.field3742 = 0;
                }
                var4.field3766 = var6;
                if (var4.field3766 > var4.field3768 - var4.field3760) {
                    var4.field3766 = var4.field3768 - var4.field3760;
                }
                if (var4.field3766 < 0) {
                    var4.field3766 = 0;
                }
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3886 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3773 = field866[--Statics.field88] == 1;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3815 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3777 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3779 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3782 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3783 = field866[--Statics.field88] == 1;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3784 = 1;
            var4.field3849 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field88 -= 6;
            var4.field3794 = field866[Statics.field88];
            var4.field3765 = field866[Statics.field88 + 1];
            var4.field3763 = field866[Statics.field88 + 2];
            var4.field3797 = field866[Statics.field88 + 3];
            var4.field3798 = field866[Statics.field88 + 4];
            var4.field3844 = field866[Statics.field88 + 5];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field866[--Statics.field88];
            if (var4.field3792 != var8) {
                var4.field3792 = var8;
                var4.field3879 = 0;
                var4.field3846 = 0;
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3803 = field866[--Statics.field88] == 1;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field867[--Statics.field3152];
            if (var4.field3829 == 12) {
                class348 var10 = var4.method6067();
                if (var10 != null && var10.method5913()) {
                    var10.method5766(var9);
                } else {
                    var4.field3807 = var9;
                }
                client.method4817(var4);
            } else if (!var9.equals(var4.field3807)) {
                var4.field3807 = var9;
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3806 = field866[--Statics.field88];
            if (var4.field3829 == 12) {
                class348 var11 = var4.method6067();
                if (var11 != null) {
                    var11.method5780();
                }
            }
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field88 -= 3;
            if (var4.field3829 == 12) {
                class348 var12 = var4.method6067();
                if (var12 != null) {
                    var12.method5774(field866[Statics.field88], field866[Statics.field88 + 1]);
                    var12.method5775(field866[Statics.field88 + 2]);
                }
            } else {
                var4.field3810 = field866[Statics.field88];
                var4.field3880 = field866[Statics.field88 + 1];
                var4.field3809 = field866[Statics.field88 + 2];
            }
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3812 = field866[--Statics.field88] == 1;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3893 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3874 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3786 = field866[--Statics.field88] == 1;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3787 = field866[--Statics.field88] == 1;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field88 -= 2;
            var4.field3817 = field866[Statics.field88];
            var4.field3768 = field866[Statics.field88 + 1];
            client.method4817(var4);
            if (var3 != -1 && var4.field3829 == 0) {
                client.method9048(Statics.field2621.field3646[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1136(var4.field3769, var4.field3744);
            client.field688 = var4;
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3780 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3770 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3873 = field866[--Statics.field88];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field866[--Statics.field88];
            class547 var14 = (class547) class393.method3484(class547.method4104(), var13);
            if (var14 != null) {
                var4.field3774 = var14;
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field866[--Statics.field88] == 1;
            var4.field3863 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field866[--Statics.field88] == 1;
            var4.field3804 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3781 = field867[--Statics.field3152];
            client.method4817(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6062(field867[--Statics.field3152], "", Statics.field1180, client.method2622());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field88 -= 2;
            var4.method6066(field866[Statics.field88], field866[Statics.field88 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6059(field867[--Statics.field3152], field866[--Statics.field88]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field88--;
            class342 var17 = var4.method6099();
            if (var17 != null) {
                var17.field3656 = field866[Statics.field88];
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field88--;
            class342 var18 = var4.method6099();
            if (var18 != null) {
                var18.field3657 = field866[Statics.field88];
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field3152--;
            class348 var19 = var4.method6067();
            if (var19 != null) {
                var4.field3808 = field867[Statics.field3152];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field88--;
            class342 var20 = var4.method6099();
            if (var20 != null) {
                var20.field3658 = field866[Statics.field88];
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field88--;
            class348 var21 = var4.method6067();
            if (var21 != null && var21.method5770(field866[Statics.field88])) {
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field88--;
            class348 var22 = var4.method6067();
            if (var22 != null && var22.method5790(field866[Statics.field88])) {
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field88--;
            class348 var23 = var4.method6067();
            if (var23 != null && var23.method5920(field866[Statics.field88])) {
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field866[--Statics.field88] == 1;
            client.field750.method3952();
            class348 var25 = var4.method6067();
            if (var25 != null && var25.method5886(var24)) {
                if (var24) {
                    client.field750.method3950(var4);
                }
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field866[--Statics.field88] == 1;
            if (!var26 && client.field750.method3951() == var4) {
                client.field750.method3952();
                client.method4817(var4);
            }
            class348 var27 = var4.method6067();
            if (var27 != null) {
                var27.method5765(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field88 -= 2;
            class348 var28 = var4.method6067();
            if (var28 != null && var28.method5788(field866[Statics.field88], field866[Statics.field88 + 1])) {
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field88--;
            class348 var29 = var4.method6067();
            if (var29 != null && var29.method5788(field866[Statics.field88], field866[Statics.field88])) {
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field88--;
            class348 var30 = var4.method6067();
            if (var30 != null) {
                var30.method5777(field866[Statics.field88]);
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field88--;
            class348 var31 = var4.method6067();
            if (var31 != null) {
                var31.method5776(field866[Statics.field88]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field88--;
            class348 var32 = var4.method6067();
            if (var32 != null) {
                var32.method5779(field866[Statics.field88]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field88--;
            class348 var33 = var4.method6067();
            if (var33 != null) {
                var33.method5865(field866[Statics.field88]);
                client.method4817(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field88 -= 2;
            class28 var34 = var4.method6082();
            if (var34 != null) {
                var34.method392(field866[Statics.field88], field866[Statics.field88 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field88 -= 2;
            class28 var35 = var4.method6082();
            if (var35 != null) {
                var35.method398((char) field866[Statics.field88], field866[Statics.field88 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6045(field867[--Statics.field3152], Statics.field1180);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field3152 -= 3;
            String var36 = field867[Statics.field3152];
            String var37 = field867[Statics.field3152 + 1];
            String var38 = field867[Statics.field3152 + 2];
            long var39 = client.method2622();
            long var41 = client.method7153();
            String var43 = client.method1827().method7887(client.method1827().field4970);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6063(var36, var37, var38, var43, Long.toString(var41), Statics.field1180);
            return 1;
        } else if (arg0 != 1152) {
            return 2;
        } else if (var4.field3829 == 11) {
            class172 var44 = var4.method6169();
            boolean var45 = var44 != null && class181.method2555().method3260(var44.method3158());
            field866[++Statics.field88 - 1] = var45 ? 1 : 0;
            return 1;
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ea.aw(ILdn;ZI)I")
    public static int method2703(int arg0, class80 arg1, boolean arg2) {
        class350 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field2621.method5681(field866[--Statics.field88]);
        } else {
            var3 = arg2 ? Statics.field4903 : Statics.field5237;
        }
        client.method4817(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field88 -= 2;
            int var9 = field866[Statics.field88];
            int var10 = field866[Statics.field88 + 1];
            var3.field3877 = var9;
            var3.field3776 = var10;
            class223 var11 = class223.method87(var9);
            var3.field3763 = var11.field2318;
            var3.field3797 = var11.field2319;
            var3.field3798 = var11.field2320;
            var3.field3794 = var11.field2322;
            var3.field3765 = var11.field2302;
            var3.field3844 = var11.field2311;
            if (arg0 == 1205) {
                var3.field3805 = 0;
            } else if (arg0 == 1212 | var11.field2323 == 1) {
                var3.field3805 = 1;
            } else {
                var3.field3805 = 2;
            }
            if (var3.field3800 > 0) {
                var3.field3844 = var3.field3844 * 32 / var3.field3800;
            } else if (var3.field3755 > 0) {
                var3.field3844 = var3.field3844 * 32 / var3.field3755;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3784 = 2;
            var3.field3849 = field866[--Statics.field88];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3784 = 3;
            var3.field3849 = Statics.field1608.field1123.method5745();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field866[--Statics.field88] == 1;
            class350.method2114(var3, Statics.field1608.field1123, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field866[--Statics.field88];
            if (var3.field3802 == null) {
                throw new RuntimeException("");
            }
            class350.method2302(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field88 -= 2;
            int var6 = field866[Statics.field88];
            int var7 = field866[Statics.field88 + 1];
            if (var3.field3802 == null) {
                throw new RuntimeException("");
            }
            class350.method3530(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field866[--Statics.field88];
            if (var3.field3802 == null) {
                throw new RuntimeException("");
            }
            class350.method5362(var3, Statics.field1608.field1123.field3687, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pl.ad(ILdn;ZI)I")
    public static int method7004(int arg0, class80 arg1, boolean arg2) {
        boolean var3 = true;
        class350 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field2621.method5681(field866[--Statics.field88]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field4903 : Statics.field5237;
        }
        if (arg0 == 1300) {
            int var5 = field866[--Statics.field88] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6081(var5, field867[--Statics.field3152]);
                return 1;
            } else {
                Statics.field3152--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field88 -= 2;
            int var6 = field866[Statics.field88];
            int var7 = field866[Statics.field88 + 1];
            var4.field3826 = Statics.field2621.method5686(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3747 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3843 = field866[--Statics.field88];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3889 = field866[--Statics.field88];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3824 = field867[--Statics.field3152];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3830 = field867[--Statics.field3152];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3825 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3818 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field88--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field88 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field866[Statics.field88 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field866[Statics.field88 + var10];
                        var9[var10 / 2] = (byte) field866[Statics.field88 + var10 + 1];
                    }
                }
            } else {
                Statics.field88 -= 2;
                var8 = new byte[] { (byte) field866[Statics.field88] };
                var9 = new byte[] { (byte) field866[Statics.field88 + 1] };
            }
            int var11 = field866[--Statics.field88] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method6566(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field88 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field866[Statics.field88] };
            byte[] var14 = new byte[] { (byte) field866[Statics.field88 + 1] };
            method6566(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field88 -= 3;
            int var15 = field866[Statics.field88] - 1;
            int var16 = field866[Statics.field88 + 1];
            int var17 = field866[Statics.field88 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method7235(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field866[--Statics.field88];
            int var20 = field866[--Statics.field88];
            method7235(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field88--;
            int var21 = field866[Statics.field88] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2338(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2338(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pm.al(Lnt;I[B[BB)V")
    public static final void method6566(class350 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3837 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3837 = new byte[11][];
            arg0.field3821 = new byte[11][];
            arg0.field3822 = new int[11];
            arg0.field3739 = new int[11];
        }
        arg0.field3837[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3819 = false;
            for (int var4 = 0; var4 < arg0.field3837.length; var4++) {
                if (arg0.field3837[var4] != null) {
                    arg0.field3819 = true;
                    break;
                }
            }
        } else {
            arg0.field3819 = true;
        }
        arg0.field3821[arg1] = arg3;
    }

    @ObfuscatedName("qb.as(Lnt;IIII)V")
    public static final void method7235(class350 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3822 == null) {
            throw new RuntimeException();
        }
        arg0.field3822[arg1] = arg2;
        arg0.field3739[arg1] = arg3;
    }

    @ObfuscatedName("dh.ag(Lnt;II)V")
    public static final void method2338(class350 arg0, int arg1) {
        if (arg0.field3837 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3767 == null) {
            arg0.field3767 = new int[arg0.field3837.length];
        }
        arg0.field3767[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("mg.ai(ILdn;ZS)I")
    public static int method5600(int arg0, class80 arg1, boolean arg2) {
        class350 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field2621.method5681(field866[--Statics.field88]);
        } else {
            var3 = arg2 ? Statics.field4903 : Statics.field5237;
        }
        String var4 = field867[--Statics.field3152];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field866[--Statics.field88];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field866[--Statics.field88];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field867[--Statics.field3152];
            } else {
                var7[var8] = Integer.valueOf(field866[--Statics.field88]);
            }
        }
        int var9 = field866[--Statics.field88];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3833 = var7;
        } else if (arg0 == 1401) {
            var3.field3864 = var7;
        } else if (arg0 == 1402) {
            var3.field3835 = var7;
        } else if (arg0 == 1403) {
            var3.field3740 = var7;
        } else if (arg0 == 1404) {
            var3.field3839 = var7;
        } else if (arg0 == 1405) {
            var3.field3788 = var7;
        } else if (arg0 == 1406) {
            var3.field3795 = var7;
        } else if (arg0 == 1407) {
            var3.field3801 = var7;
            var3.field3845 = var5;
        } else if (arg0 == 1408) {
            var3.field3850 = var7;
        } else if (arg0 == 1409) {
            var3.field3851 = var7;
        } else if (arg0 == 1410) {
            var3.field3841 = var7;
        } else if (arg0 == 1411) {
            var3.field3834 = var7;
        } else if (arg0 == 1412) {
            var3.field3838 = var7;
        } else if (arg0 == 1414) {
            var3.field3785 = var7;
            var3.field3847 = var5;
        } else if (arg0 == 1415) {
            var3.field3827 = var7;
            var3.field3743 = var5;
        } else if (arg0 == 1416) {
            var3.field3842 = var7;
        } else if (arg0 == 1417) {
            var3.field3853 = var7;
        } else if (arg0 == 1418) {
            var3.field3854 = var7;
        } else if (arg0 == 1419) {
            var3.field3855 = var7;
        } else if (arg0 == 1420) {
            var3.field3791 = var7;
        } else if (arg0 == 1421) {
            var3.field3894 = var7;
        } else if (arg0 == 1422) {
            var3.field3778 = var7;
        } else if (arg0 == 1423) {
            var3.field3764 = var7;
        } else if (arg0 == 1424) {
            var3.field3746 = var7;
        } else if (arg0 == 1425) {
            var3.field3870 = var7;
        } else if (arg0 == 1426) {
            var3.field3867 = var7;
        } else if (arg0 == 1427) {
            var3.field3789 = var7;
        } else if (arg0 == 1428) {
            var3.field3860 = var7;
        } else if (arg0 == 1429) {
            var3.field3861 = var7;
        } else if (arg0 == 1430) {
            var3.field3856 = var7;
        } else if (arg0 == 1431) {
            var3.field3857 = var7;
        } else if (arg0 == 1434) {
            var3.field3868 = var7;
        } else if (arg0 == 1435) {
            var3.field3852 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class346 var10 = var3.method6083();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3676 = var7;
                } else if (arg0 == 1437) {
                    var10.field3677 = var7;
                } else if (arg0 == 1438) {
                    var10.field3678 = var7;
                } else if (arg0 == 1439) {
                    var10.field3672 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3831 = true;
        return 1;
    }

    @ObfuscatedName("fu.ax(ILdn;ZB)I")
    public static int method2973(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? Statics.field4903 : Statics.field5237;
        if (arg0 == 1500) {
            field866[++Statics.field88 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 1501) {
            field866[++Statics.field88 - 1] = var3.field3758;
            return 1;
        } else if (arg0 == 1502) {
            field866[++Statics.field88 - 1] = var3.field3759;
            return 1;
        } else if (arg0 == 1503) {
            field866[++Statics.field88 - 1] = var3.field3760;
            return 1;
        } else if (arg0 == 1504) {
            field866[++Statics.field88 - 1] = var3.field3866 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field866[++Statics.field88 - 1] = var3.field3796;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fo.ar(ILdn;ZI)I")
    public static int method3018(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? Statics.field4903 : Statics.field5237;
        if (arg0 == 1600) {
            field866[++Statics.field88 - 1] = var3.field3742;
            return 1;
        } else if (arg0 == 1601) {
            field866[++Statics.field88 - 1] = var3.field3766;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3829 == 12) {
                class348 var4 = var3.method6067();
                if (var4 != null) {
                    field867[++Statics.field3152 - 1] = var4.method5812().method6897();
                    return 1;
                }
            }
            field867[++Statics.field3152 - 1] = var3.field3807;
            return 1;
        } else if (arg0 == 1603) {
            field866[++Statics.field88 - 1] = var3.field3817;
            return 1;
        } else if (arg0 == 1604) {
            field866[++Statics.field88 - 1] = var3.field3768;
            return 1;
        } else if (arg0 == 1605) {
            field866[++Statics.field88 - 1] = var3.field3844;
            return 1;
        } else if (arg0 == 1606) {
            field866[++Statics.field88 - 1] = var3.field3763;
            return 1;
        } else if (arg0 == 1607) {
            field866[++Statics.field88 - 1] = var3.field3798;
            return 1;
        } else if (arg0 == 1608) {
            field866[++Statics.field88 - 1] = var3.field3797;
            return 1;
        } else if (arg0 == 1609) {
            field866[++Statics.field88 - 1] = var3.field3815;
            return 1;
        } else if (arg0 == 1610) {
            field866[++Statics.field88 - 1] = var3.field3873;
            return 1;
        } else if (arg0 == 1611) {
            field866[++Statics.field88 - 1] = var3.field3886;
            return 1;
        } else if (arg0 == 1612) {
            field866[++Statics.field88 - 1] = var3.field3770;
            return 1;
        } else if (arg0 == 1613) {
            field866[++Statics.field88 - 1] = var3.field3774.method38();
            return 1;
        } else if (arg0 == 1614) {
            field866[++Statics.field88 - 1] = var3.field3804 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class342 var5 = var3.method6099();
                field866[++Statics.field88 - 1] = var5 == null ? 0 : var5.field3656;
            }
            if (arg0 == 1618) {
                class342 var6 = var3.method6099();
                field866[++Statics.field88 - 1] = var6 == null ? 0 : var6.field3657;
                return 1;
            } else if (arg0 == 1619) {
                class348 var7 = var3.method6067();
                field867[++Statics.field3152 - 1] = var7 == null ? "" : var7.method5813().method6897();
                return 1;
            } else if (arg0 == 1620) {
                class342 var8 = var3.method6099();
                field866[++Statics.field88 - 1] = var8 == null ? 0 : var8.field3658;
                return 1;
            } else if (arg0 == 1621) {
                class348 var9 = var3.method6067();
                field866[++Statics.field88 - 1] = var9 == null ? 0 : var9.method5823();
                return 1;
            } else if (arg0 == 1622) {
                class348 var10 = var3.method6067();
                field866[++Statics.field88 - 1] = var10 == null ? 0 : var10.method5824();
                return 1;
            } else if (arg0 == 1623) {
                class348 var11 = var3.method6067();
                field866[++Statics.field88 - 1] = var11 == null ? 0 : var11.method5825();
                return 1;
            } else if (arg0 == 1624) {
                class348 var12 = var3.method6067();
                field866[++Statics.field88 - 1] = var12 != null && var12.method5859() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class348 var13 = var3.method6067();
                field866[++Statics.field88 - 1] = var13 != null && var13.method5816() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class348 var14 = var3.method6067();
                field867[++Statics.field3152 - 1] = var14 == null ? "" : var14.method5831().method7115();
                return 1;
            } else if (arg0 == 1627) {
                class348 var15 = var3.method6067();
                int var16 = var15 == null ? 0 : var15.method5959();
                int var17 = var15 == null ? 0 : var15.method5910();
                field866[++Statics.field88 - 1] = Math.min(var16, var17);
                field866[++Statics.field88 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class348 var18 = var3.method6067();
                field866[++Statics.field88 - 1] = var18 == null ? 0 : var18.method5910();
                return 1;
            } else if (arg0 == 1629) {
                class348 var19 = var3.method6067();
                field866[++Statics.field88 - 1] = var19 == null ? 0 : var19.method5827();
                return 1;
            } else if (arg0 == 1630) {
                class348 var20 = var3.method6067();
                field866[++Statics.field88 - 1] = var20 == null ? 0 : var20.method5974();
                return 1;
            } else if (arg0 == 1631) {
                class348 var21 = var3.method6067();
                field866[++Statics.field88 - 1] = var21 == null ? 0 : var21.method5828();
                return 1;
            } else if (arg0 == 1632) {
                class348 var22 = var3.method6067();
                field866[++Statics.field88 - 1] = var22 == null ? 0 : var22.method5829();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6082();
                field866[Statics.field88 - 1] = var23 == null ? 0 : var23.method360(field866[Statics.field88 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6082();
                field866[Statics.field88 - 1] = var24 == null ? 0 : var24.method375((char) field866[Statics.field88 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("by.au(Lnt;B)I")
    public static int method748(class350 arg0) {
        if (arg0.field3829 == 11) {
            String var1 = field867[--Statics.field3152];
            field866[++Statics.field88 - 1] = arg0.method6070(var1);
            return 1;
        } else {
            Statics.field3152--;
            field866[++Statics.field88 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("mu.ay(Lnt;B)I")
    public static int method5651(class350 arg0) {
        if (arg0.field3829 == 11) {
            String var1 = field867[--Statics.field3152];
            field867[++Statics.field3152 - 1] = arg0.method6170(var1);
            return 1;
        } else {
            field867[Statics.field3152 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("ml.ap(ILdn;ZI)I")
    public static int method5642(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? Statics.field4903 : Statics.field5237;
        if (arg0 == 1800) {
            field866[++Statics.field88 - 1] = class351.method5704(client.method450(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field866[--Statics.field88];
            int var5 = var4 - 1;
            if (var3.field3825 == null || var5 >= var3.field3825.length || var3.field3825[var5] == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var3.field3825[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3824 == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var3.field3824;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.av(ILdn;ZB)I")
    public static int method1082(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field876 >= 10) {
                throw new RuntimeException();
            }
            class350 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field2621.method5681(field866[--Statics.field88]);
            } else {
                var10 = arg2 ? Statics.field4903 : Statics.field5237;
            }
            if (var10.field3789 == null) {
                return 0;
            }
            class89 var11 = new class89();
            var11.field1080 = var10;
            var11.field1089 = var10.field3789;
            var11.field1088 = field876 + 1;
            client.field726.method6581(var11);
            return 1;
        } else if (arg0 == 1928) {
            class350 var3 = arg2 ? Statics.field4903 : Statics.field5237;
            int var4 = field866[--Statics.field88];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class104 var5 = new class104(var4, var3.field3769, var3.field3744, var3.field3877);
            field868.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field88 -= 3;
            int var6 = field866[Statics.field88];
            int var7 = field866[Statics.field88 + 1];
            int var8 = field866[Statics.field88 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class104 var9 = new class104(var8, var6, var7, Statics.field2621.method5681(var6).field3877);
            field868.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.aa(ILdn;ZI)I")
    public static int method267(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = Statics.field2621.method5681(field866[--Statics.field88]);
        if (arg0 == 2500) {
            field866[++Statics.field88 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 2501) {
            field866[++Statics.field88 - 1] = var3.field3758;
            return 1;
        } else if (arg0 == 2502) {
            field866[++Statics.field88 - 1] = var3.field3759;
            return 1;
        } else if (arg0 == 2503) {
            field866[++Statics.field88 - 1] = var3.field3760;
            return 1;
        } else if (arg0 == 2504) {
            field866[++Statics.field88 - 1] = var3.field3866 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field866[++Statics.field88 - 1] = var3.field3796;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.aq(ILdn;ZI)I")
    public static int method287(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = Statics.field2621.method5681(field866[--Statics.field88]);
        if (arg0 == 2600) {
            field866[++Statics.field88 - 1] = var3.field3742;
            return 1;
        } else if (arg0 == 2601) {
            field866[++Statics.field88 - 1] = var3.field3766;
            return 1;
        } else if (arg0 == 2602) {
            field867[++Statics.field3152 - 1] = var3.field3807;
            return 1;
        } else if (arg0 == 2603) {
            field866[++Statics.field88 - 1] = var3.field3817;
            return 1;
        } else if (arg0 == 2604) {
            field866[++Statics.field88 - 1] = var3.field3768;
            return 1;
        } else if (arg0 == 2605) {
            field866[++Statics.field88 - 1] = var3.field3844;
            return 1;
        } else if (arg0 == 2606) {
            field866[++Statics.field88 - 1] = var3.field3763;
            return 1;
        } else if (arg0 == 2607) {
            field866[++Statics.field88 - 1] = var3.field3798;
            return 1;
        } else if (arg0 == 2608) {
            field866[++Statics.field88 - 1] = var3.field3797;
            return 1;
        } else if (arg0 == 2609) {
            field866[++Statics.field88 - 1] = var3.field3815;
            return 1;
        } else if (arg0 == 2610) {
            field866[++Statics.field88 - 1] = var3.field3873;
            return 1;
        } else if (arg0 == 2611) {
            field866[++Statics.field88 - 1] = var3.field3886;
            return 1;
        } else if (arg0 == 2612) {
            field866[++Statics.field88 - 1] = var3.field3770;
            return 1;
        } else if (arg0 == 2613) {
            field866[++Statics.field88 - 1] = var3.field3774.method38();
            return 1;
        } else if (arg0 == 2614) {
            field866[++Statics.field88 - 1] = var3.field3804 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class342 var4 = var3.method6099();
                field866[++Statics.field88 - 1] = var4 == null ? 0 : var4.field3656;
            }
            if (arg0 == 2618) {
                class342 var5 = var3.method6099();
                field866[++Statics.field88 - 1] = var5 == null ? 0 : var5.field3657;
                return 1;
            } else if (arg0 == 2619) {
                class348 var6 = var3.method6067();
                field867[++Statics.field3152 - 1] = var6 == null ? "" : var6.method5813().method6897();
                return 1;
            } else if (arg0 == 2620) {
                class342 var7 = var3.method6099();
                field866[++Statics.field88 - 1] = var7 == null ? 0 : var7.field3658;
                return 1;
            } else if (arg0 == 2621) {
                class348 var8 = var3.method6067();
                field866[++Statics.field88 - 1] = var8 == null ? 0 : var8.method5823();
                return 1;
            } else if (arg0 == 2622) {
                class348 var9 = var3.method6067();
                field866[++Statics.field88 - 1] = var9 == null ? 0 : var9.method5824();
                return 1;
            } else if (arg0 == 2623) {
                class348 var10 = var3.method6067();
                field866[++Statics.field88 - 1] = var10 == null ? 0 : var10.method5825();
                return 1;
            } else if (arg0 == 2624) {
                class348 var11 = var3.method6067();
                field866[++Statics.field88 - 1] = var11 != null && var11.method5859() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class348 var12 = var3.method6067();
                field866[++Statics.field88 - 1] = var12 != null && var12.method5816() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class348 var13 = var3.method6067();
                field867[++Statics.field3152 - 1] = var13 == null ? "" : var13.method5831().method7115();
                return 1;
            } else if (arg0 == 2627) {
                class348 var14 = var3.method6067();
                int var15 = var14 == null ? 0 : var14.method5959();
                int var16 = var14 == null ? 0 : var14.method5910();
                field866[++Statics.field88 - 1] = Math.min(var15, var16);
                field866[++Statics.field88 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class348 var17 = var3.method6067();
                field866[++Statics.field88 - 1] = var17 == null ? 0 : var17.method5910();
                return 1;
            } else if (arg0 == 2629) {
                class348 var18 = var3.method6067();
                field866[++Statics.field88 - 1] = var18 == null ? 0 : var18.method5827();
                return 1;
            } else if (arg0 == 2630) {
                class348 var19 = var3.method6067();
                field866[++Statics.field88 - 1] = var19 == null ? 0 : var19.method5974();
                return 1;
            } else if (arg0 == 2631) {
                class348 var20 = var3.method6067();
                field866[++Statics.field88 - 1] = var20 == null ? 0 : var20.method5828();
                return 1;
            } else if (arg0 == 2632) {
                class348 var21 = var3.method6067();
                field866[++Statics.field88 - 1] = var21 == null ? 0 : var21.method5829();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6082();
                field866[Statics.field88 - 1] = var22 == null ? 0 : var22.method360(field866[Statics.field88 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6082();
                field866[Statics.field88 - 1] = var23 == null ? 0 : var23.method375((char) field866[Statics.field88 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("sp.am(ILdn;ZS)I")
    public static int method7763(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class350 var3 = Statics.field2621.method5681(field866[--Statics.field88]);
            field866[++Statics.field88 - 1] = var3.field3877;
            return 1;
        } else if (arg0 == 2701) {
            class350 var4 = Statics.field2621.method5681(field866[--Statics.field88]);
            if (var4.field3877 == -1) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var4.field3776;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field866[--Statics.field88];
            class88 var6 = (class88) client.field684.method8206((long) var5);
            if (var6 == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field866[++Statics.field88 - 1] = client.field683;
            return 1;
        } else if (arg0 == 2707) {
            class350 var7 = Statics.field2621.method5681(field866[--Statics.field88]);
            field866[++Statics.field88 - 1] = var7.method6097() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class350 var8 = Statics.field2621.method5681(field866[--Statics.field88]);
            return method748(var8);
        } else if (arg0 == 2709) {
            class350 var9 = Statics.field2621.method5681(field866[--Statics.field88]);
            return method5651(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ty.ac(ILdn;ZS)I")
    public static int method8155(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = Statics.field2621.method5681(field866[--Statics.field88]);
        if (arg0 == 2800) {
            field866[++Statics.field88 - 1] = class351.method5704(client.method450(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field866[--Statics.field88];
            int var5 = var4 - 1;
            if (var3.field3825 == null || var5 >= var3.field3825.length || var3.field3825[var5] == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var3.field3825[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3824 == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var3.field3824;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ed.ae(ILdn;ZI)I")
    public static int method2617(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field867[--Statics.field3152];
            class112.method2177(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field88 -= 2;
            client.method3335(Statics.field1608, field866[Statics.field88], field866[Statics.field88 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field874) {
                field873 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field867[--Statics.field3152];
            int var5 = 0;
            if (Statics.method4033(var4)) {
                var5 = class407.method3456(var4);
            }
            class313 var6 = class313.method7156(class311.field3287, client.field574.field1438);
            var6.field3318.method8448(var5);
            client.field574.method2654(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field867[--Statics.field3152];
            class313 var8 = class313.method7156(class311.field3234, client.field574.field1438);
            var8.field3318.method8445(var7.length() + 1);
            var8.field3318.method8452(var7);
            client.field574.method2654(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field867[--Statics.field3152];
            class313 var10 = class313.method7156(class311.field3221, client.field574.field1438);
            var10.field3318.method8445(var9.length() + 1);
            var10.field3318.method8452(var9);
            client.field574.method2654(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field866[--Statics.field88];
            String var12 = field867[--Statics.field3152];
            client.method7552(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field88 -= 3;
            int var13 = field866[Statics.field88];
            int var14 = field866[Statics.field88 + 1];
            int var15 = field866[Statics.field88 + 2];
            class350 var16 = Statics.field2621.method5681(var15);
            client.method435(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field88 -= 2;
            int var17 = field866[Statics.field88];
            int var18 = field866[Statics.field88 + 1];
            class350 var19 = arg2 ? Statics.field4903 : Statics.field5237;
            client.method435(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field4580 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field866[++Statics.field88 - 1] = Statics.field1336.method2347() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1336.method2346(field866[--Statics.field88] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field867[--Statics.field3152];
            boolean var21 = field866[--Statics.field88] == 1;
            class32.method2865(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field866[--Statics.field88];
            class313 var23 = class313.method7156(class311.field3233, client.field574.field1438);
            var23.field3318.method8446(var22);
            client.field574.method2654(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field866[--Statics.field88];
            Statics.field3152 -= 2;
            String var25 = field867[Statics.field3152];
            String var26 = field867[Statics.field3152 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class313 var27 = class313.method7156(class311.field3225, client.field574.field1438);
                var27.field3318.method8446(1 + class535.method3943(var25) + class535.method3943(var26));
                var27.field3318.method8445(var24);
                var27.field3318.method8452(var26);
                var27.field3318.method8452(var25);
                client.field574.method2654(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field88--;
            return 1;
        } else if (arg0 == 3118) {
            client.field671 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field599 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field866[--Statics.field88] == 1) {
                client.field642 |= 0x1;
            } else {
                client.field642 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field866[--Statics.field88] == 1) {
                client.field642 |= 0x2;
            } else {
                client.field642 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field866[--Statics.field88] == 1) {
                client.field642 |= 0x4;
            } else {
                client.field642 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field866[--Statics.field88] == 1) {
                client.field642 |= 0x8;
            } else {
                client.field642 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field642 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field633 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field635 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method6264(field866[--Statics.field88] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field866[++Statics.field88 - 1] = client.method2202() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field88 -= 2;
            client.field676 = field866[Statics.field88];
            client.field608 = field866[Statics.field88 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field88 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field88--;
            return 1;
        } else if (arg0 == 3132) {
            field866[++Statics.field88 - 1] = Statics.field1700;
            field866[++Statics.field88 - 1] = Statics.field3661;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field88--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field88 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field685 = 3;
            client.field686 = field866[--Statics.field88];
            return 1;
        } else if (arg0 == 3137) {
            client.field685 = 2;
            client.field686 = field866[--Statics.field88];
            return 1;
        } else if (arg0 == 3138) {
            client.field685 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field685 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field685 = 3;
            client.field686 = arg2 ? Statics.field4903.field3769 : Statics.field5237.field3769;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field866[--Statics.field88] == 1;
            Statics.field1336.method2426(var28);
            return 1;
        } else if (arg0 == 3142) {
            field866[++Statics.field88 - 1] = Statics.field1336.method2349() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field866[--Statics.field88] == 1;
            client.field643 = var29;
            if (!var29) {
                Statics.field1336.method2364("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field866[++Statics.field88 - 1] = client.field643 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field866[--Statics.field88] == 1;
            Statics.field1336.method2408(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field866[++Statics.field88 - 1] = Statics.field1336.method2351() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field866[++Statics.field88 - 1] = class77.field934;
            return 1;
        } else if (arg0 == 3154) {
            field866[++Statics.field88 - 1] = client.method6561();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field3152--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field88 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field88--;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field88--;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field3152--;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field88--;
            field867[++Statics.field3152 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field88--;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field88 -= 2;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field88 -= 2;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field88 -= 2;
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            field867[++Statics.field3152 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field88--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field88--;
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field88--;
            return 1;
        } else if (arg0 == 3175) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field3152--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field3152--;
            return 1;
        } else if (arg0 == 3181) {
            client.method3364(field866[--Statics.field88]);
            return 1;
        } else if (arg0 == 3182) {
            field866[++Statics.field88 - 1] = client.method3173();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field866[--Statics.field88];
            client.method449(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.ak(ILdn;ZI)I")
    public static int method3014(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field88 -= 3;
            client.method3011(field866[Statics.field88], field866[Statics.field88 + 1], field866[Statics.field88 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field88 -= 5;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            int var5 = field866[Statics.field88 + 2];
            int var6 = field866[Statics.field88 + 3];
            int var7 = field866[Statics.field88 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method1800(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field88 -= 2;
            client.method2937(field866[Statics.field88], field866[Statics.field88 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class92 var50 = class92.field1121;
            class91 var51 = class91.field1108;
            int var52 = field866[--Statics.field88];
            if (arg0 == 3212) {
                int var53 = field866[--Statics.field88];
                var50 = (class92) class393.method3484(class92.method824(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field866[--Statics.field88];
                var51 = (class91) class393.method3484(class91.method3128(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field866[--Statics.field88];
                var50 = (class92) class393.method3484(class92.method824(), var55);
                if (var50 == null) {
                    var51 = (class91) class393.method3484(class91.method3128(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class92.field1115;
            } else if (arg0 == 3203) {
                var51 = class91.field1101;
            } else if (arg0 == 3205) {
                var51 = class91.field1102;
            } else if (arg0 == 3207) {
                var51 = class91.field1099;
            }
            if (class91.field1108 == var51) {
                switch(var50.field1112) {
                    case 1:
                        Statics.field1336.method2426(var52 == 1);
                        break;
                    case 2:
                        Statics.field1336.method2408(var52 == 1);
                        break;
                    case 3:
                        Statics.field1336.method2352(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field1336.method2446(var52);
                        break;
                    case 5:
                        client.method3364(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1104) {
                    case 1:
                        Statics.field1336.method2346(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method3384(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method8335(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method1829(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class92 var38 = class92.field1121;
            class91 var39 = class91.field1108;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field866[--Statics.field88];
                var38 = (class92) class393.method3484(class92.method824(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field866[--Statics.field88];
                var39 = (class91) class393.method3484(class91.method3128(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field866[--Statics.field88];
                var38 = (class92) class393.method3484(class92.method824(), var43);
                if (var38 == null) {
                    var39 = (class91) class393.method3484(class91.method3128(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class92.field1115;
            } else if (arg0 == 3204) {
                var39 = class91.field1101;
            } else if (arg0 == 3206) {
                var39 = class91.field1102;
            } else if (arg0 == 3208) {
                var39 = class91.field1099;
            }
            int var45;
            if (class91.field1108 == var39) {
                switch(var38.field1112) {
                    case 1:
                        var45 = Statics.field1336.method2349() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field1336.method2351() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field1336.method2354() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field1336.method2437();
                        break;
                    case 5:
                        var45 = client.method3173();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1104) {
                    case 1:
                        var45 = Statics.field1336.method2347() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field1336.method2391();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field1336.method2361();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field1336.method2363();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field866[++Statics.field88 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field866[--Statics.field88];
            int var10 = 0;
            class92 var11 = (class92) class393.method3484(class92.method824(), var9);
            if (var11 != null) {
                var10 = class92.field1121 == var11 ? 0 : 1;
            }
            field866[++Statics.field88 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field866[--Statics.field88];
            int var13 = 0;
            class91 var14 = (class91) class393.method3484(class91.method3128(), var12);
            if (var14 != null) {
                var13 = class91.field1108 == var14 ? 0 : 1;
            }
            field866[++Statics.field88 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class92 var28 = class92.field1121;
            class91 var29 = class91.field1108;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field866[--Statics.field88];
                var28 = (class92) class393.method3484(class92.method824(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field866[--Statics.field88];
                var29 = (class91) class393.method3484(class91.method3128(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class91.field1108 == var29) {
                switch(var28.field1112) {
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
                switch(var29.field1104) {
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
            field866[++Statics.field88 - 1] = var35;
            field866[++Statics.field88 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field88 -= 2;
            int var15 = field866[Statics.field88];
            int var16 = field866[Statics.field88 + 1];
            class322.method104(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field88 -= 6;
            int var17 = field866[Statics.field88];
            int var18 = field866[Statics.field88 + 1];
            int var19 = field866[Statics.field88 + 2];
            int var20 = field866[Statics.field88 + 3];
            int var21 = field866[Statics.field88 + 4];
            int var22 = field866[Statics.field88 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method1800(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field88 -= 4;
            int var24 = field866[Statics.field88];
            int var25 = field866[Statics.field88 + 1];
            int var26 = field866[Statics.field88 + 2];
            int var27 = field866[Statics.field88 + 3];
            Statics.method3420(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ma.bp(ILdn;ZI)I")
    public static int method5382(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field866[++Statics.field88 - 1] = client.field523;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field88 -= 2;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = class86.method3358(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field88 -= 2;
            int var5 = field866[Statics.field88];
            int var6 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = class86.method1753(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field88 -= 2;
            int var7 = field866[Statics.field88];
            int var8 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = class86.method2738(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class190.method7400(var9).field1969;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field654[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field666[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field814[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1861;
            int var14 = (Statics.field1608.field1220 >> 7) + Statics.field481;
            int var15 = (Statics.field1608.field1260 >> 7) + Statics.field99;
            field866[++Statics.field88 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field866[++Statics.field88 - 1] = client.field512 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field88 -= 2;
            int var19 = field866[Statics.field88] + 32768;
            int var20 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = class86.method3358(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field88 -= 2;
            int var21 = field866[Statics.field88] + 32768;
            int var22 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = class86.method1753(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field88 -= 2;
            int var23 = field866[Statics.field88] + 32768;
            int var24 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = class86.method2738(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field691 >= 2) {
                field866[++Statics.field88 - 1] = client.field691;
            } else {
                field866[++Statics.field88 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field866[++Statics.field88 - 1] = client.field529;
            return 1;
        } else if (arg0 == 3318) {
            field866[++Statics.field88 - 1] = client.field509;
            return 1;
        } else if (arg0 == 3321) {
            field866[++Statics.field88 - 1] = client.field634 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field866[++Statics.field88 - 1] = client.field690;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field693) {
                field866[++Statics.field88 - 1] = 1;
            } else {
                field866[++Statics.field88 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field866[++Statics.field88 - 1] = client.field510;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field88 -= 4;
            int var25 = field866[Statics.field88];
            int var26 = field866[Statics.field88 + 1];
            int var27 = field866[Statics.field88 + 2];
            int var28 = field866[Statics.field88 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field866[++Statics.field88 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field866[++Statics.field88 - 1] = client.field796;
            return 1;
        } else if (arg0 == 3327) {
            field866[++Statics.field88 - 1] = client.field526;
            return 1;
        } else if (arg0 == 3331) {
            field866[++Statics.field88 - 1] = client.field634;
            return 1;
        } else if (arg0 == 3332) {
            int var32 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field657[var32];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fc.bz(ILdn;ZB)I")
    public static int method2929(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field88 -= 2;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            class203 var5 = class203.method3105(var3);
            if (var5.field2071 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2072; var6++) {
                if (var5.field2075[var6] == var4) {
                    field867[++Statics.field3152 - 1] = var5.field2077[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field867[++Statics.field3152 - 1] = var5.field2074;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field88 -= 4;
            int var7 = field866[Statics.field88];
            int var8 = field866[Statics.field88 + 1];
            int var9 = field866[Statics.field88 + 2];
            int var10 = field866[Statics.field88 + 3];
            class203 var11 = class203.method3105(var9);
            if (var11.field2069 != var7 || var11.field2071 != var8) {
                if (var8 == 115) {
                    field867[++Statics.field3152 - 1] = class370.field4272;
                } else {
                    field866[++Statics.field88 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2072; var12++) {
                if (var11.field2075[var12] == var10) {
                    if (var8 == 115) {
                        field867[++Statics.field3152 - 1] = var11.field2077[var12];
                    } else {
                        field866[++Statics.field88 - 1] = var11.field2078[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field867[++Statics.field3152 - 1] = var11.field2074;
                } else {
                    field866[++Statics.field88 - 1] = var11.field2073;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field866[--Statics.field88];
            class203 var14 = class203.method3105(var13);
            field866[++Statics.field88 - 1] = var14.method3506();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ea.bc(ILdn;ZI)I")
    public static int method2701(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field749.method3974(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field749.method3982(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field749.method3975(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.bf(ILdn;ZI)I")
    public static int method2935(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field3621.field838 == 0) {
                field866[++Statics.field88 - 1] = -2;
            } else if (Statics.field3621.field838 == 1) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = Statics.field3621.field834.method7461();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field866[--Statics.field88];
            if (Statics.field3621.method1812() && var3 >= 0 && var3 < Statics.field3621.field834.method7461()) {
                class450 var4 = (class450) Statics.field3621.field834.method7464(var3);
                field867[++Statics.field3152 - 1] = var4.method7435();
                field867[++Statics.field3152 - 1] = var4.method7440();
            } else {
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field866[--Statics.field88];
            if (Statics.field3621.method1812() && var5 >= 0 && var5 < Statics.field3621.field834.method7461()) {
                field866[++Statics.field88 - 1] = ((class457) Statics.field3621.field834.method7464(var5)).field4807;
            } else {
                field866[++Statics.field88 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field866[--Statics.field88];
            if (Statics.field3621.method1812() && var6 >= 0 && var6 < Statics.field3621.field834.method7461()) {
                field866[++Statics.field88 - 1] = ((class457) Statics.field3621.field834.method7464(var6)).field4805;
            } else {
                field866[++Statics.field88 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field867[--Statics.field3152];
            int var8 = field866[--Statics.field88];
            class70.method6254(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field867[--Statics.field3152];
            Statics.field3621.method1763(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field867[--Statics.field3152];
            Statics.field3621.method1767(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field867[--Statics.field3152];
            Statics.field3621.method1765(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field867[--Statics.field3152];
            boolean var13 = true;
            Statics.field3621.method1768(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field867[--Statics.field3152];
            String var15 = client.method5709(var14);
            field866[++Statics.field88 - 1] = Statics.field3621.method1817(new class558(var15, Statics.field1527), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1674 == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = Statics.field1674.field4778;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1674 == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = Statics.field1674.method7461();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field866[--Statics.field88];
            if (Statics.field1674 == null || var16 >= Statics.field1674.method7461()) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = Statics.field1674.method7464(var16).method7433().method9077();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field866[--Statics.field88];
            if (Statics.field1674 == null || var17 >= Statics.field1674.method7461()) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = ((class457) Statics.field1674.method7464(var17)).method7536();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field866[--Statics.field88];
            if (Statics.field1674 == null || var18 >= Statics.field1674.method7461()) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = ((class457) Statics.field1674.method7464(var18)).field4805;
            }
            return 1;
        } else if (arg0 == 3616) {
            field866[++Statics.field88 - 1] = Statics.field1674 == null ? 0 : Statics.field1674.field4776;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field867[--Statics.field3152];
            client.method4811(var19);
            return 1;
        } else if (arg0 == 3618) {
            field866[++Statics.field88 - 1] = Statics.field1674 == null ? 0 : Statics.field1674.field4781;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field867[--Statics.field3152];
            client.method7572(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method3604();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field3621.method1812()) {
                field866[++Statics.field88 - 1] = Statics.field3621.field840.method7461();
            } else {
                field866[++Statics.field88 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field866[--Statics.field88];
            if (Statics.field3621.method1812() && var21 >= 0 && var21 < Statics.field3621.field840.method7461()) {
                class456 var22 = (class456) Statics.field3621.field840.method7464(var21);
                field867[++Statics.field3152 - 1] = var22.method7435();
                field867[++Statics.field3152 - 1] = var22.method7440();
            } else {
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field867[--Statics.field3152];
            String var24 = client.method5709(var23);
            field866[++Statics.field88 - 1] = Statics.field3621.method1781(new class558(var24, Statics.field1527)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field866[--Statics.field88];
            if (Statics.field1674 == null || var25 >= Statics.field1674.method7461() || !Statics.field1674.method7464(var25).method7433().equals(Statics.field1608.field1142)) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1674 == null || Statics.field1674.field4780 == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = Statics.field1674.field4780;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field866[--Statics.field88];
            if (Statics.field1674 == null || var26 >= Statics.field1674.method7461() || !((class452) Statics.field1674.method7464(var26)).method7417()) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field866[--Statics.field88];
            if (Statics.field1674 == null || var27 >= Statics.field1674.method7461() || !((class452) Statics.field1674.method7464(var27)).method7419()) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field3621.field834.method7498();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class541(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class542(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class121(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class117(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class120(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class125(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class119(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class118(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class122(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class123(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field3621.field834.method7507();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field3621.field840.method7498();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field866[--Statics.field88] == 1;
            Statics.field3621.field840.method7465(new class541(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field866[--Statics.field88] == 1;
            Statics.field3621.field840.method7465(new class542(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field3621.field840.method7507();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1674 != null) {
                Statics.field1674.method7498();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class541(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class542(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class121(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class117(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class120(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class125(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class119(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class118(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class122(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class123(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1674 != null) {
                Statics.field1674.method7507();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field866[--Statics.field88] == 1;
            Statics.field3621.field834.method7465(new class124(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field866[--Statics.field88] == 1;
            if (Statics.field1674 != null) {
                Statics.field1674.method7465(new class124(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.be(ILdn;ZB)I")
    public static int method2273(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("cp.bn(ILdn;ZB)I")
    public static int method1127(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field5109 == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
                Statics.field85 = Statics.field5109;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field866[--Statics.field88];
            if (client.field755[var3] == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = 1;
                Statics.field85 = client.field755[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field867[++Statics.field3152 - 1] = Statics.field85.field1756;
            return 1;
        } else if (arg0 == 3803) {
            field866[++Statics.field88 - 1] = Statics.field85.field1739 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field866[++Statics.field88 - 1] = Statics.field85.field1753;
            return 1;
        } else if (arg0 == 3805) {
            field866[++Statics.field88 - 1] = Statics.field85.field1741;
            return 1;
        } else if (arg0 == 3806) {
            field866[++Statics.field88 - 1] = Statics.field85.field1750;
            return 1;
        } else if (arg0 == 3807) {
            field866[++Statics.field88 - 1] = Statics.field85.field1742;
            return 1;
        } else if (arg0 == 3809) {
            field866[++Statics.field88 - 1] = Statics.field85.field1744;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = Statics.field85.field1755[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = Statics.field85.field1748[var5];
            return 1;
        } else if (arg0 == 3812) {
            field866[++Statics.field88 - 1] = Statics.field85.field1732;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = Statics.field85.field1746[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field88 -= 3;
            int var7 = field866[Statics.field88];
            int var8 = field866[Statics.field88 + 1];
            int var9 = field866[Statics.field88 + 2];
            field866[++Statics.field88 - 1] = Statics.field85.method3023(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field866[++Statics.field88 - 1] = Statics.field85.field1751;
            return 1;
        } else if (arg0 == 3816) {
            field866[++Statics.field88 - 1] = Statics.field85.field1752;
            return 1;
        } else if (arg0 == 3817) {
            field866[++Statics.field88 - 1] = Statics.field85.method3022(field867[--Statics.field3152]);
            return 1;
        } else if (arg0 == 3818) {
            field866[Statics.field88 - 1] = Statics.field85.method3025()[field866[Statics.field88 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field88 -= 2;
            int var10 = field866[Statics.field88];
            int var11 = field866[Statics.field88 + 1];
            client.method7155(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = Statics.field85.field1749[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field88 -= 3;
                int var13 = field866[Statics.field88];
                boolean var14 = field866[Statics.field88 + 1] == 1;
                int var15 = field866[Statics.field88 + 2];
                client.method1476(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field866[--Statics.field88];
                field866[++Statics.field88 - 1] = Statics.field85.field1737[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field87 == null) {
                    field866[++Statics.field88 - 1] = 0;
                } else {
                    field866[++Statics.field88 - 1] = 1;
                    Statics.field1514 = Statics.field87;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field866[--Statics.field88];
                if (client.field756[var17] == null) {
                    field866[++Statics.field88 - 1] = 0;
                } else {
                    field866[++Statics.field88 - 1] = 1;
                    Statics.field1514 = client.field756[var17];
                    Statics.field4473 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field867[++Statics.field3152 - 1] = Statics.field1514.field1803;
                return 1;
            } else if (arg0 == 3853) {
                field866[++Statics.field88 - 1] = Statics.field1514.field1800;
                return 1;
            } else if (arg0 == 3854) {
                field866[++Statics.field88 - 1] = Statics.field1514.field1802;
                return 1;
            } else if (arg0 == 3855) {
                field866[++Statics.field88 - 1] = Statics.field1514.method3122();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field866[--Statics.field88];
                field867[++Statics.field3152 - 1] = ((class147) Statics.field1514.field1798.get(var18)).field1685.method9077();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field866[--Statics.field88];
                field866[++Statics.field88 - 1] = ((class147) Statics.field1514.field1798.get(var19)).field1683;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field866[--Statics.field88];
                field866[++Statics.field88 - 1] = ((class147) Statics.field1514.field1798.get(var20)).field1684;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field866[--Statics.field88];
                client.method2930(Statics.field4473, var21);
                return 1;
            } else if (arg0 == 3860) {
                field866[++Statics.field88 - 1] = Statics.field1514.method3111(field867[--Statics.field3152]);
                return 1;
            } else if (arg0 == 3861) {
                field866[Statics.field88 - 1] = Statics.field1514.method3107()[field866[Statics.field88 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field866[++Statics.field88 - 1] = Statics.field1190 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ac.bd(ILdn;ZB)I")
    public static int method293(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field803[var3].method6508();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field803[var4].field4488;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field803[var5].field4489;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field803[var6].field4491;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field803[var7].field4487;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.field803[var8].field4492;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field866[--Statics.field88];
            int var10 = client.field803[var9].method6498();
            field866[++Statics.field88 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field866[--Statics.field88];
            int var12 = client.field803[var11].method6498();
            field866[++Statics.field88 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field866[--Statics.field88];
            int var14 = client.field803[var13].method6498();
            field866[++Statics.field88 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field866[--Statics.field88];
            int var16 = client.field803[var15].method6498();
            field866[++Statics.field88 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field866[--Statics.field88] == 1;
            if (Statics.field2485 != null) {
                Statics.field2485.method6447(class381.field4460, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field866[--Statics.field88] == 1;
            if (Statics.field2485 != null) {
                Statics.field2485.method6447(class381.field4462, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field88 -= 2;
            boolean var19 = field866[Statics.field88] == 1;
            boolean var20 = field866[Statics.field88 + 1] == 1;
            if (Statics.field2485 != null) {
                client.field758.field479 = var20;
                Statics.field2485.method6447(client.field758, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field866[--Statics.field88] == 1;
            if (Statics.field2485 != null) {
                Statics.field2485.method6447(class381.field4461, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field866[--Statics.field88] == 1;
            if (Statics.field2485 != null) {
                Statics.field2485.method6447(class381.field4463, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field866[++Statics.field88 - 1] = Statics.field2485 == null ? 0 : Statics.field2485.field4464.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field866[--Statics.field88];
            class387 var24 = (class387) Statics.field2485.field4464.get(var23);
            field866[++Statics.field88 - 1] = var24.field4482;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field866[--Statics.field88];
            class387 var26 = (class387) Statics.field2485.field4464.get(var25);
            field867[++Statics.field3152 - 1] = var26.method6491();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field866[--Statics.field88];
            class387 var28 = (class387) Statics.field2485.field4464.get(var27);
            field867[++Statics.field3152 - 1] = var28.method6490();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field866[--Statics.field88];
            class387 var30 = (class387) Statics.field2485.field4464.get(var29);
            long var31 = class318.method3596() - Statics.field1840 - var30.field4483;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field867[++Statics.field3152 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field866[--Statics.field88];
            class387 var38 = (class387) Statics.field2485.field4464.get(var37);
            field866[++Statics.field88 - 1] = var38.field4481.field4491;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field866[--Statics.field88];
            class387 var40 = (class387) Statics.field2485.field4464.get(var39);
            field866[++Statics.field88 - 1] = var40.field4481.field4489;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field866[--Statics.field88];
            class387 var42 = (class387) Statics.field2485.field4464.get(var41);
            field866[++Statics.field88 - 1] = var42.field4481.field4488;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var43).field2356 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hm.bo(ILdn;ZI)I")
    public static int method3391(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field88 -= 2;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field88 -= 2;
            int var5 = field866[Statics.field88];
            int var6 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field88 -= 2;
            int var7 = field866[Statics.field88];
            int var8 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field88 -= 2;
            int var9 = field866[Statics.field88];
            int var10 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field88 -= 5;
            int var13 = field866[Statics.field88];
            int var14 = field866[Statics.field88 + 1];
            int var15 = field866[Statics.field88 + 2];
            int var16 = field866[Statics.field88 + 3];
            int var17 = field866[Statics.field88 + 4];
            field866[++Statics.field88 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field88 -= 2;
            int var18 = field866[Statics.field88];
            int var19 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field88 -= 2;
            int var20 = field866[Statics.field88];
            int var21 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field88 -= 2;
            int var22 = field866[Statics.field88];
            int var23 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field88 -= 2;
            int var24 = field866[Statics.field88];
            int var25 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field88 -= 2;
            int var26 = field866[Statics.field88];
            int var27 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field88 -= 2;
            int var28 = field866[Statics.field88];
            int var29 = field866[Statics.field88 + 1];
            if (var28 == 0) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field88 -= 2;
            int var30 = field866[Statics.field88];
            int var31 = field866[Statics.field88 + 1];
            if (var30 == 0) {
                field866[++Statics.field88 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field866[++Statics.field88 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field866[++Statics.field88 - 1] = var30;
                    break;
                case 2:
                    field866[++Statics.field88 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field866[++Statics.field88 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field866[++Statics.field88 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field866[++Statics.field88 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field88 -= 2;
            int var32 = field866[Statics.field88];
            int var33 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field88 -= 2;
            int var34 = field866[Statics.field88];
            int var35 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field88 -= 2;
            int var36 = field866[Statics.field88];
            int var37 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field88 -= 2;
            int var38 = field866[Statics.field88];
            int var39 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field88 -= 3;
            long var40 = (long) field866[Statics.field88];
            long var42 = (long) field866[Statics.field88 + 1];
            long var44 = (long) field866[Statics.field88 + 2];
            field866[++Statics.field88 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class320.method2221(field866[--Statics.field88]);
            field866[++Statics.field88 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field88 -= 2;
            int var47 = field866[Statics.field88];
            int var48 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field88 -= 3;
            int var49 = field866[Statics.field88];
            int var50 = field866[Statics.field88 + 1];
            int var51 = field866[Statics.field88 + 2];
            field866[++Statics.field88 - 1] = class320.method2570(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field88 -= 3;
            int var52 = field866[Statics.field88];
            int var53 = field866[Statics.field88 + 1];
            int var54 = field866[Statics.field88 + 2];
            field866[++Statics.field88 - 1] = class320.method1992(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field88 -= 3;
            int var55 = field866[Statics.field88];
            int var56 = field866[Statics.field88 + 1];
            int var57 = field866[Statics.field88 + 2];
            int var58 = 31 - var57;
            field866[++Statics.field88 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field88 -= 4;
            int var59 = field866[Statics.field88];
            int var60 = field866[Statics.field88 + 1];
            int var61 = field866[Statics.field88 + 2];
            int var62 = field866[Statics.field88 + 3];
            int var63 = class320.method1992(var59, var61, var62);
            int var64 = class320.method1997(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field866[++Statics.field88 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field866[Statics.field88 - 1] = class485.method2799(field866[Statics.field88 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field866[Statics.field88 - 1] = class485.method4299(field866[Statics.field88 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field88 -= 2;
            int var65 = field866[Statics.field88];
            int var66 = field866[Statics.field88 + 1];
            int var67 = class485.method7753(var65, var66);
            field866[++Statics.field88 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field866[Statics.field88 - 1] = Math.abs(field866[Statics.field88 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field867[--Statics.field3152];
            int var69 = -1;
            if (Statics.method4033(var68)) {
                var69 = class407.method3456(var68);
            }
            field866[++Statics.field88 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.bx(ILdn;ZI)I")
    public static int method2275(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field867[--Statics.field3152];
            int var4 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3152 -= 2;
            String var5 = field867[Statics.field3152];
            String var6 = field867[Statics.field3152 + 1];
            field867[++Statics.field3152 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field867[--Statics.field3152];
            int var8 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = var7 + class407.method2713(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field867[--Statics.field3152];
            field867[++Statics.field3152 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field866[--Statics.field88];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field870.setTime(new Date(var11));
            int var13 = field870.get(5);
            int var14 = field870.get(2);
            int var15 = field870.get(1);
            field867[++Statics.field3152 - 1] = var13 + "-" + field869[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3152 -= 2;
            String var16 = field867[Statics.field3152];
            String var17 = field867[Statics.field3152 + 1];
            if (Statics.field1608.field1123 == null || Statics.field1608.field1123.field3687 == 0) {
                field867[++Statics.field3152 - 1] = var16;
            } else {
                field867[++Statics.field3152 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3152 -= 2;
            field866[++Statics.field88 - 1] = class407.method2465(class408.method990(field867[Statics.field3152], field867[Statics.field3152 + 1], Statics.field896));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field867[--Statics.field3152];
            Statics.field88 -= 2;
            int var20 = field866[Statics.field88];
            int var21 = field866[Statics.field88 + 1];
            byte[] var22 = Statics.field505.method6328(var21, 0);
            class414 var23 = new class414(var22);
            field866[++Statics.field88 - 1] = var23.method7032(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field867[--Statics.field3152];
            Statics.field88 -= 2;
            int var25 = field866[Statics.field88];
            int var26 = field866[Statics.field88 + 1];
            byte[] var27 = Statics.field505.method6328(var26, 0);
            class414 var28 = new class414(var27);
            field866[++Statics.field88 - 1] = var28.method7013(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3152 -= 2;
            String var29 = field867[Statics.field3152];
            String var30 = field867[Statics.field3152 + 1];
            if (field866[--Statics.field88] == 1) {
                field867[++Statics.field3152 - 1] = var29;
            } else {
                field867[++Statics.field3152 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field867[--Statics.field3152];
            field867[++Statics.field3152 - 1] = class418.method7015(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field867[--Statics.field3152];
            int var33 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class407.method6268((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = Statics.method3599((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = Statics.method2791((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class407.method6479((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field867[--Statics.field3152];
            if (var38 == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field867[--Statics.field3152];
            Statics.field88 -= 2;
            int var40 = field866[Statics.field88];
            int var41 = field866[Statics.field88 + 1];
            field867[++Statics.field3152 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field867[--Statics.field3152];
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
            field867[++Statics.field3152 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field867[--Statics.field3152];
            int var48 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3152 -= 2;
            String var49 = field867[Statics.field3152];
            String var50 = field867[Statics.field3152 + 1];
            int var51 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field867[--Statics.field3152];
            field867[++Statics.field3152 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field3152 -= 3;
            String var53 = field867[Statics.field3152];
            String var54 = field867[Statics.field3152 + 1];
            String var55 = field867[Statics.field3152 + 2];
            if (Statics.field1608.field1123 == null) {
                field867[++Statics.field3152 - 1] = var55;
                return 1;
            }
            switch(Statics.field1608.field1123.field3686) {
                case 0:
                    field867[++Statics.field3152 - 1] = var53;
                    break;
                case 1:
                    field867[++Statics.field3152 - 1] = var54;
                    break;
                case 2:
                default:
                    field867[++Statics.field3152 - 1] = var55;
            }
            return 1;
        } else if (arg0 == 4124) {
            field866[++Statics.field88 - 1] = Statics.field1608.field1123 == null ? -1 : Statics.field1608.field1123.field3686;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ic.bl(ILdn;ZS)I")
    public static int method3703(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = class223.method87(var3).field2341;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field88 -= 2;
            int var4 = field866[Statics.field88];
            int var5 = field866[Statics.field88 + 1];
            class223 var6 = class223.method87(var4);
            if (var5 < 1 || var5 > 5 || var6.field2329[var5 - 1] == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var6.field2329[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field88 -= 2;
            int var7 = field866[Statics.field88];
            int var8 = field866[Statics.field88 + 1];
            class223 var9 = class223.method87(var7);
            if (var8 < 1 || var8 > 5 || var9.field2330[var8 - 1] == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var9.field2330[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var10).field2324;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var11).field2323 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field866[--Statics.field88];
            class223 var13 = class223.method87(var12);
            if (var13.field2336 == -1 && var13.field2346 >= 0) {
                field866[++Statics.field88 - 1] = var13.field2346;
            } else {
                field866[++Statics.field88 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field866[--Statics.field88];
            class223 var15 = class223.method87(var14);
            if (var15.field2336 >= 0 && var15.field2346 >= 0) {
                field866[++Statics.field88 - 1] = var15.field2346;
            } else {
                field866[++Statics.field88 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var16).field2337 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field866[--Statics.field88];
            class223 var18 = class223.method87(var17);
            if (var18.field2342 == -1 && var18.field2359 >= 0) {
                field866[++Statics.field88 - 1] = var18.field2359;
            } else {
                field866[++Statics.field88 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field866[--Statics.field88];
            class223 var20 = class223.method87(var19);
            if (var20.field2342 >= 0 && var20.field2359 >= 0) {
                field866[++Statics.field88 - 1] = var20.field2359;
            } else {
                field866[++Statics.field88 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field867[--Statics.field3152];
            int var22 = field866[--Statics.field88];
            client.method6271(var21, var22 == 1);
            field866[++Statics.field88 - 1] = Statics.field233;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field418 == null || Statics.field3612 >= Statics.field233) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = Statics.field418[++Statics.field3612 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3612 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field866[--Statics.field88];
            int var24 = class223.method87(var23).method3847();
            if (var24 == -1) {
                field866[++Statics.field88 - 1] = var24;
            } else {
                field866[++Statics.field88 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var25).field2325;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var26).field2305;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class223.method87(var27).field2327;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field866[--Statics.field88];
            class223 var29 = class223.method87(var28);
            field866[++Statics.field88 - 1] = var29.field2326;
            return 1;
        } else if (arg0 == 4218) {
            int var30 = field866[--Statics.field88];
            field867[++Statics.field3152 - 1] = class223.method87(var30).field2335;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.bh(ILdn;ZB)I")
    public static int method2574(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field866[++Statics.field88 - 1] = client.field744;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field88 -= 3;
            client.field744 = field866[Statics.field88];
            Statics.field4633 = class554.method9040(field866[Statics.field88 + 1]);
            if (Statics.field4633 == null) {
                Statics.field4633 = class554.field5373;
            }
            client.field629 = field866[Statics.field88 + 2];
            class313 var3 = class313.method7156(class311.field3213, client.field574.field1438);
            var3.field3318.method8445(client.field744);
            var3.field3318.method8445(Statics.field4633.field5375);
            var3.field3318.method8445(client.field629);
            client.field574.method2654(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field867[--Statics.field3152];
            Statics.field88 -= 2;
            int var5 = field866[Statics.field88];
            int var6 = field866[Statics.field88 + 1];
            class313 var7 = class313.method7156(class311.field3282, client.field574.field1438);
            var7.field3318.method8445(class535.method3943(var4) + 2);
            var7.field3318.method8452(var4);
            var7.field3318.method8445(var5 - 1);
            var7.field3318.method8445(var6);
            client.field574.method2654(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field88 -= 2;
            int var8 = field866[Statics.field88];
            int var9 = field866[Statics.field88 + 1];
            class65 var10 = class112.method9(var8, var9);
            if (var10 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var10.field468;
                field866[++Statics.field88 - 1] = var10.field465;
                field867[++Statics.field3152 - 1] = var10.field467 == null ? "" : var10.field467;
                field867[++Statics.field3152 - 1] = var10.field471 == null ? "" : var10.field471;
                field867[++Statics.field3152 - 1] = var10.field466 == null ? "" : var10.field466;
                field866[++Statics.field88 - 1] = var10.method1100() ? 1 : (var10.method1089() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field866[--Statics.field88];
            class65 var12 = class112.method5679(var11);
            if (var12 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var12.field464;
                field866[++Statics.field88 - 1] = var12.field465;
                field867[++Statics.field3152 - 1] = var12.field467 == null ? "" : var12.field467;
                field867[++Statics.field3152 - 1] = var12.field471 == null ? "" : var12.field471;
                field867[++Statics.field3152 - 1] = var12.field466 == null ? "" : var12.field466;
                field866[++Statics.field88 - 1] = var12.method1100() ? 1 : (var12.method1089() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field4633 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = Statics.field4633.field5375;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field867[--Statics.field3152];
            int var14 = field866[--Statics.field88];
            class313 var15 = class559.method4519(var14, var13, Statics.field896, -1);
            client.field574.method2654(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field3152 -= 2;
            String var16 = field867[Statics.field3152];
            String var17 = field867[Statics.field3152 + 1];
            class313 var18 = class313.method7156(class311.field3268, client.field574.field1438);
            var18.field3318.method8446(0);
            int var19 = var18.field3318.field5233;
            var18.field3318.method8452(var16);
            class353.method1996(var18.field3318, var17);
            var18.field3318.method8458(var18.field3318.field5233 - var19);
            client.field574.method2654(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field867[--Statics.field3152];
            Statics.field88 -= 2;
            int var21 = field866[Statics.field88];
            int var22 = field866[Statics.field88 + 1];
            class313 var23 = class559.method4519(var21, var20, Statics.field896, var22);
            client.field574.method2654(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1608 == null || Statics.field1608.field1142 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1608.field1142.method9077();
            }
            field867[++Statics.field3152 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field866[++Statics.field88 - 1] = client.field629;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class112.method6325(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class112.method5646(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = class112.method7368(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field867[--Statics.field3152];
            client.method9075(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field746 = field867[--Statics.field3152].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field867[++Statics.field3152 - 1] = client.field746;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field867[--Statics.field3152];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field88 -= 2;
            int var30 = field866[Statics.field88];
            int var31 = field866[Statics.field88 + 1];
            class65 var32 = class112.method9(var30, var31);
            if (var32 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var32.field468;
                field866[++Statics.field88 - 1] = var32.field465;
                field867[++Statics.field3152 - 1] = var32.field467 == null ? "" : var32.field467;
                field867[++Statics.field3152 - 1] = var32.field471 == null ? "" : var32.field471;
                field867[++Statics.field3152 - 1] = var32.field466 == null ? "" : var32.field466;
                field866[++Statics.field88 - 1] = var32.method1100() ? 1 : (var32.method1089() ? 2 : 0);
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field866[--Statics.field88];
            class65 var34 = class112.method5679(var33);
            if (var34 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var34.field464;
                field866[++Statics.field88 - 1] = var34.field465;
                field867[++Statics.field3152 - 1] = var34.field467 == null ? "" : var34.field467;
                field867[++Statics.field3152 - 1] = var34.field471 == null ? "" : var34.field471;
                field867[++Statics.field3152 - 1] = var34.field466 == null ? "" : var34.field466;
                field866[++Statics.field88 - 1] = var34.method1100() ? 1 : (var34.method1089() ? 2 : 0);
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gi.bs(ILdn;ZI)I")
    public static int method3125(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field866[++Statics.field88 - 1] = client.method664();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field866[--Statics.field88];
            if (var3 == 1 || var3 == 2) {
                client.method2214(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field866[++Statics.field88 - 1] = Statics.field1336.method2448();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field866[--Statics.field88];
            if (var4 == 1 || var4 == 2) {
                Statics.field1336.method2368(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field88--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.bj(ILdn;ZI)I")
    public static int method4040(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field88 -= 2;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            if (!client.field516) {
                client.field568 = var3;
                client.field597 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field866[++Statics.field88 - 1] = client.field568;
            return 1;
        } else if (arg0 == 5506) {
            field866[++Statics.field88 - 1] = client.field597;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field866[--Statics.field88];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field551 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field866[++Statics.field88 - 1] = client.field551;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.bu(ILdn;ZI)I")
    public static int method289(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field575 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("od.br(II)I")
    public static int method6459(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ng.bb(II)I")
    public static int method6245(int arg0) {
        return (int) ((Math.log((double) arg0) / field877 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("rl.by(ILdn;ZB)I")
    public static int method7329(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field88 -= 2;
            client.field786 = (short) method6459(field866[Statics.field88]);
            if (client.field786 <= 0) {
                client.field786 = 256;
            }
            client.field787 = (short) method6459(field866[Statics.field88 + 1]);
            if (client.field787 <= 0) {
                client.field787 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field88 -= 2;
            client.field788 = (short) field866[Statics.field88];
            if (client.field788 <= 0) {
                client.field788 = 256;
            }
            client.field805 = (short) field866[Statics.field88 + 1];
            if (client.field805 <= 0) {
                client.field805 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field88 -= 4;
            client.field790 = (short) field866[Statics.field88];
            if (client.field790 <= 0) {
                client.field790 = 1;
            }
            client.field729 = (short) field866[Statics.field88 + 1];
            if (client.field729 <= 0) {
                client.field729 = 32767;
            } else if (client.field729 < client.field790) {
                client.field729 = client.field790;
            }
            client.field792 = (short) field866[Statics.field88 + 2];
            if (client.field792 <= 0) {
                client.field792 = 1;
            }
            client.field793 = (short) field866[Statics.field88 + 3];
            if (client.field793 <= 0) {
                client.field793 = 32767;
            } else if (client.field793 < client.field792) {
                client.field793 = client.field792;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field694 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
            } else {
                client.method2096(0, 0, client.field694.field3759, client.field694.field3760, false);
                field866[++Statics.field88 - 1] = client.field692;
                field866[++Statics.field88 - 1] = client.field797;
            }
            return 1;
        } else if (arg0 == 6204) {
            field866[++Statics.field88 - 1] = client.field788;
            field866[++Statics.field88 - 1] = client.field805;
            return 1;
        } else if (arg0 == 6205) {
            field866[++Statics.field88 - 1] = method6245(client.field786);
            field866[++Statics.field88 - 1] = method6245(client.field787);
            return 1;
        } else if (arg0 == 6220) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field866[++Statics.field88 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field866[++Statics.field88 - 1] = Statics.field1700;
            return 1;
        } else if (arg0 == 6223) {
            field866[++Statics.field88 - 1] = Statics.field3661;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.bk(ILdn;ZI)I")
    public static int method2081(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field866[++Statics.field88 - 1] = class69.method101() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class69 var3 = class69.method273();
            if (var3 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
            } else {
                field866[++Statics.field88 - 1] = var3.field818;
                field866[++Statics.field88 - 1] = var3.field826;
                field867[++Statics.field3152 - 1] = var3.field829;
                field866[++Statics.field88 - 1] = var3.field830;
                field866[++Statics.field88 - 1] = var3.field827;
                field867[++Statics.field3152 - 1] = var3.field828;
            }
            return 1;
        } else if (arg0 == 6502) {
            class69 var4 = class69.method2809();
            if (var4 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
            } else {
                field866[++Statics.field88 - 1] = var4.field818;
                field866[++Statics.field88 - 1] = var4.field826;
                field867[++Statics.field3152 - 1] = var4.field829;
                field866[++Statics.field88 - 1] = var4.field830;
                field866[++Statics.field88 - 1] = var4.field827;
                field867[++Statics.field3152 - 1] = var4.field828;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field866[--Statics.field88];
            class69 var6 = null;
            for (int var7 = 0; var7 < class69.field822; var7++) {
                if (Statics.field820[var7].field818 == var5) {
                    var6 = Statics.field820[var7];
                    break;
                }
            }
            if (var6 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
            } else {
                field866[++Statics.field88 - 1] = var6.field818;
                field866[++Statics.field88 - 1] = var6.field826;
                field867[++Statics.field3152 - 1] = var6.field829;
                field866[++Statics.field88 - 1] = var6.field830;
                field866[++Statics.field88 - 1] = var6.field827;
                field867[++Statics.field3152 - 1] = var6.field828;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field88 -= 4;
            int var8 = field866[Statics.field88];
            boolean var9 = field866[Statics.field88 + 1] == 1;
            int var10 = field866[Statics.field88 + 2];
            boolean var11 = field866[Statics.field88 + 3] == 1;
            class69.method4962(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field866[--Statics.field88];
            if (var12 >= 0 && var12 < class69.field822) {
                class69 var13 = Statics.field820[var12];
                field866[++Statics.field88 - 1] = var13.field818;
                field866[++Statics.field88 - 1] = var13.field826;
                field867[++Statics.field3152 - 1] = var13.field829;
                field866[++Statics.field88 - 1] = var13.field830;
                field866[++Statics.field88 - 1] = var13.field827;
                field867[++Statics.field3152 - 1] = var13.field828;
            } else {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
                field867[++Statics.field3152 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field669 = field866[--Statics.field88] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field88 -= 2;
            int var14 = field866[Statics.field88];
            int var15 = field866[Statics.field88 + 1];
            class218 var16 = class218.method2822(var15);
            if (var16.method3687()) {
                field867[++Statics.field3152 - 1] = class208.method2790(var14).method3545(var15, var16.field2214);
            } else {
                field866[++Statics.field88 - 1] = class208.method2790(var14).method3544(var15, var16.field2210);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field88 -= 2;
            int var17 = field866[Statics.field88];
            int var18 = field866[Statics.field88 + 1];
            class218 var19 = class218.method2822(var18);
            if (var19.method3687()) {
                field867[++Statics.field3152 - 1] = class222.method2212(var17).method3759(var18, var19.field2214);
            } else {
                field866[++Statics.field88 - 1] = class222.method2212(var17).method3757(var18, var19.field2210);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field88 -= 2;
            int var20 = field866[Statics.field88];
            int var21 = field866[Statics.field88 + 1];
            class218 var22 = class218.method2822(var21);
            if (var22.method3687()) {
                field867[++Statics.field3152 - 1] = class223.method87(var20).method3819(var21, var22.field2214);
            } else {
                field866[++Statics.field88 - 1] = class223.method87(var20).method3817(var21, var22.field2210);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field88 -= 2;
            int var23 = field866[Statics.field88];
            int var24 = field866[Statics.field88 + 1];
            class218 var25 = class218.method2822(var24);
            if (var25.method3687()) {
                field867[++Statics.field3152 - 1] = class219.method2936(var23).method3698(var24, var25.field2214);
            } else {
                field866[++Statics.field88 - 1] = class219.method2936(var23).method3695(var24, var25.field2210);
            }
            return 1;
        } else if (arg0 == 6518) {
            field866[++Statics.field88 - 1] = client.field517 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field866[++Statics.field88 - 1] = client.field508;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field3152--;
            Statics.field88--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field3152--;
            Statics.field88--;
            return 1;
        } else if (arg0 == 6524) {
            field866[++Statics.field88 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field866[++Statics.field88 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field866[++Statics.field88 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field866[++Statics.field88 - 1] = client.field795;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nf.bt(ILdn;ZI)I")
    public static int method6042(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1861;
            int var4 = (Statics.field1608.field1220 >> 7) + Statics.field481;
            int var5 = (Statics.field1608.field1260 >> 7) + Statics.field99;
            client.method2215().method7951(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field866[--Statics.field88];
            String var7 = "";
            class273 var8 = client.method2215().method7970(var6);
            if (var8 != null) {
                var7 = var8.method4893();
            }
            field867[++Statics.field3152 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field866[--Statics.field88];
            client.method2215().method8142(var9);
            return 1;
        } else if (arg0 == 6603) {
            field866[++Statics.field88 - 1] = client.method2215().method7967();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field866[--Statics.field88];
            client.method2215().method8028(var10);
            return 1;
        } else if (arg0 == 6605) {
            field866[++Statics.field88 - 1] = client.method2215().method8143() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class339 var11 = new class339(field866[--Statics.field88]);
            client.method2215().method8118(var11.field3638, var11.field3640);
            return 1;
        } else if (arg0 == 6607) {
            class339 var12 = new class339(field866[--Statics.field88]);
            client.method2215().method7986(var12.field3638, var12.field3640);
            return 1;
        } else if (arg0 == 6608) {
            class339 var13 = new class339(field866[--Statics.field88]);
            client.method2215().method7973(var13.field3637, var13.field3638, var13.field3640);
            return 1;
        } else if (arg0 == 6609) {
            class339 var14 = new class339(field866[--Statics.field88]);
            client.method2215().method7974(var14.field3637, var14.field3638, var14.field3640);
            return 1;
        } else if (arg0 == 6610) {
            field866[++Statics.field88 - 1] = client.method2215().method8144();
            field866[++Statics.field88 - 1] = client.method2215().method7976();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field866[--Statics.field88];
            class273 var16 = client.method2215().method7970(var15);
            if (var16 == null) {
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var16.method4903().method5662();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field866[--Statics.field88];
            class273 var18 = client.method2215().method7970(var17);
            if (var18 == null) {
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = (var18.method4898() - var18.method4897() + 1) * 64;
                field866[++Statics.field88 - 1] = (var18.method4956() - var18.method4899() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field866[--Statics.field88];
            class273 var20 = client.method2215().method7970(var19);
            if (var20 == null) {
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
                field866[++Statics.field88 - 1] = 0;
            } else {
                field866[++Statics.field88 - 1] = var20.method4897() * 64;
                field866[++Statics.field88 - 1] = var20.method4899() * 64;
                field866[++Statics.field88 - 1] = var20.method4898() * 64 + 64 - 1;
                field866[++Statics.field88 - 1] = var20.method4956() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field866[--Statics.field88];
            class273 var22 = client.method2215().method7970(var21);
            if (var22 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var22.method4896();
            }
            return 1;
        } else if (arg0 == 6615) {
            class339 var23 = client.method2215().method7943();
            if (var23 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var23.field3638;
                field866[++Statics.field88 - 1] = var23.field3640;
            }
            return 1;
        } else if (arg0 == 6616) {
            field866[++Statics.field88 - 1] = client.method2215().method7953();
            return 1;
        } else if (arg0 == 6617) {
            class339 var24 = new class339(field866[--Statics.field88]);
            class273 var25 = client.method2215().method7954();
            if (var25 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4946(var24.field3637, var24.field3638, var24.field3640);
            if (var26 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var26[0];
                field866[++Statics.field88 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class339 var27 = new class339(field866[--Statics.field88]);
            class273 var28 = client.method2215().method7954();
            if (var28 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
                return 1;
            }
            class339 var29 = var28.method4888(var27.field3638, var27.field3640);
            if (var29 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var29.method5662();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field88 -= 2;
            int var30 = field866[Statics.field88];
            class339 var31 = new class339(field866[Statics.field88 + 1]);
            method3241(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field88 -= 2;
            int var32 = field866[Statics.field88];
            class339 var33 = new class339(field866[Statics.field88 + 1]);
            method3241(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field88 -= 2;
            int var34 = field866[Statics.field88];
            class339 var35 = new class339(field866[Statics.field88 + 1]);
            class273 var36 = client.method2215().method7970(var34);
            if (var36 == null) {
                field866[++Statics.field88 - 1] = 0;
                return 1;
            } else {
                field866[++Statics.field88 - 1] = var36.method4928(var35.field3637, var35.field3638, var35.field3640) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field866[++Statics.field88 - 1] = client.method2215().method7978();
            field866[++Statics.field88 - 1] = client.method2215().method7979();
            return 1;
        } else if (arg0 == 6623) {
            class339 var37 = new class339(field866[--Statics.field88]);
            class273 var38 = client.method2215().method7950(var37.field3637, var37.field3638, var37.field3640);
            if (var38 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var38.method4941();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2215().method8105(field866[--Statics.field88]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2215().method7981();
            return 1;
        } else if (arg0 == 6626) {
            client.method2215().method8084(field866[--Statics.field88]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2215().method7983();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field866[--Statics.field88] == 1;
            client.method2215().method8076(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field866[--Statics.field88];
            client.method2215().method7985(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field866[--Statics.field88];
            client.method2215().method8114(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2215().method7987();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field866[--Statics.field88] == 1;
            client.method2215().method7988(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field88 -= 2;
            int var43 = field866[Statics.field88];
            boolean var44 = field866[Statics.field88 + 1] == 1;
            client.method2215().method7989(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field88 -= 2;
            int var45 = field866[Statics.field88];
            boolean var46 = field866[Statics.field88 + 1] == 1;
            client.method2215().method7990(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field866[++Statics.field88 - 1] = client.method2215().method7991() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.method2215().method8039(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field866[--Statics.field88];
            field866[++Statics.field88 - 1] = client.method2215().method7993(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field88 -= 2;
            int var49 = field866[Statics.field88];
            class339 var50 = new class339(field866[Statics.field88 + 1]);
            class339 var51 = client.method2215().method7996(var49, var50);
            if (var51 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var51.method5662();
            }
            return 1;
        } else if (arg0 == 6639) {
            class291 var52 = client.method2215().method8141();
            if (var52 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var52.method4842();
                field866[++Statics.field88 - 1] = var52.field3149.method5662();
            }
            return 1;
        } else if (arg0 == 6640) {
            class291 var53 = client.method2215().method7999();
            if (var53 == null) {
                field866[++Statics.field88 - 1] = -1;
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var53.method4842();
                field866[++Statics.field88 - 1] = var53.field3149.method5662();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field866[--Statics.field88];
            class197 var55 = class197.method5698(var54);
            if (var55.field2009 == null) {
                field867[++Statics.field3152 - 1] = "";
            } else {
                field867[++Statics.field3152 - 1] = var55.field2009;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field866[--Statics.field88];
            class197 var57 = class197.method5698(var56);
            field866[++Statics.field88 - 1] = var57.field2011;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field866[--Statics.field88];
            class197 var59 = class197.method5698(var58);
            if (var59 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var59.field2025;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field866[--Statics.field88];
            class197 var61 = class197.method5698(var60);
            if (var61 == null) {
                field866[++Statics.field88 - 1] = -1;
            } else {
                field866[++Statics.field88 - 1] = var61.field2016;
            }
            return 1;
        } else if (arg0 == 6697) {
            field866[++Statics.field88 - 1] = Statics.field872.field3173;
            return 1;
        } else if (arg0 == 6698) {
            field866[++Statics.field88 - 1] = Statics.field872.field3176.method5662();
            return 1;
        } else if (arg0 == 6699) {
            field866[++Statics.field88 - 1] = Statics.field872.field3175.method5662();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iq.bq(ILdn;ZB)I")
    public static int method3637(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field866[--Statics.field88];
            class208 var4 = class208.method2790(var3);
            field867[++Statics.field3152 - 1] = var4 == null ? "" : var4.field2119;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field88 -= 2;
            class208 var5 = class208.method2790(field866[Statics.field88]);
            int var6 = field866[Statics.field88 + 1];
            field866[++Statics.field88 - 1] = var5.method3552(var6);
            field866[++Statics.field88 - 1] = var5.method3565(var6);
            return 1;
        } else if (arg0 == 6765) {
            class208 var7 = class208.method2790(field866[--Statics.field88]);
            field866[++Statics.field88 - 1] = var7 == null ? 0 : var7.field2132;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.bi(ILdn;ZI)I")
    public static int method4854(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field866[--Statics.field88];
            class222 var4 = class222.method2212(var3);
            field867[++Statics.field3152 - 1] = var4 == null ? "" : var4.field2257;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ht.bw(ILdn;ZI)I")
    public static int method3360(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("js.bm(ILdn;ZI)I")
    public static int method4736(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("iw.ba(ILdn;ZI)I")
    public static int method4038(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field866[++Statics.field88 - 1] = client.method5233() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kn.bv(ILdn;ZI)I")
    public static int method5146(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bx.bg(ILdn;ZI)I")
    public static int method616(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field866[--Statics.field88] == 1;
            client.method5201(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.cb(ILdn;ZS)I")
    public static int method266(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field866[--Statics.field88];
            Object var45 = method4810(var44);
            int var46 = field866[--Statics.field88];
            class527 var47 = client.method6559(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class529.method5355(var46);
            Statics.field1056 = var47.method8364(var45, var48);
            if (Statics.field1056 == null) {
                client.field808 = -1;
                Statics.field1706 = null;
                if (arg0 == 7500) {
                    field866[++Statics.field88 - 1] = 0;
                }
            } else {
                client.field808 = class529.method3714(var46);
                Statics.field1706 = Statics.field1056.iterator();
                if (arg0 == 7500) {
                    field866[++Statics.field88 - 1] = Statics.field1056.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field1706 != null && Statics.field1706.hasNext()) {
                field866[++Statics.field88 - 1] = (Integer) Statics.field1706.next();
            } else {
                field866[++Statics.field88 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field88 -= 3;
            int var3 = field866[Statics.field88];
            int var4 = field866[Statics.field88 + 1];
            int var5 = field866[Statics.field88 + 2];
            int var6 = class529.method3714(var4);
            int var7 = class529.method3106(var4);
            int var8 = class529.method5355(var4);
            class528 var9 = class528.method6468(var3);
            class526 var10 = class526.method7545(var6);
            int[] var11 = var10.field5166[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8367(var7);
            if (var14 == null && var10.field5167 != null) {
                var14 = var10.field5167[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class523 var17 = class521.method3603(var16);
                    if (class523.field5156 == var17) {
                        field867[++Statics.field3152 - 1] = "";
                    } else {
                        field866[++Statics.field88 - 1] = class521.method3655(var16);
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
                class523 var21 = class521.method3603(var11[var19]);
                if (class523.field5156 == var21) {
                    field867[++Statics.field3152 - 1] = (String) var14[var20];
                } else {
                    field866[++Statics.field88 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field88 -= 2;
            int var22 = field866[Statics.field88];
            int var23 = field866[Statics.field88 + 1];
            int var24 = 0;
            int var25 = class529.method3714(var23);
            int var26 = class529.method3106(var23);
            class528 var27 = class528.method6468(var22);
            class526 var28 = class526.method7545(var25);
            int[] var29 = var28.field5166[var26];
            Object[] var30 = var27.method8367(var26);
            if (var30 == null && var28.field5167 != null) {
                var30 = var28.field5167[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field866[++Statics.field88 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field88--;
            int var41 = field866[Statics.field88];
            class527 var42 = Statics.method6323(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1056 = var42.method8364(0, 0);
            int var43 = 0;
            if (Statics.field1056 != null) {
                client.field808 = var41;
                Statics.field1706 = Statics.field1056.iterator();
                var43 = Statics.field1056.size();
            }
            if (arg0 == 7504) {
                field866[++Statics.field88 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field866[--Statics.field88];
            class528 var32 = class528.method6468(var31);
            field866[++Statics.field88 - 1] = var32.field5178;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field866[--Statics.field88];
            int var34 = -1;
            if (Statics.field1056 != null && var33 >= 0 && var33 < Statics.field1056.size()) {
                var34 = (Integer) Statics.field1056.get(var33);
            }
            field866[++Statics.field88 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field866[--Statics.field88];
            Object var36 = method4810(var35);
            int var37 = field866[--Statics.field88];
            class527 var38 = client.method6559(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class529.method3714(var37) != client.field808) {
                throw new RuntimeException();
            } else if (Statics.field1056 == null && Statics.field1056.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class529.method5355(var37);
                List var40 = var38.method8364(var36, var39);
                Statics.field1056 = new LinkedList(Statics.field1056);
                if (var40 == null) {
                    Statics.field1056.clear();
                } else {
                    Statics.field1056.retainAll(var40);
                }
                Statics.field1706 = Statics.field1056.iterator();
                if (arg0 == 7507) {
                    field866[++Statics.field88 - 1] = Statics.field1056.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.cj(ILdn;ZI)I")
    public static int method2772(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ip.cr(ILdn;ZI)I")
    public static int method3968(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field88--;
            int var3 = field866[Statics.field88];
            int var4 = field875[var3];
            class530.method2878(field865[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field88 -= 3;
            int var5 = field866[Statics.field88];
            int var6 = field866[Statics.field88 + 1];
            int var7 = field866[Statics.field88 + 2];
            int var8 = field875[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class430.method7191(field865[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.cy(IB)V")
    public static void method334(int arg0) {
        if (arg0 == -1 || !Statics.field2621.method5685(arg0)) {
            return;
        }
        class350[] var1 = Statics.field2621.field3646[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class350 var3 = var1[var2];
            if (var3.field3771 != null) {
                class89 var4 = new class89();
                var4.field1080 = var3;
                var4.field1089 = var3.field3771;
                method2969(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("gs.cg(ILnn;ZI)V")
    public static void method3241(int arg0, class339 arg1, boolean arg2) {
        class273 var3 = client.method2215().method7970(arg0);
        int var4 = Statics.field1608.field1143;
        int var5 = (Statics.field1608.field1220 >> 7) + Statics.field481;
        int var6 = (Statics.field1608.field1260 >> 7) + Statics.field99;
        class339 var7 = new class339(var4, var5, var6);
        client.method2215().method7982(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("bo.cl(Lud;I)Ljava/lang/Object;")
    public static Object method453(class523 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5157) {
            case 1:
                return field867[--Statics.field3152];
            case 2:
                return field866[--Statics.field88];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("kk.cw(II)Ljava/lang/Object;")
    public static Object method4810(int arg0) {
        return method453((class523) class393.method3484(class523.method8332(), arg0));
    }
}
