package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gm")
public class class183 extends class387 {

    @ObfuscatedName("gm.c")
    public static boolean field2106 = false;

    @ObfuscatedName("gm.r")
    public static class249 field2089 = new class249(64);

    @ObfuscatedName("gm.o")
    public static class249 field2090 = new class249(100);

    @ObfuscatedName("gm.i")
    public static class249 field2091 = new class249(100);

    @ObfuscatedName("gm.w")
    public int field2092 = -1;

    @ObfuscatedName("gm.v")
    public Map field2093;

    @ObfuscatedName("gm.a")
    public int field2098 = 0;

    @ObfuscatedName("gm.y")
    public int field2095 = 0;

    @ObfuscatedName("gm.u")
    public int[] field2107;

    @ObfuscatedName("gm.h")
    public int[] field2097;

    @ObfuscatedName("gm.q")
    public int[] field2094;

    @ObfuscatedName("gm.x")
    public int[] field2104;

    @ObfuscatedName("gm.p")
    public int field2111 = -1;

    @ObfuscatedName("gm.n")
    public int[] field2101;

    @ObfuscatedName("gm.m")
    public boolean[] field2102;

    @ObfuscatedName("gm.d")
    public boolean field2103 = false;

    @ObfuscatedName("gm.j")
    public int field2096 = 5;

    @ObfuscatedName("gm.f")
    public int field2105 = -1;

    @ObfuscatedName("gm.g")
    public int field2099 = -1;

    @ObfuscatedName("gm.t")
    public int field2109 = 99;

    @ObfuscatedName("gm.k")
    public int field2108 = -1;

    @ObfuscatedName("gm.b")
    public int field2100 = -1;

    @ObfuscatedName("gm.z")
    public int field2110 = 2;

    @ObfuscatedName("ch.l(II)Lgm;")
    public static class183 method1980(int arg0) {
        class183 var1 = (class183) field2089.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4270.method5066(12, arg0);
        class183 var3 = new class183();
        if (var2 != null) {
            var3.method3275(new class421(var2));
        }
        var3.method3277();
        field2089.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.s(Lpi;I)V")
    public void method3275(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3276(arg0, var2);
        }
    }

