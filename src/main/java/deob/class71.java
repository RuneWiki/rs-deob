package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bj")
public class class71 {

    @ObfuscatedName("bj.l")
    public static int[] field1027 = new int[5];

    @ObfuscatedName("bj.w")
    public static int[][] field1028 = new int[5][5000];

    @ObfuscatedName("bj.d")
    public static int[] field1029 = new int[1000];

    @ObfuscatedName("bj.s")
    public static String[] field1031 = new String[1000];

    @ObfuscatedName("bj.a")
    public static int field1033 = 0;

    @ObfuscatedName("bj.r")
    public static class52[] field1024 = new class52[50];

    @ObfuscatedName("bj.q")
    public static Calendar field1034 = Calendar.getInstance();

    @ObfuscatedName("bj.x")
    public static final String[] field1032 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bj.o")
    public static boolean field1036 = false;

    @ObfuscatedName("bj.t")
    public static boolean field1040 = false;

    @ObfuscatedName("bj.v")
    public static int field1041 = 0;

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.f(Lbi;B)V")
    public static void method1800(class58 arg0) {
        method129(arg0, 500000);
    }

    @ObfuscatedName("r.h(Lbi;IB)V")
    public static void method129(class58 arg0, int arg1) {
        Object[] var2 = arg0.field545;
        class87 var4;
        if (class300.method955(arg0.field540)) {
            Statics.field1038 = (class37) var2[0];
            class258 var3 = class258.method3226(Statics.field1038.field311);
            var4 = class87.method1512(arg0.field540, var3.field3311, var3.field3308);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class87.method876(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1039 = 0;
        Statics.field3702 = 0;
        int var6 = -1;
        int[] var7 = var4.field1239;
        int[] var8 = var4.field1234;
        byte var9 = -1;
        field1033 = 0;
        field1036 = false;
        try {
            Statics.field1046 = new int[var4.field1236];
            int var10 = 0;
            Statics.field1026 = new String[var4.field1237];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field532;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field533;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field531 == null ? -1 : arg0.field531.field2656;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field534;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field531 == null ? -1 : arg0.field531.field2657;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field535 == null ? -1 : arg0.field535.field2656;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field535 == null ? -1 : arg0.field535.field2657;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field544;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field537;
                    }
                    Statics.field1046[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field542;
                    }
                    Statics.field1026[var11++] = var14;
                }
            }
            int var15 = 0;
            field1041 = arg0.field539;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var187 = var7[var6];
                if (var187 >= 100) {
                    boolean var55;
                    if (var4.field1234[var6] == 1) {
                        var55 = true;
                    } else {
                        var55 = false;
                    }
                    int var71;
                    if (var187 < 1000) {
                        byte var63;
                        if (var187 == 100) {
                            Statics.field1039 -= 3;
                            int var56 = field1029[Statics.field1039];
                            int var57 = field1029[Statics.field1039 + 1];
                            int var58 = field1029[Statics.field1039 + 2];
                            if (var57 == 0) {
                                throw new RuntimeException();
                            }
                            class233 var59 = class233.method130(var56);
                            if (var59.field2765 == null) {
                                var59.field2765 = new class233[var58 + 1];
                            }
                            if (var59.field2765.length <= var58) {
                                class233[] var60 = new class233[var58 + 1];
                                for (int var61 = 0; var61 < var59.field2765.length; var61++) {
                                    var60[var61] = var59.field2765[var61];
                                }
                                var59.field2765 = var60;
                            }
                            if (var58 > 0 && var59.field2765[var58 - 1] == null) {
                                throw new RuntimeException("" + (var58 - 1));
                            }
                            class233 var62 = new class233();
                            var62.field2658 = var57;
                            var62.field2672 = var62.field2656 = var59.field2656;
                            var62.field2657 = var58;
                            var62.field2655 = true;
                            var59.field2765[var58] = var62;
                            if (var55) {
                                Statics.field1035 = var62;
                            } else {
                                Statics.field1023 = var62;
                            }
                            client.method956(var59);
                            var63 = 1;
                        } else if (var187 == 101) {
                            class233 var64 = var55 ? Statics.field1035 : Statics.field1023;
                            class233 var65 = class233.method130(var64.field2656);
                            var65.field2765[var64.field2657] = null;
                            client.method956(var65);
                            var63 = 1;
                        } else if (var187 == 102) {
                            class233 var66 = class233.method130(field1029[--Statics.field1039]);
                            var66.field2765 = null;
                            client.method956(var66);
                            var63 = 1;
                        } else if (var187 == 200) {
                            Statics.field1039 -= 2;
                            int var67 = field1029[Statics.field1039];
                            int var68 = field1029[Statics.field1039 + 1];
                            class233 var69 = class233.method3146(var67, var68);
                            if (var69 == null || var68 == -1) {
                                field1029[++Statics.field1039 - 1] = 0;
                            } else {
                                field1029[++Statics.field1039 - 1] = 1;
                                if (var55) {
                                    Statics.field1035 = var69;
                                } else {
                                    Statics.field1023 = var69;
                                }
                            }
                            var63 = 1;
                        } else if (var187 == 201) {
                            class233 var70 = class233.method130(field1029[--Statics.field1039]);
                            if (var70 == null) {
                                field1029[++Statics.field1039 - 1] = 0;
                            } else {
                                field1029[++Statics.field1039 - 1] = 1;
                                if (var55) {
                                    Statics.field1035 = var70;
                                } else {
                                    Statics.field1023 = var70;
                                }
                            }
                            var63 = 1;
                        } else {
                            var63 = 2;
                        }
                        var71 = var63;
                    } else if (var187 < 1100) {
                        var71 = method449(var187, var4, var55);
                    } else if (var187 < 1200) {
                        var71 = method3113(var187, var4, var55);
                    } else if (var187 < 1300) {
                        var71 = method291(var187, var4, var55);
                    } else if (var187 < 1400) {
                        var71 = method4160(var187, var4, var55);
                    } else if (var187 < 1500) {
                        var71 = method926(var187, var4, var55);
                    } else if (var187 < 1600) {
                        var71 = method216(var187, var4, var55);
                    } else if (var187 < 1700) {
                        class233 var72 = var55 ? Statics.field1035 : Statics.field1023;
                        byte var73;
                        if (var187 == 1600) {
                            field1029[++Statics.field1039 - 1] = var72.field2764;
                            var73 = 1;
                        } else if (var187 == 1601) {
                            field1029[++Statics.field1039 - 1] = var72.field2678;
                            var73 = 1;
                        } else if (var187 == 1602) {
                            field1031[++Statics.field3702 - 1] = var72.field2717;
                            var73 = 1;
                        } else if (var187 == 1603) {
                            field1029[++Statics.field1039 - 1] = var72.field2715;
                            var73 = 1;
                        } else if (var187 == 1604) {
                            field1029[++Statics.field1039 - 1] = var72.field2680;
                            var73 = 1;
                        } else if (var187 == 1605) {
                            field1029[++Statics.field1039 - 1] = var72.field2689;
                            var73 = 1;
                        } else if (var187 == 1606) {
                            field1029[++Statics.field1039 - 1] = var72.field2733;
                            var73 = 1;
                        } else if (var187 == 1607) {
                            field1029[++Statics.field1039 - 1] = var72.field2755;
                            var73 = 1;
                        } else if (var187 == 1608) {
                            field1029[++Statics.field1039 - 1] = var72.field2708;
                            var73 = 1;
                        } else if (var187 == 1609) {
                            field1029[++Statics.field1039 - 1] = var72.field2687;
                            var73 = 1;
                        } else if (var187 == 1610) {
                            field1029[++Statics.field1039 - 1] = var72.field2688;
                            var73 = 1;
                        } else if (var187 == 1611) {
                            field1029[++Statics.field1039 - 1] = var72.field2681;
                            var73 = 1;
                        } else if (var187 == 1612) {
                            field1029[++Statics.field1039 - 1] = var72.field2682;
                            var73 = 1;
                        } else if (var187 == 1613) {
                            field1029[++Statics.field1039 - 1] = var72.field2686.method179();
                            var73 = 1;
                        } else if (var187 == 1614) {
                            field1029[++Statics.field1039 - 1] = var72.field2786 ? 1 : 0;
                            var73 = 1;
                        } else {
                            var73 = 2;
                        }
                        var71 = var73;
                    } else if (var187 < 1800) {
                        class233 var77 = var55 ? Statics.field1035 : Statics.field1023;
                        byte var78;
                        if (var187 == 1700) {
                            field1029[++Statics.field1039 - 1] = var77.field2783;
                            var78 = 1;
                        } else if (var187 == 1701) {
                            if (var77.field2783 == -1) {
                                field1029[++Statics.field1039 - 1] = 0;
                            } else {
                                field1029[++Statics.field1039 - 1] = var77.field2661;
                            }
                            var78 = 1;
                        } else if (var187 == 1702) {
                            field1029[++Statics.field1039 - 1] = var77.field2657;
                            var78 = 1;
                        } else {
                            var78 = 2;
                        }
                        var71 = var78;
                    } else if (var187 < 1900) {
                        class233 var79 = var55 ? Statics.field1035 : Statics.field1023;
                        byte var80;
                        if (var187 == 1800) {
                            field1029[++Statics.field1039 - 1] = class234.method4585(client.method2323(var79));
                            var80 = 1;
                        } else if (var187 == 1801) {
                            int var81 = field1029[--Statics.field1039];
                            int var188 = var81 - 1;
                            if (var79.field2736 == null || var188 >= var79.field2736.length || var79.field2736[var188] == null) {
                                field1031[++Statics.field3702 - 1] = "";
                            } else {
                                field1031[++Statics.field3702 - 1] = var79.field2736[var188];
                            }
                            var80 = 1;
                        } else if (var187 == 1802) {
                            if (var79.field2735 == null) {
                                field1031[++Statics.field3702 - 1] = "";
                            } else {
                                field1031[++Statics.field3702 - 1] = var79.field2735;
                            }
                            var80 = 1;
                        } else {
                            var80 = 2;
                        }
                        var71 = var80;
                    } else if (var187 < 2000) {
                        var71 = method4243(var187, var4, var55);
                    } else if (var187 < 2100) {
                        var71 = method449(var187, var4, var55);
                    } else if (var187 < 2200) {
                        var71 = method3113(var187, var4, var55);
                    } else if (var187 < 2300) {
                        var71 = method291(var187, var4, var55);
                    } else if (var187 < 2400) {
                        var71 = method4160(var187, var4, var55);
                    } else if (var187 < 2500) {
                        var71 = method926(var187, var4, var55);
                    } else if (var187 < 2600) {
                        var71 = method2971(var187, var4, var55);
                    } else if (var187 < 2700) {
                        var71 = method2123(var187, var4, var55);
                    } else if (var187 < 2800) {
                        byte var83;
                        if (var187 == 2700) {
                            class233 var82 = class233.method130(field1029[--Statics.field1039]);
                            field1029[++Statics.field1039 - 1] = var82.field2783;
                            var83 = 1;
                        } else if (var187 == 2701) {
                            class233 var84 = class233.method130(field1029[--Statics.field1039]);
                            if (var84.field2783 == -1) {
                                field1029[++Statics.field1039 - 1] = 0;
                            } else {
                                field1029[++Statics.field1039 - 1] = var84.field2661;
                            }
                            var83 = 1;
                        } else if (var187 == 2702) {
                            int var85 = field1029[--Statics.field1039];
                            class57 var86 = (class57) client.field771.method3759((long) var85);
                            if (var86 == null) {
                                field1029[++Statics.field1039 - 1] = 0;
                            } else {
                                field1029[++Statics.field1039 - 1] = 1;
                            }
                            var83 = 1;
                        } else if (var187 == 2706) {
                            field1029[++Statics.field1039 - 1] = client.field816;
                            var83 = 1;
                        } else {
                            var83 = 2;
                        }
                        var71 = var83;
                    } else if (var187 < 2900) {
                        class233 var87 = class233.method130(field1029[--Statics.field1039]);
                        byte var88;
                        if (var187 == 2800) {
                            field1029[++Statics.field1039 - 1] = class234.method4585(client.method2323(var87));
                            var88 = 1;
                        } else if (var187 == 2801) {
                            int var89 = field1029[--Statics.field1039];
                            int var189 = var89 - 1;
                            if (var87.field2736 == null || var189 >= var87.field2736.length || var87.field2736[var189] == null) {
                                field1031[++Statics.field3702 - 1] = "";
                            } else {
                                field1031[++Statics.field3702 - 1] = var87.field2736[var189];
                            }
                            var88 = 1;
                        } else if (var187 == 2802) {
                            if (var87.field2735 == null) {
                                field1031[++Statics.field3702 - 1] = "";
                            } else {
                                field1031[++Statics.field3702 - 1] = var87.field2735;
                            }
                            var88 = 1;
                        } else {
                            var88 = 2;
                        }
                        var71 = var88;
                    } else if (var187 < 3000) {
                        var71 = method4243(var187, var4, var55);
                    } else if (var187 < 3200) {
                        byte var91;
                        if (var187 == 3100) {
                            String var90 = field1031[--Statics.field3702];
                            class86.method1011(0, "", var90);
                            var91 = 1;
                        } else if (var187 == 3101) {
                            Statics.field1039 -= 2;
                            client.method4364(Statics.field502, field1029[Statics.field1039], field1029[Statics.field1039 + 1]);
                            var91 = 1;
                        } else if (var187 == 3103) {
                            if (!field1040) {
                                field1036 = true;
                            }
                            var91 = 1;
                        } else if (var187 == 3104) {
                            String var92 = field1031[--Statics.field3702];
                            int var93 = 0;
                            boolean var94 = class308.method875(var92, 10, true);
                            if (var94) {
                                int var95 = class308.method2935(var92, 10, true);
                                var93 = var95;
                            }
                            class175 var96 = class175.method3561(class172.field2194, client.field798.field1265);
                            var96.field2323.method3528(var93);
                            client.field798.method1884(var96);
                            var91 = 1;
                        } else if (var187 == 3105) {
                            String var97 = field1031[--Statics.field3702];
                            class175 var98 = class175.method3561(class172.field2283, client.field798.field1265);
                            var98.field2323.method3531(var97.length() + 1);
                            var98.field2323.method3314(var97);
                            client.field798.method1884(var98);
                            var91 = 1;
                        } else if (var187 == 3106) {
                            String var99 = field1031[--Statics.field3702];
                            class175 var100 = class175.method3561(class172.field2207, client.field798.field1265);
                            var100.field2323.method3531(var99.length() + 1);
                            var100.field2323.method3314(var99);
                            client.field798.method1884(var100);
                            var91 = 1;
                        } else if (var187 == 3107) {
                            int var101 = field1029[--Statics.field1039];
                            String var102 = field1031[--Statics.field3702];
                            client.method442(var101, var102);
                            var91 = 1;
                        } else if (var187 == 3108) {
                            Statics.field1039 -= 3;
                            int var103 = field1029[Statics.field1039];
                            int var104 = field1029[Statics.field1039 + 1];
                            int var105 = field1029[Statics.field1039 + 2];
                            class233 var106 = class233.method130(var105);
                            client.method3217(var106, var103, var104);
                            var91 = 1;
                        } else if (var187 == 3109) {
                            Statics.field1039 -= 2;
                            int var107 = field1029[Statics.field1039];
                            int var108 = field1029[Statics.field1039 + 1];
                            class233 var109 = var55 ? Statics.field1035 : Statics.field1023;
                            client.method3217(var109, var107, var108);
                            var91 = 1;
                        } else if (var187 == 3110) {
                            Statics.field1754 = field1029[--Statics.field1039] == 1;
                            var91 = 1;
                        } else if (var187 == 3111) {
                            field1029[++Statics.field1039 - 1] = Statics.field1159.field989 ? 1 : 0;
                            var91 = 1;
                        } else if (var187 == 3112) {
                            Statics.field1159.field989 = field1029[--Statics.field1039] == 1;
                            class68.method601();
                            var91 = 1;
                        } else if (var187 == 3113) {
                            String var110 = field1031[--Statics.field3702];
                            boolean var111 = field1029[--Statics.field1039] == 1;
                            class46.method4235(var110, var111, false);
                            var91 = 1;
                        } else if (var187 == 3115) {
                            int var112 = field1029[--Statics.field1039];
                            class175 var113 = class175.method3561(class172.field2211, client.field798.field1265);
                            var113.field2323.method3449(var112);
                            client.field798.method1884(var113);
                            var91 = 1;
                        } else if (var187 == 3116) {
                            int var114 = field1029[--Statics.field1039];
                            Statics.field3702 -= 2;
                            String var115 = field1031[Statics.field3702];
                            String var116 = field1031[Statics.field3702 + 1];
                            if (var115.length() > 500) {
                                var91 = 1;
                            } else if (var116.length() > 500) {
                                var91 = 1;
                            } else {
                                class175 var117 = class175.method3561(class172.field2236, client.field798.field1265);
                                var117.field2323.method3449(1 + class185.method459(var115) + class185.method459(var116));
                                var117.field2323.method3314(var115);
                                var117.field2323.method3314(var116);
                                var117.field2323.method3351(var114);
                                client.field798.method1884(var117);
                                var91 = 1;
                            }
                        } else if (var187 == 3117) {
                            client.field759 = field1029[--Statics.field1039] == 1;
                            var91 = 1;
                        } else if (var187 == 3118) {
                            client.field715 = field1029[--Statics.field1039] == 1;
                            var91 = 1;
                        } else if (var187 == 3119) {
                            client.field804 = field1029[--Statics.field1039] == 1;
                            var91 = 1;
                        } else if (var187 == 3120) {
                            if (field1029[--Statics.field1039] == 1) {
                                client.field731 |= 0x1;
                            } else {
                                client.field731 &= 0xFFFFFFFE;
                            }
                            var91 = 1;
                        } else if (var187 == 3121) {
                            if (field1029[--Statics.field1039] == 1) {
                                client.field731 |= 0x2;
                            } else {
                                client.field731 &= 0xFFFFFFFD;
                            }
                            var91 = 1;
                        } else if (var187 == 3122) {
                            if (field1029[--Statics.field1039] == 1) {
                                client.field731 |= 0x4;
                            } else {
                                client.field731 &= 0xFFFFFFFB;
                            }
                            var91 = 1;
                        } else if (var187 == 3123) {
                            if (field1029[--Statics.field1039] == 1) {
                                client.field731 |= 0x8;
                            } else {
                                client.field731 &= 0xFFFFFFF7;
                            }
                            var91 = 1;
                        } else if (var187 == 3124) {
                            client.field731 = 0;
                            var91 = 1;
                        } else if (var187 == 3125) {
                            client.field621 = field1029[--Statics.field1039] == 1;
                            var91 = 1;
                        } else if (var187 == 3126) {
                            client.field725 = field1029[--Statics.field1039] == 1;
                            var91 = 1;
                        } else if (var187 == 3127) {
                            client.method1012(field1029[--Statics.field1039] == 1);
                            var91 = 1;
                        } else if (var187 == 3128) {
                            field1029[++Statics.field1039 - 1] = client.method925() ? 1 : 0;
                            var91 = 1;
                        } else if (var187 == 3129) {
                            Statics.field1039 -= 2;
                            client.field690 = field1029[Statics.field1039];
                            client.field691 = field1029[Statics.field1039 + 1];
                            var91 = 1;
                        } else if (var187 == 3130) {
                            Statics.field1039 -= 2;
                            var91 = 1;
                        } else if (var187 == 3131) {
                            Statics.field1039--;
                            var91 = 1;
                        } else if (var187 == 3132) {
                            field1029[++Statics.field1039 - 1] = Statics.field2097;
                            field1029[++Statics.field1039 - 1] = Statics.field3800;
                            var91 = 1;
                        } else if (var187 == 3133) {
                            Statics.field1039--;
                            var91 = 1;
                        } else if (var187 == 3134) {
                            var91 = 1;
                        } else if (var187 == 3135) {
                            Statics.field1039 -= 2;
                            var91 = 1;
                        } else if (var187 == 3136) {
                            client.field772 = 3;
                            client.field774 = field1029[--Statics.field1039];
                            var91 = 1;
                        } else if (var187 == 3137) {
                            client.field772 = 2;
                            client.field774 = field1029[--Statics.field1039];
                            var91 = 1;
                        } else if (var187 == 3138) {
                            client.field772 = 0;
                            var91 = 1;
                        } else if (var187 == 3139) {
                            client.field772 = 1;
                            var91 = 1;
                        } else if (var187 == 3140) {
                            client.field772 = 3;
                            client.field774 = var55 ? Statics.field1035.field2656 : Statics.field1023.field2656;
                            var91 = 1;
                        } else if (var187 == 3141) {
                            boolean var118 = field1029[--Statics.field1039] == 1;
                            Statics.field1159.field993 = var118;
                            class68.method601();
                            var91 = 1;
                        } else if (var187 == 3142) {
                            field1029[++Statics.field1039 - 1] = Statics.field1159.field993 ? 1 : 0;
                            var91 = 1;
                        } else if (var187 == 3143) {
                            boolean var119 = field1029[--Statics.field1039] == 1;
                            client.field648 = var119;
                            if (!var119) {
                                Statics.field1159.field992 = "";
                                class68.method601();
                            }
                            var91 = 1;
                        } else if (var187 == 3144) {
                            field1029[++Statics.field1039 - 1] = client.field648 ? 1 : 0;
                            var91 = 1;
                        } else {
                            var91 = 2;
                        }
                        var71 = var91;
                    } else if (var187 < 3300) {
                        var71 = method2862(var187, var4, var55);
                    } else if (var187 < 3400) {
                        var71 = method1788(var187, var4, var55);
                    } else if (var187 < 3500) {
                        var71 = method473(var187, var4, var55);
                    } else if (var187 < 3700) {
                        var71 = method2867(var187, var4, var55);
                    } else if (var187 < 4000) {
                        byte var121;
                        if (var187 == 3903) {
                            int var120 = field1029[--Statics.field1039];
                            field1029[++Statics.field1039 - 1] = client.field878[var120].method50();
                            var121 = 1;
                        } else if (var187 == 3904) {
                            int var122 = field1029[--Statics.field1039];
                            field1029[++Statics.field1039 - 1] = client.field878[var122].field32;
                            var121 = 1;
                        } else if (var187 == 3905) {
                            int var123 = field1029[--Statics.field1039];
                            field1029[++Statics.field1039 - 1] = client.field878[var123].field31;
                            var121 = 1;
                        } else if (var187 == 3906) {
                            int var124 = field1029[--Statics.field1039];
                            field1029[++Statics.field1039 - 1] = client.field878[var124].field29;
                            var121 = 1;
                        } else if (var187 == 3907) {
                            int var125 = field1029[--Statics.field1039];
                            field1029[++Statics.field1039 - 1] = client.field878[var125].field33;
                            var121 = 1;
                        } else if (var187 == 3908) {
                            int var126 = field1029[--Statics.field1039];
                            field1029[++Statics.field1039 - 1] = client.field878[var126].field34;
                            var121 = 1;
                        } else if (var187 == 3910) {
                            int var127 = field1029[--Statics.field1039];
                            int var128 = client.field878[var127].method44();
                            field1029[++Statics.field1039 - 1] = var128 == 0 ? 1 : 0;
                            var121 = 1;
                        } else if (var187 == 3911) {
                            int var129 = field1029[--Statics.field1039];
                            int var130 = client.field878[var129].method44();
                            field1029[++Statics.field1039 - 1] = var130 == 2 ? 1 : 0;
                            var121 = 1;
                        } else if (var187 == 3912) {
                            int var131 = field1029[--Statics.field1039];
                            int var132 = client.field878[var131].method44();
                            field1029[++Statics.field1039 - 1] = var132 == 5 ? 1 : 0;
                            var121 = 1;
                        } else if (var187 == 3913) {
                            int var133 = field1029[--Statics.field1039];
                            int var134 = client.field878[var133].method44();
                            field1029[++Statics.field1039 - 1] = var134 == 1 ? 1 : 0;
                            var121 = 1;
                        } else if (var187 == 3914) {
                            boolean var135 = field1029[--Statics.field1039] == 1;
                            if (Statics.field483 != null) {
                                Statics.field483.method15(class2.field10, var135);
                            }
                            var121 = 1;
                        } else if (var187 == 3915) {
                            boolean var136 = field1029[--Statics.field1039] == 1;
                            if (Statics.field483 != null) {
                                Statics.field483.method15(class2.field7, var136);
                            }
                            var121 = 1;
                        } else if (var187 == 3916) {
                            Statics.field1039 -= 2;
                            boolean var137 = field1029[Statics.field1039] == 1;
                            boolean var138 = field1029[Statics.field1039 + 1] == 1;
                            if (Statics.field483 != null) {
                                client.field844.field607 = var138;
                                Statics.field483.method15(client.field844, var137);
                            }
                            var121 = 1;
                        } else if (var187 == 3917) {
                            boolean var139 = field1029[--Statics.field1039] == 1;
                            if (Statics.field483 != null) {
                                Statics.field483.method15(class2.field13, var139);
                            }
                            var121 = 1;
                        } else if (var187 == 3918) {
                            boolean var140 = field1029[--Statics.field1039] == 1;
                            if (Statics.field483 != null) {
                                Statics.field483.method15(class2.field11, var140);
                            }
                            var121 = 1;
                        } else if (var187 == 3919) {
                            field1029[++Statics.field1039 - 1] = Statics.field483 == null ? 0 : Statics.field483.field8.size();
                            var121 = 1;
                        } else if (var187 == 3920) {
                            int var141 = field1029[--Statics.field1039];
                            class3 var142 = (class3) Statics.field483.field8.get(var141);
                            field1029[++Statics.field1039 - 1] = var142.field20;
                            var121 = 1;
                        } else if (var187 == 3921) {
                            int var143 = field1029[--Statics.field1039];
                            class3 var144 = (class3) Statics.field483.field8.get(var143);
                            field1031[++Statics.field3702 - 1] = var144.method25();
                            var121 = 1;
                        } else if (var187 == 3922) {
                            int var145 = field1029[--Statics.field1039];
                            class3 var146 = (class3) Statics.field483.field8.get(var145);
                            field1031[++Statics.field3702 - 1] = var146.method27();
                            var121 = 1;
                        } else if (var187 == 3923) {
                            int var147 = field1029[--Statics.field1039];
                            class3 var148 = (class3) Statics.field483.field8.get(var147);
                            long var149 = class187.method2864() - Statics.field484 - var148.field17;
                            int var151 = (int) (var149 / 3600000L);
                            int var152 = (int) ((var149 - (long) (var151 * 3600000)) / 60000L);
                            int var153 = (int) ((var149 - (long) (var151 * 3600000) - (long) (var152 * 60000)) / 1000L);
                            String var154 = var151 + ":" + var152 / 10 + var152 % 10 + ":" + var153 / 10 + var153 % 10;
                            field1031[++Statics.field3702 - 1] = var154;
                            var121 = 1;
                        } else if (var187 == 3924) {
                            int var155 = field1029[--Statics.field1039];
                            class3 var156 = (class3) Statics.field483.field8.get(var155);
                            field1029[++Statics.field1039 - 1] = var156.field16.field29;
                            var121 = 1;
                        } else if (var187 == 3925) {
                            int var157 = field1029[--Statics.field1039];
                            class3 var158 = (class3) Statics.field483.field8.get(var157);
                            field1029[++Statics.field1039 - 1] = var158.field16.field31;
                            var121 = 1;
                        } else if (var187 == 3926) {
                            int var159 = field1029[--Statics.field1039];
                            class3 var160 = (class3) Statics.field483.field8.get(var159);
                            field1029[++Statics.field1039 - 1] = var160.field16.field32;
                            var121 = 1;
                        } else {
                            var121 = 2;
                        }
                        var71 = var121;
                    } else if (var187 < 4100) {
                        var71 = method879(var187, var4, var55);
                    } else if (var187 < 4200) {
                        var71 = method3908(var187, var4, var55);
                    } else if (var187 < 4300) {
                        var71 = method3004(var187, var4, var55);
                    } else if (var187 < 5100) {
                        var71 = method563(var187, var4, var55);
                    } else if (var187 < 5400) {
                        byte var161;
                        if (var187 == 5306) {
                            field1029[++Statics.field1039 - 1] = client.method602();
                            var161 = 1;
                        } else if (var187 == 5307) {
                            int var162 = field1029[--Statics.field1039];
                            if (var162 == 1 || var162 == 2) {
                                client.field824 = 0L;
                                if (var162 >= 2) {
                                    client.field809 = true;
                                } else {
                                    client.field809 = false;
                                }
                                if (client.method602() == 1) {
                                    Statics.field3284.method704(765, 503);
                                } else {
                                    Statics.field3284.method704(7680, 2160);
                                }
                                if (client.field827 >= 25) {
                                    client.method1775();
                                }
                            }
                            var161 = 1;
                        } else if (var187 == 5308) {
                            field1029[++Statics.field1039 - 1] = Statics.field1159.field995;
                            var161 = 1;
                        } else if (var187 == 5309) {
                            int var163 = field1029[--Statics.field1039];
                            if (var163 == 1 || var163 == 2) {
                                Statics.field1159.field995 = var163;
                                class68.method601();
                            }
                            var161 = 1;
                        } else {
                            var161 = 2;
                        }
                        var71 = var161;
                    } else if (var187 < 5600) {
                        byte var169;
                        if (var187 == 5504) {
                            Statics.field1039 -= 2;
                            int var167 = field1029[Statics.field1039];
                            int var168 = field1029[Statics.field1039 + 1];
                            if (!client.field702) {
                                client.field679 = var167;
                                client.field680 = var168;
                            }
                            var169 = 1;
                        } else if (var187 == 5505) {
                            field1029[++Statics.field1039 - 1] = client.field679;
                            var169 = 1;
                        } else if (var187 == 5506) {
                            field1029[++Statics.field1039 - 1] = client.field680;
                            var169 = 1;
                        } else if (var187 == 5530) {
                            int var170 = field1029[--Statics.field1039];
                            if (var170 < 0) {
                                var170 = 0;
                            }
                            client.field686 = var170;
                            var169 = 1;
                        } else if (var187 == 5531) {
                            field1029[++Statics.field1039 - 1] = client.field686;
                            var169 = 1;
                        } else {
                            var169 = 2;
                        }
                        var71 = var169;
                    } else if (var187 < 5700) {
                        var71 = method874(var187, var4, var55);
                    } else if (var187 < 6300) {
                        byte var171;
                        if (var187 == 6200) {
                            Statics.field1039 -= 2;
                            client.field724 = (short) field1029[Statics.field1039];
                            if (client.field724 <= 0) {
                                client.field724 = 256;
                            }
                            client.field862 = (short) field1029[Statics.field1039 + 1];
                            if (client.field862 <= 0) {
                                client.field862 = 205;
                            }
                            var171 = 1;
                        } else if (var187 == 6201) {
                            Statics.field1039 -= 2;
                            client.field863 = (short) field1029[Statics.field1039];
                            if (client.field863 <= 0) {
                                client.field863 = 256;
                            }
                            client.field864 = (short) field1029[Statics.field1039 + 1];
                            if (client.field864 <= 0) {
                                client.field864 = 320;
                            }
                            var171 = 1;
                        } else if (var187 == 6202) {
                            Statics.field1039 -= 4;
                            client.field865 = (short) field1029[Statics.field1039];
                            if (client.field865 <= 0) {
                                client.field865 = 1;
                            }
                            client.field879 = (short) field1029[Statics.field1039 + 1];
                            if (client.field879 <= 0) {
                                client.field879 = 32767;
                            } else if (client.field879 < client.field865) {
                                client.field879 = client.field865;
                            }
                            client.field867 = (short) field1029[Statics.field1039 + 2];
                            if (client.field867 <= 0) {
                                client.field867 = 1;
                            }
                            client.field881 = (short) field1029[Statics.field1039 + 3];
                            if (client.field881 <= 0) {
                                client.field881 = 32767;
                            } else if (client.field881 < client.field867) {
                                client.field881 = client.field867;
                            }
                            var171 = 1;
                        } else if (var187 == 6203) {
                            if (client.field783 == null) {
                                field1029[++Statics.field1039 - 1] = -1;
                                field1029[++Statics.field1039 - 1] = -1;
                            } else {
                                client.method1731(0, 0, client.field783.field2746, client.field783.field2675, false);
                                field1029[++Statics.field1039 - 1] = client.field861;
                                field1029[++Statics.field1039 - 1] = client.field753;
                            }
                            var171 = 1;
                        } else if (var187 == 6204) {
                            field1029[++Statics.field1039 - 1] = client.field863;
                            field1029[++Statics.field1039 - 1] = client.field864;
                            var171 = 1;
                        } else if (var187 == 6205) {
                            field1029[++Statics.field1039 - 1] = client.field724;
                            field1029[++Statics.field1039 - 1] = client.field862;
                            var171 = 1;
                        } else {
                            var171 = 2;
                        }
                        var71 = var171;
                    } else if (var187 < 6600) {
                        var71 = method644(var187, var4, var55);
                    } else if (var187 < 6700) {
                        var71 = method4255(var187, var4, var55);
                    } else {
                        var71 = 2;
                    }
                    switch(var71) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var187 == 0) {
                    field1029[++Statics.field1039 - 1] = var8[var6];
                } else if (var187 == 1) {
                    int var16 = var8[var6];
                    field1029[++Statics.field1039 - 1] = class228.field2617[var16];
                } else if (var187 == 2) {
                    int var17 = var8[var6];
                    class228.field2617[var17] = field1029[--Statics.field1039];
                    client.method2960(var17);
                } else if (var187 == 3) {
                    field1031[++Statics.field3702 - 1] = var4.field1235[var6];
                } else if (var187 == 6) {
                    var6 += var8[var6];
                } else if (var187 == 7) {
                    Statics.field1039 -= 2;
                    if (field1029[Statics.field1039] != field1029[Statics.field1039 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var187 == 8) {
                    Statics.field1039 -= 2;
                    if (field1029[Statics.field1039] == field1029[Statics.field1039 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var187 == 9) {
                    Statics.field1039 -= 2;
                    if (field1029[Statics.field1039] < field1029[Statics.field1039 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var187 == 10) {
                    Statics.field1039 -= 2;
                    if (field1029[Statics.field1039] > field1029[Statics.field1039 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var187 == 21) {
                    if (field1033 == 0) {
                        return;
                    }
                    class52 var20 = field1024[--field1033];
                    var4 = var20.field480;
                    var7 = var4.field1239;
                    var8 = var4.field1234;
                    var6 = var20.field478;
                    Statics.field1046 = var20.field482;
                    Statics.field1026 = var20.field479;
                } else if (var187 == 25) {
                    int var21 = var8[var6];
                    field1029[++Statics.field1039 - 1] = class228.method148(var21);
                } else if (var187 == 27) {
                    int var22 = var8[var6];
                    class228.method3037(var22, field1029[--Statics.field1039]);
                } else if (var187 == 31) {
                    Statics.field1039 -= 2;
                    if (field1029[Statics.field1039] <= field1029[Statics.field1039 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var187 == 32) {
                    Statics.field1039 -= 2;
                    if (field1029[Statics.field1039] >= field1029[Statics.field1039 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var187 == 33) {
                    field1029[++Statics.field1039 - 1] = Statics.field1046[var8[var6]];
                } else if (var187 == 34) {
                    Statics.field1046[var8[var6]] = field1029[--Statics.field1039];
                } else if (var187 == 35) {
                    field1031[++Statics.field3702 - 1] = Statics.field1026[var8[var6]];
                } else if (var187 == 36) {
                    Statics.field1026[var8[var6]] = field1031[--Statics.field3702];
                } else if (var187 == 37) {
                    int var23 = var8[var6];
                    Statics.field3702 -= var23;
                    String[] var24 = field1031;
                    int var25 = Statics.field3702;
                    String var26;
                    if (var23 == 0) {
                        var26 = "";
                    } else if (var23 == 1) {
                        String var27 = var24[var25];
                        if (var27 == null) {
                            var26 = "null";
                        } else {
                            var26 = var27.toString();
                        }
                    } else {
                        int var28 = var23 + var25;
                        int var29 = 0;
                        for (int var30 = var25; var30 < var28; var30++) {
                            String var31 = var24[var30];
                            if (var31 == null) {
                                var29 += 4;
                            } else {
                                var29 += var31.length();
                            }
                        }
                        StringBuilder var32 = new StringBuilder(var29);
                        for (int var33 = var25; var33 < var28; var33++) {
                            String var34 = var24[var33];
                            if (var34 == null) {
                                var32.append("null");
                            } else {
                                var32.append(var34);
                            }
                        }
                        var26 = var32.toString();
                    }
                    field1031[++Statics.field3702 - 1] = var26;
                } else if (var187 == 38) {
                    Statics.field1039--;
                } else if (var187 == 39) {
                    Statics.field3702--;
                } else if (var187 == 40) {
                    int var36 = var8[var6];
                    class87 var37 = class87.method876(var36);
                    int[] var38 = new int[var37.field1236];
                    String[] var39 = new String[var37.field1237];
                    for (int var40 = 0; var40 < var37.field1240; var40++) {
                        var38[var40] = field1029[Statics.field1039 - var37.field1240 + var40];
                    }
                    for (int var41 = 0; var41 < var37.field1233; var41++) {
                        var39[var41] = field1031[Statics.field3702 - var37.field1233 + var41];
                    }
                    Statics.field1039 -= var37.field1240;
                    Statics.field3702 -= var37.field1233;
                    class52 var42 = new class52();
                    var42.field480 = var4;
                    var42.field478 = var6;
                    var42.field482 = Statics.field1046;
                    var42.field479 = Statics.field1026;
                    field1024[++field1033 - 1] = var42;
                    var4 = var37;
                    var7 = var37.field1239;
                    var8 = var37.field1234;
                    var6 = -1;
                    Statics.field1046 = var38;
                    Statics.field1026 = var39;
                } else if (var187 == 42) {
                    field1029[++Statics.field1039 - 1] = Statics.field3612.method1815(var8[var6]);
                } else if (var187 == 43) {
                    Statics.field3612.method1830(var8[var6], field1029[--Statics.field1039]);
                } else if (var187 == 44) {
                    int var43 = var8[var6] >> 16;
                    int var44 = var8[var6] & 0xFFFF;
                    int var45 = field1029[--Statics.field1039];
                    if (var45 < 0 || var45 > 5000) {
                        throw new RuntimeException();
                    }
                    field1027[var43] = var45;
                    byte var46 = -1;
                    if (var44 == 105) {
                        var46 = 0;
                    }
                    for (int var47 = 0; var47 < var45; var47++) {
                        field1028[var43][var47] = var46;
                    }
                } else if (var187 == 45) {
                    int var48 = var8[var6];
                    int var49 = field1029[--Statics.field1039];
                    if (var49 < 0 || var49 >= field1027[var48]) {
                        throw new RuntimeException();
                    }
                    field1029[++Statics.field1039 - 1] = field1028[var48][var49];
                } else if (var187 == 46) {
                    int var50 = var8[var6];
                    Statics.field1039 -= 2;
                    int var51 = field1029[Statics.field1039];
                    if (var51 < 0 || var51 >= field1027[var50]) {
                        throw new RuntimeException();
                    }
                    field1028[var50][var51] = field1029[Statics.field1039 + 1];
                } else if (var187 == 47) {
                    String var52 = Statics.field3612.method1807(var8[var6]);
                    if (var52 == null) {
                        var52 = class240.field2850;
                    }
                    field1031[++Statics.field3702 - 1] = var52;
                } else if (var187 == 48) {
                    Statics.field3612.method1806(var8[var6], field1031[--Statics.field3702]);
                } else if (var187 == 60) {
                    class200 var53 = var4.field1238[var8[var6]];
                    class214 var54 = (class214) var53.method3710((long) field1029[--Statics.field1039]);
                    if (var54 != null) {
                        var6 += var54.field2502;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var185) {
            StringBuilder var176 = new StringBuilder(30);
            var176.append("").append(var4.field2486).append(" ");
            for (int var177 = field1033 - 1; var177 >= 0; var177--) {
                var176.append("").append(field1024[var177].field480.field2486).append(" ");
            }
            var176.append("").append(var9);
            class155.method1834(var176.toString(), var185);
        } finally {
            if (field1036) {
                field1040 = true;
                class175 var181 = class175.method3561(class172.field2248, client.field798.field1265);
                client.field798.method1884(var181);
                for (class57 var182 = (class57) client.field771.method3766(); var182 != null; var182 = (class57) client.field771.method3764()) {
                    if (var182.field526 == 0 || var182.field526 == 3) {
                        client.method937(var182, true);
                    }
                }
                if (client.field710 != null) {
                    client.method956(client.field710);
                    client.field710 = null;
                }
                field1040 = false;
                field1036 = false;
            }
        }
    }

    @ObfuscatedName("av.e(ILcw;ZB)I")
    public static int method449(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1029[--Statics.field1039];
            var4 = class233.method130(var3);
        } else {
            var4 = arg2 ? Statics.field1035 : Statics.field1023;
        }
        if (arg0 == 1000) {
            Statics.field1039 -= 4;
            var4.field2665 = field1029[Statics.field1039];
            var4.field2666 = field1029[Statics.field1039 + 1];
            var4.field2734 = field1029[Statics.field1039 + 2];
            var4.field2662 = field1029[Statics.field1039 + 3];
            client.method956(var4);
            Statics.field3284.method1241(var4);
            if (var3 != -1 && var4.field2658 == 0) {
                client.method62(Statics.field2763[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1039 -= 4;
            var4.field2667 = field1029[Statics.field1039];
            var4.field2760 = field1029[Statics.field1039 + 1];
            var4.field2663 = field1029[Statics.field1039 + 2];
            var4.field2670 = field1029[Statics.field1039 + 3];
            client.method956(var4);
            Statics.field3284.method1241(var4);
            if (var3 != -1 && var4.field2658 == 0) {
                client.method62(Statics.field2763[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1029[--Statics.field1039] == 1;
            if (var4.field2676 != var5) {
                var4.field2676 = var5;
                client.method956(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2769 = field1029[--Statics.field1039] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2797 = field1029[--Statics.field1039] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.b(ILcw;ZI)I")
    public static int method3113(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1029[--Statics.field1039];
            var4 = class233.method130(var3);
        } else {
            var4 = arg2 ? Statics.field1035 : Statics.field1023;
        }
        if (arg0 == 1100) {
            Statics.field1039 -= 2;
            var4.field2764 = field1029[Statics.field1039];
            if (var4.field2764 > var4.field2715 - var4.field2746) {
                var4.field2764 = var4.field2715 - var4.field2746;
            }
            if (var4.field2764 < 0) {
                var4.field2764 = 0;
            }
            var4.field2678 = field1029[Statics.field1039 + 1];
            if (var4.field2678 > var4.field2680 - var4.field2675) {
                var4.field2678 = var4.field2680 - var4.field2675;
            }
            if (var4.field2678 < 0) {
                var4.field2678 = 0;
            }
            client.method956(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2681 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2685 = field1029[--Statics.field1039] == 1;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2687 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2699 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2691 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2693 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2741 = field1029[--Statics.field1039] == 1;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2710 = 1;
            var4.field2700 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1039 -= 6;
            var4.field2705 = field1029[Statics.field1039];
            var4.field2706 = field1029[Statics.field1039 + 1];
            var4.field2733 = field1029[Statics.field1039 + 2];
            var4.field2708 = field1029[Statics.field1039 + 3];
            var4.field2755 = field1029[Statics.field1039 + 4];
            var4.field2689 = field1029[Statics.field1039 + 5];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1029[--Statics.field1039];
            if (var4.field2703 != var5) {
                var4.field2703 = var5;
                var4.field2677 = 0;
                var4.field2784 = 0;
                client.method956(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2713 = field1029[--Statics.field1039] == 1;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1031[--Statics.field3702];
            if (!var6.equals(var4.field2717)) {
                var4.field2717 = var6;
                client.method956(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2716 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1039 -= 3;
            var4.field2720 = field1029[Statics.field1039];
            var4.field2683 = field1029[Statics.field1039 + 1];
            var4.field2719 = field1029[Statics.field1039 + 2];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2722 = field1029[--Statics.field1039] == 1;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2695 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2696 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2697 = field1029[--Statics.field1039] == 1;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2737 = field1029[--Statics.field1039] == 1;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1039 -= 2;
            var4.field2715 = field1029[Statics.field1039];
            var4.field2680 = field1029[Statics.field1039 + 1];
            client.method956(var4);
            if (var3 != -1 && var4.field2658 == 0) {
                client.method62(Statics.field2763[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2656;
            int var8 = var4.field2657;
            class175 var9 = class175.method3561(class172.field2218, client.field798.field1265);
            var9.field2323.method3359(var8);
            var9.field2323.method3528(var7);
            client.field798.method1884(var9);
            client.field710 = var4;
            client.method956(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2692 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2682 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2688 = field1029[--Statics.field1039];
            client.method956(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1029[--Statics.field1039];
            class322 var11 = (class322) class180.method3213(class322.method604(), var10);
            if (var11 != null) {
                var4.field2686 = var11;
                client.method956(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = field1029[--Statics.field1039] == 1;
            var4.field2690 = var12;
            return 1;
        } else if (arg0 == 1127) {
            boolean var13 = field1029[--Statics.field1039] == 1;
            var4.field2786 = var13;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.l(ILcw;ZI)I")
    public static int method291(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method130(field1029[--Statics.field1039]);
        } else {
            var3 = arg2 ? Statics.field1035 : Statics.field1023;
        }
        client.method956(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1039 -= 2;
            int var4 = field1029[Statics.field1039];
            int var5 = field1029[Statics.field1039 + 1];
            var3.field2783 = var4;
            var3.field2661 = var5;
            class272 var6 = class272.method2892(var4);
            var3.field2733 = var6.field3498;
            var3.field2708 = var6.field3499;
            var3.field2755 = var6.field3532;
            var3.field2705 = var6.field3501;
            var3.field2706 = var6.field3517;
            var3.field2689 = var6.field3497;
            if (arg0 == 1205) {
                var3.field2751 = 0;
            } else if (arg0 == 1212 | var6.field3503 == 1) {
                var3.field2751 = 1;
            } else {
                var3.field2751 = 2;
            }
            if (var3.field2711 > 0) {
                var3.field2689 = var3.field2689 * 32 / var3.field2711;
            } else if (var3.field2667 > 0) {
                var3.field2689 = var3.field2689 * 32 / var3.field2667;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2710 = 2;
            var3.field2700 = field1029[--Statics.field1039];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2710 = 3;
            var3.field2700 = Statics.field502.field582.method4154();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.w(ILcw;ZB)I")
    public static int method4160(int arg0, class87 arg1, boolean arg2) {
        boolean var3 = true;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class233.method130(field1029[--Statics.field1039]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1035 : Statics.field1023;
        }
        if (arg0 == 1300) {
            int var5 = field1029[--Statics.field1039] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4205(var5, field1031[--Statics.field3702]);
                return 1;
            } else {
                Statics.field3702--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1039 -= 2;
            int var6 = field1029[Statics.field1039];
            int var7 = field1029[Statics.field1039 + 1];
            var4.field2732 = class233.method3146(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2724 = field1029[--Statics.field1039] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2738 = field1029[--Statics.field1039];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2739 = field1029[--Statics.field1039];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2735 = field1031[--Statics.field3702];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2664 = field1031[--Statics.field3702];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2736 = null;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1039 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1029[Statics.field1039 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1029[Statics.field1039 + var10];
                        var9[var10 / 2] = (byte) field1029[Statics.field1039 + var10 + 1];
                    }
                }
            } else {
                Statics.field1039 -= 2;
                var8 = new byte[] { (byte) field1029[Statics.field1039] };
                var9 = new byte[] { (byte) field1029[Statics.field1039 + 1] };
            }
            int var11 = field1029[--Statics.field1039] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method88(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1039 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1029[Statics.field1039] };
            byte[] var14 = new byte[] { (byte) field1029[Statics.field1039 + 1] };
            method88(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1039 -= 3;
            int var15 = field1029[Statics.field1039] - 1;
            int var16 = field1029[Statics.field1039 + 1];
            int var17 = field1029[Statics.field1039 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method4634(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1029[--Statics.field1039];
            int var20 = field1029[--Statics.field1039];
            method4634(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1039--;
            int var21 = field1029[Statics.field1039] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method1461(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method1461(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.d(Lhk;I[B[BI)V")
    public static final void method88(class233 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2790 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2790 = new byte[11][];
            arg0.field2698 = new byte[11][];
            arg0.field2714 = new int[11];
            arg0.field2776 = new int[11];
        }
        arg0.field2790[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2730 = false;
            for (int var4 = 0; var4 < arg0.field2790.length; var4++) {
                if (arg0.field2790[var4] != null) {
                    arg0.field2730 = true;
                    break;
                }
            }
        } else {
            arg0.field2730 = true;
        }
        arg0.field2698[arg1] = arg3;
    }

    @ObfuscatedName("jj.n(Lhk;IIII)V")
    public static final void method4634(class233 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2714 == null) {
            throw new RuntimeException();
        }
        arg0.field2714[arg1] = arg2;
        arg0.field2776[arg1] = arg3;
    }

    @ObfuscatedName("by.s(Lhk;IB)V")
    public static final void method1461(class233 arg0, int arg1) {
        if (arg0.field2790 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2668 == null) {
            arg0.field2668 = new int[arg0.field2790.length];
        }
        arg0.field2668[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("az.g(ILcw;ZI)I")
    public static int method926(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method130(field1029[--Statics.field1039]);
        } else {
            var3 = arg2 ? Statics.field1035 : Statics.field1023;
        }
        String var4 = field1031[--Statics.field3702];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1029[--Statics.field1039];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1029[--Statics.field1039];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1031[--Statics.field3702];
            } else {
                var7[var8] = Integer.valueOf(field1029[--Statics.field1039]);
            }
        }
        int var9 = field1029[--Statics.field1039];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2744 = var7;
        } else if (arg0 == 1401) {
            var3.field2747 = var7;
        } else if (arg0 == 1402) {
            var3.field2728 = var7;
        } else if (arg0 == 1403) {
            var3.field2748 = var7;
        } else if (arg0 == 1404) {
            var3.field2750 = var7;
        } else if (arg0 == 1405) {
            var3.field2721 = var7;
        } else if (arg0 == 1406) {
            var3.field2754 = var7;
        } else if (arg0 == 1407) {
            var3.field2673 = var7;
            var3.field2756 = var5;
        } else if (arg0 == 1408) {
            var3.field2761 = var7;
        } else if (arg0 == 1409) {
            var3.field2762 = var7;
        } else if (arg0 == 1410) {
            var3.field2752 = var7;
        } else if (arg0 == 1411) {
            var3.field2745 = var7;
        } else if (arg0 == 1412) {
            var3.field2781 = var7;
        } else if (arg0 == 1414) {
            var3.field2757 = var7;
            var3.field2758 = var5;
        } else if (arg0 == 1415) {
            var3.field2759 = var7;
            var3.field2749 = var5;
        } else if (arg0 == 1416) {
            var3.field2753 = var7;
        } else if (arg0 == 1417) {
            var3.field2731 = var7;
        } else if (arg0 == 1418) {
            var3.field2694 = var7;
        } else if (arg0 == 1419) {
            var3.field2796 = var7;
        } else if (arg0 == 1420) {
            var3.field2782 = var7;
        } else if (arg0 == 1421) {
            var3.field2767 = var7;
        } else if (arg0 == 1422) {
            var3.field2768 = var7;
        } else if (arg0 == 1423) {
            var3.field2780 = var7;
        } else if (arg0 == 1424) {
            var3.field2770 = var7;
        } else if (arg0 == 1425) {
            var3.field2772 = var7;
        } else if (arg0 == 1426) {
            var3.field2773 = var7;
        } else if (arg0 == 1427) {
            var3.field2771 = var7;
        } else {
            return 2;
        }
        var3.field2729 = true;
        return 1;
    }

    @ObfuscatedName("t.k(ILcw;ZI)I")
    public static int method216(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field1035 : Statics.field1023;
        if (arg0 == 1500) {
            field1029[++Statics.field1039 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 1501) {
            field1029[++Statics.field1039 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 1502) {
            field1029[++Statics.field1039 - 1] = var3.field2746;
            return 1;
        } else if (arg0 == 1503) {
            field1029[++Statics.field1039 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1504) {
            field1029[++Statics.field1039 - 1] = var3.field2676 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1029[++Statics.field1039 - 1] = var3.field2672;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("il.m(ILcw;ZB)I")
    public static int method4243(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method130(field1029[--Statics.field1039]);
        } else {
            var3 = arg2 ? Statics.field1035 : Statics.field1023;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1041 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2771 == null) {
            return 0;
        } else {
            class58 var4 = new class58();
            var4.field531 = var3;
            var4.field545 = var3.field2771;
            var4.field539 = field1041 + 1;
            client.field770.method3831(var4);
            return 1;
        }
    }

    @ObfuscatedName("ep.q(ILcw;ZI)I")
    public static int method2971(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method130(field1029[--Statics.field1039]);
        if (arg0 == 2500) {
            field1029[++Statics.field1039 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 2501) {
            field1029[++Statics.field1039 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 2502) {
            field1029[++Statics.field1039 - 1] = var3.field2746;
            return 1;
        } else if (arg0 == 2503) {
            field1029[++Statics.field1039 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2504) {
            field1029[++Statics.field1039 - 1] = var3.field2676 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1029[++Statics.field1039 - 1] = var3.field2672;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dl.x(ILcw;ZI)I")
    public static int method2123(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method130(field1029[--Statics.field1039]);
        if (arg0 == 2600) {
            field1029[++Statics.field1039 - 1] = var3.field2764;
            return 1;
        } else if (arg0 == 2601) {
            field1029[++Statics.field1039 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 2602) {
            field1031[++Statics.field3702 - 1] = var3.field2717;
            return 1;
        } else if (arg0 == 2603) {
            field1029[++Statics.field1039 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 2604) {
            field1029[++Statics.field1039 - 1] = var3.field2680;
            return 1;
        } else if (arg0 == 2605) {
            field1029[++Statics.field1039 - 1] = var3.field2689;
            return 1;
        } else if (arg0 == 2606) {
            field1029[++Statics.field1039 - 1] = var3.field2733;
            return 1;
        } else if (arg0 == 2607) {
            field1029[++Statics.field1039 - 1] = var3.field2755;
            return 1;
        } else if (arg0 == 2608) {
            field1029[++Statics.field1039 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 2609) {
            field1029[++Statics.field1039 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 2610) {
            field1029[++Statics.field1039 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 2611) {
            field1029[++Statics.field1039 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2612) {
            field1029[++Statics.field1039 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 2613) {
            field1029[++Statics.field1039 - 1] = var3.field2686.method179();
            return 1;
        } else if (arg0 == 2614) {
            field1029[++Statics.field1039 - 1] = var3.field2786 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dv.u(ILcw;ZI)I")
    public static int method2862(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1039 -= 3;
            client.method880(field1029[Statics.field1039], field1029[Statics.field1039 + 1], field1029[Statics.field1039 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method568(field1029[--Statics.field1039]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1039 -= 2;
            int var3 = field1029[Statics.field1039];
            int var4 = field1029[Statics.field1039 + 1];
            if (client.field705 != 0 && var3 != -1) {
                class220.method3559(Statics.field1500, var3, 0, client.field705, false);
                client.field846 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.o(ILcw;ZI)I")
    public static int method1788(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1029[++Statics.field1039 - 1] = client.field633;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1039 -= 2;
            int var3 = field1029[Statics.field1039];
            int var4 = field1029[Statics.field1039 + 1];
            int[] var5 = field1029;
            int var6 = ++Statics.field1039 - 1;
            class55 var7 = (class55) class55.field499.method3759((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field497.length) {
                var8 = var7.field497[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1039 -= 2;
            int var9 = field1029[Statics.field1039];
            int var10 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = class55.method4161(var9, var10);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1039 -= 2;
            int var11 = field1029[Statics.field1039];
            int var12 = field1029[Statics.field1039 + 1];
            int[] var13 = field1029;
            int var14 = ++Statics.field1039 - 1;
            class55 var15 = (class55) class55.field499.method3759((long) var11);
            int var16;
            if (var15 == null) {
                var16 = 0;
            } else if (var12 == -1) {
                var16 = 0;
            } else {
                int var17 = 0;
                for (int var18 = 0; var18 < var15.field495.length; var18++) {
                    if (var15.field497[var18] == var12) {
                        var17 += var15.field495[var18];
                    }
                }
                var16 = var17;
            }
            var13[var14] = var16;
            return 1;
        } else if (arg0 == 3304) {
            int var19 = field1029[--Statics.field1039];
            int[] var20 = field1029;
            int var21 = ++Statics.field1039 - 1;
            class256 var22 = (class256) class256.field3282.method3724((long) var19);
            class256 var23;
            if (var22 == null) {
                byte[] var24 = Statics.field3281.method4267(5, var19);
                class256 var25 = new class256();
                if (var24 != null) {
                    var25.method4435(new class185(var24));
                }
                class256.field3282.method3723(var25, (long) var19);
                var23 = var25;
            } else {
                var23 = var22;
            }
            var20[var21] = var23.field3283;
            return 1;
        } else if (arg0 == 3305) {
            int var26 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = client.field756[var26];
            return 1;
        } else if (arg0 == 3306) {
            int var27 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = client.field744[var27];
            return 1;
        } else if (arg0 == 3307) {
            int var28 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = client.field745[var28];
            return 1;
        } else if (arg0 == 3308) {
            int var29 = Statics.field517;
            int var30 = (Statics.field502.field953 >> 7) + Statics.field1225;
            int var31 = (Statics.field502.field919 >> 7) + Statics.field64;
            field1029[++Statics.field1039 - 1] = (var29 << 28) + (var30 << 14) + var31;
            return 1;
        } else if (arg0 == 3309) {
            int var32 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = var32 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var33 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = var33 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var34 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = var34 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1029[++Statics.field1039 - 1] = client.field751 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1039 -= 2;
            int var35 = field1029[Statics.field1039] + 32768;
            int var36 = field1029[Statics.field1039 + 1];
            int[] var37 = field1029;
            int var38 = ++Statics.field1039 - 1;
            class55 var39 = (class55) class55.field499.method3759((long) var35);
            int var40;
            if (var39 == null) {
                var40 = -1;
            } else if (var36 >= 0 && var36 < var39.field497.length) {
                var40 = var39.field497[var36];
            } else {
                var40 = -1;
            }
            var37[var38] = var40;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1039 -= 2;
            int var41 = field1029[Statics.field1039] + 32768;
            int var42 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = class55.method4161(var41, var42);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1039 -= 2;
            int var43 = field1029[Statics.field1039] + 32768;
            int var44 = field1029[Statics.field1039 + 1];
            int[] var45 = field1029;
            int var46 = ++Statics.field1039 - 1;
            class55 var47 = (class55) class55.field499.method3759((long) var43);
            int var48;
            if (var47 == null) {
                var48 = 0;
            } else if (var44 == -1) {
                var48 = 0;
            } else {
                int var49 = 0;
                for (int var50 = 0; var50 < var47.field495.length; var50++) {
                    if (var47.field497[var50] == var44) {
                        var49 += var47.field495[var50];
                    }
                }
                var48 = var49;
            }
            var45[var46] = var48;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field780 >= 2) {
                field1029[++Statics.field1039 - 1] = client.field780;
            } else {
                field1029[++Statics.field1039 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1029[++Statics.field1039 - 1] = client.field628;
            return 1;
        } else if (arg0 == 3318) {
            field1029[++Statics.field1039 - 1] = client.field610;
            return 1;
        } else if (arg0 == 3321) {
            field1029[++Statics.field1039 - 1] = client.field778;
            return 1;
        } else if (arg0 == 3322) {
            field1029[++Statics.field1039 - 1] = client.field779;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field782) {
                field1029[++Statics.field1039 - 1] = 1;
            } else {
                field1029[++Statics.field1039 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1029[++Statics.field1039 - 1] = client.field611;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1039 -= 4;
            int var51 = field1029[Statics.field1039];
            int var52 = field1029[Statics.field1039 + 1];
            int var53 = field1029[Statics.field1039 + 2];
            int var54 = field1029[Statics.field1039 + 3];
            int var55 = (var52 << 14) + var51;
            int var56 = (var53 << 28) + var55;
            int var57 = var54 + var56;
            field1029[++Statics.field1039 - 1] = var57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.t(ILcw;ZI)I")
    public static int method473(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1039 -= 2;
            int var3 = field1029[Statics.field1039];
            int var4 = field1029[Statics.field1039 + 1];
            class269 var5 = Statics.method1870(var3);
            if (var5.field3394 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3400; var6++) {
                if (var5.field3401[var6] == var4) {
                    field1031[++Statics.field3702 - 1] = var5.field3399[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1031[++Statics.field3702 - 1] = var5.field3398;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1039 -= 4;
            int var7 = field1029[Statics.field1039];
            int var8 = field1029[Statics.field1039 + 1];
            int var9 = field1029[Statics.field1039 + 2];
            int var10 = field1029[Statics.field1039 + 3];
            class269 var11 = Statics.method1870(var9);
            if (var11.field3396 != var7 || var11.field3394 != var8) {
                if (var8 == 115) {
                    field1031[++Statics.field3702 - 1] = class240.field2850;
                } else {
                    field1029[++Statics.field1039 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3400; var12++) {
                if (var11.field3401[var12] == var10) {
                    if (var8 == 115) {
                        field1031[++Statics.field3702 - 1] = var11.field3399[var12];
                    } else {
                        field1029[++Statics.field1039 - 1] = var11.field3402[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1031[++Statics.field3702 - 1] = var11.field3398;
                } else {
                    field1029[++Statics.field1039 - 1] = var11.field3397;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1029[--Statics.field1039];
            class269 var14 = Statics.method1870(var13);
            field1029[++Statics.field1039 - 1] = var14.method4623();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.v(ILcw;ZI)I")
    public static int method2867(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field191.field998 == 0) {
                field1029[++Statics.field1039 - 1] = -2;
            } else if (Statics.field191.field998 == 1) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = Statics.field191.field1000.method4966();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1029[--Statics.field1039];
            if (Statics.field191.method1570() && var3 >= 0 && var3 < Statics.field191.field1000.method4966()) {
                class295 var4 = (class295) Statics.field191.field1000.method4976(var3);
                field1031[++Statics.field3702 - 1] = var4.method4931();
                field1031[++Statics.field3702 - 1] = var4.method4929();
            } else {
                field1031[++Statics.field3702 - 1] = "";
                field1031[++Statics.field3702 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1029[--Statics.field1039];
            if (Statics.field191.method1570() && var5 >= 0 && var5 < Statics.field191.field1000.method4966()) {
                field1029[++Statics.field1039 - 1] = ((class290) Statics.field191.field1000.method4976(var5)).field3696;
            } else {
                field1029[++Statics.field1039 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1029[--Statics.field1039];
            if (Statics.field191.method1570() && var6 >= 0 && var6 < Statics.field191.field1000.method4966()) {
                field1029[++Statics.field1039 - 1] = ((class290) Statics.field191.field1000.method4976(var6)).field3695;
            } else {
                field1029[++Statics.field1039 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1031[--Statics.field3702];
            int var8 = field1029[--Statics.field1039];
            class175 var9 = class175.method3561(class172.field2221, client.field798.field1265);
            var9.field2323.method3531(class185.method459(var7) + 1);
            var9.field2323.method3314(var7);
            var9.field2323.method3351(var8);
            client.field798.method1884(var9);
            return 1;
        } else if (arg0 == 3605) {
            String var10 = field1031[--Statics.field3702];
            Statics.field191.method1590(var10);
            return 1;
        } else if (arg0 == 3606) {
            String var11 = field1031[--Statics.field3702];
            Statics.field191.method1580(var11);
            return 1;
        } else if (arg0 == 3607) {
            String var12 = field1031[--Statics.field3702];
            Statics.field191.method1554(var12);
            return 1;
        } else if (arg0 == 3608) {
            String var13 = field1031[--Statics.field3702];
            Statics.field191.method1566(var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field1031[--Statics.field3702];
            String var15 = client.method2128(var14);
            field1029[++Statics.field1039 - 1] = Statics.field191.method1550(new class294(var15, Statics.field459), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1960 == null) {
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1031[++Statics.field3702 - 1] = Statics.field1960.field3719;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1960 == null) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = Statics.field1960.method4966();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field1029[--Statics.field1039];
            if (Statics.field1960 == null || var16 >= Statics.field1960.method4966()) {
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1031[++Statics.field3702 - 1] = Statics.field1960.method4976(var16).method4927().method5059();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field1029[--Statics.field1039];
            if (Statics.field1960 == null || var17 >= Statics.field1960.method4966()) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = ((class290) Statics.field1960.method4976(var17)).method5044();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field1029[--Statics.field1039];
            if (Statics.field1960 == null || var18 >= Statics.field1960.method4966()) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = ((class290) Statics.field1960.method4976(var18)).field3695;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1029[++Statics.field1039 - 1] = Statics.field1960 == null ? 0 : Statics.field1960.field3722;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field1031[--Statics.field3702];
            if (Statics.field1960 != null) {
                class175 var20 = class175.method3561(class172.field2228, client.field798.field1265);
                var20.field2323.method3531(class185.method459(var19));
                var20.field2323.method3314(var19);
                client.field798.method1884(var20);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1029[++Statics.field1039 - 1] = Statics.field1960 == null ? 0 : Statics.field1960.field3723;
            return 1;
        } else if (arg0 == 3619) {
            String var21 = field1031[--Statics.field3702];
            client.method437(var21);
            return 1;
        } else if (arg0 == 3620) {
            class175 var22 = class175.method3561(class172.field2209, client.field798.field1265);
            var22.field2323.method3531(0);
            client.field798.method1884(var22);
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field191.method1570()) {
                field1029[++Statics.field1039 - 1] = Statics.field191.field1001.method4966();
            } else {
                field1029[++Statics.field1039 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var23 = field1029[--Statics.field1039];
            if (Statics.field191.method1570() && var23 >= 0 && var23 < Statics.field191.field1001.method4966()) {
                class289 var24 = (class289) Statics.field191.field1001.method4976(var23);
                field1031[++Statics.field3702 - 1] = var24.method4931();
                field1031[++Statics.field3702 - 1] = var24.method4929();
            } else {
                field1031[++Statics.field3702 - 1] = "";
                field1031[++Statics.field3702 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var25 = field1031[--Statics.field3702];
            String var26 = client.method2128(var25);
            field1029[++Statics.field1039 - 1] = Statics.field191.method1551(new class294(var26, Statics.field459)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var27 = field1029[--Statics.field1039];
            if (Statics.field1960 == null || var27 >= Statics.field1960.method4966() || !Statics.field1960.method4976(var27).method4927().equals(Statics.field502.field573)) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1960 == null || Statics.field1960.field3721 == null) {
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1031[++Statics.field3702 - 1] = Statics.field1960.field3721;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var28 = field1029[--Statics.field1039];
            if (Statics.field1960 == null || var28 >= Statics.field1960.method4966() || !((class284) Statics.field1960.method4976(var28)).method4912()) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var29 = field1029[--Statics.field1039];
            if (Statics.field1960 == null || var29 >= Statics.field1960.method4966() || !((class284) Statics.field1960.method4976(var29)).method4914()) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field191.field1000.method4984();
            return 1;
        } else if (arg0 == 3629) {
            boolean var30 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class314(var30));
            return 1;
        } else if (arg0 == 3630) {
            boolean var31 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class315(var31));
            return 1;
        } else if (arg0 == 3631) {
            boolean var32 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class146(var32));
            return 1;
        } else if (arg0 == 3632) {
            boolean var33 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class140(var33));
            return 1;
        } else if (arg0 == 3633) {
            boolean var34 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class145(var34));
            return 1;
        } else if (arg0 == 3634) {
            boolean var35 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class148(var35));
            return 1;
        } else if (arg0 == 3635) {
            boolean var36 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class144(var36));
            return 1;
        } else if (arg0 == 3636) {
            boolean var37 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class142(var37));
            return 1;
        } else if (arg0 == 3637) {
            boolean var38 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class141(var38));
            return 1;
        } else if (arg0 == 3638) {
            boolean var39 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class143(var39));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field191.field1000.method4977();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field191.field1001.method4984();
            return 1;
        } else if (arg0 == 3641) {
            boolean var40 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1001.method5020(new class314(var40));
            return 1;
        } else if (arg0 == 3642) {
            boolean var41 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1001.method5020(new class315(var41));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field191.field1001.method4977();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1960 != null) {
                Statics.field1960.method4984();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var42 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class314(var42));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var43 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class315(var43));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var44 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class146(var44));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var45 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class140(var45));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var46 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class145(var46));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var47 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class148(var47));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var48 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class144(var48));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var49 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class142(var49));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var50 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class141(var50));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var51 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class143(var51));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1960 != null) {
                Statics.field1960.method4977();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var52 = field1029[--Statics.field1039] == 1;
            Statics.field191.field1000.method5020(new class147(var52));
            return 1;
        } else if (arg0 == 3657) {
            boolean var53 = field1029[--Statics.field1039] == 1;
            if (Statics.field1960 != null) {
                Statics.field1960.method5020(new class147(var53));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.p(ILcw;ZB)I")
    public static int method879(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1039 -= 2;
            int var3 = field1029[Statics.field1039];
            int var4 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1039 -= 2;
            int var5 = field1029[Statics.field1039];
            int var6 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1039 -= 2;
            int var7 = field1029[Statics.field1039];
            int var8 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1039 -= 2;
            int var9 = field1029[Statics.field1039];
            int var10 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1039 -= 5;
            int var13 = field1029[Statics.field1039];
            int var14 = field1029[Statics.field1039 + 1];
            int var15 = field1029[Statics.field1039 + 2];
            int var16 = field1029[Statics.field1039 + 3];
            int var17 = field1029[Statics.field1039 + 4];
            field1029[++Statics.field1039 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1039 -= 2;
            int var18 = field1029[Statics.field1039];
            int var19 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1039 -= 2;
            int var20 = field1029[Statics.field1039];
            int var21 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1039 -= 2;
            int var22 = field1029[Statics.field1039];
            int var23 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1039 -= 2;
            int var24 = field1029[Statics.field1039];
            int var25 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1039 -= 2;
            int var26 = field1029[Statics.field1039];
            int var27 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1039 -= 2;
            int var28 = field1029[Statics.field1039];
            int var29 = field1029[Statics.field1039 + 1];
            if (var28 == 0) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1039 -= 2;
            int var30 = field1029[Statics.field1039];
            int var31 = field1029[Statics.field1039 + 1];
            if (var30 == 0) {
                field1029[++Statics.field1039 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1029[++Statics.field1039 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1029[++Statics.field1039 - 1] = var30;
                    break;
                case 2:
                    field1029[++Statics.field1039 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1029[++Statics.field1039 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1029[++Statics.field1039 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1029[++Statics.field1039 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1039 -= 2;
            int var32 = field1029[Statics.field1039];
            int var33 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1039 -= 2;
            int var34 = field1029[Statics.field1039];
            int var35 = field1029[Statics.field1039 + 1];
            field1029[++Statics.field1039 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1039 -= 3;
            long var36 = (long) field1029[Statics.field1039];
            long var38 = (long) field1029[Statics.field1039 + 1];
            long var40 = (long) field1029[Statics.field1039 + 2];
            field1029[++Statics.field1039 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.z(ILcw;ZI)I")
    public static int method3908(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1031[--Statics.field3702];
            int var4 = field1029[--Statics.field1039];
            field1031[++Statics.field3702 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3702 -= 2;
            String var5 = field1031[Statics.field3702];
            String var6 = field1031[Statics.field3702 + 1];
            field1031[++Statics.field3702 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1031[--Statics.field3702];
            int var8 = field1029[--Statics.field1039];
            String[] var9 = field1031;
            int var10 = ++Statics.field3702 - 1;
            String var12;
            if (var8 < 0) {
                var12 = Integer.toString(var8);
            } else {
                var12 = class308.method1766(var8, 10, true);
            }
            var9[var10] = var7 + var12;
            return 1;
        } else if (arg0 == 4103) {
            String var13 = field1031[--Statics.field3702];
            field1031[++Statics.field3702 - 1] = var13.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var14 = field1029[--Statics.field1039];
            long var15 = ((long) var14 + 11745L) * 86400000L;
            field1034.setTime(new Date(var15));
            int var17 = field1034.get(5);
            int var18 = field1034.get(2);
            int var19 = field1034.get(1);
            field1031[++Statics.field3702 - 1] = var17 + "-" + field1032[var18] + "-" + var19;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3702 -= 2;
            String var20 = field1031[Statics.field3702];
            String var21 = field1031[Statics.field3702 + 1];
            if (Statics.field502.field582 != null && Statics.field502.field582.field2632) {
                field1031[++Statics.field3702 - 1] = var21;
            } else {
                field1031[++Statics.field3702 - 1] = var20;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var22 = field1029[--Statics.field1039];
            field1031[++Statics.field3702 - 1] = Integer.toString(var22);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3702 -= 2;
            int[] var23 = field1029;
            int var24 = ++Statics.field1039 - 1;
            String var25 = field1031[Statics.field3702];
            String var26 = field1031[Statics.field3702 + 1];
            int var27 = client.field642;
            int var28 = var25.length();
            int var29 = var26.length();
            int var30 = 0;
            int var31 = 0;
            byte var32 = 0;
            byte var33 = 0;
            int var42;
            label242: while (true) {
                if (var30 - var32 >= var28 && var31 - var33 >= var29) {
                    int var34 = Math.min(var28, var29);
                    for (int var35 = 0; var35 < var34; var35++) {
                        char var38 = var25.charAt(var35);
                        char var39 = var26.charAt(var35);
                        if (var38 != var39 && Character.toUpperCase(var38) != Character.toUpperCase(var39)) {
                            char var40 = Character.toLowerCase(var38);
                            char var41 = Character.toLowerCase(var39);
                            if (var40 != var41) {
                                var42 = class176.method451(var40, var27) - class176.method451(var41, var27);
                                break label242;
                            }
                        }
                    }
                    int var43 = var28 - var29;
                    if (var43 == 0) {
                        for (int var44 = 0; var44 < var34; var44++) {
                            char var45 = var25.charAt(var44);
                            char var46 = var26.charAt(var44);
                            if (var45 != var46) {
                                var42 = class176.method451(var45, var27) - class176.method451(var46, var27);
                                break label242;
                            }
                        }
                        var42 = 0;
                    } else {
                        var42 = var43;
                    }
                    break;
                }
                if (var30 - var32 >= var28) {
                    var42 = -1;
                    break;
                }
                if (var31 - var33 >= var29) {
                    var42 = 1;
                    break;
                }
                char var47;
                if (var32 == 0) {
                    var47 = var25.charAt(var30++);
                } else {
                    var47 = (char) var32;
                    boolean var48 = false;
                }
                char var49;
                if (var33 == 0) {
                    var49 = var26.charAt(var31++);
                } else {
                    var49 = (char) var33;
                    boolean var50 = false;
                }
                byte var51;
                if (var47 == 198) {
                    var51 = 69;
                } else if (var47 == 230) {
                    var51 = 101;
                } else if (var47 == 223) {
                    var51 = 115;
                } else if (var47 == 338) {
                    var51 = 69;
                } else if (var47 == 339) {
                    var51 = 101;
                } else {
                    var51 = 0;
                }
                var32 = var51;
                byte var52;
                if (var49 == 198) {
                    var52 = 69;
                } else if (var49 == 230) {
                    var52 = 101;
                } else if (var49 == 223) {
                    var52 = 115;
                } else if (var49 == 338) {
                    var52 = 69;
                } else if (var49 == 339) {
                    var52 = 101;
                } else {
                    var52 = 0;
                }
                var33 = var52;
                char var53 = class176.method877(var47, var27);
                char var54 = class176.method877(var49, var27);
                if (var53 != var54 && Character.toUpperCase(var53) != Character.toUpperCase(var54)) {
                    char var55 = Character.toLowerCase(var53);
                    char var56 = Character.toLowerCase(var54);
                    if (var55 != var56) {
                        var42 = class176.method451(var55, var27) - class176.method451(var56, var27);
                        break;
                    }
                }
            }
            var23[var24] = class308.method938(var42);
            return 1;
        } else if (arg0 == 4108) {
            String var57 = field1031[--Statics.field3702];
            Statics.field1039 -= 2;
            int var58 = field1029[Statics.field1039];
            int var59 = field1029[Statics.field1039 + 1];
            byte[] var60 = Statics.field112.method4267(var59, 0);
            class301 var61 = new class301(var60);
            field1029[++Statics.field1039 - 1] = var61.method5125(var57, var58);
            return 1;
        } else if (arg0 == 4109) {
            String var62 = field1031[--Statics.field3702];
            Statics.field1039 -= 2;
            int var63 = field1029[Statics.field1039];
            int var64 = field1029[Statics.field1039 + 1];
            byte[] var65 = Statics.field112.method4267(var64, 0);
            class301 var66 = new class301(var65);
            field1029[++Statics.field1039 - 1] = var66.method5124(var62, var63);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3702 -= 2;
            String var67 = field1031[Statics.field3702];
            String var68 = field1031[Statics.field3702 + 1];
            if (field1029[--Statics.field1039] == 1) {
                field1031[++Statics.field3702 - 1] = var67;
            } else {
                field1031[++Statics.field3702 - 1] = var68;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var69 = field1031[--Statics.field3702];
            field1031[++Statics.field3702 - 1] = class302.method5126(var69);
            return 1;
        } else if (arg0 == 4112) {
            String var70 = field1031[--Statics.field3702];
            int var71 = field1029[--Statics.field1039];
            field1031[++Statics.field3702 - 1] = var70 + (char) var71;
            return 1;
        } else if (arg0 == 4113) {
            int var72 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class308.method3012((char) var72) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var73 = field1029[--Statics.field1039];
            int[] var74 = field1029;
            int var75 = ++Statics.field1039 - 1;
            char var76 = (char) var73;
            boolean var77 = var76 >= '0' && var76 <= '9' || var76 >= 'A' && var76 <= 'Z' || var76 >= 'a' && var76 <= 'z';
            var74[var75] = var77 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var78 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class308.method3206((char) var78) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var79 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class308.method4479((char) var79) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var80 = field1031[--Statics.field3702];
            if (var80 == null) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = var80.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var81 = field1031[--Statics.field3702];
            Statics.field1039 -= 2;
            int var82 = field1029[Statics.field1039];
            int var83 = field1029[Statics.field1039 + 1];
            field1031[++Statics.field3702 - 1] = var81.substring(var82, var83);
            return 1;
        } else if (arg0 == 4119) {
            String var84 = field1031[--Statics.field3702];
            StringBuilder var85 = new StringBuilder(var84.length());
            boolean var86 = false;
            for (int var87 = 0; var87 < var84.length(); var87++) {
                char var88 = var84.charAt(var87);
                if (var88 == '<') {
                    var86 = true;
                } else if (var88 == '>') {
                    var86 = false;
                } else if (!var86) {
                    var85.append(var88);
                }
            }
            field1031[++Statics.field3702 - 1] = var85.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var89 = field1031[--Statics.field3702];
            int var90 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = var89.indexOf(var90);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3702 -= 2;
            String var91 = field1031[Statics.field3702];
            String var92 = field1031[Statics.field3702 + 1];
            int var93 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = var91.indexOf(var92, var93);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ed.j(ILcw;ZI)I")
    public static int method3004(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1029[--Statics.field1039];
            field1031[++Statics.field3702 - 1] = class272.method2892(var3).field3492;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1039 -= 2;
            int var4 = field1029[Statics.field1039];
            int var5 = field1029[Statics.field1039 + 1];
            class272 var6 = class272.method2892(var4);
            if (var5 < 1 || var5 > 5 || var6.field3506[var5 - 1] == null) {
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1031[++Statics.field3702 - 1] = var6.field3506[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1039 -= 2;
            int var7 = field1029[Statics.field1039];
            int var8 = field1029[Statics.field1039 + 1];
            class272 var9 = class272.method2892(var7);
            if (var8 < 1 || var8 > 5 || var9.field3507[var8 - 1] == null) {
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1031[++Statics.field3702 - 1] = var9.field3507[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class272.method2892(var10).field3534;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class272.method2892(var11).field3503 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1029[--Statics.field1039];
            class272 var13 = class272.method2892(var12);
            if (var13.field3524 == -1 && var13.field3529 >= 0) {
                field1029[++Statics.field1039 - 1] = var13.field3529;
            } else {
                field1029[++Statics.field1039 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1029[--Statics.field1039];
            class272 var15 = class272.method2892(var14);
            if (var15.field3524 >= 0 && var15.field3529 >= 0) {
                field1029[++Statics.field1039 - 1] = var15.field3529;
            } else {
                field1029[++Statics.field1039 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class272.method2892(var16).field3527 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1029[--Statics.field1039];
            class272 var18 = class272.method2892(var17);
            if (var18.field3530 == -1 && var18.field3535 >= 0) {
                field1029[++Statics.field1039 - 1] = var18.field3535;
            } else {
                field1029[++Statics.field1039 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1029[--Statics.field1039];
            class272 var20 = class272.method2892(var19);
            if (var20.field3530 >= 0 && var20.field3535 >= 0) {
                field1029[++Statics.field1039 - 1] = var20.field3535;
            } else {
                field1029[++Statics.field1039 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1031[--Statics.field3702];
            int var22 = field1029[--Statics.field1039];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field3500) {
                    Statics.field2062 = var26;
                    Statics.field3589 = 0;
                    Statics.field231 = var27;
                    String[] var32 = new String[Statics.field231];
                    for (int var33 = 0; var33 < Statics.field231; var33++) {
                        var32[var33] = class272.method2892(var26[var33]).field3492;
                    }
                    class182.method2924(var32, Statics.field2062);
                    break;
                }
                class272 var29 = class272.method2892(var28);
                if ((!var24 || var29.field3523) && var29.field3524 == -1 && var29.field3492.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field231 = -1;
                        Statics.field2062 = null;
                        break;
                    }
                    if (var27 >= var26.length) {
                        short[] var30 = new short[var26.length * 2];
                        for (int var31 = 0; var31 < var27; var31++) {
                            var30[var31] = var26[var31];
                        }
                        var26 = var30;
                    }
                    var26[var27++] = (short) var28;
                }
                var28++;
            }
            field1029[++Statics.field1039 - 1] = Statics.field231;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field2062 == null || Statics.field3589 >= Statics.field231) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = Statics.field2062[++Statics.field3589 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3589 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.c(ILcw;ZI)I")
    public static int method563(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1029[++Statics.field1039 - 1] = client.field630;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1039 -= 3;
            client.field630 = field1029[Statics.field1039];
            Statics.field528 = class310.method4251(field1029[Statics.field1039 + 1]);
            if (Statics.field528 == null) {
                Statics.field528 = class310.field3797;
            }
            client.field828 = field1029[Statics.field1039 + 2];
            class175 var3 = class175.method3561(class172.field2280, client.field798.field1265);
            var3.field2323.method3531(client.field630);
            var3.field2323.method3531(Statics.field528.field3799);
            var3.field2323.method3531(client.field828);
            client.field798.method1884(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1031[--Statics.field3702];
            Statics.field1039 -= 2;
            int var5 = field1029[Statics.field1039];
            int var6 = field1029[Statics.field1039 + 1];
            class175 var7 = class175.method3561(class172.field2282, client.field798.field1265);
            var7.field2323.method3531(class185.method459(var4) + 2);
            var7.field2323.method3314(var4);
            var7.field2323.method3531(var5 - 1);
            var7.field2323.method3531(var6);
            client.field798.method1884(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1039 -= 2;
            int var8 = field1029[Statics.field1039];
            int var9 = field1029[Statics.field1039 + 1];
            class60 var10 = Statics.method1284(var8, var9);
            if (var10 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
                field1031[++Statics.field3702 - 1] = "";
                field1031[++Statics.field3702 - 1] = "";
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = var10.field559;
                field1029[++Statics.field1039 - 1] = var10.field564;
                field1031[++Statics.field3702 - 1] = var10.field563 == null ? "" : var10.field563;
                field1031[++Statics.field3702 - 1] = var10.field565 == null ? "" : var10.field565;
                field1031[++Statics.field3702 - 1] = var10.field561 == null ? "" : var10.field561;
                field1029[++Statics.field1039 - 1] = var10.method973() ? 1 : (var10.method976() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1029[--Statics.field1039];
            class60 var12 = Statics.method936(var11);
            if (var12 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
                field1031[++Statics.field3702 - 1] = "";
                field1031[++Statics.field3702 - 1] = "";
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = var12.field560;
                field1029[++Statics.field1039 - 1] = var12.field564;
                field1031[++Statics.field3702 - 1] = var12.field563 == null ? "" : var12.field563;
                field1031[++Statics.field3702 - 1] = var12.field565 == null ? "" : var12.field565;
                field1031[++Statics.field3702 - 1] = var12.field561 == null ? "" : var12.field561;
                field1029[++Statics.field1039 - 1] = var12.method973() ? 1 : (var12.method976() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field528 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = Statics.field528.field3799;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1031[--Statics.field3702];
            int var14 = field1029[--Statics.field1039];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class240.field3022)) {
                var16 = 0;
                var13 = var13.substring(class240.field3022.length());
            } else if (var15.startsWith(class240.field3024)) {
                var16 = 1;
                var13 = var13.substring(class240.field3024.length());
            } else if (var15.startsWith(class240.field3026)) {
                var16 = 2;
                var13 = var13.substring(class240.field3026.length());
            } else if (var15.startsWith(class240.field3028)) {
                var16 = 3;
                var13 = var13.substring(class240.field3028.length());
            } else if (var15.startsWith(class240.field3030)) {
                var16 = 4;
                var13 = var13.substring(class240.field3030.length());
            } else if (var15.startsWith(class240.field3095)) {
                var16 = 5;
                var13 = var13.substring(class240.field3095.length());
            } else if (var15.startsWith(class240.field3034)) {
                var16 = 6;
                var13 = var13.substring(class240.field3034.length());
            } else if (var15.startsWith(class240.field3036)) {
                var16 = 7;
                var13 = var13.substring(class240.field3036.length());
            } else if (var15.startsWith(class240.field2941)) {
                var16 = 8;
                var13 = var13.substring(class240.field2941.length());
            } else if (var15.startsWith(class240.field2907)) {
                var16 = 9;
                var13 = var13.substring(class240.field2907.length());
            } else if (var15.startsWith(class240.field3042)) {
                var16 = 10;
                var13 = var13.substring(class240.field3042.length());
            } else if (var15.startsWith(class240.field2916)) {
                var16 = 11;
                var13 = var13.substring(class240.field2916.length());
            } else if (client.field642 != 0) {
                if (var15.startsWith(class240.field3023)) {
                    var16 = 0;
                    var13 = var13.substring(class240.field3023.length());
                } else if (var15.startsWith(class240.field3025)) {
                    var16 = 1;
                    var13 = var13.substring(class240.field3025.length());
                } else if (var15.startsWith(class240.field3027)) {
                    var16 = 2;
                    var13 = var13.substring(class240.field3027.length());
                } else if (var15.startsWith(class240.field3075)) {
                    var16 = 3;
                    var13 = var13.substring(class240.field3075.length());
                } else if (var15.startsWith(class240.field3031)) {
                    var16 = 4;
                    var13 = var13.substring(class240.field3031.length());
                } else if (var15.startsWith(class240.field3088)) {
                    var16 = 5;
                    var13 = var13.substring(class240.field3088.length());
                } else if (var15.startsWith(class240.field3035)) {
                    var16 = 6;
                    var13 = var13.substring(class240.field3035.length());
                } else if (var15.startsWith(class240.field3037)) {
                    var16 = 7;
                    var13 = var13.substring(class240.field3037.length());
                } else if (var15.startsWith(class240.field3039)) {
                    var16 = 8;
                    var13 = var13.substring(class240.field3039.length());
                } else if (var15.startsWith(class240.field3041)) {
                    var16 = 9;
                    var13 = var13.substring(class240.field3041.length());
                } else if (var15.startsWith(class240.field3043)) {
                    var16 = 10;
                    var13 = var13.substring(class240.field3043.length());
                } else if (var15.startsWith(class240.field3050)) {
                    var16 = 11;
                    var13 = var13.substring(class240.field3050.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class240.field3046)) {
                var18 = 1;
                var13 = var13.substring(class240.field3046.length());
            } else if (var17.startsWith(class240.field3048)) {
                var18 = 2;
                var13 = var13.substring(class240.field3048.length());
            } else if (var17.startsWith(class240.field3053)) {
                var18 = 3;
                var13 = var13.substring(class240.field3053.length());
            } else if (var17.startsWith(class240.field2856)) {
                var18 = 4;
                var13 = var13.substring(class240.field2856.length());
            } else if (var17.startsWith(class240.field3054)) {
                var18 = 5;
                var13 = var13.substring(class240.field3054.length());
            } else if (client.field642 != 0) {
                if (var17.startsWith(class240.field3047)) {
                    var18 = 1;
                    var13 = var13.substring(class240.field3047.length());
                } else if (var17.startsWith(class240.field3049)) {
                    var18 = 2;
                    var13 = var13.substring(class240.field3049.length());
                } else if (var17.startsWith(class240.field3051)) {
                    var18 = 3;
                    var13 = var13.substring(class240.field3051.length());
                } else if (var17.startsWith(class240.field2939)) {
                    var18 = 4;
                    var13 = var13.substring(class240.field2939.length());
                } else if (var17.startsWith(class240.field3062)) {
                    var18 = 5;
                    var13 = var13.substring(class240.field3062.length());
                }
            }
            class175 var19 = class175.method3561(class172.field2213, client.field798.field1265);
            var19.field2323.method3531(0);
            int var20 = var19.field2323.field2397;
            var19.field2323.method3531(var14);
            var19.field2323.method3531(var16);
            var19.field2323.method3531(var18);
            class192 var21 = var19.field2323;
            int var22 = var21.field2397;
            int var23 = var13.length();
            byte[] var24 = new byte[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                char var26 = var13.charAt(var25);
                if (!(var26 <= 0 || var26 >= 128) || !(var26 < 160 || var26 > 255)) {
                    var24[var25] = (byte) var26;
                } else if (var26 == 8364) {
                    var24[var25] = -128;
                } else if (var26 == 8218) {
                    var24[var25] = -126;
                } else if (var26 == 402) {
                    var24[var25] = -125;
                } else if (var26 == 8222) {
                    var24[var25] = -124;
                } else if (var26 == 8230) {
                    var24[var25] = -123;
                } else if (var26 == 8224) {
                    var24[var25] = -122;
                } else if (var26 == 8225) {
                    var24[var25] = -121;
                } else if (var26 == 710) {
                    var24[var25] = -120;
                } else if (var26 == 8240) {
                    var24[var25] = -119;
                } else if (var26 == 352) {
                    var24[var25] = -118;
                } else if (var26 == 8249) {
                    var24[var25] = -117;
                } else if (var26 == 338) {
                    var24[var25] = -116;
                } else if (var26 == 381) {
                    var24[var25] = -114;
                } else if (var26 == 8216) {
                    var24[var25] = -111;
                } else if (var26 == 8217) {
                    var24[var25] = -110;
                } else if (var26 == 8220) {
                    var24[var25] = -109;
                } else if (var26 == 8221) {
                    var24[var25] = -108;
                } else if (var26 == 8226) {
                    var24[var25] = -107;
                } else if (var26 == 8211) {
                    var24[var25] = -106;
                } else if (var26 == 8212) {
                    var24[var25] = -105;
                } else if (var26 == 732) {
                    var24[var25] = -104;
                } else if (var26 == 8482) {
                    var24[var25] = -103;
                } else if (var26 == 353) {
                    var24[var25] = -102;
                } else if (var26 == 8250) {
                    var24[var25] = -101;
                } else if (var26 == 339) {
                    var24[var25] = -100;
                } else if (var26 == 382) {
                    var24[var25] = -98;
                } else if (var26 == 376) {
                    var24[var25] = -97;
                } else {
                    var24[var25] = 63;
                }
            }
            var21.method3439(var24.length);
            var21.field2397 += Statics.field3773.method3247(var24, 0, var24.length, var21.field2399, var21.field2397);
            var19.field2323.method3320(var19.field2323.field2397 - var20);
            client.field798.method1884(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field3702 -= 2;
            String var29 = field1031[Statics.field3702];
            String var30 = field1031[Statics.field3702 + 1];
            class175 var31 = class175.method3561(class172.field2239, client.field798.field1265);
            var31.field2323.method3449(0);
            int var32 = var31.field2323.field2397;
            var31.field2323.method3314(var29);
            class192 var33 = var31.field2323;
            int var34 = var33.field2397;
            int var35 = var30.length();
            byte[] var36 = new byte[var35];
            for (int var37 = 0; var37 < var35; var37++) {
                char var38 = var30.charAt(var37);
                if (!(var38 <= 0 || var38 >= 128) || !(var38 < 160 || var38 > 255)) {
                    var36[var37] = (byte) var38;
                } else if (var38 == 8364) {
                    var36[var37] = -128;
                } else if (var38 == 8218) {
                    var36[var37] = -126;
                } else if (var38 == 402) {
                    var36[var37] = -125;
                } else if (var38 == 8222) {
                    var36[var37] = -124;
                } else if (var38 == 8230) {
                    var36[var37] = -123;
                } else if (var38 == 8224) {
                    var36[var37] = -122;
                } else if (var38 == 8225) {
                    var36[var37] = -121;
                } else if (var38 == 710) {
                    var36[var37] = -120;
                } else if (var38 == 8240) {
                    var36[var37] = -119;
                } else if (var38 == 352) {
                    var36[var37] = -118;
                } else if (var38 == 8249) {
                    var36[var37] = -117;
                } else if (var38 == 338) {
                    var36[var37] = -116;
                } else if (var38 == 381) {
                    var36[var37] = -114;
                } else if (var38 == 8216) {
                    var36[var37] = -111;
                } else if (var38 == 8217) {
                    var36[var37] = -110;
                } else if (var38 == 8220) {
                    var36[var37] = -109;
                } else if (var38 == 8221) {
                    var36[var37] = -108;
                } else if (var38 == 8226) {
                    var36[var37] = -107;
                } else if (var38 == 8211) {
                    var36[var37] = -106;
                } else if (var38 == 8212) {
                    var36[var37] = -105;
                } else if (var38 == 732) {
                    var36[var37] = -104;
                } else if (var38 == 8482) {
                    var36[var37] = -103;
                } else if (var38 == 353) {
                    var36[var37] = -102;
                } else if (var38 == 8250) {
                    var36[var37] = -101;
                } else if (var38 == 339) {
                    var36[var37] = -100;
                } else if (var38 == 382) {
                    var36[var37] = -98;
                } else if (var38 == 376) {
                    var36[var37] = -97;
                } else {
                    var36[var37] = 63;
                }
            }
            var33.method3439(var36.length);
            var33.field2397 += Statics.field3773.method3247(var36, 0, var36.length, var33.field2399, var33.field2397);
            var31.field2323.method3494(var31.field2323.field2397 - var32);
            client.field798.method1884(var31);
            return 1;
        } else if (arg0 == 5015) {
            String var41;
            if (Statics.field502 == null || Statics.field502.field573 == null) {
                var41 = "";
            } else {
                var41 = Statics.field502.field573.method5059();
            }
            field1031[++Statics.field3702 - 1] = var41;
            return 1;
        } else if (arg0 == 5016) {
            field1029[++Statics.field1039 - 1] = client.field828;
            return 1;
        } else if (arg0 == 5017) {
            int var42 = field1029[--Statics.field1039];
            int[] var43 = field1029;
            int var44 = ++Statics.field1039 - 1;
            class89 var45 = (class89) class86.field1227.get(var42);
            int var46;
            if (var45 == null) {
                var46 = 0;
            } else {
                var46 = var45.method1874();
            }
            var43[var44] = var46;
            return 1;
        } else if (arg0 == 5018) {
            int var47 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = class86.method3225(var47);
            return 1;
        } else if (arg0 == 5019) {
            int var48 = field1029[--Statics.field1039];
            int[] var49 = field1029;
            int var50 = ++Statics.field1039 - 1;
            class60 var51 = (class60) class86.field1226.method3710((long) var48);
            int var52;
            if (var51 == null) {
                var52 = -1;
            } else if (class86.field1228.field2509 == var51.field2492) {
                var52 = -1;
            } else {
                var52 = ((class60) var51.field2492).field559;
            }
            var49[var50] = var52;
            return 1;
        } else if (arg0 == 5020) {
            String var53 = field1031[--Statics.field3702];
            client.method951(var53);
            return 1;
        } else if (arg0 == 5021) {
            client.field829 = field1031[--Statics.field3702].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1031[++Statics.field3702 - 1] = client.field829;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.av(ILcw;ZI)I")
    public static int method874(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field657 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.as(ILcw;ZI)I")
    public static int method644(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1029[++Statics.field1039 - 1] = Statics.method645() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class67 var3 = class67.method113();
            if (var3 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1029[++Statics.field1039 - 1] = var3.field985;
                field1029[++Statics.field1039 - 1] = var3.field979;
                field1031[++Statics.field3702 - 1] = var3.field982;
                field1029[++Statics.field1039 - 1] = var3.field984;
                field1029[++Statics.field1039 - 1] = var3.field981;
                field1031[++Statics.field3702 - 1] = var3.field978;
            }
            return 1;
        } else if (arg0 == 6502) {
            class67 var4 = class67.method3008();
            if (var4 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1029[++Statics.field1039 - 1] = var4.field985;
                field1029[++Statics.field1039 - 1] = var4.field979;
                field1031[++Statics.field3702 - 1] = var4.field982;
                field1029[++Statics.field1039 - 1] = var4.field984;
                field1029[++Statics.field1039 - 1] = var4.field981;
                field1031[++Statics.field3702 - 1] = var4.field978;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1029[--Statics.field1039];
            class67 var6 = null;
            for (int var7 = 0; var7 < class67.field974; var7++) {
                if (Statics.field973[var7].field985 == var5) {
                    var6 = Statics.field973[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1029[++Statics.field1039 - 1] = var6.field985;
                field1029[++Statics.field1039 - 1] = var6.field979;
                field1031[++Statics.field3702 - 1] = var6.field982;
                field1029[++Statics.field1039 - 1] = var6.field984;
                field1029[++Statics.field1039 - 1] = var6.field981;
                field1031[++Statics.field3702 - 1] = var6.field978;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1039 -= 4;
            int var8 = field1029[Statics.field1039];
            boolean var9 = field1029[Statics.field1039 + 1] == 1;
            int var10 = field1029[Statics.field1039 + 2];
            boolean var11 = field1029[Statics.field1039 + 3] == 1;
            if (Statics.field973 != null) {
                class67.method145(0, Statics.field973.length - 1, var8, var9, var10, var11);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1029[--Statics.field1039];
            if (var12 >= 0 && var12 < class67.field974) {
                class67 var13 = Statics.field973[var12];
                field1029[++Statics.field1039 - 1] = var13.field985;
                field1029[++Statics.field1039 - 1] = var13.field979;
                field1031[++Statics.field3702 - 1] = var13.field982;
                field1029[++Statics.field1039 - 1] = var13.field984;
                field1029[++Statics.field1039 - 1] = var13.field981;
                field1031[++Statics.field3702 - 1] = var13.field978;
            } else {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
                field1031[++Statics.field3702 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field773 = field1029[--Statics.field1039] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1039 -= 2;
            int var14 = field1029[Statics.field1039];
            int var15 = field1029[Statics.field1039 + 1];
            class267 var16 = class267.method1645(var15);
            if (var16.method4590()) {
                field1031[++Statics.field3702 - 1] = class274.method3290(var14).method4814(var15, var16.field3384);
            } else {
                field1029[++Statics.field1039 - 1] = class274.method3290(var14).method4805(var15, var16.field3385);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1039 -= 2;
            int var17 = field1029[Statics.field1039];
            int var18 = field1029[Statics.field1039 + 1];
            class267 var19 = class267.method1645(var18);
            if (var19.method4590()) {
                field1031[++Statics.field3702 - 1] = class271.method1706(var17).method4684(var18, var19.field3384);
            } else {
                field1029[++Statics.field1039 - 1] = class271.method1706(var17).method4683(var18, var19.field3385);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1039 -= 2;
            int var20 = field1029[Statics.field1039];
            int var21 = field1029[Statics.field1039 + 1];
            class267 var22 = class267.method1645(var21);
            if (var22.method4590()) {
                field1031[++Statics.field3702 - 1] = class272.method2892(var20).method4737(var21, var22.field3384);
            } else {
                field1029[++Statics.field1039 - 1] = class272.method2892(var20).method4736(var21, var22.field3385);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1039 -= 2;
            int var23 = field1029[Statics.field1039];
            int var24 = field1029[Statics.field1039 + 1];
            class267 var25 = class267.method1645(var24);
            if (var25.method4590()) {
                String[] var26 = field1031;
                int var27 = ++Statics.field3702 - 1;
                class268 var28 = (class268) class268.field3389.method3724((long) var23);
                class268 var29;
                if (var28 == null) {
                    byte[] var30 = Statics.field3390.method4267(34, var23);
                    class268 var31 = new class268();
                    if (var30 != null) {
                        var31.method4612(new class185(var30));
                    }
                    var31.method4609();
                    class268.field3389.method3723(var31, (long) var23);
                    var29 = var31;
                } else {
                    var29 = var28;
                }
                var26[var27] = var29.method4604(var24, var25.field3384);
            } else {
                int[] var32 = field1029;
                int var33 = ++Statics.field1039 - 1;
                class268 var34 = (class268) class268.field3389.method3724((long) var23);
                class268 var35;
                if (var34 == null) {
                    byte[] var36 = Statics.field3390.method4267(34, var23);
                    class268 var37 = new class268();
                    if (var36 != null) {
                        var37.method4612(new class185(var36));
                    }
                    var37.method4609();
                    class268.field3389.method3723(var37, (long) var23);
                    var35 = var37;
                } else {
                    var35 = var34;
                }
                var32[var33] = var35.method4606(var24, var25.field3385);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1029[++Statics.field1039 - 1] = client.field618 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1029[++Statics.field1039 - 1] = client.field617 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field3702--;
            Statics.field1039--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field3702--;
            Statics.field1039--;
            return 1;
        } else if (arg0 == 6524) {
            field1029[++Statics.field1039 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1029[++Statics.field1039 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1029[++Statics.field1039 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("if.al(ILcw;ZB)I")
    public static int method4255(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field517;
            int var4 = (Statics.field502.field953 >> 7) + Statics.field1225;
            int var5 = (Statics.field502.field919 >> 7) + Statics.field64;
            client.method990().method5640(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1029[--Statics.field1039];
            String var7 = "";
            class21 var8 = client.method990().method5658(var6);
            if (var8 != null) {
                var7 = var8.method233();
            }
            field1031[++Statics.field3702 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1029[--Statics.field1039];
            client.method990().method5641(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1029[++Statics.field1039 - 1] = client.method990().method5771();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1029[--Statics.field1039];
            client.method990().method5652(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1029[++Statics.field1039 - 1] = client.method990().method5657() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class229 var11 = new class229(field1029[--Statics.field1039]);
            client.method990().method5695(var11.field2620, var11.field2621);
            return 1;
        } else if (arg0 == 6607) {
            class229 var12 = new class229(field1029[--Statics.field1039]);
            client.method990().method5660(var12.field2620, var12.field2621);
            return 1;
        } else if (arg0 == 6608) {
            class229 var13 = new class229(field1029[--Statics.field1039]);
            client.method990().method5661(var13.field2623, var13.field2620, var13.field2621);
            return 1;
        } else if (arg0 == 6609) {
            class229 var14 = new class229(field1029[--Statics.field1039]);
            client.method990().method5662(var14.field2623, var14.field2620, var14.field2621);
            return 1;
        } else if (arg0 == 6610) {
            field1029[++Statics.field1039 - 1] = client.method990().method5663();
            field1029[++Statics.field1039 - 1] = client.method990().method5649();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1029[--Statics.field1039];
            class21 var16 = client.method990().method5658(var15);
            if (var16 == null) {
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = var16.method255().method4129();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1029[--Statics.field1039];
            class21 var18 = client.method990().method5658(var17);
            if (var18 == null) {
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = (var18.method237() - var18.method236() + 1) * 64;
                field1029[++Statics.field1039 - 1] = (var18.method239() - var18.method241() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1029[--Statics.field1039];
            class21 var20 = client.method990().method5658(var19);
            if (var20 == null) {
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
                field1029[++Statics.field1039 - 1] = 0;
            } else {
                field1029[++Statics.field1039 - 1] = var20.method236() * 64;
                field1029[++Statics.field1039 - 1] = var20.method241() * 64;
                field1029[++Statics.field1039 - 1] = var20.method237() * 64 + 64 - 1;
                field1029[++Statics.field1039 - 1] = var20.method239() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1029[--Statics.field1039];
            class21 var22 = client.method990().method5658(var21);
            if (var22 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var22.method227();
            }
            return 1;
        } else if (arg0 == 6615) {
            class229 var23 = client.method990().method5665();
            if (var23 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var23.field2620;
                field1029[++Statics.field1039 - 1] = var23.field2621;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1029[++Statics.field1039 - 1] = client.method990().method5642();
            return 1;
        } else if (arg0 == 6617) {
            class229 var24 = new class229(field1029[--Statics.field1039]);
            class21 var25 = client.method990().method5643();
            if (var25 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method232(var24.field2623, var24.field2620, var24.field2621);
            if (var26 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var26[0];
                field1029[++Statics.field1039 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class229 var27 = new class229(field1029[--Statics.field1039]);
            class21 var28 = client.method990().method5643();
            if (var28 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = -1;
                return 1;
            }
            class229 var29 = var28.method289(var27.field2620, var27.field2621);
            if (var29 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var29.method4129();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1039 -= 2;
            int var30 = field1029[Statics.field1039];
            class229 var31 = new class229(field1029[Statics.field1039 + 1]);
            method2380(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1039 -= 2;
            int var32 = field1029[Statics.field1039];
            class229 var33 = new class229(field1029[Statics.field1039 + 1]);
            method2380(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1039 -= 2;
            int var34 = field1029[Statics.field1039];
            class229 var35 = new class229(field1029[Statics.field1039 + 1]);
            class21 var36 = client.method990().method5658(var34);
            if (var36 == null) {
                field1029[++Statics.field1039 - 1] = 0;
                return 1;
            } else {
                field1029[++Statics.field1039 - 1] = var36.method225(var35.field2623, var35.field2620, var35.field2621) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1029[++Statics.field1039 - 1] = client.method990().method5659();
            field1029[++Statics.field1039 - 1] = client.method990().method5667();
            return 1;
        } else if (arg0 == 6623) {
            class229 var37 = new class229(field1029[--Statics.field1039]);
            class21 var38 = client.method990().method5639(var37.field2623, var37.field2620, var37.field2621);
            if (var38 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var38.method230();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method990().method5668(field1029[--Statics.field1039]);
            return 1;
        } else if (arg0 == 6625) {
            client.method990().method5679();
            return 1;
        } else if (arg0 == 6626) {
            client.method990().method5670(field1029[--Statics.field1039]);
            return 1;
        } else if (arg0 == 6627) {
            client.method990().method5774();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1029[--Statics.field1039] == 1;
            client.method990().method5672(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1029[--Statics.field1039];
            client.method990().method5673(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1029[--Statics.field1039];
            client.method990().method5786(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method990().method5805();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1029[--Statics.field1039] == 1;
            client.method990().method5676(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1039 -= 2;
            int var43 = field1029[Statics.field1039];
            boolean var44 = field1029[Statics.field1039 + 1] == 1;
            client.method990().method5677(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1039 -= 2;
            int var45 = field1029[Statics.field1039];
            boolean var46 = field1029[Statics.field1039 + 1] == 1;
            client.method990().method5678(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1029[++Statics.field1039 - 1] = client.method990().method5775() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = client.method990().method5680(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1029[--Statics.field1039];
            field1029[++Statics.field1039 - 1] = client.method990().method5681(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1039 -= 2;
            int var49 = field1029[Statics.field1039];
            class229 var50 = new class229(field1029[Statics.field1039 + 1]);
            class229 var51 = client.method990().method5684(var49, var50);
            if (var51 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var51.method4129();
            }
            return 1;
        } else if (arg0 == 6639) {
            class29 var52 = client.method990().method5686();
            if (var52 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var52.field241;
                field1029[++Statics.field1039 - 1] = var52.field250.method4129();
            }
            return 1;
        } else if (arg0 == 6640) {
            class29 var53 = client.method990().method5822();
            if (var53 == null) {
                field1029[++Statics.field1039 - 1] = -1;
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var53.field241;
                field1029[++Statics.field1039 - 1] = var53.field250.method4129();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1029[--Statics.field1039];
            class258 var55 = class258.method3226(var54);
            if (var55.field3296 == null) {
                field1031[++Statics.field3702 - 1] = "";
            } else {
                field1031[++Statics.field3702 - 1] = var55.field3296;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1029[--Statics.field1039];
            class258 var57 = class258.method3226(var56);
            field1029[++Statics.field1039 - 1] = var57.field3307;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1029[--Statics.field1039];
            class258 var59 = class258.method3226(var58);
            if (var59 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var59.field3308;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1029[--Statics.field1039];
            class258 var61 = class258.method3226(var60);
            if (var61 == null) {
                field1029[++Statics.field1039 - 1] = -1;
            } else {
                field1029[++Statics.field1039 - 1] = var61.field3301;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1029[++Statics.field1039 - 1] = Statics.field1038.field311;
            return 1;
        } else if (arg0 == 6698) {
            field1029[++Statics.field1039 - 1] = Statics.field1038.field316.method4129();
            return 1;
        } else if (arg0 == 6699) {
            field1029[++Statics.field1039 - 1] = Statics.field1038.field309.method4129();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.ax(IB)V")
    public static void method935(int arg0) {
        if (arg0 == -1 || !class233.method627(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2763[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field2743 != null) {
                class58 var4 = new class58();
                var4.field531 = var3;
                var4.field545 = var3.field2743;
                method129(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("dk.ay(ILhc;ZI)V")
    public static void method2380(int arg0, class229 arg1, boolean arg2) {
        class21 var3 = client.method990().method5658(arg0);
        int var4 = Statics.field502.field592;
        int var5 = (Statics.field502.field953 >> 7) + Statics.field1225;
        int var6 = (Statics.field502.field919 >> 7) + Statics.field64;
        class229 var7 = new class229(var4, var5, var6);
        client.method990().method5689(var3, var7, arg1, arg2);
    }
}
