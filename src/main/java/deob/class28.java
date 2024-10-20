package deob;

import java.net.URL;

@ObfuscatedName("as")
public class class28 {

    @ObfuscatedName("as.t")
    public static int field660 = 0;

    @ObfuscatedName("as.n")
    public static int field659 = 0;

    @ObfuscatedName("as.i")
    public static int[] field662 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("as.g")
    public static int[] field661 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("as.k")
    public int field664;

    @ObfuscatedName("as.x")
    public int field655;

    @ObfuscatedName("as.u")
    public int field666;

    @ObfuscatedName("as.j")
    public String field667;

    @ObfuscatedName("as.q")
    public String field668;

    @ObfuscatedName("as.w")
    public int field663;

    @ObfuscatedName("as.b")
    public int field670;

    @ObfuscatedName("o.a(I)Z")
    public static boolean method188() {
        try {
            if (Statics.field2135 == null) {
                Statics.field2135 = new class19(Statics.field2104, new URL(Statics.field2708));
            } else {
                byte[] var0 = Statics.field2135.method194();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field660 = var1.method2584();
                    Statics.field675 = new class28[field660];
                    int var2 = 0;
                    while (var2 < field660) {
                        class28 var3 = Statics.field675[var2] = new class28();
                        var3.field664 = var1.method2584();
                        var3.field655 = var1.method2400();
                        var3.field667 = var1.method2397();
                        var3.field668 = var1.method2397();
                        var3.field663 = var1.method2395();
                        var3.field666 = var1.method2485();
                        var3.field670 = var2++;
                    }
                    method665(Statics.field675, 0, Statics.field675.length - 1, field661, field662);
                    Statics.field2135 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2135 = null;
        }
        return false;
    }

    @ObfuscatedName("b.d(IIB)V")
    public static void method176(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field661[var5] != arg0) {
                var2[var4] = field661[var5];
                var3[var4] = field662[var5];
                var4++;
            }
        }
        field661 = var2;
        field662 = var3;
        method665(Statics.field675, 0, Statics.field675.length - 1, field661, field662);
    }

    @ObfuscatedName("am.v([Las;II[I[II)V")
    public static void method665(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class28 var8 = arg0[var7];
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
                        var11 = arg0[var6].field670;
                        var12 = var8.field670;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field666;
                        var12 = var8.field666;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method614() ? 1 : 0;
                        var12 = var8.method614() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field664;
                        var12 = var8.field664;
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
                        var15 = arg0[var5].field670;
                        var16 = var8.field670;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field666;
                        var16 = var8.field666;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method614() ? 1 : 0;
                        var16 = var8.method614() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field664;
                        var16 = var8.field664;
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
                class28 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method665(arg0, arg1, var6, arg3, arg4);
        method665(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dv.r(IZIZI)V")
    public static void method2271(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field675 != null) {
            method2970(0, Statics.field675.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ev.z(IIIZIZI)V")
    public static void method2970(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field675[var6];
        Statics.field675[var6] = Statics.field675[arg1];
        Statics.field675[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method567(Statics.field675[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class28 var10 = Statics.field675[var9];
                Statics.field675[var9] = Statics.field675[var7];
                Statics.field675[var7++] = var10;
            }
        }
        Statics.field675[arg1] = Statics.field675[var7];
        Statics.field675[var7] = var8;
        method2970(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2970(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("e.t(Las;Las;IZIZB)I")
    public static int method567(class28 arg0, class28 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method103(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method103(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("f.i(B)Las;")
    public static class28 method601() {
        return field659 < field660 ? Statics.field675[++field659 - 1] : null;
    }

    @ObfuscatedName("as.g(I)Z")
    public boolean method614() {
        return (0x1 & this.field655) != 0;
    }

    @ObfuscatedName("as.m(B)Z")
    public boolean method615() {
        return (0x2 & this.field655) != 0;
    }

    @ObfuscatedName("as.k(B)Z")
    public boolean method638() {
        return (0x4 & this.field655) != 0;
    }

    @ObfuscatedName("as.x(B)Z")
    public boolean method644() {
        return (0x8 & this.field655) != 0;
    }

    @ObfuscatedName("as.u(I)Z")
    public boolean method618() {
        return (0x20000000 & this.field655) != 0;
    }

    @ObfuscatedName("as.j(I)Z")
    public boolean method619() {
        return (0x2000000 & this.field655) != 0;
    }
}
