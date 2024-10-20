package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gh")
public class class190 extends class406 {

    @ObfuscatedName("gh.s")
    public static boolean field2170 = false;

    @ObfuscatedName("gh.c")
    public static class256 field2162 = new class256(64);

    @ObfuscatedName("gh.q")
    public static class256 field2166 = new class256(100);

    @ObfuscatedName("gh.i")
    public static class256 field2163 = new class256(100);

    @ObfuscatedName("gh.k")
    public int field2177 = -1;

    @ObfuscatedName("gh.o")
    public Map field2175;

    @ObfuscatedName("gh.n")
    public int field2165 = 0;

    @ObfuscatedName("gh.d")
    public int field2176 = 0;

    @ObfuscatedName("gh.a")
    public int[] field2167;

    @ObfuscatedName("gh.m")
    public int[] field2161;

    @ObfuscatedName("gh.u")
    public int[] field2164;

    @ObfuscatedName("gh.l")
    public int[] field2169;

    @ObfuscatedName("gh.z")
    public int field2171 = -1;

    @ObfuscatedName("gh.r")
    public int[] field2172;

    @ObfuscatedName("gh.y")
    public boolean[] field2173;

    @ObfuscatedName("gh.p")
    public boolean field2174 = false;

    @ObfuscatedName("gh.e")
    public int field2158 = 5;

    @ObfuscatedName("gh.b")
    public int field2160 = -1;

    @ObfuscatedName("gh.x")
    public int field2183 = -1;

    @ObfuscatedName("gh.f")
    public int field2178 = 99;

    @ObfuscatedName("gh.t")
    public boolean field2179 = false;

    @ObfuscatedName("gh.j")
    public int field2180 = -1;

    @ObfuscatedName("gh.g")
    public int field2181 = -1;

    @ObfuscatedName("gh.ar")
    public int field2182 = 2;

    @ObfuscatedName("ej.s(Lls;Lls;Lls;I)V")
    public static void method2653(class316 arg0, class316 arg1, class316 arg2) {
        Statics.field110 = arg0;
        Statics.field2159 = arg1;
        Statics.field4829 = arg2;
    }

    @ObfuscatedName("mm.h(II)Lgh;")
    public static class190 method5853(int arg0) {
        class190 var1 = (class190) field2162.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field110.method5179(12, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3422(new class444(var2));
        }
        var3.method3424();
        field2162.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.w(Lqr;I)V")
    public void method3422(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3380(arg0, var2);
        }
    }

