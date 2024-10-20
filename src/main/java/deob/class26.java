package deob;

import java.net.URL;

@ObfuscatedName("p")
public class class26 {

    @ObfuscatedName("p.d")
    public static int field622 = 0;

    @ObfuscatedName("p.l")
    public static int field630 = 0;

    @ObfuscatedName("p.b")
    public static int[] field624 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("p.j")
    public static int[] field625 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("p.i")
    public int field626;

    @ObfuscatedName("p.g")
    public int field627;

    @ObfuscatedName("p.t")
    public int field632;

    @ObfuscatedName("p.e")
    public String field629;

    @ObfuscatedName("p.q")
    public String field628;

    @ObfuscatedName("p.u")
    public int field631;

    @ObfuscatedName("p.r")
    public int field620;

    @ObfuscatedName("r.k(B)Z")
    public static boolean method175() {
        try {
            if (Statics.field245 == null) {
                Statics.field245 = new class19(Statics.field675, new URL(Statics.field1959));
            } else {
                byte[] var0 = Statics.field245.method187();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field622 = var1.method2332();
                    Statics.field3197 = new class26[field622];
                    int var2 = 0;
                    while (var2 < field622) {
                        class26 var3 = Statics.field3197[var2] = new class26();
                        var3.field626 = var1.method2332();
                        var3.field627 = var1.method2415();
                        var3.field629 = var1.method2337();
                        var3.field628 = var1.method2337();
                        var3.field631 = var1.method2330();
                        var3.field632 = var1.method2333();
                        var3.field620 = var2++;
                    }
                    method3251(Statics.field3197, 0, Statics.field3197.length - 1, field625, field624);
                    Statics.field245 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field245 = null;
        }
        return false;
    }

    @ObfuscatedName("w.h(III)V")
    public static void method560(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field625[var5] != arg0) {
                var2[var4] = field625[var5];
                var3[var4] = field624[var5];
                var4++;
            }
        }
        field625 = var2;
        field624 = var3;
        method3251(Statics.field3197, 0, Statics.field3197.length - 1, field625, field624);
    }

    @ObfuscatedName("fs.o([Lp;II[I[II)V")
    public static void method3251(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class26 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field620;
                        var12 = var8.field620;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field632;
                        var12 = var8.field632;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method562() ? 1 : 0;
                        var12 = var8.method562() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field626;
                        var12 = var8.field626;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field620;
                        var16 = var8.field620;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field632;
                        var16 = var8.field632;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method562() ? 1 : 0;
                        var16 = var8.method562() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field626;
                        var16 = var8.field626;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3251(arg0, arg1, var6, arg3, arg4);
        method3251(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ci.z(IIIZIZI)V")
    public static void method2047(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field3197[var6];
        Statics.field3197[var6] = Statics.field3197[arg1];
        Statics.field3197[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field3197[var9];
            int var11 = method902(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method902(var10, var8, arg4, arg5);
                    if (arg5) {
                        var12 = -var13;
                    } else {
                        var12 = var13;
                    }
                }
            } else if (arg3) {
                var12 = -var11;
            } else {
                var12 = var11;
            }
            if (var12 <= 0) {
                class26 var14 = Statics.field3197[var9];
                Statics.field3197[var9] = Statics.field3197[var7];
                Statics.field3197[var7++] = var14;
            }
        }
        Statics.field3197[arg1] = Statics.field3197[var7];
        Statics.field3197[var7] = var8;
        method2047(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2047(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ai.c(Lp;Lp;IZI)I")
    public static int method902(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field632;
            int var5 = arg1.field632;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field631 - arg1.field631;
        } else if (arg2 == 3) {
            if (arg0.field628.equals("-")) {
                if (arg1.field628.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field628.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field628.compareTo(arg1.field628);
            }
        } else if (arg2 == 4) {
            return arg0.method565() ? (arg1.method565() ? 0 : 1) : (arg1.method565() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method563() ? (arg1.method563() ? 0 : 1) : (arg1.method563() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method564() ? (arg1.method564() ? 0 : 1) : (arg1.method564() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method562() ? (arg1.method562() ? 0 : 1) : (arg1.method562() ? -1 : 0);
        } else {
            return arg0.field626 - arg1.field626;
        }
    }

    @ObfuscatedName("p.d(I)Z")
    public boolean method562() {
        return (0x1 & this.field627) != 0;
    }

    @ObfuscatedName("p.l(B)Z")
    public boolean method563() {
        return (0x2 & this.field627) != 0;
    }

    @ObfuscatedName("p.b(B)Z")
    public boolean method564() {
        return (0x4 & this.field627) != 0;
    }

    @ObfuscatedName("p.j(B)Z")
    public boolean method565() {
        return (0x8 & this.field627) != 0;
    }

    @ObfuscatedName("p.f(I)Z")
    public boolean method566() {
        return (0x20000000 & this.field627) != 0;
    }
}
