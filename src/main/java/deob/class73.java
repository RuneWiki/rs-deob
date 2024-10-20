package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ct")
public class class73 {

    @ObfuscatedName("ct.aa")
    public static int[] field883 = new int[5];

    @ObfuscatedName("ct.at")
    public static int[][] field885 = new int[5][5000];

    @ObfuscatedName("ct.ab")
    public static int[] field893 = new int[1000];

    @ObfuscatedName("ct.ao")
    public static String[] field886 = new String[1000];

    @ObfuscatedName("ct.av")
    public static int field887 = 0;

    @ObfuscatedName("ct.aq")
    public static class64[] field888 = new class64[50];

    @ObfuscatedName("ct.as")
    public static Calendar field890 = Calendar.getInstance();

    @ObfuscatedName("ct.aw")
    public static final String[] field891 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ct.ai")
    public static boolean field892 = false;

    @ObfuscatedName("ct.an")
    public static boolean field896 = false;

    @ObfuscatedName("ct.am")
    public static ArrayList field894 = new ArrayList();

    @ObfuscatedName("ct.ar")
    public static int field902 = 0;

    @ObfuscatedName("ct.bo")
    public static final double field895 = Math.log(2.0D);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oq.ak(Ldw;I)V")
    public static void method6486(class90 arg0) {
        method3056(arg0, 500000, 475000);
    }

