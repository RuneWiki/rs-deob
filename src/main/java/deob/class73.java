package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cm")
public class class73 {

    @ObfuscatedName("cm.ay")
    public static int[] field854 = new int[5];

    @ObfuscatedName("cm.as")
    public static int[][] field855 = new int[5][5000];

    @ObfuscatedName("cm.ae")
    public static int[] field865 = new int[1000];

    @ObfuscatedName("cm.at")
    public static String[] field857 = new String[1000];

    @ObfuscatedName("cm.an")
    public static int field860 = 0;

    @ObfuscatedName("cm.ao")
    public static class64[] field851 = new class64[50];

    @ObfuscatedName("cm.ad")
    public static Calendar field861 = Calendar.getInstance();

    @ObfuscatedName("cm.ac")
    public static final String[] field862 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cm.ax")
    public static boolean field856 = false;

    @ObfuscatedName("cm.aq")
    public static boolean field864 = false;

    @ObfuscatedName("cm.al")
    public static ArrayList field858 = new ArrayList();

    @ObfuscatedName("cm.aa")
    public static int field866 = 0;

    @ObfuscatedName("cm.bv")
    public static final double field867 = Math.log(2.0D);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sr.ap(Ldt;I)V")
    public static void method8429(class91 arg0) {
        Statics.method2248(arg0, 500000, 475000);
    }