    @ObfuscatedName("gh.v(Lqr;IB)V")
    public void method3380(class444 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7120();
            this.field2164 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2164[var4] = arg0.method7120();
            }
            this.field2167 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2167[var5] = arg0.method7120();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2167[var6] += arg0.method7120() << 16;
            }
        } else if (arg1 == 2) {
            this.field2171 = arg0.method7120();
        } else if (arg1 == 3) {
            int var7 = arg0.method6929();
            this.field2172 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2172[var8] = arg0.method6929();
            }
            this.field2172[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2174 = true;
        } else if (arg1 == 5) {
            this.field2158 = arg0.method6929();
        } else if (arg1 == 6) {
            this.field2160 = arg0.method7120();
        } else if (arg1 == 7) {
            this.field2183 = arg0.method7120();
        } else if (arg1 == 8) {
            this.field2178 = arg0.method6929();
            this.field2179 = true;
        } else if (arg1 == 9) {
            this.field2180 = arg0.method6929();
        } else if (arg1 == 10) {
            this.field2181 = arg0.method6929();
        } else if (arg1 == 11) {
            this.field2182 = arg0.method6929();
        } else if (arg1 == 12) {
            int var9 = arg0.method6929();
            this.field2161 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2161[var10] = arg0.method7120();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2161[var11] += arg0.method7120() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6929();
            this.field2169 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2169[var13] = arg0.method7095();
            }
        } else if (arg1 == 14) {
            this.field2177 = arg0.method6934();
        } else if (arg1 == 15) {
            int var14 = arg0.method7120();
            this.field2175 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7120();
                int var17 = arg0.method7095();
                this.field2175.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2165 = arg0.method7120();
            this.field2176 = arg0.method7120();
        } else if (arg1 == 17) {
            this.field2173 = new boolean[256];
            for (int var18 = 0; var18 < this.field2173.length; var18++) {
                this.field2173[var18] = false;
            }
            int var19 = arg0.method6929();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2173[arg0.method6929()] = true;
            }
        }
    }

    @ObfuscatedName("gh.c(I)V")
    public void method3424() {
        if (this.field2180 == -1) {
            if (this.field2172 == null && this.field2173 == null) {
                this.field2180 = 0;
            } else {
                this.field2180 = 2;
            }
        }
        if (this.field2181 != -1) {
            return;
        }
        if (this.field2172 == null && this.field2173 == null) {
            this.field2181 = 0;
        } else {
            this.field2181 = 2;
        }
    }

    @ObfuscatedName("gh.q(Lhp;II)Lhp;")
    public class211 method3382(class211 arg0, int arg1) {
        if (this.method3388()) {
            class123 var7 = method3206(this.field2177);
            if (var7 == null) {
                return arg0.method3965(true);
            } else {
                class211 var8 = arg0.method3965(!var7.method2599());
                var8.method3959(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2167[arg1];
            class207 var4 = method2745(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3965(true);
            } else {
                class211 var6 = arg0.method3965(!var4.method3885(var5));
                var6.method3934(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gh.i(Lhp;III)Lhp;")
    public class211 method3401(class211 arg0, int arg1, int arg2) {
        if (this.method3388()) {
            class123 var9 = method3206(this.field2177);
            if (var9 == null) {
                return arg0.method3965(true);
            }
            class211 var10 = arg0.method3965(!var9.method2599());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method3944();
            } else if (var11 == 2) {
                var10.method4033();
            } else if (var11 == 3) {
                var10.method3942();
            }
            var10.method3959(var9, arg1);
            if (var11 == 1) {
                var10.method3942();
            } else if (var11 == 2) {
                var10.method4033();
            } else if (var11 == 3) {
                var10.method3944();
            }
            return var10;
        }
        int var4 = this.field2167[arg1];
        class207 var5 = method2745(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3965(true);
        }
        class211 var7 = arg0.method3965(!var5.method3885(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3944();
        } else if (var8 == 2) {
            var7.method4033();
        } else if (var8 == 3) {
            var7.method3942();
        }
        var7.method3934(var5, var6);
        if (var8 == 1) {
            var7.method3942();
        } else if (var8 == 2) {
            var7.method4033();
        } else if (var8 == 3) {
            var7.method3944();
        }
        return var7;
    }

    @ObfuscatedName("gh.k(Lhp;II)Lhp;")
    public class211 method3384(class211 arg0, int arg1) {
        if (this.method3388()) {
            class123 var7 = method3206(this.field2177);
            if (var7 == null) {
                return arg0.method3927(true);
            } else {
                class211 var8 = arg0.method3927(!var7.method2599());
                var8.method3959(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2167[arg1];
            class207 var4 = method2745(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3927(true);
            } else {
                class211 var6 = arg0.method3927(!var4.method3885(var5));
                var6.method3934(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gh.o(Lhp;ILgh;IS)Lhp;")
    public class211 method3385(class211 arg0, int arg1, class190 arg2, int arg3) {
        if (field2170 && !this.method3388() && !arg2.method3388()) {
            return this.method3386(arg0, arg1, arg2, arg3);
        }
        class211 var5 = arg0.method3965(false);
        boolean var6 = false;
        class207 var7 = null;
        class203 var8 = null;
        if (this.method3388()) {
            class123 var9 = this.method3389();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3388() && this.field2173 == null) {
                var5.method3959(var9, arg1);
                return var5;
            }
            var8 = var9.field1499;
            var5.method3939(var8, var9, arg1, this.field2173, false, !arg2.method3388());
        } else {
            int var10 = this.field2167[arg1];
            var7 = method2745(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3382(arg0, arg3);
            }
            if (!arg2.method3388() && (this.field2172 == null || arg3 == -1)) {
                var5.method3934(var7, arg1);
                return var5;
            }
            if (this.field2172 == null || arg3 == -1) {
                var5.method3934(var7, arg1);
                return var5;
            }
            var6 = arg2.method3388();
            if (!var6) {
                var5.method3940(var7, arg1, this.field2172, false);
            }
        }
        if (arg2.method3388()) {
            class123 var11 = arg2.method3389();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1499;
            }
            var5.method3939(var8, var11, arg3, this.field2173, true, true);
        } else {
            int var12 = arg2.field2167[arg3];
            class207 var13 = method2745(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3382(arg0, arg1);
            }
            var5.method3940(var13, var14, this.field2172, true);
        }
        if (var6 && var7 != null) {
            var5.method3940(var7, arg1, this.field2172, false);
        }
        var5.method3997();
        return var5;
    }

    @ObfuscatedName("gh.n(Lhp;ILgh;II)Lhp;")
    public class211 method3386(class211 arg0, int arg1, class190 arg2, int arg3) {
        int var5 = this.field2167[arg1];
        class207 var6 = method2745(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3382(arg0, arg3);
        }
        int var8 = arg2.field2167[arg3];
        class207 var9 = method2745(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class211 var11 = arg0.method3965(!var6.method3885(var7));
            var11.method3934(var6, var7);
            return var11;
        } else {
            class211 var12 = arg0.method3965(!var6.method3885(var7) & !var9.method3885(var10));
            var12.method3938(var6, var7, var9, var10, this.field2172);
            return var12;
        }
    }

    @ObfuscatedName("gh.d(Lhp;IB)Lhp;")
    public class211 method3416(class211 arg0, int arg1) {
        if (this.method3388()) {
            return this.method3382(arg0, arg1);
        }
        int var3 = this.field2167[arg1];
        class207 var4 = method2745(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3965(true);
        }
        class207 var6 = null;
        int var7 = 0;
        if (this.field2161 != null && arg1 < this.field2161.length) {
            int var8 = this.field2161[arg1];
            var6 = method2745(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class211 var10 = arg0.method3965(!var4.method3885(var5));
            var10.method3934(var4, var5);
            return var10;
        } else {
            class211 var9 = arg0.method3965(!var4.method3885(var5) & !var6.method3885(var7));
            var9.method3934(var4, var5);
            var9.method3934(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gh.a(B)Z")
    public boolean method3388() {
        return this.field2177 >= 0;
    }

    @ObfuscatedName("gh.m(B)I")
    public int method3392() {
        return this.field2176 - this.field2165;
    }

    @ObfuscatedName("eq.u(II)Lgn;")
    public static class207 method2745(int arg0) {
        class207 var1 = (class207) field2166.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class316 var2 = Statics.field2159;
        class316 var3 = Statics.field4829;
        boolean var4 = true;
        int[] var5 = var2.method5245(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5187(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5187(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class207 var10;
        if (var4) {
            try {
                var10 = new class207(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2166.method4600(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gh.l(I)Ldk;")
    public class123 method3389() {
        return this.method3388() ? method3206(this.field2177) : null;
    }

    @ObfuscatedName("gm.z(IB)Ldk;")
    public static class123 method3206(int arg0) {
        class123 var1 = (class123) field2163.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class123 var2 = class123.method4655(Statics.field2159, Statics.field4829, arg0, false);
        if (var2 != null) {
            field2163.method4600(var2, (long) arg0);
        }
        return var2;
    }
}
