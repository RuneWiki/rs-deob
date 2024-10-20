package deob;

@ObfuscatedName("an")
public class class45 extends class208 {

    @ObfuscatedName("an.c")
    public static class197 field1024 = new class197(64);

    @ObfuscatedName("an.v")
    public static class197 field1006 = new class197(100);

    @ObfuscatedName("an.j")
    public int[] field1007;

    @ObfuscatedName("an.m")
    public int[] field1002;

    @ObfuscatedName("an.y")
    public int[] field1009;

    @ObfuscatedName("an.u")
    public int[] field1010;

    @ObfuscatedName("an.h")
    public int field1011 = -1;

    @ObfuscatedName("an.l")
    public int[] field1012;

    @ObfuscatedName("an.b")
    public boolean field1018 = false;

    @ObfuscatedName("an.g")
    public int field1013 = 5;

    @ObfuscatedName("an.e")
    public int field1015 = -1;

    @ObfuscatedName("an.p")
    public int field1016 = -1;

    @ObfuscatedName("an.s")
    public int field1017 = 99;

    @ObfuscatedName("an.w")
    public int field1023 = -1;

    @ObfuscatedName("an.i")
    public int field1019 = -1;

    @ObfuscatedName("an.r")
    public int field1020 = 2;

    @ObfuscatedName("ak.k(II)Lan;")
    public static class45 method726(int arg0) {
        class45 var1 = (class45) field1024.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method3097(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method879(new class123(var2));
        }
        var3.method898();
        field1024.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.q(Lde;I)V")
    public void method879(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("an.f(Lde;IS)V")
    public void method885(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2547();
            this.field1009 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1009[var4] = arg0.method2547();
            }
            this.field1007 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1007[var5] = arg0.method2547();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1007[var6] += arg0.method2547() << 16;
            }
        } else if (arg1 == 2) {
            this.field1011 = arg0.method2547();
        } else if (arg1 == 3) {
            int var7 = arg0.method2427();
            this.field1012 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1012[var8] = arg0.method2427();
            }
            this.field1012[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1018 = true;
        } else if (arg1 == 5) {
            this.field1013 = arg0.method2427();
        } else if (arg1 == 6) {
            this.field1015 = arg0.method2547();
        } else if (arg1 == 7) {
            this.field1016 = arg0.method2547();
        } else if (arg1 == 8) {
            this.field1017 = arg0.method2427();
        } else if (arg1 == 9) {
            this.field1023 = arg0.method2427();
        } else if (arg1 == 10) {
            this.field1019 = arg0.method2427();
        } else if (arg1 == 11) {
            this.field1020 = arg0.method2427();
        } else if (arg1 == 12) {
            int var9 = arg0.method2427();
            this.field1002 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1002[var10] = arg0.method2547();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1002[var11] += arg0.method2547() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2427();
            this.field1010 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1010[var13] = arg0.method2431();
            }
        }
    }

    @ObfuscatedName("an.c(I)V")
    public void method898() {
        if (this.field1023 == -1) {
            if (this.field1012 == null) {
                this.field1023 = 0;
            } else {
                this.field1023 = 2;
            }
        }
        if (this.field1019 != -1) {
            return;
        }
        if (this.field1012 == null) {
            this.field1019 = 0;
        } else {
            this.field1019 = 2;
        }
    }

    @ObfuscatedName("an.v(Ldj;II)Ldj;")
    public class109 method864(class109 arg0, int arg1) {
        int var3 = this.field1007[arg1];
        class107 var4 = method370(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2266(true);
        } else {
            class109 var6 = arg0.method2266(!var4.method2224(var5));
            var6.method2291(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.j(Ldj;IIB)Ldj;")
    public class109 method865(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1007[arg1];
        class107 var5 = method370(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2266(true);
        }
        class109 var7 = arg0.method2266(!var5.method2224(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2240();
        } else if (var8 == 2) {
            var7.method2239();
        } else if (var8 == 3) {
            var7.method2238();
        }
        var7.method2291(var5, var6);
        if (var8 == 1) {
            var7.method2238();
        } else if (var8 == 2) {
            var7.method2239();
        } else if (var8 == 3) {
            var7.method2240();
        }
        return var7;
    }

    @ObfuscatedName("an.m(Ldj;II)Ldj;")
    public class109 method866(class109 arg0, int arg1) {
        int var3 = this.field1007[arg1];
        class107 var4 = method370(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2231(true);
        } else {
            class109 var6 = arg0.method2231(!var4.method2224(var5));
            var6.method2291(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.y(Ldj;ILan;IB)Ldj;")
    public class109 method883(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1007[arg1];
        class107 var6 = method370(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method864(arg0, arg3);
        }
        int var8 = arg2.field1007[arg3];
        class107 var9 = method370(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2266(!var6.method2224(var7));
            var11.method2291(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2266(!var6.method2224(var7) & !var9.method2224(var10));
            var12.method2296(var6, var7, var9, var10, this.field1012);
            return var12;
        }
    }

    @ObfuscatedName("an.u(Ldj;II)Ldj;")
    public class109 method868(class109 arg0, int arg1) {
        int var3 = this.field1007[arg1];
        class107 var4 = method370(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2266(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field1002 != null && arg1 < this.field1002.length) {
            int var8 = this.field1002[arg1];
            var6 = method370(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2266(!var4.method2224(var5));
            var10.method2291(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2266(!var4.method2224(var5) & !var6.method2224(var7));
            var9.method2291(var4, var5);
            var9.method2291(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("client.h(II)Ldh;")
    public static class107 method370(int arg0) {
        class107 var1 = (class107) field1006.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1029;
        class171 var3 = Statics.field1021;
        boolean var4 = true;
        int[] var5 = var2.method3081(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3078(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3078(var8, 0);
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
            field1006.method3537(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("du.l(I)V")
    public static void method2370() {
        field1024.method3538();
        field1006.method3538();
    }
}