    @ObfuscatedName("gm.e(Lpi;IB)V")
    public void method3276(class421 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6666();
            this.field2094 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2094[var4] = arg0.method6666();
            }
            this.field2107 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2107[var5] = arg0.method6666();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2107[var6] += arg0.method6666() << 16;
            }
        } else if (arg1 == 2) {
            this.field2111 = arg0.method6666();
        } else if (arg1 == 3) {
            int var7 = arg0.method6686();
            this.field2101 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2101[var8] = arg0.method6686();
            }
            this.field2101[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2103 = true;
        } else if (arg1 == 5) {
            this.field2096 = arg0.method6686();
        } else if (arg1 == 6) {
            this.field2105 = arg0.method6666();
        } else if (arg1 == 7) {
            this.field2099 = arg0.method6666();
        } else if (arg1 == 8) {
            this.field2109 = arg0.method6686();
        } else if (arg1 == 9) {
            this.field2108 = arg0.method6686();
        } else if (arg1 == 10) {
            this.field2100 = arg0.method6686();
        } else if (arg1 == 11) {
            this.field2110 = arg0.method6686();
        } else if (arg1 == 12) {
            int var9 = arg0.method6686();
            this.field2097 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2097[var10] = arg0.method6666();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2097[var11] += arg0.method6666() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6686();
            this.field2104 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2104[var13] = arg0.method6668();
            }
        } else if (arg1 == 14) {
            this.field2092 = arg0.method6669();
        } else if (arg1 == 15) {
            int var14 = arg0.method6666();
            this.field2093 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method6666();
                int var17 = arg0.method6668();
                this.field2093.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2098 = arg0.method6666();
            this.field2095 = arg0.method6666();
        } else if (arg1 == 17) {
            this.field2102 = new boolean[256];
            for (int var18 = 0; var18 < this.field2102.length; var18++) {
                this.field2102[var18] = false;
            }
            int var19 = arg0.method6686();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2102[arg0.method6686()] = true;
            }
        }
    }

    @ObfuscatedName("gm.r(I)V")
    public void method3277() {
        if (this.field2108 == -1) {
            if (this.field2101 == null && this.field2102 == null) {
                this.field2108 = 0;
            } else {
                this.field2108 = 2;
            }
        }
        if (this.field2100 != -1) {
            return;
        }
        if (this.field2101 == null && this.field2102 == null) {
            this.field2100 = 0;
        } else {
            this.field2100 = 2;
        }
    }

    @ObfuscatedName("gm.o(Lgf;IB)Lgf;")
    public class204 method3306(class204 arg0, int arg1) {
        if (this.method3284()) {
            class121 var7 = method4312(this.field2092);
            if (var7 == null) {
                return arg0.method3844(true);
            } else {
                class204 var8 = arg0.method3844(!var7.method2564());
                var8.method3812(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2107[arg1];
            class200 var4 = method612(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3844(true);
            } else {
                class204 var6 = arg0.method3844(!var4.method3769(var5));
                var6.method3888(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gm.i(Lgf;IIS)Lgf;")
    public class204 method3279(class204 arg0, int arg1, int arg2) {
        if (this.method3284()) {
            class121 var9 = method4312(this.field2092);
            if (var9 == null) {
                return arg0.method3844(true);
            }
            class204 var10 = arg0.method3844(!var9.method2564());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method3821();
            } else if (var11 == 2) {
                var10.method3820();
            } else if (var11 == 3) {
                var10.method3819();
            }
            var10.method3812(var9, arg1);
            if (var11 == 1) {
                var10.method3819();
            } else if (var11 == 2) {
                var10.method3820();
            } else if (var11 == 3) {
                var10.method3821();
            }
            return var10;
        }
        int var4 = this.field2107[arg1];
        class200 var5 = method612(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3844(true);
        }
        class204 var7 = arg0.method3844(!var5.method3769(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3821();
        } else if (var8 == 2) {
            var7.method3820();
        } else if (var8 == 3) {
            var7.method3819();
        }
        var7.method3888(var5, var6);
        if (var8 == 1) {
            var7.method3819();
        } else if (var8 == 2) {
            var7.method3820();
        } else if (var8 == 3) {
            var7.method3821();
        }
        return var7;
    }

    @ObfuscatedName("gm.w(Lgf;II)Lgf;")
    public class204 method3292(class204 arg0, int arg1) {
        if (this.method3284()) {
            class121 var7 = method4312(this.field2092);
            if (var7 == null) {
                return arg0.method3804(true);
            } else {
                class204 var8 = arg0.method3804(!var7.method2564());
                var8.method3812(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2107[arg1];
            class200 var4 = method612(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3804(true);
            } else {
                class204 var6 = arg0.method3804(!var4.method3769(var5));
                var6.method3888(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gm.v(Lgf;ILgm;IB)Lgf;")
    public class204 method3281(class204 arg0, int arg1, class183 arg2, int arg3) {
        if (field2106 && !this.method3284() && !arg2.method3284()) {
            return this.method3282(arg0, arg1, arg2, arg3);
        }
        class204 var5 = arg0.method3844(false);
        boolean var6 = false;
        class200 var7 = null;
        if (this.method3284()) {
            class121 var8 = this.method3286();
            if (arg2.method3284() && this.field2102 == null) {
                var5.method3812(var8, arg1);
                return var5;
            }
            var5.method3811(var8, arg1, this.field2102, false);
        } else {
            int var9 = this.field2107[arg1];
            var7 = method612(var9 >> 16);
            arg1 = var9 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3306(arg0, arg3);
            }
            if (!arg2.method3284() && (this.field2101 == null || arg3 == -1)) {
                var5.method3888(var7, arg1);
                return var5;
            }
            if (this.field2101 == null || arg3 == -1) {
                var5.method3888(var7, arg1);
                return var5;
            }
            var6 = arg2.method3284();
            if (!var6) {
                var5.method3817(var7, arg1, this.field2101, false);
            }
        }
        if (arg2.method3284()) {
            class121 var10 = arg2.method3286();
            var5.method3811(var10, arg3, this.field2102, true);
        } else {
            int var11 = arg2.field2107[arg3];
            class200 var12 = method612(var11 >> 16);
            int var13 = var11 & 0xFFFF;
            if (var12 == null) {
                return this.method3306(arg0, arg1);
            }
            var5.method3817(var12, var13, this.field2101, true);
        }
        if (var6 && var7 != null) {
            var5.method3817(var7, arg1, this.field2101, false);
        }
        var5.method3810();
        return var5;
    }

    @ObfuscatedName("gm.a(Lgf;ILgm;II)Lgf;")
    public class204 method3282(class204 arg0, int arg1, class183 arg2, int arg3) {
        int var5 = this.field2107[arg1];
        class200 var6 = method612(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3306(arg0, arg3);
        }
        int var8 = arg2.field2107[arg3];
        class200 var9 = method612(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class204 var11 = arg0.method3844(!var6.method3769(var7));
            var11.method3888(var6, var7);
            return var11;
        } else {
            class204 var12 = arg0.method3844(!var6.method3769(var7) & !var9.method3769(var10));
            var12.method3815(var6, var7, var9, var10, this.field2101);
            return var12;
        }
    }

    @ObfuscatedName("gm.y(Lgf;IB)Lgf;")
    public class204 method3283(class204 arg0, int arg1) {
        if (this.method3284()) {
            return this.method3306(arg0, arg1);
        }
        int var3 = this.field2107[arg1];
        class200 var4 = method612(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3844(true);
        }
        class200 var6 = null;
        int var7 = 0;
        if (this.field2097 != null && arg1 < this.field2097.length) {
            int var8 = this.field2097[arg1];
            var6 = method612(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class204 var10 = arg0.method3844(!var4.method3769(var5));
            var10.method3888(var4, var5);
            return var10;
        } else {
            class204 var9 = arg0.method3844(!var4.method3769(var5) & !var6.method3769(var7));
            var9.method3888(var4, var5);
            var9.method3888(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gm.u(I)Z")
    public boolean method3284() {
        return this.field2092 >= 0;
    }

    @ObfuscatedName("gm.h(I)I")
    public int method3321() {
        return this.field2095 - this.field2098;
    }

    @ObfuscatedName("aa.q(II)Lgu;")
    public static class200 method612(int arg0) {
        class200 var1 = (class200) field2090.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class307 var2 = Statics.field2592;
        class307 var3 = Statics.field2088;
        boolean var4 = true;
        int[] var5 = var2.method5084(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5111(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5111(var8, 0);
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
            field2090.method4482(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gm.x(I)Ldw;")
    public class121 method3286() {
        return this.method3284() ? method4312(this.field2092) : null;
    }

    @ObfuscatedName("hf.p(II)Ldw;")
    public static class121 method4312(int arg0) {
        class121 var1 = (class121) field2091.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class307 var2 = Statics.field2592;
        class307 var3 = Statics.field2088;
        boolean var4 = true;
        byte[] var5 = var2.method5066(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class121 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method5111(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                try {
                    var7 = new class121(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2091.method4482(var7, (long) arg0);
        }
        return var7;
    }

    @ObfuscatedName("fk.n(B)V")
    public static void method2814() {
        field2089.method4475();
        field2090.method4475();
        field2091.method4475();
    }
}
