package deob;

import java.net.URL;

@ObfuscatedName("ct")
public class class70 {

    @ObfuscatedName("ct.ay")
    public static int field811 = 0;

    @ObfuscatedName("ct.as")
    public static int field819 = 0;

    @ObfuscatedName("ct.ae")
    public static int[] field806 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ct.am")
    public static int[] field814 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ct.au")
    public int field813;

    @ObfuscatedName("ct.an")
    public int field812;

    @ObfuscatedName("ct.ao")
    public int field817;

    @ObfuscatedName("ct.af")
    public String field816;

    @ObfuscatedName("ct.ar")
    public String field815;

    @ObfuscatedName("ct.ab")
    public int field820;

    @ObfuscatedName("ct.az")
    public int field821;

    @ObfuscatedName("ct.ag")
    public String field822;

    @ObfuscatedName("ma.ap(I)Z")
    public static boolean method5981() {
        try {
            if (Statics.field4999 == null) {
                Statics.field4999 = Statics.field3067.method3078(new URL(Statics.field448));
            } else if (Statics.field4999.method3110()) {
                byte[] var0 = Statics.field4999.method3111();
                class558 var1 = new class558(var0);
                var1.method9264();
                field811 = var1.method9260();
                Statics.field810 = new class70[field811];
                int var2 = 0;
                while (var2 < field811) {
                    class70 var3 = Statics.field810[var2] = new class70();
                    var3.field813 = var1.method9260();
                    var3.field812 = var1.method9264();
                    var3.field816 = var1.method9269();
                    var3.field815 = var1.method9269();
                    var3.field820 = var1.method9258();
                    var3.field817 = var1.method9261();
                    var3.field821 = var2++;
                }
                Statics.method3225(Statics.field810, 0, Statics.field810.length - 1, field814, field806);
                Statics.field4999 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field4999 = null;
        }
        return false;
    }

    @ObfuscatedName("gf.aw(III)V")
    public static void method3526(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field814[var5] != arg0) {
                var2[var4] = field814[var5];
                var3[var4] = field806[var5];
                var4++;
            }
        }
        field814 = var2;
        field806 = var3;
        Statics.method3225(Statics.field810, 0, Statics.field810.length - 1, field814, field806);
    }

    @ObfuscatedName("qo.aj(IZIZI)V")
    public static void method7490(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field810 != null) {
            Statics.method1231(0, Statics.field810.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ah.ay(Lct;Lct;IZIZI)I")
    public static int method381(class70 arg0, class70 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method6881(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method6881(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("oh.as(Lct;Lct;IZI)I")
    public static int method6881(class70 arg0, class70 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field817;
            int var5 = arg1.field817;
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
            return arg0.field820 - arg1.field820;
        } else if (arg2 == 3) {
            if (arg0.field815.equals("-")) {
                if (arg1.field815.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field815.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field815.compareTo(arg1.field815);
            }
        } else if (arg2 == 4) {
            return arg0.method1880() ? (arg1.method1880() ? 0 : 1) : (arg1.method1880() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1878() ? (arg1.method1878() ? 0 : 1) : (arg1.method1878() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1879() ? (arg1.method1879() ? 0 : 1) : (arg1.method1879() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1917() ? (arg1.method1917() ? 0 : 1) : (arg1.method1917() ? -1 : 0);
        } else {
            return arg0.field813 - arg1.field813;
        }
    }

    @ObfuscatedName("ui.ae(B)Lct;")
    public static class70 method9125() {
        field819 = 0;
        return method3587();
    }

    @ObfuscatedName("ge.am(B)Lct;")
    public static class70 method3587() {
        return field819 < field811 ? Statics.field810[++field819 - 1] : null;
    }

    @ObfuscatedName("ct.at(I)Z")
    public boolean method1917() {
        return (class553.field5434.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.au(B)Z")
    public boolean method1877() {
        return (class553.field5431.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.an(I)Z")
    public boolean method1878() {
        return (class553.field5416.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.ao(I)Z")
    public boolean method1879() {
        return (class553.field5417.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.af(I)Z")
    public boolean method1880() {
        return (class553.field5426.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.ar(I)Z")
    public boolean method1881() {
        return (class553.field5444.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.ab(B)Z")
    public boolean method1882() {
        return (class553.field5440.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.az(I)Z")
    public boolean method1883() {
        return (class553.field5445.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.ag(S)Z")
    public boolean method1884() {
        return (class553.field5423.method37() & this.field812) != 0;
    }

    @ObfuscatedName("ct.ad(I)Z")
    public boolean method1901() {
        return (class553.field5418.method37() & this.field812) != 0;
    }
}
