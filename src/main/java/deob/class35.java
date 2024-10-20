package deob;

@ObfuscatedName("af")
public class class35 extends class174 {

    @ObfuscatedName("af.g")
    public static class167 field868 = new class167(64);

    @ObfuscatedName("af.r")
    public static class167 field869 = new class167(100);

    @ObfuscatedName("af.i")
    public int[] field870;

    @ObfuscatedName("af.f")
    public int[] field871;

    @ObfuscatedName("af.a")
    public int[] field884;

    @ObfuscatedName("af.w")
    public int[] field880;

    @ObfuscatedName("af.u")
    public int field872 = -1;

    @ObfuscatedName("af.d")
    public int[] field875;

    @ObfuscatedName("af.t")
    public boolean field876 = false;

    @ObfuscatedName("af.j")
    public int field877 = 5;

    @ObfuscatedName("af.q")
    public int field873 = -1;

    @ObfuscatedName("af.p")
    public int field883 = -1;

    @ObfuscatedName("af.v")
    public int field879 = 99;

    @ObfuscatedName("af.n")
    public int field882 = -1;

    @ObfuscatedName("af.l")
    public int field866 = -1;

    @ObfuscatedName("af.c")
    public int field874 = 2;

    @ObfuscatedName("bx.m(Lek;Lek;Lek;I)V")
    public static void method1387(class142 arg0, class142 arg1, class142 arg2) {
        Statics.field881 = arg0;
        Statics.field867 = arg1;
        Statics.field1736 = arg2;
    }

    @ObfuscatedName("v.k(IB)Laf;")
    public static class35 method162(int arg0) {
        class35 var1 = (class35) field868.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field881.method2725(12, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method675(new class104(var2));
        }
        var3.method672();
        field868.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.y(Lcb;I)V")
    public void method675(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method671(arg0, var2);
        }
    }

    @ObfuscatedName("af.g(Lcb;II)V")
    public void method671(class104 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2132();
            this.field884 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field884[var4] = arg0.method2132();
            }
            this.field870 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field870[var5] = arg0.method2132();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field870[var6] += arg0.method2132() << 16;
            }
        } else if (arg1 == 2) {
            this.field872 = arg0.method2132();
        } else if (arg1 == 3) {
            int var7 = arg0.method2190();
            this.field875 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field875[var8] = arg0.method2190();
            }
            this.field875[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field876 = true;
        } else if (arg1 == 5) {
            this.field877 = arg0.method2190();
        } else if (arg1 == 6) {
            this.field873 = arg0.method2132();
        } else if (arg1 == 7) {
            this.field883 = arg0.method2132();
        } else if (arg1 == 8) {
            this.field879 = arg0.method2190();
        } else if (arg1 == 9) {
            this.field882 = arg0.method2190();
        } else if (arg1 == 10) {
            this.field866 = arg0.method2190();
        } else if (arg1 == 11) {
            this.field874 = arg0.method2190();
        } else if (arg1 == 12) {
            int var9 = arg0.method2190();
            this.field871 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field871[var10] = arg0.method2132();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field871[var11] += arg0.method2132() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2190();
            this.field880 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field880[var13] = arg0.method2134();
            }
        }
    }

    @ObfuscatedName("af.r(B)V")
    public void method672() {
        if (this.field882 == -1) {
            if (this.field875 == null) {
                this.field882 = 0;
            } else {
                this.field882 = 2;
            }
        }
        if (this.field866 != -1) {
            return;
        }
        if (this.field875 == null) {
            this.field866 = 0;
        } else {
            this.field866 = 2;
        }
    }

    @ObfuscatedName("af.i(Lcl;II)Lcl;")
    public class95 method673(class95 arg0, int arg1) {
        int var3 = this.field870[arg1];
        class93 var4 = method2542(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1982(true);
        } else {
            class95 var6 = arg0.method1982(!var4.method1965(var5));
            var6.method1978(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.f(Lcl;IIB)Lcl;")
    public class95 method674(class95 arg0, int arg1, int arg2) {
        int var4 = this.field870[arg1];
        class93 var5 = method2542(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1982(true);
        }
        class95 var7 = arg0.method1982(!var5.method1965(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1983();
        } else if (var8 == 2) {
            var7.method1987();
        } else if (var8 == 3) {
            var7.method1981();
        }
        var7.method1978(var5, var6);
        if (var8 == 1) {
            var7.method1981();
        } else if (var8 == 2) {
            var7.method1987();
        } else if (var8 == 3) {
            var7.method1983();
        }
        return var7;
    }

    @ObfuscatedName("af.a(Lcl;II)Lcl;")
    public class95 method682(class95 arg0, int arg1) {
        int var3 = this.field870[arg1];
        class93 var4 = method2542(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2048(true);
        } else {
            class95 var6 = arg0.method2048(!var4.method1965(var5));
            var6.method1978(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.w(Lcl;ILaf;IB)Lcl;")
    public class95 method676(class95 arg0, int arg1, class35 arg2, int arg3) {
        int var5 = this.field870[arg1];
        class93 var6 = method2542(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method673(arg0, arg3);
        }
        int var8 = arg2.field870[arg3];
        class93 var9 = method2542(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class95 var11 = arg0.method1982(!var6.method1965(var7));
            var11.method1978(var6, var7);
            return var11;
        } else {
            class95 var12 = arg0.method1982(!var6.method1965(var7) & !var9.method1965(var10));
            var12.method1979(var6, var7, var9, var10, this.field875);
            return var12;
        }
    }

    @ObfuscatedName("af.u(Lcl;II)Lcl;")
    public class95 method677(class95 arg0, int arg1) {
        int var3 = this.field870[arg1];
        class93 var4 = method2542(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1982(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field871 != null && arg1 < this.field871.length) {
            int var8 = this.field871[arg1];
            var6 = method2542(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class95 var10 = arg0.method1982(!var4.method1965(var5));
            var10.method1978(var4, var5);
            return var10;
        } else {
            class95 var9 = arg0.method1982(!var4.method1965(var5) & !var6.method1965(var7));
            var9.method1978(var4, var5);
            var9.method1978(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dh.d(IS)Lca;")
    public static class93 method2542(int arg0) {
        class93 var1 = (class93) field869.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class142 var2 = Statics.field867;
        class142 var3 = Statics.field1736;
        boolean var4 = true;
        int[] var5 = var2.method2704(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2701(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2701(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class93 var10;
        if (var4) {
            try {
                var10 = new class93(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field869.method3130(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("h.t(I)V")
    public static void method511() {
        field868.method3134();
        field869.method3134();
    }
}
