package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aa")
public class class33 {

    @ObfuscatedName("aa.t")
    public static int[] field720 = new int[5];

    @ObfuscatedName("aa.p")
    public static int[][] field729 = new int[5][5000];

    @ObfuscatedName("aa.u")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("aa.l")
    public static String[] field723 = new String[1000];

    @ObfuscatedName("aa.g")
    public static int field726 = 0;

    @ObfuscatedName("aa.w")
    public static class12[] field724 = new class12[50];

    @ObfuscatedName("aa.k")
    public static Calendar field727 = Calendar.getInstance();

    @ObfuscatedName("aa.e")
    public static final String[] field728 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aa.j")
    public static int field717 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.d(La;IB)V")
    public static void method887(class19 arg0, int arg1) {
        Object[] var2 = arg0.field197;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method892(var3);
        if (var4 == null) {
            return;
        }
        Statics.field716 = 0;
        Statics.field722 = 0;
        int var5 = -1;
        int[] var6 = var4.field931;
        int[] var7 = var4.field932;
        byte var8 = -1;
        field726 = 0;
        try {
            Statics.field719 = new int[var4.field934];
            int var9 = 0;
            Statics.field718 = new String[var4.field944];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field194;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field188;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field190 == null ? -1 : arg0.field190.field2208;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field193;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field190 == null ? -1 : arg0.field190.field2209;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field196 == null ? -1 : arg0.field196.field2208;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field196 == null ? -1 : arg0.field196.field2209;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field192;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field199;
                    }
                    Statics.field719[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field191;
                    }
                    Statics.field718[var10++] = var13;
                }
            }
            int var14 = 0;
            field717 = arg0.field198;
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
                                                                                                                label1183: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var290 = var6[var5];
                                                                                                                    if (var290 >= 100) {
                                                                                                                        boolean var52;
                                                                                                                        if (var4.field932[var5] == 1) {
                                                                                                                            var52 = true;
                                                                                                                        } else {
                                                                                                                            var52 = false;
                                                                                                                        }
                                                                                                                        int var53;
                                                                                                                        if (var290 < 1000) {
                                                                                                                            var53 = method3070(var290, var4, var52);
                                                                                                                        } else if (var290 < 1100) {
                                                                                                                            var53 = method827(var290, var4, var52);
                                                                                                                        } else if (var290 < 1200) {
                                                                                                                            var53 = method1941(var290, var4, var52);
                                                                                                                        } else if (var290 < 1300) {
                                                                                                                            var53 = method256(var290, var4, var52);
                                                                                                                        } else if (var290 < 1400) {
                                                                                                                            var53 = method2202(var290, var4, var52);
                                                                                                                        } else if (var290 < 1500) {
                                                                                                                            var53 = method1054(var290, var4, var52);
                                                                                                                        } else if (var290 < 1600) {
                                                                                                                            var53 = method1848(var290, var4, var52);
                                                                                                                        } else if (var290 < 1700) {
                                                                                                                            var53 = method811(var290, var4, var52);
                                                                                                                        } else if (var290 < 1800) {
                                                                                                                            class172 var57 = var52 ? Statics.field2895 : Statics.field943;
                                                                                                                            byte var58;
                                                                                                                            if (var290 == 1700) {
                                                                                                                                field721[++Statics.field716 - 1] = var57.field2328;
                                                                                                                                var58 = 1;
                                                                                                                            } else if (var290 == 1701) {
                                                                                                                                if (var57.field2328 == -1) {
                                                                                                                                    field721[++Statics.field716 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field721[++Statics.field716 - 1] = var57.field2329;
                                                                                                                                }
                                                                                                                                var58 = 1;
                                                                                                                            } else if (var290 == 1702) {
                                                                                                                                field721[++Statics.field716 - 1] = var57.field2209;
                                                                                                                                var58 = 1;
                                                                                                                            } else {
                                                                                                                                var58 = 2;
                                                                                                                            }
                                                                                                                            var53 = var58;
                                                                                                                        } else if (var290 < 1900) {
                                                                                                                            var53 = method192(var290, var4, var52);
                                                                                                                        } else if (var290 < 2000) {
                                                                                                                            var53 = method3347(var290, var4, var52);
                                                                                                                        } else if (var290 < 2100) {
                                                                                                                            var53 = method827(var290, var4, var52);
                                                                                                                        } else if (var290 < 2200) {
                                                                                                                            var53 = method1941(var290, var4, var52);
                                                                                                                        } else if (var290 < 2300) {
                                                                                                                            var53 = method256(var290, var4, var52);
                                                                                                                        } else if (var290 < 2400) {
                                                                                                                            var53 = method2202(var290, var4, var52);
                                                                                                                        } else if (var290 < 2500) {
                                                                                                                            var53 = method1054(var290, var4, var52);
                                                                                                                        } else if (var290 < 2600) {
                                                                                                                            var53 = method1634(var290, var4, var52);
                                                                                                                        } else if (var290 < 2700) {
                                                                                                                            var53 = method181(var290, var4, var52);
                                                                                                                        } else if (var290 < 2800) {
                                                                                                                            byte var60;
                                                                                                                            if (var290 == 2700) {
                                                                                                                                class172 var59 = class172.method2211(field721[--Statics.field716]);
                                                                                                                                field721[++Statics.field716 - 1] = var59.field2328;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var290 == 2701) {
                                                                                                                                class172 var61 = class172.method2211(field721[--Statics.field716]);
                                                                                                                                if (var61.field2328 == -1) {
                                                                                                                                    field721[++Statics.field716 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field721[++Statics.field716 - 1] = var61.field2329;
                                                                                                                                }
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var290 == 2702) {
                                                                                                                                int var62 = field721[--Statics.field716];
                                                                                                                                class18 var63 = (class18) client.field447.method2611((long) var62);
                                                                                                                                if (var63 == null) {
                                                                                                                                    field721[++Statics.field716 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field721[++Statics.field716 - 1] = 1;
                                                                                                                                }
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var290 == 2706) {
                                                                                                                                field721[++Statics.field716 - 1] = client.field446;
                                                                                                                                var60 = 1;
                                                                                                                            } else {
                                                                                                                                var60 = 2;
                                                                                                                            }
                                                                                                                            var53 = var60;
                                                                                                                        } else if (var290 < 2900) {
                                                                                                                            class172 var64 = class172.method2211(field721[--Statics.field716]);
                                                                                                                            byte var65;
                                                                                                                            if (var290 == 2800) {
                                                                                                                                field721[++Statics.field716 - 1] = Statics.method3327(client.method1872(var64));
                                                                                                                                var65 = 1;
                                                                                                                            } else if (var290 == 2801) {
                                                                                                                                int var66 = field721[--Statics.field716];
                                                                                                                                int var291 = var66 - 1;
                                                                                                                                if (var64.field2282 == null || var291 >= var64.field2282.length || var64.field2282[var291] == null) {
                                                                                                                                    field723[++Statics.field722 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field723[++Statics.field722 - 1] = var64.field2282[var291];
                                                                                                                                }
                                                                                                                                var65 = 1;
                                                                                                                            } else if (var290 == 2802) {
                                                                                                                                if (var64.field2260 == null) {
                                                                                                                                    field723[++Statics.field722 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field723[++Statics.field722 - 1] = var64.field2260;
                                                                                                                                }
                                                                                                                                var65 = 1;
                                                                                                                            } else {
                                                                                                                                var65 = 2;
                                                                                                                            }
                                                                                                                            var53 = var65;
                                                                                                                        } else if (var290 < 3000) {
                                                                                                                            var53 = method3347(var290, var4, var52);
                                                                                                                        } else if (var290 < 3200) {
                                                                                                                            byte var68;
                                                                                                                            if (var290 == 3100) {
                                                                                                                                String var67 = field723[--Statics.field722];
                                                                                                                                class48.method196(0, "", var67);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3101) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                client.method251(Statics.field233, field721[Statics.field716], field721[Statics.field716 + 1]);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3103) {
                                                                                                                                client.field326.method2480(197);
                                                                                                                                class18 var69 = (class18) client.field447.method2614();
                                                                                                                                while (true) {
                                                                                                                                    if (var69 == null) {
                                                                                                                                        if (client.field450 != null) {
                                                                                                                                            client.method2197(client.field450);
                                                                                                                                            client.field450 = null;
                                                                                                                                        }
                                                                                                                                        var68 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var69.field180 == 0 || var69.field180 == 3) {
                                                                                                                                        client.method1633(var69, true);
                                                                                                                                    }
                                                                                                                                    var69 = (class18) client.field447.method2615();
                                                                                                                                }
                                                                                                                            } else if (var290 == 3104) {
                                                                                                                                String var70 = field723[--Statics.field722];
                                                                                                                                int var71 = 0;
                                                                                                                                if (class215.method2842(var70)) {
                                                                                                                                    int var72 = class215.method594(var70, 10, true);
                                                                                                                                    var71 = var72;
                                                                                                                                }
                                                                                                                                client.field326.method2480(74);
                                                                                                                                client.field326.method2218(var71);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3105) {
                                                                                                                                String var73 = field723[--Statics.field722];
                                                                                                                                client.field326.method2480(109);
                                                                                                                                client.field326.method2215(var73.length() + 1);
                                                                                                                                client.field326.method2351(var73);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3106) {
                                                                                                                                String var74 = field723[--Statics.field722];
                                                                                                                                client.field326.method2480(162);
                                                                                                                                client.field326.method2215(var74.length() + 1);
                                                                                                                                client.field326.method2351(var74);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3107) {
                                                                                                                                int var75 = field721[--Statics.field716];
                                                                                                                                String var76 = field723[--Statics.field722];
                                                                                                                                int var77 = class46.field892;
                                                                                                                                int[] var78 = class46.field895;
                                                                                                                                boolean var79 = false;
                                                                                                                                for (int var80 = 0; var80 < var77; var80++) {
                                                                                                                                    class24 var81 = client.field404[var78[var80]];
                                                                                                                                    if (var81 != null && Statics.field233 != var81 && var81.field266 != null && var81.field266.equalsIgnoreCase(var76)) {
                                                                                                                                        if (var75 == 1) {
                                                                                                                                            client.field326.method2480(164);
                                                                                                                                            client.field326.method2216(var78[var80]);
                                                                                                                                            client.field326.method2276(0);
                                                                                                                                        } else if (var75 == 4) {
                                                                                                                                            client.field326.method2480(73);
                                                                                                                                            client.field326.method2373(var78[var80]);
                                                                                                                                            client.field326.method2215(0);
                                                                                                                                        } else if (var75 == 6) {
                                                                                                                                            client.field326.method2480(32);
                                                                                                                                            client.field326.method2373(var78[var80]);
                                                                                                                                            client.field326.method2346(0);
                                                                                                                                        } else if (var75 == 7) {
                                                                                                                                            client.field326.method2480(40);
                                                                                                                                            client.field326.method2346(0);
                                                                                                                                            client.field326.method2222(var78[var80]);
                                                                                                                                        }
                                                                                                                                        var79 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!var79) {
                                                                                                                                    class48.method196(4, "", class176.field2518 + var76);
                                                                                                                                }
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3108) {
                                                                                                                                Statics.field716 -= 3;
                                                                                                                                int var82 = field721[Statics.field716];
                                                                                                                                int var83 = field721[Statics.field716 + 1];
                                                                                                                                int var84 = field721[Statics.field716 + 2];
                                                                                                                                class172 var85 = class172.method2211(var84);
                                                                                                                                client.method893(var85, var82, var83);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3109) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var86 = field721[Statics.field716];
                                                                                                                                int var87 = field721[Statics.field716 + 1];
                                                                                                                                class172 var88 = var52 ? Statics.field2895 : Statics.field943;
                                                                                                                                client.method893(var88, var86, var87);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3110) {
                                                                                                                                Statics.field663 = field721[--Statics.field716] == 1;
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3111) {
                                                                                                                                field721[++Statics.field716 - 1] = Statics.field657.field691 ? 1 : 0;
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3112) {
                                                                                                                                Statics.field657.field691 = field721[--Statics.field716] == 1;
                                                                                                                                class31.method1810();
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3113) {
                                                                                                                                String var89 = field723[--Statics.field722];
                                                                                                                                boolean var90 = field721[--Statics.field716] == 1;
                                                                                                                                class115.method2213(var89, var90, "openjs", false);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3115) {
                                                                                                                                int var91 = field721[--Statics.field716];
                                                                                                                                client.field326.method2480(50);
                                                                                                                                client.field326.method2216(var91);
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var290 == 3116) {
                                                                                                                                int var92 = field721[--Statics.field716];
                                                                                                                                Statics.field722 -= 2;
                                                                                                                                String var93 = field723[Statics.field722];
                                                                                                                                String var94 = field723[Statics.field722 + 1];
                                                                                                                                if (var93.length() > 500) {
                                                                                                                                    var68 = 1;
                                                                                                                                } else if (var94.length() > 500) {
                                                                                                                                    var68 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field326.method2480(173);
                                                                                                                                    client.field326.method2216(1 + class130.method740(var93) + class130.method740(var94));
                                                                                                                                    client.field326.method2346(var92);
                                                                                                                                    client.field326.method2351(var93);
                                                                                                                                    client.field326.method2351(var94);
                                                                                                                                    var68 = 1;
                                                                                                                                }
                                                                                                                            } else if (var290 == 3117) {
                                                                                                                                client.field433 = field721[--Statics.field716] == 1;
                                                                                                                                var68 = 1;
                                                                                                                            } else {
                                                                                                                                var68 = 2;
                                                                                                                            }
                                                                                                                            var53 = var68;
                                                                                                                        } else if (var290 < 3300) {
                                                                                                                            byte var98;
                                                                                                                            if (var290 == 3200) {
                                                                                                                                Statics.field716 -= 3;
                                                                                                                                int var95 = field721[Statics.field716];
                                                                                                                                int var96 = field721[Statics.field716 + 1];
                                                                                                                                int var97 = field721[Statics.field716 + 2];
                                                                                                                                if (client.field552 != 0 && var96 != 0 && client.field529 < 50) {
                                                                                                                                    client.field530[client.field529] = var95;
                                                                                                                                    client.field531[client.field529] = var96;
                                                                                                                                    client.field443[client.field529] = var97;
                                                                                                                                    client.field505[client.field529] = null;
                                                                                                                                    client.field494[client.field529] = 0;
                                                                                                                                    client.field529++;
                                                                                                                                }
                                                                                                                                var98 = 1;
                                                                                                                            } else if (var290 == 3201) {
                                                                                                                                int var99 = field721[--Statics.field716];
                                                                                                                                if (var99 == -1 && !client.field526) {
                                                                                                                                    class160.method219();
                                                                                                                                } else if (var99 != -1 && client.field525 != var99 && client.field502 != 0 && !client.field526) {
                                                                                                                                    class187 var100 = Statics.field200;
                                                                                                                                    int var101 = client.field502;
                                                                                                                                    class160.field2064 = 1;
                                                                                                                                    Statics.field2068 = var100;
                                                                                                                                    Statics.field1990 = var99;
                                                                                                                                    Statics.field2792 = 0;
                                                                                                                                    Statics.field2070 = var101;
                                                                                                                                    Statics.field165 = false;
                                                                                                                                    Statics.field1544 = 2;
                                                                                                                                }
                                                                                                                                client.field525 = var99;
                                                                                                                                var98 = 1;
                                                                                                                            } else if (var290 == 3202) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                client.method3083(field721[Statics.field716], field721[Statics.field716 + 1]);
                                                                                                                                var98 = 1;
                                                                                                                            } else {
                                                                                                                                var98 = 2;
                                                                                                                            }
                                                                                                                            var53 = var98;
                                                                                                                        } else if (var290 < 3400) {
                                                                                                                            var53 = Statics.method254(var290, var4, var52);
                                                                                                                        } else if (var290 < 3500) {
                                                                                                                            var53 = method647(var290, var4, var52);
                                                                                                                        } else if (var290 < 3700) {
                                                                                                                            var53 = Statics.method183(var290, var4, var52);
                                                                                                                        } else if (var290 < 4000) {
                                                                                                                            byte var103;
                                                                                                                            if (var290 == 3903) {
                                                                                                                                int var102 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = client.field563[var102].method43();
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3904) {
                                                                                                                                int var104 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = client.field563[var104].field40;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3905) {
                                                                                                                                int var105 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = client.field563[var105].field39;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3906) {
                                                                                                                                int var106 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = client.field563[var106].field42;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3907) {
                                                                                                                                int var107 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = client.field563[var107].field43;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3908) {
                                                                                                                                int var108 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = client.field563[var108].field44;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3910) {
                                                                                                                                int var109 = field721[--Statics.field716];
                                                                                                                                int var110 = client.field563[var109].method45();
                                                                                                                                field721[++Statics.field716 - 1] = var110 == 0 ? 1 : 0;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3911) {
                                                                                                                                int var111 = field721[--Statics.field716];
                                                                                                                                int var112 = client.field563[var111].method45();
                                                                                                                                field721[++Statics.field716 - 1] = var112 == 2 ? 1 : 0;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3912) {
                                                                                                                                int var113 = field721[--Statics.field716];
                                                                                                                                int var114 = client.field563[var113].method45();
                                                                                                                                field721[++Statics.field716 - 1] = var114 == 5 ? 1 : 0;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3913) {
                                                                                                                                int var115 = field721[--Statics.field716];
                                                                                                                                int var116 = client.field563[var115].method45();
                                                                                                                                field721[++Statics.field716 - 1] = var116 == 1 ? 1 : 0;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3914) {
                                                                                                                                boolean var117 = field721[--Statics.field716] == 1;
                                                                                                                                if (Statics.field2746 != null) {
                                                                                                                                    Statics.field2746.method17(class2.field14, var117);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3915) {
                                                                                                                                boolean var118 = field721[--Statics.field716] == 1;
                                                                                                                                if (Statics.field2746 != null) {
                                                                                                                                    Statics.field2746.method17(class2.field13, var118);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3916) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                boolean var119 = field721[Statics.field716] == 1;
                                                                                                                                boolean var120 = field721[Statics.field716 + 1] == 1;
                                                                                                                                if (Statics.field2746 != null) {
                                                                                                                                    Statics.field2746.method17(new class45(var120), var119);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3917) {
                                                                                                                                boolean var121 = field721[--Statics.field716] == 1;
                                                                                                                                if (Statics.field2746 != null) {
                                                                                                                                    Statics.field2746.method17(class2.field12, var121);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3918) {
                                                                                                                                boolean var122 = field721[--Statics.field716] == 1;
                                                                                                                                if (Statics.field2746 != null) {
                                                                                                                                    Statics.field2746.method17(class2.field15, var122);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3919) {
                                                                                                                                field721[++Statics.field716 - 1] = Statics.field2746 == null ? 0 : Statics.field2746.field16.size();
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3920) {
                                                                                                                                int var123 = field721[--Statics.field716];
                                                                                                                                class3 var124 = (class3) Statics.field2746.field16.get(var123);
                                                                                                                                field721[++Statics.field716 - 1] = var124.field23;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3921) {
                                                                                                                                int var125 = field721[--Statics.field716];
                                                                                                                                class3 var126 = (class3) Statics.field2746.field16.get(var125);
                                                                                                                                field723[++Statics.field722 - 1] = var126.method26();
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3922) {
                                                                                                                                int var127 = field721[--Statics.field716];
                                                                                                                                class3 var128 = (class3) Statics.field2746.field16.get(var127);
                                                                                                                                field723[++Statics.field722 - 1] = var128.method21();
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3923) {
                                                                                                                                int var129 = field721[--Statics.field716];
                                                                                                                                class3 var130 = (class3) Statics.field2746.field16.get(var129);
                                                                                                                                long var131 = class132.method1336() - Statics.field873 - var130.field26;
                                                                                                                                int var133 = (int) (var131 / 3600000L);
                                                                                                                                int var134 = (int) ((var131 - (long) (var133 * 3600000)) / 60000L);
                                                                                                                                int var135 = (int) ((var131 - (long) (var133 * 3600000) - (long) (var134 * 60000)) / 1000L);
                                                                                                                                String var136 = var133 + ":" + var134 / 10 + var134 % 10 + ":" + var135 / 10 + var135 % 10;
                                                                                                                                field723[++Statics.field722 - 1] = var136;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3924) {
                                                                                                                                int var137 = field721[--Statics.field716];
                                                                                                                                class3 var138 = (class3) Statics.field2746.field16.get(var137);
                                                                                                                                field721[++Statics.field716 - 1] = var138.field22.field42;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3925) {
                                                                                                                                int var139 = field721[--Statics.field716];
                                                                                                                                class3 var140 = (class3) Statics.field2746.field16.get(var139);
                                                                                                                                field721[++Statics.field716 - 1] = var140.field22.field39;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var290 == 3926) {
                                                                                                                                int var141 = field721[--Statics.field716];
                                                                                                                                class3 var142 = (class3) Statics.field2746.field16.get(var141);
                                                                                                                                field721[++Statics.field716 - 1] = var142.field22.field40;
                                                                                                                                var103 = 1;
                                                                                                                            } else {
                                                                                                                                var103 = 2;
                                                                                                                            }
                                                                                                                            var53 = var103;
                                                                                                                        } else if (var290 < 4100) {
                                                                                                                            byte var145;
                                                                                                                            if (var290 == 4000) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var143 = field721[Statics.field716];
                                                                                                                                int var144 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var143 + var144;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4001) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var146 = field721[Statics.field716];
                                                                                                                                int var147 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var146 - var147;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4002) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var148 = field721[Statics.field716];
                                                                                                                                int var149 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var148 * var149;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4003) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var150 = field721[Statics.field716];
                                                                                                                                int var151 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var150 / var151;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4004) {
                                                                                                                                int var152 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = (int) (Math.random() * (double) var152);
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4005) {
                                                                                                                                int var153 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = (int) (Math.random() * (double) (var153 + 1));
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4006) {
                                                                                                                                Statics.field716 -= 5;
                                                                                                                                int var154 = field721[Statics.field716];
                                                                                                                                int var155 = field721[Statics.field716 + 1];
                                                                                                                                int var156 = field721[Statics.field716 + 2];
                                                                                                                                int var157 = field721[Statics.field716 + 3];
                                                                                                                                int var158 = field721[Statics.field716 + 4];
                                                                                                                                field721[++Statics.field716 - 1] = (var155 - var154) * (var158 - var156) / (var157 - var156) + var154;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4007) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var159 = field721[Statics.field716];
                                                                                                                                int var160 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var159 * var160 / 100 + var159;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4008) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var161 = field721[Statics.field716];
                                                                                                                                int var162 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var161 | 0x1 << var162;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4009) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var163 = field721[Statics.field716];
                                                                                                                                int var164 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var163 & -1 - (0x1 << var164);
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4010) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var165 = field721[Statics.field716];
                                                                                                                                int var166 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = (var165 & 0x1 << var166) == 0 ? 0 : 1;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4011) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var167 = field721[Statics.field716];
                                                                                                                                int var168 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var167 % var168;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4012) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var169 = field721[Statics.field716];
                                                                                                                                int var170 = field721[Statics.field716 + 1];
                                                                                                                                if (var169 == 0) {
                                                                                                                                    field721[++Statics.field716 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field721[++Statics.field716 - 1] = (int) Math.pow((double) var169, (double) var170);
                                                                                                                                }
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4013) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var171 = field721[Statics.field716];
                                                                                                                                int var172 = field721[Statics.field716 + 1];
                                                                                                                                if (var171 == 0) {
                                                                                                                                    field721[++Statics.field716 - 1] = 0;
                                                                                                                                } else if (var172 == 0) {
                                                                                                                                    field721[++Statics.field716 - 1] = Integer.MAX_VALUE;
                                                                                                                                } else {
                                                                                                                                    field721[++Statics.field716 - 1] = (int) Math.pow((double) var171, 1.0D / (double) var172);
                                                                                                                                }
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4014) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var173 = field721[Statics.field716];
                                                                                                                                int var174 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var173 & var174;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4015) {
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var175 = field721[Statics.field716];
                                                                                                                                int var176 = field721[Statics.field716 + 1];
                                                                                                                                field721[++Statics.field716 - 1] = var175 | var176;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var290 == 4018) {
                                                                                                                                Statics.field716 -= 3;
                                                                                                                                long var177 = (long) field721[Statics.field716];
                                                                                                                                long var179 = (long) field721[Statics.field716 + 1];
                                                                                                                                long var181 = (long) field721[Statics.field716 + 2];
                                                                                                                                field721[++Statics.field716 - 1] = (int) (var177 * var181 / var179);
                                                                                                                                var145 = 1;
                                                                                                                            } else {
                                                                                                                                var145 = 2;
                                                                                                                            }
                                                                                                                            var53 = var145;
                                                                                                                        } else if (var290 < 4200) {
                                                                                                                            byte var185;
                                                                                                                            if (var290 == 4100) {
                                                                                                                                String var183 = field723[--Statics.field722];
                                                                                                                                int var184 = field721[--Statics.field716];
                                                                                                                                field723[++Statics.field722 - 1] = var183 + var184;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4101) {
                                                                                                                                Statics.field722 -= 2;
                                                                                                                                String var186 = field723[Statics.field722];
                                                                                                                                String var187 = field723[Statics.field722 + 1];
                                                                                                                                field723[++Statics.field722 - 1] = var186 + var187;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4102) {
                                                                                                                                String var188 = field723[--Statics.field722];
                                                                                                                                int var189 = field721[--Statics.field716];
                                                                                                                                String[] var190 = field723;
                                                                                                                                int var191 = ++Statics.field722 - 1;
                                                                                                                                String var193;
                                                                                                                                if (var189 < 0) {
                                                                                                                                    var193 = Integer.toString(var189);
                                                                                                                                } else {
                                                                                                                                    var193 = class215.method154(var189, 10, true);
                                                                                                                                }
                                                                                                                                var190[var191] = var188 + var193;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4103) {
                                                                                                                                String var194 = field723[--Statics.field722];
                                                                                                                                field723[++Statics.field722 - 1] = var194.toLowerCase();
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4104) {
                                                                                                                                int var195 = field721[--Statics.field716];
                                                                                                                                long var196 = ((long) var195 + 11745L) * 86400000L;
                                                                                                                                field727.setTime(new Date(var196));
                                                                                                                                int var198 = field727.get(5);
                                                                                                                                int var199 = field727.get(2);
                                                                                                                                int var200 = field727.get(1);
                                                                                                                                field723[++Statics.field722 - 1] = var198 + "-" + field728[var199] + "-" + var200;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4105) {
                                                                                                                                Statics.field722 -= 2;
                                                                                                                                String var201 = field723[Statics.field722];
                                                                                                                                String var202 = field723[Statics.field722 + 1];
                                                                                                                                if (Statics.field233.field237 != null && Statics.field233.field237.field2180) {
                                                                                                                                    field723[++Statics.field722 - 1] = var202;
                                                                                                                                } else {
                                                                                                                                    field723[++Statics.field722 - 1] = var201;
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4106) {
                                                                                                                                int var203 = field721[--Statics.field716];
                                                                                                                                field723[++Statics.field722 - 1] = Integer.toString(var203);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4107) {
                                                                                                                                Statics.field722 -= 2;
                                                                                                                                int[] var204 = field721;
                                                                                                                                int var205 = ++Statics.field716 - 1;
                                                                                                                                String var206 = field723[Statics.field722];
                                                                                                                                String var207 = field723[Statics.field722 + 1];
                                                                                                                                int var208 = client.field287;
                                                                                                                                int var209 = var206.length();
                                                                                                                                int var210 = var207.length();
                                                                                                                                int var211 = 0;
                                                                                                                                int var212 = 0;
                                                                                                                                byte var213 = 0;
                                                                                                                                byte var214 = 0;
                                                                                                                                int var215;
                                                                                                                                label1033: while (true) {
                                                                                                                                    if (var211 - var213 >= var209 && var212 - var214 >= var210) {
                                                                                                                                        int var226 = Math.min(var209, var210);
                                                                                                                                        for (int var227 = 0; var227 < var226; var227++) {
                                                                                                                                            char var230 = var206.charAt(var227);
                                                                                                                                            char var231 = var207.charAt(var227);
                                                                                                                                            if (var230 != var231 && Character.toUpperCase(var230) != Character.toUpperCase(var231)) {
                                                                                                                                                char var232 = Character.toLowerCase(var230);
                                                                                                                                                char var233 = Character.toLowerCase(var231);
                                                                                                                                                if (var232 != var233) {
                                                                                                                                                    var215 = class121.method755(var232, var208) - class121.method755(var233, var208);
                                                                                                                                                    break label1033;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var234 = var209 - var210;
                                                                                                                                        if (var234 == 0) {
                                                                                                                                            for (int var235 = 0; var235 < var226; var235++) {
                                                                                                                                                char var236 = var206.charAt(var235);
                                                                                                                                                char var237 = var207.charAt(var235);
                                                                                                                                                if (var236 != var237) {
                                                                                                                                                    var215 = class121.method755(var236, var208) - class121.method755(var237, var208);
                                                                                                                                                    break label1033;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var215 = 0;
                                                                                                                                        } else {
                                                                                                                                            var215 = var234;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var211 - var213 >= var209) {
                                                                                                                                        var215 = -1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var212 - var214 >= var210) {
                                                                                                                                        var215 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var216;
                                                                                                                                    if (var213 == 0) {
                                                                                                                                        var216 = var206.charAt(var211++);
                                                                                                                                    } else {
                                                                                                                                        var216 = (char) var213;
                                                                                                                                        boolean var217 = false;
                                                                                                                                    }
                                                                                                                                    char var218;
                                                                                                                                    if (var214 == 0) {
                                                                                                                                        var218 = var207.charAt(var212++);
                                                                                                                                    } else {
                                                                                                                                        var218 = (char) var214;
                                                                                                                                        boolean var219 = false;
                                                                                                                                    }
                                                                                                                                    byte var220;
                                                                                                                                    if (var216 == 198) {
                                                                                                                                        var220 = 69;
                                                                                                                                    } else if (var216 == 230) {
                                                                                                                                        var220 = 101;
                                                                                                                                    } else if (var216 == 223) {
                                                                                                                                        var220 = 115;
                                                                                                                                    } else if (var216 == 338) {
                                                                                                                                        var220 = 69;
                                                                                                                                    } else if (var216 == 339) {
                                                                                                                                        var220 = 101;
                                                                                                                                    } else {
                                                                                                                                        var220 = 0;
                                                                                                                                    }
                                                                                                                                    var213 = var220;
                                                                                                                                    byte var221;
                                                                                                                                    if (var218 == 198) {
                                                                                                                                        var221 = 69;
                                                                                                                                    } else if (var218 == 230) {
                                                                                                                                        var221 = 101;
                                                                                                                                    } else if (var218 == 223) {
                                                                                                                                        var221 = 115;
                                                                                                                                    } else if (var218 == 338) {
                                                                                                                                        var221 = 69;
                                                                                                                                    } else if (var218 == 339) {
                                                                                                                                        var221 = 101;
                                                                                                                                    } else {
                                                                                                                                        var221 = 0;
                                                                                                                                    }
                                                                                                                                    var214 = var221;
                                                                                                                                    char var222 = class121.method188(var216, var208);
                                                                                                                                    char var223 = class121.method188(var218, var208);
                                                                                                                                    if (var222 != var223 && Character.toUpperCase(var222) != Character.toUpperCase(var223)) {
                                                                                                                                        char var224 = Character.toLowerCase(var222);
                                                                                                                                        char var225 = Character.toLowerCase(var223);
                                                                                                                                        if (var224 != var225) {
                                                                                                                                            var215 = class121.method755(var224, var208) - class121.method755(var225, var208);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var204[var205] = class215.method2199(var215);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4108) {
                                                                                                                                String var238 = field723[--Statics.field722];
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var239 = field721[Statics.field716];
                                                                                                                                int var240 = field721[Statics.field716 + 1];
                                                                                                                                byte[] var241 = Statics.field1585.method3129(var240, 0);
                                                                                                                                class208 var242 = new class208(var241);
                                                                                                                                field721[++Statics.field716 - 1] = var242.method3699(var238, var239);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4109) {
                                                                                                                                String var243 = field723[--Statics.field722];
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var244 = field721[Statics.field716];
                                                                                                                                int var245 = field721[Statics.field716 + 1];
                                                                                                                                byte[] var246 = Statics.field1585.method3129(var245, 0);
                                                                                                                                class208 var247 = new class208(var246);
                                                                                                                                field721[++Statics.field716 - 1] = var247.method3744(var243, var244);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4110) {
                                                                                                                                Statics.field722 -= 2;
                                                                                                                                String var248 = field723[Statics.field722];
                                                                                                                                String var249 = field723[Statics.field722 + 1];
                                                                                                                                if (field721[--Statics.field716] == 1) {
                                                                                                                                    field723[++Statics.field722 - 1] = var248;
                                                                                                                                } else {
                                                                                                                                    field723[++Statics.field722 - 1] = var249;
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4111) {
                                                                                                                                String var250 = field723[--Statics.field722];
                                                                                                                                field723[++Statics.field722 - 1] = class209.method3700(var250);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4112) {
                                                                                                                                String var251 = field723[--Statics.field722];
                                                                                                                                int var252 = field721[--Statics.field716];
                                                                                                                                field723[++Statics.field722 - 1] = var251 + (char) var252;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4113) {
                                                                                                                                int var253 = field721[--Statics.field716];
                                                                                                                                int[] var254 = field721;
                                                                                                                                int var255 = ++Statics.field716 - 1;
                                                                                                                                char var256 = (char) var253;
                                                                                                                                boolean var257;
                                                                                                                                if (var256 >= ' ' && var256 <= '~') {
                                                                                                                                    var257 = true;
                                                                                                                                } else if (var256 >= 160 && var256 <= 255) {
                                                                                                                                    var257 = true;
                                                                                                                                } else if (var256 == 8364 || var256 == 338 || var256 == 8212 || var256 == 339 || var256 == 376) {
                                                                                                                                    var257 = true;
                                                                                                                                } else {
                                                                                                                                    var257 = false;
                                                                                                                                }
                                                                                                                                var254[var255] = var257 ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4114) {
                                                                                                                                int var258 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = class215.method3065((char) var258) ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4115) {
                                                                                                                                int var259 = field721[--Statics.field716];
                                                                                                                                int[] var260 = field721;
                                                                                                                                int var261 = ++Statics.field716 - 1;
                                                                                                                                char var262 = (char) var259;
                                                                                                                                boolean var263 = var262 >= 'A' && var262 <= 'Z' || var262 >= 'a' && var262 <= 'z';
                                                                                                                                var260[var261] = var263 ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4116) {
                                                                                                                                int var264 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = class215.method2456((char) var264) ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4117) {
                                                                                                                                String var265 = field723[--Statics.field722];
                                                                                                                                if (var265 == null) {
                                                                                                                                    field721[++Statics.field716 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field721[++Statics.field716 - 1] = var265.length();
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4118) {
                                                                                                                                String var266 = field723[--Statics.field722];
                                                                                                                                Statics.field716 -= 2;
                                                                                                                                int var267 = field721[Statics.field716];
                                                                                                                                int var268 = field721[Statics.field716 + 1];
                                                                                                                                field723[++Statics.field722 - 1] = var266.substring(var267, var268);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4119) {
                                                                                                                                String var269 = field723[--Statics.field722];
                                                                                                                                StringBuilder var270 = new StringBuilder(var269.length());
                                                                                                                                boolean var271 = false;
                                                                                                                                for (int var272 = 0; var272 < var269.length(); var272++) {
                                                                                                                                    char var273 = var269.charAt(var272);
                                                                                                                                    if (var273 == '<') {
                                                                                                                                        var271 = true;
                                                                                                                                    } else if (var273 == '>') {
                                                                                                                                        var271 = false;
                                                                                                                                    } else if (!var271) {
                                                                                                                                        var270.append(var273);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field723[++Statics.field722 - 1] = var270.toString();
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4120) {
                                                                                                                                String var274 = field723[--Statics.field722];
                                                                                                                                int var275 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = var274.indexOf(var275);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var290 == 4121) {
                                                                                                                                Statics.field722 -= 2;
                                                                                                                                String var276 = field723[Statics.field722];
                                                                                                                                String var277 = field723[Statics.field722 + 1];
                                                                                                                                int var278 = field721[--Statics.field716];
                                                                                                                                field721[++Statics.field716 - 1] = var276.indexOf(var277, var278);
                                                                                                                                var185 = 1;
                                                                                                                            } else {
                                                                                                                                var185 = 2;
                                                                                                                            }
                                                                                                                            var53 = var185;
                                                                                                                        } else if (var290 < 4300) {
                                                                                                                            var53 = method1482(var290, var4, var52);
                                                                                                                        } else if (var290 < 5100) {
                                                                                                                            var53 = method1090(var290, var4, var52);
                                                                                                                        } else if (var290 < 5400) {
                                                                                                                            byte var282;
                                                                                                                            if (var290 == 5306) {
                                                                                                                                int[] var279 = field721;
                                                                                                                                int var280 = ++Statics.field716 - 1;
                                                                                                                                int var281 = client.field500 ? 2 : 1;
                                                                                                                                var279[var280] = var281;
                                                                                                                                var282 = 1;
                                                                                                                            } else if (var290 == 5307) {
                                                                                                                                int var283 = field721[--Statics.field716];
                                                                                                                                if (var283 == 1 || var283 == 2) {
                                                                                                                                    client.method3585(var283);
                                                                                                                                }
                                                                                                                                var282 = 1;
                                                                                                                            } else if (var290 == 5308) {
                                                                                                                                field721[++Statics.field716 - 1] = Statics.field657.field693;
                                                                                                                                var282 = 1;
                                                                                                                            } else if (var290 == 5309) {
                                                                                                                                int var284 = field721[--Statics.field716];
                                                                                                                                if (var284 == 1 || var284 == 2) {
                                                                                                                                    Statics.field657.field693 = var284;
                                                                                                                                    class31.method1810();
                                                                                                                                }
                                                                                                                                var282 = 1;
                                                                                                                            } else {
                                                                                                                                var282 = 2;
                                                                                                                            }
                                                                                                                            var53 = var282;
                                                                                                                        } else if (var290 < 5600) {
                                                                                                                            var53 = method1874(var290, var4, var52);
                                                                                                                        } else if (var290 < 5700) {
                                                                                                                            var53 = method734(var290, var4, var52);
                                                                                                                        } else if (var290 < 6300) {
                                                                                                                            var53 = method1811(var290, var4, var52);
                                                                                                                        } else if (var290 < 6600) {
                                                                                                                            var53 = method186(var290, var4, var52);
                                                                                                                        } else {
                                                                                                                            var53 = 2;
                                                                                                                        }
                                                                                                                        switch(var53) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var290 == 0) {
                                                                                                                        field721[++Statics.field716 - 1] = var7[var5];
                                                                                                                    } else if (var290 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field721[++Statics.field716 - 1] = class168.field2174[var15];
                                                                                                                    } else if (var290 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class168.field2174[var16] = field721[--Statics.field716];
                                                                                                                        client.method2939(var16);
                                                                                                                    } else if (var290 == 3) {
                                                                                                                        field723[++Statics.field722 - 1] = var4.field933[var5];
                                                                                                                    } else if (var290 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var290 == 7) {
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        if (field721[Statics.field716] != field721[Statics.field716 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var290 == 8) {
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        if (field721[Statics.field716] == field721[Statics.field716 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var290 == 9) {
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        if (field721[Statics.field716] < field721[Statics.field716 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var290 == 10) {
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        if (field721[Statics.field716] > field721[Statics.field716 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var290 == 21) {
                                                                                                                        if (field726 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field724[--field726];
                                                                                                                        var4 = var17.field114;
                                                                                                                        var6 = var4.field931;
                                                                                                                        var7 = var4.field932;
                                                                                                                        var5 = var17.field119;
                                                                                                                        Statics.field719 = var17.field115;
                                                                                                                        Statics.field718 = var17.field116;
                                                                                                                    } else if (var290 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field721[++Statics.field716 - 1] = class168.method1112(var18);
                                                                                                                    } else if (var290 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        class168.method1809(var19, field721[--Statics.field716]);
                                                                                                                    } else if (var290 == 31) {
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        if (field721[Statics.field716] <= field721[Statics.field716 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var290 == 32) {
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        if (field721[Statics.field716] >= field721[Statics.field716 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var290 == 33) {
                                                                                                                        field721[++Statics.field716 - 1] = Statics.field719[var7[var5]];
                                                                                                                    } else if (var290 == 34) {
                                                                                                                        Statics.field719[var7[var5]] = field721[--Statics.field716];
                                                                                                                    } else if (var290 == 35) {
                                                                                                                        field723[++Statics.field722 - 1] = Statics.field718[var7[var5]];
                                                                                                                    } else if (var290 == 36) {
                                                                                                                        Statics.field718[var7[var5]] = field723[--Statics.field722];
                                                                                                                    } else if (var290 == 37) {
                                                                                                                        int var20 = var7[var5];
                                                                                                                        Statics.field722 -= var20;
                                                                                                                        String[] var21 = field723;
                                                                                                                        int var22 = Statics.field722;
                                                                                                                        String var23;
                                                                                                                        if (var20 == 0) {
                                                                                                                            var23 = "";
                                                                                                                        } else if (var20 == 1) {
                                                                                                                            String var24 = var21[var22];
                                                                                                                            if (var24 == null) {
                                                                                                                                var23 = "null";
                                                                                                                            } else {
                                                                                                                                var23 = var24.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var25 = var20 + var22;
                                                                                                                            int var26 = 0;
                                                                                                                            for (int var27 = var22; var27 < var25; var27++) {
                                                                                                                                String var28 = var21[var27];
                                                                                                                                if (var28 == null) {
                                                                                                                                    var26 += 4;
                                                                                                                                } else {
                                                                                                                                    var26 += var28.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var29 = new StringBuilder(var26);
                                                                                                                            for (int var30 = var22; var30 < var25; var30++) {
                                                                                                                                String var31 = var21[var30];
                                                                                                                                if (var31 == null) {
                                                                                                                                    var29.append("null");
                                                                                                                                } else {
                                                                                                                                    var29.append(var31);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var23 = var29.toString();
                                                                                                                        }
                                                                                                                        field723[++Statics.field722 - 1] = var23;
                                                                                                                    } else if (var290 == 38) {
                                                                                                                        Statics.field716--;
                                                                                                                    } else if (var290 == 39) {
                                                                                                                        Statics.field722--;
                                                                                                                    } else if (var290 == 40) {
                                                                                                                        int var33 = var7[var5];
                                                                                                                        class49 var34 = class49.method892(var33);
                                                                                                                        int[] var35 = new int[var34.field934];
                                                                                                                        String[] var36 = new String[var34.field944];
                                                                                                                        for (int var37 = 0; var37 < var34.field936; var37++) {
                                                                                                                            var35[var37] = field721[Statics.field716 - var34.field936 + var37];
                                                                                                                        }
                                                                                                                        for (int var38 = 0; var38 < var34.field937; var38++) {
                                                                                                                            var36[var38] = field723[Statics.field722 - var34.field937 + var38];
                                                                                                                        }
                                                                                                                        Statics.field716 -= var34.field936;
                                                                                                                        Statics.field722 -= var34.field937;
                                                                                                                        class12 var39 = new class12();
                                                                                                                        var39.field114 = var4;
                                                                                                                        var39.field119 = var5;
                                                                                                                        var39.field115 = Statics.field719;
                                                                                                                        var39.field116 = Statics.field718;
                                                                                                                        field724[++field726 - 1] = var39;
                                                                                                                        var4 = var34;
                                                                                                                        var6 = var34.field931;
                                                                                                                        var7 = var34.field932;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field719 = var35;
                                                                                                                        Statics.field718 = var36;
                                                                                                                    } else if (var290 == 42) {
                                                                                                                        field721[++Statics.field716 - 1] = Statics.field274.method836(var7[var5]);
                                                                                                                    } else if (var290 == 43) {
                                                                                                                        Statics.field274.method835(var7[var5], field721[--Statics.field716]);
                                                                                                                    } else if (var290 == 44) {
                                                                                                                        int var40 = var7[var5] >> 16;
                                                                                                                        int var41 = var7[var5] & 0xFFFF;
                                                                                                                        int var42 = field721[--Statics.field716];
                                                                                                                        if (var42 >= 0 && var42 <= 5000) {
                                                                                                                            field720[var40] = var42;
                                                                                                                            byte var43 = -1;
                                                                                                                            if (var41 == 105) {
                                                                                                                                var43 = 0;
                                                                                                                            }
                                                                                                                            int var44 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var44 >= var42) {
                                                                                                                                    continue label1183;
                                                                                                                                }
                                                                                                                                field729[var40][var44] = var43;
                                                                                                                                var44++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var290 == 45) {
                                                                                                                        int var45 = var7[var5];
                                                                                                                        int var46 = field721[--Statics.field716];
                                                                                                                        if (var46 < 0 || var46 >= field720[var45]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field721[++Statics.field716 - 1] = field729[var45][var46];
                                                                                                                    } else if (var290 == 46) {
                                                                                                                        int var47 = var7[var5];
                                                                                                                        Statics.field716 -= 2;
                                                                                                                        int var48 = field721[Statics.field716];
                                                                                                                        if (var48 < 0 || var48 >= field720[var47]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field729[var47][var48] = field721[Statics.field716 + 1];
                                                                                                                    } else if (var290 == 47) {
                                                                                                                        String var49 = Statics.field274.method863(var7[var5]);
                                                                                                                        if (var49 == null) {
                                                                                                                            var49 = "null";
                                                                                                                        }
                                                                                                                        field723[++Statics.field722 - 1] = var49;
                                                                                                                    } else if (var290 == 48) {
                                                                                                                        Statics.field274.method852(var7[var5], field723[--Statics.field722]);
                                                                                                                    } else if (var290 == 60) {
                                                                                                                        class143 var50 = var4.field938[var7[var5]];
                                                                                                                        class155 var51 = (class155) var50.method2566((long) field721[--Statics.field716]);
                                                                                                                        if (var51 != null) {
                                                                                                                            var5 += var51.field2047;
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
        } catch (Exception var289) {
            StringBuilder var287 = new StringBuilder(30);
            var287.append("").append(var4.field2034).append(" ");
            for (int var288 = field726 - 1; var288 >= 0; var288--) {
                var287.append("").append(field724[var288].field114.field2034).append(" ");
            }
            var287.append("").append(var8);
            class102.method3059(var287.toString(), var289);
        }
    }

    @ObfuscatedName("fl.c(ILat;ZI)I")
    public static int method3070(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field716 -= 3;
            int var3 = field721[Statics.field716];
            int var4 = field721[Statics.field716 + 1];
            int var5 = field721[Statics.field716 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class172 var6 = class172.method2211(var3);
            if (var6.field2332 == null) {
                var6.field2332 = new class172[var5 + 1];
            }
            if (var6.field2332.length <= var5) {
                class172[] var7 = new class172[var5 + 1];
                for (int var8 = 0; var8 < var6.field2332.length; var8++) {
                    var7[var8] = var6.field2332[var8];
                }
                var6.field2332 = var7;
            }
            if (var5 > 0 && var6.field2332[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class172 var9 = new class172();
            var9.field2331 = var4;
            var9.field2227 = var9.field2208 = var6.field2208;
            var9.field2209 = var5;
            var9.field2324 = true;
            var6.field2332[var5] = var9;
            if (arg2) {
                Statics.field2895 = var9;
            } else {
                Statics.field943 = var9;
            }
            client.method2197(var6);
            return 1;
        } else if (arg0 == 101) {
            class172 var10 = arg2 ? Statics.field2895 : Statics.field943;
            class172 var11 = class172.method2211(var10.field2208);
            var11.field2332[var10.field2209] = null;
            client.method2197(var11);
            return 1;
        } else if (arg0 == 102) {
            class172 var12 = class172.method2211(field721[--Statics.field716]);
            var12.field2332 = null;
            client.method2197(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field716 -= 2;
            int var13 = field721[Statics.field716];
            int var14 = field721[Statics.field716 + 1];
            class172 var15 = class172.method14(var13, var14);
            if (var15 == null || var14 == -1) {
                field721[++Statics.field716 - 1] = 0;
            } else {
                field721[++Statics.field716 - 1] = 1;
                if (arg2) {
                    Statics.field2895 = var15;
                } else {
                    Statics.field943 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class172 var16 = class172.method2211(field721[--Statics.field716]);
            if (var16 == null) {
                field721[++Statics.field716 - 1] = 0;
            } else {
                field721[++Statics.field716 - 1] = 1;
                if (arg2) {
                    Statics.field2895 = var16;
                } else {
                    Statics.field943 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.n(ILat;ZI)I")
    public static int method827(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class172 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field721[--Statics.field716];
            var4 = class172.method2211(var3);
        } else {
            var4 = arg2 ? Statics.field2895 : Statics.field943;
        }
        if (arg0 == 1000) {
            Statics.field716 -= 4;
            var4.field2217 = field721[Statics.field716];
            var4.field2218 = field721[Statics.field716 + 1];
            var4.field2213 = field721[Statics.field716 + 2];
            var4.field2207 = field721[Statics.field716 + 3];
            client.method2197(var4);
            client.method1356(var4);
            if (var3 != -1 && var4.field2331 == 0) {
                client.method2917(Statics.field1985[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field716 -= 4;
            var4.field2219 = field721[Statics.field716];
            var4.field2220 = field721[Statics.field716 + 1];
            var4.field2281 = field721[Statics.field716 + 2];
            var4.field2216 = field721[Statics.field716 + 3];
            client.method2197(var4);
            client.method1356(var4);
            if (var3 != -1 && var4.field2331 == 0) {
                client.method2917(Statics.field1985[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field721[--Statics.field716] == 1;
            if (var4.field2228 != var5) {
                var4.field2228 = var5;
                client.method2197(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2276 = field721[--Statics.field716] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2204 = field721[--Statics.field716] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dk.q(ILat;ZI)I")
    public static int method1941(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class172 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field721[--Statics.field716];
            var4 = class172.method2211(var3);
        } else {
            var4 = arg2 ? Statics.field2895 : Statics.field943;
        }
        if (arg0 == 1100) {
            Statics.field716 -= 2;
            var4.field2229 = field721[Statics.field716];
            if (var4.field2229 > var4.field2241 - var4.field2336) {
                var4.field2229 = var4.field2241 - var4.field2336;
            }
            if (var4.field2229 < 0) {
                var4.field2229 = 0;
            }
            var4.field2234 = field721[Statics.field716 + 1];
            if (var4.field2234 > var4.field2263 - var4.field2341) {
                var4.field2234 = var4.field2263 - var4.field2341;
            }
            if (var4.field2234 < 0) {
                var4.field2234 = 0;
            }
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2233 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2237 = field721[--Statics.field716] == 1;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2242 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2283 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2243 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2197 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2246 = field721[--Statics.field716] == 1;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2251 = 1;
            var4.field2232 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field716 -= 6;
            var4.field2257 = field721[Statics.field716];
            var4.field2258 = field721[Statics.field716 + 1];
            var4.field2264 = field721[Statics.field716 + 2];
            var4.field2300 = field721[Statics.field716 + 3];
            var4.field2313 = field721[Statics.field716 + 4];
            var4.field2245 = field721[Statics.field716 + 5];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field721[--Statics.field716];
            if (var4.field2255 != var5) {
                var4.field2255 = var5;
                var4.field2330 = 0;
                var4.field2215 = 0;
                client.method2197(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2231 = field721[--Statics.field716] == 1;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field723[--Statics.field722];
            if (!var6.equals(var4.field2268)) {
                var4.field2268 = var6;
                client.method2197(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2267 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field716 -= 3;
            var4.field2271 = field721[Statics.field716];
            var4.field2272 = field721[Statics.field716 + 1];
            var4.field2288 = field721[Statics.field716 + 2];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2273 = field721[--Statics.field716] == 1;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2247 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2248 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2225 = field721[--Statics.field716] == 1;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2250 = field721[--Statics.field716] == 1;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field716 -= 2;
            var4.field2241 = field721[Statics.field716];
            var4.field2263 = field721[Statics.field716 + 1];
            client.method2197(var4);
            if (var3 != -1 && var4.field2331 == 0) {
                client.method2917(Statics.field1985[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method767(var4.field2208, var4.field2209);
            client.field450 = var4;
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2244 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2280 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2249 = field721[--Statics.field716];
            client.method2197(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field721[--Statics.field716];
            class226[] var8 = new class226[] { class226.field3225, class226.field3223, class226.field3224, class226.field3221, class226.field3222 };
            class226 var9 = (class226) class125.method707(var8, var7);
            if (var9 != null) {
                var4.field2239 = var9;
                client.method2197(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.t(ILat;ZI)I")
    public static int method256(int arg0, class49 arg1, boolean arg2) {
        class172 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class172.method2211(field721[--Statics.field716]);
        } else {
            var3 = arg2 ? Statics.field2895 : Statics.field943;
        }
        client.method2197(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field716 -= 2;
            int var4 = field721[Statics.field716];
            int var5 = field721[Statics.field716 + 1];
            var3.field2328 = var4;
            var3.field2329 = var5;
            class204 var6 = class204.method868(var4);
            var3.field2264 = var6.field2995;
            var3.field2300 = var6.field3005;
            var3.field2313 = var6.field2997;
            var3.field2257 = var6.field2998;
            var3.field2258 = var6.field2999;
            var3.field2245 = var6.field2994;
            if (arg0 == 1205) {
                var3.field2266 = 0;
            } else if (arg0 == 1212 | var6.field3000 == 1) {
                var3.field2266 = 1;
            } else {
                var3.field2266 = 2;
            }
            if (var3.field2299 > 0) {
                var3.field2245 = var3.field2245 * 32 / var3.field2299;
            } else if (var3.field2219 > 0) {
                var3.field2245 = var3.field2245 * 32 / var3.field2219;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2251 = 2;
            var3.field2232 = field721[--Statics.field716];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2251 = 3;
            var3.field2232 = Statics.field233.field237.method2970();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.p(ILat;ZI)I")
    public static int method2202(int arg0, class49 arg1, boolean arg2) {
        class172 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class172.method2211(field721[--Statics.field716]);
        } else {
            var3 = arg2 ? Statics.field2895 : Statics.field943;
        }
        if (arg0 == 1300) {
            int var4 = field721[--Statics.field716] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3032(var4, field723[--Statics.field722]);
                return 1;
            } else {
                Statics.field722--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field716 -= 2;
            int var5 = field721[Statics.field716];
            int var6 = field721[Statics.field716 + 1];
            var3.field2253 = class172.method14(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2291 = field721[--Statics.field716] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2284 = field721[--Statics.field716];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2285 = field721[--Statics.field716];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2260 = field723[--Statics.field722];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2287 = field723[--Statics.field722];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2282 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.u(ILat;ZI)I")
    public static int method1054(int arg0, class49 arg1, boolean arg2) {
        class172 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class172.method2211(field721[--Statics.field716]);
        } else {
            var3 = arg2 ? Statics.field2895 : Statics.field943;
        }
        String var4 = field723[--Statics.field722];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field721[--Statics.field716];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field721[--Statics.field716];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field723[--Statics.field722];
            } else {
                var7[var8] = Integer.valueOf(field721[--Statics.field716]);
            }
        }
        int var9 = field721[--Statics.field716];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2290 = var7;
        } else if (arg0 == 1401) {
            var3.field2293 = var7;
        } else if (arg0 == 1402) {
            var3.field2303 = var7;
        } else if (arg0 == 1403) {
            var3.field2294 = var7;
        } else if (arg0 == 1404) {
            var3.field2296 = var7;
        } else if (arg0 == 1405) {
            var3.field2297 = var7;
        } else if (arg0 == 1406) {
            var3.field2335 = var7;
        } else if (arg0 == 1407) {
            var3.field2301 = var7;
            var3.field2302 = var5;
        } else if (arg0 == 1408) {
            var3.field2307 = var7;
        } else if (arg0 == 1409) {
            var3.field2308 = var7;
        } else if (arg0 == 1410) {
            var3.field2298 = var7;
        } else if (arg0 == 1411) {
            var3.field2210 = var7;
        } else if (arg0 == 1412) {
            var3.field2295 = var7;
        } else if (arg0 == 1414) {
            var3.field2270 = var7;
            var3.field2265 = var5;
        } else if (arg0 == 1415) {
            var3.field2305 = var7;
            var3.field2306 = var5;
        } else if (arg0 == 1416) {
            var3.field2262 = var7;
        } else if (arg0 == 1417) {
            var3.field2309 = var7;
        } else if (arg0 == 1418) {
            var3.field2310 = var7;
        } else if (arg0 == 1419) {
            var3.field2311 = var7;
        } else if (arg0 == 1420) {
            var3.field2312 = var7;
        } else if (arg0 == 1421) {
            var3.field2318 = var7;
        } else if (arg0 == 1422) {
            var3.field2221 = var7;
        } else if (arg0 == 1423) {
            var3.field2315 = var7;
        } else if (arg0 == 1424) {
            var3.field2316 = var7;
        } else if (arg0 == 1425) {
            var3.field2223 = var7;
        } else if (arg0 == 1426) {
            var3.field2319 = var7;
        } else if (arg0 == 1427) {
            var3.field2317 = var7;
        } else {
            return 2;
        }
        var3.field2286 = true;
        return 1;
    }

    @ObfuscatedName("ch.w(ILat;ZI)I")
    public static int method1848(int arg0, class49 arg1, boolean arg2) {
        class172 var3 = arg2 ? Statics.field2895 : Statics.field943;
        if (arg0 == 1500) {
            field721[++Statics.field716 - 1] = var3.field2320;
            return 1;
        } else if (arg0 == 1501) {
            field721[++Statics.field716 - 1] = var3.field2222;
            return 1;
        } else if (arg0 == 1502) {
            field721[++Statics.field716 - 1] = var3.field2336;
            return 1;
        } else if (arg0 == 1503) {
            field721[++Statics.field716 - 1] = var3.field2341;
            return 1;
        } else if (arg0 == 1504) {
            field721[++Statics.field716 - 1] = var3.field2228 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field721[++Statics.field716 - 1] = var3.field2227;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.r(ILat;ZI)I")
    public static int method811(int arg0, class49 arg1, boolean arg2) {
        class172 var3 = arg2 ? Statics.field2895 : Statics.field943;
        if (arg0 == 1600) {
            field721[++Statics.field716 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 1601) {
            field721[++Statics.field716 - 1] = var3.field2234;
            return 1;
        } else if (arg0 == 1602) {
            field723[++Statics.field722 - 1] = var3.field2268;
            return 1;
        } else if (arg0 == 1603) {
            field721[++Statics.field716 - 1] = var3.field2241;
            return 1;
        } else if (arg0 == 1604) {
            field721[++Statics.field716 - 1] = var3.field2263;
            return 1;
        } else if (arg0 == 1605) {
            field721[++Statics.field716 - 1] = var3.field2245;
            return 1;
        } else if (arg0 == 1606) {
            field721[++Statics.field716 - 1] = var3.field2264;
            return 1;
        } else if (arg0 == 1607) {
            field721[++Statics.field716 - 1] = var3.field2313;
            return 1;
        } else if (arg0 == 1608) {
            field721[++Statics.field716 - 1] = var3.field2300;
            return 1;
        } else if (arg0 == 1609) {
            field721[++Statics.field716 - 1] = var3.field2242;
            return 1;
        } else if (arg0 == 1610) {
            field721[++Statics.field716 - 1] = var3.field2249;
            return 1;
        } else if (arg0 == 1611) {
            field721[++Statics.field716 - 1] = var3.field2233;
            return 1;
        } else if (arg0 == 1612) {
            field721[++Statics.field716 - 1] = var3.field2280;
            return 1;
        } else if (arg0 == 1613) {
            field721[++Statics.field716 - 1] = var3.field2239.method763();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.s(ILat;ZI)I")
    public static int method192(int arg0, class49 arg1, boolean arg2) {
        class172 var3 = arg2 ? Statics.field2895 : Statics.field943;
        if (arg0 == 1800) {
            field721[++Statics.field716 - 1] = Statics.method3327(client.method1872(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field721[--Statics.field716];
            int var5 = var4 - 1;
            if (var3.field2282 == null || var5 >= var3.field2282.length || var3.field2282[var5] == null) {
                field723[++Statics.field722 - 1] = "";
            } else {
                field723[++Statics.field722 - 1] = var3.field2282[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2260 == null) {
                field723[++Statics.field722 - 1] = "";
            } else {
                field723[++Statics.field722 - 1] = var3.field2260;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.k(ILat;ZI)I")
    public static int method3347(int arg0, class49 arg1, boolean arg2) {
        class172 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class172.method2211(field721[--Statics.field716]);
        } else {
            var3 = arg2 ? Statics.field2895 : Statics.field943;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field717 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2317 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field190 = var3;
            var4.field197 = var3.field2317;
            var4.field198 = field717 + 1;
            client.field485.method2662(var4);
            return 1;
        }
    }

    @ObfuscatedName("ct.e(ILat;ZI)I")
    public static int method1634(int arg0, class49 arg1, boolean arg2) {
        class172 var3 = class172.method2211(field721[--Statics.field716]);
        if (arg0 == 2500) {
            field721[++Statics.field716 - 1] = var3.field2320;
            return 1;
        } else if (arg0 == 2501) {
            field721[++Statics.field716 - 1] = var3.field2222;
            return 1;
        } else if (arg0 == 2502) {
            field721[++Statics.field716 - 1] = var3.field2336;
            return 1;
        } else if (arg0 == 2503) {
            field721[++Statics.field716 - 1] = var3.field2341;
            return 1;
        } else if (arg0 == 2504) {
            field721[++Statics.field716 - 1] = var3.field2228 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field721[++Statics.field716 - 1] = var3.field2227;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.j(ILat;ZB)I")
    public static int method181(int arg0, class49 arg1, boolean arg2) {
        class172 var3 = class172.method2211(field721[--Statics.field716]);
        if (arg0 == 2600) {
            field721[++Statics.field716 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 2601) {
            field721[++Statics.field716 - 1] = var3.field2234;
            return 1;
        } else if (arg0 == 2602) {
            field723[++Statics.field722 - 1] = var3.field2268;
            return 1;
        } else if (arg0 == 2603) {
            field721[++Statics.field716 - 1] = var3.field2241;
            return 1;
        } else if (arg0 == 2604) {
            field721[++Statics.field716 - 1] = var3.field2263;
            return 1;
        } else if (arg0 == 2605) {
            field721[++Statics.field716 - 1] = var3.field2245;
            return 1;
        } else if (arg0 == 2606) {
            field721[++Statics.field716 - 1] = var3.field2264;
            return 1;
        } else if (arg0 == 2607) {
            field721[++Statics.field716 - 1] = var3.field2313;
            return 1;
        } else if (arg0 == 2608) {
            field721[++Statics.field716 - 1] = var3.field2300;
            return 1;
        } else if (arg0 == 2609) {
            field721[++Statics.field716 - 1] = var3.field2242;
            return 1;
        } else if (arg0 == 2610) {
            field721[++Statics.field716 - 1] = var3.field2249;
            return 1;
        } else if (arg0 == 2611) {
            field721[++Statics.field716 - 1] = var3.field2233;
            return 1;
        } else if (arg0 == 2612) {
            field721[++Statics.field716 - 1] = var3.field2280;
            return 1;
        } else if (arg0 == 2613) {
            field721[++Statics.field716 - 1] = var3.field2239.method763();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.a(ILat;ZB)I")
    public static int method647(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field716 -= 2;
            int var3 = field721[Statics.field716];
            int var4 = field721[Statics.field716 + 1];
            class201 var5 = class201.method1922(var3);
            if (var5.field2887 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2886; var6++) {
                if (var5.field2891[var6] == var4) {
                    field723[++Statics.field722 - 1] = var5.field2890[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field723[++Statics.field722 - 1] = var5.field2888;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field716 -= 4;
            int var7 = field721[Statics.field716];
            int var8 = field721[Statics.field716 + 1];
            int var9 = field721[Statics.field716 + 2];
            int var10 = field721[Statics.field716 + 3];
            class201 var11 = class201.method1922(var9);
            if (var11.field2894 != var7 || var11.field2887 != var8) {
                if (var8 == 115) {
                    field723[++Statics.field722 - 1] = "null";
                } else {
                    field721[++Statics.field716 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2886; var12++) {
                if (var11.field2891[var12] == var10) {
                    if (var8 == 115) {
                        field723[++Statics.field722 - 1] = var11.field2890[var12];
                    } else {
                        field721[++Statics.field716 - 1] = var11.field2892[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field723[++Statics.field722 - 1] = var11.field2888;
                } else {
                    field721[++Statics.field716 - 1] = var11.field2889;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.h(ILat;ZI)I")
    public static int method1482(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field721[--Statics.field716];
            field723[++Statics.field722 - 1] = class204.method868(var3).field3022;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field716 -= 2;
            int var4 = field721[Statics.field716];
            int var5 = field721[Statics.field716 + 1];
            class204 var6 = class204.method868(var4);
            if (var5 < 1 || var5 > 5 || var6.field3003[var5 - 1] == null) {
                field723[++Statics.field722 - 1] = "";
            } else {
                field723[++Statics.field722 - 1] = var6.field3003[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field716 -= 2;
            int var7 = field721[Statics.field716];
            int var8 = field721[Statics.field716 + 1];
            class204 var9 = class204.method868(var7);
            if (var8 < 1 || var8 > 5 || var9.field3004[var8 - 1] == null) {
                field723[++Statics.field722 - 1] = "";
            } else {
                field723[++Statics.field722 - 1] = var9.field3004[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field721[--Statics.field716];
            field721[++Statics.field716 - 1] = class204.method868(var10).field3023;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field721[--Statics.field716];
            field721[++Statics.field716 - 1] = class204.method868(var11).field3000 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field721[--Statics.field716];
            class204 var13 = class204.method868(var12);
            if (var13.field3021 == -1 && var13.field3020 >= 0) {
                field721[++Statics.field716 - 1] = var13.field3020;
            } else {
                field721[++Statics.field716 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field721[--Statics.field716];
            class204 var15 = class204.method868(var14);
            if (var15.field3021 >= 0 && var15.field3020 >= 0) {
                field721[++Statics.field716 - 1] = var15.field3020;
            } else {
                field721[++Statics.field716 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field721[--Statics.field716];
            field721[++Statics.field716 - 1] = class204.method868(var16).field3002 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field721[--Statics.field716];
            class204 var18 = class204.method868(var17);
            if (var18.field3001 == -1 && var18.field3017 >= 0) {
                field721[++Statics.field716 - 1] = var18.field3017;
            } else {
                field721[++Statics.field716 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field721[--Statics.field716];
            class204 var20 = class204.method868(var19);
            if (var20.field3001 >= 0 && var20.field3017 >= 0) {
                field721[++Statics.field716 - 1] = var20.field3017;
            } else {
                field721[++Statics.field716 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field723[--Statics.field722];
            int var22 = field721[--Statics.field716];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field2982) {
                    Statics.field590 = var26;
                    Statics.field1854 = 0;
                    Statics.field1692 = var27;
                    String[] var32 = new String[Statics.field1692];
                    for (int var33 = 0; var33 < Statics.field1692; var33++) {
                        var32[var33] = class204.method868(var26[var33]).field3022;
                    }
                    short[] var34 = Statics.field590;
                    class127.method2142(var32, var34, 0, var32.length - 1);
                    break;
                }
                class204 var29 = class204.method868(var28);
                if ((!var24 || var29.field3018) && var29.field3021 == -1 && var29.field3022.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field1692 = -1;
                        Statics.field590 = null;
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
            field721[++Statics.field716 - 1] = Statics.field1692;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field590 == null || Statics.field1854 >= Statics.field1692) {
                field721[++Statics.field716 - 1] = -1;
            } else {
                field721[++Statics.field716 - 1] = Statics.field590[++Statics.field1854 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1854 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.b(ILat;ZS)I")
    public static int method1090(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field721[++Statics.field716 - 1] = client.field324;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field716 -= 3;
            client.field324 = field721[Statics.field716];
            Statics.field158 = Statics.method3790(field721[Statics.field716 + 1]);
            if (Statics.field158 == null) {
                Statics.field158 = class221.field3200;
            }
            client.field469 = field721[Statics.field716 + 2];
            client.field326.method2480(202);
            client.field326.method2215(client.field324);
            client.field326.method2215(Statics.field158.field3202);
            client.field326.method2215(client.field469);
            return 1;
        } else if (arg0 == 5002) {
            String var3 = field723[--Statics.field722];
            Statics.field716 -= 2;
            int var4 = field721[Statics.field716];
            int var5 = field721[Statics.field716 + 1];
            client.field326.method2480(168);
            client.field326.method2215(class130.method740(var3) + 2);
            client.field326.method2351(var3);
            client.field326.method2215(var4 - 1);
            client.field326.method2215(var5);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field716 -= 2;
            int var6 = field721[Statics.field716];
            int var7 = field721[Statics.field716 + 1];
            class51 var8 = (class51) class48.field926.get(var6);
            class22 var9 = var8.method896(var7);
            if (var9 == null) {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
                field723[++Statics.field722 - 1] = "";
                field723[++Statics.field722 - 1] = "";
            } else {
                field721[++Statics.field716 - 1] = var9.field231;
                field721[++Statics.field716 - 1] = var9.field228;
                field723[++Statics.field722 - 1] = var9.field226 == null ? "" : var9.field226;
                field723[++Statics.field722 - 1] = var9.field227 == null ? "" : var9.field227;
                field723[++Statics.field722 - 1] = var9.field224 == null ? "" : var9.field224;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field721[--Statics.field716];
            class22 var12 = (class22) class48.field925.method2566((long) var11);
            if (var12 == null) {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
                field723[++Statics.field722 - 1] = "";
                field723[++Statics.field722 - 1] = "";
            } else {
                field721[++Statics.field716 - 1] = var12.field223;
                field721[++Statics.field716 - 1] = var12.field228;
                field723[++Statics.field722 - 1] = var12.field226 == null ? "" : var12.field226;
                field723[++Statics.field722 - 1] = var12.field227 == null ? "" : var12.field227;
                field723[++Statics.field722 - 1] = var12.field224 == null ? "" : var12.field224;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field158 == null) {
                field721[++Statics.field716 - 1] = -1;
            } else {
                field721[++Statics.field716 - 1] = Statics.field158.field3202;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var14 = field723[--Statics.field722];
            int var15 = field721[--Statics.field716];
            String var16 = var14.toLowerCase();
            byte var17 = 0;
            if (var16.startsWith(class176.field2522)) {
                var17 = 0;
                var14 = var14.substring(class176.field2522.length());
            } else if (var16.startsWith(class176.field2534)) {
                var17 = 1;
                var14 = var14.substring(class176.field2534.length());
            } else if (var16.startsWith(class176.field2363)) {
                var17 = 2;
                var14 = var14.substring(class176.field2363.length());
            } else if (var16.startsWith(class176.field2395)) {
                var17 = 3;
                var14 = var14.substring(class176.field2395.length());
            } else if (var16.startsWith(class176.field2595)) {
                var17 = 4;
                var14 = var14.substring(class176.field2595.length());
            } else if (var16.startsWith(class176.field2542)) {
                var17 = 5;
                var14 = var14.substring(class176.field2542.length());
            } else if (var16.startsWith(class176.field2544)) {
                var17 = 6;
                var14 = var14.substring(class176.field2544.length());
            } else if (var16.startsWith(class176.field2362)) {
                var17 = 7;
                var14 = var14.substring(class176.field2362.length());
            } else if (var16.startsWith(class176.field2548)) {
                var17 = 8;
                var14 = var14.substring(class176.field2548.length());
            } else if (var16.startsWith(class176.field2550)) {
                var17 = 9;
                var14 = var14.substring(class176.field2550.length());
            } else if (var16.startsWith(class176.field2445)) {
                var17 = 10;
                var14 = var14.substring(class176.field2445.length());
            } else if (var16.startsWith(class176.field2387)) {
                var17 = 11;
                var14 = var14.substring(class176.field2387.length());
            } else if (client.field287 != 0) {
                if (var16.startsWith(class176.field2533)) {
                    var17 = 0;
                    var14 = var14.substring(class176.field2533.length());
                } else if (var16.startsWith(class176.field2535)) {
                    var17 = 1;
                    var14 = var14.substring(class176.field2535.length());
                } else if (var16.startsWith(class176.field2537)) {
                    var17 = 2;
                    var14 = var14.substring(class176.field2537.length());
                } else if (var16.startsWith(class176.field2539)) {
                    var17 = 3;
                    var14 = var14.substring(class176.field2539.length());
                } else if (var16.startsWith(class176.field2541)) {
                    var17 = 4;
                    var14 = var14.substring(class176.field2541.length());
                } else if (var16.startsWith(class176.field2543)) {
                    var17 = 5;
                    var14 = var14.substring(class176.field2543.length());
                } else if (var16.startsWith(class176.field2545)) {
                    var17 = 6;
                    var14 = var14.substring(class176.field2545.length());
                } else if (var16.startsWith(class176.field2547)) {
                    var17 = 7;
                    var14 = var14.substring(class176.field2547.length());
                } else if (var16.startsWith(class176.field2549)) {
                    var17 = 8;
                    var14 = var14.substring(class176.field2549.length());
                } else if (var16.startsWith(class176.field2513)) {
                    var17 = 9;
                    var14 = var14.substring(class176.field2513.length());
                } else if (var16.startsWith(class176.field2553)) {
                    var17 = 10;
                    var14 = var14.substring(class176.field2553.length());
                } else if (var16.startsWith(class176.field2555)) {
                    var17 = 11;
                    var14 = var14.substring(class176.field2555.length());
                }
            }
            String var18 = var14.toLowerCase();
            byte var19 = 0;
            if (var18.startsWith(class176.field2400)) {
                var19 = 1;
                var14 = var14.substring(class176.field2400.length());
            } else if (var18.startsWith(class176.field2558)) {
                var19 = 2;
                var14 = var14.substring(class176.field2558.length());
            } else if (var18.startsWith(class176.field2560)) {
                var19 = 3;
                var14 = var14.substring(class176.field2560.length());
            } else if (var18.startsWith(class176.field2418)) {
                var19 = 4;
                var14 = var14.substring(class176.field2418.length());
            } else if (var18.startsWith(class176.field2564)) {
                var19 = 5;
                var14 = var14.substring(class176.field2564.length());
            } else if (client.field287 != 0) {
                if (var18.startsWith(class176.field2601)) {
                    var19 = 1;
                    var14 = var14.substring(class176.field2601.length());
                } else if (var18.startsWith(class176.field2559)) {
                    var19 = 2;
                    var14 = var14.substring(class176.field2559.length());
                } else if (var18.startsWith(class176.field2486)) {
                    var19 = 3;
                    var14 = var14.substring(class176.field2486.length());
                } else if (var18.startsWith(class176.field2563)) {
                    var19 = 4;
                    var14 = var14.substring(class176.field2563.length());
                } else if (var18.startsWith(class176.field2546)) {
                    var19 = 5;
                    var14 = var14.substring(class176.field2546.length());
                }
            }
            client.field326.method2480(56);
            client.field326.method2215(0);
            int var20 = client.field326.field1956;
            client.field326.method2215(var15);
            client.field326.method2215(var17);
            client.field326.method2215(var19);
            class210.method754(client.field326, var14);
            client.field326.method2227(client.field326.field1956 - var20);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field722 -= 2;
            String var21 = field723[Statics.field722];
            String var22 = field723[Statics.field722 + 1];
            client.field326.method2480(83);
            client.field326.method2216(0);
            int var23 = client.field326.field1956;
            client.field326.method2351(var21);
            class210.method754(client.field326, var22);
            client.field326.method2226(client.field326.field1956 - var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field233 == null || Statics.field233.field266 == null) {
                var24 = "";
            } else {
                var24 = Statics.field233.field266;
            }
            field723[++Statics.field722 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field721[++Statics.field716 - 1] = client.field469;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field721[--Statics.field716];
            int[] var26 = field721;
            int var27 = ++Statics.field716 - 1;
            class51 var28 = (class51) class48.field926.get(var25);
            int var29;
            if (var28 == null) {
                var29 = 0;
            } else {
                var29 = var28.method902();
            }
            var26[var27] = var29;
            return 1;
        } else if (arg0 == 5018) {
            int var30 = field721[--Statics.field716];
            int[] var31 = field721;
            int var32 = ++Statics.field716 - 1;
            class22 var33 = (class22) class48.field925.method2566((long) var30);
            int var34;
            if (var33 == null) {
                var34 = -1;
            } else if (class48.field928.field2052 == var33.field2037) {
                var34 = -1;
            } else {
                var34 = ((class22) var33.field2037).field231;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 5019) {
            int var35 = field721[--Statics.field716];
            int[] var36 = field721;
            int var37 = ++Statics.field716 - 1;
            class22 var38 = (class22) class48.field925.method2566((long) var35);
            int var39;
            if (var38 == null) {
                var39 = -1;
            } else if (class48.field928.field2052 == var38.field2038) {
                var39 = -1;
            } else {
                var39 = ((class22) var38.field2038).field231;
            }
            var36[var37] = var39;
            return 1;
        } else if (arg0 == 5020) {
            String var40 = field723[--Statics.field722];
            if (var40.equalsIgnoreCase("toggleroof")) {
                Statics.field657.field691 = !Statics.field657.field691;
                class31.method1810();
                if (Statics.field657.field691) {
                    class48.method196(99, "", "Roofs are now all hidden");
                } else {
                    class48.method196(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var40.equalsIgnoreCase("displayfps")) {
                client.field559 = !client.field559;
            }
            if (client.field518 >= 2) {
                if (var40.equalsIgnoreCase("fpson")) {
                    client.field559 = true;
                }
                if (var40.equalsIgnoreCase("fpsoff")) {
                    client.field559 = false;
                }
                if (var40.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var40.equalsIgnoreCase("clientdrop")) {
                    client.method12();
                }
                if (var40.equalsIgnoreCase("errortest") && client.field284 == 2) {
                    throw new RuntimeException();
                }
            }
            client.field326.method2480(161);
            client.field326.method2215(var40.length() + 1);
            client.field326.method2351(var40);
            return 1;
        } else if (arg0 == 5021) {
            client.field461 = field723[--Statics.field722].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field723[++Statics.field722 - 1] = client.field461;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.f(ILat;ZI)I")
    public static int method1874(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field716 -= 2;
            int var3 = field721[Statics.field716];
            int var4 = field721[Statics.field716 + 1];
            if (!client.field535) {
                client.field367 = var3;
                client.field368 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field721[++Statics.field716 - 1] = client.field367;
            return 1;
        } else if (arg0 == 5506) {
            field721[++Statics.field716 - 1] = client.field368;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field721[--Statics.field716];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field373 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field721[++Statics.field716 - 1] = client.field373;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.o(ILat;ZI)I")
    public static int method734(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field490 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.m(ILat;ZI)I")
    public static int method1811(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field716 -= 2;
            client.field501 = (short) field721[Statics.field716];
            if (client.field501 <= 0) {
                client.field501 = 256;
            }
            client.field542 = (short) field721[Statics.field716 + 1];
            if (client.field542 <= 0) {
                client.field542 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field716 -= 2;
            client.field543 = (short) field721[Statics.field716];
            if (client.field543 <= 0) {
                client.field543 = 256;
            }
            client.field319 = (short) field721[Statics.field716 + 1];
            if (client.field319 <= 0) {
                client.field319 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field716 -= 4;
            client.field510 = (short) field721[Statics.field716];
            if (client.field510 <= 0) {
                client.field510 = 1;
            }
            client.field460 = (short) field721[Statics.field716 + 1];
            if (client.field460 <= 0) {
                client.field460 = 32767;
            } else if (client.field460 < client.field510) {
                client.field460 = client.field510;
            }
            client.field321 = (short) field721[Statics.field716 + 2];
            if (client.field321 <= 0) {
                client.field321 = 1;
            }
            client.field548 = (short) field721[Statics.field716 + 3];
            if (client.field548 <= 0) {
                client.field548 = 32767;
            } else if (client.field548 < client.field321) {
                client.field548 = client.field321;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field458 == null) {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = -1;
            } else {
                client.method3057(0, 0, client.field458.field2336, client.field458.field2341, false);
                field721[++Statics.field716 - 1] = client.field522;
                field721[++Statics.field716 - 1] = client.field515;
            }
            return 1;
        } else if (arg0 == 6204) {
            field721[++Statics.field716 - 1] = client.field543;
            field721[++Statics.field716 - 1] = client.field319;
            return 1;
        } else if (arg0 == 6205) {
            field721[++Statics.field716 - 1] = client.field501;
            field721[++Statics.field716 - 1] = client.field542;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.y(ILat;ZB)I")
    public static int method186(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field721[++Statics.field716 - 1] = class30.method3393() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class30.field675 = 0;
            class30 var3 = class30.method2487();
            if (var3 == null) {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
                field721[++Statics.field716 - 1] = 0;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
            } else {
                field721[++Statics.field716 - 1] = var3.field681;
                field721[++Statics.field716 - 1] = var3.field679;
                field723[++Statics.field722 - 1] = var3.field674;
                field721[++Statics.field716 - 1] = var3.field683;
                field721[++Statics.field716 - 1] = var3.field672;
                field723[++Statics.field722 - 1] = var3.field680;
            }
            return 1;
        } else if (arg0 == 6502) {
            class30 var5 = class30.method2487();
            if (var5 == null) {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
                field721[++Statics.field716 - 1] = 0;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
            } else {
                field721[++Statics.field716 - 1] = var5.field681;
                field721[++Statics.field716 - 1] = var5.field679;
                field723[++Statics.field722 - 1] = var5.field674;
                field721[++Statics.field716 - 1] = var5.field683;
                field721[++Statics.field716 - 1] = var5.field672;
                field723[++Statics.field722 - 1] = var5.field680;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field721[--Statics.field716];
            class30 var7 = null;
            for (int var8 = 0; var8 < class30.field670; var8++) {
                if (Statics.field673[var8].field681 == var6) {
                    var7 = Statics.field673[var8];
                    break;
                }
            }
            if (var7 == null) {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
                field721[++Statics.field716 - 1] = 0;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
            } else {
                field721[++Statics.field716 - 1] = var7.field681;
                field721[++Statics.field716 - 1] = var7.field679;
                field723[++Statics.field722 - 1] = var7.field674;
                field721[++Statics.field716 - 1] = var7.field683;
                field721[++Statics.field716 - 1] = var7.field672;
                field723[++Statics.field722 - 1] = var7.field680;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field716 -= 4;
            int var9 = field721[Statics.field716];
            boolean var10 = field721[Statics.field716 + 1] == 1;
            int var11 = field721[Statics.field716 + 2];
            boolean var12 = field721[Statics.field716 + 3] == 1;
            class30.method2151(var9, var10, var11, var12);
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field721[--Statics.field716];
            if (var13 >= 0 && var13 < class30.field670) {
                class30 var14 = Statics.field673[var13];
                field721[++Statics.field716 - 1] = var14.field681;
                field721[++Statics.field716 - 1] = var14.field679;
                field723[++Statics.field722 - 1] = var14.field674;
                field721[++Statics.field716 - 1] = var14.field683;
                field721[++Statics.field716 - 1] = var14.field672;
                field723[++Statics.field722 - 1] = var14.field680;
            } else {
                field721[++Statics.field716 - 1] = -1;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
                field721[++Statics.field716 - 1] = 0;
                field721[++Statics.field716 - 1] = 0;
                field723[++Statics.field722 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field431 = field721[--Statics.field716] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field716 -= 2;
            int var15 = field721[Statics.field716];
            int var16 = field721[Statics.field716 + 1];
            class199 var17 = Statics.method3084(var16);
            if (var17.method3373()) {
                field723[++Statics.field722 - 1] = class205.method3033(var15).method3618(var16, var17.field2877);
            } else {
                field721[++Statics.field716 - 1] = class205.method3033(var15).method3593(var16, var17.field2871);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field716 -= 2;
            int var18 = field721[Statics.field716];
            int var19 = field721[Statics.field716 + 1];
            class199 var20 = Statics.method3084(var19);
            if (var20.method3373()) {
                field723[++Statics.field722 - 1] = class203.method579(var18).method3507(var19, var20.field2877);
            } else {
                field721[++Statics.field716 - 1] = class203.method579(var18).method3481(var19, var20.field2871);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field716 -= 2;
            int var21 = field721[Statics.field716];
            int var22 = field721[Statics.field716 + 1];
            class199 var23 = Statics.method3084(var22);
            if (var23.method3373()) {
                field723[++Statics.field722 - 1] = class204.method868(var21).method3537(var22, var23.field2877);
            } else {
                field721[++Statics.field716 - 1] = class204.method868(var21).method3536(var22, var23.field2871);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field716 -= 2;
            int var24 = field721[Statics.field716];
            int var25 = field721[Statics.field716 + 1];
            class199 var26 = Statics.method3084(var25);
            if (var26.method3373()) {
                String[] var27 = field723;
                int var28 = ++Statics.field722 - 1;
                class200 var29 = (class200) class200.field2879.method2598((long) var24);
                class200 var30;
                if (var29 == null) {
                    byte[] var31 = Statics.field2884.method3129(34, var24);
                    class200 var32 = new class200();
                    if (var31 != null) {
                        var32.method3389(new class130(var31));
                    }
                    var32.method3388();
                    class200.field2879.method2607(var32, (long) var24);
                    var30 = var32;
                } else {
                    var30 = var29;
                }
                var27[var28] = var30.method3392(var25, var26.field2877);
            } else {
                field721[++Statics.field716 - 1] = class200.method2144(var24).method3391(var25, var26.field2871);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.am(II)V")
    public static void method1388(int arg0) {
        if (arg0 == -1 || !class172.method1982(arg0)) {
            return;
        }
        class172[] var1 = Statics.field1985[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class172 var3 = var1[var2];
            if (var3.field2289 != null) {
                class19 var4 = new class19();
                var4.field190 = var3;
                var4.field197 = var3.field2289;
                method887(var4, 2000000);
            }
        }
    }
}
