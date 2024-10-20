package deob;

import java.net.URL;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.c")
    public static int field637 = 0;

    @ObfuscatedName("e.f")
    public static int field652 = 0;

    @ObfuscatedName("e.y")
    public static int[] field643 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("e.w")
    public static int[] field640 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("e.v")
    public int field641;

    @ObfuscatedName("e.k")
    public int field642;

    @ObfuscatedName("e.o")
    public int field653;

    @ObfuscatedName("e.u")
    public String field644;

    @ObfuscatedName("e.s")
    public String field645;

    @ObfuscatedName("e.g")
    public int field646;

    @ObfuscatedName("e.x")
    public int field647;

    @ObfuscatedName("ao.h(I)Z")
    public static boolean method614() {
        try {
            if (Statics.field2652 == null) {
                Statics.field2652 = new class19(Statics.field1935, new URL(Statics.field679));
            } else {
                byte[] var0 = Statics.field2652.method183();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field637 = var1.method2322();
                    Statics.field676 = new class26[field637];
                    int var2 = 0;
                    while (var2 < field637) {
                        class26 var3 = Statics.field676[var2] = new class26();
                        var3.field641 = var1.method2322();
                        var3.field642 = var1.method2324();
                        var3.field644 = var1.method2350();
                        var3.field645 = var1.method2350();
                        var3.field646 = var1.method2320();
                        var3.field653 = var1.method2323();
                        var3.field647 = var2++;
                    }
                    method658(Statics.field676, 0, Statics.field676.length - 1, field640, field643);
                    Statics.field2652 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2652 = null;
        }
        return false;
    }

    @ObfuscatedName("f.m(IIB)V")
    public static void method86(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field640[var5] != arg0) {
                var2[var4] = field640[var5];
                var3[var4] = field643[var5];
                var4++;
            }
        }
        field640 = var2;
        field643 = var3;
        method658(Statics.field676, 0, Statics.field676.length - 1, field640, field643);
    }

    @ObfuscatedName("ap.i([Le;II[I[IB)V")
    public static void method658(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field647;
                        var12 = var8.field647;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method577() ? 1 : 0;
                        var12 = var8.method577() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field641;
                        var12 = var8.field641;
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
                        var15 = arg0[var5].field647;
                        var16 = var8.field647;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field653;
                        var16 = var8.field653;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method577() ? 1 : 0;
                        var16 = var8.method577() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field641;
                        var16 = var8.field641;
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
        method658(arg0, arg1, var6, arg3, arg4);
        method658(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("er.q(IIIZIZI)V")
    public static void method2917(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field676[var6];
        Statics.field676[var6] = Statics.field676[arg1];
        Statics.field676[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field676[var9];
            int var11 = Statics.method788(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = Statics.method788(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field676[var9];
                Statics.field676[var9] = Statics.field676[var7];
                Statics.field676[var7++] = var14;
            }
        }
        Statics.field676[arg1] = Statics.field676[var7];
        Statics.field676[var7] = var8;
        method2917(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2917(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fu.c(I)Le;")
    public static class26 method3173() {
        field652 = 0;
        class26 var0;
        if (field652 < field637) {
            var0 = Statics.field676[++field652 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("e.f(I)Z")
    public boolean method577() {
        return (0x1 & this.field642) != 0;
    }

    @ObfuscatedName("e.y(I)Z")
    public boolean method578() {
        return (0x2 & this.field642) != 0;
    }

    @ObfuscatedName("e.w(I)Z")
    public boolean method598() {
        return (0x4 & this.field642) != 0;
    }

    @ObfuscatedName("e.l(S)Z")
    public boolean method586() {
        return (0x8 & this.field642) != 0;
    }
}
