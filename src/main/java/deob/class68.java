package deob;

import java.net.URL;

@ObfuscatedName("cc")
public class class68 {

    @ObfuscatedName("cc.ap")
    public static int field813 = 0;

    @ObfuscatedName("cc.ab")
    public static int field820 = 0;

    @ObfuscatedName("cc.ak")
    public static int[] field815 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cc.ae")
    public static int[] field810 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cc.ao")
    public int field818;

    @ObfuscatedName("cc.aa")
    public int field819;

    @ObfuscatedName("cc.aj")
    public int field821;

    @ObfuscatedName("cc.ad")
    public String field817;

    @ObfuscatedName("cc.ac")
    public String field822;

    @ObfuscatedName("cc.ag")
    public int field823;

    @ObfuscatedName("cc.ar")
    public int field824;

    @ObfuscatedName("tc.at(I)Z")
    public static boolean method8069() {
        try {
            if (Statics.field809 == null) {
                Statics.field809 = Statics.field337.method2663(new URL(Statics.field5099));
            } else if (Statics.field809.method2687()) {
                byte[] var0 = Statics.field809.method2688();
                class501 var1 = new class501(var0);
                var1.method8134();
                field813 = var1.method8195();
                Statics.field812 = new class68[field813];
                int var2 = 0;
                while (var2 < field813) {
                    class68 var3 = Statics.field812[var2] = new class68();
                    var3.field818 = var1.method8195();
                    var3.field819 = var1.method8134();
                    var3.field817 = var1.method8253();
                    var3.field822 = var1.method8253();
                    var3.field823 = var1.method8129();
                    var3.field821 = var1.method8268();
                    var3.field824 = var2++;
                }
                Statics.method3072(Statics.field812, 0, Statics.field812.length - 1, field810, field815);
                Statics.field809 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field809 = null;
        }
        return false;
    }

    @ObfuscatedName("cm.an(III)V")
    public static void method1079(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field810[var5] != arg0) {
                var2[var4] = field810[var5];
                var3[var4] = field815[var5];
                var4++;
            }
        }
        field810 = var2;
        field815 = var3;
        Statics.method3072(Statics.field812, 0, Statics.field812.length - 1, field810, field815);
    }

    @ObfuscatedName("jz.ax(IIIZIZI)V")
    public static void method4551(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class68 var8 = Statics.field812[var6];
        Statics.field812[var6] = Statics.field812[arg1];
        Statics.field812[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class68 var10 = Statics.field812[var9];
            int var11 = method5408(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method5408(var10, var8, arg4, arg5);
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
                class68 var14 = Statics.field812[var9];
                Statics.field812[var9] = Statics.field812[var7];
                Statics.field812[var7++] = var14;
            }
        }
        Statics.field812[arg1] = Statics.field812[var7];
        Statics.field812[var7] = var8;
        method4551(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4551(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("mg.ap(Lcc;Lcc;IZI)I")
    public static int method5408(class68 arg0, class68 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field821;
            int var5 = arg1.field821;
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
            return arg0.field823 - arg1.field823;
        } else if (arg2 == 3) {
            if (arg0.field822.equals("-")) {
                if (arg1.field822.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field822.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field822.compareTo(arg1.field822);
            }
        } else if (arg2 == 4) {
            return arg0.method1663() ? (arg1.method1663() ? 0 : 1) : (arg1.method1663() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1661() ? (arg1.method1661() ? 0 : 1) : (arg1.method1661() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1662() ? (arg1.method1662() ? 0 : 1) : (arg1.method1662() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1659() ? (arg1.method1659() ? 0 : 1) : (arg1.method1659() ? -1 : 0);
        } else {
            return arg0.field818 - arg1.field818;
        }
    }

    @ObfuscatedName("ah.ab(I)Lcc;")
    public static class68 method263() {
        field820 = 0;
        return method3198();
    }

    @ObfuscatedName("gc.ak(B)Lcc;")
    public static class68 method3198() {
        return field820 < field813 ? Statics.field812[++field820 - 1] : null;
    }

    @ObfuscatedName("cc.ae(B)Z")
    public boolean method1659() {
        return (0x1 & this.field819) != 0;
    }

    @ObfuscatedName("cc.af(I)Z")
    public boolean method1682() {
        return (0x10000 & this.field819) != 0;
    }

    @ObfuscatedName("cc.ao(I)Z")
    public boolean method1661() {
        return (0x2 & this.field819) != 0;
    }

    @ObfuscatedName("cc.aa(B)Z")
    public boolean method1662() {
        return (0x4 & this.field819) != 0;
    }

    @ObfuscatedName("cc.aj(I)Z")
    public boolean method1663() {
        return (0x8 & this.field819) != 0;
    }

    @ObfuscatedName("cc.ad(I)Z")
    public boolean method1658() {
        return (0x20000000 & this.field819) != 0;
    }

    @ObfuscatedName("cc.ac(B)Z")
    public boolean method1708() {
        return (0x2000000 & this.field819) != 0;
    }

    @ObfuscatedName("cc.ag(S)Z")
    public boolean method1666() {
        return (0x40000000 & this.field819) != 0;
    }

    @ObfuscatedName("cc.ar(I)Z")
    public boolean method1667() {
        return (0x100 & this.field819) != 0;
    }

    @ObfuscatedName("cc.ah(B)Z")
    public boolean method1668() {
        return (0x8000000 & this.field819) != 0;
    }
}
