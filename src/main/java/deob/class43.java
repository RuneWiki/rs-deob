package deob;

@ObfuscatedName("af")
public class class43 extends class204 {

    @ObfuscatedName("af.l")
    public static class193 field994 = new class193(64);

    @ObfuscatedName("af.y")
    public static class193 field995 = new class193(100);

    @ObfuscatedName("af.w")
    public int[] field996;

    @ObfuscatedName("af.u")
    public int[] field1008;

    @ObfuscatedName("af.a")
    public int[] field1004;

    @ObfuscatedName("af.e")
    public int[] field1010;

    @ObfuscatedName("af.b")
    public int field1000 = -1;

    @ObfuscatedName("af.o")
    public int[] field1001;

    @ObfuscatedName("af.m")
    public boolean field997 = false;

    @ObfuscatedName("af.x")
    public int field1003 = 5;

    @ObfuscatedName("af.k")
    public int field1002 = -1;

    @ObfuscatedName("af.n")
    public int field1005 = -1;

    @ObfuscatedName("af.j")
    public int field1006 = 99;

    @ObfuscatedName("af.t")
    public int field1007 = -1;

    @ObfuscatedName("af.z")
    public int field991 = -1;

    @ObfuscatedName("af.h")
    public int field1009 = 2;

    @ObfuscatedName("an.d(Lfn;Lfn;Lfn;I)V")
    public static void method998(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field1013 = arg0;
        Statics.field992 = arg1;
        Statics.field993 = arg2;
    }

    @ObfuscatedName("g.p(II)Laf;")
    public static class43 method578(int arg0) {
        class43 var1 = (class43) field994.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method3134(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method840(new class119(var2));
        }
        var3.method842();
        field994.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.v(Ldf;I)V")
    public void method840(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("af.l(Ldf;II)V")
    public void method841(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2359();
            this.field1004 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1004[var4] = arg0.method2359();
            }
            this.field996 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field996[var5] = arg0.method2359();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field996[var6] += arg0.method2359() << 16;
            }
        } else if (arg1 == 2) {
            this.field1000 = arg0.method2359();
        } else if (arg1 == 3) {
            int var7 = arg0.method2357();
            this.field1001 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1001[var8] = arg0.method2357();
            }
            this.field1001[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field997 = true;
        } else if (arg1 == 5) {
            this.field1003 = arg0.method2357();
        } else if (arg1 == 6) {
            this.field1002 = arg0.method2359();
        } else if (arg1 == 7) {
            this.field1005 = arg0.method2359();
        } else if (arg1 == 8) {
            this.field1006 = arg0.method2357();
        } else if (arg1 == 9) {
            this.field1007 = arg0.method2357();
        } else if (arg1 == 10) {
            this.field991 = arg0.method2357();
        } else if (arg1 == 11) {
            this.field1009 = arg0.method2357();
        } else if (arg1 == 12) {
            int var9 = arg0.method2357();
            this.field1008 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1008[var10] = arg0.method2359();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1008[var11] += arg0.method2359() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2357();
            this.field1010 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1010[var13] = arg0.method2361();
            }
        }
    }

    @ObfuscatedName("af.y(I)V")
    public void method842() {
        if (this.field1007 == -1) {
            if (this.field1001 == null) {
                this.field1007 = 0;
            } else {
                this.field1007 = 2;
            }
        }
        if (this.field991 != -1) {
            return;
        }
        if (this.field1001 == null) {
            this.field991 = 0;
        } else {
            this.field991 = 2;
        }
    }

    @ObfuscatedName("af.w(Ldn;II)Ldn;")
    public class105 method856(class105 arg0, int arg1) {
        int var3 = this.field996[arg1];
        class103 var4 = method874(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2154(true);
        } else {
            class105 var6 = arg0.method2154(!var4.method2147(var5));
            var6.method2160(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.u(Ldn;III)Ldn;")
    public class105 method844(class105 arg0, int arg1, int arg2) {
        int var4 = this.field996[arg1];
        class103 var5 = method874(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2154(true);
        }
        class105 var7 = arg0.method2154(!var5.method2147(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2165();
        } else if (var8 == 2) {
            var7.method2164();
        } else if (var8 == 3) {
            var7.method2186();
        }
        var7.method2160(var5, var6);
        if (var8 == 1) {
            var7.method2186();
        } else if (var8 == 2) {
            var7.method2164();
        } else if (var8 == 3) {
            var7.method2165();
        }
        return var7;
    }

    @ObfuscatedName("af.a(Ldn;II)Ldn;")
    public class105 method845(class105 arg0, int arg1) {
        int var3 = this.field996[arg1];
        class103 var4 = method874(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2155(true);
        } else {
            class105 var6 = arg0.method2155(!var4.method2147(var5));
            var6.method2160(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.e(Ldn;ILaf;IB)Ldn;")
    public class105 method846(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field996[arg1];
        class103 var6 = method874(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method856(arg0, arg3);
        }
        int var8 = arg2.field996[arg3];
        class103 var9 = method874(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2154(!var6.method2147(var7));
            var11.method2160(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2154(!var6.method2147(var7) & !var9.method2147(var10));
            var12.method2167(var6, var7, var9, var10, this.field1001);
            return var12;
        }
    }

    @ObfuscatedName("af.b(Ldn;II)Ldn;")
    public class105 method847(class105 arg0, int arg1) {
        int var3 = this.field996[arg1];
        class103 var4 = method874(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2154(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field1008 != null && arg1 < this.field1008.length) {
            int var8 = this.field1008[arg1];
            var6 = method874(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2154(!var4.method2147(var5));
            var10.method2160(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2154(!var4.method2147(var5) & !var6.method2147(var7));
            var9.method2160(var4, var5);
            var9.method2160(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("af.o(IB)Lcu;")
    public static class103 method874(int arg0) {
        class103 var1 = (class103) field995.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field992;
        class167 var3 = Statics.field993;
        boolean var4 = true;
        int[] var5 = var2.method3144(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3119(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3119(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class103 var10;
        if (var4) {
            try {
                var10 = new class103(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field995.method3554(var10, (long) arg0);
        }
        return var10;
    }
}
