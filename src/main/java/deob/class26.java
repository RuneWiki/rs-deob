package deob;

import java.net.URL;

@ObfuscatedName("v")
public class class26 {

    @ObfuscatedName("v.u")
    public static int field629 = 0;

    @ObfuscatedName("v.o")
    public static int field630 = 0;

    @ObfuscatedName("v.b")
    public static int[] field628 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("v.k")
    public static int[] field632 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("v.l")
    public int field633;

    @ObfuscatedName("v.t")
    public int field634;

    @ObfuscatedName("v.i")
    public int field635;

    @ObfuscatedName("v.r")
    public String field636;

    @ObfuscatedName("v.m")
    public String field642;

    @ObfuscatedName("v.e")
    public int field638;

    @ObfuscatedName("v.h")
    public int field639;

    @ObfuscatedName("aa.s(S)Z")
    public static boolean method714() {
        try {
            if (Statics.field1538 == null) {
                Statics.field1538 = new class19(Statics.field879, new URL(Statics.field482));
            } else {
                byte[] var0 = Statics.field1538.method202();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field629 = var1.method2430();
                    Statics.field637 = new class26[field629];
                    int var2 = 0;
                    while (var2 < field629) {
                        class26 var3 = Statics.field637[var2] = new class26();
                        var3.field633 = var1.method2430();
                        var3.field634 = var1.method2343();
                        var3.field636 = var1.method2346();
                        var3.field642 = var1.method2346();
                        var3.field638 = var1.method2338();
                        var3.field635 = var1.method2341();
                        var3.field639 = var2++;
                    }
                    method98(Statics.field637, 0, Statics.field637.length - 1, field632, field628);
                    Statics.field1538 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1538 = null;
        }
        return false;
    }

    @ObfuscatedName("p.j(III)V")
    public static void method28(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field632[var5] != arg0) {
                var2[var4] = field632[var5];
                var3[var4] = field628[var5];
                var4++;
            }
        }
        field632 = var2;
        field628 = var3;
        method98(Statics.field637, 0, Statics.field637.length - 1, field632, field628);
    }

    @ObfuscatedName("b.p([Lv;II[I[II)V")
    public static void method98(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field639;
                        var12 = var8.field639;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field635;
                        var12 = var8.field635;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method575() ? 1 : 0;
                        var12 = var8.method575() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field633;
                        var12 = var8.field633;
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
                        var15 = arg0[var5].field639;
                        var16 = var8.field639;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field635;
                        var16 = var8.field635;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method575() ? 1 : 0;
                        var16 = var8.method575() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field633;
                        var16 = var8.field633;
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
        method98(arg0, arg1, var6, arg3, arg4);
        method98(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bo.x(IZIZI)V")
    public static void method1556(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field637 != null) {
            method2270(0, Statics.field637.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dr.d(IIIZIZI)V")
    public static void method2270(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field637[var6];
        Statics.field637[var6] = Statics.field637[arg1];
        Statics.field637[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field637[var9];
            int var11 = Statics.method1154(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = Statics.method1154(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field637[var9];
                Statics.field637[var9] = Statics.field637[var7];
                Statics.field637[var7++] = var14;
            }
        }
        Statics.field637[arg1] = Statics.field637[var7];
        Statics.field637[var7] = var8;
        method2270(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2270(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bf.o(I)Lv;")
    public static class26 method1162() {
        return field630 < field629 ? Statics.field637[++field630 - 1] : null;
    }

    @ObfuscatedName("v.b(I)Z")
    public boolean method575() {
        return (0x1 & this.field634) != 0;
    }

    @ObfuscatedName("v.k(I)Z")
    public boolean method576() {
        return (0x2 & this.field634) != 0;
    }

    @ObfuscatedName("v.c(B)Z")
    public boolean method577() {
        return (0x4 & this.field634) != 0;
    }

    @ObfuscatedName("v.l(I)Z")
    public boolean method578() {
        return (0x8 & this.field634) != 0;
    }

    @ObfuscatedName("v.t(I)Z")
    public boolean method579() {
        return (0x20000000 & this.field634) != 0;
    }

    @ObfuscatedName("v.i(I)Z")
    public boolean method580() {
        return (0x2000000 & this.field634) != 0;
    }
}
