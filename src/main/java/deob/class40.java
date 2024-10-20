package deob;

@ObfuscatedName("aw")
public class class40 extends class195 {

    @ObfuscatedName("aw.f")
    public static class184 field943 = new class184(64);

    @ObfuscatedName("aw.w")
    public static class184 field944 = new class184(100);

    @ObfuscatedName("aw.t")
    public int[] field945;

    @ObfuscatedName("aw.s")
    public int[] field958;

    @ObfuscatedName("aw.c")
    public int[] field947;

    @ObfuscatedName("aw.d")
    public int[] field946;

    @ObfuscatedName("aw.v")
    public int field961 = -1;

    @ObfuscatedName("aw.m")
    public int[] field950;

    @ObfuscatedName("aw.h")
    public boolean field951 = false;

    @ObfuscatedName("aw.n")
    public int field957 = 5;

    @ObfuscatedName("aw.x")
    public int field953 = -1;

    @ObfuscatedName("aw.o")
    public int field954 = -1;

    @ObfuscatedName("aw.r")
    public int field955 = 99;

    @ObfuscatedName("aw.y")
    public int field956 = -1;

    @ObfuscatedName("aw.i")
    public int field941 = -1;

    @ObfuscatedName("aw.q")
    public int field949 = 2;

    @ObfuscatedName("aa.p(Lff;Lff;Lff;I)V")
    public static void method587(class158 arg0, class158 arg1, class158 arg2) {
        Statics.field963 = arg0;
        Statics.field942 = arg1;
        Statics.field2814 = arg2;
    }

    @ObfuscatedName("af.k(IB)Law;")
    public static class40 method678(int arg0) {
        class40 var1 = (class40) field943.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field963.method2896(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method767(new class111(var2));
        }
        var3.method741();
        field943.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.e(Lde;B)V")
    public void method767(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method740(arg0, var2);
        }
    }

    @ObfuscatedName("aw.f(Lde;II)V")
    public void method740(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2177();
            this.field947 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field947[var4] = arg0.method2177();
            }
            this.field945 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field945[var5] = arg0.method2177();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field945[var6] += arg0.method2177() << 16;
            }
        } else if (arg1 == 2) {
            this.field961 = arg0.method2177();
        } else if (arg1 == 3) {
            int var7 = arg0.method2314();
            this.field950 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field950[var8] = arg0.method2314();
            }
            this.field950[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field951 = true;
        } else if (arg1 == 5) {
            this.field957 = arg0.method2314();
        } else if (arg1 == 6) {
            this.field953 = arg0.method2177();
        } else if (arg1 == 7) {
            this.field954 = arg0.method2177();
        } else if (arg1 == 8) {
            this.field955 = arg0.method2314();
        } else if (arg1 == 9) {
            this.field956 = arg0.method2314();
        } else if (arg1 == 10) {
            this.field941 = arg0.method2314();
        } else if (arg1 == 11) {
            this.field949 = arg0.method2314();
        } else if (arg1 == 12) {
            int var9 = arg0.method2314();
            this.field958 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field958[var10] = arg0.method2177();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field958[var11] += arg0.method2177() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2314();
            this.field946 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field946[var13] = arg0.method2179();
            }
        }
    }

    @ObfuscatedName("aw.w(I)V")
    public void method741() {
        if (this.field956 == -1) {
            if (this.field950 == null) {
                this.field956 = 0;
            } else {
                this.field956 = 2;
            }
        }
        if (this.field941 != -1) {
            return;
        }
        if (this.field950 == null) {
            this.field941 = 0;
        } else {
            this.field941 = 2;
        }
    }

    @ObfuscatedName("aw.t(Lcm;II)Lcm;")
    public class100 method768(class100 arg0, int arg1) {
        int var3 = this.field945[arg1];
        class98 var4 = method3050(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2024(true);
        } else {
            class100 var6 = arg0.method2024(!var4.method2008(var5));
            var6.method2083(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.s(Lcm;III)Lcm;")
    public class100 method759(class100 arg0, int arg1, int arg2) {
        int var4 = this.field945[arg1];
        class98 var5 = method3050(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2024(true);
        }
        class100 var7 = arg0.method2024(!var5.method2008(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2022();
        } else if (var8 == 2) {
            var7.method2034();
        } else if (var8 == 3) {
            var7.method2033();
        }
        var7.method2083(var5, var6);
        if (var8 == 1) {
            var7.method2033();
        } else if (var8 == 2) {
            var7.method2034();
        } else if (var8 == 3) {
            var7.method2022();
        }
        return var7;
    }

    @ObfuscatedName("aw.c(Lcm;IS)Lcm;")
    public class100 method744(class100 arg0, int arg1) {
        int var3 = this.field945[arg1];
        class98 var4 = method3050(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2025(true);
        } else {
            class100 var6 = arg0.method2025(!var4.method2008(var5));
            var6.method2083(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.d(Lcm;ILaw;II)Lcm;")
    public class100 method745(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field945[arg1];
        class98 var6 = method3050(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method768(arg0, arg3);
        }
        int var8 = arg2.field945[arg3];
        class98 var9 = method3050(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2024(!var6.method2008(var7));
            var11.method2083(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2024(!var6.method2008(var7) & !var9.method2008(var10));
            var12.method2059(var6, var7, var9, var10, this.field950);
            return var12;
        }
    }

    @ObfuscatedName("aw.v(Lcm;II)Lcm;")
    public class100 method746(class100 arg0, int arg1) {
        int var3 = this.field945[arg1];
        class98 var4 = method3050(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2024(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field958 != null && arg1 < this.field958.length) {
            int var8 = this.field958[arg1];
            var6 = method3050(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2024(!var4.method2008(var5));
            var10.method2083(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2024(!var4.method2008(var5) & !var6.method2008(var7));
            var9.method2083(var4, var5);
            var9.method2083(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fh.m(II)Lck;")
    public static class98 method3050(int arg0) {
        class98 var1 = (class98) field944.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class98 var2 = class98.method167(Statics.field942, Statics.field2814, arg0, false);
        if (var2 != null) {
            field944.method3370(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("fb.h(I)V")
    public static void method3093() {
        field943.method3374();
        field944.method3374();
    }
}
