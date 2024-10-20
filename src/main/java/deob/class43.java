package deob;

@ObfuscatedName("ao")
public class class43 extends class205 {

    @ObfuscatedName("ao.p")
    public static class194 field994 = new class194(64);

    @ObfuscatedName("ao.e")
    public static class194 field995 = new class194(100);

    @ObfuscatedName("ao.y")
    public int[] field996;

    @ObfuscatedName("ao.m")
    public int[] field1007;

    @ObfuscatedName("ao.c")
    public int[] field998;

    @ObfuscatedName("ao.v")
    public int[] field999;

    @ObfuscatedName("ao.l")
    public int field1000 = -1;

    @ObfuscatedName("ao.z")
    public int[] field1004;

    @ObfuscatedName("ao.s")
    public boolean field1002 = false;

    @ObfuscatedName("ao.j")
    public int field1003 = 5;

    @ObfuscatedName("ao.q")
    public int field997 = -1;

    @ObfuscatedName("ao.a")
    public int field1001 = -1;

    @ObfuscatedName("ao.d")
    public int field1006 = 99;

    @ObfuscatedName("ao.u")
    public int field1012 = -1;

    @ObfuscatedName("ao.i")
    public int field1005 = -1;

    @ObfuscatedName("ao.o")
    public int field1009 = 2;

    @ObfuscatedName("cp.w(Lfx;Lfx;Lfx;I)V")
    public static void method2050(class168 arg0, class168 arg1, class168 arg2) {
        Statics.field1008 = arg0;
        Statics.field993 = arg1;
        Statics.field2049 = arg2;
    }

    @ObfuscatedName("ce.x(II)Lao;")
    public static class43 method2054(int arg0) {
        class43 var1 = (class43) field994.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method3127(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method898(new class120(var2));
        }
        var3.method882();
        field994.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.t(Lde;I)V")
    public void method898(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("ao.p(Lde;II)V")
    public void method881(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2365();
            this.field998 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field998[var4] = arg0.method2365();
            }
            this.field996 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field996[var5] = arg0.method2365();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field996[var6] += arg0.method2365() << 16;
            }
        } else if (arg1 == 2) {
            this.field1000 = arg0.method2365();
        } else if (arg1 == 3) {
            int var7 = arg0.method2363();
            this.field1004 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1004[var8] = arg0.method2363();
            }
            this.field1004[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1002 = true;
        } else if (arg1 == 5) {
            this.field1003 = arg0.method2363();
        } else if (arg1 == 6) {
            this.field997 = arg0.method2365();
        } else if (arg1 == 7) {
            this.field1001 = arg0.method2365();
        } else if (arg1 == 8) {
            this.field1006 = arg0.method2363();
        } else if (arg1 == 9) {
            this.field1012 = arg0.method2363();
        } else if (arg1 == 10) {
            this.field1005 = arg0.method2363();
        } else if (arg1 == 11) {
            this.field1009 = arg0.method2363();
        } else if (arg1 == 12) {
            int var9 = arg0.method2363();
            this.field1007 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1007[var10] = arg0.method2365();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1007[var11] += arg0.method2365() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2363();
            this.field999 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field999[var13] = arg0.method2367();
            }
        }
    }

    @ObfuscatedName("ao.e(I)V")
    public void method882() {
        if (this.field1012 == -1) {
            if (this.field1004 == null) {
                this.field1012 = 0;
            } else {
                this.field1012 = 2;
            }
        }
        if (this.field1005 != -1) {
            return;
        }
        if (this.field1004 == null) {
            this.field1005 = 0;
        } else {
            this.field1005 = 2;
        }
    }

    @ObfuscatedName("ao.y(Ldp;IS)Ldp;")
    public class106 method883(class106 arg0, int arg1) {
        int var3 = this.field996[arg1];
        class104 var4 = method185(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2178(true);
        } else {
            class106 var6 = arg0.method2178(!var4.method2152(var5));
            var6.method2234(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.m(Ldp;III)Ldp;")
    public class106 method900(class106 arg0, int arg1, int arg2) {
        int var4 = this.field996[arg1];
        class104 var5 = method185(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2178(true);
        }
        class106 var7 = arg0.method2178(!var5.method2152(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2171();
        } else if (var8 == 2) {
            var7.method2174();
        } else if (var8 == 3) {
            var7.method2177();
        }
        var7.method2234(var5, var6);
        if (var8 == 1) {
            var7.method2177();
        } else if (var8 == 2) {
            var7.method2174();
        } else if (var8 == 3) {
            var7.method2171();
        }
        return var7;
    }

    @ObfuscatedName("ao.c(Ldp;II)Ldp;")
    public class106 method885(class106 arg0, int arg1) {
        int var3 = this.field996[arg1];
        class104 var4 = method185(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2169(true);
        } else {
            class106 var6 = arg0.method2169(!var4.method2152(var5));
            var6.method2234(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.v(Ldp;ILao;IB)Ldp;")
    public class106 method890(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field996[arg1];
        class104 var6 = method185(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method883(arg0, arg3);
        }
        int var8 = arg2.field996[arg3];
        class104 var9 = method185(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2178(!var6.method2152(var7));
            var11.method2234(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2178(!var6.method2152(var7) & !var9.method2152(var10));
            var12.method2175(var6, var7, var9, var10, this.field1004);
            return var12;
        }
    }

    @ObfuscatedName("ao.l(Ldp;IB)Ldp;")
    public class106 method887(class106 arg0, int arg1) {
        int var3 = this.field996[arg1];
        class104 var4 = method185(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2178(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field1007 != null && arg1 < this.field1007.length) {
            int var8 = this.field1007[arg1];
            var6 = method185(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2178(!var4.method2152(var5));
            var10.method2234(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2178(!var4.method2152(var5) & !var6.method2152(var7));
            var9.method2234(var4, var5);
            var9.method2234(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("i.z(IB)Lco;")
    public static class104 method185(int arg0) {
        class104 var1 = (class104) field995.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class168 var2 = Statics.field993;
        class168 var3 = Statics.field2049;
        boolean var4 = true;
        int[] var5 = var2.method3124(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3086(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3086(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class104 var10;
        if (var4) {
            try {
                var10 = new class104(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field995.method3522(var10, (long) arg0);
        }
        return var10;
    }
}
