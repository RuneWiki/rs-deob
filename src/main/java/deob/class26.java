package deob;

import java.net.URL;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.y")
    public static int field628 = 0;

    @ObfuscatedName("e.r")
    public static int field634 = 0;

    @ObfuscatedName("e.c")
    public static int[] field648 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("e.l")
    public static int[] field640 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("e.p")
    public int field637;

    @ObfuscatedName("e.n")
    public int field641;

    @ObfuscatedName("e.w")
    public int field639;

    @ObfuscatedName("e.z")
    public String field638;

    @ObfuscatedName("e.k")
    public String field647;

    @ObfuscatedName("e.o")
    public int field642;

    @ObfuscatedName("e.t")
    public int field643;

    @ObfuscatedName("ci.b(I)Z")
    public static boolean method1779() {
        try {
            if (Statics.field2284 == null) {
                Statics.field2284 = new class19(Statics.field925, new URL(Statics.field1635));
            } else {
                byte[] var0 = Statics.field2284.method180();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field628 = var1.method2346();
                    Statics.field636 = new class26[field628];
                    int var2 = 0;
                    while (var2 < field628) {
                        class26 var3 = Statics.field636[var2] = new class26();
                        var3.field637 = var1.method2346();
                        var3.field641 = var1.method2349();
                        var3.field638 = var1.method2352();
                        var3.field647 = var1.method2352();
                        var3.field642 = var1.method2344();
                        var3.field639 = var1.method2347();
                        var3.field643 = var2++;
                    }
                    method174(Statics.field636, 0, Statics.field636.length - 1, field640, field648);
                    Statics.field2284 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2284 = null;
        }
        return false;
    }

    @ObfuscatedName("cx.g(III)V")
    public static void method2049(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field640[var5] != arg0) {
                var2[var4] = field640[var5];
                var3[var4] = field648[var5];
                var4++;
            }
        }
        field640 = var2;
        field648 = var3;
        method174(Statics.field636, 0, Statics.field636.length - 1, field640, field648);
    }

    @ObfuscatedName("t.j([Le;II[I[II)V")
    public static void method174(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field643;
                        var12 = var8.field643;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field639;
                        var12 = var8.field639;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method624() ? 1 : 0;
                        var12 = var8.method624() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field637;
                        var12 = var8.field637;
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
                        var15 = arg0[var5].field643;
                        var16 = var8.field643;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field639;
                        var16 = var8.field639;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method624() ? 1 : 0;
                        var16 = var8.method624() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field637;
                        var16 = var8.field637;
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
        method174(arg0, arg1, var6, arg3, arg4);
        method174(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("by.d(IZIZI)V")
    public static void method1545(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field636 != null) {
            method1944(0, Statics.field636.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cq.x(IIIZIZB)V")
    public static void method1944(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field636[var6];
        Statics.field636[var6] = Statics.field636[arg1];
        Statics.field636[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method54(Statics.field636[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field636[var9];
                Statics.field636[var9] = Statics.field636[var7];
                Statics.field636[var7++] = var10;
            }
        }
        Statics.field636[arg1] = Statics.field636[var7];
        Statics.field636[var7] = var8;
        method1944(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1944(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("y.y(Le;Le;IZIZB)I")
    public static int method54(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method728(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method728(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ac.r(Le;Le;IZI)I")
    public static int method728(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field639;
            int var5 = arg1.field639;
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
            return arg0.field642 - arg1.field642;
        } else if (arg2 == 3) {
            if (arg0.field647.equals("-")) {
                if (arg1.field647.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field647.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field647.compareTo(arg1.field647);
            }
        } else if (arg2 == 4) {
            return arg0.method591() ? (arg1.method591() ? 0 : 1) : (arg1.method591() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method596() ? (arg1.method596() ? 0 : 1) : (arg1.method596() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method624() ? (arg1.method624() ? 0 : 1) : (arg1.method624() ? -1 : 0);
        } else {
            return arg0.field637 - arg1.field637;
        }
    }

    @ObfuscatedName("cx.c(I)Le;")
    public static class26 method2045() {
        return field634 < field628 ? Statics.field636[++field634 - 1] : null;
    }

    @ObfuscatedName("e.l(I)Z")
    public boolean method624() {
        return (0x1 & this.field641) != 0;
    }

    @ObfuscatedName("e.u(B)Z")
    public boolean method596() {
        return (0x2 & this.field641) != 0;
    }

    @ObfuscatedName("e.p(B)Z")
    public boolean method608() {
        return (0x4 & this.field641) != 0;
    }

    @ObfuscatedName("e.n(B)Z")
    public boolean method591() {
        return (0x8 & this.field641) != 0;
    }

    @ObfuscatedName("e.w(I)Z")
    public boolean method611() {
        return (0x20000000 & this.field641) != 0;
    }

    @ObfuscatedName("e.z(B)Z")
    public boolean method597() {
        return (0x2000000 & this.field641) != 0;
    }
}
