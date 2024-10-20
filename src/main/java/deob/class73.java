package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cw")
public class class73 {

    @ObfuscatedName("cw.ao")
    public static int[] field852 = new int[5];

    @ObfuscatedName("cw.am")
    public static int[][] field853 = new int[5][5000];

    @ObfuscatedName("cw.ac")
    public static int[] field861 = new int[1000];

    @ObfuscatedName("cw.ad")
    public static String[] field856 = new String[1000];

    @ObfuscatedName("cw.al")
    public static int field849 = 0;

    @ObfuscatedName("cw.aj")
    public static class64[] field868 = new class64[50];

    @ObfuscatedName("cw.ag")
    public static Calendar field865 = Calendar.getInstance();

    @ObfuscatedName("cw.av")
    public static final String[] field860 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cw.ap")
    public static boolean field862 = false;

    @ObfuscatedName("cw.ak")
    public static boolean field858 = false;

    @ObfuscatedName("cw.ai")
    public static ArrayList field863 = new ArrayList();

    @ObfuscatedName("cw.at")
    public static int field864 = 0;

    @ObfuscatedName("cw.bj")
    public static final double field866 = Math.log(2.0D);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qz.ab(Ldc;I)V")
    public static void method7183(class90 arg0) {
        method8669(arg0, 500000, 475000);
    }

