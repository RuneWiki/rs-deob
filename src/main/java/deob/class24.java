package deob;

import java.net.URL;

@ObfuscatedName("u")
public class class24 {

    @ObfuscatedName("u.e")
    public static int field611 = 0;

    @ObfuscatedName("u.q")
    public static int field612 = 0;

    @ObfuscatedName("u.z")
    public static int[] field627 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("u.v")
    public static int[] field607 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("u.f")
    public int field616;

    @ObfuscatedName("u.i")
    public int field617;

    @ObfuscatedName("u.w")
    public int field609;

    @ObfuscatedName("u.l")
    public String field618;

    @ObfuscatedName("u.j")
    public String field625;

    @ObfuscatedName("u.s")
    public int field608;

    @ObfuscatedName("u.r")
    public int field622;

    @ObfuscatedName("af.y(I)Z")
    public static boolean method758() {
        try {
            if (Statics.field615 == null) {
                Statics.field615 = new class18(Statics.field1483, new URL(Statics.field2549));
            } else {
                byte[] var0 = Statics.field615.method163();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field611 = var1.method2339();
                    Statics.field610 = new class24[field611];
                    int var2 = 0;
                    while (var2 < field611) {
                        class24 var3 = Statics.field610[var2] = new class24();
                        var3.field616 = var1.method2339();
                        var3.field617 = var1.method2165();
                        var3.field618 = var1.method2170();
                        var3.field625 = var1.method2170();
                        var3.field608 = var1.method2205();
                        var3.field609 = var1.method2163();
                        var3.field622 = var2++;
                    }
                    method2785(Statics.field610, 0, Statics.field610.length - 1, field607, field627);
                    Statics.field615 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field615 = null;
        }
        return false;
    }

    @ObfuscatedName("fy.k(III)V")
    public static void method3309(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field607[var5] != arg0) {
                var2[var4] = field607[var5];
                var3[var4] = field627[var5];
                var4++;
            }
        }
        field607 = var2;
        field627 = var3;
        method2785(Statics.field610, 0, Statics.field610.length - 1, field607, field627);
    }

    @ObfuscatedName("ee.g([Lu;II[I[II)V")
    public static void method2785(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field622;
                        var12 = var8.field622;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field609;
                        var12 = var8.field609;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method534() ? 1 : 0;
                        var12 = var8.method534() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field616;
                        var12 = var8.field616;
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
                        var15 = arg0[var5].field622;
                        var16 = var8.field622;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field609;
                        var16 = var8.field609;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method534() ? 1 : 0;
                        var16 = var8.method534() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field616;
                        var16 = var8.field616;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2785(arg0, arg1, var6, arg3, arg4);
        method2785(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("t.n(IZIZB)V")
    public static void method30(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field610 != null) {
            method2851(0, Statics.field610.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ea.t(IIIZIZI)V")
    public static void method2851(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class24 var8 = Statics.field610[var6];
        Statics.field610[var6] = Statics.field610[arg1];
        Statics.field610[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method121(Statics.field610[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class24 var10 = Statics.field610[var9];
                Statics.field610[var9] = Statics.field610[var7];
                Statics.field610[var7++] = var10;
            }
        }
        Statics.field610[arg1] = Statics.field610[var7];
        Statics.field610[var7] = var8;
        method2851(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2851(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("f.e(Lu;Lu;IZIZI)I")
    public static int method121(class24 arg0, class24 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method2(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method2(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("u.z(I)Z")
    public boolean method534() {
        return (0x1 & this.field617) != 0;
    }

    @ObfuscatedName("u.v(I)Z")
    public boolean method543() {
        return (0x2 & this.field617) != 0;
    }

    @ObfuscatedName("u.b(I)Z")
    public boolean method536() {
        return (0x4 & this.field617) != 0;
    }

    @ObfuscatedName("u.f(I)Z")
    public boolean method537() {
        return (0x8 & this.field617) != 0;
    }
}