    @ObfuscatedName("tt.ak(Ldt;Lda;IIB)V")
    public static void method8564(class91 arg0, class82 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1103;
        Statics.field1186 = 0;
        Statics.field2169 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1004;
        int[] var7 = arg1.field1006;
        byte var8 = -1;
        field860 = 0;
        field856 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field1695 = new int[arg1.field1008];
            int var11 = 0;
            Statics.field853 = new String[arg1.field1005];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1108;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1098;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1101 == null ? -1 : arg0.field1101.field3878;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1102;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1101 == null ? -1 : arg0.field1101.field3879;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1105 == null ? -1 : arg0.field1105.field3878;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1105 == null ? -1 : arg0.field1105.field3879;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1106;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1107;
                    }
                    if (var14 == -2147483638) {
                        var14 = arg0.field1104;
                    }
                    Statics.field1695[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1100;
                    }
                    Statics.field853[var12++] = var15;
                }
            }
            field866 = arg0.field1109;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field1006[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method6906(var59, arg1, var46);
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
                    field865[++Statics.field1186 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field865[++Statics.field1186 - 1] = class350.field3773[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class350.field3773[var17] = field865[--Statics.field1186];
                    client.method6326(var17);
                } else if (var59 == 3) {
                    field857[++Statics.field2169 - 1] = arg1.field1007[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field1186 -= 2;
                    if (field865[Statics.field1186] != field865[Statics.field1186 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field1186 -= 2;
                    if (field865[Statics.field1186] == field865[Statics.field1186 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field1186 -= 2;
                    if (field865[Statics.field1186] < field865[Statics.field1186 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field1186 -= 2;
                    if (field865[Statics.field1186] > field865[Statics.field1186 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field860 == 0) {
                        return;
                    }
                    class64 var19 = field851[--field860];
                    arg1 = var19.field446;
                    var6 = arg1.field1004;
                    var7 = arg1.field1006;
                    var5 = var19.field443;
                    Statics.field1695 = var19.field445;
                    Statics.field853 = var19.field444;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field865[++Statics.field1186 - 1] = class350.method2339(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class350.method5796(var21, field865[--Statics.field1186]);
                } else if (var59 == 31) {
                    Statics.field1186 -= 2;
                    if (field865[Statics.field1186] <= field865[Statics.field1186 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field1186 -= 2;
                    if (field865[Statics.field1186] >= field865[Statics.field1186 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field865[++Statics.field1186 - 1] = Statics.field1695[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field1695[var7[var5]] = field865[--Statics.field1186];
                } else if (var59 == 35) {
                    field857[++Statics.field2169 - 1] = Statics.field853[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field853[var7[var5]] = field857[--Statics.field2169];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field2169 -= var22;
                    String var23 = class420.method377(field857, Statics.field2169, var22);
                    field857[++Statics.field2169 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field1186--;
                } else if (var59 == 39) {
                    Statics.field2169--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class82 var25 = class82.method5804(var24);
                    int[] var26 = new int[var25.field1008];
                    String[] var27 = new String[var25.field1005];
                    for (int var28 = 0; var28 < var25.field1010; var28++) {
                        var26[var28] = field865[Statics.field1186 - var25.field1010 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field1011; var29++) {
                        var27[var29] = field857[Statics.field2169 - var25.field1011 + var29];
                    }
                    Statics.field1186 -= var25.field1010;
                    Statics.field2169 -= var25.field1011;
                    class64 var30 = new class64();
                    var30.field446 = arg1;
                    var30.field443 = var5;
                    var30.field445 = Statics.field1695;
                    var30.field444 = Statics.field853;
                    field851[++field860 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field1004;
                    var7 = var25.field1006;
                    var5 = -1;
                    Statics.field1695 = var26;
                    Statics.field853 = var27;
                } else if (var59 == 42) {
                    field865[++Statics.field1186 - 1] = Statics.field5155.method3005(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field5155.method3013(var7[var5], field865[--Statics.field1186]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field865[--Statics.field1186];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field854[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field855[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field865[--Statics.field1186];
                    if (var37 < 0 || var37 >= field854[var36]) {
                        throw new RuntimeException();
                    }
                    field865[++Statics.field1186 - 1] = field855[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field1186 -= 2;
                    int var39 = field865[Statics.field1186];
                    if (var39 < 0 || var39 >= field854[var38]) {
                        throw new RuntimeException();
                    }
                    field855[var38][var39] = field865[Statics.field1186 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field5155.method2987(var7[var5]);
                    if (var40 == null) {
                        var40 = class383.field4405;
                    }
                    field857[++Statics.field2169 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field5155.method2989(var7[var5], field857[--Statics.field2169]);
                } else if (var59 == 49) {
                    String var41 = Statics.field5155.method3006(var7[var5]);
                    field857[++Statics.field2169 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field5155.method3022(var7[var5], field857[--Statics.field2169]);
                } else if (var59 == 60) {
                    class530 var42 = arg1.field1012[var7[var5]];
                    class514 var43 = (class514) var42.method8985((long) field865[--Statics.field1186]);
                    if (var43 != null) {
                        var5 += var43.field5168;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field5353.method3451(var7[var5]);
                    if (var44 == null) {
                        field865[++Statics.field1186 - 1] = -1;
                    } else {
                        field865[++Statics.field1186 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field5380.method8567(var7[var5]);
                    if (var45 == null) {
                        field865[++Statics.field1186 - 1] = -1;
                    } else {
                        field865[++Statics.field1186 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field5170).append(" ");
            for (int var51 = field860 - 1; var51 >= 0; var51--) {
                var50.append("").append(field851[var51].field446.field5170).append(" ");
            }
            var50.append("").append(var8);
            class584.method8201(var50.toString(), var57);
        } finally {
            while (field858.size() > 0) {
                class108 var54 = (class108) field858.remove(0);
                client.method3367(var54.method2918(), var54.method2910(), var54.method2911(), var54.method2912(), "");
            }
            if (field856) {
                field856 = false;
                client.method1192();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class584.method8201("Warning: Script " + arg1.field1003 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("ok.aj(ILda;ZI)I")
    public static int method6906(int arg0, class82 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3433(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1233(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1236(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1216(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method6927(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method6898(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method7227(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5794(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method7212(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1137(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2247(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1233(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1236(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1216(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method6927(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method6898(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method8203(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method872(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1108(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method7085(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2247(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method319(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method9127(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3562(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method8631(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method1871(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method8213(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2839(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method3356(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method6000(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1105(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3539(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3353(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method6899(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3099(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3844(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2256(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method3300(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2180(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method3531(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method3414(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method2568(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method3578(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method6196(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method6313(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method1217(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method2295(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method325(arg0, arg1, arg2);
        } else if (arg0 < 8000) {
            return method283(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method6926(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fi.ai(ILda;ZB)I")
    public static int method3433(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1186 -= 3;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            int var5 = field865[Statics.field1186 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class362 var6 = Statics.field4741.method6314(var3);
            if (var6.field4009 == null) {
                var6.field4009 = new class362[var5 + 1];
            }
            if (var6.field4009.length <= var5) {
                class362[] var7 = new class362[var5 + 1];
                for (int var8 = 0; var8 < var6.field4009.length; var8++) {
                    var7[var8] = var6.field4009[var8];
                }
                var6.field4009 = var7;
            }
            if (var5 > 0 && var6.field4009[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class362 var9 = new class362();
            var9.field3881 = var4;
            var9.field3898 = var9.field3878 = var6.field3878;
            var9.field3879 = var5;
            var9.field3929 = true;
            if (var4 == 12) {
                method5762(var9);
            }
            var6.field4009[var5] = var9;
            if (arg2) {
                Statics.field5528 = var9;
            } else {
                Statics.field75 = var9;
            }
            client.method2944(var6);
            return 1;
        } else if (arg0 == 101) {
            class362 var10 = arg2 ? Statics.field5528 : Statics.field75;
            class362 var11 = Statics.field4741.method6314(var10.field3878);
            var11.field4009[var10.field3879] = null;
            client.method2944(var11);
            return 1;
        } else if (arg0 == 102) {
            class362 var12 = Statics.field4741.method6314(field865[--Statics.field1186]);
            var12.field4009 = null;
            client.method2944(var12);
            return 1;
        } else if (arg0 == 105) {
            Statics.field1186 -= 2;
            int var13 = field865[Statics.field1186];
            int var14 = field865[Statics.field1186 + 1];
            class362 var15 = Statics.field4741.method6314(var13);
            class362 var16 = Statics.field4741.method6298(var13, var14);
            if (var15 == null) {
                throw new RuntimeException("");
            } else if (var14 < 0) {
                throw new RuntimeException("");
            } else if (var16 == null) {
                throw new RuntimeException("");
            } else if (var15.field4009 == null) {
                throw new RuntimeException("");
            } else {
                int var17 = var15.field4009.length;
                class362[] var18 = new class362[var17 + 1];
                System.arraycopy(var15.field4009, 0, var18, 0, var15.field4009.length);
                var15.field4009 = var18;
                class362 var19 = new class362(var16, var17);
                if (var16.field3881 == 12) {
                    method5762(var19);
                }
                var15.field4009[var17] = var19;
                if (arg2) {
                    Statics.field5528 = var19;
                } else {
                    Statics.field75 = var19;
                }
                client.method2944(var15);
                return 1;
            }
        } else if (arg0 == 200) {
            Statics.field1186 -= 2;
            int var20 = field865[Statics.field1186];
            int var21 = field865[Statics.field1186 + 1];
            class362 var22 = Statics.field4741.method6298(var20, var21);
            if (var22 == null || var21 == -1) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
                if (arg2) {
                    Statics.field5528 = var22;
                } else {
                    Statics.field75 = var22;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class362 var23 = Statics.field4741.method6314(field865[--Statics.field1186]);
            if (var23 == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
                if (arg2) {
                    Statics.field5528 = var23;
                } else {
                    Statics.field75 = var23;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.ay(ILda;ZI)I")
    public static int method1233(int arg0, class82 arg1, boolean arg2) {
        int var3 = -1;
        class362 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field865[--Statics.field1186];
            var4 = Statics.field4741.method6314(var3);
        } else {
            var4 = arg2 ? Statics.field5528 : Statics.field75;
        }
        if (arg0 == 1000) {
            Statics.field1186 -= 4;
            var4.field3933 = field865[Statics.field1186];
            var4.field3882 = field865[Statics.field1186 + 1];
            var4.field3884 = field865[Statics.field1186 + 2];
            var4.field3885 = field865[Statics.field1186 + 3];
            client.method2944(var4);
            Statics.field995.method1264(var4);
            if (var3 != -1 && var4.field3881 == 0) {
                client.method861(Statics.field4741.field3785[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1186 -= 4;
            var4.field3938 = field865[Statics.field1186];
            var4.field3891 = field865[Statics.field1186 + 1];
            var4.field3886 = field865[Statics.field1186 + 2];
            var4.field3968 = field865[Statics.field1186 + 3];
            client.method2944(var4);
            Statics.field995.method1264(var4);
            if (var3 != -1 && var4.field3881 == 0) {
                client.method861(Statics.field4741.field3785[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field865[--Statics.field1186] == 1;
            if (var4.field3899 != var5) {
                var4.field3899 = var5;
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field4032 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field4033 = field865[--Statics.field1186] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.as(ILda;ZS)I")
    public static int method1236(int arg0, class82 arg1, boolean arg2) {
        int var3 = -1;
        class362 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field865[--Statics.field1186];
            var4 = Statics.field4741.method6314(var3);
        } else {
            var4 = arg2 ? Statics.field5528 : Statics.field75;
        }
        if (arg0 == 1100) {
            Statics.field1186 -= 2;
            int var5 = field865[Statics.field1186];
            int var6 = field865[Statics.field1186 + 1];
            if (var4.field3881 == 12) {
                class360 var7 = var4.method6707();
                if (var7 != null && var7.method6655(var5, var6)) {
                    client.method2944(var4);
                }
            } else {
                var4.field3900 = var5;
                if (var4.field3900 > var4.field3902 - var4.field3894) {
                    var4.field3900 = var4.field3902 - var4.field3894;
                }
                if (var4.field3900 < 0) {
                    var4.field3900 = 0;
                }
                var4.field3901 = var6;
                if (var4.field3901 > var4.field3903 - var4.field3895) {
                    var4.field3901 = var4.field3903 - var4.field3895;
                }
                if (var4.field3901 < 0) {
                    var4.field3901 = 0;
                }
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3904 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3908 = field865[--Statics.field1186] == 1;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3910 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3912 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3914 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3981 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3918 = field865[--Statics.field1186] == 1;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field4034 = 1;
            var4.field4017 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1186 -= 6;
            var4.field3889 = field865[Statics.field1186];
            var4.field3927 = field865[Statics.field1186 + 1];
            var4.field3931 = field865[Statics.field1186 + 2];
            var4.field3932 = field865[Statics.field1186 + 3];
            var4.field3977 = field865[Statics.field1186 + 4];
            var4.field3967 = field865[Statics.field1186 + 5];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field865[--Statics.field1186];
            if (var4.field3973 != var8) {
                var4.field3973 = var8;
                var4.field4020 = 0;
                var4.field4021 = 0;
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field4019 = field865[--Statics.field1186] == 1;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field857[--Statics.field2169];
            if (var4.field3881 == 12) {
                class360 var10 = var4.method6707();
                if (var10 != null && var10.method6468()) {
                    var10.method6415(var9);
                } else {
                    var4.field4013 = var9;
                }
                client.method2944(var4);
            } else if (!var9.equals(var4.field4013)) {
                var4.field4013 = var9;
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3941 = field865[--Statics.field1186];
            if (var4.field3881 == 12) {
                class360 var11 = var4.method6707();
                if (var11 != null) {
                    var11.method6429();
                }
            }
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1186 -= 3;
            if (var4.field3881 == 12) {
                class360 var12 = var4.method6707();
                if (var12 != null) {
                    var12.method6610(field865[Statics.field1186], field865[Statics.field1186 + 1]);
                    var12.method6515(field865[Statics.field1186 + 2]);
                }
            } else {
                var4.field3972 = field865[Statics.field1186];
                var4.field3946 = field865[Statics.field1186 + 1];
                var4.field3944 = field865[Statics.field1186 + 2];
            }
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3947 = field865[--Statics.field1186] == 1;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3935 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3920 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3921 = field865[--Statics.field1186] == 1;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3922 = field865[--Statics.field1186] == 1;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1186 -= 2;
            var4.field3902 = field865[Statics.field1186];
            var4.field3903 = field865[Statics.field1186 + 1];
            client.method2944(var4);
            if (var3 != -1 && var4.field3881 == 0) {
                client.method861(Statics.field4741.field3785[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method6910(var4.field3878, var4.field3879);
            client.field671 = var4;
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field4022 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3905 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3893 = field865[--Statics.field1186];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field865[--Statics.field1186];
            class570 var14 = (class570) class406.method3580(class570.method8928(), var13);
            if (var14 != null) {
                var4.field3909 = var14;
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field865[--Statics.field1186] == 1;
            var4.field3913 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field865[--Statics.field1186] == 1;
            var4.field3939 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3916 = field857[--Statics.field2169];
            client.method2944(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6698(field857[--Statics.field2169], "", Statics.field3067, client.method3293());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field1186 -= 2;
            var4.method6713(field865[Statics.field1186], field865[Statics.field1186 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6714(field857[--Statics.field2169], field865[--Statics.field1186]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field1186--;
            class354 var17 = var4.method6728();
            if (var17 != null) {
                var17.field3795 = field865[Statics.field1186];
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field1186--;
            class354 var18 = var4.method6728();
            if (var18 != null) {
                var18.field3794 = field865[Statics.field1186];
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field2169--;
            class360 var19 = var4.method6707();
            if (var19 != null) {
                var4.field3943 = field857[Statics.field2169];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field1186--;
            class354 var20 = var4.method6728();
            if (var20 != null) {
                var20.field3796 = field865[Statics.field1186];
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field1186--;
            class360 var21 = var4.method6707();
            if (var21 != null && var21.method6419(field865[Statics.field1186])) {
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field1186--;
            class360 var22 = var4.method6707();
            if (var22 != null && var22.method6629(field865[Statics.field1186])) {
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field1186--;
            class360 var23 = var4.method6707();
            if (var23 != null && var23.method6421(field865[Statics.field1186])) {
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field865[--Statics.field1186] == 1;
            client.field755.method5225();
            class360 var25 = var4.method6707();
            if (var25 != null && var25.method6618(var24)) {
                if (var24) {
                    client.field755.method5224(var4);
                }
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field865[--Statics.field1186] == 1;
            if (!var26 && client.field755.method5230() == var4) {
                client.field755.method5225();
                client.method2944(var4);
            }
            class360 var27 = var4.method6707();
            if (var27 != null) {
                var27.method6414(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field1186 -= 2;
            class360 var28 = var4.method6707();
            if (var28 != null && var28.method6560(field865[Statics.field1186], field865[Statics.field1186 + 1])) {
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field1186--;
            class360 var29 = var4.method6707();
            if (var29 != null && var29.method6560(field865[Statics.field1186], field865[Statics.field1186])) {
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field1186--;
            class360 var30 = var4.method6707();
            if (var30 != null) {
                var30.method6426(field865[Statics.field1186]);
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field1186--;
            class360 var31 = var4.method6707();
            if (var31 != null) {
                var31.method6425(field865[Statics.field1186]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field1186--;
            class360 var32 = var4.method6707();
            if (var32 != null) {
                var32.method6428(field865[Statics.field1186]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field1186--;
            class360 var33 = var4.method6707();
            if (var33 != null) {
                var33.method6427(field865[Statics.field1186]);
                client.method2944(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field1186 -= 2;
            class28 var34 = var4.method6729();
            if (var34 != null) {
                var34.method390(field865[Statics.field1186], field865[Statics.field1186 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field1186 -= 2;
            class28 var35 = var4.method6729();
            if (var35 != null) {
                var35.method395((char) field865[Statics.field1186], field865[Statics.field1186 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6744(field857[--Statics.field2169], Statics.field3067);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field2169 -= 3;
            String var36 = field857[Statics.field2169];
            String var37 = field857[Statics.field2169 + 1];
            String var38 = field857[Statics.field2169 + 2];
            long var39 = client.method3293();
            long var41 = client.method375();
            String var43 = client.method682().method8685(client.method682().field5186);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6711(var36, var37, var38, var43, Long.toString(var41), Statics.field3067);
            return 1;
        } else if (arg0 != 1152) {
            return 2;
        } else if (var4.field3881 == 11) {
            class217 var44 = var4.method6723();
            boolean var45 = var44 != null && var44.method4164() && class226.method7443().method4285(var44.method4158());
            field865[++Statics.field1186 - 1] = var45 ? 1 : 0;
            return 1;
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cx.ae(ILda;ZI)I")
    public static int method1216(int arg0, class82 arg1, boolean arg2) {
        class362 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field4741.method6314(field865[--Statics.field1186]);
        } else {
            var3 = arg2 ? Statics.field5528 : Statics.field75;
        }
        client.method2944(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1186 -= 2;
            int var9 = field865[Statics.field1186];
            int var10 = field865[Statics.field1186 + 1];
            var3.field4018 = var9;
            var3.field4027 = var10;
            class211 var11 = class211.method7530(var9);
            var3.field3931 = var11.field2262;
            var3.field3932 = var11.field2246;
            var3.field3977 = var11.field2287;
            var3.field3889 = var11.field2256;
            var3.field3927 = var11.field2245;
            var3.field3967 = var11.field2244;
            if (arg0 == 1205) {
                var3.field3940 = 0;
            } else if (arg0 == 1212 | var11.field2250 == 1) {
                var3.field3940 = 1;
            } else {
                var3.field3940 = 2;
            }
            if (var3.field3924 > 0) {
                var3.field3967 = var3.field3967 * 32 / var3.field3924;
            } else if (var3.field3938 > 0) {
                var3.field3967 = var3.field3967 * 32 / var3.field3938;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field4034 = 2;
            var3.field4017 = field865[--Statics.field1186];
            return 1;
        } else if (arg0 == 1202) {
            var3.field4034 = 3;
            var3.field4017 = Statics.field3772.field1136.method6358();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field865[--Statics.field1186] == 1;
            var3.method6733(Statics.field3772.field1136, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field865[--Statics.field1186];
            if (var3.field3937 == null) {
                throw new RuntimeException("");
            }
            var3.field3937.method6345(var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field1186 -= 2;
            int var6 = field865[Statics.field1186];
            int var7 = field865[Statics.field1186 + 1];
            if (var3.field3937 == null) {
                throw new RuntimeException("");
            }
            var3.field3937.method6329(var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field865[--Statics.field1186];
            if (var3.field3937 == null) {
                throw new RuntimeException("");
            }
            var3.field3937.method6342(Statics.field3772.field1136.field3821, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ob.am(ILda;ZB)I")
    public static int method6927(int arg0, class82 arg1, boolean arg2) {
        boolean var3 = true;
        class362 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field4741.method6314(field865[--Statics.field1186]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field5528 : Statics.field75;
        }
        if (arg0 == 1300) {
            int var5 = field865[--Statics.field1186] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6763(var5, field857[--Statics.field2169]);
                return 1;
            } else {
                Statics.field2169--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1186 -= 2;
            int var6 = field865[Statics.field1186];
            int var7 = field865[Statics.field1186 + 1];
            var4.field3961 = Statics.field4741.method6298(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3970 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3936 = field865[--Statics.field1186];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3969 = field865[--Statics.field1186];
            return 1;
        } else if (arg0 == 1305) {
            var4.field4028 = field857[--Statics.field2169];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3988 = field857[--Statics.field2169];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3964 = null;
            var4.field3965 = (String[][]) null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3963 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1186--;
            return 1;
        } else if (arg0 == 1310) {
            int var8 = field865[--Statics.field1186] - 1;
            if (var8 < 0 || var8 > 9 || var4.field3965 == null) {
                return 1;
            } else {
                var4.field3965[var8] = null;
                return 1;
            }
        } else if (arg0 == 1311) {
            int var9 = field865[--Statics.field1186] - 1;
            int var10 = field865[--Statics.field1186] - 1;
            if (var10 < 0 || var10 > 9 || var9 < 0) {
                throw new RuntimeException();
            }
            var4.method6850(var10, var9, field857[--Statics.field2169]);
            return 1;
        } else if (arg0 == 1312) {
            int var11 = field865[--Statics.field1186];
            if (var11 == -1) {
                var4.field3926 = 4;
            } else if (var11 >= 1 && var11 <= 10) {
                var4.field3926 = var11 - 1;
            }
            return 1;
        } else if (arg0 == 1350) {
            byte[] var12 = null;
            byte[] var13 = null;
            if (var3) {
                Statics.field1186 -= 10;
                int var14;
                for (var14 = 0; var14 < 10 && field865[Statics.field1186 + var14] >= 0; var14 += 2) {
                }
                if (var14 > 0) {
                    var12 = new byte[var14 / 2];
                    var13 = new byte[var14 / 2];
                    for (var14 -= 2; var14 >= 0; var14 -= 2) {
                        var12[var14 / 2] = (byte) field865[Statics.field1186 + var14];
                        var13[var14 / 2] = (byte) field865[Statics.field1186 + var14 + 1];
                    }
                }
            } else {
                Statics.field1186 -= 2;
                var12 = new byte[] { (byte) field865[Statics.field1186] };
                var13 = new byte[] { (byte) field865[Statics.field1186 + 1] };
            }
            int var15 = field865[--Statics.field1186] - 1;
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method3223(var4, var15, var12, var13);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1186 -= 2;
            byte var16 = 10;
            byte[] var17 = new byte[] { (byte) field865[Statics.field1186] };
            byte[] var18 = new byte[] { (byte) field865[Statics.field1186 + 1] };
            method3223(var4, var16, var17, var18);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1186 -= 3;
            int var19 = field865[Statics.field1186] - 1;
            int var20 = field865[Statics.field1186 + 1];
            int var21 = field865[Statics.field1186 + 2];
            if (var19 < 0 || var19 > 9) {
                throw new RuntimeException();
            }
            method3784(var4, var19, var20, var21);
            return 1;
        } else if (arg0 == 1353) {
            byte var22 = 10;
            int var23 = field865[--Statics.field1186];
            int var24 = field865[--Statics.field1186];
            method3784(var4, var22, var23, var24);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1186--;
            int var25 = field865[Statics.field1186] - 1;
            if (var25 < 0 || var25 > 9) {
                throw new RuntimeException();
            }
            method6878(var4, var25);
            return 1;
        } else if (arg0 == 1355) {
            byte var26 = 10;
            method6878(var4, var26);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.at(Lng;I[B[BI)V")
    public static final void method3223(class362 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3959 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3959 = new byte[11][];
            arg0.field3960 = new byte[11][];
            arg0.field3996 = new int[11];
            arg0.field3962 = new int[11];
        }
        arg0.field3959[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3958 = false;
            for (int var4 = 0; var4 < arg0.field3959.length; var4++) {
                if (arg0.field3959[var4] != null) {
                    arg0.field3958 = true;
                    break;
                }
            }
        } else {
            arg0.field3958 = true;
        }
        arg0.field3960[arg1] = arg3;
    }

    @ObfuscatedName("hy.au(Lng;IIII)V")
    public static final void method3784(class362 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3996 == null) {
            throw new RuntimeException();
        }
        arg0.field3996[arg1] = arg2;
        arg0.field3962[arg1] = arg3;
    }

    @ObfuscatedName("oh.an(Lng;II)V")
    public static final void method6878(class362 arg0, int arg1) {
        if (arg0.field3959 == null) {
            throw new RuntimeException();
        }
        if (arg0.field4031 == null) {
            arg0.field4031 = new int[arg0.field3959.length];
        }
        arg0.field4031[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("oa.ao(ILda;ZI)I")
    public static int method6898(int arg0, class82 arg1, boolean arg2) {
        class362 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field4741.method6314(field865[--Statics.field1186]);
        } else {
            var3 = arg2 ? Statics.field5528 : Statics.field75;
        }
        String var4 = field857[--Statics.field2169];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field865[--Statics.field1186];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field865[--Statics.field1186];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field857[--Statics.field2169];
            } else {
                var7[var8] = Integer.valueOf(field865[--Statics.field1186]);
            }
        }
        int var9 = field865[--Statics.field1186];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3974 = var7;
        } else if (arg0 == 1401) {
            var3.field3934 = var7;
        } else if (arg0 == 1402) {
            var3.field3976 = var7;
        } else if (arg0 == 1403) {
            var3.field3978 = var7;
        } else if (arg0 == 1404) {
            var3.field3915 = var7;
        } else if (arg0 == 1405) {
            var3.field3986 = var7;
        } else if (arg0 == 1406) {
            var3.field3925 = var7;
        } else if (arg0 == 1407) {
            var3.field3985 = var7;
            var3.field3949 = var5;
        } else if (arg0 == 1408) {
            var3.field3991 = var7;
        } else if (arg0 == 1409) {
            var3.field3890 = var7;
        } else if (arg0 == 1410) {
            var3.field3896 = var7;
        } else if (arg0 == 1411) {
            var3.field3975 = var7;
        } else if (arg0 == 1412) {
            var3.field3979 = var7;
        } else if (arg0 == 1414) {
            var3.field3987 = var7;
            var3.field3923 = var5;
        } else if (arg0 == 1415) {
            var3.field3989 = var7;
            var3.field3990 = var5;
        } else if (arg0 == 1416) {
            var3.field3983 = var7;
        } else if (arg0 == 1417) {
            var3.field3994 = var7;
        } else if (arg0 == 1418) {
            var3.field3995 = var7;
        } else if (arg0 == 1419) {
            var3.field3955 = var7;
        } else if (arg0 == 1420) {
            var3.field3999 = var7;
        } else if (arg0 == 1421) {
            var3.field3942 = var7;
        } else if (arg0 == 1422) {
            var3.field4003 = var7;
        } else if (arg0 == 1423) {
            var3.field3982 = var7;
        } else if (arg0 == 1424) {
            var3.field4005 = var7;
        } else if (arg0 == 1425) {
            var3.field4001 = var7;
        } else if (arg0 == 1426) {
            var3.field4008 = var7;
        } else if (arg0 == 1427) {
            var3.field4006 = var7;
        } else if (arg0 == 1428) {
            var3.field3966 = var7;
        } else if (arg0 == 1429) {
            var3.field4002 = var7;
        } else if (arg0 == 1430) {
            var3.field3917 = var7;
        } else if (arg0 == 1431) {
            var3.field3998 = var7;
        } else if (arg0 == 1434) {
            var3.field3992 = var7;
        } else if (arg0 == 1435) {
            var3.field3919 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class358 var10 = var3.method6690();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3813 = var7;
                } else if (arg0 == 1437) {
                    var10.field3812 = var7;
                } else if (arg0 == 1438) {
                    var10.field3815 = var7;
                } else if (arg0 == 1439) {
                    var10.field3809 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3930 = true;
        return 1;
    }

    @ObfuscatedName("pn.af(ILda;ZI)I")
    public static int method7227(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = arg2 ? Statics.field5528 : Statics.field75;
        if (arg0 == 1500) {
            field865[++Statics.field1186 - 1] = var3.field3892;
            return 1;
        } else if (arg0 == 1501) {
            field865[++Statics.field1186 - 1] = var3.field4004;
            return 1;
        } else if (arg0 == 1502) {
            field865[++Statics.field1186 - 1] = var3.field3894;
            return 1;
        } else if (arg0 == 1503) {
            field865[++Statics.field1186 - 1] = var3.field3895;
            return 1;
        } else if (arg0 == 1504) {
            field865[++Statics.field1186 - 1] = var3.field3899 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field865[++Statics.field1186 - 1] = var3.field3898;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lk.ar(ILda;ZI)I")
    public static int method5794(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = arg2 ? Statics.field5528 : Statics.field75;
        if (arg0 == 1600) {
            field865[++Statics.field1186 - 1] = var3.field3900;
            return 1;
        } else if (arg0 == 1601) {
            field865[++Statics.field1186 - 1] = var3.field3901;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3881 == 12) {
                class360 var4 = var3.method6707();
                if (var4 != null) {
                    field857[++Statics.field2169 - 1] = var4.method6460().method7781();
                    return 1;
                }
            }
            field857[++Statics.field2169 - 1] = var3.field4013;
            return 1;
        } else if (arg0 == 1603) {
            field865[++Statics.field1186 - 1] = var3.field3902;
            return 1;
        } else if (arg0 == 1604) {
            field865[++Statics.field1186 - 1] = var3.field3903;
            return 1;
        } else if (arg0 == 1605) {
            field865[++Statics.field1186 - 1] = var3.field3967;
            return 1;
        } else if (arg0 == 1606) {
            field865[++Statics.field1186 - 1] = var3.field3931;
            return 1;
        } else if (arg0 == 1607) {
            field865[++Statics.field1186 - 1] = var3.field3977;
            return 1;
        } else if (arg0 == 1608) {
            field865[++Statics.field1186 - 1] = var3.field3932;
            return 1;
        } else if (arg0 == 1609) {
            field865[++Statics.field1186 - 1] = var3.field3910;
            return 1;
        } else if (arg0 == 1610) {
            field865[++Statics.field1186 - 1] = var3.field3893;
            return 1;
        } else if (arg0 == 1611) {
            field865[++Statics.field1186 - 1] = var3.field3904;
            return 1;
        } else if (arg0 == 1612) {
            field865[++Statics.field1186 - 1] = var3.field3905;
            return 1;
        } else if (arg0 == 1613) {
            field865[++Statics.field1186 - 1] = var3.field3909.method37();
            return 1;
        } else if (arg0 == 1614) {
            field865[++Statics.field1186 - 1] = var3.field3939 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class354 var5 = var3.method6728();
                field865[++Statics.field1186 - 1] = var5 == null ? 0 : var5.field3795;
            }
            if (arg0 == 1618) {
                class354 var6 = var3.method6728();
                field865[++Statics.field1186 - 1] = var6 == null ? 0 : var6.field3794;
                return 1;
            } else if (arg0 == 1619) {
                class360 var7 = var3.method6707();
                field857[++Statics.field2169 - 1] = var7 == null ? "" : var7.method6514().method7781();
                return 1;
            } else if (arg0 == 1620) {
                class354 var8 = var3.method6728();
                field865[++Statics.field1186 - 1] = var8 == null ? 0 : var8.field3796;
                return 1;
            } else if (arg0 == 1621) {
                class360 var9 = var3.method6707();
                field865[++Statics.field1186 - 1] = var9 == null ? 0 : var9.method6472();
                return 1;
            } else if (arg0 == 1622) {
                class360 var10 = var3.method6707();
                field865[++Statics.field1186 - 1] = var10 == null ? 0 : var10.method6570();
                return 1;
            } else if (arg0 == 1623) {
                class360 var11 = var3.method6707();
                field865[++Statics.field1186 - 1] = var11 == null ? 0 : var11.method6473();
                return 1;
            } else if (arg0 == 1624) {
                class360 var12 = var3.method6707();
                field865[++Statics.field1186 - 1] = var12 != null && var12.method6463() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class360 var13 = var3.method6707();
                field865[++Statics.field1186 - 1] = var13 != null && var13.method6464() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class360 var14 = var3.method6707();
                field857[++Statics.field2169 - 1] = var14 == null ? "" : var14.method6457().method8025();
                return 1;
            } else if (arg0 == 1627) {
                class360 var15 = var3.method6707();
                int var16 = var15 == null ? 0 : var15.method6467();
                int var17 = var15 == null ? 0 : var15.method6466();
                field865[++Statics.field1186 - 1] = Math.min(var16, var17);
                field865[++Statics.field1186 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class360 var18 = var3.method6707();
                field865[++Statics.field1186 - 1] = var18 == null ? 0 : var18.method6466();
                return 1;
            } else if (arg0 == 1629) {
                class360 var19 = var3.method6707();
                field865[++Statics.field1186 - 1] = var19 == null ? 0 : var19.method6475();
                return 1;
            } else if (arg0 == 1630) {
                class360 var20 = var3.method6707();
                field865[++Statics.field1186 - 1] = var20 == null ? 0 : var20.method6474();
                return 1;
            } else if (arg0 == 1631) {
                class360 var21 = var3.method6707();
                field865[++Statics.field1186 - 1] = var21 == null ? 0 : var21.method6480();
                return 1;
            } else if (arg0 == 1632) {
                class360 var22 = var3.method6707();
                field865[++Statics.field1186 - 1] = var22 == null ? 0 : var22.method6573();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6729();
                field865[Statics.field1186 - 1] = var23 == null ? 0 : var23.method392(field865[Statics.field1186 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6729();
                field865[Statics.field1186 - 1] = var24 == null ? 0 : var24.method430((char) field865[Statics.field1186 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("px.ab(ILda;ZI)I")
    public static int method7212(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = arg2 ? Statics.field5528 : Statics.field75;
        if (arg0 == 1700) {
            field865[++Statics.field1186 - 1] = var3.field4018;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field4018 == -1) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var3.field4027;
            }
            return 1;
        } else if (arg0 == 1702) {
            field865[++Statics.field1186 - 1] = var3.field3879;
            return 1;
        } else if (arg0 == 1707) {
            field865[++Statics.field1186 - 1] = var3.method6812() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method2374(var3);
        } else if (arg0 == 1709) {
            return method2434(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.az(Lng;I)I")
    public static int method2374(class362 arg0) {
        if (arg0.field3881 == 11) {
            String var1 = field857[--Statics.field2169];
            field865[++Statics.field1186 - 1] = arg0.method6758(var1);
            return 1;
        } else {
            Statics.field2169--;
            field865[++Statics.field1186 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("df.ag(Lng;I)I")
    public static int method2434(class362 arg0) {
        if (arg0.field3881 == 11) {
            String var1 = field857[--Statics.field2169];
            field857[++Statics.field2169 - 1] = arg0.method6838(var1);
            return 1;
        } else {
            field857[Statics.field2169 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("cp.ad(ILda;ZS)I")
    public static int method1137(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = arg2 ? Statics.field5528 : Statics.field75;
        if (arg0 == 1800) {
            field865[++Statics.field1186 - 1] = Statics.method2504(Statics.method3563(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field865[--Statics.field1186];
            int var5 = var4 - 1;
            if (var3.field3964 == null || var5 >= var3.field3964.length || var3.field3964[var5] == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var3.field3964[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field4028 == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var3.field4028;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.ac(ILda;ZI)I")
    public static int method2247(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field866 >= 10) {
                throw new RuntimeException();
            }
            class362 var11;
            if (arg0 >= 2000) {
                var11 = Statics.field4741.method6314(field865[--Statics.field1186]);
            } else {
                var11 = arg2 ? Statics.field5528 : Statics.field75;
            }
            if (var11.field4006 == null) {
                return 0;
            }
            class91 var12 = new class91();
            var12.field1101 = var11;
            var12.field1103 = var11.field4006;
            var12.field1109 = field866 + 1;
            client.field512.method7243(var12);
            return 1;
        } else if (arg0 == 1928) {
            class362 var3 = arg2 ? Statics.field5528 : Statics.field75;
            int var4 = field865[--Statics.field1186];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class108 var5 = new class108(var4, var3.field3878, var3.field3879, var3.field4018);
            field858.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field1186 -= 3;
            int var6 = field865[Statics.field1186];
            int var7 = field865[Statics.field1186 + 1];
            int var8 = field865[Statics.field1186 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class362 var9 = Statics.field4741.method6298(var6, var7);
            if (var9 == null) {
                throw new RuntimeException();
            }
            class108 var10 = new class108(var8, var6, var7, var9.field4018);
            field858.add(var10);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rp.av(ILda;ZB)I")
    public static int method8203(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = Statics.field4741.method6314(field865[--Statics.field1186]);
        if (arg0 == 2500) {
            field865[++Statics.field1186 - 1] = var3.field3892;
            return 1;
        } else if (arg0 == 2501) {
            field865[++Statics.field1186 - 1] = var3.field4004;
            return 1;
        } else if (arg0 == 2502) {
            field865[++Statics.field1186 - 1] = var3.field3894;
            return 1;
        } else if (arg0 == 2503) {
            field865[++Statics.field1186 - 1] = var3.field3895;
            return 1;
        } else if (arg0 == 2504) {
            field865[++Statics.field1186 - 1] = var3.field3899 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field865[++Statics.field1186 - 1] = var3.field3898;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.ax(ILda;ZB)I")
    public static int method872(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = Statics.field4741.method6314(field865[--Statics.field1186]);
        if (arg0 == 2600) {
            field865[++Statics.field1186 - 1] = var3.field3900;
            return 1;
        } else if (arg0 == 2601) {
            field865[++Statics.field1186 - 1] = var3.field3901;
            return 1;
        } else if (arg0 == 2602) {
            field857[++Statics.field2169 - 1] = var3.field4013;
            return 1;
        } else if (arg0 == 2603) {
            field865[++Statics.field1186 - 1] = var3.field3902;
            return 1;
        } else if (arg0 == 2604) {
            field865[++Statics.field1186 - 1] = var3.field3903;
            return 1;
        } else if (arg0 == 2605) {
            field865[++Statics.field1186 - 1] = var3.field3967;
            return 1;
        } else if (arg0 == 2606) {
            field865[++Statics.field1186 - 1] = var3.field3931;
            return 1;
        } else if (arg0 == 2607) {
            field865[++Statics.field1186 - 1] = var3.field3977;
            return 1;
        } else if (arg0 == 2608) {
            field865[++Statics.field1186 - 1] = var3.field3932;
            return 1;
        } else if (arg0 == 2609) {
            field865[++Statics.field1186 - 1] = var3.field3910;
            return 1;
        } else if (arg0 == 2610) {
            field865[++Statics.field1186 - 1] = var3.field3893;
            return 1;
        } else if (arg0 == 2611) {
            field865[++Statics.field1186 - 1] = var3.field3904;
            return 1;
        } else if (arg0 == 2612) {
            field865[++Statics.field1186 - 1] = var3.field3905;
            return 1;
        } else if (arg0 == 2613) {
            field865[++Statics.field1186 - 1] = var3.field3909.method37();
            return 1;
        } else if (arg0 == 2614) {
            field865[++Statics.field1186 - 1] = var3.field3939 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class354 var4 = var3.method6728();
                field865[++Statics.field1186 - 1] = var4 == null ? 0 : var4.field3795;
            }
            if (arg0 == 2618) {
                class354 var5 = var3.method6728();
                field865[++Statics.field1186 - 1] = var5 == null ? 0 : var5.field3794;
                return 1;
            } else if (arg0 == 2619) {
                class360 var6 = var3.method6707();
                field857[++Statics.field2169 - 1] = var6 == null ? "" : var6.method6514().method7781();
                return 1;
            } else if (arg0 == 2620) {
                class354 var7 = var3.method6728();
                field865[++Statics.field1186 - 1] = var7 == null ? 0 : var7.field3796;
                return 1;
            } else if (arg0 == 2621) {
                class360 var8 = var3.method6707();
                field865[++Statics.field1186 - 1] = var8 == null ? 0 : var8.method6472();
                return 1;
            } else if (arg0 == 2622) {
                class360 var9 = var3.method6707();
                field865[++Statics.field1186 - 1] = var9 == null ? 0 : var9.method6570();
                return 1;
            } else if (arg0 == 2623) {
                class360 var10 = var3.method6707();
                field865[++Statics.field1186 - 1] = var10 == null ? 0 : var10.method6473();
                return 1;
            } else if (arg0 == 2624) {
                class360 var11 = var3.method6707();
                field865[++Statics.field1186 - 1] = var11 != null && var11.method6463() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class360 var12 = var3.method6707();
                field865[++Statics.field1186 - 1] = var12 != null && var12.method6464() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class360 var13 = var3.method6707();
                field857[++Statics.field2169 - 1] = var13 == null ? "" : var13.method6457().method8025();
                return 1;
            } else if (arg0 == 2627) {
                class360 var14 = var3.method6707();
                int var15 = var14 == null ? 0 : var14.method6467();
                int var16 = var14 == null ? 0 : var14.method6466();
                field865[++Statics.field1186 - 1] = Math.min(var15, var16);
                field865[++Statics.field1186 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class360 var17 = var3.method6707();
                field865[++Statics.field1186 - 1] = var17 == null ? 0 : var17.method6466();
                return 1;
            } else if (arg0 == 2629) {
                class360 var18 = var3.method6707();
                field865[++Statics.field1186 - 1] = var18 == null ? 0 : var18.method6475();
                return 1;
            } else if (arg0 == 2630) {
                class360 var19 = var3.method6707();
                field865[++Statics.field1186 - 1] = var19 == null ? 0 : var19.method6474();
                return 1;
            } else if (arg0 == 2631) {
                class360 var20 = var3.method6707();
                field865[++Statics.field1186 - 1] = var20 == null ? 0 : var20.method6480();
                return 1;
            } else if (arg0 == 2632) {
                class360 var21 = var3.method6707();
                field865[++Statics.field1186 - 1] = var21 == null ? 0 : var21.method6573();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6729();
                field865[Statics.field1186 - 1] = var22 == null ? 0 : var22.method392(field865[Statics.field1186 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6729();
                field865[Statics.field1186 - 1] = var23 == null ? 0 : var23.method430((char) field865[Statics.field1186 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("co.aq(ILda;ZI)I")
    public static int method1108(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class362 var3 = Statics.field4741.method6314(field865[--Statics.field1186]);
            field865[++Statics.field1186 - 1] = var3.field4018;
            return 1;
        } else if (arg0 == 2701) {
            class362 var4 = Statics.field4741.method6314(field865[--Statics.field1186]);
            if (var4.field4018 == -1) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var4.field4027;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field865[--Statics.field1186];
            class90 var6 = (class90) client.field667.method8993((long) var5);
            if (var6 == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field865[++Statics.field1186 - 1] = client.field723;
            return 1;
        } else if (arg0 == 2707) {
            class362 var7 = Statics.field4741.method6314(field865[--Statics.field1186]);
            field865[++Statics.field1186 - 1] = var7.method6812() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class362 var8 = Statics.field4741.method6314(field865[--Statics.field1186]);
            return method2374(var8);
        } else if (arg0 == 2709) {
            class362 var9 = Statics.field4741.method6314(field865[--Statics.field1186]);
            return method2434(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pk.al(ILda;ZI)I")
    public static int method7085(int arg0, class82 arg1, boolean arg2) {
        class362 var3 = Statics.field4741.method6314(field865[--Statics.field1186]);
        if (arg0 == 2800) {
            field865[++Statics.field1186 - 1] = Statics.method2504(Statics.method3563(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field865[--Statics.field1186];
            int var5 = var4 - 1;
            if (var3.field3964 == null || var5 >= var3.field3964.length || var3.field3964[var5] == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var3.field3964[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field4028 == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var3.field4028;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.aa(ILda;ZI)I")
    public static int method319(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field857[--Statics.field2169];
            Statics.method7725(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1186 -= 2;
            client.method7210(Statics.field3772, field865[Statics.field1186], field865[Statics.field1186 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field864) {
                field856 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field857[--Statics.field2169];
            int var5 = 0;
            if (class420.method5805(var4)) {
                var5 = class420.method434(var4);
            }
            class325 var6 = class325.method2983(class323.field3354, client.field784.field1485);
            var6.field3433.method9244(var5);
            client.field784.method3070(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field857[--Statics.field2169];
            class325 var8 = class325.method2983(class323.field3375, client.field784.field1485);
            var8.field3433.method9241(var7.length() + 1);
            var8.field3433.method9248(var7);
            client.field784.method3070(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field857[--Statics.field2169];
            class325 var10 = class325.method2983(class323.field3312, client.field784.field1485);
            var10.field3433.method9241(var9.length() + 1);
            var10.field3433.method9248(var9);
            client.field784.method3070(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field865[--Statics.field1186];
            String var12 = field857[--Statics.field2169];
            client.method3339(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1186 -= 3;
            int var13 = field865[Statics.field1186];
            int var14 = field865[Statics.field1186 + 1];
            int var15 = field865[Statics.field1186 + 2];
            class362 var16 = Statics.field4741.method6314(var15);
            client.method7423(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1186 -= 2;
            int var17 = field865[Statics.field1186];
            int var18 = field865[Statics.field1186 + 1];
            class362 var19 = arg2 ? Statics.field5528 : Statics.field75;
            client.method7423(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1704 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field865[++Statics.field1186 - 1] = Statics.field2378.method2713() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2378.method2712(field865[--Statics.field1186] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field857[--Statics.field2169];
            boolean var21 = field865[--Statics.field1186] == 1;
            class32.method7129(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field865[--Statics.field1186];
            class325 var23 = class325.method2983(class323.field3397, client.field784.field1485);
            var23.field3433.method9257(var22);
            client.field784.method3070(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field865[--Statics.field1186];
            Statics.field2169 -= 2;
            String var25 = field857[Statics.field2169];
            String var26 = field857[Statics.field2169 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class325 var27 = class325.method2983(class323.field3369, client.field784.field1485);
                var27.field3433.method9257(1 + class558.method1876(var25) + class558.method1876(var26));
                var27.field3433.method9248(var26);
                var27.field3433.method9248(var25);
                var27.field3433.method9288(var24);
                client.field784.method3070(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field1186--;
            return 1;
        } else if (arg0 == 3118) {
            client.field696 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field636 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field865[--Statics.field1186] == 1) {
                client.field637 |= 0x1;
            } else {
                client.field637 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field865[--Statics.field1186] == 1) {
                client.field637 |= 0x2;
            } else {
                client.field637 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field865[--Statics.field1186] == 1) {
                client.field637 |= 0x4;
            } else {
                client.field637 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field865[--Statics.field1186] == 1) {
                client.field637 |= 0x8;
            } else {
                client.field637 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field637 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field728 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field690 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3427(field865[--Statics.field1186] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field865[++Statics.field1186 - 1] = client.method1874() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1186 -= 2;
            client.field602 = field865[Statics.field1186];
            client.field603 = field865[Statics.field1186 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1186 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1186--;
            return 1;
        } else if (arg0 == 3132) {
            field865[++Statics.field1186 - 1] = Statics.field74;
            field865[++Statics.field1186 - 1] = Statics.field2983;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1186--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1186 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field668 = 3;
            client.field669 = field865[--Statics.field1186];
            return 1;
        } else if (arg0 == 3137) {
            client.field668 = 2;
            client.field669 = field865[--Statics.field1186];
            return 1;
        } else if (arg0 == 3138) {
            client.field668 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field668 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field668 = 3;
            client.field669 = arg2 ? Statics.field5528.field3878 : Statics.field75.field3878;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field865[--Statics.field1186] == 1;
            Statics.field2378.method2735(var28);
            return 1;
        } else if (arg0 == 3142) {
            field865[++Statics.field1186 - 1] = Statics.field2378.method2757() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field865[--Statics.field1186] == 1;
            client.field791 = var29;
            if (!var29) {
                Statics.field2378.method2766("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field865[++Statics.field1186 - 1] = client.field791 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field865[--Statics.field1186] == 1;
            Statics.field2378.method2716(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field865[++Statics.field1186 - 1] = Statics.field2378.method2790() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field865[++Statics.field1186 - 1] = class79.field935;
            return 1;
        } else if (arg0 == 3154) {
            field865[++Statics.field1186 - 1] = client.method694();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field2169--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1186 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1186--;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1186--;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field2169--;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1186--;
            field857[++Statics.field2169 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1186--;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1186 -= 2;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1186 -= 2;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1186 -= 2;
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            field857[++Statics.field2169 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1186--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1186--;
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1186--;
            return 1;
        } else if (arg0 == 3175) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field2169--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field2169--;
            return 1;
        } else if (arg0 == 3181) {
            client.method3537(field865[--Statics.field1186]);
            return 1;
        } else if (arg0 == 3182) {
            field865[++Statics.field1186 - 1] = client.method293();
            return 1;
        } else if (arg0 == 3185) {
            int var31 = field865[--Statics.field1186];
            Statics.field2378.method2734(var31);
            return 1;
        } else if (arg0 == 3186) {
            int var32 = Statics.field2378.method2761();
            field865[++Statics.field1186 - 1] = var32;
            return 1;
        } else if (arg0 == 3189) {
            int var33 = field865[--Statics.field1186];
            client.method8200(var33);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ui.ah(ILda;ZI)I")
    public static int method9127(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1186 -= 3;
            client.method10(field865[Statics.field1186], field865[Statics.field1186 + 1], field865[Statics.field1186 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field1186 -= 5;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            int var5 = field865[Statics.field1186 + 2];
            int var6 = field865[Statics.field1186 + 3];
            int var7 = field865[Statics.field1186 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method5748(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1186 -= 2;
            client.method3680(field865[Statics.field1186], field865[Statics.field1186 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class94 var50 = class94.field1134;
            class93 var51 = class93.field1125;
            int var52 = field865[--Statics.field1186];
            if (arg0 == 3212) {
                int var53 = field865[--Statics.field1186];
                var50 = (class94) class406.method3580(class94.method3152(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field865[--Statics.field1186];
                var51 = (class93) class406.method3580(class93.method4118(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field865[--Statics.field1186];
                var50 = (class94) class406.method3580(class94.method3152(), var55);
                if (var50 == null) {
                    var51 = (class93) class406.method3580(class93.method4118(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class94.field1131;
            } else if (arg0 == 3203) {
                var51 = class93.field1120;
            } else if (arg0 == 3205) {
                var51 = class93.field1121;
            } else if (arg0 == 3207) {
                var51 = class93.field1122;
            }
            if (class93.field1125 == var51) {
                switch(var50.field1132) {
                    case 1:
                        Statics.field2378.method2735(var52 == 1);
                        break;
                    case 2:
                        Statics.field2378.method2716(var52 == 1);
                        break;
                    case 3:
                        Statics.field2378.method2718(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field2378.method2721(var52);
                        break;
                    case 5:
                        client.method3537(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1123) {
                    case 1:
                        Statics.field2378.method2712(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method7918(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method6406(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method3607(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class94 var38 = class94.field1134;
            class93 var39 = class93.field1125;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field865[--Statics.field1186];
                var38 = (class94) class406.method3580(class94.method3152(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field865[--Statics.field1186];
                var39 = (class93) class406.method3580(class93.method4118(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field865[--Statics.field1186];
                var38 = (class94) class406.method3580(class94.method3152(), var43);
                if (var38 == null) {
                    var39 = (class93) class406.method3580(class93.method4118(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class94.field1131;
            } else if (arg0 == 3204) {
                var39 = class93.field1120;
            } else if (arg0 == 3206) {
                var39 = class93.field1121;
            } else if (arg0 == 3208) {
                var39 = class93.field1122;
            }
            int var45;
            if (class93.field1125 == var39) {
                switch(var38.field1132) {
                    case 1:
                        var45 = Statics.field2378.method2757() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field2378.method2790() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field2378.method2764() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field2378.method2819();
                        break;
                    case 5:
                        var45 = client.method293();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1123) {
                    case 1:
                        var45 = Statics.field2378.method2713() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field2378.method2726();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field2378.method2728();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field2378.method2730();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field865[++Statics.field1186 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field865[--Statics.field1186];
            int var10 = 0;
            class94 var11 = (class94) class406.method3580(class94.method3152(), var9);
            if (var11 != null) {
                var10 = class94.field1134 == var11 ? 0 : 1;
            }
            field865[++Statics.field1186 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field865[--Statics.field1186];
            int var13 = 0;
            class93 var14 = (class93) class406.method3580(class93.method4118(), var12);
            if (var14 != null) {
                var13 = class93.field1125 == var14 ? 0 : 1;
            }
            field865[++Statics.field1186 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class94 var28 = class94.field1134;
            class93 var29 = class93.field1125;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field865[--Statics.field1186];
                var28 = (class94) class406.method3580(class94.method3152(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field865[--Statics.field1186];
                var29 = (class93) class406.method3580(class93.method4118(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class93.field1125 == var29) {
                switch(var28.field1132) {
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
            field865[++Statics.field1186 - 1] = var35;
            field865[++Statics.field1186 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field1186 -= 2;
            int var15 = field865[Statics.field1186];
            int var16 = field865[Statics.field1186 + 1];
            class334.method3533(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field1186 -= 6;
            int var17 = field865[Statics.field1186];
            int var18 = field865[Statics.field1186 + 1];
            int var19 = field865[Statics.field1186 + 2];
            int var20 = field865[Statics.field1186 + 3];
            int var21 = field865[Statics.field1186 + 4];
            int var22 = field865[Statics.field1186 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method5748(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field1186 -= 4;
            int var24 = field865[Statics.field1186];
            int var25 = field865[Statics.field1186 + 1];
            int var26 = field865[Statics.field1186 + 2];
            int var27 = field865[Statics.field1186 + 3];
            class334.method5803(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gr.bh(ILda;ZI)I")
    public static int method3562(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field865[++Statics.field1186 - 1] = client.field518;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1186 -= 2;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = class88.method3419(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1186 -= 2;
            int var5 = field865[Statics.field1186];
            int var6 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = class88.method3431(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1186 -= 2;
            int var7 = field865[Statics.field1186];
            int var8 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = class88.method3132(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class177.method3441(var9).field1880;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field680[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field646[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field647[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2071.field1344;
            int var14 = (Statics.field3772.field1247 >> 7) + Statics.field2071.field1347;
            int var15 = (Statics.field3772.field1270 >> 7) + Statics.field2071.field1348;
            field865[++Statics.field1186 - 1] = class351.method6256(var13, var14, var15);
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = Statics.method6252(var16);
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class351.method6269(var17);
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class351.method6289(var18);
            return 1;
        } else if (arg0 == 3312) {
            field865[++Statics.field1186 - 1] = client.field794 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1186 -= 2;
            int var19 = field865[Statics.field1186] + 32768;
            int var20 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = class88.method3419(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1186 -= 2;
            int var21 = field865[Statics.field1186] + 32768;
            int var22 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = class88.method3431(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1186 -= 2;
            int var23 = field865[Statics.field1186] + 32768;
            int var24 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = class88.method3132(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field674 >= 2) {
                field865[++Statics.field1186 - 1] = client.field674;
            } else {
                field865[++Statics.field1186 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field865[++Statics.field1186 - 1] = client.field525;
            return 1;
        } else if (arg0 == 3318) {
            field865[++Statics.field1186 - 1] = client.field502;
            return 1;
        } else if (arg0 == 3321) {
            field865[++Statics.field1186 - 1] = client.field672 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field865[++Statics.field1186 - 1] = client.field652;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field676) {
                field865[++Statics.field1186 - 1] = 1;
            } else {
                field865[++Statics.field1186 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field865[++Statics.field1186 - 1] = client.field503;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1186 -= 4;
            int var25 = field865[Statics.field1186];
            int var26 = field865[Statics.field1186 + 1];
            int var27 = field865[Statics.field1186 + 2];
            int var28 = field865[Statics.field1186 + 3];
            int var29 = class351.method6256(var27, var26, var28);
            field865[++Statics.field1186 - 1] = var25 + var29;
            return 1;
        } else if (arg0 == 3326) {
            field865[++Statics.field1186 - 1] = client.field707;
            return 1;
        } else if (arg0 == 3327) {
            field865[++Statics.field1186 - 1] = client.field724;
            return 1;
        } else if (arg0 == 3331) {
            field865[++Statics.field1186 - 1] = client.field672;
            return 1;
        } else if (arg0 == 3332) {
            int var30 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field648[var30];
            return 1;
        } else if (arg0 == 3333) {
            field857[++Statics.field2169 - 1] = client.field634;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("te.bj(ILda;ZI)I")
    public static int method8631(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1186 -= 2;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            class190 var5 = class190.method4002(var3);
            if (var5.field1976 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1969; var6++) {
                if (var5.field1973[var6] == var4) {
                    field857[++Statics.field2169 - 1] = var5.field1975[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field857[++Statics.field2169 - 1] = var5.field1970;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1186 -= 4;
            int var7 = field865[Statics.field1186];
            int var8 = field865[Statics.field1186 + 1];
            int var9 = field865[Statics.field1186 + 2];
            int var10 = field865[Statics.field1186 + 3];
            class190 var11 = class190.method4002(var9);
            if (var11.field1968 != var7 || var11.field1976 != var8) {
                if (var8 == 115) {
                    field857[++Statics.field2169 - 1] = class383.field4405;
                } else {
                    field865[++Statics.field1186 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1969; var12++) {
                if (var11.field1973[var12] == var10) {
                    if (var8 == 115) {
                        field857[++Statics.field2169 - 1] = var11.field1975[var12];
                    } else {
                        field865[++Statics.field1186 - 1] = var11.field1974[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field857[++Statics.field2169 - 1] = var11.field1970;
                } else {
                    field865[++Statics.field1186 - 1] = var11.field1977;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field865[--Statics.field1186];
            class190 var14 = class190.method4002(var13);
            field865[++Statics.field1186 - 1] = var14.method3706();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.bv(ILda;ZI)I")
    public static int method1871(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field734.method5249(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field734.method5243(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field734.method5244(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rm.bx(ILda;ZI)I")
    public static int method8213(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1072.field831 == 0) {
                field865[++Statics.field1186 - 1] = -2;
            } else if (Statics.field1072.field831 == 1) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = Statics.field1072.field826.method8356();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field865[--Statics.field1186];
            if (Statics.field1072.method1923() && var3 >= 0 && var3 < Statics.field1072.field826.method8356()) {
                class472 var4 = (class472) Statics.field1072.field826.method8366(var3);
                field857[++Statics.field2169 - 1] = var4.method8342();
                field857[++Statics.field2169 - 1] = var4.method8335();
            } else {
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field865[--Statics.field1186];
            if (Statics.field1072.method1923() && var5 >= 0 && var5 < Statics.field1072.field826.method8356()) {
                field865[++Statics.field1186 - 1] = ((class479) Statics.field1072.field826.method8366(var5)).field5022;
            } else {
                field865[++Statics.field1186 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field865[--Statics.field1186];
            if (Statics.field1072.method1923() && var6 >= 0 && var6 < Statics.field1072.field826.method8356()) {
                field865[++Statics.field1186 - 1] = ((class479) Statics.field1072.field826.method8366(var6)).field5024;
            } else {
                field865[++Statics.field1186 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field857[--Statics.field2169];
            int var8 = field865[--Statics.field1186];
            class71.method3357(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field857[--Statics.field2169];
            Statics.field1072.method1930(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field857[--Statics.field2169];
            Statics.field1072.method1956(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field857[--Statics.field2169];
            Statics.field1072.method1963(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field857[--Statics.field2169];
            boolean var13 = true;
            Statics.field1072.method1939(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field857[--Statics.field2169];
            String var15 = client.method5237(var14);
            field865[++Statics.field1186 - 1] = Statics.field1072.method1951(new class581(var15, Statics.field3276), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1216 == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = Statics.field1216.field4993;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1216 == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = Statics.field1216.method8356();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field865[--Statics.field1186];
            if (Statics.field1216 == null || var16 >= Statics.field1216.method8356()) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = Statics.field1216.method8366(var16).method8345().method9989();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field865[--Statics.field1186];
            if (Statics.field1216 == null || var17 >= Statics.field1216.method8356()) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = ((class479) Statics.field1216.method8366(var17)).method8432();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field865[--Statics.field1186];
            if (Statics.field1216 == null || var18 >= Statics.field1216.method8356()) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = ((class479) Statics.field1216.method8366(var18)).field5024;
            }
            return 1;
        } else if (arg0 == 3616) {
            field865[++Statics.field1186 - 1] = Statics.field1216 == null ? 0 : Statics.field1216.field4994;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field857[--Statics.field2169];
            Statics.method8935(var19);
            return 1;
        } else if (arg0 == 3618) {
            field865[++Statics.field1186 - 1] = Statics.field1216 == null ? 0 : Statics.field1216.field4996;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field857[--Statics.field2169];
            client.method321(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method1199();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1072.method1923()) {
                field865[++Statics.field1186 - 1] = Statics.field1072.field832.method8356();
            } else {
                field865[++Statics.field1186 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field865[--Statics.field1186];
            if (Statics.field1072.method1923() && var21 >= 0 && var21 < Statics.field1072.field832.method8356()) {
                class478 var22 = (class478) Statics.field1072.field832.method8366(var21);
                field857[++Statics.field2169 - 1] = var22.method8342();
                field857[++Statics.field2169 - 1] = var22.method8335();
            } else {
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field857[--Statics.field2169];
            String var24 = client.method5237(var23);
            field865[++Statics.field1186 - 1] = Statics.field1072.method1929(new class581(var24, Statics.field3276)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field865[--Statics.field1186];
            if (Statics.field1216 == null || var25 >= Statics.field1216.method8356() || !Statics.field1216.method8366(var25).method8345().equals(Statics.field3772.field1141)) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1216 == null || Statics.field1216.field4995 == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = Statics.field1216.field4995;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field865[--Statics.field1186];
            if (Statics.field1216 == null || var26 >= Statics.field1216.method8356() || !((class474) Statics.field1216.method8366(var26)).method8323()) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field865[--Statics.field1186];
            if (Statics.field1216 == null || var27 >= Statics.field1216.method8356() || !((class474) Statics.field1216.method8366(var27)).method8327()) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1072.field826.method8421();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class564(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class565(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class126(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class122(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class125(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class130(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class124(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class123(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class127(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class128(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1072.field826.method8367();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1072.field832.method8421();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field865[--Statics.field1186] == 1;
            Statics.field1072.field832.method8377(new class564(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field865[--Statics.field1186] == 1;
            Statics.field1072.field832.method8377(new class565(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1072.field832.method8367();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1216 != null) {
                Statics.field1216.method8421();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class564(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class565(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class126(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class122(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class125(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class130(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class124(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class123(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class127(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class128(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1216 != null) {
                Statics.field1216.method8367();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field865[--Statics.field1186] == 1;
            Statics.field1072.field826.method8377(new class129(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field865[--Statics.field1186] == 1;
            if (Statics.field1216 != null) {
                Statics.field1216.method8377(new class129(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.bk(ILda;ZS)I")
    public static int method2839(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fc.bb(ILda;ZS)I")
    public static int method3356(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field804 == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
                Statics.field5353 = Statics.field804;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field865[--Statics.field1186];
            if (client.field776[var3] == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = 1;
                Statics.field5353 = client.field776[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field857[++Statics.field2169 - 1] = Statics.field5353.field1779;
            return 1;
        } else if (arg0 == 3803) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1772 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1773;
            return 1;
        } else if (arg0 == 3805) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1777;
            return 1;
        } else if (arg0 == 3806) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1791;
            return 1;
        } else if (arg0 == 3807) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1776;
            return 1;
        } else if (arg0 == 3809) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1775;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = Statics.field5353.field1788[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = Statics.field5353.field1790[var5];
            return 1;
        } else if (arg0 == 3812) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1770;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = Statics.field5353.field1789[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field1186 -= 3;
            int var7 = field865[Statics.field1186];
            int var8 = field865[Statics.field1186 + 1];
            int var9 = field865[Statics.field1186 + 2];
            field865[++Statics.field1186 - 1] = Statics.field5353.method3495(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1784;
            return 1;
        } else if (arg0 == 3816) {
            field865[++Statics.field1186 - 1] = Statics.field5353.field1785;
            return 1;
        } else if (arg0 == 3817) {
            field865[++Statics.field1186 - 1] = Statics.field5353.method3489(field857[--Statics.field2169]);
            return 1;
        } else if (arg0 == 3818) {
            field865[Statics.field1186 - 1] = Statics.field5353.method3508()[field865[Statics.field1186 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field1186 -= 2;
            int var10 = field865[Statics.field1186];
            int var11 = field865[Statics.field1186 + 1];
            client.method1211(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = Statics.field5353.field1769[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field1186 -= 3;
                int var13 = field865[Statics.field1186];
                boolean var14 = field865[Statics.field1186 + 1] == 1;
                int var15 = field865[Statics.field1186 + 2];
                client.method5970(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field865[--Statics.field1186];
                field865[++Statics.field1186 - 1] = Statics.field5353.field1774[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1750 == null) {
                    field865[++Statics.field1186 - 1] = 0;
                } else {
                    field865[++Statics.field1186 - 1] = 1;
                    Statics.field295 = Statics.field1750;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field865[--Statics.field1186];
                if (client.field741[var17] == null) {
                    field865[++Statics.field1186 - 1] = 0;
                } else {
                    field865[++Statics.field1186 - 1] = 1;
                    Statics.field295 = client.field741[var17];
                    Statics.field863 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field857[++Statics.field2169 - 1] = Statics.field295.field1840;
                return 1;
            } else if (arg0 == 3853) {
                field865[++Statics.field1186 - 1] = Statics.field295.field1846;
                return 1;
            } else if (arg0 == 3854) {
                field865[++Statics.field1186 - 1] = Statics.field295.field1842;
                return 1;
            } else if (arg0 == 3855) {
                field865[++Statics.field1186 - 1] = Statics.field295.method3541();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field865[--Statics.field1186];
                field857[++Statics.field2169 - 1] = ((class153) Statics.field295.field1836.get(var18)).field1712.method9989();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field865[--Statics.field1186];
                field865[++Statics.field1186 - 1] = ((class153) Statics.field295.field1836.get(var19)).field1714;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field865[--Statics.field1186];
                field865[++Statics.field1186 - 1] = ((class153) Statics.field295.field1836.get(var20)).field1711;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field865[--Statics.field1186];
                client.method1919(Statics.field863, var21);
                return 1;
            } else if (arg0 == 3860) {
                field865[++Statics.field1186 - 1] = Statics.field295.method3546(field857[--Statics.field2169]);
                return 1;
            } else if (arg0 == 3861) {
                field865[Statics.field1186 - 1] = Statics.field295.method3542()[field865[Statics.field1186 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field865[++Statics.field1186 - 1] = Statics.field5380 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("mq.bq(ILda;ZI)I")
    public static int method6000(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field700[var3].method7175();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field700[var4].field4668;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field700[var5].field4667;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field700[var6].field4670;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field700[var7].field4669;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.field700[var8].field4672;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field865[--Statics.field1186];
            int var10 = client.field700[var9].method7160();
            field865[++Statics.field1186 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field865[--Statics.field1186];
            int var12 = client.field700[var11].method7160();
            field865[++Statics.field1186 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field865[--Statics.field1186];
            int var14 = client.field700[var13].method7160();
            field865[++Statics.field1186 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field865[--Statics.field1186];
            int var16 = client.field700[var15].method7160();
            field865[++Statics.field1186 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field865[--Statics.field1186] == 1;
            if (Statics.field3759 != null) {
                Statics.field3759.method7108(class394.field4636, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field865[--Statics.field1186] == 1;
            if (Statics.field3759 != null) {
                Statics.field3759.method7108(class394.field4637, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1186 -= 2;
            boolean var19 = field865[Statics.field1186] == 1;
            boolean var20 = field865[Statics.field1186 + 1] == 1;
            if (Statics.field3759 != null) {
                client.field627.field468 = var20;
                Statics.field3759.method7108(client.field627, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field865[--Statics.field1186] == 1;
            if (Statics.field3759 != null) {
                Statics.field3759.method7108(class394.field4642, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field865[--Statics.field1186] == 1;
            if (Statics.field3759 != null) {
                Statics.field3759.method7108(class394.field4639, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field865[++Statics.field1186 - 1] = Statics.field3759 == null ? 0 : Statics.field3759.field4641.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field865[--Statics.field1186];
            class400 var24 = (class400) Statics.field3759.field4641.get(var23);
            field865[++Statics.field1186 - 1] = var24.field4664;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field865[--Statics.field1186];
            class400 var26 = (class400) Statics.field3759.field4641.get(var25);
            field857[++Statics.field2169 - 1] = var26.method7152();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field865[--Statics.field1186];
            class400 var28 = (class400) Statics.field3759.field4641.get(var27);
            field857[++Statics.field2169 - 1] = var28.method7151();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field865[--Statics.field1186];
            class400 var30 = (class400) Statics.field3759.field4641.get(var29);
            long var31 = class330.method2257() - Statics.field869 - var30.field4661;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field857[++Statics.field2169 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field865[--Statics.field1186];
            class400 var38 = (class400) Statics.field3759.field4641.get(var37);
            field865[++Statics.field1186 - 1] = var38.field4662.field4670;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field865[--Statics.field1186];
            class400 var40 = (class400) Statics.field3759.field4641.get(var39);
            field865[++Statics.field1186 - 1] = var40.field4662.field4667;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field865[--Statics.field1186];
            class400 var42 = (class400) Statics.field3759.field4641.get(var41);
            field865[++Statics.field1186 - 1] = var42.field4662.field4668;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var43).field2284 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.bp(ILda;ZI)I")
    public static int method1105(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1186 -= 2;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1186 -= 2;
            int var5 = field865[Statics.field1186];
            int var6 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1186 -= 2;
            int var7 = field865[Statics.field1186];
            int var8 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1186 -= 2;
            int var9 = field865[Statics.field1186];
            int var10 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1186 -= 5;
            int var13 = field865[Statics.field1186];
            int var14 = field865[Statics.field1186 + 1];
            int var15 = field865[Statics.field1186 + 2];
            int var16 = field865[Statics.field1186 + 3];
            int var17 = field865[Statics.field1186 + 4];
            field865[++Statics.field1186 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1186 -= 2;
            int var18 = field865[Statics.field1186];
            int var19 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1186 -= 2;
            int var20 = field865[Statics.field1186];
            int var21 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1186 -= 2;
            int var22 = field865[Statics.field1186];
            int var23 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1186 -= 2;
            int var24 = field865[Statics.field1186];
            int var25 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1186 -= 2;
            int var26 = field865[Statics.field1186];
            int var27 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1186 -= 2;
            int var28 = field865[Statics.field1186];
            int var29 = field865[Statics.field1186 + 1];
            if (var28 == 0) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1186 -= 2;
            int var30 = field865[Statics.field1186];
            int var31 = field865[Statics.field1186 + 1];
            if (var30 == 0) {
                field865[++Statics.field1186 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field865[++Statics.field1186 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field865[++Statics.field1186 - 1] = var30;
                    break;
                case 2:
                    field865[++Statics.field1186 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field865[++Statics.field1186 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field865[++Statics.field1186 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field865[++Statics.field1186 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1186 -= 2;
            int var32 = field865[Statics.field1186];
            int var33 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1186 -= 2;
            int var34 = field865[Statics.field1186];
            int var35 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field1186 -= 2;
            int var36 = field865[Statics.field1186];
            int var37 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field1186 -= 2;
            int var38 = field865[Statics.field1186];
            int var39 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1186 -= 3;
            long var40 = (long) field865[Statics.field1186];
            long var42 = (long) field865[Statics.field1186 + 1];
            long var44 = (long) field865[Statics.field1186 + 2];
            field865[++Statics.field1186 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class332.method7504(field865[--Statics.field1186]);
            field865[++Statics.field1186 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field1186 -= 2;
            int var47 = field865[Statics.field1186];
            int var48 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field1186 -= 3;
            int var49 = field865[Statics.field1186];
            int var50 = field865[Statics.field1186 + 1];
            int var51 = field865[Statics.field1186 + 2];
            field865[++Statics.field1186 - 1] = class332.method5946(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field1186 -= 3;
            int var52 = field865[Statics.field1186];
            int var53 = field865[Statics.field1186 + 1];
            int var54 = field865[Statics.field1186 + 2];
            field865[++Statics.field1186 - 1] = class332.method3540(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field1186 -= 3;
            int var55 = field865[Statics.field1186];
            int var56 = field865[Statics.field1186 + 1];
            int var57 = field865[Statics.field1186 + 2];
            int var58 = 31 - var57;
            field865[++Statics.field1186 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field1186 -= 4;
            int var59 = field865[Statics.field1186];
            int var60 = field865[Statics.field1186 + 1];
            int var61 = field865[Statics.field1186 + 2];
            int var62 = field865[Statics.field1186 + 3];
            int var63 = class332.method3540(var59, var61, var62);
            int var64 = class332.method2255(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field865[++Statics.field1186 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field865[Statics.field1186 - 1] = class507.method284(field865[Statics.field1186 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field865[Statics.field1186 - 1] = class507.method8307(field865[Statics.field1186 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field1186 -= 2;
            int var65 = field865[Statics.field1186];
            int var66 = field865[Statics.field1186 + 1];
            int var67 = class507.method5581(var65, var66);
            field865[++Statics.field1186 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field865[Statics.field1186 - 1] = Math.abs(field865[Statics.field1186 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field857[--Statics.field2169];
            int var69 = -1;
            if (class420.method5805(var68)) {
                var69 = class420.method434(var68);
            }
            field865[++Statics.field1186 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gx.bz(ILda;ZI)I")
    public static int method3539(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field857[--Statics.field2169];
            int var4 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2169 -= 2;
            String var5 = field857[Statics.field2169];
            String var6 = field857[Statics.field2169 + 1];
            field857[++Statics.field2169 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field857[--Statics.field2169];
            int var8 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = var7 + class420.method3044(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field857[--Statics.field2169];
            field857[++Statics.field2169 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field865[--Statics.field1186];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field861.setTime(new Date(var11));
            int var13 = field861.get(5);
            int var14 = field861.get(2);
            int var15 = field861.get(1);
            field857[++Statics.field2169 - 1] = var13 + "-" + field862[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2169 -= 2;
            String var16 = field857[Statics.field2169];
            String var17 = field857[Statics.field2169 + 1];
            if (Statics.field3772.field1136 == null || Statics.field3772.field1136.field3821 == 0) {
                field857[++Statics.field2169 - 1] = var16;
            } else {
                field857[++Statics.field2169 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2169 -= 2;
            field865[++Statics.field1186 - 1] = class420.method3725(class421.method5219(field857[Statics.field2169], field857[Statics.field2169 + 1], Statics.field3268));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field857[--Statics.field2169];
            Statics.field1186 -= 2;
            int var20 = field865[Statics.field1186];
            int var21 = field865[Statics.field1186 + 1];
            byte[] var22 = Statics.field963.method7009(var21, 0);
            class436 var23 = new class436(var22);
            field865[++Statics.field1186 - 1] = var23.method7931(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field857[--Statics.field2169];
            Statics.field1186 -= 2;
            int var25 = field865[Statics.field1186];
            int var26 = field865[Statics.field1186 + 1];
            byte[] var27 = Statics.field963.method7009(var26, 0);
            class436 var28 = new class436(var27);
            field865[++Statics.field1186 - 1] = var28.method7928(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2169 -= 2;
            String var29 = field857[Statics.field2169];
            String var30 = field857[Statics.field2169 + 1];
            if (field865[--Statics.field1186] == 1) {
                field857[++Statics.field2169 - 1] = var29;
            } else {
                field857[++Statics.field2169 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field857[--Statics.field2169];
            field857[++Statics.field2169 - 1] = class440.method7930(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field857[--Statics.field2169];
            int var33 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class420.method3142((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class420.method7155((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class420.method5751((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = Statics.method3817((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field857[--Statics.field2169];
            if (var38 == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field857[--Statics.field2169];
            Statics.field1186 -= 2;
            int var40 = field865[Statics.field1186];
            int var41 = field865[Statics.field1186 + 1];
            field857[++Statics.field2169 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field857[--Statics.field2169];
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
            field857[++Statics.field2169 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field857[--Statics.field2169];
            int var48 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2169 -= 2;
            String var49 = field857[Statics.field2169];
            String var50 = field857[Statics.field2169 + 1];
            int var51 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field857[--Statics.field2169];
            field857[++Statics.field2169 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field2169 -= 3;
            String var53 = field857[Statics.field2169];
            String var54 = field857[Statics.field2169 + 1];
            String var55 = field857[Statics.field2169 + 2];
            if (Statics.field3772.field1136 == null) {
                field857[++Statics.field2169 - 1] = var55;
                return 1;
            }
            switch(Statics.field3772.field1136.field3820) {
                case 0:
                    field857[++Statics.field2169 - 1] = var53;
                    break;
                case 1:
                    field857[++Statics.field2169 - 1] = var54;
                    break;
                case 2:
                default:
                    field857[++Statics.field2169 - 1] = var55;
            }
            return 1;
        } else if (arg0 == 4124) {
            field865[++Statics.field1186 - 1] = Statics.field3772.field1136 == null ? -1 : Statics.field3772.field1136.field3820;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.bc(ILda;ZB)I")
    public static int method3353(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = class211.method7530(var3).field2282;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1186 -= 2;
            int var4 = field865[Statics.field1186];
            int var5 = field865[Statics.field1186 + 1];
            class211 var6 = class211.method7530(var4);
            if (var5 < 1 || var5 > 5 || var6.field2238[var5 - 1] == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var6.field2238[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1186 -= 2;
            int var7 = field865[Statics.field1186];
            int var8 = field865[Statics.field1186 + 1];
            class211 var9 = class211.method7530(var7);
            if (var8 < 1 || var8 > 5 || var9.field2260[var8 - 1] == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var9.field2260[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4222) {
            Statics.field1186 -= 3;
            int var10 = field865[Statics.field1186];
            int var11 = field865[Statics.field1186 + 1];
            int var12 = field865[Statics.field1186 + 2];
            class211 var13 = class211.method7530(var10);
            String var14 = null;
            if (var11 >= 1 && var11 <= 5 && var13.field2260[var11 - 1] != null && var13.field2258 != null && var13.field2258[var11 - 1] != null && var12 >= 1 && var12 <= var13.field2258[var11 - 1].length) {
                var14 = var13.field2258[var11 - 1][var12 - 1];
            }
            field857[++Statics.field2169 - 1] = var14 == null ? "" : var14;
            return 1;
        } else if (arg0 == 4203) {
            int var15 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var15).field2234;
            return 1;
        } else if (arg0 == 4204) {
            int var16 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var16).field2250 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var17 = field865[--Statics.field1186];
            class211 var18 = class211.method7530(var17);
            if (var18.field2275 == -1 && var18.field2274 >= 0) {
                field865[++Statics.field1186 - 1] = var18.field2274;
            } else {
                field865[++Statics.field1186 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var19 = field865[--Statics.field1186];
            class211 var20 = class211.method7530(var19);
            if (var20.field2275 >= 0 && var20.field2274 >= 0) {
                field865[++Statics.field1186 - 1] = var20.field2274;
            } else {
                field865[++Statics.field1186 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var21 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var21).field2268 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var22 = field865[--Statics.field1186];
            class211 var23 = class211.method7530(var22);
            if (var23.field2288 == -1 && var23.field2229 >= 0) {
                field865[++Statics.field1186 - 1] = var23.field2229;
            } else {
                field865[++Statics.field1186 - 1] = var22;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var24 = field865[--Statics.field1186];
            class211 var25 = class211.method7530(var24);
            if (var25.field2288 >= 0 && var25.field2229 >= 0) {
                field865[++Statics.field1186 - 1] = var25.field2229;
            } else {
                field865[++Statics.field1186 - 1] = var24;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var26 = field857[--Statics.field2169];
            int var27 = field865[--Statics.field1186];
            client.method7735(var26, var27 == 1);
            field865[++Statics.field1186 - 1] = Statics.field1845;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field5021 == null || Statics.field2080 >= Statics.field1845) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = Statics.field5021[++Statics.field2080 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2080 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var28 = field865[--Statics.field1186];
            int var29 = class211.method7530(var28).method4020();
            if (var29 == -1) {
                field865[++Statics.field1186 - 1] = var29;
            } else {
                field865[++Statics.field1186 - 1] = var29 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var30 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var30).field2252;
            return 1;
        } else if (arg0 == 4215) {
            int var31 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var31).field2253;
            return 1;
        } else if (arg0 == 4216) {
            int var32 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class211.method7530(var32).field2254;
            return 1;
        } else if (arg0 == 4217) {
            int var33 = field865[--Statics.field1186];
            class211 var34 = class211.method7530(var33);
            field865[++Statics.field1186 - 1] = var34.field2272;
            return 1;
        } else if (arg0 == 4218) {
            int var35 = field865[--Statics.field1186];
            field857[++Statics.field2169 - 1] = class211.method7530(var35).field2239;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oa.by(ILda;ZI)I")
    public static int method6899(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field865[++Statics.field1186 - 1] = client.field729;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1186 -= 3;
            client.field729 = field865[Statics.field1186];
            Statics.field4110 = class578.method9186(field865[Statics.field1186 + 1]);
            if (Statics.field4110 == null) {
                Statics.field4110 = class578.field5620;
            }
            client.field730 = field865[Statics.field1186 + 2];
            class325 var3 = class325.method2983(class323.field3378, client.field784.field1485);
            var3.field3433.method9241(client.field729);
            var3.field3433.method9241(Statics.field4110.field5619);
            var3.field3433.method9241(client.field730);
            client.field784.method3070(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field857[--Statics.field2169];
            Statics.field1186 -= 2;
            int var5 = field865[Statics.field1186];
            int var6 = field865[Statics.field1186 + 1];
            class325 var7 = class325.method2983(class323.field3340, client.field784.field1485);
            var7.field3433.method9241(class558.method1876(var4) + 2);
            var7.field3433.method9248(var4);
            var7.field3433.method9241(var5 - 1);
            var7.field3433.method9241(var6);
            client.field784.method3070(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1186 -= 2;
            int var8 = field865[Statics.field1186];
            int var9 = field865[Statics.field1186 + 1];
            class65 var10 = class116.method4272(var8, var9);
            if (var10 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var10.field456;
                field865[++Statics.field1186 - 1] = var10.field453;
                field857[++Statics.field2169 - 1] = var10.field455 == null ? "" : var10.field455;
                field857[++Statics.field2169 - 1] = var10.field452 == null ? "" : var10.field452;
                field857[++Statics.field2169 - 1] = var10.field459 == null ? "" : var10.field459;
                field865[++Statics.field1186 - 1] = var10.method1165() ? 1 : (var10.method1170() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field865[--Statics.field1186];
            class65 var12 = class116.method1564(var11);
            if (var12 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var12.field454;
                field865[++Statics.field1186 - 1] = var12.field453;
                field857[++Statics.field2169 - 1] = var12.field455 == null ? "" : var12.field455;
                field857[++Statics.field2169 - 1] = var12.field452 == null ? "" : var12.field452;
                field857[++Statics.field2169 - 1] = var12.field459 == null ? "" : var12.field459;
                field865[++Statics.field1186 - 1] = var12.method1165() ? 1 : (var12.method1170() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field4110 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = Statics.field4110.field5619;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field857[--Statics.field2169];
            int var14 = field865[--Statics.field1186];
            class325 var15 = class582.method302(var14, var13, Statics.field3268, -1);
            client.field784.method3070(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2169 -= 2;
            String var16 = field857[Statics.field2169];
            String var17 = field857[Statics.field2169 + 1];
            class325 var18 = class325.method2983(class323.field3372, client.field784.field1485);
            var18.field3433.method9257(0);
            int var19 = var18.field3433.field5462;
            var18.field3433.method9248(var16);
            class365.method4218(var18.field3433, var17);
            var18.field3433.method9254(var18.field3433.field5462 - var19);
            client.field784.method3070(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field857[--Statics.field2169];
            Statics.field1186 -= 2;
            int var21 = field865[Statics.field1186];
            int var22 = field865[Statics.field1186 + 1];
            class325 var23 = class582.method302(var21, var20, Statics.field3268, var22);
            client.field784.method3070(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field3772 == null || Statics.field3772.field1141 == null) {
                var24 = "";
            } else {
                var24 = Statics.field3772.field1141.method9989();
            }
            field857[++Statics.field2169 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field865[++Statics.field1186 - 1] = client.field730;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class116.method3571(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class116.method4363(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = class116.method9131(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field857[--Statics.field2169];
            client.method287(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field731 = field857[--Statics.field2169].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field857[++Statics.field2169 - 1] = client.field731;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field857[--Statics.field2169];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field1186 -= 2;
            int var30 = field865[Statics.field1186];
            int var31 = field865[Statics.field1186 + 1];
            class65 var32 = class116.method4272(var30, var31);
            if (var32 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var32.field456;
                field865[++Statics.field1186 - 1] = var32.field453;
                field857[++Statics.field2169 - 1] = var32.field455 == null ? "" : var32.field455;
                field857[++Statics.field2169 - 1] = var32.field452 == null ? "" : var32.field452;
                field857[++Statics.field2169 - 1] = var32.field459 == null ? "" : var32.field459;
                field865[++Statics.field1186 - 1] = var32.method1165() ? 1 : (var32.method1170() ? 2 : 0);
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field865[--Statics.field1186];
            class65 var34 = class116.method1564(var33);
            if (var34 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var34.field454;
                field865[++Statics.field1186 - 1] = var34.field453;
                field857[++Statics.field2169 - 1] = var34.field455 == null ? "" : var34.field455;
                field857[++Statics.field2169 - 1] = var34.field452 == null ? "" : var34.field452;
                field857[++Statics.field2169 - 1] = var34.field459 == null ? "" : var34.field459;
                field865[++Statics.field1186 - 1] = var34.method1165() ? 1 : (var34.method1170() ? 2 : 0);
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.br(ILda;ZI)I")
    public static int method3099(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field865[++Statics.field1186 - 1] = client.method3408();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field865[--Statics.field1186];
            if (var3 == 1 || var3 == 2) {
                client.method6218(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field865[++Statics.field1186 - 1] = Statics.field2378.method2736();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field865[--Statics.field1186];
            if (var4 == 1 || var4 == 2) {
                Statics.field2378.method2725(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1186--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hp.bn(ILda;ZB)I")
    public static int method3844(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1186 -= 2;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            if (!client.field586) {
                client.field552 = var3;
                client.field592 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field865[++Statics.field1186 - 1] = client.field552;
            return 1;
        } else if (arg0 == 5506) {
            field865[++Statics.field1186 - 1] = client.field592;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field865[--Statics.field1186];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field598 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field865[++Statics.field1186 - 1] = client.field598;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.bu(ILda;ZB)I")
    public static int method2256(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field568 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.bt(II)I")
    public static int method1042(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("po.bs(II)I")
    public static int method7194(int arg0) {
        return (int) ((Math.log((double) arg0) / field867 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("fh.bm(ILda;ZB)I")
    public static int method3300(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1186 -= 2;
            client.field588 = (short) method1042(field865[Statics.field1186]);
            if (client.field588 <= 0) {
                client.field588 = 256;
            }
            client.field580 = (short) method1042(field865[Statics.field1186 + 1]);
            if (client.field580 <= 0) {
                client.field580 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1186 -= 2;
            client.field558 = (short) field865[Statics.field1186];
            if (client.field558 <= 0) {
                client.field558 = 256;
            }
            client.field774 = (short) field865[Statics.field1186 + 1];
            if (client.field774 <= 0) {
                client.field774 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1186 -= 4;
            client.field775 = (short) field865[Statics.field1186];
            if (client.field775 <= 0) {
                client.field775 = 1;
            }
            client.field763 = (short) field865[Statics.field1186 + 1];
            if (client.field763 <= 0) {
                client.field763 = 32767;
            } else if (client.field763 < client.field775) {
                client.field763 = client.field775;
            }
            client.field777 = (short) field865[Statics.field1186 + 2];
            if (client.field777 <= 0) {
                client.field777 = 1;
            }
            client.field778 = (short) field865[Statics.field1186 + 3];
            if (client.field778 <= 0) {
                client.field778 = 32767;
            } else if (client.field778 < client.field777) {
                client.field778 = client.field777;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field673 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
            } else {
                client.method3147(0, 0, client.field673.field3894, client.field673.field3895, false);
                field865[++Statics.field1186 - 1] = client.field781;
                field865[++Statics.field1186 - 1] = client.field582;
            }
            return 1;
        } else if (arg0 == 6204) {
            field865[++Statics.field1186 - 1] = client.field558;
            field865[++Statics.field1186 - 1] = client.field774;
            return 1;
        } else if (arg0 == 6205) {
            field865[++Statics.field1186 - 1] = method7194(client.field588);
            field865[++Statics.field1186 - 1] = method7194(client.field580);
            return 1;
        } else if (arg0 == 6220) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field865[++Statics.field1186 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field865[++Statics.field1186 - 1] = Statics.field74;
            return 1;
        } else if (arg0 == 6223) {
            field865[++Statics.field1186 - 1] = Statics.field2983;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.bo(ILda;ZB)I")
    public static int method2180(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field865[++Statics.field1186 - 1] = class70.method5981() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class70 var3 = class70.method9125();
            if (var3 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
            } else {
                field865[++Statics.field1186 - 1] = var3.field813;
                field865[++Statics.field1186 - 1] = var3.field812;
                field857[++Statics.field2169 - 1] = var3.field815;
                field865[++Statics.field1186 - 1] = var3.field820;
                field865[++Statics.field1186 - 1] = var3.field817;
                field857[++Statics.field2169 - 1] = var3.field816;
            }
            return 1;
        } else if (arg0 == 6502) {
            class70 var4 = class70.method3587();
            if (var4 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
            } else {
                field865[++Statics.field1186 - 1] = var4.field813;
                field865[++Statics.field1186 - 1] = var4.field812;
                field857[++Statics.field2169 - 1] = var4.field815;
                field865[++Statics.field1186 - 1] = var4.field820;
                field865[++Statics.field1186 - 1] = var4.field817;
                field857[++Statics.field2169 - 1] = var4.field816;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field865[--Statics.field1186];
            class70 var6 = null;
            for (int var7 = 0; var7 < class70.field811; var7++) {
                if (Statics.field810[var7].field813 == var5) {
                    var6 = Statics.field810[var7];
                    break;
                }
            }
            if (var6 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
            } else {
                field865[++Statics.field1186 - 1] = var6.field813;
                field865[++Statics.field1186 - 1] = var6.field812;
                field857[++Statics.field2169 - 1] = var6.field815;
                field865[++Statics.field1186 - 1] = var6.field820;
                field865[++Statics.field1186 - 1] = var6.field817;
                field857[++Statics.field2169 - 1] = var6.field816;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1186 -= 4;
            int var8 = field865[Statics.field1186];
            boolean var9 = field865[Statics.field1186 + 1] == 1;
            int var10 = field865[Statics.field1186 + 2];
            boolean var11 = field865[Statics.field1186 + 3] == 1;
            class70.method7490(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field865[--Statics.field1186];
            if (var12 >= 0 && var12 < class70.field811) {
                class70 var13 = Statics.field810[var12];
                field865[++Statics.field1186 - 1] = var13.field813;
                field865[++Statics.field1186 - 1] = var13.field812;
                field857[++Statics.field2169 - 1] = var13.field815;
                field865[++Statics.field1186 - 1] = var13.field820;
                field865[++Statics.field1186 - 1] = var13.field817;
                field857[++Statics.field2169 - 1] = var13.field816;
            } else {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
                field857[++Statics.field2169 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field578 = field865[--Statics.field1186] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1186 -= 2;
            int var14 = field865[Statics.field1186];
            int var15 = field865[Statics.field1186 + 1];
            class206 var16 = class206.method5812(var15);
            if (var16.method3875()) {
                field857[++Statics.field2169 - 1] = class195.method8497(var14).method3736(var15, var16.field2137);
            } else {
                field865[++Statics.field1186 - 1] = class195.method8497(var14).method3735(var15, var16.field2135);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1186 -= 2;
            int var17 = field865[Statics.field1186];
            int var18 = field865[Statics.field1186 + 1];
            class206 var19 = class206.method5812(var18);
            if (var19.method3875()) {
                field857[++Statics.field2169 - 1] = class210.method3109(var17).method3958(var18, var19.field2137);
            } else {
                field865[++Statics.field1186 - 1] = class210.method3109(var17).method3957(var18, var19.field2135);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1186 -= 2;
            int var20 = field865[Statics.field1186];
            int var21 = field865[Statics.field1186 + 1];
            class206 var22 = class206.method5812(var21);
            if (var22.method3875()) {
                field857[++Statics.field2169 - 1] = class211.method7530(var20).method4019(var21, var22.field2137);
            } else {
                field865[++Statics.field1186 - 1] = class211.method7530(var20).method4018(var21, var22.field2135);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1186 -= 2;
            int var23 = field865[Statics.field1186];
            int var24 = field865[Statics.field1186 + 1];
            class206 var25 = class206.method5812(var24);
            if (var25.method3875()) {
                field857[++Statics.field2169 - 1] = class207.method3212(var23).method3894(var24, var25.field2137);
            } else {
                field865[++Statics.field1186 - 1] = class207.method3212(var23).method3893(var24, var25.field2135);
            }
            return 1;
        } else if (arg0 == 6518) {
            field865[++Statics.field1186 - 1] = client.field765 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field865[++Statics.field1186 - 1] = client.field564;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2169--;
            Statics.field1186--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2169--;
            Statics.field1186--;
            return 1;
        } else if (arg0 == 6524) {
            field865[++Statics.field1186 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field865[++Statics.field1186 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field865[++Statics.field1186 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field865[++Statics.field1186 - 1] = client.field509;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gj.bd(ILda;ZB)I")
    public static int method3531(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2071.field1344;
            int var4 = (Statics.field3772.field1247 >> 7) + Statics.field2071.field1347;
            int var5 = (Statics.field3772.field1270 >> 7) + Statics.field2071.field1348;
            client.method3444().method8925(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field865[--Statics.field1186];
            String var7 = "";
            class285 var8 = client.method3444().method8761(var6);
            if (var8 != null) {
                var7 = var8.method5505();
            }
            field857[++Statics.field2169 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field865[--Statics.field1186];
            client.method3444().method8744(var9);
            return 1;
        } else if (arg0 == 6603) {
            field865[++Statics.field1186 - 1] = client.method3444().method8758();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field865[--Statics.field1186];
            client.method3444().method8755(var10);
            return 1;
        } else if (arg0 == 6605) {
            field865[++Statics.field1186 - 1] = client.method3444().method8760() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class351 var11 = new class351(field865[--Statics.field1186]);
            client.method3444().method8762(var11.field3777, var11.field3778);
            return 1;
        } else if (arg0 == 6607) {
            class351 var12 = new class351(field865[--Statics.field1186]);
            client.method3444().method8763(var12.field3777, var12.field3778);
            return 1;
        } else if (arg0 == 6608) {
            class351 var13 = new class351(field865[--Statics.field1186]);
            client.method3444().method8856(var13.field3779, var13.field3777, var13.field3778);
            return 1;
        } else if (arg0 == 6609) {
            class351 var14 = new class351(field865[--Statics.field1186]);
            client.method3444().method8765(var14.field3779, var14.field3777, var14.field3778);
            return 1;
        } else if (arg0 == 6610) {
            field865[++Statics.field1186 - 1] = client.method3444().method8900();
            field865[++Statics.field1186 - 1] = client.method3444().method8767();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field865[--Statics.field1186];
            class285 var16 = client.method3444().method8761(var15);
            if (var16 == null) {
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var16.method5546().method6250();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field865[--Statics.field1186];
            class285 var18 = client.method3444().method8761(var17);
            if (var18 == null) {
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = (var18.method5517() - var18.method5516() + 1) * 64;
                field865[++Statics.field1186 - 1] = (var18.method5519() - var18.method5512() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field865[--Statics.field1186];
            class285 var20 = client.method3444().method8761(var19);
            if (var20 == null) {
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
                field865[++Statics.field1186 - 1] = 0;
            } else {
                field865[++Statics.field1186 - 1] = var20.method5516() * 64;
                field865[++Statics.field1186 - 1] = var20.method5512() * 64;
                field865[++Statics.field1186 - 1] = var20.method5517() * 64 + 64 - 1;
                field865[++Statics.field1186 - 1] = var20.method5519() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field865[--Statics.field1186];
            class285 var22 = client.method3444().method8761(var21);
            if (var22 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var22.method5515();
            }
            return 1;
        } else if (arg0 == 6615) {
            class351 var23 = client.method3444().method8808();
            if (var23 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var23.field3777;
                field865[++Statics.field1186 - 1] = var23.field3778;
            }
            return 1;
        } else if (arg0 == 6616) {
            field865[++Statics.field1186 - 1] = client.method3444().method8793();
            return 1;
        } else if (arg0 == 6617) {
            class351 var24 = new class351(field865[--Statics.field1186]);
            class285 var25 = client.method3444().method8879();
            if (var25 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method5506(var24.field3779, var24.field3777, var24.field3778);
            if (var26 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var26[0];
                field865[++Statics.field1186 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class351 var27 = new class351(field865[--Statics.field1186]);
            class285 var28 = client.method3444().method8879();
            if (var28 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
                return 1;
            }
            class351 var29 = var28.method5561(var27.field3777, var27.field3778);
            if (var29 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var29.method6250();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1186 -= 2;
            int var30 = field865[Statics.field1186];
            class351 var31 = new class351(field865[Statics.field1186 + 1]);
            method639(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1186 -= 2;
            int var32 = field865[Statics.field1186];
            class351 var33 = new class351(field865[Statics.field1186 + 1]);
            method639(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1186 -= 2;
            int var34 = field865[Statics.field1186];
            class351 var35 = new class351(field865[Statics.field1186 + 1]);
            class285 var36 = client.method3444().method8761(var34);
            if (var36 == null) {
                field865[++Statics.field1186 - 1] = 0;
                return 1;
            } else {
                field865[++Statics.field1186 - 1] = var36.method5504(var35.field3779, var35.field3777, var35.field3778) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field865[++Statics.field1186 - 1] = client.method3444().method8769();
            field865[++Statics.field1186 - 1] = client.method3444().method8924();
            return 1;
        } else if (arg0 == 6623) {
            class351 var37 = new class351(field865[--Statics.field1186]);
            class285 var38 = client.method3444().method8741(var37.field3779, var37.field3777, var37.field3778);
            if (var38 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var38.method5509();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3444().method8771(field865[--Statics.field1186]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3444().method8772();
            return 1;
        } else if (arg0 == 6626) {
            client.method3444().method8874(field865[--Statics.field1186]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3444().method8861();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field865[--Statics.field1186] == 1;
            client.method3444().method8779(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field865[--Statics.field1186];
            client.method3444().method8776(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field865[--Statics.field1186];
            client.method3444().method8777(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3444().method8778();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field865[--Statics.field1186] == 1;
            client.method3444().method8837(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1186 -= 2;
            int var43 = field865[Statics.field1186];
            boolean var44 = field865[Statics.field1186 + 1] == 1;
            client.method3444().method8780(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1186 -= 2;
            int var45 = field865[Statics.field1186];
            boolean var46 = field865[Statics.field1186 + 1] == 1;
            client.method3444().method8781(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field865[++Statics.field1186 - 1] = client.method3444().method8782() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.method3444().method8746(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field865[--Statics.field1186];
            field865[++Statics.field1186 - 1] = client.method3444().method8901(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1186 -= 2;
            int var49 = field865[Statics.field1186];
            class351 var50 = new class351(field865[Statics.field1186 + 1]);
            class351 var51 = client.method3444().method8888(var49, var50);
            if (var51 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var51.method6250();
            }
            return 1;
        } else if (arg0 == 6639) {
            class303 var52 = client.method3444().method8864();
            if (var52 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var52.method5469();
                field865[++Statics.field1186 - 1] = var52.field3260.method6250();
            }
            return 1;
        } else if (arg0 == 6640) {
            class303 var53 = client.method3444().method8790();
            if (var53 == null) {
                field865[++Statics.field1186 - 1] = -1;
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var53.method5469();
                field865[++Statics.field1186 - 1] = var53.field3260.method6250();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field865[--Statics.field1186];
            class184 var55 = class184.method174(var54);
            if (var55.field1914 == null) {
                field857[++Statics.field2169 - 1] = "";
            } else {
                field857[++Statics.field2169 - 1] = var55.field1914;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field865[--Statics.field1186];
            class184 var57 = class184.method174(var56);
            field865[++Statics.field1186 - 1] = var57.field1922;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field865[--Statics.field1186];
            class184 var59 = class184.method174(var58);
            if (var59 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var59.field1930;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field865[--Statics.field1186];
            class184 var61 = class184.method174(var60);
            if (var61 == null) {
                field865[++Statics.field1186 - 1] = -1;
            } else {
                field865[++Statics.field1186 - 1] = var61.field1912;
            }
            return 1;
        } else if (arg0 == 6697) {
            field865[++Statics.field1186 - 1] = Statics.field4799.field3284;
            return 1;
        } else if (arg0 == 6698) {
            field865[++Statics.field1186 - 1] = Statics.field4799.field3281.method6250();
            return 1;
        } else if (arg0 == 6699) {
            field865[++Statics.field1186 - 1] = Statics.field4799.field3282.method6250();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.ba(ILda;ZI)I")
    public static int method3414(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field865[--Statics.field1186];
            class195 var4 = class195.method8497(var3);
            field857[++Statics.field2169 - 1] = var4 == null ? "" : var4.field2010;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field1186 -= 2;
            class195 var5 = class195.method8497(field865[Statics.field1186]);
            int var6 = field865[Statics.field1186 + 1];
            field865[++Statics.field1186 - 1] = var5.method3734(var6);
            field865[++Statics.field1186 - 1] = var5.method3741(var6);
            return 1;
        } else if (arg0 == 6765) {
            class195 var7 = class195.method8497(field865[--Statics.field1186]);
            field865[++Statics.field1186 - 1] = var7 == null ? 0 : var7.field2035;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dj.bw(ILda;ZI)I")
    public static int method2568(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field865[--Statics.field1186];
            class210 var4 = class210.method3109(var3);
            field857[++Statics.field2169 - 1] = var4 == null ? "" : var4.field2182;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gq.bi(ILda;ZB)I")
    public static int method3578(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("np.bf(ILda;ZB)I")
    public static int method6196(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("nm.bg(ILda;ZI)I")
    public static int method6313(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field865[++Statics.field1186 - 1] = client.method2001() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.bl(ILda;ZI)I")
    public static int method1217(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field865[--Statics.field1186] == 1;
            client.method2370(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.be(ILda;ZI)I")
    public static int method2295(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field865[--Statics.field1186];
            Object var45 = method2503(var44);
            int var46 = field865[--Statics.field1186];
            class549 var47 = client.method3560(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class551.method3203(var46);
            Statics.field1088 = var47.method9150(var45, var48);
            if (Statics.field1088 == null) {
                client.field793 = -1;
                Statics.field2346 = null;
                if (arg0 == 7500) {
                    field865[++Statics.field1186 - 1] = 0;
                }
            } else {
                client.field793 = class551.method8934(var46);
                Statics.field2346 = Statics.field1088.iterator();
                if (arg0 == 7500) {
                    field865[++Statics.field1186 - 1] = Statics.field1088.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field2346 != null && Statics.field2346.hasNext()) {
                field865[++Statics.field1186 - 1] = (Integer) Statics.field2346.next();
            } else {
                field865[++Statics.field1186 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field1186 -= 3;
            int var3 = field865[Statics.field1186];
            int var4 = field865[Statics.field1186 + 1];
            int var5 = field865[Statics.field1186 + 2];
            int var6 = class551.method8934(var4);
            int var7 = class551.method2002(var4);
            int var8 = class551.method3203(var4);
            class550 var9 = class550.method5816(var3);
            class548 var10 = class548.method6909(var6);
            int[] var11 = var10.field5394[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method9161(var7);
            if (var14 == null && var10.field5393 != null) {
                var14 = var10.field5393[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class545 var17 = class543.method4246(var16);
                    if (class545.field5382 == var17) {
                        field857[++Statics.field2169 - 1] = "";
                    } else {
                        field865[++Statics.field1186 - 1] = Statics.method7426(var16);
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
                class545 var21 = class543.method4246(var11[var19]);
                if (class545.field5382 == var21) {
                    field857[++Statics.field2169 - 1] = (String) var14[var20];
                } else {
                    field865[++Statics.field1186 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field1186 -= 2;
            int var22 = field865[Statics.field1186];
            int var23 = field865[Statics.field1186 + 1];
            int var24 = 0;
            int var25 = class551.method8934(var23);
            int var26 = class551.method2002(var23);
            class550 var27 = class550.method5816(var22);
            class548 var28 = class548.method6909(var25);
            int[] var29 = var28.field5394[var26];
            Object[] var30 = var27.method9161(var26);
            if (var30 == null && var28.field5393 != null) {
                var30 = var28.field5393[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field865[++Statics.field1186 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field1186--;
            int var41 = field865[Statics.field1186];
            class549 var42 = client.method3863(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1088 = var42.method9150(0, 0);
            int var43 = 0;
            if (Statics.field1088 != null) {
                client.field793 = var41;
                Statics.field2346 = Statics.field1088.iterator();
                var43 = Statics.field1088.size();
            }
            if (arg0 == 7504) {
                field865[++Statics.field1186 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field865[--Statics.field1186];
            class550 var32 = class550.method5816(var31);
            field865[++Statics.field1186 - 1] = var32.field5408;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field865[--Statics.field1186];
            int var34 = -1;
            if (Statics.field1088 != null && var33 >= 0 && var33 < Statics.field1088.size()) {
                var34 = (Integer) Statics.field1088.get(var33);
            }
            field865[++Statics.field1186 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field865[--Statics.field1186];
            Object var36 = method2503(var35);
            int var37 = field865[--Statics.field1186];
            class549 var38 = client.method3560(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class551.method8934(var37) != client.field793) {
                throw new RuntimeException();
            } else if (Statics.field1088 == null && Statics.field1088.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class551.method3203(var37);
                List var40 = var38.method9150(var36, var39);
                Statics.field1088 = new LinkedList(Statics.field1088);
                if (var40 == null) {
                    Statics.field1088.clear();
                } else {
                    Statics.field1088.retainAll(var40);
                }
                Statics.field2346 = Statics.field1088.iterator();
                if (arg0 == 7507) {
                    field865[++Statics.field1186 - 1] = Statics.field1088.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.cq(ILda;ZI)I")
    public static int method325(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ac.cb(ILda;ZB)I")
    public static int method283(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7900) {
            int var3 = field865[--Statics.field1186];
            client.field508 = Math.max(var3, 0);
            return 1;
        } else if (arg0 == 7901) {
            field865[++Statics.field1186 - 1] = client.field508;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ob.cd(ILda;ZI)I")
    public static int method6926(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field1186--;
            int var3 = field865[Statics.field1186];
            int var4 = field854[var3];
            class552.method5305(field855[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field1186 -= 3;
            int var5 = field865[Statics.field1186];
            int var6 = field865[Statics.field1186 + 1];
            int var7 = field865[Statics.field1186 + 2];
            int var8 = field854[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class452.method8084(field855[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.ci(II)V")
    public static void method1232(int arg0) {
        if (arg0 == -1 || !Statics.field4741.method6299(arg0)) {
            return;
        }
        class362[] var1 = Statics.field4741.field3785[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class362 var3 = var1[var2];
            if (var3.field3870 != null) {
                class91 var4 = new class91();
                var4.field1101 = var3;
                var4.field1103 = var3.field3870;
                Statics.method2248(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("bz.cn(ILnn;ZI)V")
    public static void method639(int arg0, class351 arg1, boolean arg2) {
        class285 var3 = client.method3444().method8761(arg0);
        int var4 = Statics.field3772.field1148;
        int var5 = (Statics.field3772.field1247 >> 7) + Statics.field2071.field1347;
        int var6 = (Statics.field3772.field1270 >> 7) + Statics.field2071.field1348;
        class351 var7 = new class351(var4, var5, var6);
        client.method3444().method8748(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("go.co(Lui;I)Ljava/lang/Object;")
    public static Object method3564(class545 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5383) {
            case 1:
                return field857[--Statics.field2169];
            case 2:
                return field865[--Statics.field1186];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("db.cf(II)Ljava/lang/Object;")
    public static Object method2503(int arg0) {
        return method3564((class545) class406.method3580(class545.method9116(), arg0));
    }

    @ObfuscatedName("lw.cl(Lng;I)V")
    public static void method5762(class362 arg0) {
        arg0.method6727();
        arg0.method6707().method6470(new class111(arg0));
        arg0.method6707().method6458(new class112(arg0));
    }
}
