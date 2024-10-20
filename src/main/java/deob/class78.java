package deob;

import java.net.URL;

@ObfuscatedName("bq")
public class class78 {

    @ObfuscatedName("bq.y")
    public static int field1221 = 0;

    @ObfuscatedName("bq.k")
    public static int field1211 = 0;

    @ObfuscatedName("bq.s")
    public static int[] field1212 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bq.p")
    public static int[] field1210 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bq.m")
    public int field1215;

    @ObfuscatedName("bq.h")
    public int field1216;

    @ObfuscatedName("bq.t")
    public int field1217;

    @ObfuscatedName("bq.i")
    public String field1218;

    @ObfuscatedName("bq.u")
    public String field1219;

    @ObfuscatedName("bq.q")
    public int field1220;

    @ObfuscatedName("bq.v")
    public int field1214;

    @ObfuscatedName("i.d(I)Z")
    public static boolean method74() {
        try {
            if (Statics.field1208 == null) {
                Statics.field1208 = Statics.field578.method2910(new URL(Statics.field614));
            } else if (Statics.field1208.method2922()) {
                byte[] var0 = Statics.field1208.method2921();
                class195 var1 = new class195(var0);
                var1.method3264();
                field1221 = var1.method3269();
                Statics.field1209 = new class78[field1221];
                int var2 = 0;
                while (var2 < field1221) {
                    class78 var3 = Statics.field1209[var2] = new class78();
                    var3.field1215 = var1.method3269();
                    var3.field1216 = var1.method3264();
                    var3.field1218 = var1.method3268();
                    var3.field1219 = var1.method3268();
                    var3.field1220 = var1.method3330();
                    var3.field1217 = var1.method3262();
                    var3.field1214 = var2++;
                }
                Statics.method2521(Statics.field1209, 0, Statics.field1209.length - 1, field1210, field1212);
                Statics.field1208 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1208 = null;
        }
        return false;
    }

    @ObfuscatedName("dv.z(III)V")
    public static void method2506(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1210[var5] != arg0) {
                var2[var4] = field1210[var5];
                var3[var4] = field1212[var5];
                var4++;
            }
        }
        field1210 = var2;
        field1212 = var3;
        Statics.method2521(Statics.field1209, 0, Statics.field1209.length - 1, field1210, field1212);
    }

    @ObfuscatedName("cx.r(IZIZI)V")
    public static void method1794(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1209 != null) {
            method2169(0, Statics.field1209.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dn.e(IIIZIZI)V")
    public static void method2169(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class78 var8 = Statics.field1209[var6];
        Statics.field1209[var6] = Statics.field1209[arg1];
        Statics.field1209[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class78 var10 = Statics.field1209[var9];
            int var11 = method145(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method145(var10, var8, arg4, arg5);
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
                class78 var14 = Statics.field1209[var9];
                Statics.field1209[var9] = Statics.field1209[var7];
                Statics.field1209[var7++] = var14;
            }
        }
        Statics.field1209[arg1] = Statics.field1209[var7];
        Statics.field1209[var7] = var8;
        method2169(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2169(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("j.y(Lbq;Lbq;IZI)I")
    public static int method145(class78 arg0, class78 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1217;
            int var5 = arg1.field1217;
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
            return arg0.field1220 - arg1.field1220;
        } else if (arg2 == 3) {
            if (arg0.field1219.equals("-")) {
                if (arg1.field1219.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1219.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1219.compareTo(arg1.field1219);
            }
        } else if (arg2 == 4) {
            return arg0.method1543() ? (arg1.method1543() ? 0 : 1) : (arg1.method1543() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1525() ? (arg1.method1525() ? 0 : 1) : (arg1.method1525() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1526() ? (arg1.method1526() ? 0 : 1) : (arg1.method1526() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1524() ? (arg1.method1524() ? 0 : 1) : (arg1.method1524() ? -1 : 0);
        } else {
            return arg0.field1215 - arg1.field1215;
        }
    }

    @ObfuscatedName("b.k(B)Lbq;")
    public static class78 method123() {
        field1211 = 0;
        return method3157();
    }

    @ObfuscatedName("fk.s(B)Lbq;")
    public static class78 method3157() {
        return field1211 < field1221 ? Statics.field1209[++field1211 - 1] : null;
    }

    @ObfuscatedName("bq.x(I)Z")
    public boolean method1524() {
        return (0x1 & this.field1216) != 0;
    }

    @ObfuscatedName("bq.h(B)Z")
    public boolean method1525() {
        return (0x2 & this.field1216) != 0;
    }

    @ObfuscatedName("bq.t(I)Z")
    public boolean method1526() {
        return (0x4 & this.field1216) != 0;
    }

    @ObfuscatedName("bq.i(B)Z")
    public boolean method1543() {
        return (0x8 & this.field1216) != 0;
    }

    @ObfuscatedName("bq.u(I)Z")
    public boolean method1528() {
        return (0x20000000 & this.field1216) != 0;
    }

    @ObfuscatedName("bq.q(I)Z")
    public boolean method1553() {
        return (0x2000000 & this.field1216) != 0;
    }
}
