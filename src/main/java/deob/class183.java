package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gn")
public class class183 extends class382 {

    @ObfuscatedName("gn.c")
    public static boolean field2085 = false;

    @ObfuscatedName("gn.t")
    public static class249 field2078 = new class249(64);

    @ObfuscatedName("gn.s")
    public static class249 field2094 = new class249(100);

    @ObfuscatedName("gn.j")
    public static class249 field2087 = new class249(100);

    @ObfuscatedName("gn.w")
    public int field2080 = -1;

    @ObfuscatedName("gn.n")
    public Map field2076;

    @ObfuscatedName("gn.r")
    public int field2083 = 0;

    @ObfuscatedName("gn.o")
    public int field2084 = 0;

    @ObfuscatedName("gn.v")
    public int[] field2099;

    @ObfuscatedName("gn.d")
    public int[] field2086;

    @ObfuscatedName("gn.h")
    public int[] field2081;

    @ObfuscatedName("gn.g")
    public int[] field2088;

    @ObfuscatedName("gn.e")
    public int field2089 = -1;

    @ObfuscatedName("gn.a")
    public int[] field2090;

    @ObfuscatedName("gn.u")
    public boolean[] field2082;

    @ObfuscatedName("gn.k")
    public boolean field2092 = false;

    @ObfuscatedName("gn.f")
    public int field2093 = 5;

    @ObfuscatedName("gn.l")
    public int field2091 = -1;

    @ObfuscatedName("gn.q")
    public int field2095 = -1;

    @ObfuscatedName("gn.x")
    public int field2096 = 99;

    @ObfuscatedName("gn.z")
    public int field2097 = -1;

    @ObfuscatedName("gn.i")
    public int field2098 = -1;

    @ObfuscatedName("gn.y")
    public int field2079 = 2;

    @ObfuscatedName("dm.c(II)Lgn;")
    public static class183 method2402(int arg0) {
        class183 var1 = (class183) field2078.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field163.method5053(12, arg0);
        class183 var3 = new class183();
        if (var2 != null) {
            var3.method3330(new class419(var2));
        }
        var3.method3353();
        field2078.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.b(Lpi;B)V")
    public void method3330(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3367(arg0, var2);
        }
    }