    @ObfuscatedName("fb.al(Ldw;IIB)V")
    public static void method3056(class90 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1103;
        class81 var5;
        if (class544.method2222(arg0.field1104)) {
            Statics.field1485 = (class304) var3[0];
            class199 var4 = class199.method3551(Statics.field1485.field3251);
            var5 = class81.method175(arg0.field1104, var4.field2018, var4.field2038);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class81.method3327(var6);
        }
        if (var5 != null) {
            method4066(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("ic.aj(Ldw;Ldm;III)V")
    public static void method4066(class90 arg0, class81 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1103;
        Statics.field67 = 0;
        Statics.field1822 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1019;
        int[] var7 = arg1.field1024;
        byte var8 = -1;
        field887 = 0;
        field892 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            StringBuilder var50;
            try {
                Statics.field884 = new int[arg1.field1022];
                int var11 = 0;
                Statics.field1497 = new String[arg1.field1023];
                int var12 = 0;
                for (int var13 = 1; var13 < var4.length; var13++) {
                    if (var4[var13] instanceof Integer) {
                        int var14 = (Integer) var4[var13];
                        if (var14 == -2147483647) {
                            var14 = arg0.field1096;
                        }
                        if (var14 == -2147483646) {
                            var14 = arg0.field1099;
                        }
                        if (var14 == -2147483645) {
                            var14 = arg0.field1095 == null ? -1 : arg0.field1095.field3815;
                        }
                        if (var14 == -2147483644) {
                            var14 = arg0.field1098;
                        }
                        if (var14 == -2147483643) {
                            var14 = arg0.field1095 == null ? -1 : arg0.field1095.field3930;
                        }
                        if (var14 == -2147483642) {
                            var14 = arg0.field1094 == null ? -1 : arg0.field1094.field3815;
                        }
                        if (var14 == -2147483641) {
                            var14 = arg0.field1094 == null ? -1 : arg0.field1094.field3930;
                        }
                        if (var14 == -2147483640) {
                            var14 = arg0.field1100;
                        }
                        if (var14 == -2147483639) {
                            var14 = arg0.field1102;
                        }
                        Statics.field884[var11++] = var14;
                    } else if (var4[var13] instanceof String) {
                        String var15 = (String) var4[var13];
                        if (var15.equals("event_opbase")) {
                            var15 = arg0.field1097;
                        }
                        Statics.field1497[var12++] = var15;
                    }
                }
                field902 = arg0.field1101;
                while (true) {
                    var10++;
                    if (var10 > arg2) {
                        throw new RuntimeException();
                    }
                    var5++;
                    int var59 = var6[var5];
                    if (var59 >= 100) {
                        boolean var46;
                        if (arg1.field1024[var5] == 1) {
                            var46 = true;
                        } else {
                            var46 = false;
                        }
                        int var47 = method3449(var59, arg1, var46);
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
                        field893[++Statics.field67 - 1] = var7[var5];
                    } else if (var59 == 1) {
                        int var16 = var7[var5];
                        field893[++Statics.field67 - 1] = class346.field3710[var16];
                    } else if (var59 == 2) {
                        int var17 = var7[var5];
                        class346.field3710[var17] = field893[--Statics.field67];
                        client.method3070(var17);
                    } else if (var59 == 3) {
                        field886[++Statics.field1822 - 1] = arg1.field1021[var5];
                    } else if (var59 == 6) {
                        var5 += var7[var5];
                    } else if (var59 == 7) {
                        Statics.field67 -= 2;
                        if (field893[Statics.field67] != field893[Statics.field67 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 8) {
                        Statics.field67 -= 2;
                        if (field893[Statics.field67] == field893[Statics.field67 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 9) {
                        Statics.field67 -= 2;
                        if (field893[Statics.field67] < field893[Statics.field67 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 10) {
                        Statics.field67 -= 2;
                        if (field893[Statics.field67] > field893[Statics.field67 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 21) {
                        if (field887 == 0) {
                            return;
                        }
                        class64 var19 = field888[--field887];
                        arg1 = var19.field467;
                        var6 = arg1.field1019;
                        var7 = arg1.field1024;
                        var5 = var19.field468;
                        Statics.field884 = var19.field469;
                        Statics.field1497 = var19.field473;
                    } else if (var59 == 25) {
                        int var20 = var7[var5];
                        field893[++Statics.field67 - 1] = class346.method5576(var20);
                    } else if (var59 == 27) {
                        int var21 = var7[var5];
                        class346.method2130(var21, field893[--Statics.field67]);
                    } else if (var59 == 31) {
                        Statics.field67 -= 2;
                        if (field893[Statics.field67] <= field893[Statics.field67 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 32) {
                        Statics.field67 -= 2;
                        if (field893[Statics.field67] >= field893[Statics.field67 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 33) {
                        field893[++Statics.field67 - 1] = Statics.field884[var7[var5]];
                    } else if (var59 == 34) {
                        Statics.field884[var7[var5]] = field893[--Statics.field67];
                    } else if (var59 == 35) {
                        field886[++Statics.field1822 - 1] = Statics.field1497[var7[var5]];
                    } else if (var59 == 36) {
                        Statics.field1497[var7[var5]] = field886[--Statics.field1822];
                    } else if (var59 == 37) {
                        int var22 = var7[var5];
                        Statics.field1822 -= var22;
                        String var23 = class415.method2632(field886, Statics.field1822, var22);
                        field886[++Statics.field1822 - 1] = var23;
                    } else if (var59 == 38) {
                        Statics.field67--;
                    } else if (var59 == 39) {
                        Statics.field1822--;
                    } else if (var59 == 40) {
                        int var24 = var7[var5];
                        class81 var25 = class81.method3327(var24);
                        int[] var26 = new int[var25.field1022];
                        String[] var27 = new String[var25.field1023];
                        for (int var28 = 0; var28 < var25.field1025; var28++) {
                            var26[var28] = field893[Statics.field67 - var25.field1025 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field1028; var29++) {
                            var27[var29] = field886[Statics.field1822 - var25.field1028 + var29];
                        }
                        Statics.field67 -= var25.field1025;
                        Statics.field1822 -= var25.field1028;
                        class64 var30 = new class64();
                        var30.field467 = arg1;
                        var30.field468 = var5;
                        var30.field469 = Statics.field884;
                        var30.field473 = Statics.field1497;
                        field888[++field887 - 1] = var30;
                        arg1 = var25;
                        var6 = var25.field1019;
                        var7 = var25.field1024;
                        var5 = -1;
                        Statics.field884 = var26;
                        Statics.field1497 = var27;
                    } else if (var59 == 42) {
                        field893[++Statics.field67 - 1] = Statics.field3238.method2671(var7[var5]);
                    } else if (var59 == 43) {
                        Statics.field3238.method2672(var7[var5], field893[--Statics.field67]);
                    } else if (var59 == 44) {
                        int var31 = var7[var5] >> 16;
                        int var32 = var7[var5] & 0xFFFF;
                        int var33 = field893[--Statics.field67];
                        if (var33 < 0 || var33 > 5000) {
                            throw new RuntimeException();
                        }
                        field883[var31] = var33;
                        byte var34 = -1;
                        if (var32 == 105) {
                            var34 = 0;
                        }
                        for (int var35 = 0; var35 < var33; var35++) {
                            field885[var31][var35] = var34;
                        }
                    } else if (var59 == 45) {
                        int var36 = var7[var5];
                        int var37 = field893[--Statics.field67];
                        if (var37 < 0 || var37 >= field883[var36]) {
                            throw new RuntimeException();
                        }
                        field893[++Statics.field67 - 1] = field885[var36][var37];
                    } else if (var59 == 46) {
                        int var38 = var7[var5];
                        Statics.field67 -= 2;
                        int var39 = field893[Statics.field67];
                        if (var39 < 0 || var39 >= field883[var38]) {
                            throw new RuntimeException();
                        }
                        field885[var38][var39] = field893[Statics.field67 + 1];
                    } else if (var59 == 47) {
                        String var40 = Statics.field3238.method2677(var7[var5]);
                        if (var40 == null) {
                            var40 = class378.field4097;
                        }
                        field886[++Statics.field1822 - 1] = var40;
                    } else if (var59 == 48) {
                        Statics.field3238.method2673(var7[var5], field886[--Statics.field1822]);
                    } else if (var59 == 49) {
                        String var41 = Statics.field3238.method2712(var7[var5]);
                        field886[++Statics.field1822 - 1] = var41;
                    } else if (var59 == 50) {
                        Statics.field3238.method2686(var7[var5], field886[--Statics.field1822]);
                    } else if (var59 == 60) {
                        class519 var42 = arg1.field1026[var7[var5]];
                        class503 var43 = (class503) var42.method8506((long) field893[--Statics.field67]);
                        if (var43 != null) {
                            var5 += var43.field5047;
                        }
                    } else if (var59 == 74) {
                        Integer var44 = Statics.field3643.method3167(var7[var5]);
                        if (var44 == null) {
                            field893[++Statics.field67 - 1] = -1;
                        } else {
                            field893[++Statics.field67 - 1] = var44;
                        }
                    } else if (var59 == 76) {
                        Integer var45 = Statics.field243.method8105(var7[var5]);
                        if (var45 == null) {
                            field893[++Statics.field67 - 1] = -1;
                        } else {
                            field893[++Statics.field67 - 1] = var45;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var57) {
                var9 = true;
                var50 = new StringBuilder(30);
                var50.append("").append(arg1.field5049).append(" ");
                for (int var51 = field887 - 1; var51 >= 0; var51--) {
                    var50.append("").append(field888[var51].field467.field5049).append(" ");
                }
            }
            var50.append("").append(var8);
            class571.method8083(var50.toString(), var57);
        } finally {
            while (field894.size() > 0) {
                class106 var54 = (class106) field894.remove(0);
                client.method5926(var54.method2609(), var54.method2608(), var54.method2623(), var54.method2610(), "");
            }
            if (field892) {
                field892 = false;
                client.method1876();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class571.method8083("Warning: Script " + arg1.field1020 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("hg.az(ILdm;ZI)I")
    public static int method3449(int arg0, class81 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method5778(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method7021(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method6071(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method418(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return Statics.method7663(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method3192(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method7027(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method44(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method8039(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method5423(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2864(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method7021(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method6071(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method418(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return Statics.method7663(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method3192(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3060(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2888(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method6482(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method5033(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2864(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method6808(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method694(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3103(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method6277(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method4317(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2241(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method7701(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method2901(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method6504(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method8102(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method7455(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method8103(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method5634(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method160(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3349(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method6503(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5825(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3403(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method231(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method12(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method2968(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2886(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method5929(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method6505(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method6475(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method3656(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method3520(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method7086(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mw.af(ILdm;ZI)I")
    public static int method5778(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field67 -= 3;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            int var5 = field893[Statics.field67 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class358 var6 = Statics.field75.method5906(var3);
            if (var6.field3884 == null) {
                var6.field3884 = new class358[var5 + 1];
            }
            if (var6.field3884.length <= var5) {
                class358[] var7 = new class358[var5 + 1];
                for (int var8 = 0; var8 < var6.field3884.length; var8++) {
                    var7[var8] = var6.field3884[var8];
                }
                var6.field3884 = var7;
            }
            if (var5 > 0 && var6.field3884[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class358 var9 = new class358();
            var9.field3894 = var4;
            var9.field3965 = var9.field3815 = var6.field3815;
            var9.field3930 = var5;
            var9.field3814 = true;
            if (var4 == 12) {
                var9.method6311();
                var9.method6312().method6034(new class109(var9));
                var9.method6312().method6033(new class110(var9));
            }
            var6.field3884[var5] = var9;
            if (arg2) {
                Statics.field898 = var9;
            } else {
                Statics.field64 = var9;
            }
            Statics.method5599(var6);
            return 1;
        } else if (arg0 == 101) {
            class358 var10 = arg2 ? Statics.field898 : Statics.field64;
            class358 var11 = Statics.field75.method5906(var10.field3815);
            var11.field3884[var10.field3930] = null;
            Statics.method5599(var11);
            return 1;
        } else if (arg0 == 102) {
            class358 var12 = Statics.field75.method5906(field893[--Statics.field67]);
            var12.field3884 = null;
            Statics.method5599(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field67 -= 2;
            int var13 = field893[Statics.field67];
            int var14 = field893[Statics.field67 + 1];
            class358 var15 = Statics.field75.method5909(var13, var14);
            if (var15 == null || var14 == -1) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
                if (arg2) {
                    Statics.field898 = var15;
                } else {
                    Statics.field64 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class358 var16 = Statics.field75.method5906(field893[--Statics.field67]);
            if (var16 == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
                if (arg2) {
                    Statics.field898 = var16;
                } else {
                    Statics.field64 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("po.aa(ILdm;ZB)I")
    public static int method7021(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class358 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field893[--Statics.field67];
            var4 = Statics.field75.method5906(var3);
        } else {
            var4 = arg2 ? Statics.field898 : Statics.field64;
        }
        if (arg0 == 1000) {
            Statics.field67 -= 4;
            var4.field3825 = field893[Statics.field67];
            var4.field3826 = field893[Statics.field67 + 1];
            var4.field3821 = field893[Statics.field67 + 2];
            var4.field3822 = field893[Statics.field67 + 3];
            Statics.method5599(var4);
            Statics.field1971.method1183(var4);
            if (var3 != -1 && var4.field3894 == 0) {
                client.method3068(Statics.field75.field3722[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field67 -= 4;
            var4.field3867 = field893[Statics.field67];
            var4.field3846 = field893[Statics.field67 + 1];
            var4.field3917 = field893[Statics.field67 + 2];
            var4.field3824 = field893[Statics.field67 + 3];
            Statics.method5599(var4);
            Statics.field1971.method1183(var4);
            if (var3 != -1 && var4.field3894 == 0) {
                client.method3068(Statics.field75.field3722[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field893[--Statics.field67] == 1;
            if (var4.field3914 != var5) {
                var4.field3914 = var5;
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3963 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3964 = field893[--Statics.field67] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("np.at(ILdm;ZI)I")
    public static int method6071(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class358 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field893[--Statics.field67];
            var4 = Statics.field75.method5906(var3);
        } else {
            var4 = arg2 ? Statics.field898 : Statics.field64;
        }
        if (arg0 == 1100) {
            Statics.field67 -= 2;
            int var5 = field893[Statics.field67];
            int var6 = field893[Statics.field67 + 1];
            if (var4.field3894 == 12) {
                class356 var7 = var4.method6312();
                if (var7 != null && var7.method6219(var5, var6)) {
                    Statics.method5599(var4);
                }
            } else {
                var4.field3837 = var5;
                if (var4.field3837 > var4.field3939 - var4.field3831) {
                    var4.field3837 = var4.field3939 - var4.field3831;
                }
                if (var4.field3837 < 0) {
                    var4.field3837 = 0;
                }
                var4.field3838 = var6;
                if (var4.field3838 > var4.field3840 - var4.field3875) {
                    var4.field3838 = var4.field3840 - var4.field3875;
                }
                if (var4.field3838 < 0) {
                    var4.field3838 = 0;
                }
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3841 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3845 = field893[--Statics.field67] == 1;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3847 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3893 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3851 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3916 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3832 = field893[--Statics.field67] == 1;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3931 = 1;
            var4.field3861 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field67 -= 6;
            var4.field3908 = field893[Statics.field67];
            var4.field3923 = field893[Statics.field67 + 1];
            var4.field3868 = field893[Statics.field67 + 2];
            var4.field3953 = field893[Statics.field67 + 3];
            var4.field3870 = field893[Statics.field67 + 4];
            var4.field3871 = field893[Statics.field67 + 5];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field893[--Statics.field67];
            if (var4.field3864 != var8) {
                var4.field3864 = var8;
                var4.field3951 = 0;
                var4.field3952 = 0;
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3839 = field893[--Statics.field67] == 1;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field886[--Statics.field1822];
            if (var4.field3894 == 12) {
                class356 var10 = var4.method6312();
                if (var10 != null && var10.method6043()) {
                    var10.method5989(var9);
                } else {
                    var4.field3879 = var9;
                }
                Statics.method5599(var4);
            } else if (!var9.equals(var4.field3879)) {
                var4.field3879 = var9;
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3878 = field893[--Statics.field67];
            if (var4.field3894 == 12) {
                class356 var11 = var4.method6312();
                if (var11 != null) {
                    var11.method6132();
                }
            }
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field67 -= 3;
            if (var4.field3894 == 12) {
                class356 var12 = var4.method6312();
                if (var12 != null) {
                    var12.method5997(field893[Statics.field67], field893[Statics.field67 + 1]);
                    var12.method5998(field893[Statics.field67 + 2]);
                }
            } else {
                var4.field3882 = field893[Statics.field67];
                var4.field3883 = field893[Statics.field67 + 1];
                var4.field3896 = field893[Statics.field67 + 2];
            }
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3890 = field893[--Statics.field67] == 1;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3833 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3857 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3858 = field893[--Statics.field67] == 1;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3859 = field893[--Statics.field67] == 1;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field67 -= 2;
            var4.field3939 = field893[Statics.field67];
            var4.field3840 = field893[Statics.field67 + 1];
            Statics.method5599(var4);
            if (var3 != -1 && var4.field3894 == 0) {
                client.method3068(Statics.field75.field3722[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method850(var4.field3815, var4.field3930);
            client.field576 = var4;
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3852 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3842 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3848 = field893[--Statics.field67];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field893[--Statics.field67];
            class558 var14 = (class558) class401.method2027(class558.method6513(), var13);
            if (var14 != null) {
                var4.field3809 = var14;
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field893[--Statics.field67] == 1;
            var4.field3850 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field893[--Statics.field67] == 1;
            var4.field3876 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3853 = field886[--Statics.field1822];
            Statics.method5599(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6378(field886[--Statics.field1822], "", Statics.field3400, client.method2255());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field67 -= 2;
            var4.method6298(field893[Statics.field67], field893[Statics.field67 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6299(field886[--Statics.field1822], field893[--Statics.field67]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field67--;
            class350 var17 = var4.method6313();
            if (var17 != null) {
                var17.field3732 = field893[Statics.field67];
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field67--;
            class350 var18 = var4.method6313();
            if (var18 != null) {
                var18.field3733 = field893[Statics.field67];
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1822--;
            class356 var19 = var4.method6312();
            if (var19 != null) {
                var4.field3880 = field886[Statics.field1822];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field67--;
            class350 var20 = var4.method6313();
            if (var20 != null) {
                var20.field3734 = field893[Statics.field67];
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field67--;
            class356 var21 = var4.method6312();
            if (var21 != null && var21.method5993(field893[Statics.field67])) {
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field67--;
            class356 var22 = var4.method6312();
            if (var22 != null && var22.method6191(field893[Statics.field67])) {
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field67--;
            class356 var23 = var4.method6312();
            if (var23 != null && var23.method5995(field893[Statics.field67])) {
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field893[--Statics.field67] == 1;
            client.field553.method4070();
            class356 var25 = var4.method6312();
            if (var25 != null && var25.method5987(var24)) {
                if (var24) {
                    client.field553.method4068(var4);
                }
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field893[--Statics.field67] == 1;
            if (!var26 && client.field553.method4069() == var4) {
                client.field553.method4070();
                Statics.method5599(var4);
            }
            class356 var27 = var4.method6312();
            if (var27 != null) {
                var27.method6110(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field67 -= 2;
            class356 var28 = var4.method6312();
            if (var28 != null && var28.method6257(field893[Statics.field67], field893[Statics.field67 + 1])) {
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field67--;
            class356 var29 = var4.method6312();
            if (var29 != null && var29.method6257(field893[Statics.field67], field893[Statics.field67])) {
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field67--;
            class356 var30 = var4.method6312();
            if (var30 != null) {
                var30.method6000(field893[Statics.field67]);
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field67--;
            class356 var31 = var4.method6312();
            if (var31 != null) {
                var31.method5999(field893[Statics.field67]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field67--;
            class356 var32 = var4.method6312();
            if (var32 != null) {
                var32.method6002(field893[Statics.field67]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field67--;
            class356 var33 = var4.method6312();
            if (var33 != null) {
                var33.method6001(field893[Statics.field67]);
                Statics.method5599(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field67 -= 2;
            class28 var34 = var4.method6411();
            if (var34 != null) {
                var34.method377(field893[Statics.field67], field893[Statics.field67 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field67 -= 2;
            class28 var35 = var4.method6411();
            if (var35 != null) {
                var35.method378((char) field893[Statics.field67], field893[Statics.field67 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6296(field886[--Statics.field1822], Statics.field3400);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field1822 -= 3;
            String var36 = field886[Statics.field1822];
            String var37 = field886[Statics.field1822 + 1];
            String var38 = field886[Statics.field1822 + 2];
            long var39 = client.method2255();
            long var41 = client.method2997();
            String var43 = client.method2890().method8206(client.method2890().field5063);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6295(var36, var37, var38, var43, Long.toString(var41), Statics.field3400);
            return 1;
        } else if (arg0 != 1152) {
            return 2;
        } else if (var4.field3894 == 11) {
            class175 var44 = var4.method6308();
            boolean var45 = var44 != null && class184.method3361().method3393(var44.method3247());
            field893[++Statics.field67 - 1] = var45 ? 1 : 0;
            return 1;
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bo.ab(ILdm;ZI)I")
    public static int method418(int arg0, class81 arg1, boolean arg2) {
        class358 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field75.method5906(field893[--Statics.field67]);
        } else {
            var3 = arg2 ? Statics.field898 : Statics.field64;
        }
        Statics.method5599(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field67 -= 2;
            int var9 = field893[Statics.field67];
            int var10 = field893[Statics.field67 + 1];
            var3.field3949 = var9;
            var3.field3950 = var10;
            class225 var11 = class225.method369(var9);
            var3.field3868 = var11.field2345;
            var3.field3953 = var11.field2369;
            var3.field3870 = var11.field2346;
            var3.field3908 = var11.field2348;
            var3.field3923 = var11.field2331;
            var3.field3871 = var11.field2344;
            if (arg0 == 1205) {
                var3.field3877 = 0;
            } else if (arg0 == 1212 | var11.field2351 == 1) {
                var3.field3877 = 1;
            } else {
                var3.field3877 = 2;
            }
            if (var3.field3872 > 0) {
                var3.field3871 = var3.field3871 * 32 / var3.field3872;
            } else if (var3.field3867 > 0) {
                var3.field3871 = var3.field3871 * 32 / var3.field3867;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3931 = 2;
            var3.field3861 = field893[--Statics.field67];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3931 = 3;
            var3.field3861 = Statics.field84.field1157.method5945();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field893[--Statics.field67] == 1;
            class358.method1117(var3, Statics.field84.field1157, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field893[--Statics.field67];
            if (var3.field3903 == null) {
                throw new RuntimeException("");
            }
            class358.method2282(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field67 -= 2;
            int var6 = field893[Statics.field67];
            int var7 = field893[Statics.field67 + 1];
            if (var3.field3903 == null) {
                throw new RuntimeException("");
            }
            class358.method4157(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field893[--Statics.field67];
            if (var3.field3903 == null) {
                throw new RuntimeException("");
            }
            class358.method6693(var3, Statics.field84.field1157.field3756, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nk.ao(Lnb;I[B[BI)V")
    public static final void method5905(class358 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3892 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3892 = new byte[11][];
            arg0.field3874 = new byte[11][];
            arg0.field3836 = new int[11];
            arg0.field3895 = new int[11];
        }
        arg0.field3892[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3869 = false;
            for (int var4 = 0; var4 < arg0.field3892.length; var4++) {
                if (arg0.field3892[var4] != null) {
                    arg0.field3869 = true;
                    break;
                }
            }
        } else {
            arg0.field3869 = true;
        }
        arg0.field3874[arg1] = arg3;
    }

    @ObfuscatedName("hd.ah(Lnb;IIII)V")
    public static final void method3517(class358 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3836 == null) {
            throw new RuntimeException();
        }
        arg0.field3836[arg1] = arg2;
        arg0.field3895[arg1] = arg3;
    }

    @ObfuscatedName("dr.av(Lnb;II)V")
    public static final void method2129(class358 arg0, int arg1) {
        if (arg0.field3892 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3823 == null) {
            arg0.field3823 = new int[arg0.field3892.length];
        }
        arg0.field3823[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("gg.aq(ILdm;ZI)I")
    public static int method3192(int arg0, class81 arg1, boolean arg2) {
        class358 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field75.method5906(field893[--Statics.field67]);
        } else {
            var3 = arg2 ? Statics.field898 : Statics.field64;
        }
        String var4 = field886[--Statics.field1822];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field893[--Statics.field67];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field893[--Statics.field67];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field886[--Statics.field1822];
            } else {
                var7[var8] = Integer.valueOf(field893[--Statics.field67]);
            }
        }
        int var9 = field893[--Statics.field67];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3957 = var7;
        } else if (arg0 == 1401) {
            var3.field3802 = var7;
        } else if (arg0 == 1402) {
            var3.field3907 = var7;
        } else if (arg0 == 1403) {
            var3.field3959 = var7;
        } else if (arg0 == 1404) {
            var3.field3911 = var7;
        } else if (arg0 == 1405) {
            var3.field3912 = var7;
        } else if (arg0 == 1406) {
            var3.field3915 = var7;
        } else if (arg0 == 1407) {
            var3.field3966 = var7;
            var3.field3920 = var5;
        } else if (arg0 == 1408) {
            var3.field3922 = var7;
        } else if (arg0 == 1409) {
            var3.field3811 = var7;
        } else if (arg0 == 1410) {
            var3.field3913 = var7;
        } else if (arg0 == 1411) {
            var3.field3906 = var7;
        } else if (arg0 == 1412) {
            var3.field3910 = var7;
        } else if (arg0 == 1414) {
            var3.field3918 = var7;
            var3.field3919 = var5;
        } else if (arg0 == 1415) {
            var3.field3854 = var7;
            var3.field3921 = var5;
        } else if (arg0 == 1416) {
            var3.field3827 = var7;
        } else if (arg0 == 1417) {
            var3.field3819 = var7;
        } else if (arg0 == 1418) {
            var3.field3937 = var7;
        } else if (arg0 == 1419) {
            var3.field3828 = var7;
        } else if (arg0 == 1420) {
            var3.field3860 = var7;
        } else if (arg0 == 1421) {
            var3.field3866 = var7;
        } else if (arg0 == 1422) {
            var3.field3934 = var7;
        } else if (arg0 == 1423) {
            var3.field3935 = var7;
        } else if (arg0 == 1424) {
            var3.field3936 = var7;
        } else if (arg0 == 1425) {
            var3.field3938 = var7;
        } else if (arg0 == 1426) {
            var3.field3905 = var7;
        } else if (arg0 == 1427) {
            var3.field3941 = var7;
        } else if (arg0 == 1428) {
            var3.field3932 = var7;
        } else if (arg0 == 1429) {
            var3.field3933 = var7;
        } else if (arg0 == 1430) {
            var3.field3928 = var7;
        } else if (arg0 == 1431) {
            var3.field3929 = var7;
        } else if (arg0 == 1434) {
            var3.field3940 = var7;
        } else if (arg0 == 1435) {
            var3.field3958 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class354 var10 = var3.method6315();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3754 = var7;
                } else if (arg0 == 1437) {
                    var10.field3750 = var7;
                } else if (arg0 == 1438) {
                    var10.field3753 = var7;
                } else if (arg0 == 1439) {
                    var10.field3751 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3961 = true;
        return 1;
    }

    @ObfuscatedName("pz.ap(ILdm;ZI)I")
    public static int method7027(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = arg2 ? Statics.field898 : Statics.field64;
        if (arg0 == 1500) {
            field893[++Statics.field67 - 1] = var3.field3844;
            return 1;
        } else if (arg0 == 1501) {
            field893[++Statics.field67 - 1] = var3.field3830;
            return 1;
        } else if (arg0 == 1502) {
            field893[++Statics.field67 - 1] = var3.field3831;
            return 1;
        } else if (arg0 == 1503) {
            field893[++Statics.field67 - 1] = var3.field3875;
            return 1;
        } else if (arg0 == 1504) {
            field893[++Statics.field67 - 1] = var3.field3914 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field893[++Statics.field67 - 1] = var3.field3965;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.ae(ILdm;ZB)I")
    public static int method44(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = arg2 ? Statics.field898 : Statics.field64;
        if (arg0 == 1600) {
            field893[++Statics.field67 - 1] = var3.field3837;
            return 1;
        } else if (arg0 == 1601) {
            field893[++Statics.field67 - 1] = var3.field3838;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3894 == 12) {
                class356 var4 = var3.method6312();
                if (var4 != null) {
                    field886[++Statics.field1822 - 1] = var4.method6035().method7326();
                    return 1;
                }
            }
            field886[++Statics.field1822 - 1] = var3.field3879;
            return 1;
        } else if (arg0 == 1603) {
            field893[++Statics.field67 - 1] = var3.field3939;
            return 1;
        } else if (arg0 == 1604) {
            field893[++Statics.field67 - 1] = var3.field3840;
            return 1;
        } else if (arg0 == 1605) {
            field893[++Statics.field67 - 1] = var3.field3871;
            return 1;
        } else if (arg0 == 1606) {
            field893[++Statics.field67 - 1] = var3.field3868;
            return 1;
        } else if (arg0 == 1607) {
            field893[++Statics.field67 - 1] = var3.field3870;
            return 1;
        } else if (arg0 == 1608) {
            field893[++Statics.field67 - 1] = var3.field3953;
            return 1;
        } else if (arg0 == 1609) {
            field893[++Statics.field67 - 1] = var3.field3847;
            return 1;
        } else if (arg0 == 1610) {
            field893[++Statics.field67 - 1] = var3.field3848;
            return 1;
        } else if (arg0 == 1611) {
            field893[++Statics.field67 - 1] = var3.field3841;
            return 1;
        } else if (arg0 == 1612) {
            field893[++Statics.field67 - 1] = var3.field3842;
            return 1;
        } else if (arg0 == 1613) {
            field893[++Statics.field67 - 1] = var3.field3809.method34();
            return 1;
        } else if (arg0 == 1614) {
            field893[++Statics.field67 - 1] = var3.field3876 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class350 var5 = var3.method6313();
                field893[++Statics.field67 - 1] = var5 == null ? 0 : var5.field3732;
            }
            if (arg0 == 1618) {
                class350 var6 = var3.method6313();
                field893[++Statics.field67 - 1] = var6 == null ? 0 : var6.field3733;
                return 1;
            } else if (arg0 == 1619) {
                class356 var7 = var3.method6312();
                field886[++Statics.field1822 - 1] = var7 == null ? "" : var7.method6036().method7326();
                return 1;
            } else if (arg0 == 1620) {
                class350 var8 = var3.method6313();
                field893[++Statics.field67 - 1] = var8 == null ? 0 : var8.field3734;
                return 1;
            } else if (arg0 == 1621) {
                class356 var9 = var3.method6312();
                field893[++Statics.field67 - 1] = var9 == null ? 0 : var9.method6046();
                return 1;
            } else if (arg0 == 1622) {
                class356 var10 = var3.method6312();
                field893[++Statics.field67 - 1] = var10 == null ? 0 : var10.method6047();
                return 1;
            } else if (arg0 == 1623) {
                class356 var11 = var3.method6312();
                field893[++Statics.field67 - 1] = var11 == null ? 0 : var11.method6048();
                return 1;
            } else if (arg0 == 1624) {
                class356 var12 = var3.method6312();
                field893[++Statics.field67 - 1] = var12 != null && var12.method6163() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class356 var13 = var3.method6312();
                field893[++Statics.field67 - 1] = var13 != null && var13.method6101() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class356 var14 = var3.method6312();
                field886[++Statics.field1822 - 1] = var14 == null ? "" : var14.method6037().method7574();
                return 1;
            } else if (arg0 == 1627) {
                class356 var15 = var3.method6312();
                int var16 = var15 == null ? 0 : var15.method6192();
                int var17 = var15 == null ? 0 : var15.method6041();
                field893[++Statics.field67 - 1] = Math.min(var16, var17);
                field893[++Statics.field67 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class356 var18 = var3.method6312();
                field893[++Statics.field67 - 1] = var18 == null ? 0 : var18.method6041();
                return 1;
            } else if (arg0 == 1629) {
                class356 var19 = var3.method6312();
                field893[++Statics.field67 - 1] = var19 == null ? 0 : var19.method6050();
                return 1;
            } else if (arg0 == 1630) {
                class356 var20 = var3.method6312();
                field893[++Statics.field67 - 1] = var20 == null ? 0 : var20.method6049();
                return 1;
            } else if (arg0 == 1631) {
                class356 var21 = var3.method6312();
                field893[++Statics.field67 - 1] = var21 == null ? 0 : var21.method6051();
                return 1;
            } else if (arg0 == 1632) {
                class356 var22 = var3.method6312();
                field893[++Statics.field67 - 1] = var22 == null ? 0 : var22.method6168();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6411();
                field893[Statics.field67 - 1] = var23 == null ? 0 : var23.method396(field893[Statics.field67 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6411();
                field893[Statics.field67 - 1] = var24 == null ? 0 : var24.method382((char) field893[Statics.field67 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("sm.ax(ILdm;ZB)I")
    public static int method8039(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = arg2 ? Statics.field898 : Statics.field64;
        if (arg0 == 1700) {
            field893[++Statics.field67 - 1] = var3.field3949;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3949 == -1) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var3.field3950;
            }
            return 1;
        } else if (arg0 == 1702) {
            field893[++Statics.field67 - 1] = var3.field3930;
            return 1;
        } else if (arg0 == 1707) {
            field893[++Statics.field67 - 1] = var3.method6301() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return Statics.method3489(var3);
        } else if (arg0 == 1709) {
            return method5663(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mt.au(Lnb;I)I")
    public static int method5663(class358 arg0) {
        if (arg0.field3894 == 11) {
            String var1 = field886[--Statics.field1822];
            field886[++Statics.field1822 - 1] = arg0.method6303(var1);
            return 1;
        } else {
            field886[Statics.field1822 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("ly.as(ILdm;ZB)I")
    public static int method5423(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = arg2 ? Statics.field898 : Statics.field64;
        if (arg0 == 1800) {
            field893[++Statics.field67 - 1] = class359.method3320(client.method3177(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field893[--Statics.field67];
            int var5 = var4 - 1;
            if (var3.field3897 == null || var5 >= var3.field3897.length || var3.field3897[var5] == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var3.field3897[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3924 == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var3.field3924;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ek.aw(ILdm;ZI)I")
    public static int method2864(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field902 >= 10) {
                throw new RuntimeException();
            }
            class358 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field75.method5906(field893[--Statics.field67]);
            } else {
                var10 = arg2 ? Statics.field898 : Statics.field64;
            }
            if (var10.field3941 == null) {
                return 0;
            }
            class90 var11 = new class90();
            var11.field1095 = var10;
            var11.field1103 = var10.field3941;
            var11.field1101 = field902 + 1;
            client.field739.method6829(var11);
            return 1;
        } else if (arg0 == 1928) {
            class358 var3 = arg2 ? Statics.field898 : Statics.field64;
            int var4 = field893[--Statics.field67];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class106 var5 = new class106(var4, var3.field3815, var3.field3930, var3.field3949);
            field894.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field67 -= 3;
            int var6 = field893[Statics.field67];
            int var7 = field893[Statics.field67 + 1];
            int var8 = field893[Statics.field67 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class106 var9 = new class106(var8, var6, var7, Statics.field75.method5906(var6).field3949);
            field894.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.ad(ILdm;ZI)I")
    public static int method3060(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = Statics.field75.method5906(field893[--Statics.field67]);
        if (arg0 == 2500) {
            field893[++Statics.field67 - 1] = var3.field3844;
            return 1;
        } else if (arg0 == 2501) {
            field893[++Statics.field67 - 1] = var3.field3830;
            return 1;
        } else if (arg0 == 2502) {
            field893[++Statics.field67 - 1] = var3.field3831;
            return 1;
        } else if (arg0 == 2503) {
            field893[++Statics.field67 - 1] = var3.field3875;
            return 1;
        } else if (arg0 == 2504) {
            field893[++Statics.field67 - 1] = var3.field3914 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field893[++Statics.field67 - 1] = var3.field3965;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.ai(ILdm;ZI)I")
    public static int method2888(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = Statics.field75.method5906(field893[--Statics.field67]);
        if (arg0 == 2600) {
            field893[++Statics.field67 - 1] = var3.field3837;
            return 1;
        } else if (arg0 == 2601) {
            field893[++Statics.field67 - 1] = var3.field3838;
            return 1;
        } else if (arg0 == 2602) {
            field886[++Statics.field1822 - 1] = var3.field3879;
            return 1;
        } else if (arg0 == 2603) {
            field893[++Statics.field67 - 1] = var3.field3939;
            return 1;
        } else if (arg0 == 2604) {
            field893[++Statics.field67 - 1] = var3.field3840;
            return 1;
        } else if (arg0 == 2605) {
            field893[++Statics.field67 - 1] = var3.field3871;
            return 1;
        } else if (arg0 == 2606) {
            field893[++Statics.field67 - 1] = var3.field3868;
            return 1;
        } else if (arg0 == 2607) {
            field893[++Statics.field67 - 1] = var3.field3870;
            return 1;
        } else if (arg0 == 2608) {
            field893[++Statics.field67 - 1] = var3.field3953;
            return 1;
        } else if (arg0 == 2609) {
            field893[++Statics.field67 - 1] = var3.field3847;
            return 1;
        } else if (arg0 == 2610) {
            field893[++Statics.field67 - 1] = var3.field3848;
            return 1;
        } else if (arg0 == 2611) {
            field893[++Statics.field67 - 1] = var3.field3841;
            return 1;
        } else if (arg0 == 2612) {
            field893[++Statics.field67 - 1] = var3.field3842;
            return 1;
        } else if (arg0 == 2613) {
            field893[++Statics.field67 - 1] = var3.field3809.method34();
            return 1;
        } else if (arg0 == 2614) {
            field893[++Statics.field67 - 1] = var3.field3876 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class350 var4 = var3.method6313();
                field893[++Statics.field67 - 1] = var4 == null ? 0 : var4.field3732;
            }
            if (arg0 == 2618) {
                class350 var5 = var3.method6313();
                field893[++Statics.field67 - 1] = var5 == null ? 0 : var5.field3733;
                return 1;
            } else if (arg0 == 2619) {
                class356 var6 = var3.method6312();
                field886[++Statics.field1822 - 1] = var6 == null ? "" : var6.method6036().method7326();
                return 1;
            } else if (arg0 == 2620) {
                class350 var7 = var3.method6313();
                field893[++Statics.field67 - 1] = var7 == null ? 0 : var7.field3734;
                return 1;
            } else if (arg0 == 2621) {
                class356 var8 = var3.method6312();
                field893[++Statics.field67 - 1] = var8 == null ? 0 : var8.method6046();
                return 1;
            } else if (arg0 == 2622) {
                class356 var9 = var3.method6312();
                field893[++Statics.field67 - 1] = var9 == null ? 0 : var9.method6047();
                return 1;
            } else if (arg0 == 2623) {
                class356 var10 = var3.method6312();
                field893[++Statics.field67 - 1] = var10 == null ? 0 : var10.method6048();
                return 1;
            } else if (arg0 == 2624) {
                class356 var11 = var3.method6312();
                field893[++Statics.field67 - 1] = var11 != null && var11.method6163() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class356 var12 = var3.method6312();
                field893[++Statics.field67 - 1] = var12 != null && var12.method6101() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class356 var13 = var3.method6312();
                field886[++Statics.field1822 - 1] = var13 == null ? "" : var13.method6037().method7574();
                return 1;
            } else if (arg0 == 2627) {
                class356 var14 = var3.method6312();
                int var15 = var14 == null ? 0 : var14.method6192();
                int var16 = var14 == null ? 0 : var14.method6041();
                field893[++Statics.field67 - 1] = Math.min(var15, var16);
                field893[++Statics.field67 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class356 var17 = var3.method6312();
                field893[++Statics.field67 - 1] = var17 == null ? 0 : var17.method6041();
                return 1;
            } else if (arg0 == 2629) {
                class356 var18 = var3.method6312();
                field893[++Statics.field67 - 1] = var18 == null ? 0 : var18.method6050();
                return 1;
            } else if (arg0 == 2630) {
                class356 var19 = var3.method6312();
                field893[++Statics.field67 - 1] = var19 == null ? 0 : var19.method6049();
                return 1;
            } else if (arg0 == 2631) {
                class356 var20 = var3.method6312();
                field893[++Statics.field67 - 1] = var20 == null ? 0 : var20.method6051();
                return 1;
            } else if (arg0 == 2632) {
                class356 var21 = var3.method6312();
                field893[++Statics.field67 - 1] = var21 == null ? 0 : var21.method6168();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6411();
                field893[Statics.field67 - 1] = var22 == null ? 0 : var22.method396(field893[Statics.field67 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6411();
                field893[Statics.field67 - 1] = var23 == null ? 0 : var23.method382((char) field893[Statics.field67 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ol.an(ILdm;ZB)I")
    public static int method6482(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class358 var3 = Statics.field75.method5906(field893[--Statics.field67]);
            field893[++Statics.field67 - 1] = var3.field3949;
            return 1;
        } else if (arg0 == 2701) {
            class358 var4 = Statics.field75.method5906(field893[--Statics.field67]);
            if (var4.field3949 == -1) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var4.field3950;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field893[--Statics.field67];
            class89 var6 = (class89) client.field697.method8528((long) var5);
            if (var6 == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field893[++Statics.field67 - 1] = client.field783;
            return 1;
        } else if (arg0 == 2707) {
            class358 var7 = Statics.field75.method5906(field893[--Statics.field67]);
            field893[++Statics.field67 - 1] = var7.method6301() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class358 var8 = Statics.field75.method5906(field893[--Statics.field67]);
            return Statics.method3489(var8);
        } else if (arg0 == 2709) {
            class358 var9 = Statics.field75.method5906(field893[--Statics.field67]);
            return method5663(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.am(ILdm;ZI)I")
    public static int method5033(int arg0, class81 arg1, boolean arg2) {
        class358 var3 = Statics.field75.method5906(field893[--Statics.field67]);
        if (arg0 == 2800) {
            field893[++Statics.field67 - 1] = class359.method3320(client.method3177(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field893[--Statics.field67];
            int var5 = var4 - 1;
            if (var3.field3897 == null || var5 >= var3.field3897.length || var3.field3897[var5] == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var3.field3897[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3924 == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var3.field3924;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pl.ar(ILdm;ZI)I")
    public static int method6808(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field886[--Statics.field1822];
            class114.method2802(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field67 -= 2;
            client.method3179(Statics.field84, field893[Statics.field67], field893[Statics.field67 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field896) {
                field892 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field886[--Statics.field1822];
            int var5 = 0;
            if (class415.method3648(var4)) {
                var5 = class415.method3328(var4);
            }
            class321 var6 = class321.method3542(class319.field3317, client.field591.field1467);
            var6.field3393.method8981(var5);
            client.field591.method2745(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field886[--Statics.field1822];
            class321 var8 = class321.method3542(class319.field3333, client.field591.field1467);
            var8.field3393.method8779(var7.length() + 1);
            var8.field3393.method8864(var7);
            client.field591.method2745(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field886[--Statics.field1822];
            class321 var10 = class321.method3542(class319.field3374, client.field591.field1467);
            var10.field3393.method8779(var9.length() + 1);
            var10.field3393.method8864(var9);
            client.field591.method2745(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field893[--Statics.field67];
            String var12 = field886[--Statics.field1822];
            client.method2132(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field67 -= 3;
            int var13 = field893[Statics.field67];
            int var14 = field893[Statics.field67 + 1];
            int var15 = field893[Statics.field67 + 2];
            class358 var16 = Statics.field75.method5906(var15);
            client.method2247(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field67 -= 2;
            int var17 = field893[Statics.field67];
            int var18 = field893[Statics.field67 + 1];
            class358 var19 = arg2 ? Statics.field898 : Statics.field64;
            client.method2247(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1379 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field893[++Statics.field67 - 1] = Statics.field4879.method2481() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4879.method2389(field893[--Statics.field67] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field886[--Statics.field1822];
            boolean var21 = field893[--Statics.field67] == 1;
            class32.method6508(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field893[--Statics.field67];
            class321 var23 = class321.method3542(class319.field3313, client.field591.field1467);
            var23.field3393.method8780(var22);
            client.field591.method2745(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field893[--Statics.field67];
            Statics.field1822 -= 2;
            String var25 = field886[Statics.field1822];
            String var26 = field886[Statics.field1822 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class321 var27 = class321.method3542(class319.field3332, client.field591.field1467);
                var27.field3393.method8780(1 + class546.method7454(var25) + class546.method7454(var26));
                var27.field3393.method8864(var26);
                var27.field3393.method8826(var24);
                var27.field3393.method8864(var25);
                client.field591.method2745(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3118) {
            client.field684 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field723 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field893[--Statics.field67] == 1) {
                client.field573 |= 0x1;
            } else {
                client.field573 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field893[--Statics.field67] == 1) {
                client.field573 |= 0x2;
            } else {
                client.field573 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field893[--Statics.field67] == 1) {
                client.field573 |= 0x4;
            } else {
                client.field573 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field893[--Statics.field67] == 1) {
                client.field573 |= 0x8;
            } else {
                client.field573 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field573 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field650 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field664 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3443(field893[--Statics.field67] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field893[++Statics.field67 - 1] = client.method7275() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field67 -= 2;
            client.field625 = field893[Statics.field67];
            client.field626 = field893[Statics.field67 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3132) {
            field893[++Statics.field67 - 1] = Statics.field190;
            field893[++Statics.field67 - 1] = Statics.field5283;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field698 = 3;
            client.field699 = field893[--Statics.field67];
            return 1;
        } else if (arg0 == 3137) {
            client.field698 = 2;
            client.field699 = field893[--Statics.field67];
            return 1;
        } else if (arg0 == 3138) {
            client.field698 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field698 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field698 = 3;
            client.field699 = arg2 ? Statics.field898.field3815 : Statics.field64.field3815;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field893[--Statics.field67] == 1;
            Statics.field4879.method2398(var28);
            return 1;
        } else if (arg0 == 3142) {
            field893[++Statics.field67 - 1] = Statics.field4879.method2392() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field893[--Statics.field67] == 1;
            client.field583 = var29;
            if (!var29) {
                Statics.field4879.method2408("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field893[++Statics.field67 - 1] = client.field583 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field893[--Statics.field67] == 1;
            Statics.field4879.method2503(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field893[++Statics.field67 - 1] = Statics.field4879.method2394() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field893[++Statics.field67 - 1] = class78.field949;
            return 1;
        } else if (arg0 == 3154) {
            field893[++Statics.field67 - 1] = client.method2899();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1822--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field67--;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field67--;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1822--;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field67--;
            field886[++Statics.field1822 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field67--;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field67 -= 2;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field67 -= 2;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field67 -= 2;
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            field886[++Statics.field1822 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field67--;
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3175) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1822--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1822--;
            return 1;
        } else if (arg0 == 3181) {
            client.method3492(field893[--Statics.field67]);
            return 1;
        } else if (arg0 == 3182) {
            field893[++Statics.field67 - 1] = client.method686();
            return 1;
        } else if (arg0 == 3185) {
            int var31 = field893[--Statics.field67];
            Statics.field4879.method2418(var31);
            return 1;
        } else if (arg0 == 3186) {
            int var32 = Statics.field4879.method2459();
            field893[++Statics.field67 - 1] = var32;
            return 1;
        } else if (arg0 == 3189) {
            int var33 = field893[--Statics.field67];
            client.method7853(var33);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.ag(ILdm;ZI)I")
    public static int method694(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field67 -= 3;
            client.method7696(field893[Statics.field67], field893[Statics.field67 + 1], field893[Statics.field67 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field67 -= 5;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            int var5 = field893[Statics.field67 + 2];
            int var6 = field893[Statics.field67 + 3];
            int var7 = field893[Statics.field67 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method303(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field67 -= 2;
            client.method410(field893[Statics.field67], field893[Statics.field67 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class93 var50 = class93.field1132;
            class92 var51 = class92.field1116;
            int var52 = field893[--Statics.field67];
            if (arg0 == 3212) {
                int var53 = field893[--Statics.field67];
                var50 = (class93) class401.method2027(class93.method8018(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field893[--Statics.field67];
                var51 = (class92) class401.method2027(class92.method7857(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field893[--Statics.field67];
                var50 = (class93) class401.method2027(class93.method8018(), var55);
                if (var50 == null) {
                    var51 = (class92) class401.method2027(class92.method7857(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class93.field1128;
            } else if (arg0 == 3203) {
                var51 = class92.field1121;
            } else if (arg0 == 3205) {
                var51 = class92.field1119;
            } else if (arg0 == 3207) {
                var51 = class92.field1120;
            }
            if (class92.field1116 == var51) {
                switch(var50.field1131) {
                    case 1:
                        Statics.field4879.method2398(var52 == 1);
                        break;
                    case 2:
                        Statics.field4879.method2503(var52 == 1);
                        break;
                    case 3:
                        Statics.field4879.method2513(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field4879.method2438(var52);
                        break;
                    case 5:
                        client.method3492(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1123) {
                    case 1:
                        Statics.field4879.method2389(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method5902(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method445(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method1720(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class93 var38 = class93.field1132;
            class92 var39 = class92.field1116;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field893[--Statics.field67];
                var38 = (class93) class401.method2027(class93.method8018(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field893[--Statics.field67];
                var39 = (class92) class401.method2027(class92.method7857(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field893[--Statics.field67];
                var38 = (class93) class401.method2027(class93.method8018(), var43);
                if (var38 == null) {
                    var39 = (class92) class401.method2027(class92.method7857(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class93.field1128;
            } else if (arg0 == 3204) {
                var39 = class92.field1121;
            } else if (arg0 == 3206) {
                var39 = class92.field1119;
            } else if (arg0 == 3208) {
                var39 = class92.field1120;
            }
            int var45;
            if (class92.field1116 == var39) {
                switch(var38.field1131) {
                    case 1:
                        var45 = Statics.field4879.method2392() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field4879.method2394() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field4879.method2397() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field4879.method2500();
                        break;
                    case 5:
                        var45 = client.method686();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1123) {
                    case 1:
                        var45 = Statics.field4879.method2481() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field4879.method2417();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field4879.method2484();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field4879.method2437();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field893[++Statics.field67 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field893[--Statics.field67];
            int var10 = 0;
            class93 var11 = (class93) class401.method2027(class93.method8018(), var9);
            if (var11 != null) {
                var10 = class93.field1132 == var11 ? 0 : 1;
            }
            field893[++Statics.field67 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field893[--Statics.field67];
            int var13 = 0;
            class92 var14 = (class92) class401.method2027(class92.method7857(), var12);
            if (var14 != null) {
                var13 = class92.field1116 == var14 ? 0 : 1;
            }
            field893[++Statics.field67 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class93 var28 = class93.field1132;
            class92 var29 = class92.field1116;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field893[--Statics.field67];
                var28 = (class93) class401.method2027(class93.method8018(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field893[--Statics.field67];
                var29 = (class92) class401.method2027(class92.method7857(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class92.field1116 == var29) {
                switch(var28.field1131) {
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
                switch(var29.field1123) {
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
            field893[++Statics.field67 - 1] = var35;
            field893[++Statics.field67 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field67 -= 2;
            int var15 = field893[Statics.field67];
            int var16 = field893[Statics.field67 + 1];
            class330.method6481(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field67 -= 6;
            int var17 = field893[Statics.field67];
            int var18 = field893[Statics.field67 + 1];
            int var19 = field893[Statics.field67 + 2];
            int var20 = field893[Statics.field67 + 3];
            int var21 = field893[Statics.field67 + 4];
            int var22 = field893[Statics.field67 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method303(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field67 -= 4;
            int var24 = field893[Statics.field67];
            int var25 = field893[Statics.field67 + 1];
            int var26 = field893[Statics.field67 + 2];
            int var27 = field893[Statics.field67 + 3];
            class330.method3759(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gt.bs(ILdm;ZB)I")
    public static int method3103(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field893[++Statics.field67 - 1] = client.field821;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field67 -= 2;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = class87.method2028(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field67 -= 2;
            int var5 = field893[Statics.field67];
            int var6 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = class87.method3085(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field67 -= 2;
            int var7 = field893[Statics.field67];
            int var8 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = class87.method2036(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class192.method1877(var9).field1984;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field538[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field667[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field668[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field3967.field1349;
            int var14 = (Statics.field84.field1215 >> 7) + Statics.field3967.field1338;
            int var15 = (Statics.field84.field1276 >> 7) + Statics.field3967.field1334;
            field893[++Statics.field67 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field893[++Statics.field67 - 1] = client.field571 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field67 -= 2;
            int var19 = field893[Statics.field67] + 32768;
            int var20 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = class87.method2028(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field67 -= 2;
            int var21 = field893[Statics.field67] + 32768;
            int var22 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = class87.method3085(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field67 -= 2;
            int var23 = field893[Statics.field67] + 32768;
            int var24 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = class87.method2036(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field669 >= 2) {
                field893[++Statics.field67 - 1] = client.field669;
            } else {
                field893[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field893[++Statics.field67 - 1] = client.field692;
            return 1;
        } else if (arg0 == 3318) {
            field893[++Statics.field67 - 1] = client.field600;
            return 1;
        } else if (arg0 == 3321) {
            field893[++Statics.field67 - 1] = client.field702 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field893[++Statics.field67 - 1] = client.field703;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field706) {
                field893[++Statics.field67 - 1] = 1;
            } else {
                field893[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field893[++Statics.field67 - 1] = client.field718;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field67 -= 4;
            int var25 = field893[Statics.field67];
            int var26 = field893[Statics.field67 + 1];
            int var27 = field893[Statics.field67 + 2];
            int var28 = field893[Statics.field67 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field893[++Statics.field67 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field893[++Statics.field67 - 1] = client.field752;
            return 1;
        } else if (arg0 == 3327) {
            field893[++Statics.field67 - 1] = client.field547;
            return 1;
        } else if (arg0 == 3331) {
            field893[++Statics.field67 - 1] = client.field702;
            return 1;
        } else if (arg0 == 3332) {
            int var32 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field670[var32];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nh.bf(ILdm;ZI)I")
    public static int method6277(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field67 -= 2;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            class205 var5 = class205.method294(var3);
            if (var5.field2088 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2090; var6++) {
                if (var5.field2091[var6] == var4) {
                    field886[++Statics.field1822 - 1] = var5.field2093[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field886[++Statics.field1822 - 1] = var5.field2084;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field67 -= 4;
            int var7 = field893[Statics.field67];
            int var8 = field893[Statics.field67 + 1];
            int var9 = field893[Statics.field67 + 2];
            int var10 = field893[Statics.field67 + 3];
            class205 var11 = class205.method294(var9);
            if (var11.field2085 != var7 || var11.field2088 != var8) {
                if (var8 == 115) {
                    field886[++Statics.field1822 - 1] = class378.field4097;
                } else {
                    field893[++Statics.field67 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2090; var12++) {
                if (var11.field2091[var12] == var10) {
                    if (var8 == 115) {
                        field886[++Statics.field1822 - 1] = var11.field2093[var12];
                    } else {
                        field893[++Statics.field67 - 1] = var11.field2092[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field886[++Statics.field1822 - 1] = var11.field2084;
                } else {
                    field893[++Statics.field67 - 1] = var11.field2089;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field893[--Statics.field67];
            class205 var14 = class205.method294(var13);
            field893[++Statics.field67 - 1] = var14.method3636();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jm.bo(ILdm;ZI)I")
    public static int method4317(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field764.method4087(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field764.method4108(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field764.method4088(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dg.bi(ILdm;ZI)I")
    public static int method2241(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field182.field855 == 0) {
                field893[++Statics.field67 - 1] = -2;
            } else if (Statics.field182.field855 == 1) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = Statics.field182.field853.method7931();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field893[--Statics.field67];
            if (Statics.field182.method1797() && var3 >= 0 && var3 < Statics.field182.field853.method7931()) {
                class467 var4 = (class467) Statics.field182.field853.method7951(var3);
                field886[++Statics.field1822 - 1] = var4.method7884();
                field886[++Statics.field1822 - 1] = var4.method7881();
            } else {
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field893[--Statics.field67];
            if (Statics.field182.method1797() && var5 >= 0 && var5 < Statics.field182.field853.method7931()) {
                field893[++Statics.field67 - 1] = ((class474) Statics.field182.field853.method7951(var5)).field4932;
            } else {
                field893[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field893[--Statics.field67];
            if (Statics.field182.method1797() && var6 >= 0 && var6 < Statics.field182.field853.method7931()) {
                field893[++Statics.field67 - 1] = ((class474) Statics.field182.field853.method7951(var6)).field4934;
            } else {
                field893[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field886[--Statics.field1822];
            int var8 = field893[--Statics.field67];
            class71.method4003(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field886[--Statics.field1822];
            Statics.field182.method1804(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field886[--Statics.field1822];
            Statics.field182.method1858(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field886[--Statics.field1822];
            Statics.field182.method1846(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field886[--Statics.field1822];
            boolean var13 = true;
            Statics.field182.method1809(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field886[--Statics.field1822];
            String var15 = client.method3098(var14);
            field893[++Statics.field67 - 1] = Statics.field182.method1818(new class568(var15, Statics.field2521), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1404 == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = Statics.field1404.field4907;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1404 == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = Statics.field1404.method7931();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field893[--Statics.field67];
            if (Statics.field1404 == null || var16 >= Statics.field1404.method7931()) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = Statics.field1404.method7951(var16).method7890().method9385();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field893[--Statics.field67];
            if (Statics.field1404 == null || var17 >= Statics.field1404.method7931()) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = ((class474) Statics.field1404.method7951(var17)).method7994();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field893[--Statics.field67];
            if (Statics.field1404 == null || var18 >= Statics.field1404.method7931()) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = ((class474) Statics.field1404.method7951(var18)).field4934;
            }
            return 1;
        } else if (arg0 == 3616) {
            field893[++Statics.field67 - 1] = Statics.field1404 == null ? 0 : Statics.field1404.field4909;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field886[--Statics.field1822];
            client.method1011(var19);
            return 1;
        } else if (arg0 == 3618) {
            field893[++Statics.field67 - 1] = Statics.field1404 == null ? 0 : Statics.field1404.field4910;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field886[--Statics.field1822];
            Statics.method3490(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method3074();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field182.method1797()) {
                field893[++Statics.field67 - 1] = Statics.field182.field854.method7931();
            } else {
                field893[++Statics.field67 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field893[--Statics.field67];
            if (Statics.field182.method1797() && var21 >= 0 && var21 < Statics.field182.field854.method7931()) {
                class473 var22 = (class473) Statics.field182.field854.method7951(var21);
                field886[++Statics.field1822 - 1] = var22.method7884();
                field886[++Statics.field1822 - 1] = var22.method7881();
            } else {
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field886[--Statics.field1822];
            String var24 = client.method3098(var23);
            field893[++Statics.field67 - 1] = Statics.field182.method1803(new class568(var24, Statics.field2521)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field893[--Statics.field67];
            if (Statics.field1404 == null || var25 >= Statics.field1404.method7931() || !Statics.field1404.method7951(var25).method7890().equals(Statics.field84.field1153)) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1404 == null || Statics.field1404.field4904 == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = Statics.field1404.field4904;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field893[--Statics.field67];
            if (Statics.field1404 == null || var26 >= Statics.field1404.method7931() || !((class469) Statics.field1404.method7951(var26)).method7870()) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field893[--Statics.field67];
            if (Statics.field1404 == null || var27 >= Statics.field1404.method7931() || !((class469) Statics.field1404.method7951(var27)).method7861()) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field182.field853.method7926();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class552(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class553(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class123(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class119(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class122(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class127(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class121(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class120(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class124(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class125(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field182.field853.method7917();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field182.field854.method7926();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field893[--Statics.field67] == 1;
            Statics.field182.field854.method7927(new class552(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field893[--Statics.field67] == 1;
            Statics.field182.field854.method7927(new class553(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field182.field854.method7917();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1404 != null) {
                Statics.field1404.method7926();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class552(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class553(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class123(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class119(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class122(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class127(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class121(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class120(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class124(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class125(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1404 != null) {
                Statics.field1404.method7917();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field893[--Statics.field67] == 1;
            Statics.field182.field853.method7927(new class126(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field893[--Statics.field67] == 1;
            if (Statics.field1404 != null) {
                Statics.field1404.method7927(new class126(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ru.bt(ILdm;ZI)I")
    public static int method7701(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ez.bn(ILdm;ZB)I")
    public static int method2901(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field2052 == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
                Statics.field3643 = Statics.field2052;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field893[--Statics.field67];
            if (client.field713[var3] == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = 1;
                Statics.field3643 = client.field713[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field886[++Statics.field1822 - 1] = Statics.field3643.field1770;
            return 1;
        } else if (arg0 == 3803) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1763 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1768;
            return 1;
        } else if (arg0 == 3805) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1769;
            return 1;
        } else if (arg0 == 3806) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1774;
            return 1;
        } else if (arg0 == 3807) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1771;
            return 1;
        } else if (arg0 == 3809) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1772;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = Statics.field3643.field1783[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = Statics.field3643.field1766[var5];
            return 1;
        } else if (arg0 == 3812) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1767;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = Statics.field3643.field1784[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field67 -= 3;
            int var7 = field893[Statics.field67];
            int var8 = field893[Statics.field67 + 1];
            int var9 = field893[Statics.field67 + 2];
            field893[++Statics.field67 - 1] = Statics.field3643.method3173(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1779;
            return 1;
        } else if (arg0 == 3816) {
            field893[++Statics.field67 - 1] = Statics.field3643.field1780;
            return 1;
        } else if (arg0 == 3817) {
            field893[++Statics.field67 - 1] = Statics.field3643.method3127(field886[--Statics.field1822]);
            return 1;
        } else if (arg0 == 3818) {
            field893[Statics.field67 - 1] = Statics.field3643.method3111()[field893[Statics.field67 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field67 -= 2;
            int var10 = field893[Statics.field67];
            int var11 = field893[Statics.field67 + 1];
            client.method4735(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = Statics.field3643.field1777[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field67 -= 3;
                int var13 = field893[Statics.field67];
                boolean var14 = field893[Statics.field67 + 1] == 1;
                int var15 = field893[Statics.field67 + 2];
                client.method2837(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field893[--Statics.field67];
                field893[++Statics.field67 - 1] = Statics.field3643.field1778[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field4608 == null) {
                    field893[++Statics.field67 - 1] = 0;
                } else {
                    field893[++Statics.field67 - 1] = 1;
                    Statics.field4801 = Statics.field4608;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field893[--Statics.field67];
                if (client.field727[var17] == null) {
                    field893[++Statics.field67 - 1] = 0;
                } else {
                    field893[++Statics.field67 - 1] = 1;
                    Statics.field4801 = client.field727[var17];
                    Statics.field3205 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field886[++Statics.field1822 - 1] = Statics.field4801.field1828;
                return 1;
            } else if (arg0 == 3853) {
                field893[++Statics.field67 - 1] = Statics.field4801.field1830;
                return 1;
            } else if (arg0 == 3854) {
                field893[++Statics.field67 - 1] = Statics.field4801.field1829;
                return 1;
            } else if (arg0 == 3855) {
                field893[++Statics.field67 - 1] = Statics.field4801.method3198();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field893[--Statics.field67];
                field886[++Statics.field1822 - 1] = ((class150) Statics.field4801.field1831.get(var18)).field1698.method9385();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field893[--Statics.field67];
                field893[++Statics.field67 - 1] = ((class150) Statics.field4801.field1831.get(var19)).field1699;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field893[--Statics.field67];
                field893[++Statics.field67 - 1] = ((class150) Statics.field4801.field1831.get(var20)).field1704;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field893[--Statics.field67];
                client.method2175(Statics.field3205, var21);
                return 1;
            } else if (arg0 == 3860) {
                field893[++Statics.field67 - 1] = Statics.field4801.method3201(field886[--Statics.field1822]);
                return 1;
            } else if (arg0 == 3861) {
                field893[Statics.field67 - 1] = Statics.field4801.method3195()[field893[Statics.field67 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field893[++Statics.field67 - 1] = Statics.field243 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("on.bw(ILdm;ZI)I")
    public static int method6504(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field574[var3].method6745();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field574[var4].field4571;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field574[var5].field4572;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field574[var6].field4573;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field574[var7].field4574;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.field574[var8].field4570;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field893[--Statics.field67];
            int var10 = client.field574[var9].method6744();
            field893[++Statics.field67 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field893[--Statics.field67];
            int var12 = client.field574[var11].method6744();
            field893[++Statics.field67 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field893[--Statics.field67];
            int var14 = client.field574[var13].method6744();
            field893[++Statics.field67 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field893[--Statics.field67];
            int var16 = client.field574[var15].method6744();
            field893[++Statics.field67 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field893[--Statics.field67] == 1;
            if (Statics.field1797 != null) {
                Statics.field1797.method6695(class389.field4549, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field893[--Statics.field67] == 1;
            if (Statics.field1797 != null) {
                Statics.field1797.method6695(class389.field4548, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field67 -= 2;
            boolean var19 = field893[Statics.field67] == 1;
            boolean var20 = field893[Statics.field67 + 1] == 1;
            if (Statics.field1797 != null) {
                client.field819.field498 = var20;
                Statics.field1797.method6695(client.field819, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field893[--Statics.field67] == 1;
            if (Statics.field1797 != null) {
                Statics.field1797.method6695(class389.field4550, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field893[--Statics.field67] == 1;
            if (Statics.field1797 != null) {
                Statics.field1797.method6695(class389.field4547, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field893[++Statics.field67 - 1] = Statics.field1797 == null ? 0 : Statics.field1797.field4546.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field893[--Statics.field67];
            class395 var24 = (class395) Statics.field1797.field4546.get(var23);
            field893[++Statics.field67 - 1] = var24.field4568;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field893[--Statics.field67];
            class395 var26 = (class395) Statics.field1797.field4546.get(var25);
            field886[++Statics.field1822 - 1] = var26.method6742();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field893[--Statics.field67];
            class395 var28 = (class395) Statics.field1797.field4546.get(var27);
            field886[++Statics.field1822 - 1] = var28.method6737();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field893[--Statics.field67];
            class395 var30 = (class395) Statics.field1797.field4546.get(var29);
            long var31 = class326.method2895() - Statics.field2039 - var30.field4565;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field886[++Statics.field1822 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field893[--Statics.field67];
            class395 var38 = (class395) Statics.field1797.field4546.get(var37);
            field893[++Statics.field67 - 1] = var38.field4566.field4573;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field893[--Statics.field67];
            class395 var40 = (class395) Statics.field1797.field4546.get(var39);
            field893[++Statics.field67 - 1] = var40.field4566.field4572;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field893[--Statics.field67];
            class395 var42 = (class395) Statics.field1797.field4546.get(var41);
            field893[++Statics.field67 - 1] = var42.field4566.field4571;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var43).field2350 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("sy.bl(ILdm;ZB)I")
    public static int method8102(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field67 -= 2;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field67 -= 2;
            int var5 = field893[Statics.field67];
            int var6 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field67 -= 2;
            int var7 = field893[Statics.field67];
            int var8 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field67 -= 2;
            int var9 = field893[Statics.field67];
            int var10 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field67 -= 5;
            int var13 = field893[Statics.field67];
            int var14 = field893[Statics.field67 + 1];
            int var15 = field893[Statics.field67 + 2];
            int var16 = field893[Statics.field67 + 3];
            int var17 = field893[Statics.field67 + 4];
            field893[++Statics.field67 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field67 -= 2;
            int var18 = field893[Statics.field67];
            int var19 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field67 -= 2;
            int var20 = field893[Statics.field67];
            int var21 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field67 -= 2;
            int var22 = field893[Statics.field67];
            int var23 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field67 -= 2;
            int var24 = field893[Statics.field67];
            int var25 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field67 -= 2;
            int var26 = field893[Statics.field67];
            int var27 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field67 -= 2;
            int var28 = field893[Statics.field67];
            int var29 = field893[Statics.field67 + 1];
            if (var28 == 0) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field67 -= 2;
            int var30 = field893[Statics.field67];
            int var31 = field893[Statics.field67 + 1];
            if (var30 == 0) {
                field893[++Statics.field67 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field893[++Statics.field67 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field893[++Statics.field67 - 1] = var30;
                    break;
                case 2:
                    field893[++Statics.field67 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field893[++Statics.field67 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field893[++Statics.field67 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field893[++Statics.field67 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field67 -= 2;
            int var32 = field893[Statics.field67];
            int var33 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field67 -= 2;
            int var34 = field893[Statics.field67];
            int var35 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field67 -= 2;
            int var36 = field893[Statics.field67];
            int var37 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field67 -= 2;
            int var38 = field893[Statics.field67];
            int var39 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field67 -= 3;
            long var40 = (long) field893[Statics.field67];
            long var42 = (long) field893[Statics.field67 + 1];
            long var44 = (long) field893[Statics.field67 + 2];
            field893[++Statics.field67 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class328.method1863(field893[--Statics.field67]);
            field893[++Statics.field67 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field67 -= 2;
            int var47 = field893[Statics.field67];
            int var48 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field67 -= 3;
            int var49 = field893[Statics.field67];
            int var50 = field893[Statics.field67 + 1];
            int var51 = field893[Statics.field67 + 2];
            field893[++Statics.field67 - 1] = class328.method6472(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field67 -= 3;
            int var52 = field893[Statics.field67];
            int var53 = field893[Statics.field67 + 1];
            int var54 = field893[Statics.field67 + 2];
            field893[++Statics.field67 - 1] = class328.method2014(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field67 -= 3;
            int var55 = field893[Statics.field67];
            int var56 = field893[Statics.field67 + 1];
            int var57 = field893[Statics.field67 + 2];
            int var58 = 31 - var57;
            field893[++Statics.field67 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field67 -= 4;
            int var59 = field893[Statics.field67];
            int var60 = field893[Statics.field67 + 1];
            int var61 = field893[Statics.field67 + 2];
            int var62 = field893[Statics.field67 + 3];
            int var63 = class328.method2014(var59, var61, var62);
            int var64 = class328.method5432(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field893[++Statics.field67 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field893[Statics.field67 - 1] = class496.method7668(field893[Statics.field67 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field893[Statics.field67 - 1] = class496.method8019(field893[Statics.field67 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field67 -= 2;
            int var65 = field893[Statics.field67];
            int var66 = field893[Statics.field67 + 1];
            int var67 = class496.method7895(var65, var66);
            field893[++Statics.field67 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field893[Statics.field67 - 1] = Math.abs(field893[Statics.field67 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field886[--Statics.field1822];
            int var69 = -1;
            if (class415.method3648(var68)) {
                var69 = class415.method3328(var68);
            }
            field893[++Statics.field67 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qo.be(ILdm;ZI)I")
    public static int method7455(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field886[--Statics.field1822];
            int var4 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1822 -= 2;
            String var5 = field886[Statics.field1822];
            String var6 = field886[Statics.field1822 + 1];
            field886[++Statics.field1822 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field886[--Statics.field1822];
            int var8 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = var7 + class415.method2859(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field886[--Statics.field1822];
            field886[++Statics.field1822 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field893[--Statics.field67];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field890.setTime(new Date(var11));
            int var13 = field890.get(5);
            int var14 = field890.get(2);
            int var15 = field890.get(1);
            field886[++Statics.field1822 - 1] = var13 + "-" + field891[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1822 -= 2;
            String var16 = field886[Statics.field1822];
            String var17 = field886[Statics.field1822 + 1];
            if (Statics.field84.field1157 == null || Statics.field84.field1157.field3756 == 0) {
                field886[++Statics.field1822 - 1] = var16;
            } else {
                field886[++Statics.field1822 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1822 -= 2;
            field893[++Statics.field67 - 1] = class415.method5935(class416.method5057(field886[Statics.field1822], field886[Statics.field1822 + 1], Statics.field1965));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field886[--Statics.field1822];
            Statics.field67 -= 2;
            int var20 = field893[Statics.field67];
            int var21 = field893[Statics.field67 + 1];
            byte[] var22 = Statics.field1378.method6573(var21, 0);
            class431 var23 = new class431(var22);
            field893[++Statics.field67 - 1] = var23.method7463(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field886[--Statics.field1822];
            Statics.field67 -= 2;
            int var25 = field893[Statics.field67];
            int var26 = field893[Statics.field67 + 1];
            byte[] var27 = Statics.field1378.method6573(var26, 0);
            class431 var28 = new class431(var27);
            field893[++Statics.field67 - 1] = var28.method7540(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1822 -= 2;
            String var29 = field886[Statics.field1822];
            String var30 = field886[Statics.field1822 + 1];
            if (field893[--Statics.field67] == 1) {
                field886[++Statics.field1822 - 1] = var29;
            } else {
                field886[++Statics.field1822 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field886[--Statics.field1822];
            field886[++Statics.field1822 - 1] = class435.method7464(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field886[--Statics.field1822];
            int var33 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class415.method258((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class415.method2235((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = Statics.method5597((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class415.method37((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field886[--Statics.field1822];
            if (var38 == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field886[--Statics.field1822];
            Statics.field67 -= 2;
            int var40 = field893[Statics.field67];
            int var41 = field893[Statics.field67 + 1];
            field886[++Statics.field1822 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field886[--Statics.field1822];
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
            field886[++Statics.field1822 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field886[--Statics.field1822];
            int var48 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1822 -= 2;
            String var49 = field886[Statics.field1822];
            String var50 = field886[Statics.field1822 + 1];
            int var51 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field886[--Statics.field1822];
            field886[++Statics.field1822 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1822 -= 3;
            String var53 = field886[Statics.field1822];
            String var54 = field886[Statics.field1822 + 1];
            String var55 = field886[Statics.field1822 + 2];
            if (Statics.field84.field1157 == null) {
                field886[++Statics.field1822 - 1] = var55;
                return 1;
            }
            switch(Statics.field84.field1157.field3758) {
                case 0:
                    field886[++Statics.field1822 - 1] = var53;
                    break;
                case 1:
                    field886[++Statics.field1822 - 1] = var54;
                    break;
                case 2:
                default:
                    field886[++Statics.field1822 - 1] = var55;
            }
            return 1;
        } else if (arg0 == 4124) {
            field893[++Statics.field67 - 1] = Statics.field84.field1157 == null ? -1 : Statics.field84.field1157.field3758;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("sy.bg(ILdm;ZI)I")
    public static int method8103(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = class225.method369(var3).field2338;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field67 -= 2;
            int var4 = field893[Statics.field67];
            int var5 = field893[Statics.field67 + 1];
            class225 var6 = class225.method369(var4);
            if (var5 < 1 || var5 > 5 || var6.field2358[var5 - 1] == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var6.field2358[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field67 -= 2;
            int var7 = field893[Statics.field67];
            int var8 = field893[Statics.field67 + 1];
            class225 var9 = class225.method369(var7);
            if (var8 < 1 || var8 > 5 || var9.field2376[var8 - 1] == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var9.field2376[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var10).field2353;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var11).field2351 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field893[--Statics.field67];
            class225 var13 = class225.method369(var12);
            if (var13.field2375 == -1 && var13.field2374 >= 0) {
                field893[++Statics.field67 - 1] = var13.field2374;
            } else {
                field893[++Statics.field67 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field893[--Statics.field67];
            class225 var15 = class225.method369(var14);
            if (var15.field2375 >= 0 && var15.field2374 >= 0) {
                field893[++Statics.field67 - 1] = var15.field2374;
            } else {
                field893[++Statics.field67 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var16).field2356 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field893[--Statics.field67];
            class225 var18 = class225.method369(var17);
            if (var18.field2342 == -1 && var18.field2387 >= 0) {
                field893[++Statics.field67 - 1] = var18.field2387;
            } else {
                field893[++Statics.field67 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field893[--Statics.field67];
            class225 var20 = class225.method369(var19);
            if (var20.field2342 >= 0 && var20.field2387 >= 0) {
                field893[++Statics.field67 - 1] = var20.field2387;
            } else {
                field893[++Statics.field67 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field886[--Statics.field1822];
            int var22 = field893[--Statics.field67];
            client.method5459(var21, var22 == 1);
            field893[++Statics.field67 - 1] = Statics.field1754;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field313 == null || Statics.field1504 >= Statics.field1754) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = Statics.field313[++Statics.field1504 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1504 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field893[--Statics.field67];
            int var24 = class225.method369(var23).method3940();
            if (var24 == -1) {
                field893[++Statics.field67 - 1] = var24;
            } else {
                field893[++Statics.field67 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var25).field2357;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var26).field2354;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class225.method369(var27).field2355;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field893[--Statics.field67];
            class225 var29 = class225.method369(var28);
            field893[++Statics.field67 - 1] = var29.field2333;
            return 1;
        } else if (arg0 == 4218) {
            int var30 = field893[--Statics.field67];
            field886[++Statics.field1822 - 1] = class225.method369(var30).field2335;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ms.bu(ILdm;ZB)I")
    public static int method5634(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field893[++Statics.field67 - 1] = client.field759;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field67 -= 3;
            client.field759 = field893[Statics.field67];
            Statics.field5181 = Statics.method2601(field893[Statics.field67 + 1]);
            if (Statics.field5181 == null) {
                Statics.field5181 = class565.field5484;
            }
            client.field640 = field893[Statics.field67 + 2];
            class321 var3 = class321.method3542(class319.field3320, client.field591.field1467);
            var3.field3393.method8779(client.field759);
            var3.field3393.method8779(Statics.field5181.field5483);
            var3.field3393.method8779(client.field640);
            client.field591.method2745(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field886[--Statics.field1822];
            Statics.field67 -= 2;
            int var5 = field893[Statics.field67];
            int var6 = field893[Statics.field67 + 1];
            class321 var7 = class321.method3542(class319.field3295, client.field591.field1467);
            var7.field3393.method8779(class546.method7454(var4) + 2);
            var7.field3393.method8864(var4);
            var7.field3393.method8779(var5 - 1);
            var7.field3393.method8779(var6);
            client.field591.method2745(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field67 -= 2;
            int var8 = field893[Statics.field67];
            int var9 = field893[Statics.field67 + 1];
            class65 var10 = class114.method7004(var8, var9);
            if (var10 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var10.field477;
                field893[++Statics.field67 - 1] = var10.field483;
                field886[++Statics.field1822 - 1] = var10.field484 == null ? "" : var10.field484;
                field886[++Statics.field1822 - 1] = var10.field481 == null ? "" : var10.field481;
                field886[++Statics.field1822 - 1] = var10.field482 == null ? "" : var10.field482;
                field893[++Statics.field67 - 1] = var10.method1113() ? 1 : (var10.method1105() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field893[--Statics.field67];
            class65 var12 = class114.method800(var11);
            if (var12 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var12.field475;
                field893[++Statics.field67 - 1] = var12.field483;
                field886[++Statics.field1822 - 1] = var12.field484 == null ? "" : var12.field484;
                field886[++Statics.field1822 - 1] = var12.field481 == null ? "" : var12.field481;
                field886[++Statics.field1822 - 1] = var12.field482 == null ? "" : var12.field482;
                field893[++Statics.field67 - 1] = var12.method1113() ? 1 : (var12.method1105() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field5181 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = Statics.field5181.field5483;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field886[--Statics.field1822];
            int var14 = field893[--Statics.field67];
            class321 var15 = class569.method3178(var14, var13, Statics.field1965, -1);
            client.field591.method2745(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1822 -= 2;
            String var16 = field886[Statics.field1822];
            String var17 = field886[Statics.field1822 + 1];
            class321 var18 = class321.method3542(class319.field3322, client.field591.field1467);
            var18.field3393.method8780(0);
            int var19 = var18.field3393.field5344;
            var18.field3393.method8864(var16);
            class361.method3088(var18.field3393, var17);
            var18.field3393.method8792(var18.field3393.field5344 - var19);
            client.field591.method2745(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field886[--Statics.field1822];
            Statics.field67 -= 2;
            int var21 = field893[Statics.field67];
            int var22 = field893[Statics.field67 + 1];
            class321 var23 = class569.method3178(var21, var20, Statics.field1965, var22);
            client.field591.method2745(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field84 == null || Statics.field84.field1153 == null) {
                var24 = "";
            } else {
                var24 = Statics.field84.field1153.method9385();
            }
            field886[++Statics.field1822 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field893[++Statics.field67 - 1] = client.field640;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class114.method2347(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class114.method2248(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = class114.method2511(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field886[--Statics.field1822];
            client.method2250(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field526 = field886[--Statics.field1822].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field886[++Statics.field1822 - 1] = client.field526;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field886[--Statics.field1822];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field67 -= 2;
            int var30 = field893[Statics.field67];
            int var31 = field893[Statics.field67 + 1];
            class65 var32 = class114.method7004(var30, var31);
            if (var32 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var32.field477;
                field893[++Statics.field67 - 1] = var32.field483;
                field886[++Statics.field1822 - 1] = var32.field484 == null ? "" : var32.field484;
                field886[++Statics.field1822 - 1] = var32.field481 == null ? "" : var32.field481;
                field886[++Statics.field1822 - 1] = var32.field482 == null ? "" : var32.field482;
                field893[++Statics.field67 - 1] = var32.method1113() ? 1 : (var32.method1105() ? 2 : 0);
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field893[--Statics.field67];
            class65 var34 = class114.method800(var33);
            if (var34 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var34.field475;
                field893[++Statics.field67 - 1] = var34.field483;
                field886[++Statics.field1822 - 1] = var34.field484 == null ? "" : var34.field484;
                field886[++Statics.field1822 - 1] = var34.field481 == null ? "" : var34.field481;
                field886[++Statics.field1822 - 1] = var34.field482 == null ? "" : var34.field482;
                field893[++Statics.field67 - 1] = var34.method1113() ? 1 : (var34.method1105() ? 2 : 0);
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.bh(ILdm;ZI)I")
    public static int method160(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field893[++Statics.field67 - 1] = client.method8667();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field893[--Statics.field67];
            if (var3 == 1 || var3 == 2) {
                client.method3064(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field893[++Statics.field67 - 1] = Statics.field4879.method2475();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field893[--Statics.field67];
            if (var4 == 1 || var4 == 2) {
                Statics.field4879.method2486(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field67--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gw.bk(ILdm;ZI)I")
    public static int method3349(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field67 -= 2;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            if (!client.field539) {
                client.field614 = var3;
                client.field615 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field893[++Statics.field67 - 1] = client.field614;
            return 1;
        } else if (arg0 == 5506) {
            field893[++Statics.field67 - 1] = client.field615;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field893[--Statics.field67];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field565 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field893[++Statics.field67 - 1] = client.field565;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oy.bp(ILdm;ZI)I")
    public static int method6503(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field592 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.br(II)I")
    public static int method1075(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ky.bx(II)I")
    public static int method5112(int arg0) {
        return (int) ((Math.log((double) arg0) / field895 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ma.bd(ILdm;ZB)I")
    public static int method5825(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field67 -= 2;
            client.field801 = (short) method1075(field893[Statics.field67]);
            if (client.field801 <= 0) {
                client.field801 = 256;
            }
            client.field802 = (short) method1075(field893[Statics.field67 + 1]);
            if (client.field802 <= 0) {
                client.field802 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field67 -= 2;
            client.field803 = (short) field893[Statics.field67];
            if (client.field803 <= 0) {
                client.field803 = 256;
            }
            client.field551 = (short) field893[Statics.field67 + 1];
            if (client.field551 <= 0) {
                client.field551 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field67 -= 4;
            client.field805 = (short) field893[Statics.field67];
            if (client.field805 <= 0) {
                client.field805 = 1;
            }
            client.field761 = (short) field893[Statics.field67 + 1];
            if (client.field761 <= 0) {
                client.field761 = 32767;
            } else if (client.field761 < client.field805) {
                client.field761 = client.field805;
            }
            client.field696 = (short) field893[Statics.field67 + 2];
            if (client.field696 <= 0) {
                client.field696 = 1;
            }
            client.field808 = (short) field893[Statics.field67 + 3];
            if (client.field808 <= 0) {
                client.field808 = 32767;
            } else if (client.field808 < client.field696) {
                client.field808 = client.field696;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field584 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
            } else {
                client.method5779(0, 0, client.field584.field3831, client.field584.field3875, false);
                field893[++Statics.field67 - 1] = client.field811;
                field893[++Statics.field67 - 1] = client.field812;
            }
            return 1;
        } else if (arg0 == 6204) {
            field893[++Statics.field67 - 1] = client.field803;
            field893[++Statics.field67 - 1] = client.field551;
            return 1;
        } else if (arg0 == 6205) {
            field893[++Statics.field67 - 1] = method5112(client.field801);
            field893[++Statics.field67 - 1] = method5112(client.field802);
            return 1;
        } else if (arg0 == 6220) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field893[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field893[++Statics.field67 - 1] = Statics.field190;
            return 1;
        } else if (arg0 == 6223) {
            field893[++Statics.field67 - 1] = Statics.field5283;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hi.bv(ILdm;ZI)I")
    public static int method3403(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field893[++Statics.field67 - 1] = class70.method6725() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class70 var3 = class70.method3768();
            if (var3 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
            } else {
                field893[++Statics.field67 - 1] = var3.field839;
                field893[++Statics.field67 - 1] = var3.field846;
                field886[++Statics.field1822 - 1] = var3.field843;
                field893[++Statics.field67 - 1] = var3.field848;
                field893[++Statics.field67 - 1] = var3.field841;
                field886[++Statics.field1822 - 1] = var3.field842;
            }
            return 1;
        } else if (arg0 == 6502) {
            class70 var4 = class70.method2984();
            if (var4 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
            } else {
                field893[++Statics.field67 - 1] = var4.field839;
                field893[++Statics.field67 - 1] = var4.field846;
                field886[++Statics.field1822 - 1] = var4.field843;
                field893[++Statics.field67 - 1] = var4.field848;
                field893[++Statics.field67 - 1] = var4.field841;
                field886[++Statics.field1822 - 1] = var4.field842;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field893[--Statics.field67];
            class70 var6 = null;
            for (int var7 = 0; var7 < class70.field835; var7++) {
                if (Statics.field4663[var7].field839 == var5) {
                    var6 = Statics.field4663[var7];
                    break;
                }
            }
            if (var6 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
            } else {
                field893[++Statics.field67 - 1] = var6.field839;
                field893[++Statics.field67 - 1] = var6.field846;
                field886[++Statics.field1822 - 1] = var6.field843;
                field893[++Statics.field67 - 1] = var6.field848;
                field893[++Statics.field67 - 1] = var6.field841;
                field886[++Statics.field1822 - 1] = var6.field842;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field67 -= 4;
            int var8 = field893[Statics.field67];
            boolean var9 = field893[Statics.field67 + 1] == 1;
            int var10 = field893[Statics.field67 + 2];
            boolean var11 = field893[Statics.field67 + 3] == 1;
            class70.method8137(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field893[--Statics.field67];
            if (var12 >= 0 && var12 < class70.field835) {
                class70 var13 = Statics.field4663[var12];
                field893[++Statics.field67 - 1] = var13.field839;
                field893[++Statics.field67 - 1] = var13.field846;
                field886[++Statics.field1822 - 1] = var13.field843;
                field893[++Statics.field67 - 1] = var13.field848;
                field893[++Statics.field67 - 1] = var13.field841;
                field886[++Statics.field1822 - 1] = var13.field842;
            } else {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
                field886[++Statics.field1822 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field682 = field893[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field67 -= 2;
            int var14 = field893[Statics.field67];
            int var15 = field893[Statics.field67 + 1];
            class220 var16 = class220.method5373(var15);
            if (var16.method3800()) {
                field886[++Statics.field1822 - 1] = class210.method2967(var14).method3668(var15, var16.field2238);
            } else {
                field893[++Statics.field67 - 1] = class210.method2967(var14).method3686(var15, var16.field2237);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field67 -= 2;
            int var17 = field893[Statics.field67];
            int var18 = field893[Statics.field67 + 1];
            class220 var19 = class220.method5373(var18);
            if (var19.method3800()) {
                field886[++Statics.field1822 - 1] = class224.method3868(var17).method3896(var18, var19.field2238);
            } else {
                field893[++Statics.field67 - 1] = class224.method3868(var17).method3883(var18, var19.field2237);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field67 -= 2;
            int var20 = field893[Statics.field67];
            int var21 = field893[Statics.field67 + 1];
            class220 var22 = class220.method5373(var21);
            if (var22.method3800()) {
                field886[++Statics.field1822 - 1] = class225.method369(var20).method3939(var21, var22.field2238);
            } else {
                field893[++Statics.field67 - 1] = class225.method369(var20).method3938(var21, var22.field2237);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field67 -= 2;
            int var23 = field893[Statics.field67];
            int var24 = field893[Statics.field67 + 1];
            class220 var25 = class220.method5373(var24);
            if (var25.method3800()) {
                field886[++Statics.field1822 - 1] = class221.method2234(var23).method3809(var24, var25.field2238);
            } else {
                field893[++Statics.field67 - 1] = class221.method2234(var23).method3808(var24, var25.field2237);
            }
            return 1;
        } else if (arg0 == 6518) {
            field893[++Statics.field67 - 1] = client.field608 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field893[++Statics.field67 - 1] = client.field604;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1822--;
            Statics.field67--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1822--;
            Statics.field67--;
            return 1;
        } else if (arg0 == 6524) {
            field893[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field893[++Statics.field67 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field893[++Statics.field67 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field893[++Statics.field67 - 1] = client.field534;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.bm(ILdm;ZB)I")
    public static int method231(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3967.field1349;
            int var4 = (Statics.field84.field1215 >> 7) + Statics.field3967.field1338;
            int var5 = (Statics.field84.field1276 >> 7) + Statics.field3967.field1334;
            client.method3048().method8268(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field893[--Statics.field67];
            String var7 = "";
            class281 var8 = client.method3048().method8286(var6);
            if (var8 != null) {
                var7 = var8.method5132();
            }
            field886[++Statics.field1822 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field893[--Statics.field67];
            client.method3048().method8269(var9);
            return 1;
        } else if (arg0 == 6603) {
            field893[++Statics.field67 - 1] = client.method3048().method8290();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field893[--Statics.field67];
            client.method3048().method8357(var10);
            return 1;
        } else if (arg0 == 6605) {
            field893[++Statics.field67 - 1] = client.method3048().method8285() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class347 var11 = new class347(field893[--Statics.field67]);
            client.method3048().method8334(var11.field3714, var11.field3713);
            return 1;
        } else if (arg0 == 6607) {
            class347 var12 = new class347(field893[--Statics.field67]);
            client.method3048().method8288(var12.field3714, var12.field3713);
            return 1;
        } else if (arg0 == 6608) {
            class347 var13 = new class347(field893[--Statics.field67]);
            client.method3048().method8289(var13.field3715, var13.field3714, var13.field3713);
            return 1;
        } else if (arg0 == 6609) {
            class347 var14 = new class347(field893[--Statics.field67]);
            client.method3048().method8302(var14.field3715, var14.field3714, var14.field3713);
            return 1;
        } else if (arg0 == 6610) {
            field893[++Statics.field67 - 1] = client.method3048().method8291();
            field893[++Statics.field67 - 1] = client.method3048().method8425();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field893[--Statics.field67];
            class281 var16 = client.method3048().method8286(var15);
            if (var16 == null) {
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var16.method5136().method5886();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field893[--Statics.field67];
            class281 var18 = client.method3048().method8286(var17);
            if (var18 == null) {
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = (var18.method5130() - var18.method5129() + 1) * 64;
                field893[++Statics.field67 - 1] = (var18.method5154() - var18.method5131() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field893[--Statics.field67];
            class281 var20 = client.method3048().method8286(var19);
            if (var20 == null) {
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
                field893[++Statics.field67 - 1] = 0;
            } else {
                field893[++Statics.field67 - 1] = var20.method5129() * 64;
                field893[++Statics.field67 - 1] = var20.method5131() * 64;
                field893[++Statics.field67 - 1] = var20.method5130() * 64 + 64 - 1;
                field893[++Statics.field67 - 1] = var20.method5154() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field893[--Statics.field67];
            class281 var22 = client.method3048().method8286(var21);
            if (var22 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var22.method5128();
            }
            return 1;
        } else if (arg0 == 6615) {
            class347 var23 = client.method3048().method8293();
            if (var23 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var23.field3714;
                field893[++Statics.field67 - 1] = var23.field3713;
            }
            return 1;
        } else if (arg0 == 6616) {
            field893[++Statics.field67 - 1] = client.method3048().method8336();
            return 1;
        } else if (arg0 == 6617) {
            class347 var24 = new class347(field893[--Statics.field67]);
            class281 var25 = client.method3048().method8271();
            if (var25 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method5119(var24.field3715, var24.field3714, var24.field3713);
            if (var26 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var26[0];
                field893[++Statics.field67 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class347 var27 = new class347(field893[--Statics.field67]);
            class281 var28 = client.method3048().method8271();
            if (var28 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
                return 1;
            }
            class347 var29 = var28.method5172(var27.field3714, var27.field3713);
            if (var29 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var29.method5886();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field67 -= 2;
            int var30 = field893[Statics.field67];
            class347 var31 = new class347(field893[Statics.field67 + 1]);
            method4796(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field67 -= 2;
            int var32 = field893[Statics.field67];
            class347 var33 = new class347(field893[Statics.field67 + 1]);
            method4796(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field67 -= 2;
            int var34 = field893[Statics.field67];
            class347 var35 = new class347(field893[Statics.field67 + 1]);
            class281 var36 = client.method3048().method8286(var34);
            if (var36 == null) {
                field893[++Statics.field67 - 1] = 0;
                return 1;
            } else {
                field893[++Statics.field67 - 1] = var36.method5173(var35.field3715, var35.field3714, var35.field3713) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field893[++Statics.field67 - 1] = client.method3048().method8294();
            field893[++Statics.field67 - 1] = client.method3048().method8295();
            return 1;
        } else if (arg0 == 6623) {
            class347 var37 = new class347(field893[--Statics.field67]);
            class281 var38 = client.method3048().method8414(var37.field3715, var37.field3714, var37.field3713);
            if (var38 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var38.method5122();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3048().method8296(field893[--Statics.field67]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3048().method8297();
            return 1;
        } else if (arg0 == 6626) {
            client.method3048().method8298(field893[--Statics.field67]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3048().method8299();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field893[--Statics.field67] == 1;
            client.method3048().method8333(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field893[--Statics.field67];
            client.method3048().method8301(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field893[--Statics.field67];
            client.method3048().method8317(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3048().method8323();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field893[--Statics.field67] == 1;
            client.method3048().method8280(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field67 -= 2;
            int var43 = field893[Statics.field67];
            boolean var44 = field893[Statics.field67 + 1] == 1;
            client.method3048().method8305(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field67 -= 2;
            int var45 = field893[Statics.field67];
            boolean var46 = field893[Statics.field67 + 1] == 1;
            client.method3048().method8306(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field893[++Statics.field67 - 1] = client.method3048().method8307() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.method3048().method8308(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field893[--Statics.field67];
            field893[++Statics.field67 - 1] = client.method3048().method8309(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field67 -= 2;
            int var49 = field893[Statics.field67];
            class347 var50 = new class347(field893[Statics.field67 + 1]);
            class347 var51 = client.method3048().method8256(var49, var50);
            if (var51 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var51.method5886();
            }
            return 1;
        } else if (arg0 == 6639) {
            class299 var52 = client.method3048().method8314();
            if (var52 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var52.method5061();
                field893[++Statics.field67 - 1] = var52.field3231.method5886();
            }
            return 1;
        } else if (arg0 == 6640) {
            class299 var53 = client.method3048().method8325();
            if (var53 == null) {
                field893[++Statics.field67 - 1] = -1;
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var53.method5061();
                field893[++Statics.field67 - 1] = var53.field3231.method5886();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field893[--Statics.field67];
            class199 var55 = class199.method3551(var54);
            if (var55.field2021 == null) {
                field886[++Statics.field1822 - 1] = "";
            } else {
                field886[++Statics.field1822 - 1] = var55.field2021;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field893[--Statics.field67];
            class199 var57 = class199.method3551(var56);
            field893[++Statics.field67 - 1] = var57.field2023;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field893[--Statics.field67];
            class199 var59 = class199.method3551(var58);
            if (var59 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var59.field2038;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field893[--Statics.field67];
            class199 var61 = class199.method3551(var60);
            if (var61 == null) {
                field893[++Statics.field67 - 1] = -1;
            } else {
                field893[++Statics.field67 - 1] = var61.field2019;
            }
            return 1;
        } else if (arg0 == 6697) {
            field893[++Statics.field67 - 1] = Statics.field1485.field3251;
            return 1;
        } else if (arg0 == 6698) {
            field893[++Statics.field67 - 1] = Statics.field1485.field3249.method5886();
            return 1;
        } else if (arg0 == 6699) {
            field893[++Statics.field67 - 1] = Statics.field1485.field3250.method5886();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.bq(ILdm;ZB)I")
    public static int method12(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field893[--Statics.field67];
            class210 var4 = class210.method2967(var3);
            field886[++Statics.field1822 - 1] = var4 == null ? "" : var4.field2138;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field67 -= 2;
            class210 var5 = class210.method2967(field893[Statics.field67]);
            int var6 = field893[Statics.field67 + 1];
            field893[++Statics.field67 - 1] = var5.method3671(var6);
            field893[++Statics.field67 - 1] = var5.method3673(var6);
            return 1;
        } else if (arg0 == 6765) {
            class210 var7 = class210.method2967(field893[--Statics.field67]);
            field893[++Statics.field67 - 1] = var7 == null ? 0 : var7.field2120;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.bj(ILdm;ZB)I")
    public static int method2968(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field893[--Statics.field67];
            class224 var4 = class224.method3868(var3);
            field886[++Statics.field1822 - 1] = var4 == null ? "" : var4.field2286;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.bc(ILdm;ZB)I")
    public static int method2886(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ny.bz(ILdm;ZB)I")
    public static int method5929(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ow.ba(ILdm;ZI)I")
    public static int method6505(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field893[++Statics.field67 - 1] = client.method3077() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("of.bb(ILdm;ZB)I")
    public static int method6475(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field893[--Statics.field67] == 1;
            client.method295(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("io.by(ILdm;ZB)I")
    public static int method3656(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field893[--Statics.field67];
            Object var45 = method5385(var44);
            int var46 = field893[--Statics.field67];
            class538 var47 = client.method696(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class540.method3097(var46);
            Statics.field3204 = var47.method8693(var45, var48);
            if (Statics.field3204 == null) {
                client.field823 = -1;
                Statics.field3211 = null;
                if (arg0 == 7500) {
                    field893[++Statics.field67 - 1] = 0;
                }
            } else {
                client.field823 = class540.method6440(var46);
                Statics.field3211 = Statics.field3204.iterator();
                if (arg0 == 7500) {
                    field893[++Statics.field67 - 1] = Statics.field3204.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field3211 != null && Statics.field3211.hasNext()) {
                field893[++Statics.field67 - 1] = (Integer) Statics.field3211.next();
            } else {
                field893[++Statics.field67 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field67 -= 3;
            int var3 = field893[Statics.field67];
            int var4 = field893[Statics.field67 + 1];
            int var5 = field893[Statics.field67 + 2];
            int var6 = class540.method6440(var4);
            int var7 = class540.method2960(var4);
            int var8 = class540.method3097(var4);
            class539 var9 = class539.method7588(var3);
            class537 var10 = class537.method3371(var6);
            int[] var11 = var10.field5279[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8698(var7);
            if (var14 == null && var10.field5277 != null) {
                var14 = var10.field5277[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class534 var17 = class532.method5060(var16);
                    if (class534.field5268 == var17) {
                        field886[++Statics.field1822 - 1] = "";
                    } else {
                        field893[++Statics.field67 - 1] = class532.method16(var16);
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
                class534 var21 = class532.method5060(var11[var19]);
                if (class534.field5268 == var21) {
                    field886[++Statics.field1822 - 1] = (String) var14[var20];
                } else {
                    field893[++Statics.field67 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field67 -= 2;
            int var22 = field893[Statics.field67];
            int var23 = field893[Statics.field67 + 1];
            int var24 = 0;
            int var25 = class540.method6440(var23);
            int var26 = class540.method2960(var23);
            class539 var27 = class539.method7588(var22);
            class537 var28 = class537.method3371(var25);
            int[] var29 = var28.field5279[var26];
            Object[] var30 = var27.method8698(var26);
            if (var30 == null && var28.field5277 != null) {
                var30 = var28.field5277[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field893[++Statics.field67 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field67--;
            int var41 = field893[Statics.field67];
            class538 var42 = client.method3596(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field3204 = var42.method8693(0, 0);
            int var43 = 0;
            if (Statics.field3204 != null) {
                client.field823 = var41;
                Statics.field3211 = Statics.field3204.iterator();
                var43 = Statics.field3204.size();
            }
            if (arg0 == 7504) {
                field893[++Statics.field67 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field893[--Statics.field67];
            class539 var32 = class539.method7588(var31);
            field893[++Statics.field67 - 1] = var32.field5291;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field893[--Statics.field67];
            int var34 = -1;
            if (Statics.field3204 != null && var33 >= 0 && var33 < Statics.field3204.size()) {
                var34 = (Integer) Statics.field3204.get(var33);
            }
            field893[++Statics.field67 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field893[--Statics.field67];
            Object var36 = method5385(var35);
            int var37 = field893[--Statics.field67];
            class538 var38 = client.method696(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class540.method6440(var37) != client.field823) {
                throw new RuntimeException();
            } else if (Statics.field3204 == null && Statics.field3204.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class540.method3097(var37);
                List var40 = var38.method8693(var36, var39);
                Statics.field3204 = new LinkedList(Statics.field3204);
                if (var40 == null) {
                    Statics.field3204.clear();
                } else {
                    Statics.field3204.retainAll(var40);
                }
                Statics.field3211 = Statics.field3204.iterator();
                if (arg0 == 7507) {
                    field893[++Statics.field67 - 1] = Statics.field3204.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.cw(ILdm;ZI)I")
    public static int method3520(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("qd.ck(ILdm;ZB)I")
    public static int method7086(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field67--;
            int var3 = field893[Statics.field67];
            int var4 = field883[var3];
            class541.method5822(field885[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field67 -= 3;
            int var5 = field893[Statics.field67];
            int var6 = field893[Statics.field67 + 1];
            int var7 = field893[Statics.field67 + 2];
            int var8 = field883[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class447.method7628(field885[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.cn(IB)V")
    public static void method55(int arg0) {
        if (arg0 == -1 || !Statics.field75.method5908(arg0)) {
            return;
        }
        class358[] var1 = Statics.field75.field3722[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class358 var3 = var1[var2];
            if (var3.field3904 != null) {
                class90 var4 = new class90();
                var4.field1095 = var3;
                var4.field1103 = var3.field3904;
                method3056(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("kd.ch(ILnj;ZI)V")
    public static void method4796(int arg0, class347 arg1, boolean arg2) {
        class281 var3 = client.method3048().method8286(arg0);
        int var4 = Statics.field84.field1151;
        int var5 = (Statics.field84.field1215 >> 7) + Statics.field3967.field1338;
        int var6 = (Statics.field84.field1276 >> 7) + Statics.field3967.field1334;
        class347 var7 = new class347(var4, var5, var6);
        client.method3048().method8304(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("ff.cp(Luy;I)Ljava/lang/Object;")
    public static Object method3096(class534 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5266) {
            case 0:
                return field886[--Statics.field1822];
            case 2:
                return field893[--Statics.field67];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("lc.cd(IB)Ljava/lang/Object;")
    public static Object method5385(int arg0) {
        return method3096((class534) class401.method2027(class534.method8663(), arg0));
    }
}
