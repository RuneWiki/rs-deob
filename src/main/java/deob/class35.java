package deob;

@ObfuscatedName("ae")
public class class35 extends class176 {

    @ObfuscatedName("ae.q")
    public static class172 field918 = new class172(64);

    @ObfuscatedName("ae.j")
    public static class172 field899 = new class172(100);

    @ObfuscatedName("ae.z")
    public int[] field900;

    @ObfuscatedName("ae.m")
    public int[] field901;

    @ObfuscatedName("ae.w")
    public int[] field902;

    @ObfuscatedName("ae.a")
    public int[] field903;

    @ObfuscatedName("ae.d")
    public int field914 = -1;

    @ObfuscatedName("ae.u")
    public int[] field905;

    @ObfuscatedName("ae.p")
    public boolean field906 = false;

    @ObfuscatedName("ae.t")
    public int field897 = 5;

    @ObfuscatedName("ae.g")
    public int field908 = -1;

    @ObfuscatedName("ae.o")
    public int field909 = -1;

    @ObfuscatedName("ae.x")
    public int field916 = 99;

    @ObfuscatedName("ae.c")
    public int field911 = -1;

    @ObfuscatedName("ae.b")
    public int field912 = -1;

    @ObfuscatedName("ae.f")
    public int field913 = 2;

    @ObfuscatedName("dz.e(Lea;Lea;Lea;B)V")
    public static void method2238(class155 arg0, class155 arg1, class155 arg2) {
        Statics.field904 = arg0;
        Statics.field896 = arg1;
        Statics.field919 = arg2;
    }

    @ObfuscatedName("q.i(II)Lae;")
    public static class35 method28(int arg0) {
        class35 var1 = (class35) field918.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field904.method3069(12, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method790(new class128(var2));
        }
        var3.method756();
        field918.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.k(Ldl;I)V")
    public void method790(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method763(arg0, var2);
        }
    }

    @ObfuscatedName("ae.q(Ldl;IB)V")
    public void method763(class128 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2456();
            this.field902 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field902[var4] = arg0.method2456();
            }
            this.field900 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field900[var5] = arg0.method2456();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field900[var6] += arg0.method2456() << 16;
            }
        } else if (arg1 == 2) {
            this.field914 = arg0.method2456();
        } else if (arg1 == 3) {
            int var7 = arg0.method2548();
            this.field905 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field905[var8] = arg0.method2548();
            }
            this.field905[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field906 = true;
        } else if (arg1 == 5) {
            this.field897 = arg0.method2548();
        } else if (arg1 == 6) {
            this.field908 = arg0.method2456();
        } else if (arg1 == 7) {
            this.field909 = arg0.method2456();
        } else if (arg1 == 8) {
            this.field916 = arg0.method2548();
        } else if (arg1 == 9) {
            this.field911 = arg0.method2548();
        } else if (arg1 == 10) {
            this.field912 = arg0.method2548();
        } else if (arg1 == 11) {
            this.field913 = arg0.method2548();
        } else if (arg1 == 12) {
            int var9 = arg0.method2548();
            this.field901 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field901[var10] = arg0.method2456();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field901[var11] += arg0.method2456() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2548();
            this.field903 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field903[var13] = arg0.method2558();
            }
        }
    }

    @ObfuscatedName("ae.j(I)V")
    public void method756() {
        if (this.field911 == -1) {
            if (this.field905 == null) {
                this.field911 = 0;
            } else {
                this.field911 = 2;
            }
        }
        if (this.field912 != -1) {
            return;
        }
        if (this.field905 == null) {
            this.field912 = 0;
        } else {
            this.field912 = 2;
        }
    }

    @ObfuscatedName("ae.z(Ldo;II)Ldo;")
    public class113 method764(class113 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class110 var4 = method39(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2300(true);
        } else {
            class113 var6 = arg0.method2300(!var4.method2221(var5));
            var6.method2249(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.m(Ldo;IIB)Ldo;")
    public class113 method758(class113 arg0, int arg1, int arg2) {
        int var4 = this.field900[arg1];
        class110 var5 = method39(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2300(true);
        }
        class113 var7 = arg0.method2300(!var5.method2221(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2254();
        } else if (var8 == 2) {
            var7.method2253();
        } else if (var8 == 3) {
            var7.method2252();
        }
        var7.method2249(var5, var6);
        if (var8 == 1) {
            var7.method2252();
        } else if (var8 == 2) {
            var7.method2253();
        } else if (var8 == 3) {
            var7.method2254();
        }
        return var7;
    }

    @ObfuscatedName("ae.w(Ldo;II)Ldo;")
    public class113 method759(class113 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class110 var4 = method39(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2279(true);
        } else {
            class113 var6 = arg0.method2279(!var4.method2221(var5));
            var6.method2249(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.a(Ldo;ILae;IB)Ldo;")
    public class113 method760(class113 arg0, int arg1, class35 arg2, int arg3) {
        int var5 = this.field900[arg1];
        class110 var6 = method39(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method764(arg0, arg3);
        }
        int var8 = arg2.field900[arg3];
        class110 var9 = method39(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class113 var11 = arg0.method2300(!var6.method2221(var7));
            var11.method2249(var6, var7);
            return var11;
        } else {
            class113 var12 = arg0.method2300(!var6.method2221(var7) & !var9.method2221(var10));
            var12.method2250(var6, var7, var9, var10, this.field905);
            return var12;
        }
    }

    @ObfuscatedName("ae.d(Ldo;II)Ldo;")
    public class113 method761(class113 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class110 var4 = method39(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2300(true);
        }
        class110 var6 = null;
        int var7 = 0;
        if (this.field901 != null && arg1 < this.field901.length) {
            int var8 = this.field901[arg1];
            var6 = method39(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class113 var10 = arg0.method2300(!var4.method2221(var5));
            var10.method2249(var4, var5);
            return var10;
        } else {
            class113 var9 = arg0.method2300(!var4.method2221(var5) & !var6.method2221(var7));
            var9.method2249(var4, var5);
            var9.method2249(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("z.u(II)Ldp;")
    public static class110 method39(int arg0) {
        class110 var1 = (class110) field899.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class155 var2 = Statics.field896;
        class155 var3 = Statics.field919;
        boolean var4 = true;
        int[] var5 = var2.method3029(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3026(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3026(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class110 var10;
        if (var4) {
            try {
                var10 = new class110(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field899.method3264(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ba.p(B)V")
    public static void method1577() {
        field918.method3265();
        field899.method3265();
    }
}