    @ObfuscatedName("gn.p(Lpi;IB)V")
    public void method3367(class419 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6672();
            this.field2081 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2081[var4] = arg0.method6672();
            }
            this.field2099 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2099[var5] = arg0.method6672();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2099[var6] += arg0.method6672() << 16;
            }
        } else if (arg1 == 2) {
            this.field2089 = arg0.method6672();
        } else if (arg1 == 3) {
            int var7 = arg0.method6781();
            this.field2090 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2090[var8] = arg0.method6781();
            }
            this.field2090[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2092 = true;
        } else if (arg1 == 5) {
            this.field2093 = arg0.method6781();
        } else if (arg1 == 6) {
            this.field2091 = arg0.method6672();
        } else if (arg1 == 7) {
            this.field2095 = arg0.method6672();
        } else if (arg1 == 8) {
            this.field2096 = arg0.method6781();
        } else if (arg1 == 9) {
            this.field2097 = arg0.method6781();
        } else if (arg1 == 10) {
            this.field2098 = arg0.method6781();
        } else if (arg1 == 11) {
            this.field2079 = arg0.method6781();
        } else if (arg1 == 12) {
            int var9 = arg0.method6781();
            this.field2086 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2086[var10] = arg0.method6672();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2086[var11] += arg0.method6672() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6781();
            this.field2088 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2088[var13] = arg0.method6674();
            }
        } else if (arg1 == 14) {
            this.field2080 = arg0.method6675();
        } else if (arg1 == 15) {
            int var14 = arg0.method6672();
            this.field2076 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method6672();
                int var17 = arg0.method6674();
                this.field2076.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2083 = arg0.method6672();
            this.field2084 = arg0.method6672();
        } else if (arg1 == 17) {
            this.field2082 = new boolean[256];
            for (int var18 = 0; var18 < this.field2082.length; var18++) {
                this.field2082[var18] = false;
            }
            int var19 = arg0.method6781();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2082[arg0.method6781()] = true;
            }
        }
    }

    @ObfuscatedName("gn.m(B)V")
    public void method3353() {
        if (this.field2097 == -1) {
            if (this.field2090 == null && this.field2082 == null) {
                this.field2097 = 0;
            } else {
                this.field2097 = 2;
            }
        }
        if (this.field2098 != -1) {
            return;
        }
        if (this.field2090 == null && this.field2082 == null) {
            this.field2098 = 0;
        } else {
            this.field2098 = 2;
        }
    }

    @ObfuscatedName("gn.t(Lgo;IB)Lgo;")
    public class204 method3332(class204 arg0, int arg1) {
        if (this.method3381()) {
            class121 var7 = method2791(this.field2080);
            if (var7 == null) {
                return arg0.method3868(true);
            } else {
                class204 var8 = arg0.method3868(!var7.method2557());
                var8.method3949(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2099[arg1];
            class200 var4 = method3288(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3868(true);
            } else {
                class204 var6 = arg0.method3868(!var4.method3824(var5));
                var6.method3876(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gn.s(Lgo;IIB)Lgo;")
    public class204 method3333(class204 arg0, int arg1, int arg2) {
        if (this.method3381()) {
            class121 var9 = method2791(this.field2080);
            if (var9 == null) {
                return arg0.method3868(true);
            }
            class204 var10 = arg0.method3868(!var9.method2557());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method3869();
            } else if (var11 == 2) {
                var10.method3885();
            } else if (var11 == 3) {
                var10.method3884();
            }
            var10.method3949(var9, arg1);
            if (var11 == 1) {
                var10.method3884();
            } else if (var11 == 2) {
                var10.method3885();
            } else if (var11 == 3) {
                var10.method3869();
            }
            return var10;
        }
        int var4 = this.field2099[arg1];
        class200 var5 = method3288(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3868(true);
        }
        class204 var7 = arg0.method3868(!var5.method3824(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3869();
        } else if (var8 == 2) {
            var7.method3885();
        } else if (var8 == 3) {
            var7.method3884();
        }
        var7.method3876(var5, var6);
        if (var8 == 1) {
            var7.method3884();
        } else if (var8 == 2) {
            var7.method3885();
        } else if (var8 == 3) {
            var7.method3869();
        }
        return var7;
    }

    @ObfuscatedName("gn.j(Lgo;II)Lgo;")
    public class204 method3334(class204 arg0, int arg1) {
        if (this.method3381()) {
            class121 var7 = method2791(this.field2080);
            if (var7 == null) {
                return arg0.method3892(true);
            } else {
                class204 var8 = arg0.method3892(!var7.method2557());
                var8.method3949(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2099[arg1];
            class200 var4 = method3288(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3892(true);
            } else {
                class204 var6 = arg0.method3892(!var4.method3824(var5));
                var6.method3876(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gn.w(Lgo;ILgn;IB)Lgo;")
    public class204 method3370(class204 arg0, int arg1, class183 arg2, int arg3) {
        if (field2085 && !this.method3381() && !arg2.method3381()) {
            return this.method3365(arg0, arg1, arg2, arg3);
        }
        class204 var5 = arg0.method3868(false);
        boolean var6 = false;
        class200 var7 = null;
        if (this.method3381()) {
            class121 var8 = this.method3339();
            if (arg2.method3381() && this.field2082 == null) {
                var5.method3949(var8, arg1);
                return var5;
            }
            var5.method3881(var8, arg1, this.field2082, false);
        } else {
            int var9 = this.field2099[arg1];
            var7 = method3288(var9 >> 16);
            arg1 = var9 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3332(arg0, arg3);
            }
            if (!arg2.method3381() && (this.field2090 == null || arg3 == -1)) {
                var5.method3876(var7, arg1);
                return var5;
            }
            if (this.field2090 == null || arg3 == -1) {
                var5.method3876(var7, arg1);
                return var5;
            }
            var6 = arg2.method3381();
            if (!var6) {
                var5.method3882(var7, arg1, this.field2090, false);
            }
        }
        if (arg2.method3381()) {
            class121 var10 = arg2.method3339();
            var5.method3881(var10, arg3, this.field2082, true);
        } else {
            int var11 = arg2.field2099[arg3];
            class200 var12 = method3288(var11 >> 16);
            int var13 = var11 & 0xFFFF;
            if (var12 == null) {
                return this.method3332(arg0, arg1);
            }
            var5.method3882(var12, var13, this.field2090, true);
        }
        if (var6 && var7 != null) {
            var5.method3882(var7, arg1, this.field2090, false);
        }
        var5.method3875();
        return var5;
    }

    @ObfuscatedName("gn.n(Lgo;ILgn;II)Lgo;")
    public class204 method3365(class204 arg0, int arg1, class183 arg2, int arg3) {
        int var5 = this.field2099[arg1];
        class200 var6 = method3288(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3332(arg0, arg3);
        }
        int var8 = arg2.field2099[arg3];
        class200 var9 = method3288(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class204 var11 = arg0.method3868(!var6.method3824(var7));
            var11.method3876(var6, var7);
            return var11;
        } else {
            class204 var12 = arg0.method3868(!var6.method3824(var7) & !var9.method3824(var10));
            var12.method3880(var6, var7, var9, var10, this.field2090);
            return var12;
        }
    }

    @ObfuscatedName("gn.r(Lgo;II)Lgo;")
    public class204 method3336(class204 arg0, int arg1) {
        if (this.method3381()) {
            return this.method3332(arg0, arg1);
        }
        int var3 = this.field2099[arg1];
        class200 var4 = method3288(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3868(true);
        }
        class200 var6 = null;
        int var7 = 0;
        if (this.field2086 != null && arg1 < this.field2086.length) {
            int var8 = this.field2086[arg1];
            var6 = method3288(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class204 var10 = arg0.method3868(!var4.method3824(var5));
            var10.method3876(var4, var5);
            return var10;
        } else {
            class204 var9 = arg0.method3868(!var4.method3824(var5) & !var6.method3824(var7));
            var9.method3876(var4, var5);
            var9.method3876(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gn.o(I)Z")
    public boolean method3381() {
        return this.field2080 >= 0;
    }

    @ObfuscatedName("gn.v(I)I")
    public int method3338() {
        return this.field2084 - this.field2083;
    }

    @ObfuscatedName("fx.d(II)Lgg;")
    public static class200 method3288(int arg0) {
        class200 var1 = (class200) field2094.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class302 var2 = Statics.field2077;
        class302 var3 = Statics.field1447;
        boolean var4 = true;
        int[] var5 = var2.method5063(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5073(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5073(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class200 var10;
        if (var4) {
            try {
                var10 = new class200(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2094.method4515(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gn.h(B)Ldb;")
    public class121 method3339() {
        return this.method3381() ? method2791(this.field2080) : null;
    }

    @ObfuscatedName("ey.g(II)Ldb;")
    public static class121 method2791(int arg0) {
        class121 var1 = (class121) field2087.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class121 var2 = class121.method2448(Statics.field2077, Statics.field1447, arg0, false);
        if (var2 != null) {
            field2087.method4515(var2, (long) arg0);
        }
        return var2;
    }
}
