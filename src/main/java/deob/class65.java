package deob;

import java.net.URL;

@ObfuscatedName("cz")
public class class65 {

    @ObfuscatedName("cz.ao")
    public static int field782 = 0;

    @ObfuscatedName("cz.av")
    public static int field781 = 0;

    @ObfuscatedName("cz.aq")
    public static int[] field777 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cz.ap")
    public static int[] field784 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cz.ak")
    public int field785;

    @ObfuscatedName("cz.ax")
    public int field778;

    @ObfuscatedName("cz.as")
    public int field787;

    @ObfuscatedName("cz.ay")
    public String field788;

    @ObfuscatedName("cz.am")
    public String field789;

    @ObfuscatedName("cz.az")
    public int field790;

    @ObfuscatedName("cz.ae")
    public int field791;

    @ObfuscatedName("pq.aj(I)Z")
    public static boolean method6855() {
        try {
            if (Statics.field85 == null) {
                Statics.field85 = Statics.field4254.method2663(new URL(Statics.field2089));
            } else if (Statics.field85.method2693()) {
                byte[] var0 = Statics.field85.method2689();
                class478 var1 = new class478(var0);
                var1.method7908();
                field782 = var1.method7905();
                Statics.field2996 = new class65[field782];
                int var2 = 0;
                while (var2 < field782) {
                    class65 var3 = Statics.field2996[var2] = new class65();
                    var3.field785 = var1.method7905();
                    var3.field778 = var1.method7908();
                    var3.field788 = var1.method7950();
                    var3.field789 = var1.method7950();
                    var3.field790 = var1.method7909();
                    var3.field787 = var1.method7882();
                    var3.field791 = var2++;
                }
                method200(Statics.field2996, 0, Statics.field2996.length - 1, field784, field777);
                Statics.field85 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field85 = null;
        }
        return false;
    }

    @ObfuscatedName("lj.al(III)V")
    public static void method4994(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field784[var5] != arg0) {
                var2[var4] = field784[var5];
                var3[var4] = field777[var5];
                var4++;
            }
        }
        field784 = var2;
        field777 = var3;
        method200(Statics.field2996, 0, Statics.field2996.length - 1, field784, field777);
    }

    @ObfuscatedName("ae.ac([Lcz;II[I[II)V")
    public static void method200(class65[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class65 var8 = arg0[var7];
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
                        var11 = arg0[var6].field791;
                        var12 = var8.field791;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field787;
                        var12 = var8.field787;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1688() ? 1 : 0;
                        var12 = var8.method1688() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field785;
                        var12 = var8.field785;
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
                        var15 = arg0[var5].field791;
                        var16 = var8.field791;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field787;
                        var16 = var8.field787;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1688() ? 1 : 0;
                        var16 = var8.method1688() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field785;
                        var16 = var8.field785;
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
                class65 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method200(arg0, arg1, var6, arg3, arg4);
        method200(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("eo.ab(IZIZI)V")
    public static void method2701(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2996 != null) {
            method142(0, Statics.field2996.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("as.an(IIIZIZI)V")
    public static void method142(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class65 var8 = Statics.field2996[var6];
        Statics.field2996[var6] = Statics.field2996[arg1];
        Statics.field2996[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1088(Statics.field2996[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class65 var10 = Statics.field2996[var9];
                Statics.field2996[var9] = Statics.field2996[var7];
                Statics.field2996[var7++] = var10;
            }
        }
        Statics.field2996[arg1] = Statics.field2996[var7];
        Statics.field2996[var7] = var8;
        method142(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method142(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cc.ao(Lcz;Lcz;IZIZI)I")
    public static int method1088(class65 arg0, class65 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2729(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2729(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("el.av(Lcz;Lcz;IZI)I")
    public static int method2729(class65 arg0, class65 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field787;
            int var5 = arg1.field787;
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
            return arg0.field790 - arg1.field790;
        } else if (arg2 == 3) {
            if (arg0.field789.equals("-")) {
                if (arg1.field789.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field789.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field789.compareTo(arg1.field789);
            }
        } else if (arg2 == 4) {
            return arg0.method1691() ? (arg1.method1691() ? 0 : 1) : (arg1.method1691() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1739() ? (arg1.method1739() ? 0 : 1) : (arg1.method1739() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1690() ? (arg1.method1690() ? 0 : 1) : (arg1.method1690() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1688() ? (arg1.method1688() ? 0 : 1) : (arg1.method1688() ? -1 : 0);
        } else {
            return arg0.field785 - arg1.field785;
        }
    }

    @ObfuscatedName("ry.aq(B)Lcz;")
    public static class65 method7566() {
        field781 = 0;
        return method7757();
    }

    @ObfuscatedName("rf.ap(I)Lcz;")
    public static class65 method7757() {
        return field781 < field782 ? Statics.field2996[++field781 - 1] : null;
    }

    @ObfuscatedName("cz.ar(I)Z")
    public boolean method1688() {
        return (0x1 & this.field778) != 0;
    }

    @ObfuscatedName("cz.ak(I)Z")
    public boolean method1739() {
        return (0x2 & this.field778) != 0;
    }

    @ObfuscatedName("cz.ax(I)Z")
    public boolean method1690() {
        return (0x4 & this.field778) != 0;
    }

    @ObfuscatedName("cz.as(I)Z")
    public boolean method1691() {
        return (0x8 & this.field778) != 0;
    }

    @ObfuscatedName("cz.ay(I)Z")
    public boolean method1692() {
        return (0x20000000 & this.field778) != 0;
    }

    @ObfuscatedName("cz.am(I)Z")
    public boolean method1693() {
        return (0x2000000 & this.field778) != 0;
    }

    @ObfuscatedName("cz.az(I)Z")
    public boolean method1726() {
        return (0x40000000 & this.field778) != 0;
    }

    @ObfuscatedName("cz.ae(B)Z")
    public boolean method1695() {
        return (0x100 & this.field778) != 0;
    }

    @ObfuscatedName("cz.au(B)Z")
    public boolean method1696() {
        return (0x8000000 & this.field778) != 0;
    }
}
