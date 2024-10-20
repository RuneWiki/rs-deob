package deob;

@ObfuscatedName("ab")
public class class33 {

    @ObfuscatedName("ab.y")
    public static byte[] field717 = new byte[2048];

    @ObfuscatedName("ab.u")
    public static byte[] field727 = new byte[2048];

    @ObfuscatedName("ab.k")
    public static class119[] field719 = new class119[2048];

    @ObfuscatedName("ab.j")
    public static int field720 = 0;

    @ObfuscatedName("ab.i")
    public static int[] field725 = new int[2048];

    @ObfuscatedName("ab.x")
    public static int field722 = 0;

    @ObfuscatedName("ab.g")
    public static int[] field723 = new int[2048];

    @ObfuscatedName("ab.e")
    public static int[] field724 = new int[2048];

    @ObfuscatedName("ab.p")
    public static int[] field715 = new int[2048];

    @ObfuscatedName("ab.a")
    public static int[] field726 = new int[2048];

    @ObfuscatedName("ab.v")
    public static int field731 = 0;

    @ObfuscatedName("ab.c")
    public static int[] field728 = new int[2048];

    @ObfuscatedName("ab.s")
    public static class119 field718 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.m(Ldw;I)V")
    public static final void method582(class122 arg0) {
        arg0.method2637();
        int var1 = client.field381;
        class3 var2 = Statics.field989 = client.field469[var1] = new class3();
        var2.field52 = var1;
        int var3 = arg0.method2640(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field831[0] = var5 - Statics.field2112;
        var2.field815 = (var2.field831[0] << 7) + (var2.method15() << 6);
        var2.field832[0] = var6 - Statics.field2677;
        var2.field805 = (var2.field832[0] << 7) + (var2.method15() << 6);
        Statics.field19 = var2.field55 = var4;
        if (field719[var1] != null) {
            var2.method14(field719[var1]);
        }
        field720 = 0;
        field725[++field720 - 1] = var1;
        field717[var1] = 0;
        field722 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2640(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field724[var7] = (var9 << 28) + (var10 << 14) + var11;
                field715[var7] = 0;
                field726[var7] = -1;
                field723[++field722 - 1] = var7;
                field717[var7] = 0;
            }
        }
        arg0.method2635();
    }