    @ObfuscatedName("uy.ay(Ldc;III)V")
    public static void method8669(class90 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1072;
        class81 var5;
        if (class546.method3160(arg0.field1075)) {
            Statics.field2950 = (class307) var3[0];
            class235 var4 = class235.method2700(Statics.field2950.field3234);
            var5 = class81.method1077(arg0.field1075, var4.field2468, var4.field2487);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class81.method2333(var6);
        }
        if (var5 != null) {
            method652(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("bv.an(Ldc;Ldp;III)V")
    public static void method652(class90 arg0, class81 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1072;
        Statics.field855 = 0;
        Statics.field2444 = 0;
        int var5 = -1;
        int[] var6 = arg1.field995;
        int[] var7 = arg1.field984;
        byte var8 = -1;
        field849 = 0;
        field862 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field851 = new int[arg1.field982];
            int var11 = 0;
            Statics.field5291 = new String[arg1.field988];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1066;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1068;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1065 == null ? -1 : arg0.field1065.field3941;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1063;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1065 == null ? -1 : arg0.field1065.field3876;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1070 == null ? -1 : arg0.field1070.field3941;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1070 == null ? -1 : arg0.field1070.field3876;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1071;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1076;
                    }
                    if (var14 == -2147483638) {
                        var14 = arg0.field1069;
                    }
                    Statics.field851[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1073;
                    }
                    Statics.field5291[var12++] = var15;
                }
            }
            field864 = arg0.field1067;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field984[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = Statics.method5206(var59, arg1, var46);
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
                    field861[++Statics.field855 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field861[++Statics.field855 - 1] = class349.field3702[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class349.field3702[var17] = field861[--Statics.field855];
                    client.method1069(var17);
                } else if (var59 == 3) {
                    field856[++Statics.field2444 - 1] = arg1.field986[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field855 -= 2;
                    if (field861[Statics.field855] != field861[Statics.field855 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field855 -= 2;
                    if (field861[Statics.field855] == field861[Statics.field855 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field855 -= 2;
                    if (field861[Statics.field855] < field861[Statics.field855 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field855 -= 2;
                    if (field861[Statics.field855] > field861[Statics.field855 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field849 == 0) {
                        return;
                    }
                    class64 var19 = field868[--field849];
                    arg1 = var19.field451;
                    var6 = arg1.field995;
                    var7 = arg1.field984;
                    var5 = var19.field446;
                    Statics.field851 = var19.field450;
                    Statics.field5291 = var19.field448;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field861[++Statics.field855 - 1] = class349.method3159(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class349.method2899(var21, field861[--Statics.field855]);
                } else if (var59 == 31) {
                    Statics.field855 -= 2;
                    if (field861[Statics.field855] <= field861[Statics.field855 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field855 -= 2;
                    if (field861[Statics.field855] >= field861[Statics.field855 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field861[++Statics.field855 - 1] = Statics.field851[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field851[var7[var5]] = field861[--Statics.field855];
                } else if (var59 == 35) {
                    field856[++Statics.field2444 - 1] = Statics.field5291[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field5291[var7[var5]] = field856[--Statics.field2444];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field2444 -= var22;
                    String var23 = class417.method672(field856, Statics.field2444, var22);
                    field856[++Statics.field2444 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field855--;
                } else if (var59 == 39) {
                    Statics.field2444--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class81 var25 = class81.method2333(var24);
                    int[] var26 = new int[var25.field982];
                    String[] var27 = new String[var25.field988];
                    for (int var28 = 0; var28 < var25.field989; var28++) {
                        var26[var28] = field861[Statics.field855 - var25.field989 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field983; var29++) {
                        var27[var29] = field856[Statics.field2444 - var25.field983 + var29];
                    }
                    Statics.field855 -= var25.field989;
                    Statics.field2444 -= var25.field983;
                    class64 var30 = new class64();
                    var30.field451 = arg1;
                    var30.field446 = var5;
                    var30.field450 = Statics.field851;
                    var30.field448 = Statics.field5291;
                    field868[++field849 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field995;
                    var7 = var25.field984;
                    var5 = -1;
                    Statics.field851 = var26;
                    Statics.field5291 = var27;
                } else if (var59 == 42) {
                    field861[++Statics.field855 - 1] = Statics.field2734.method2770(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field2734.method2764(var7[var5], field861[--Statics.field855]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field861[--Statics.field855];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field852[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field853[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field861[--Statics.field855];
                    if (var37 < 0 || var37 >= field852[var36]) {
                        throw new RuntimeException();
                    }
                    field861[++Statics.field855 - 1] = field853[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field855 -= 2;
                    int var39 = field861[Statics.field855];
                    if (var39 < 0 || var39 >= field852[var38]) {
                        throw new RuntimeException();
                    }
                    field853[var38][var39] = field861[Statics.field855 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field2734.method2801(var7[var5]);
                    if (var40 == null) {
                        var40 = class380.field4097;
                    }
                    field856[++Statics.field2444 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field2734.method2768(var7[var5], field856[--Statics.field2444]);
                } else if (var59 == 49) {
                    String var41 = Statics.field2734.method2765(var7[var5]);
                    field856[++Statics.field2444 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field2734.method2766(var7[var5], field856[--Statics.field2444]);
                } else if (var59 == 60) {
                    class521 var42 = arg1.field990[var7[var5]];
                    class505 var43 = (class505) var42.method8512((long) field861[--Statics.field855]);
                    if (var43 != null) {
                        var5 += var43.field5073;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field5227.method3220(var7[var5]);
                    if (var44 == null) {
                        field861[++Statics.field855 - 1] = -1;
                    } else {
                        field861[++Statics.field855 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field4935.method8136(var7[var5]);
                    if (var45 == null) {
                        field861[++Statics.field855 - 1] = -1;
                    } else {
                        field861[++Statics.field855 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field5075).append(" ");
            for (int var51 = field849 - 1; var51 >= 0; var51--) {
                var50.append("").append(field868[var51].field451.field5075).append(" ");
            }
            var50.append("").append(var8);
            class575.method2216(var50.toString(), var57);
        } finally {
            while (field863.size() > 0) {
                class106 var54 = (class106) field863.remove(0);
                client.method261(var54.method2711(), var54.method2704(), var54.method2705(), var54.method2706(), "");
            }
            if (field862) {
                field862 = false;
                client.method1090();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class575.method2216("Warning: Script " + arg1.field985 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("eb.ax(ILdp;ZB)I")
    public static int method2732(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field855 -= 3;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            int var5 = field861[Statics.field855 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class361 var6 = Statics.field2667.method5964(var3);
            if (var6.field3936 == null) {
                var6.field3936 = new class361[var5 + 1];
            }
            if (var6.field3936.length <= var5) {
                class361[] var7 = new class361[var5 + 1];
                for (int var8 = 0; var8 < var6.field3936.length; var8++) {
                    var7[var8] = var6.field3936[var8];
                }
                var6.field3936 = var7;
            }
            if (var5 > 0 && var6.field3936[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class361 var9 = new class361();
            var9.field3828 = var4;
            var9.field3823 = var9.field3941 = var6.field3941;
            var9.field3876 = var5;
            var9.field3910 = true;
            if (var4 == 12) {
                var9.method6369();
                var9.method6391().method6107(new class109(var9));
                var9.method6391().method6106(new class110(var9));
            }
            var6.field3936[var5] = var9;
            if (arg2) {
                Statics.field2526 = var9;
            } else {
                Statics.field4708 = var9;
            }
            client.method7116(var6);
            return 1;
        } else if (arg0 == 101) {
            class361 var10 = arg2 ? Statics.field2526 : Statics.field4708;
            class361 var11 = Statics.field2667.method5964(var10.field3941);
            var11.field3936[var10.field3876] = null;
            client.method7116(var11);
            return 1;
        } else if (arg0 == 102) {
            class361 var12 = Statics.field2667.method5964(field861[--Statics.field855]);
            var12.field3936 = null;
            client.method7116(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field855 -= 2;
            int var13 = field861[Statics.field855];
            int var14 = field861[Statics.field855 + 1];
            class361 var15 = Statics.field2667.method5965(var13, var14);
            if (var15 == null || var14 == -1) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
                if (arg2) {
                    Statics.field2526 = var15;
                } else {
                    Statics.field4708 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class361 var16 = Statics.field2667.method5964(field861[--Statics.field855]);
            if (var16 == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
                if (arg2) {
                    Statics.field2526 = var16;
                } else {
                    Statics.field4708 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.ao(ILdp;ZB)I")
    public static int method1131(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class361 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field861[--Statics.field855];
            var4 = Statics.field2667.method5964(var3);
        } else {
            var4 = arg2 ? Statics.field2526 : Statics.field4708;
        }
        if (arg0 == 1000) {
            Statics.field855 -= 4;
            var4.field3813 = field861[Statics.field855];
            var4.field3814 = field861[Statics.field855 + 1];
            var4.field3804 = field861[Statics.field855 + 2];
            var4.field3810 = field861[Statics.field855 + 3];
            client.method7116(var4);
            Statics.field997.method1185(var4);
            if (var3 != -1 && var4.field3828 == 0) {
                client.method3298(Statics.field2667.field3709[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field855 -= 4;
            var4.field3815 = field861[Statics.field855];
            var4.field3868 = field861[Statics.field855 + 1];
            var4.field3811 = field861[Statics.field855 + 2];
            var4.field3932 = field861[Statics.field855 + 3];
            client.method7116(var4);
            Statics.field997.method1185(var4);
            if (var3 != -1 && var4.field3828 == 0) {
                client.method3298(Statics.field2667.field3709[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field861[--Statics.field855] == 1;
            if (var4.field3824 != var5) {
                var4.field3824 = var5;
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3953 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3954 = field861[--Statics.field855] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rn.am(ILdp;ZI)I")
    public static int method7737(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class361 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field861[--Statics.field855];
            var4 = Statics.field2667.method5964(var3);
        } else {
            var4 = arg2 ? Statics.field2526 : Statics.field4708;
        }
        if (arg0 == 1100) {
            Statics.field855 -= 2;
            int var5 = field861[Statics.field855];
            int var6 = field861[Statics.field855 + 1];
            if (var4.field3828 == 12) {
                class359 var7 = var4.method6391();
                if (var7 != null && var7.method6300(var5, var6)) {
                    client.method7116(var4);
                }
            } else {
                var4.field3825 = var5;
                if (var4.field3825 > var4.field3832 - var4.field3819) {
                    var4.field3825 = var4.field3832 - var4.field3819;
                }
                if (var4.field3825 < 0) {
                    var4.field3825 = 0;
                }
                var4.field3826 = var6;
                if (var4.field3826 > var4.field3916 - var4.field3820) {
                    var4.field3826 = var4.field3916 - var4.field3820;
                }
                if (var4.field3826 < 0) {
                    var4.field3826 = 0;
                }
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3829 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3926 = field861[--Statics.field855] == 1;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3835 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3946 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3806 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3896 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3903 = field861[--Statics.field855] == 1;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3848 = 1;
            var4.field3849 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field855 -= 6;
            var4.field3854 = field861[Statics.field855];
            var4.field3871 = field861[Statics.field855 + 1];
            var4.field3856 = field861[Statics.field855 + 2];
            var4.field3857 = field861[Statics.field855 + 3];
            var4.field3841 = field861[Statics.field855 + 4];
            var4.field3859 = field861[Statics.field855 + 5];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field861[--Statics.field855];
            if (var4.field3852 != var8) {
                var4.field3852 = var8;
                var4.field3919 = 0;
                var4.field3899 = 0;
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3863 = field861[--Statics.field855] == 1;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field856[--Statics.field2444];
            if (var4.field3828 == 12) {
                class359 var10 = var4.method6391();
                if (var10 != null && var10.method6263()) {
                    var10.method6062(var9);
                } else {
                    var4.field3867 = var9;
                }
                client.method7116(var4);
            } else if (!var9.equals(var4.field3867)) {
                var4.field3867 = var9;
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3866 = field861[--Statics.field855];
            if (var4.field3828 == 12) {
                class359 var11 = var4.method6391();
                if (var11 != null) {
                    var11.method6076();
                }
            }
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field855 -= 3;
            if (var4.field3828 == 12) {
                class359 var12 = var4.method6391();
                if (var12 != null) {
                    var12.method6070(field861[Statics.field855], field861[Statics.field855 + 1]);
                    var12.method6218(field861[Statics.field855 + 2]);
                }
            } else {
                var4.field3870 = field861[Statics.field855];
                var4.field3861 = field861[Statics.field855 + 1];
                var4.field3869 = field861[Statics.field855 + 2];
            }
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3872 = field861[--Statics.field855] == 1;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3844 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3845 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3817 = field861[--Statics.field855] == 1;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3847 = field861[--Statics.field855] == 1;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field855 -= 2;
            var4.field3832 = field861[Statics.field855];
            var4.field3916 = field861[Statics.field855 + 1];
            client.method7116(var4);
            if (var3 != -1 && var4.field3828 == 0) {
                client.method3298(Statics.field2667.field3709[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2283(var4.field3941, var4.field3876);
            client.field672 = var4;
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3840 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3830 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3836 = field861[--Statics.field855];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field861[--Statics.field855];
            class561 var14 = (class561) class403.method3083(class561.method3300(), var13);
            if (var14 != null) {
                var4.field3834 = var14;
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field861[--Statics.field855] == 1;
            var4.field3838 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field861[--Statics.field855] == 1;
            var4.field3864 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3955 = field856[--Statics.field2444];
            client.method7116(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6440(field856[--Statics.field2444], "", Statics.field96, client.method8494());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field855 -= 2;
            var4.method6395(field861[Statics.field855], field861[Statics.field855 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6454(field856[--Statics.field2444], field861[--Statics.field855]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field855--;
            class353 var17 = var4.method6392();
            if (var17 != null) {
                var17.field3722 = field861[Statics.field855];
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field855--;
            class353 var18 = var4.method6392();
            if (var18 != null) {
                var18.field3721 = field861[Statics.field855];
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field2444--;
            class359 var19 = var4.method6391();
            if (var19 != null) {
                var4.field3885 = field856[Statics.field2444];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field855--;
            class353 var20 = var4.method6392();
            if (var20 != null) {
                var20.field3723 = field861[Statics.field855];
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field855--;
            class359 var21 = var4.method6391();
            if (var21 != null && var21.method6066(field861[Statics.field855])) {
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field855--;
            class359 var22 = var4.method6391();
            if (var22 != null && var22.method6067(field861[Statics.field855])) {
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field855--;
            class359 var23 = var4.method6391();
            if (var23 != null && var23.method6068(field861[Statics.field855])) {
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field861[--Statics.field855] == 1;
            client.field736.method4931();
            class359 var25 = var4.method6391();
            if (var25 != null && var25.method6060(var24)) {
                if (var24) {
                    client.field736.method4917(var4);
                }
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field861[--Statics.field855] == 1;
            if (!var26 && client.field736.method4921() == var4) {
                client.field736.method4931();
                client.method7116(var4);
            }
            class359 var27 = var4.method6391();
            if (var27 != null) {
                var27.method6072(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field855 -= 2;
            class359 var28 = var4.method6391();
            if (var28 != null && var28.method6084(field861[Statics.field855], field861[Statics.field855 + 1])) {
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field855--;
            class359 var29 = var4.method6391();
            if (var29 != null && var29.method6084(field861[Statics.field855], field861[Statics.field855])) {
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field855--;
            class359 var30 = var4.method6391();
            if (var30 != null) {
                var30.method6073(field861[Statics.field855]);
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field855--;
            class359 var31 = var4.method6391();
            if (var31 != null) {
                var31.method6143(field861[Statics.field855]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field855--;
            class359 var32 = var4.method6391();
            if (var32 != null) {
                var32.method6075(field861[Statics.field855]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field855--;
            class359 var33 = var4.method6391();
            if (var33 != null) {
                var33.method6306(field861[Statics.field855]);
                client.method7116(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field855 -= 2;
            class28 var34 = var4.method6393();
            if (var34 != null) {
                var34.method357(field861[Statics.field855], field861[Statics.field855 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field855 -= 2;
            class28 var35 = var4.method6393();
            if (var35 != null) {
                var35.method358((char) field861[Statics.field855], field861[Statics.field855 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6420(field856[--Statics.field2444], Statics.field96);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field2444 -= 3;
            String var36 = field856[Statics.field2444];
            String var37 = field856[Statics.field2444 + 1];
            String var38 = field856[Statics.field2444 + 2];
            long var39 = client.method8494();
            long var41 = client.method8105();
            String var43 = client.method4457().method8244(client.method4457().field5099);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6467(var36, var37, var38, var43, Long.toString(var41), Statics.field96);
            return 1;
        } else if (arg0 != 1152) {
            return 2;
        } else if (var4.field3828 == 11) {
            class211 var44 = var4.method6463();
            boolean var45 = var44 != null && var44.method4152() && Statics.method260().method4255(var44.method4160());
            field861[++Statics.field855 - 1] = var45 ? 1 : 0;
            return 1;
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jx.ac(ILdp;ZB)I")
    public static int method4573(int arg0, class81 arg1, boolean arg2) {
        class361 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field2667.method5964(field861[--Statics.field855]);
        } else {
            var3 = arg2 ? Statics.field2526 : Statics.field4708;
        }
        client.method7116(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field855 -= 2;
            int var9 = field861[Statics.field855];
            int var10 = field861[Statics.field855 + 1];
            var3.field3939 = var9;
            var3.field3940 = var10;
            class262 var11 = class262.method2385(var9);
            var3.field3856 = var11.field2803;
            var3.field3857 = var11.field2809;
            var3.field3841 = var11.field2827;
            var3.field3854 = var11.field2806;
            var3.field3871 = var11.field2807;
            var3.field3859 = var11.field2802;
            if (arg0 == 1205) {
                var3.field3944 = 0;
            } else if (arg0 == 1212 | var11.field2847 == 1) {
                var3.field3944 = 1;
            } else {
                var3.field3944 = 2;
            }
            if (var3.field3809 > 0) {
                var3.field3859 = var3.field3859 * 32 / var3.field3809;
            } else if (var3.field3815 > 0) {
                var3.field3859 = var3.field3859 * 32 / var3.field3815;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3848 = 2;
            var3.field3849 = field861[--Statics.field855];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3848 = 3;
            var3.field3849 = Statics.field2672.field1111.method6005();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field861[--Statics.field855] == 1;
            var3.method6465(Statics.field2672.field1111, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field861[--Statics.field855];
            if (var3.field3862 == null) {
                throw new RuntimeException("");
            }
            var3.field3862.method6010(var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field855 -= 2;
            int var6 = field861[Statics.field855];
            int var7 = field861[Statics.field855 + 1];
            if (var3.field3862 == null) {
                throw new RuntimeException("");
            }
            var3.field3862.method6009(var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field861[--Statics.field855];
            if (var3.field3862 == null) {
                throw new RuntimeException("");
            }
            var3.field3862.method6007(Statics.field2672.field1111.field3745, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ce.ae(ILdp;ZI)I")
    public static int method1157(int arg0, class81 arg1, boolean arg2) {
        boolean var3 = true;
        class361 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field2667.method5964(field861[--Statics.field855]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2526 : Statics.field4708;
        }
        if (arg0 == 1300) {
            int var5 = field861[--Statics.field855] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6492(var5, field856[--Statics.field2444]);
                return 1;
            } else {
                Statics.field2444--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field855 -= 2;
            int var6 = field861[Statics.field855];
            int var7 = field861[Statics.field855 + 1];
            var4.field3920 = Statics.field2667.method5965(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3891 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3889 = field861[--Statics.field855];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3802 = field861[--Statics.field855];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3884 = field856[--Statics.field2444];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3892 = field856[--Statics.field2444];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3797 = null;
            var4.field3874 = (String[][]) null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3951 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field855--;
            return 1;
        } else if (arg0 == 1310) {
            int var8 = field861[--Statics.field855] - 1;
            if (var8 < 0 || var8 > 9 || var4.field3874 == null) {
                return 1;
            } else {
                var4.field3874[var8] = null;
                return 1;
            }
        } else if (arg0 == 1311) {
            int var9 = field861[--Statics.field855] - 1;
            int var10 = field861[--Statics.field855] - 1;
            if (var10 < 0 || var10 > 9 || var9 < 0) {
                throw new RuntimeException();
            }
            var4.method6373(var10, var9, field856[--Statics.field2444]);
            return 1;
        } else if (arg0 == 1312) {
            int var11 = field861[--Statics.field855];
            if (var11 == -1) {
                var4.field3887 = 4;
            } else if (var11 >= 1 && var11 <= 10) {
                var4.field3887 = var11 - 1;
            }
            return 1;
        } else if (arg0 == 1350) {
            byte[] var12 = null;
            byte[] var13 = null;
            if (var3) {
                Statics.field855 -= 10;
                int var14;
                for (var14 = 0; var14 < 10 && field861[Statics.field855 + var14] >= 0; var14 += 2) {
                }
                if (var14 > 0) {
                    var12 = new byte[var14 / 2];
                    var13 = new byte[var14 / 2];
                    for (var14 -= 2; var14 >= 0; var14 -= 2) {
                        var12[var14 / 2] = (byte) field861[Statics.field855 + var14];
                        var13[var14 / 2] = (byte) field861[Statics.field855 + var14 + 1];
                    }
                }
            } else {
                Statics.field855 -= 2;
                var12 = new byte[] { (byte) field861[Statics.field855] };
                var13 = new byte[] { (byte) field861[Statics.field855 + 1] };
            }
            int var15 = field861[--Statics.field855] - 1;
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method8644(var4, var15, var12, var13);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field855 -= 2;
            byte var16 = 10;
            byte[] var17 = new byte[] { (byte) field861[Statics.field855] };
            byte[] var18 = new byte[] { (byte) field861[Statics.field855 + 1] };
            method8644(var4, var16, var17, var18);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field855 -= 3;
            int var19 = field861[Statics.field855] - 1;
            int var20 = field861[Statics.field855 + 1];
            int var21 = field861[Statics.field855 + 2];
            if (var19 < 0 || var19 > 9) {
                throw new RuntimeException();
            }
            method258(var4, var19, var20, var21);
            return 1;
        } else if (arg0 == 1353) {
            byte var22 = 10;
            int var23 = field861[--Statics.field855];
            int var24 = field861[--Statics.field855];
            method258(var4, var22, var23, var24);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field855--;
            int var25 = field861[Statics.field855] - 1;
            if (var25 < 0 || var25 > 9) {
                throw new RuntimeException();
            }
            method2187(var4, var25);
            return 1;
        } else if (arg0 == 1355) {
            byte var26 = 10;
            method2187(var4, var26);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ut.ad(Lnq;I[B[BI)V")
    public static final void method8644(class361 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3880 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3880 = new byte[11][];
            arg0.field3881 = new byte[11][];
            arg0.field3882 = new int[11];
            arg0.field3833 = new int[11];
        }
        arg0.field3880[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3879 = false;
            for (int var4 = 0; var4 < arg0.field3880.length; var4++) {
                if (arg0.field3880[var4] != null) {
                    arg0.field3879 = true;
                    break;
                }
            }
        } else {
            arg0.field3879 = true;
        }
        arg0.field3881[arg1] = arg3;
    }

    @ObfuscatedName("ag.aq(Lnq;IIIB)V")
    public static final void method258(class361 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3882 == null) {
            throw new RuntimeException();
        }
        arg0.field3882[arg1] = arg2;
        arg0.field3833[arg1] = arg3;
    }

    @ObfuscatedName("dv.al(Lnq;II)V")
    public static final void method2187(class361 arg0, int arg1) {
        if (arg0.field3880 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3952 == null) {
            arg0.field3952 = new int[arg0.field3880.length];
        }
        arg0.field3952[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("co.as(ILdp;ZI)I")
    public static int method1139(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = arg2 ? Statics.field2526 : Statics.field4708;
        if (arg0 == 1500) {
            field861[++Statics.field855 - 1] = var3.field3796;
            return 1;
        } else if (arg0 == 1501) {
            field861[++Statics.field855 - 1] = var3.field3818;
            return 1;
        } else if (arg0 == 1502) {
            field861[++Statics.field855 - 1] = var3.field3819;
            return 1;
        } else if (arg0 == 1503) {
            field861[++Statics.field855 - 1] = var3.field3820;
            return 1;
        } else if (arg0 == 1504) {
            field861[++Statics.field855 - 1] = var3.field3824 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field861[++Statics.field855 - 1] = var3.field3823;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rr.aw(ILdp;ZI)I")
    public static int method7903(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = arg2 ? Statics.field2526 : Statics.field4708;
        if (arg0 == 1600) {
            field861[++Statics.field855 - 1] = var3.field3825;
            return 1;
        } else if (arg0 == 1601) {
            field861[++Statics.field855 - 1] = var3.field3826;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3828 == 12) {
                class359 var4 = var3.method6391();
                if (var4 != null) {
                    field856[++Statics.field2444 - 1] = var4.method6132().method7479();
                    return 1;
                }
            }
            field856[++Statics.field2444 - 1] = var3.field3867;
            return 1;
        } else if (arg0 == 1603) {
            field861[++Statics.field855 - 1] = var3.field3832;
            return 1;
        } else if (arg0 == 1604) {
            field861[++Statics.field855 - 1] = var3.field3916;
            return 1;
        } else if (arg0 == 1605) {
            field861[++Statics.field855 - 1] = var3.field3859;
            return 1;
        } else if (arg0 == 1606) {
            field861[++Statics.field855 - 1] = var3.field3856;
            return 1;
        } else if (arg0 == 1607) {
            field861[++Statics.field855 - 1] = var3.field3841;
            return 1;
        } else if (arg0 == 1608) {
            field861[++Statics.field855 - 1] = var3.field3857;
            return 1;
        } else if (arg0 == 1609) {
            field861[++Statics.field855 - 1] = var3.field3835;
            return 1;
        } else if (arg0 == 1610) {
            field861[++Statics.field855 - 1] = var3.field3836;
            return 1;
        } else if (arg0 == 1611) {
            field861[++Statics.field855 - 1] = var3.field3829;
            return 1;
        } else if (arg0 == 1612) {
            field861[++Statics.field855 - 1] = var3.field3830;
            return 1;
        } else if (arg0 == 1613) {
            field861[++Statics.field855 - 1] = var3.field3834.method33();
            return 1;
        } else if (arg0 == 1614) {
            field861[++Statics.field855 - 1] = var3.field3864 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class353 var5 = var3.method6392();
                field861[++Statics.field855 - 1] = var5 == null ? 0 : var5.field3722;
            }
            if (arg0 == 1618) {
                class353 var6 = var3.method6392();
                field861[++Statics.field855 - 1] = var6 == null ? 0 : var6.field3721;
                return 1;
            } else if (arg0 == 1619) {
                class359 var7 = var3.method6391();
                field856[++Statics.field2444 - 1] = var7 == null ? "" : var7.method6244().method7479();
                return 1;
            } else if (arg0 == 1620) {
                class353 var8 = var3.method6392();
                field861[++Statics.field855 - 1] = var8 == null ? 0 : var8.field3723;
                return 1;
            } else if (arg0 == 1621) {
                class359 var9 = var3.method6391();
                field861[++Statics.field855 - 1] = var9 == null ? 0 : var9.method6119();
                return 1;
            } else if (arg0 == 1622) {
                class359 var10 = var3.method6391();
                field861[++Statics.field855 - 1] = var10 == null ? 0 : var10.method6120();
                return 1;
            } else if (arg0 == 1623) {
                class359 var11 = var3.method6391();
                field861[++Statics.field855 - 1] = var11 == null ? 0 : var11.method6121();
                return 1;
            } else if (arg0 == 1624) {
                class359 var12 = var3.method6391();
                field861[++Statics.field855 - 1] = var12 != null && var12.method6111() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class359 var13 = var3.method6391();
                field861[++Statics.field855 - 1] = var13 != null && var13.method6112() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class359 var14 = var3.method6391();
                field856[++Statics.field2444 - 1] = var14 == null ? "" : var14.method6301().method7633();
                return 1;
            } else if (arg0 == 1627) {
                class359 var15 = var3.method6391();
                int var16 = var15 == null ? 0 : var15.method6115();
                int var17 = var15 == null ? 0 : var15.method6114();
                field861[++Statics.field855 - 1] = Math.min(var16, var17);
                field861[++Statics.field855 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class359 var18 = var3.method6391();
                field861[++Statics.field855 - 1] = var18 == null ? 0 : var18.method6114();
                return 1;
            } else if (arg0 == 1629) {
                class359 var19 = var3.method6391();
                field861[++Statics.field855 - 1] = var19 == null ? 0 : var19.method6098();
                return 1;
            } else if (arg0 == 1630) {
                class359 var20 = var3.method6391();
                field861[++Statics.field855 - 1] = var20 == null ? 0 : var20.method6122();
                return 1;
            } else if (arg0 == 1631) {
                class359 var21 = var3.method6391();
                field861[++Statics.field855 - 1] = var21 == null ? 0 : var21.method6124();
                return 1;
            } else if (arg0 == 1632) {
                class359 var22 = var3.method6391();
                field861[++Statics.field855 - 1] = var22 == null ? 0 : var22.method6125();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6393();
                field861[Statics.field855 - 1] = var23 == null ? 0 : var23.method359(field861[Statics.field855 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6393();
                field861[Statics.field855 - 1] = var24 == null ? 0 : var24.method367((char) field861[Statics.field855 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("bo.af(ILdp;ZI)I")
    public static int method416(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = arg2 ? Statics.field2526 : Statics.field4708;
        if (arg0 == 1700) {
            field861[++Statics.field855 - 1] = var3.field3939;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3939 == -1) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var3.field3940;
            }
            return 1;
        } else if (arg0 == 1702) {
            field861[++Statics.field855 - 1] = var3.field3876;
            return 1;
        } else if (arg0 == 1707) {
            field861[++Statics.field855 - 1] = var3.method6380() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method8082(var3);
        } else if (arg0 == 1709) {
            return method4654(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("sx.aa(Lnq;I)I")
    public static int method8082(class361 arg0) {
        if (arg0.field3828 == 11) {
            String var1 = field856[--Statics.field2444];
            field861[++Statics.field855 - 1] = arg0.method6415(var1);
            return 1;
        } else {
            Statics.field2444--;
            field861[++Statics.field855 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("jf.ah(Lnq;I)I")
    public static int method4654(class361 arg0) {
        if (arg0.field3828 == 11) {
            String var1 = field856[--Statics.field2444];
            field856[++Statics.field2444 - 1] = arg0.method6355(var1);
            return 1;
        } else {
            field856[Statics.field2444 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("ci.ag(ILdp;ZI)I")
    public static int method1108(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = arg2 ? Statics.field2526 : Statics.field4708;
        if (arg0 == 1800) {
            field861[++Statics.field855 - 1] = Statics.method4373(client.method5918(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field861[--Statics.field855];
            int var5 = var4 - 1;
            if (var3.field3797 == null || var5 >= var3.field3797.length || var3.field3797[var5] == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var3.field3797[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3884 == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var3.field3884;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nt.av(ILdp;ZI)I")
    public static int method6048(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field864 >= 10) {
                throw new RuntimeException();
            }
            class361 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field2667.method5964(field861[--Statics.field855]);
            } else {
                var10 = arg2 ? Statics.field2526 : Statics.field4708;
            }
            if (var10.field3927 == null) {
                return 0;
            }
            class90 var11 = new class90();
            var11.field1065 = var10;
            var11.field1072 = var10.field3927;
            var11.field1067 = field864 + 1;
            client.field621.method6892(var11);
            return 1;
        } else if (arg0 == 1928) {
            class361 var3 = arg2 ? Statics.field2526 : Statics.field4708;
            int var4 = field861[--Statics.field855];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class106 var5 = new class106(var4, var3.field3941, var3.field3876, var3.field3939);
            field863.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field855 -= 3;
            int var6 = field861[Statics.field855];
            int var7 = field861[Statics.field855 + 1];
            int var8 = field861[Statics.field855 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class106 var9 = new class106(var8, var6, var7, Statics.field2667.method5964(var6).field3939);
            field863.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("uh.ar(ILdp;ZI)I")
    public static int method8564(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = Statics.field2667.method5964(field861[--Statics.field855]);
        if (arg0 == 2500) {
            field861[++Statics.field855 - 1] = var3.field3796;
            return 1;
        } else if (arg0 == 2501) {
            field861[++Statics.field855 - 1] = var3.field3818;
            return 1;
        } else if (arg0 == 2502) {
            field861[++Statics.field855 - 1] = var3.field3819;
            return 1;
        } else if (arg0 == 2503) {
            field861[++Statics.field855 - 1] = var3.field3820;
            return 1;
        } else if (arg0 == 2504) {
            field861[++Statics.field855 - 1] = var3.field3824 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field861[++Statics.field855 - 1] = var3.field3823;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.ap(ILdp;ZI)I")
    public static int method4127(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = Statics.field2667.method5964(field861[--Statics.field855]);
        if (arg0 == 2600) {
            field861[++Statics.field855 - 1] = var3.field3825;
            return 1;
        } else if (arg0 == 2601) {
            field861[++Statics.field855 - 1] = var3.field3826;
            return 1;
        } else if (arg0 == 2602) {
            field856[++Statics.field2444 - 1] = var3.field3867;
            return 1;
        } else if (arg0 == 2603) {
            field861[++Statics.field855 - 1] = var3.field3832;
            return 1;
        } else if (arg0 == 2604) {
            field861[++Statics.field855 - 1] = var3.field3916;
            return 1;
        } else if (arg0 == 2605) {
            field861[++Statics.field855 - 1] = var3.field3859;
            return 1;
        } else if (arg0 == 2606) {
            field861[++Statics.field855 - 1] = var3.field3856;
            return 1;
        } else if (arg0 == 2607) {
            field861[++Statics.field855 - 1] = var3.field3841;
            return 1;
        } else if (arg0 == 2608) {
            field861[++Statics.field855 - 1] = var3.field3857;
            return 1;
        } else if (arg0 == 2609) {
            field861[++Statics.field855 - 1] = var3.field3835;
            return 1;
        } else if (arg0 == 2610) {
            field861[++Statics.field855 - 1] = var3.field3836;
            return 1;
        } else if (arg0 == 2611) {
            field861[++Statics.field855 - 1] = var3.field3829;
            return 1;
        } else if (arg0 == 2612) {
            field861[++Statics.field855 - 1] = var3.field3830;
            return 1;
        } else if (arg0 == 2613) {
            field861[++Statics.field855 - 1] = var3.field3834.method33();
            return 1;
        } else if (arg0 == 2614) {
            field861[++Statics.field855 - 1] = var3.field3864 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class353 var4 = var3.method6392();
                field861[++Statics.field855 - 1] = var4 == null ? 0 : var4.field3722;
            }
            if (arg0 == 2618) {
                class353 var5 = var3.method6392();
                field861[++Statics.field855 - 1] = var5 == null ? 0 : var5.field3721;
                return 1;
            } else if (arg0 == 2619) {
                class359 var6 = var3.method6391();
                field856[++Statics.field2444 - 1] = var6 == null ? "" : var6.method6244().method7479();
                return 1;
            } else if (arg0 == 2620) {
                class353 var7 = var3.method6392();
                field861[++Statics.field855 - 1] = var7 == null ? 0 : var7.field3723;
                return 1;
            } else if (arg0 == 2621) {
                class359 var8 = var3.method6391();
                field861[++Statics.field855 - 1] = var8 == null ? 0 : var8.method6119();
                return 1;
            } else if (arg0 == 2622) {
                class359 var9 = var3.method6391();
                field861[++Statics.field855 - 1] = var9 == null ? 0 : var9.method6120();
                return 1;
            } else if (arg0 == 2623) {
                class359 var10 = var3.method6391();
                field861[++Statics.field855 - 1] = var10 == null ? 0 : var10.method6121();
                return 1;
            } else if (arg0 == 2624) {
                class359 var11 = var3.method6391();
                field861[++Statics.field855 - 1] = var11 != null && var11.method6111() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class359 var12 = var3.method6391();
                field861[++Statics.field855 - 1] = var12 != null && var12.method6112() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class359 var13 = var3.method6391();
                field856[++Statics.field2444 - 1] = var13 == null ? "" : var13.method6301().method7633();
                return 1;
            } else if (arg0 == 2627) {
                class359 var14 = var3.method6391();
                int var15 = var14 == null ? 0 : var14.method6115();
                int var16 = var14 == null ? 0 : var14.method6114();
                field861[++Statics.field855 - 1] = Math.min(var15, var16);
                field861[++Statics.field855 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class359 var17 = var3.method6391();
                field861[++Statics.field855 - 1] = var17 == null ? 0 : var17.method6114();
                return 1;
            } else if (arg0 == 2629) {
                class359 var18 = var3.method6391();
                field861[++Statics.field855 - 1] = var18 == null ? 0 : var18.method6098();
                return 1;
            } else if (arg0 == 2630) {
                class359 var19 = var3.method6391();
                field861[++Statics.field855 - 1] = var19 == null ? 0 : var19.method6122();
                return 1;
            } else if (arg0 == 2631) {
                class359 var20 = var3.method6391();
                field861[++Statics.field855 - 1] = var20 == null ? 0 : var20.method6124();
                return 1;
            } else if (arg0 == 2632) {
                class359 var21 = var3.method6391();
                field861[++Statics.field855 - 1] = var21 == null ? 0 : var21.method6125();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6393();
                field861[Statics.field855 - 1] = var22 == null ? 0 : var22.method359(field861[Statics.field855 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6393();
                field861[Statics.field855 - 1] = var23 == null ? 0 : var23.method367((char) field861[Statics.field855 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ba.ak(ILdp;ZS)I")
    public static int method794(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class361 var3 = Statics.field2667.method5964(field861[--Statics.field855]);
            field861[++Statics.field855 - 1] = var3.field3939;
            return 1;
        } else if (arg0 == 2701) {
            class361 var4 = Statics.field2667.method5964(field861[--Statics.field855]);
            if (var4.field3939 == -1) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var4.field3940;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field861[--Statics.field855];
            class89 var6 = (class89) client.field762.method8544((long) var5);
            if (var6 == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field861[++Statics.field855 - 1] = client.field667;
            return 1;
        } else if (arg0 == 2707) {
            class361 var7 = Statics.field2667.method5964(field861[--Statics.field855]);
            field861[++Statics.field855 - 1] = var7.method6380() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class361 var8 = Statics.field2667.method5964(field861[--Statics.field855]);
            return method8082(var8);
        } else if (arg0 == 2709) {
            class361 var9 = Statics.field2667.method5964(field861[--Statics.field855]);
            return method4654(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lg.ai(ILdp;ZB)I")
    public static int method5496(int arg0, class81 arg1, boolean arg2) {
        class361 var3 = Statics.field2667.method5964(field861[--Statics.field855]);
        if (arg0 == 2800) {
            field861[++Statics.field855 - 1] = Statics.method4373(client.method5918(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field861[--Statics.field855];
            int var5 = var4 - 1;
            if (var3.field3797 == null || var5 >= var3.field3797.length || var3.field3797[var5] == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var3.field3797[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3884 == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var3.field3884;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ew.at(ILdp;ZI)I")
    public static int method2943(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field856[--Statics.field2444];
            class114.method4997(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field855 -= 2;
            client.method2176(Statics.field2672, field861[Statics.field855], field861[Statics.field855 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field858) {
                field862 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field856[--Statics.field2444];
            int var5 = 0;
            if (class417.method3101(var4)) {
                var5 = class417.method1138(var4);
            }
            class324 var6 = class324.method4244(class322.field3324, client.field569.field1458);
            var6.field3379.method9045(var5);
            client.field569.method2829(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field856[--Statics.field2444];
            class324 var8 = class324.method4244(class322.field3317, client.field569.field1458);
            var8.field3379.method8781(var7.length() + 1);
            var8.field3379.method8869(var7);
            client.field569.method2829(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field856[--Statics.field2444];
            class324 var10 = class324.method4244(class322.field3339, client.field569.field1458);
            var10.field3379.method8781(var9.length() + 1);
            var10.field3379.method8869(var9);
            client.field569.method2829(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field861[--Statics.field855];
            String var12 = field856[--Statics.field2444];
            client.method5091(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field855 -= 3;
            int var13 = field861[Statics.field855];
            int var14 = field861[Statics.field855 + 1];
            int var15 = field861[Statics.field855 + 2];
            class361 var16 = Statics.field2667.method5964(var15);
            client.method4998(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field855 -= 2;
            int var17 = field861[Statics.field855];
            int var18 = field861[Statics.field855 + 1];
            class361 var19 = arg2 ? Statics.field2526 : Statics.field4708;
            client.method4998(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field4709 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field861[++Statics.field855 - 1] = Statics.field1385.method2502() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1385.method2501(field861[--Statics.field855] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field856[--Statics.field2444];
            boolean var21 = field861[--Statics.field855] == 1;
            class32.method4914(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field861[--Statics.field855];
            class324 var23 = class324.method4244(class322.field3263, client.field569.field1458);
            var23.field3379.method8782(var22);
            client.field569.method2829(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field861[--Statics.field855];
            Statics.field2444 -= 2;
            String var25 = field856[Statics.field2444];
            String var26 = field856[Statics.field2444 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class324 var27 = class324.method4244(class322.field3316, client.field569.field1458);
                var27.field3379.method8782(1 + class549.method8571(var25) + class549.method8571(var26));
                var27.field3379.method8869(var25);
                var27.field3379.method8869(var26);
                var27.field3379.method8966(var24);
                client.field569.method2829(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field855--;
            return 1;
        } else if (arg0 == 3118) {
            client.field668 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field577 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field861[--Statics.field855] == 1) {
                client.field637 |= 0x1;
            } else {
                client.field637 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field861[--Statics.field855] == 1) {
                client.field637 |= 0x2;
            } else {
                client.field637 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field861[--Statics.field855] == 1) {
                client.field637 |= 0x4;
            } else {
                client.field637 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field861[--Statics.field855] == 1) {
                client.field637 |= 0x8;
            } else {
                client.field637 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field637 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field627 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field629 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method5456(field861[--Statics.field855] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field861[++Statics.field855 - 1] = client.method2343() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field855 -= 2;
            client.field602 = field861[Statics.field855];
            client.field603 = field861[Statics.field855 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field855 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field855--;
            return 1;
        } else if (arg0 == 3132) {
            field861[++Statics.field855 - 1] = Statics.field1345;
            field861[++Statics.field855 - 1] = Statics.field467;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field855--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field855 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field669 = 3;
            client.field670 = field861[--Statics.field855];
            return 1;
        } else if (arg0 == 3137) {
            client.field669 = 2;
            client.field670 = field861[--Statics.field855];
            return 1;
        } else if (arg0 == 3138) {
            client.field669 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field669 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field669 = 3;
            client.field670 = arg2 ? Statics.field2526.field3941 : Statics.field4708.field3941;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field861[--Statics.field855] == 1;
            Statics.field1385.method2503(var28);
            return 1;
        } else if (arg0 == 3142) {
            field861[++Statics.field855 - 1] = Statics.field1385.method2504() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field861[--Statics.field855] == 1;
            client.field560 = var29;
            if (!var29) {
                Statics.field1385.method2498("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field861[++Statics.field855 - 1] = client.field560 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field861[--Statics.field855] == 1;
            Statics.field1385.method2505(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field861[++Statics.field855 - 1] = Statics.field1385.method2506() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field861[++Statics.field855 - 1] = class78.field913;
            return 1;
        } else if (arg0 == 3154) {
            field861[++Statics.field855 - 1] = client.method5468();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field2444--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field855 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field855--;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field855--;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field2444--;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field855--;
            field856[++Statics.field2444 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field855--;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field855 -= 2;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field855 -= 2;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field855 -= 2;
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            field856[++Statics.field2444 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field855--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field855--;
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field855--;
            return 1;
        } else if (arg0 == 3175) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field2444--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field2444--;
            return 1;
        } else if (arg0 == 3181) {
            client.method7816(field861[--Statics.field855]);
            return 1;
        } else if (arg0 == 3182) {
            field861[++Statics.field855 - 1] = client.method3106();
            return 1;
        } else if (arg0 == 3185) {
            int var31 = field861[--Statics.field855];
            Statics.field1385.method2530(var31);
            return 1;
        } else if (arg0 == 3186) {
            int var32 = Statics.field1385.method2604();
            field861[++Statics.field855 - 1] = var32;
            return 1;
        } else if (arg0 == 3189) {
            int var33 = field861[--Statics.field855];
            client.method5478(var33);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kb.az(ILdp;ZI)I")
    public static int method5004(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field855 -= 3;
            client.method8117(field861[Statics.field855], field861[Statics.field855 + 1], field861[Statics.field855 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field855 -= 5;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            int var5 = field861[Statics.field855 + 2];
            int var6 = field861[Statics.field855 + 3];
            int var7 = field861[Statics.field855 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method3330(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field855 -= 2;
            client.method2311(field861[Statics.field855], field861[Statics.field855 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class93 var50 = class93.field1106;
            class92 var51 = class92.field1098;
            int var52 = field861[--Statics.field855];
            if (arg0 == 3212) {
                int var53 = field861[--Statics.field855];
                var50 = (class93) class403.method3083(class93.method8186(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field861[--Statics.field855];
                var51 = (class92) class403.method3083(Statics.method5125(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field861[--Statics.field855];
                var50 = (class93) class403.method3083(class93.method8186(), var55);
                if (var50 == null) {
                    var51 = (class92) class403.method3083(Statics.method5125(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class93.field1104;
            } else if (arg0 == 3203) {
                var51 = class92.field1087;
            } else if (arg0 == 3205) {
                var51 = class92.field1088;
            } else if (arg0 == 3207) {
                var51 = class92.field1089;
            }
            if (class92.field1098 == var51) {
                switch(var50.field1107) {
                    case 1:
                        Statics.field1385.method2503(var52 == 1);
                        break;
                    case 2:
                        Statics.field1385.method2505(var52 == 1);
                        break;
                    case 3:
                        Statics.field1385.method2507(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field1385.method2510(var52);
                        break;
                    case 5:
                        client.method7816(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1093) {
                    case 1:
                        Statics.field1385.method2501(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method5008(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method3892(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method8734(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class93 var38 = class93.field1106;
            class92 var39 = class92.field1098;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field861[--Statics.field855];
                var38 = (class93) class403.method3083(class93.method8186(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field861[--Statics.field855];
                var39 = (class92) class403.method3083(Statics.method5125(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field861[--Statics.field855];
                var38 = (class93) class403.method3083(class93.method8186(), var43);
                if (var38 == null) {
                    var39 = (class92) class403.method3083(Statics.method5125(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class93.field1104;
            } else if (arg0 == 3204) {
                var39 = class92.field1087;
            } else if (arg0 == 3206) {
                var39 = class92.field1088;
            } else if (arg0 == 3208) {
                var39 = class92.field1089;
            }
            int var45;
            if (class92.field1098 == var39) {
                switch(var38.field1107) {
                    case 1:
                        var45 = Statics.field1385.method2504() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field1385.method2506() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field1385.method2520() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field1385.method2610();
                        break;
                    case 5:
                        var45 = client.method3106();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1093) {
                    case 1:
                        var45 = Statics.field1385.method2502() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field1385.method2515();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field1385.method2517();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field1385.method2601();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field861[++Statics.field855 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field861[--Statics.field855];
            int var10 = 0;
            class93 var11 = (class93) class403.method3083(class93.method8186(), var9);
            if (var11 != null) {
                var10 = class93.field1106 == var11 ? 0 : 1;
            }
            field861[++Statics.field855 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field861[--Statics.field855];
            int var13 = 0;
            class92 var14 = (class92) class403.method3083(Statics.method5125(), var12);
            if (var14 != null) {
                var13 = class92.field1098 == var14 ? 0 : 1;
            }
            field861[++Statics.field855 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class93 var28 = class93.field1106;
            class92 var29 = class92.field1098;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field861[--Statics.field855];
                var28 = (class93) class403.method3083(class93.method8186(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field861[--Statics.field855];
                var29 = (class92) class403.method3083(Statics.method5125(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class92.field1098 == var29) {
                switch(var28.field1107) {
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
                switch(var29.field1093) {
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
            field861[++Statics.field855 - 1] = var35;
            field861[++Statics.field855 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field855 -= 2;
            int var15 = field861[Statics.field855];
            int var16 = field861[Statics.field855 + 1];
            Statics.method2347(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field855 -= 6;
            int var17 = field861[Statics.field855];
            int var18 = field861[Statics.field855 + 1];
            int var19 = field861[Statics.field855 + 2];
            int var20 = field861[Statics.field855 + 3];
            int var21 = field861[Statics.field855 + 4];
            int var22 = field861[Statics.field855 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method3330(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field855 -= 4;
            int var24 = field861[Statics.field855];
            int var25 = field861[Statics.field855 + 1];
            int var26 = field861[Statics.field855 + 2];
            int var27 = field861[Statics.field855 + 3];
            class333.method5557(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.bg(ILdp;ZI)I")
    public static int method2729(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field861[++Statics.field855 - 1] = client.field519;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field855 -= 2;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = class87.method5419(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field855 -= 2;
            int var5 = field861[Statics.field855];
            int var6 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = class87.method3164(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field855 -= 2;
            int var7 = field861[Statics.field855];
            int var8 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = Statics.method3335(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class228.method7337(var9).field2437;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field578[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field646[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field647[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field4799.field1308;
            int var14 = (Statics.field2672.field1249 >> 7) + Statics.field4799.field1311;
            int var15 = (Statics.field2672.field1180 >> 7) + Statics.field4799.field1319;
            field861[++Statics.field855 - 1] = class350.method5926(var13, var14, var15);
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = Statics.method5928(var16);
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class350.method5927(var17);
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class350.method5929(var18);
            return 1;
        } else if (arg0 == 3312) {
            field861[++Statics.field855 - 1] = client.field601 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field855 -= 2;
            int var19 = field861[Statics.field855] + 32768;
            int var20 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = class87.method5419(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field855 -= 2;
            int var21 = field861[Statics.field855] + 32768;
            int var22 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = class87.method3164(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field855 -= 2;
            int var23 = field861[Statics.field855] + 32768;
            int var24 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = Statics.method3335(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field675 >= 2) {
                field861[++Statics.field855 - 1] = client.field675;
            } else {
                field861[++Statics.field855 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field861[++Statics.field855 - 1] = client.field526;
            return 1;
        } else if (arg0 == 3318) {
            field861[++Statics.field855 - 1] = client.field798;
            return 1;
        } else if (arg0 == 3321) {
            field861[++Statics.field855 - 1] = client.field680 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field861[++Statics.field855 - 1] = client.field674;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field593) {
                field861[++Statics.field855 - 1] = 1;
            } else {
                field861[++Statics.field855 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field861[++Statics.field855 - 1] = client.field719;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field855 -= 4;
            int var25 = field861[Statics.field855];
            int var26 = field861[Statics.field855 + 1];
            int var27 = field861[Statics.field855 + 2];
            int var28 = field861[Statics.field855 + 3];
            int var29 = class350.method5926(var27, var26, var28);
            field861[++Statics.field855 - 1] = var25 + var29;
            return 1;
        } else if (arg0 == 3326) {
            field861[++Statics.field855 - 1] = client.field522;
            return 1;
        } else if (arg0 == 3327) {
            field861[++Statics.field855 - 1] = client.field663;
            return 1;
        } else if (arg0 == 3331) {
            field861[++Statics.field855 - 1] = client.field680;
            return 1;
        } else if (arg0 == 3332) {
            int var30 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field648[var30];
            return 1;
        } else if (arg0 == 3333) {
            field856[++Statics.field2444 - 1] = client.field634;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gh.bz(ILdp;ZI)I")
    public static int method3303(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field855 -= 2;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            class241 var5 = class241.method2944(var3);
            if (var5.field2539 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2538; var6++) {
                if (var5.field2533[var6] == var4) {
                    field856[++Statics.field2444 - 1] = var5.field2541[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field856[++Statics.field2444 - 1] = var5.field2536;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field855 -= 4;
            int var7 = field861[Statics.field855];
            int var8 = field861[Statics.field855 + 1];
            int var9 = field861[Statics.field855 + 2];
            int var10 = field861[Statics.field855 + 3];
            class241 var11 = class241.method2944(var9);
            if (var11.field2534 != var7 || var11.field2539 != var8) {
                if (var8 == 115) {
                    field856[++Statics.field2444 - 1] = class380.field4097;
                } else {
                    field861[++Statics.field855 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2538; var12++) {
                if (var11.field2533[var12] == var10) {
                    if (var8 == 115) {
                        field856[++Statics.field2444 - 1] = var11.field2541[var12];
                    } else {
                        field861[++Statics.field855 - 1] = var11.field2535[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field856[++Statics.field2444 - 1] = var11.field2536;
                } else {
                    field861[++Statics.field855 - 1] = var11.field2537;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field861[--Statics.field855];
            class241 var14 = class241.method2944(var13);
            field861[++Statics.field855 - 1] = var14.method4496();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.bj(ILdp;ZI)I")
    public static int method4708(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field748.method4940(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field748.method4939(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field748.method4946(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.bc(ILdp;ZI)I")
    public static int method990(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field3011.field827 == 0) {
                field861[++Statics.field855 - 1] = -2;
            } else if (Statics.field3011.field827 == 1) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = Statics.field3011.field826.method8008();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field861[--Statics.field855];
            if (Statics.field3011.method1854() && var3 >= 0 && var3 < Statics.field3011.field826.method8008()) {
                class469 var4 = (class469) Statics.field3011.field826.method7964(var3);
                field856[++Statics.field2444 - 1] = var4.method7934();
                field856[++Statics.field2444 - 1] = var4.method7935();
            } else {
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field861[--Statics.field855];
            if (Statics.field3011.method1854() && var5 >= 0 && var5 < Statics.field3011.field826.method8008()) {
                field861[++Statics.field855 - 1] = ((class476) Statics.field3011.field826.method7964(var5)).field4938;
            } else {
                field861[++Statics.field855 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field861[--Statics.field855];
            if (Statics.field3011.method1854() && var6 >= 0 && var6 < Statics.field3011.field826.method8008()) {
                field861[++Statics.field855 - 1] = ((class476) Statics.field3011.field826.method7964(var6)).field4936;
            } else {
                field861[++Statics.field855 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field856[--Statics.field2444];
            int var8 = field861[--Statics.field855];
            class71.method2964(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field856[--Statics.field2444];
            Statics.field3011.method1861(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field856[--Statics.field2444];
            Statics.field3011.method1865(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field856[--Statics.field2444];
            Statics.field3011.method1879(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field856[--Statics.field2444];
            boolean var13 = true;
            Statics.field3011.method1896(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field856[--Statics.field2444];
            String var15 = client.method1092(var14);
            field861[++Statics.field855 - 1] = Statics.field3011.method1859(new class572(var15, Statics.field848), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field70 == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = Statics.field70.field4905;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field70 == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = Statics.field70.method8008();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field861[--Statics.field855];
            if (Statics.field70 == null || var16 >= Statics.field70.method8008()) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = Statics.field70.method7964(var16).method7944().method9470();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field861[--Statics.field855];
            if (Statics.field70 == null || var17 >= Statics.field70.method8008()) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = ((class476) Statics.field70.method7964(var17)).method8045();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field861[--Statics.field855];
            if (Statics.field70 == null || var18 >= Statics.field70.method8008()) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = ((class476) Statics.field70.method7964(var18)).field4936;
            }
            return 1;
        } else if (arg0 == 3616) {
            field861[++Statics.field855 - 1] = Statics.field70 == null ? 0 : Statics.field70.field4902;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field856[--Statics.field2444];
            client.method3105(var19);
            return 1;
        } else if (arg0 == 3618) {
            field861[++Statics.field855 - 1] = Statics.field70 == null ? 0 : Statics.field70.field4908;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field856[--Statics.field2444];
            client.method2967(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method668();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field3011.method1854()) {
                field861[++Statics.field855 - 1] = Statics.field3011.field822.method8008();
            } else {
                field861[++Statics.field855 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field861[--Statics.field855];
            if (Statics.field3011.method1854() && var21 >= 0 && var21 < Statics.field3011.field822.method8008()) {
                class475 var22 = (class475) Statics.field3011.field822.method7964(var21);
                field856[++Statics.field2444 - 1] = var22.method7934();
                field856[++Statics.field2444 - 1] = var22.method7935();
            } else {
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field856[--Statics.field2444];
            String var24 = client.method1092(var23);
            field861[++Statics.field855 - 1] = Statics.field3011.method1860(new class572(var24, Statics.field848)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field861[--Statics.field855];
            if (Statics.field70 == null || var25 >= Statics.field70.method8008() || !Statics.field70.method7964(var25).method7944().equals(Statics.field2672.field1138)) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field70 == null || Statics.field70.field4907 == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = Statics.field70.field4907;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field861[--Statics.field855];
            if (Statics.field70 == null || var26 >= Statics.field70.method8008() || !((class471) Statics.field70.method7964(var26)).method7932()) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field861[--Statics.field855];
            if (Statics.field70 == null || var27 >= Statics.field70.method8008() || !((class471) Statics.field70.method7964(var27)).method7930()) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field3011.field826.method7973();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class555(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class556(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class124(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class120(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class123(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class128(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class122(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class121(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class125(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class126(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field3011.field826.method7970();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field3011.field822.method7973();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field861[--Statics.field855] == 1;
            Statics.field3011.field822.method7974(new class555(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field861[--Statics.field855] == 1;
            Statics.field3011.field822.method7974(new class556(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field3011.field822.method7970();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field70 != null) {
                Statics.field70.method7973();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class555(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class556(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class124(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class120(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class123(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class128(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class122(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class121(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class125(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class126(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field70 != null) {
                Statics.field70.method7970();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field861[--Statics.field855] == 1;
            Statics.field3011.field826.method7974(new class127(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field861[--Statics.field855] == 1;
            if (Statics.field70 != null) {
                Statics.field70.method7974(new class127(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.bo(ILdp;ZI)I")
    public static int method3154(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ir.bm(ILdp;ZB)I")
    public static int method4364(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field3968 == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
                Statics.field5227 = Statics.field3968;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field861[--Statics.field855];
            if (client.field741[var3] == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = 1;
                Statics.field5227 = client.field741[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field856[++Statics.field2444 - 1] = Statics.field5227.field1744;
            return 1;
        } else if (arg0 == 3803) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1731 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1739;
            return 1;
        } else if (arg0 == 3805) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1758;
            return 1;
        } else if (arg0 == 3806) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1741;
            return 1;
        } else if (arg0 == 3807) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1742;
            return 1;
        } else if (arg0 == 3809) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1743;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = Statics.field5227.field1754[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = Statics.field5227.field1745[var5];
            return 1;
        } else if (arg0 == 3812) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1736;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = Statics.field5227.field1755[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field855 -= 3;
            int var7 = field861[Statics.field855];
            int var8 = field861[Statics.field855 + 1];
            int var9 = field861[Statics.field855 + 2];
            field861[++Statics.field855 - 1] = Statics.field5227.method3264(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1750;
            return 1;
        } else if (arg0 == 3816) {
            field861[++Statics.field855 - 1] = Statics.field5227.field1751;
            return 1;
        } else if (arg0 == 3817) {
            field861[++Statics.field855 - 1] = Statics.field5227.method3218(field856[--Statics.field2444]);
            return 1;
        } else if (arg0 == 3818) {
            field861[Statics.field855 - 1] = Statics.field5227.method3221()[field861[Statics.field855 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field855 -= 2;
            int var10 = field861[Statics.field855];
            int var11 = field861[Statics.field855 + 1];
            client.method3331(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = Statics.field5227.field1748[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field855 -= 3;
                int var13 = field861[Statics.field855];
                boolean var14 = field861[Statics.field855 + 1] == 1;
                int var15 = field861[Statics.field855 + 2];
                client.method6575(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field861[--Statics.field855];
                field861[++Statics.field855 - 1] = Statics.field5227.field1749[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field312 == null) {
                    field861[++Statics.field855 - 1] = 0;
                } else {
                    field861[++Statics.field855 - 1] = 1;
                    Statics.field4921 = Statics.field312;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field861[--Statics.field855];
                if (client.field608[var17] == null) {
                    field861[++Statics.field855 - 1] = 0;
                } else {
                    field861[++Statics.field855 - 1] = 1;
                    Statics.field4921 = client.field608[var17];
                    Statics.field1494 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field856[++Statics.field2444 - 1] = Statics.field4921.field1803;
                return 1;
            } else if (arg0 == 3853) {
                field861[++Statics.field855 - 1] = Statics.field4921.field1807;
                return 1;
            } else if (arg0 == 3854) {
                field861[++Statics.field855 - 1] = Statics.field4921.field1805;
                return 1;
            } else if (arg0 == 3855) {
                field861[++Statics.field855 - 1] = Statics.field4921.method3308();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field861[--Statics.field855];
                field856[++Statics.field2444 - 1] = ((class151) Statics.field4921.field1802.get(var18)).field1682.method9470();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field861[--Statics.field855];
                field861[++Statics.field855 - 1] = ((class151) Statics.field4921.field1802.get(var19)).field1684;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field861[--Statics.field855];
                field861[++Statics.field855 - 1] = ((class151) Statics.field4921.field1802.get(var20)).field1683;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field861[--Statics.field855];
                client.method4423(Statics.field1494, var21);
                return 1;
            } else if (arg0 == 3860) {
                field861[++Statics.field855 - 1] = Statics.field4921.method3309(field856[--Statics.field2444]);
                return 1;
            } else if (arg0 == 3861) {
                field861[Statics.field855 - 1] = Statics.field4921.method3313()[field861[Statics.field855 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field861[++Statics.field855 - 1] = Statics.field4935 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("aa.bd(ILdp;ZI)I")
    public static int method183(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field789[var3].method6822();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field789[var4].field4566;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field789[var5].field4567;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field789[var6].field4568;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field789[var7].field4565;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.field789[var8].field4570;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field861[--Statics.field855];
            int var10 = client.field789[var9].method6812();
            field861[++Statics.field855 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field861[--Statics.field855];
            int var12 = client.field789[var11].method6812();
            field861[++Statics.field855 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field861[--Statics.field855];
            int var14 = client.field789[var13].method6812();
            field861[++Statics.field855 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field861[--Statics.field855];
            int var16 = client.field789[var15].method6812();
            field861[++Statics.field855 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field861[--Statics.field855] == 1;
            if (Statics.field4777 != null) {
                Statics.field4777.method6768(class391.field4540, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field861[--Statics.field855] == 1;
            if (Statics.field4777 != null) {
                Statics.field4777.method6768(class391.field4541, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field855 -= 2;
            boolean var19 = field861[Statics.field855] == 1;
            boolean var20 = field861[Statics.field855 + 1] == 1;
            if (Statics.field4777 != null) {
                client.field790.field471 = var20;
                Statics.field4777.method6768(client.field790, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field861[--Statics.field855] == 1;
            if (Statics.field4777 != null) {
                Statics.field4777.method6768(class391.field4539, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field861[--Statics.field855] == 1;
            if (Statics.field4777 != null) {
                Statics.field4777.method6768(class391.field4543, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field861[++Statics.field855 - 1] = Statics.field4777 == null ? 0 : Statics.field4777.field4542.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field861[--Statics.field855];
            class397 var24 = (class397) Statics.field4777.field4542.get(var23);
            field861[++Statics.field855 - 1] = var24.field4564;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field861[--Statics.field855];
            class397 var26 = (class397) Statics.field4777.field4542.get(var25);
            field856[++Statics.field2444 - 1] = var26.method6806();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field861[--Statics.field855];
            class397 var28 = (class397) Statics.field4777.field4542.get(var27);
            field856[++Statics.field2444 - 1] = var28.method6808();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field861[--Statics.field855];
            class397 var30 = (class397) Statics.field4777.field4542.get(var29);
            long var31 = class329.method5009() - Statics.field3698 - var30.field4560;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field856[++Statics.field2444 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field861[--Statics.field855];
            class397 var38 = (class397) Statics.field4777.field4542.get(var37);
            field861[++Statics.field855 - 1] = var38.field4561.field4568;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field861[--Statics.field855];
            class397 var40 = (class397) Statics.field4777.field4542.get(var39);
            field861[++Statics.field855 - 1] = var40.field4561.field4567;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field861[--Statics.field855];
            class397 var42 = (class397) Statics.field4777.field4542.get(var41);
            field861[++Statics.field855 - 1] = var42.field4561.field4566;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var43).field2843 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.bh(ILdp;ZB)I")
    public static int method64(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field855 -= 2;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field855 -= 2;
            int var5 = field861[Statics.field855];
            int var6 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field855 -= 2;
            int var7 = field861[Statics.field855];
            int var8 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field855 -= 2;
            int var9 = field861[Statics.field855];
            int var10 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field855 -= 5;
            int var13 = field861[Statics.field855];
            int var14 = field861[Statics.field855 + 1];
            int var15 = field861[Statics.field855 + 2];
            int var16 = field861[Statics.field855 + 3];
            int var17 = field861[Statics.field855 + 4];
            field861[++Statics.field855 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field855 -= 2;
            int var18 = field861[Statics.field855];
            int var19 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field855 -= 2;
            int var20 = field861[Statics.field855];
            int var21 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field855 -= 2;
            int var22 = field861[Statics.field855];
            int var23 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field855 -= 2;
            int var24 = field861[Statics.field855];
            int var25 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field855 -= 2;
            int var26 = field861[Statics.field855];
            int var27 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field855 -= 2;
            int var28 = field861[Statics.field855];
            int var29 = field861[Statics.field855 + 1];
            if (var28 == 0) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field855 -= 2;
            int var30 = field861[Statics.field855];
            int var31 = field861[Statics.field855 + 1];
            if (var30 == 0) {
                field861[++Statics.field855 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field861[++Statics.field855 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field861[++Statics.field855 - 1] = var30;
                    break;
                case 2:
                    field861[++Statics.field855 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field861[++Statics.field855 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field861[++Statics.field855 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field861[++Statics.field855 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field855 -= 2;
            int var32 = field861[Statics.field855];
            int var33 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field855 -= 2;
            int var34 = field861[Statics.field855];
            int var35 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field855 -= 2;
            int var36 = field861[Statics.field855];
            int var37 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field855 -= 2;
            int var38 = field861[Statics.field855];
            int var39 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field855 -= 3;
            long var40 = (long) field861[Statics.field855];
            long var42 = (long) field861[Statics.field855 + 1];
            long var44 = (long) field861[Statics.field855 + 2];
            field861[++Statics.field855 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class331.method4209(field861[--Statics.field855]);
            field861[++Statics.field855 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field855 -= 2;
            int var47 = field861[Statics.field855];
            int var48 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field855 -= 3;
            int var49 = field861[Statics.field855];
            int var50 = field861[Statics.field855 + 1];
            int var51 = field861[Statics.field855 + 2];
            field861[++Statics.field855 - 1] = class331.method4576(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field855 -= 3;
            int var52 = field861[Statics.field855];
            int var53 = field861[Statics.field855 + 1];
            int var54 = field861[Statics.field855 + 2];
            field861[++Statics.field855 - 1] = class331.method2635(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field855 -= 3;
            int var55 = field861[Statics.field855];
            int var56 = field861[Statics.field855 + 1];
            int var57 = field861[Statics.field855 + 2];
            int var58 = 31 - var57;
            field861[++Statics.field855 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field855 -= 4;
            int var59 = field861[Statics.field855];
            int var60 = field861[Statics.field855 + 1];
            int var61 = field861[Statics.field855 + 2];
            int var62 = field861[Statics.field855 + 3];
            int var63 = class331.method2635(var59, var61, var62);
            int var64 = class331.method4129(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field861[++Statics.field855 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field861[Statics.field855 - 1] = class498.method3835(field861[Statics.field855 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field861[Statics.field855 - 1] = class498.method1044(field861[Statics.field855 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field855 -= 2;
            int var65 = field861[Statics.field855];
            int var66 = field861[Statics.field855 + 1];
            int var67 = class498.method2085(var65, var66);
            field861[++Statics.field855 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field861[Statics.field855 - 1] = Math.abs(field861[Statics.field855 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field856[--Statics.field2444];
            int var69 = -1;
            if (class417.method3101(var68)) {
                var69 = class417.method1138(var68);
            }
            field861[++Statics.field855 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.bx(ILdp;ZI)I")
    public static int method2726(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field856[--Statics.field2444];
            int var4 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2444 -= 2;
            String var5 = field856[Statics.field2444];
            String var6 = field856[Statics.field2444 + 1];
            field856[++Statics.field2444 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field856[--Statics.field2444];
            int var8 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = var7 + class417.method5506(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field856[--Statics.field2444];
            field856[++Statics.field2444 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field861[--Statics.field855];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field865.setTime(new Date(var11));
            int var13 = field865.get(5);
            int var14 = field865.get(2);
            int var15 = field865.get(1);
            field856[++Statics.field2444 - 1] = var13 + "-" + field860[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2444 -= 2;
            String var16 = field856[Statics.field2444];
            String var17 = field856[Statics.field2444 + 1];
            if (Statics.field2672.field1111 == null || Statics.field2672.field1111.field3745 == 0) {
                field856[++Statics.field2444 - 1] = var16;
            } else {
                field856[++Statics.field2444 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2444 -= 2;
            field861[++Statics.field855 - 1] = class417.method5988(class418.method3844(field856[Statics.field2444], field856[Statics.field2444 + 1], Statics.field62));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field856[--Statics.field2444];
            Statics.field855 -= 2;
            int var20 = field861[Statics.field855];
            int var21 = field861[Statics.field855 + 1];
            byte[] var22 = Statics.field1225.method6670(var21, 0);
            class433 var23 = new class433(var22);
            field861[++Statics.field855 - 1] = var23.method7536(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field856[--Statics.field2444];
            Statics.field855 -= 2;
            int var25 = field861[Statics.field855];
            int var26 = field861[Statics.field855 + 1];
            byte[] var27 = Statics.field1225.method6670(var26, 0);
            class433 var28 = new class433(var27);
            field861[++Statics.field855 - 1] = var28.method7530(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2444 -= 2;
            String var29 = field856[Statics.field2444];
            String var30 = field856[Statics.field2444 + 1];
            if (field861[--Statics.field855] == 1) {
                field856[++Statics.field2444 - 1] = var29;
            } else {
                field856[++Statics.field2444 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field856[--Statics.field2444];
            field856[++Statics.field2444 - 1] = class437.method7594(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field856[--Statics.field2444];
            int var33 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class417.method6862((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class417.method3182((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class417.method5909((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class417.method4709((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field856[--Statics.field2444];
            if (var38 == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field856[--Statics.field2444];
            Statics.field855 -= 2;
            int var40 = field861[Statics.field855];
            int var41 = field861[Statics.field855 + 1];
            field856[++Statics.field2444 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field856[--Statics.field2444];
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
            field856[++Statics.field2444 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field856[--Statics.field2444];
            int var48 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2444 -= 2;
            String var49 = field856[Statics.field2444];
            String var50 = field856[Statics.field2444 + 1];
            int var51 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field856[--Statics.field2444];
            field856[++Statics.field2444 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field2444 -= 3;
            String var53 = field856[Statics.field2444];
            String var54 = field856[Statics.field2444 + 1];
            String var55 = field856[Statics.field2444 + 2];
            if (Statics.field2672.field1111 == null) {
                field856[++Statics.field2444 - 1] = var55;
                return 1;
            }
            switch(Statics.field2672.field1111.field3742) {
                case 0:
                    field856[++Statics.field2444 - 1] = var53;
                    break;
                case 1:
                    field856[++Statics.field2444 - 1] = var54;
                    break;
                case 2:
                default:
                    field856[++Statics.field2444 - 1] = var55;
            }
            return 1;
        } else if (arg0 == 4124) {
            field861[++Statics.field855 - 1] = Statics.field2672.field1111 == null ? -1 : Statics.field2672.field1111.field3742;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lb.bv(ILdp;ZI)I")
    public static int method5423(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = class262.method2385(var3).field2796;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field855 -= 2;
            int var4 = field861[Statics.field855];
            int var5 = field861[Statics.field855 + 1];
            class262 var6 = class262.method2385(var4);
            if (var5 < 1 || var5 > 5 || var6.field2815[var5 - 1] == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var6.field2815[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field855 -= 2;
            int var7 = field861[Statics.field855];
            int var8 = field861[Statics.field855 + 1];
            class262 var9 = class262.method2385(var7);
            if (var8 < 1 || var8 > 5 || var9.field2816[var8 - 1] == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var9.field2816[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4222) {
            Statics.field855 -= 3;
            int var10 = field861[Statics.field855];
            int var11 = field861[Statics.field855 + 1];
            int var12 = field861[Statics.field855 + 2];
            class262 var13 = class262.method2385(var10);
            String var14 = null;
            if (var11 >= 1 && var11 <= 5 && var13.field2816[var11 - 1] != null && var13.field2825 != null && var13.field2825[var11 - 1] != null && var12 >= 1 && var12 <= var13.field2825[var11 - 1].length) {
                var14 = var13.field2825[var11 - 1][var12 - 1];
            }
            field856[++Statics.field2444 - 1] = var14 == null ? "" : var14;
            return 1;
        } else if (arg0 == 4203) {
            int var15 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var15).field2810;
            return 1;
        } else if (arg0 == 4204) {
            int var16 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var16).field2847 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var17 = field861[--Statics.field855];
            class262 var18 = class262.method2385(var17);
            if (var18.field2811 == -1 && var18.field2824 >= 0) {
                field861[++Statics.field855 - 1] = var18.field2824;
            } else {
                field861[++Statics.field855 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var19 = field861[--Statics.field855];
            class262 var20 = class262.method2385(var19);
            if (var20.field2811 >= 0 && var20.field2824 >= 0) {
                field861[++Statics.field855 - 1] = var20.field2824;
            } else {
                field861[++Statics.field855 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var21 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var21).field2814 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var22 = field861[--Statics.field855];
            class262 var23 = class262.method2385(var22);
            if (var23.field2805 == -1 && var23.field2846 >= 0) {
                field861[++Statics.field855 - 1] = var23.field2846;
            } else {
                field861[++Statics.field855 - 1] = var22;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var24 = field861[--Statics.field855];
            class262 var25 = class262.method2385(var24);
            if (var25.field2805 >= 0 && var25.field2846 >= 0) {
                field861[++Statics.field855 - 1] = var25.field2846;
            } else {
                field861[++Statics.field855 - 1] = var24;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var26 = field856[--Statics.field2444];
            int var27 = field861[--Statics.field855];
            client.method4864(var26, var27 == 1);
            field861[++Statics.field855 - 1] = Statics.field1775;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3220 == null || Statics.field2696 >= Statics.field1775) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = Statics.field3220[++Statics.field2696 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2696 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var28 = field861[--Statics.field855];
            int var29 = class262.method2385(var28).method4803();
            if (var29 == -1) {
                field861[++Statics.field855 - 1] = var29;
            } else {
                field861[++Statics.field855 - 1] = var29 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var30 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var30).field2791;
            return 1;
        } else if (arg0 == 4215) {
            int var31 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var31).field2832;
            return 1;
        } else if (arg0 == 4216) {
            int var32 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class262.method2385(var32).field2799;
            return 1;
        } else if (arg0 == 4217) {
            int var33 = field861[--Statics.field855];
            class262 var34 = class262.method2385(var33);
            field861[++Statics.field855 - 1] = var34.field2787;
            return 1;
        } else if (arg0 == 4218) {
            int var35 = field861[--Statics.field855];
            field856[++Statics.field2444 - 1] = class262.method2385(var35).field2797;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("la.bu(ILdp;ZI)I")
    public static int method5495(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field861[++Statics.field855 - 1] = client.field730;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field855 -= 3;
            client.field730 = field861[Statics.field855];
            Statics.field3980 = class569.method8719(field861[Statics.field855 + 1]);
            if (Statics.field3980 == null) {
                Statics.field3980 = class569.field5538;
            }
            client.field731 = field861[Statics.field855 + 2];
            class324 var3 = class324.method4244(class322.field3282, client.field569.field1458);
            var3.field3379.method8781(client.field730);
            var3.field3379.method8781(Statics.field3980.field5541);
            var3.field3379.method8781(client.field731);
            client.field569.method2829(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field856[--Statics.field2444];
            Statics.field855 -= 2;
            int var5 = field861[Statics.field855];
            int var6 = field861[Statics.field855 + 1];
            class324 var7 = class324.method4244(class322.field3325, client.field569.field1458);
            var7.field3379.method8781(class549.method8571(var4) + 2);
            var7.field3379.method8869(var4);
            var7.field3379.method8781(var5 - 1);
            var7.field3379.method8781(var6);
            client.field569.method2829(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field855 -= 2;
            int var8 = field861[Statics.field855];
            int var9 = field861[Statics.field855 + 1];
            class65 var10 = class114.method11(var8, var9);
            if (var10 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var10.field454;
                field861[++Statics.field855 - 1] = var10.field453;
                field856[++Statics.field2444 - 1] = var10.field455 == null ? "" : var10.field455;
                field856[++Statics.field2444 - 1] = var10.field459 == null ? "" : var10.field459;
                field856[++Statics.field2444 - 1] = var10.field457 == null ? "" : var10.field457;
                field861[++Statics.field855 - 1] = var10.method1132() ? 1 : (var10.method1110() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field861[--Statics.field855];
            class65 var12 = class114.method6525(var11);
            if (var12 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var12.field458;
                field861[++Statics.field855 - 1] = var12.field453;
                field856[++Statics.field2444 - 1] = var12.field455 == null ? "" : var12.field455;
                field856[++Statics.field2444 - 1] = var12.field459 == null ? "" : var12.field459;
                field856[++Statics.field2444 - 1] = var12.field457 == null ? "" : var12.field457;
                field861[++Statics.field855 - 1] = var12.method1132() ? 1 : (var12.method1110() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3980 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = Statics.field3980.field5541;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field856[--Statics.field2444];
            int var14 = field861[--Statics.field855];
            class324 var15 = class573.method6558(var14, var13, Statics.field62, -1);
            client.field569.method2829(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2444 -= 2;
            String var16 = field856[Statics.field2444];
            String var17 = field856[Statics.field2444 + 1];
            class324 var18 = class324.method4244(class322.field3352, client.field569.field1458);
            var18.field3379.method8782(0);
            int var19 = var18.field3379.field5378;
            var18.field3379.method8869(var16);
            class364.method2339(var18.field3379, var17);
            var18.field3379.method8793(var18.field3379.field5378 - var19);
            client.field569.method2829(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field856[--Statics.field2444];
            Statics.field855 -= 2;
            int var21 = field861[Statics.field855];
            int var22 = field861[Statics.field855 + 1];
            class324 var23 = class573.method6558(var21, var20, Statics.field62, var22);
            client.field569.method2829(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field2672 == null || Statics.field2672.field1138 == null) {
                var24 = "";
            } else {
                var24 = Statics.field2672.field1138.method9470();
            }
            field856[++Statics.field2444 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field861[++Statics.field855 - 1] = client.field731;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class114.method6563(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class114.method5618(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = class114.method6552(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field856[--Statics.field2444];
            client.method4145(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field732 = field856[--Statics.field2444].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field856[++Statics.field2444 - 1] = client.field732;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field856[--Statics.field2444];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field855 -= 2;
            int var30 = field861[Statics.field855];
            int var31 = field861[Statics.field855 + 1];
            class65 var32 = class114.method11(var30, var31);
            if (var32 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var32.field454;
                field861[++Statics.field855 - 1] = var32.field453;
                field856[++Statics.field2444 - 1] = var32.field455 == null ? "" : var32.field455;
                field856[++Statics.field2444 - 1] = var32.field459 == null ? "" : var32.field459;
                field856[++Statics.field2444 - 1] = var32.field457 == null ? "" : var32.field457;
                field861[++Statics.field855 - 1] = var32.method1132() ? 1 : (var32.method1110() ? 2 : 0);
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field861[--Statics.field855];
            class65 var34 = class114.method6525(var33);
            if (var34 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var34.field458;
                field861[++Statics.field855 - 1] = var34.field453;
                field856[++Statics.field2444 - 1] = var34.field455 == null ? "" : var34.field455;
                field856[++Statics.field2444 - 1] = var34.field459 == null ? "" : var34.field459;
                field856[++Statics.field2444 - 1] = var34.field457 == null ? "" : var34.field457;
                field861[++Statics.field855 - 1] = var34.method1132() ? 1 : (var34.method1110() ? 2 : 0);
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.bp(ILdp;ZI)I")
    public static int method3428(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field861[++Statics.field855 - 1] = client.method3176();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field861[--Statics.field855];
            if (var3 == 1 || var3 == 2) {
                client.method4628(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field861[++Statics.field855 - 1] = Statics.field1385.method2539();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field861[--Statics.field855];
            if (var4 == 1 || var4 == 2) {
                Statics.field1385.method2524(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field855--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.br(ILdp;ZI)I")
    public static int method4995(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field855 -= 2;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            if (!client.field538) {
                client.field591 = var3;
                client.field592 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field861[++Statics.field855 - 1] = client.field591;
            return 1;
        } else if (arg0 == 5506) {
            field861[++Statics.field855 - 1] = client.field592;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field861[--Statics.field855];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field506 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field861[++Statics.field855 - 1] = client.field506;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qr.bf(ILdp;ZI)I")
    public static int method7133(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field570 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.bq(II)I")
    public static int method3175(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("qb.bt(II)I")
    public static int method7666(int arg0) {
        return (int) ((Math.log((double) arg0) / field866 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("bv.bi(ILdp;ZI)I")
    public static int method633(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field855 -= 2;
            client.field772 = (short) method3175(field861[Statics.field855]);
            if (client.field772 <= 0) {
                client.field772 = 256;
            }
            client.field692 = (short) method3175(field861[Statics.field855 + 1]);
            if (client.field692 <= 0) {
                client.field692 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field855 -= 2;
            client.field774 = (short) field861[Statics.field855];
            if (client.field774 <= 0) {
                client.field774 = 256;
            }
            client.field775 = (short) field861[Statics.field855 + 1];
            if (client.field775 <= 0) {
                client.field775 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field855 -= 4;
            client.field547 = (short) field861[Statics.field855];
            if (client.field547 <= 0) {
                client.field547 = 1;
            }
            client.field776 = (short) field861[Statics.field855 + 1];
            if (client.field776 <= 0) {
                client.field776 = 32767;
            } else if (client.field776 < client.field547) {
                client.field776 = client.field547;
            }
            client.field580 = (short) field861[Statics.field855 + 2];
            if (client.field580 <= 0) {
                client.field580 = 1;
            }
            client.field779 = (short) field861[Statics.field855 + 3];
            if (client.field779 <= 0) {
                client.field779 = 32767;
            } else if (client.field779 < client.field580) {
                client.field779 = client.field580;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field678 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
            } else {
                client.method1066(0, 0, client.field678.field3819, client.field678.field3820, false);
                field861[++Statics.field855 - 1] = client.field782;
                field861[++Statics.field855 - 1] = client.field783;
            }
            return 1;
        } else if (arg0 == 6204) {
            field861[++Statics.field855 - 1] = client.field774;
            field861[++Statics.field855 - 1] = client.field775;
            return 1;
        } else if (arg0 == 6205) {
            field861[++Statics.field855 - 1] = method7666(client.field772);
            field861[++Statics.field855 - 1] = method7666(client.field692);
            return 1;
        } else if (arg0 == 6220) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field861[++Statics.field855 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field861[++Statics.field855 - 1] = Statics.field1345;
            return 1;
        } else if (arg0 == 6223) {
            field861[++Statics.field855 - 1] = Statics.field467;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jn.be(ILdp;ZB)I")
    public static int method4583(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field861[++Statics.field855 - 1] = class70.method4329() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class70 var3 = class70.method12();
            if (var3 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
            } else {
                field861[++Statics.field855 - 1] = var3.field817;
                field861[++Statics.field855 - 1] = var3.field813;
                field856[++Statics.field2444 - 1] = var3.field805;
                field861[++Statics.field855 - 1] = var3.field816;
                field861[++Statics.field855 - 1] = var3.field812;
                field856[++Statics.field2444 - 1] = var3.field814;
            }
            return 1;
        } else if (arg0 == 6502) {
            class70 var4 = class70.method2351();
            if (var4 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
            } else {
                field861[++Statics.field855 - 1] = var4.field817;
                field861[++Statics.field855 - 1] = var4.field813;
                field856[++Statics.field2444 - 1] = var4.field805;
                field861[++Statics.field855 - 1] = var4.field816;
                field861[++Statics.field855 - 1] = var4.field812;
                field856[++Statics.field2444 - 1] = var4.field814;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field861[--Statics.field855];
            class70 var6 = null;
            for (int var7 = 0; var7 < class70.field818; var7++) {
                if (Statics.field3255[var7].field817 == var5) {
                    var6 = Statics.field3255[var7];
                    break;
                }
            }
            if (var6 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
            } else {
                field861[++Statics.field855 - 1] = var6.field817;
                field861[++Statics.field855 - 1] = var6.field813;
                field856[++Statics.field2444 - 1] = var6.field805;
                field861[++Statics.field855 - 1] = var6.field816;
                field861[++Statics.field855 - 1] = var6.field812;
                field856[++Statics.field2444 - 1] = var6.field814;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field855 -= 4;
            int var8 = field861[Statics.field855];
            boolean var9 = field861[Statics.field855 + 1] == 1;
            int var10 = field861[Statics.field855 + 2];
            boolean var11 = field861[Statics.field855 + 3] == 1;
            class70.method4401(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field861[--Statics.field855];
            if (var12 >= 0 && var12 < class70.field818) {
                class70 var13 = Statics.field3255[var12];
                field861[++Statics.field855 - 1] = var13.field817;
                field861[++Statics.field855 - 1] = var13.field813;
                field856[++Statics.field2444 - 1] = var13.field805;
                field861[++Statics.field855 - 1] = var13.field816;
                field861[++Statics.field855 - 1] = var13.field812;
                field856[++Statics.field2444 - 1] = var13.field814;
            } else {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
                field856[++Statics.field2444 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field701 = field861[--Statics.field855] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field855 -= 2;
            int var14 = field861[Statics.field855];
            int var15 = field861[Statics.field855 + 1];
            class257 var16 = Statics.method1930(var15);
            if (var16.method4637()) {
                field856[++Statics.field2444 - 1] = class246.method2916(var14).method4541(var15, var16.field2697);
            } else {
                field861[++Statics.field855 - 1] = class246.method2916(var14).method4525(var15, var16.field2693);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field855 -= 2;
            int var17 = field861[Statics.field855];
            int var18 = field861[Statics.field855 + 1];
            class257 var19 = Statics.method1930(var18);
            if (var19.method4637()) {
                field856[++Statics.field2444 - 1] = class261.method4328(var17).method4721(var18, var19.field2697);
            } else {
                field861[++Statics.field855 - 1] = class261.method4328(var17).method4720(var18, var19.field2693);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field855 -= 2;
            int var20 = field861[Statics.field855];
            int var21 = field861[Statics.field855 + 1];
            class257 var22 = Statics.method1930(var21);
            if (var22.method4637()) {
                field856[++Statics.field2444 - 1] = class262.method2385(var20).method4778(var21, var22.field2697);
            } else {
                field861[++Statics.field855 - 1] = class262.method2385(var20).method4777(var21, var22.field2693);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field855 -= 2;
            int var23 = field861[Statics.field855];
            int var24 = field861[Statics.field855 + 1];
            class257 var25 = Statics.method1930(var24);
            if (var25.method4637()) {
                field856[++Statics.field2444 - 1] = class258.method4996(var23).method4657(var24, var25.field2697);
            } else {
                field861[++Statics.field855 - 1] = class258.method4996(var23).method4653(var24, var25.field2693);
            }
            return 1;
        } else if (arg0 == 6518) {
            field861[++Statics.field855 - 1] = client.field642 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field861[++Statics.field855 - 1] = client.field559;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2444--;
            Statics.field855--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2444--;
            Statics.field855--;
            return 1;
        } else if (arg0 == 6524) {
            field861[++Statics.field855 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field861[++Statics.field855 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field861[++Statics.field855 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field861[++Statics.field855 - 1] = client.field510;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lf.ba(ILdp;ZI)I")
    public static int method5555(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field4799.field1308;
            int var4 = (Statics.field2672.field1249 >> 7) + Statics.field4799.field1311;
            int var5 = (Statics.field2672.field1180 >> 7) + Statics.field4799.field1319;
            client.method5905().method8304(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field861[--Statics.field855];
            String var7 = "";
            class284 var8 = client.method5905().method8323(var6);
            if (var8 != null) {
                var7 = var8.method5146();
            }
            field856[++Statics.field2444 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field861[--Statics.field855];
            client.method5905().method8305(var9);
            return 1;
        } else if (arg0 == 6603) {
            field861[++Statics.field855 - 1] = client.method5905().method8320();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field861[--Statics.field855];
            client.method5905().method8317(var10);
            return 1;
        } else if (arg0 == 6605) {
            field861[++Statics.field855 - 1] = client.method5905().method8377() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class350 var11 = new class350(field861[--Statics.field855]);
            client.method5905().method8324(var11.field3705, var11.field3704);
            return 1;
        } else if (arg0 == 6607) {
            class350 var12 = new class350(field861[--Statics.field855]);
            client.method5905().method8325(var12.field3705, var12.field3704);
            return 1;
        } else if (arg0 == 6608) {
            class350 var13 = new class350(field861[--Statics.field855]);
            client.method5905().method8438(var13.field3706, var13.field3705, var13.field3704);
            return 1;
        } else if (arg0 == 6609) {
            class350 var14 = new class350(field861[--Statics.field855]);
            client.method5905().method8327(var14.field3706, var14.field3705, var14.field3704);
            return 1;
        } else if (arg0 == 6610) {
            field861[++Statics.field855 - 1] = client.method5905().method8328();
            field861[++Statics.field855 - 1] = client.method5905().method8329();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field861[--Statics.field855];
            class284 var16 = client.method5905().method8323(var15);
            if (var16 == null) {
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var16.method5145().method5935();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field861[--Statics.field855];
            class284 var18 = client.method5905().method8323(var17);
            if (var18 == null) {
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = (var18.method5151() - var18.method5150() + 1) * 64;
                field861[++Statics.field855 - 1] = (var18.method5204() - var18.method5184() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field861[--Statics.field855];
            class284 var20 = client.method5905().method8323(var19);
            if (var20 == null) {
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
                field861[++Statics.field855 - 1] = 0;
            } else {
                field861[++Statics.field855 - 1] = var20.method5150() * 64;
                field861[++Statics.field855 - 1] = var20.method5184() * 64;
                field861[++Statics.field855 - 1] = var20.method5151() * 64 + 64 - 1;
                field861[++Statics.field855 - 1] = var20.method5204() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field861[--Statics.field855];
            class284 var22 = client.method5905().method8323(var21);
            if (var22 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var22.method5149();
            }
            return 1;
        } else if (arg0 == 6615) {
            class350 var23 = client.method5905().method8343();
            if (var23 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var23.field3705;
                field861[++Statics.field855 - 1] = var23.field3704;
            }
            return 1;
        } else if (arg0 == 6616) {
            field861[++Statics.field855 - 1] = client.method5905().method8383();
            return 1;
        } else if (arg0 == 6617) {
            class350 var24 = new class350(field861[--Statics.field855]);
            class284 var25 = client.method5905().method8354();
            if (var25 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method5140(var24.field3706, var24.field3705, var24.field3704);
            if (var26 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var26[0];
                field861[++Statics.field855 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class350 var27 = new class350(field861[--Statics.field855]);
            class284 var28 = client.method5905().method8354();
            if (var28 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
                return 1;
            }
            class350 var29 = var28.method5141(var27.field3705, var27.field3704);
            if (var29 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var29.method5935();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field855 -= 2;
            int var30 = field861[Statics.field855];
            class350 var31 = new class350(field861[Statics.field855 + 1]);
            method6878(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field855 -= 2;
            int var32 = field861[Statics.field855];
            class350 var33 = new class350(field861[Statics.field855 + 1]);
            method6878(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field855 -= 2;
            int var34 = field861[Statics.field855];
            class350 var35 = new class350(field861[Statics.field855 + 1]);
            class284 var36 = client.method5905().method8323(var34);
            if (var36 == null) {
                field861[++Statics.field855 - 1] = 0;
                return 1;
            } else {
                field861[++Statics.field855 - 1] = var36.method5166(var35.field3706, var35.field3705, var35.field3704) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field861[++Statics.field855 - 1] = client.method5905().method8457();
            field861[++Statics.field855 - 1] = client.method5905().method8435();
            return 1;
        } else if (arg0 == 6623) {
            class350 var37 = new class350(field861[--Statics.field855]);
            class284 var38 = client.method5905().method8303(var37.field3706, var37.field3705, var37.field3704);
            if (var38 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var38.method5143();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method5905().method8314(field861[--Statics.field855]);
            return 1;
        } else if (arg0 == 6625) {
            client.method5905().method8334();
            return 1;
        } else if (arg0 == 6626) {
            client.method5905().method8319(field861[--Statics.field855]);
            return 1;
        } else if (arg0 == 6627) {
            client.method5905().method8336();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field861[--Statics.field855] == 1;
            client.method5905().method8337(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field861[--Statics.field855];
            client.method5905().method8338(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field861[--Statics.field855];
            client.method5905().method8345(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method5905().method8340();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field861[--Statics.field855] == 1;
            client.method5905().method8440(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field855 -= 2;
            int var43 = field861[Statics.field855];
            boolean var44 = field861[Statics.field855 + 1] == 1;
            client.method5905().method8342(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field855 -= 2;
            int var45 = field861[Statics.field855];
            boolean var46 = field861[Statics.field855 + 1] == 1;
            client.method5905().method8307(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field861[++Statics.field855 - 1] = client.method5905().method8344() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.method5905().method8313(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field861[--Statics.field855];
            field861[++Statics.field855 - 1] = client.method5905().method8326(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field855 -= 2;
            int var49 = field861[Statics.field855];
            class350 var50 = new class350(field861[Statics.field855 + 1]);
            class350 var51 = client.method5905().method8424(var49, var50);
            if (var51 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var51.method5935();
            }
            return 1;
        } else if (arg0 == 6639) {
            class302 var52 = client.method5905().method8351();
            if (var52 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var52.method5108();
                field861[++Statics.field855 - 1] = var52.field3211.method5935();
            }
            return 1;
        } else if (arg0 == 6640) {
            class302 var53 = client.method5905().method8352();
            if (var53 == null) {
                field861[++Statics.field855 - 1] = -1;
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var53.method5108();
                field861[++Statics.field855 - 1] = var53.field3211.method5935();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field861[--Statics.field855];
            class235 var55 = class235.method2700(var54);
            if (var55.field2465 == null) {
                field856[++Statics.field2444 - 1] = "";
            } else {
                field856[++Statics.field2444 - 1] = var55.field2465;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field861[--Statics.field855];
            class235 var57 = class235.method2700(var56);
            field861[++Statics.field855 - 1] = var57.field2476;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field861[--Statics.field855];
            class235 var59 = class235.method2700(var58);
            if (var59 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var59.field2487;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field861[--Statics.field855];
            class235 var61 = class235.method2700(var60);
            if (var61 == null) {
                field861[++Statics.field855 - 1] = -1;
            } else {
                field861[++Statics.field855 - 1] = var61.field2478;
            }
            return 1;
        } else if (arg0 == 6697) {
            field861[++Statics.field855 - 1] = Statics.field2950.field3234;
            return 1;
        } else if (arg0 == 6698) {
            field861[++Statics.field855 - 1] = Statics.field2950.field3231.method5935();
            return 1;
        } else if (arg0 == 6699) {
            field861[++Statics.field855 - 1] = Statics.field2950.field3230.method5935();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ht.bn(ILdp;ZI)I")
    public static int method4056(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field861[--Statics.field855];
            class246 var4 = class246.method2916(var3);
            field856[++Statics.field2444 - 1] = var4 == null ? "" : var4.field2570;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field855 -= 2;
            class246 var5 = class246.method2916(field861[Statics.field855]);
            int var6 = field861[Statics.field855 + 1];
            field861[++Statics.field855 - 1] = var5.method4528(var6);
            field861[++Statics.field855 - 1] = var5.method4530(var6);
            return 1;
        } else if (arg0 == 6765) {
            class246 var7 = class246.method2916(field861[--Statics.field855]);
            field861[++Statics.field855 - 1] = var7 == null ? 0 : var7.field2595;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ed.bw(ILdp;ZI)I")
    public static int method2722(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field861[--Statics.field855];
            class261 var4 = class261.method4328(var3);
            field856[++Statics.field2444 - 1] = var4 == null ? "" : var4.field2782;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kz.bk(ILdp;ZB)I")
    public static int method5363(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("jq.bs(ILdp;ZI)I")
    public static int method4501(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("tv.bb(ILdp;ZB)I")
    public static int method8211(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field861[++Statics.field855 - 1] = client.method2911() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gd.by(ILdp;ZI)I")
    public static int method3328(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field861[--Statics.field855] == 1;
            client.method669(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.bl(ILdp;ZI)I")
    public static int method2294(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field861[--Statics.field855];
            Object var45 = method7187(var44);
            int var46 = field861[--Statics.field855];
            class540 var47 = client.method2192(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class542.method5457(var46);
            Statics.field118 = var47.method8690(var45, var48);
            if (Statics.field118 == null) {
                client.field794 = -1;
                Statics.field1040 = null;
                if (arg0 == 7500) {
                    field861[++Statics.field855 - 1] = 0;
                }
            } else {
                client.field794 = class542.method8269(var46);
                Statics.field1040 = Statics.field118.iterator();
                if (arg0 == 7500) {
                    field861[++Statics.field855 - 1] = Statics.field118.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field1040 != null && Statics.field1040.hasNext()) {
                field861[++Statics.field855 - 1] = (Integer) Statics.field1040.next();
            } else {
                field861[++Statics.field855 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field855 -= 3;
            int var3 = field861[Statics.field855];
            int var4 = field861[Statics.field855 + 1];
            int var5 = field861[Statics.field855 + 2];
            int var6 = class542.method8269(var4);
            int var7 = class542.method4377(var4);
            int var8 = class542.method5457(var4);
            class541 var9 = class541.method7764(var3);
            class539 var10 = class539.method8268(var6);
            int[] var11 = var10.field5309[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8700(var7);
            if (var14 == null && var10.field5310 != null) {
                var14 = var10.field5310[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class536 var17 = class534.method7129(var16);
                    if (class536.field5293 == var17) {
                        field856[++Statics.field2444 - 1] = "";
                    } else {
                        field861[++Statics.field855 - 1] = class534.method6827(var16);
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
                class536 var21 = class534.method7129(var11[var19]);
                if (class536.field5293 == var21) {
                    field856[++Statics.field2444 - 1] = (String) var14[var20];
                } else {
                    field861[++Statics.field855 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field855 -= 2;
            int var22 = field861[Statics.field855];
            int var23 = field861[Statics.field855 + 1];
            int var24 = 0;
            int var25 = class542.method8269(var23);
            int var26 = class542.method4377(var23);
            class541 var27 = class541.method7764(var22);
            class539 var28 = class539.method8268(var25);
            int[] var29 = var28.field5309[var26];
            Object[] var30 = var27.method8700(var26);
            if (var30 == null && var28.field5310 != null) {
                var30 = var28.field5310[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field861[++Statics.field855 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field855--;
            int var41 = field861[Statics.field855];
            class540 var42 = Statics.method6526(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field118 = var42.method8690(0, 0);
            int var43 = 0;
            if (Statics.field118 != null) {
                client.field794 = var41;
                Statics.field1040 = Statics.field118.iterator();
                var43 = Statics.field118.size();
            }
            if (arg0 == 7504) {
                field861[++Statics.field855 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field861[--Statics.field855];
            class541 var32 = class541.method7764(var31);
            field861[++Statics.field855 - 1] = var32.field5321;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field861[--Statics.field855];
            int var34 = -1;
            if (Statics.field118 != null && var33 >= 0 && var33 < Statics.field118.size()) {
                var34 = (Integer) Statics.field118.get(var33);
            }
            field861[++Statics.field855 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field861[--Statics.field855];
            Object var36 = method7187(var35);
            int var37 = field861[--Statics.field855];
            class540 var38 = client.method2192(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class542.method8269(var37) != client.field794) {
                throw new RuntimeException();
            } else if (Statics.field118 == null && Statics.field118.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class542.method5457(var37);
                List var40 = var38.method8690(var36, var39);
                Statics.field118 = new LinkedList(Statics.field118);
                if (var40 == null) {
                    Statics.field118.clear();
                } else {
                    Statics.field118.retainAll(var40);
                }
                Statics.field1040 = Statics.field118.iterator();
                if (arg0 == 7507) {
                    field861[++Statics.field855 - 1] = Statics.field118.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hm.cx(ILdp;ZB)I")
    public static int method3868(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("lk.cu(ILdp;ZI)I")
    public static int method5467(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field855--;
            int var3 = field861[Statics.field855];
            int var4 = field852[var3];
            class543.method2718(field853[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field855 -= 3;
            int var5 = field861[Statics.field855];
            int var6 = field861[Statics.field855 + 1];
            int var7 = field861[Statics.field855 + 2];
            int var8 = field852[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class449.method7694(field853[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lt.cz(IB)V")
    public static void method5469(int arg0) {
        if (arg0 == -1 || !Statics.field2667.method5980(arg0)) {
            return;
        }
        class361[] var1 = Statics.field2667.field3709[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class361 var3 = var1[var2];
            if (var3.field3894 != null) {
                class90 var4 = new class90();
                var4.field1065 = var3;
                var4.field1072 = var3.field3894;
                method8669(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("pg.cm(ILnv;ZI)V")
    public static void method6878(int arg0, class350 arg1, boolean arg2) {
        class284 var3 = client.method5905().method8323(arg0);
        int var4 = Statics.field2672.field1130;
        int var5 = (Statics.field2672.field1249 >> 7) + Statics.field4799.field1311;
        int var6 = (Statics.field2672.field1180 >> 7) + Statics.field4799.field1319;
        class350 var7 = new class350(var4, var5, var6);
        client.method5905().method8310(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("bn.ct(Luy;I)Ljava/lang/Object;")
    public static Object method808(class536 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5296) {
            case 0:
                return field861[--Statics.field855];
            case 2:
                return field856[--Statics.field2444];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("qm.cl(IB)Ljava/lang/Object;")
    public static Object method7187(int arg0) {
        return method808((class536) class403.method3083(class536.method8659(), arg0));
    }
}
