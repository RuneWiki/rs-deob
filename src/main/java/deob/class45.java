package deob;

@ObfuscatedName("ac")
public class class45 extends class208 {

    @ObfuscatedName("ac.o")
    public static class197 field1025 = new class197(64);

    @ObfuscatedName("ac.g")
    public static class197 field1013 = new class197(100);

    @ObfuscatedName("ac.l")
    public int[] field1010;

    @ObfuscatedName("ac.j")
    public int[] field1017;

    @ObfuscatedName("ac.r")
    public int[] field1012;

    @ObfuscatedName("ac.x")
    public int[] field1011;

    @ObfuscatedName("ac.k")
    public int field1014 = -1;

    @ObfuscatedName("ac.v")
    public int[] field1015;

    @ObfuscatedName("ac.h")
    public boolean field1016 = false;

    @ObfuscatedName("ac.u")
    public int field1006 = 5;

    @ObfuscatedName("ac.y")
    public int field1018 = -1;

    @ObfuscatedName("ac.p")
    public int field1019 = -1;

    @ObfuscatedName("ac.s")
    public int field1008 = 99;

    @ObfuscatedName("ac.f")
    public int field1020 = -1;

    @ObfuscatedName("ac.i")
    public int field1021 = -1;

    @ObfuscatedName("ac.d")
    public int field1023 = 2;

    @ObfuscatedName("bs.m(Lfa;Lfa;Lfa;I)V")
    public static void method1157(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field2085 = arg0;
        Statics.field1024 = arg1;
        Statics.field1007 = arg2;
    }

    @ObfuscatedName("ap.w(IB)Lac;")
    public static class45 method637(int arg0) {
        class45 var1 = (class45) field1025.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2085.method3086(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method873(new class123(var2));
        }
        var3.method875();
        field1025.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.e(Ldj;I)V")
    public void method873(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("ac.o(Ldj;II)V")
    public void method883(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2548();
            this.field1012 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1012[var4] = arg0.method2548();
            }
            this.field1010 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1010[var5] = arg0.method2548();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1010[var6] += arg0.method2548() << 16;
            }
        } else if (arg1 == 2) {
            this.field1014 = arg0.method2548();
        } else if (arg1 == 3) {
            int var7 = arg0.method2398();
            this.field1015 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1015[var8] = arg0.method2398();
            }
            this.field1015[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1016 = true;
        } else if (arg1 == 5) {
            this.field1006 = arg0.method2398();
        } else if (arg1 == 6) {
            this.field1018 = arg0.method2548();
        } else if (arg1 == 7) {
            this.field1019 = arg0.method2548();
        } else if (arg1 == 8) {
            this.field1008 = arg0.method2398();
        } else if (arg1 == 9) {
            this.field1020 = arg0.method2398();
        } else if (arg1 == 10) {
            this.field1021 = arg0.method2398();
        } else if (arg1 == 11) {
            this.field1023 = arg0.method2398();
        } else if (arg1 == 12) {
            int var9 = arg0.method2398();
            this.field1017 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1017[var10] = arg0.method2548();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1017[var11] += arg0.method2548() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2398();
            this.field1011 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1011[var13] = arg0.method2418();
            }
        }
    }

    @ObfuscatedName("ac.g(I)V")
    public void method875() {
        if (this.field1020 == -1) {
            if (this.field1015 == null) {
                this.field1020 = 0;
            } else {
                this.field1020 = 2;
            }
        }
        if (this.field1021 != -1) {
            return;
        }
        if (this.field1015 == null) {
            this.field1021 = 0;
        } else {
            this.field1021 = 2;
        }
    }

    @ObfuscatedName("ac.l(Ldg;II)Ldg;")
    public class109 method876(class109 arg0, int arg1) {
        int var3 = this.field1010[arg1];
        class107 var4 = method2832(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2222(true);
        } else {
            class109 var6 = arg0.method2222(!var4.method2214(var5));
            var6.method2242(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.j(Ldg;IIB)Ldg;")
    public class109 method877(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1010[arg1];
        class107 var5 = method2832(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2222(true);
        }
        class109 var7 = arg0.method2222(!var5.method2214(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2232();
        } else if (var8 == 2) {
            var7.method2231();
        } else if (var8 == 3) {
            var7.method2230();
        }
        var7.method2242(var5, var6);
        if (var8 == 1) {
            var7.method2230();
        } else if (var8 == 2) {
            var7.method2231();
        } else if (var8 == 3) {
            var7.method2232();
        }
        return var7;
    }

    @ObfuscatedName("ac.r(Ldg;IB)Ldg;")
    public class109 method878(class109 arg0, int arg1) {
        int var3 = this.field1010[arg1];
        class107 var4 = method2832(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2223(true);
        } else {
            class109 var6 = arg0.method2223(!var4.method2214(var5));
            var6.method2242(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.x(Ldg;ILac;IB)Ldg;")
    public class109 method872(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1010[arg1];
        class107 var6 = method2832(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method876(arg0, arg3);
        }
        int var8 = arg2.field1010[arg3];
        class107 var9 = method2832(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2222(!var6.method2214(var7));
            var11.method2242(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2222(!var6.method2214(var7) & !var9.method2214(var10));
            var12.method2267(var6, var7, var9, var10, this.field1015);
            return var12;
        }
    }

    @ObfuscatedName("ac.k(Ldg;II)Ldg;")
    public class109 method903(class109 arg0, int arg1) {
        int var3 = this.field1010[arg1];
        class107 var4 = method2832(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2222(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field1017 != null && arg1 < this.field1017.length) {
            int var8 = this.field1017[arg1];
            var6 = method2832(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2222(!var4.method2214(var5));
            var10.method2242(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2222(!var4.method2214(var5) & !var6.method2214(var7));
            var9.method2242(var4, var5);
            var9.method2242(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ep.v(II)Ldz;")
    public static class107 method2832(int arg0) {
        class107 var1 = (class107) field1013.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1024;
        class171 var3 = Statics.field1007;
        boolean var4 = true;
        int[] var5 = var2.method3135(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3092(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3092(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class107 var10;
        if (var4) {
            try {
                var10 = new class107(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field1013.method3562(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("c.h(I)V")
    public static void method546() {
        field1025.method3553();
        field1013.method3553();
    }
}