    @ObfuscatedName("aa.l(Ldw;B)V")
    public static final void method755(class122 arg0) {
        int var1 = 0;
        arg0.method2637();
        for (int var2 = 0; var2 < field720; var2++) {
            int var3 = field725[var2];
            if ((field717[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field717[var3] = (byte) (field717[var3] | 0x2);
                } else {
                    int var4 = arg0.method2640(1);
                    if (var4 == 0) {
                        var1 = method3421(arg0);
                        field717[var3] = (byte) (field717[var3] | 0x2);
                    } else {
                        method912(arg0, var3);
                    }
                }
            }
        }
        arg0.method2635();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2637();
        for (int var5 = 0; var5 < field720; var5++) {
            int var6 = field725[var5];
            if ((field717[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field717[var6] = (byte) (field717[var6] | 0x2);
                } else {
                    int var7 = arg0.method2640(1);
                    if (var7 == 0) {
                        var1 = method3421(arg0);
                        field717[var6] = (byte) (field717[var6] | 0x2);
                    } else {
                        method912(arg0, var6);
                    }
                }
            }
        }
        arg0.method2635();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2637();
        for (int var8 = 0; var8 < field722; var8++) {
            int var9 = field723[var8];
            if ((field717[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field717[var9] = (byte) (field717[var9] | 0x2);
                } else {
                    int var10 = arg0.method2640(1);
                    if (var10 == 0) {
                        var1 = method3421(arg0);
                        field717[var9] = (byte) (field717[var9] | 0x2);
                    } else if (method3005(arg0, var9)) {
                        field717[var9] = (byte) (field717[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2635();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2637();
        for (int var11 = 0; var11 < field722; var11++) {
            int var12 = field723[var11];
            if ((field717[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field717[var12] = (byte) (field717[var12] | 0x2);
                } else {
                    int var13 = arg0.method2640(1);
                    if (var13 == 0) {
                        var1 = method3421(arg0);
                        field717[var12] = (byte) (field717[var12] | 0x2);
                    } else if (method3005(arg0, var12)) {
                        field717[var12] = (byte) (field717[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2635();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field720 = 0;
        field722 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field717[var14] = (byte) (field717[var14] >> 1);
            class3 var15 = client.field469[var14];
            if (var15 == null) {
                field723[++field722 - 1] = var14;
            } else {
                field725[++field720 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("gn.y(Ldw;B)I")
    public static int method3421(class122 arg0) {
        int var1 = arg0.method2640(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2640(5);
        } else if (var1 == 2) {
            var2 = arg0.method2640(8);
        } else {
            var2 = arg0.method2640(11);
        }
        return var2;
    }

    @ObfuscatedName("af.u(Ldw;II)V")
    public static void method912(class122 arg0, int arg1) {
        boolean var2 = arg0.method2640(1) == 1;
        if (var2) {
            field728[++field731 - 1] = arg1;
        }
        int var3 = arg0.method2640(2);
        class3 var4 = client.field469[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field53 = -1;
            } else if (client.field381 == arg1) {
                throw new RuntimeException();
            } else {
                field724[arg1] = (Statics.field2677 + var4.field832[0] >> 6) + (Statics.field2112 + var4.field831[0] >> 6 << 14) + (var4.field55 << 28);
                if (var4.field804 == -1) {
                    field715[arg1] = var4.field827;
                } else {
                    field715[arg1] = var4.field804;
                }
                field726[arg1] = var4.field835;
                client.field469[arg1] = null;
                if (arg0.method2640(1) != 0) {
                    method3005(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2640(3);
            int var6 = var4.field831[0];
            int var7 = var4.field832[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (var2) {
                var4.field53 = var6;
                var4.field54 = var7;
            } else {
                var4.field53 = -1;
                var4.method17(var6, var7, field727[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2640(4);
            int var9 = var4.field831[0];
            int var10 = var4.field832[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (var2) {
                var4.field53 = var9;
                var4.field54 = var10;
            } else {
                var4.field53 = -1;
                var4.method17(var9, var10, field727[arg1]);
            }
        } else {
            int var11 = arg0.method2640(1);
            if (var11 == 0) {
                int var12 = arg0.method2640(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field831[0] + var14;
                int var17 = var4.field832[0] + var15;
                if (var2) {
                    var4.field53 = var16;
                    var4.field54 = var17;
                } else {
                    var4.field53 = -1;
                    var4.method17(var16, var17, field727[arg1]);
                }
                var4.field55 = (byte) (var4.field55 + var13 & 0x3);
                if (client.field381 == arg1) {
                    Statics.field19 = var4.field55;
                }
            } else {
                int var18 = arg0.method2640(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2112 + var4.field831[0] + var20 & 0x3FFF) - Statics.field2112;
                int var23 = (Statics.field2677 + var4.field832[0] + var21 & 0x3FFF) - Statics.field2677;
                if (client.field381 == arg1 && (var4.field815 < 1536 || var4.field805 < 1536 || var4.field815 >= 11776 || var4.field805 >= 11776)) {
                    var4.method18(var22, var23);
                    var4.field53 = -1;
                } else if (var2) {
                    var4.field53 = var22;
                    var4.field54 = var23;
                } else {
                    var4.field53 = -1;
                    var4.method17(var22, var23, field727[arg1]);
                }
                var4.field55 = (byte) (var4.field55 + var19 & 0x3);
                if (client.field381 == arg1) {
                    Statics.field19 = var4.field55;
                }
            }
        }
    }

    @ObfuscatedName("fh.k(Ldw;II)Z")
    public static boolean method3005(class122 arg0, int arg1) {
        int var2 = arg0.method2640(2);
        if (var2 == 0) {
            if (arg0.method2640(1) != 0) {
                method3005(arg0, arg1);
            }
            int var3 = arg0.method2640(6);
            int var4 = arg0.method2640(6);
            boolean var5 = arg0.method2640(1) == 1;
            if (var5) {
                field728[++field731 - 1] = arg1;
            }
            if (client.field469[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field469[arg1] = new class3();
            var6.field52 = arg1;
            if (field719[arg1] != null) {
                var6.method14(field719[arg1]);
            }
            var6.field827 = field715[arg1];
            var6.field835 = field726[arg1];
            int var7 = field724[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field834[0] = field727[arg1];
            var6.field55 = (byte) var8;
            var6.method18((var9 << 6) + var3 - Statics.field2112, (var10 << 6) + var4 - Statics.field2677);
            var6.field53 = -1;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2640(2);
            int var12 = field724[arg1];
            field724[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2640(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field724[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field724[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2640(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field724[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field724[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("al.j(Ldw;I)V")
    public static final void method955(class122 arg0) {
        for (int var1 = 0; var1 < field731; var1++) {
            int var2 = field728[var1];
            class3 var3 = client.field469[var2];
            int var4 = arg0.method2562();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method2562() << 8;
            }
            method167(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("c.i(Ldw;ILy;IB)V")
    public static final void method167(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method2562();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2392(var6, 0, var5);
            field719[arg1] = var7;
            arg2.method14(var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = arg0.method2541();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2562();
            client.method8(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field835 = arg0.method2541();
            if (arg2.field835 == 65535) {
                arg2.field835 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field790 = arg0.method2389();
            if (arg2.field790.charAt(0) == '~') {
                arg2.field790 = arg2.field790.substring(1);
                class12.method2685(2, arg2.field47, arg2.field790);
            } else if (Statics.field989 == arg2) {
                class12.method2685(2, arg2.field47, arg2.field790);
            }
            arg2.field816 = false;
            arg2.field794 = 0;
            arg2.field795 = 0;
            arg2.field793 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg0.method2541();
            int var11 = arg0.method2562();
            arg2.method766(var10, var11, client.field423);
            arg2.field799 = client.field423 + 300;
            arg2.field778 = arg0.method2562();
            arg2.field797 = arg0.method2562();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field804 = arg0.method2541();
            if (arg2.field830 == 0) {
                arg2.field827 = arg2.field804;
                arg2.field804 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var12 = arg0.method2541();
            class152 var13 = (class152) class109.method995(class152.method2303(), arg0.method2562());
            boolean var14 = arg0.method2562() == 1;
            int var15 = arg0.method2562();
            int var16 = arg0.field1955;
            if (arg2.field47 != null && arg2.field32 != null) {
                boolean var17 = false;
                if (var13.field2236 && client.method2170(arg2.field47)) {
                    var17 = true;
                }
                if (!var17 && client.field379 == 0 && !arg2.field44) {
                    field718.field1955 = 0;
                    arg0.method2392(field718.field1959, 0, var15);
                    field718.field1955 = 0;
                    String var18 = class223.method3825(Statics.method3064(class222.method580(field718)));
                    arg2.field790 = var18.trim();
                    arg2.field794 = var12 >> 8;
                    arg2.field795 = var12 & 0xFF;
                    arg2.field793 = 150;
                    arg2.field816 = var14;
                    arg2.field785 = Statics.field989 != arg2 && var13.field2236 && client.field477 != "" && var18.toLowerCase().indexOf(client.field477) == -1;
                    int var19;
                    if (var13.field2235) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field2234 == -1) {
                        class12.method2685(var19, arg2.field47, var18);
                    } else {
                        int var21 = var13.field2234;
                        String var22 = "<img=" + var21 + ">";
                        class12.method2685(var19, var22 + arg2.field47, var18);
                    }
                }
            }
            arg0.field1955 = var15 + var16;
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field813 = arg0.method2541();
            int var23 = arg0.method2386();
            arg2.field809 = var23 >> 16;
            arg2.field780 = (var23 & 0xFFFF) + client.field423;
            arg2.field814 = 0;
            arg2.field781 = 0;
            if (arg2.field780 > client.field423) {
                arg2.field814 = -1;
            }
            if (arg2.field813 == 65535) {
                arg2.field813 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field802 = arg0.method2382();
            arg2.field820 = arg0.method2382();
            arg2.field819 = arg0.method2382();
            arg2.field800 = arg0.method2382();
            arg2.field822 = arg0.method2541() + client.field423;
            arg2.field823 = arg0.method2541() + client.field423;
            arg2.field824 = arg0.method2541();
            if (arg2.field53 == -1) {
                arg2.field802 += arg2.field831[0];
                arg2.field820 += arg2.field832[0];
                arg2.field819 += arg2.field831[0];
                arg2.field800 += arg2.field832[0];
                arg2.field830 = 1;
            } else {
                arg2.field802 += arg2.field53;
                arg2.field820 += arg2.field54;
                arg2.field819 += arg2.field53;
                arg2.field800 += arg2.field54;
                arg2.field830 = 0;
            }
            arg2.field825 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            int var24 = arg0.method2541();
            int var25 = arg0.method2562();
            arg2.method766(var24, var25, client.field423);
            arg2.field799 = client.field423 + 300;
            arg2.field778 = arg0.method2562();
            arg2.field797 = arg0.method2562();
        }
        if ((arg3 & 0x100) != 0) {
            field727[arg1] = arg0.method2382();
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method2382();
        }
        if (arg2.field53 == -1) {
            return;
        }
        if (var4 == 127) {
            arg2.method18(arg2.field53, arg2.field54);
            return;
        }
        byte var26;
        if (var4 == -1) {
            var26 = field727[arg1];
        } else {
            var26 = var4;
        }
        arg2.method17(arg2.field53, arg2.field54, var26);
    }
}
