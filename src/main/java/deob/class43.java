package deob;

@ObfuscatedName("ai")
public class class43 extends class204 {

    @ObfuscatedName("ai.g")
    public static class193 field990 = new class193(64);

    @ObfuscatedName("ai.m")
    public static class193 field1010 = new class193(100);

    @ObfuscatedName("ai.t")
    public int[] field992;

    @ObfuscatedName("ai.j")
    public int[] field1007;

    @ObfuscatedName("ai.n")
    public int[] field995;

    @ObfuscatedName("ai.l")
    public int[] field999;

    @ObfuscatedName("ai.i")
    public int field996 = -1;

    @ObfuscatedName("ai.w")
    public int[] field997;

    @ObfuscatedName("ai.v")
    public boolean field998 = false;

    @ObfuscatedName("ai.o")
    public int field988 = 5;

    @ObfuscatedName("ai.p")
    public int field991 = -1;

    @ObfuscatedName("ai.b")
    public int field1001 = -1;

    @ObfuscatedName("ai.z")
    public int field1002 = 99;

    @ObfuscatedName("ai.k")
    public int field1003 = -1;

    @ObfuscatedName("ai.r")
    public int field1004 = -1;

    @ObfuscatedName("ai.d")
    public int field1005 = 2;

    @ObfuscatedName("ai.s(Ldn;I)V")
    public void method846(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method847(arg0, var2);
        }
    }

    @ObfuscatedName("ai.q(Ldn;II)V")
    public void method847(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2353();
            this.field995 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field995[var4] = arg0.method2353();
            }
            this.field992 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field992[var5] = arg0.method2353();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field992[var6] += arg0.method2353() << 16;
            }
        } else if (arg1 == 2) {
            this.field996 = arg0.method2353();
        } else if (arg1 == 3) {
            int var7 = arg0.method2363();
            this.field997 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field997[var8] = arg0.method2363();
            }
            this.field997[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field998 = true;
        } else if (arg1 == 5) {
            this.field988 = arg0.method2363();
        } else if (arg1 == 6) {
            this.field991 = arg0.method2353();
        } else if (arg1 == 7) {
            this.field1001 = arg0.method2353();
        } else if (arg1 == 8) {
            this.field1002 = arg0.method2363();
        } else if (arg1 == 9) {
            this.field1003 = arg0.method2363();
        } else if (arg1 == 10) {
            this.field1004 = arg0.method2363();
        } else if (arg1 == 11) {
            this.field1005 = arg0.method2363();
        } else if (arg1 == 12) {
            int var9 = arg0.method2363();
            this.field1007 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1007[var10] = arg0.method2353();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1007[var11] += arg0.method2353() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2363();
            this.field999 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field999[var13] = arg0.method2414();
            }
        }
    }

    @ObfuscatedName("ai.g(I)V")
    public void method877() {
        if (this.field1003 == -1) {
            if (this.field997 == null) {
                this.field1003 = 0;
            } else {
                this.field1003 = 2;
            }
        }
        if (this.field1004 != -1) {
            return;
        }
        if (this.field997 == null) {
            this.field1004 = 0;
        } else {
            this.field1004 = 2;
        }
    }

    @ObfuscatedName("ai.m(Ldu;IB)Ldu;")
    public class105 method849(class105 arg0, int arg1) {
        int var3 = this.field992[arg1];
        class103 var4 = method3259(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        } else {
            class105 var6 = arg0.method2166(!var4.method2154(var5));
            var6.method2170(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.t(Ldu;III)Ldu;")
    public class105 method850(class105 arg0, int arg1, int arg2) {
        int var4 = this.field992[arg1];
        class103 var5 = method3259(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2166(true);
        }
        class105 var7 = arg0.method2166(!var5.method2154(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2205();
        } else if (var8 == 2) {
            var7.method2217();
        } else if (var8 == 3) {
            var7.method2173();
        }
        var7.method2170(var5, var6);
        if (var8 == 1) {
            var7.method2173();
        } else if (var8 == 2) {
            var7.method2217();
        } else if (var8 == 3) {
            var7.method2205();
        }
        return var7;
    }

    @ObfuscatedName("ai.j(Ldu;II)Ldu;")
    public class105 method851(class105 arg0, int arg1) {
        int var3 = this.field992[arg1];
        class103 var4 = method3259(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2210(true);
        } else {
            class105 var6 = arg0.method2210(!var4.method2154(var5));
            var6.method2170(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.n(Ldu;ILai;II)Ldu;")
    public class105 method852(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field992[arg1];
        class103 var6 = method3259(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method849(arg0, arg3);
        }
        int var8 = arg2.field992[arg3];
        class103 var9 = method3259(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2166(!var6.method2154(var7));
            var11.method2170(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2166(!var6.method2154(var7) & !var9.method2154(var10));
            var12.method2171(var6, var7, var9, var10, this.field997);
            return var12;
        }
    }

    @ObfuscatedName("ai.l(Ldu;IB)Ldu;")
    public class105 method848(class105 arg0, int arg1) {
        int var3 = this.field992[arg1];
        class103 var4 = method3259(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field1007 != null && arg1 < this.field1007.length) {
            int var8 = this.field1007[arg1];
            var6 = method3259(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2166(!var4.method2154(var5));
            var10.method2170(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2166(!var4.method2154(var5) & !var6.method2154(var7));
            var9.method2170(var4, var5);
            var9.method2170(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fw.i(II)Lcz;")
    public static class103 method3259(int arg0) {
        class103 var1 = (class103) field1010.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field1565;
        class167 var3 = Statics.field989;
        boolean var4 = true;
        int[] var5 = var2.method3046(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3044(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3044(var8, 0);
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
            field1010.method3508(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("au.w(B)V")
    public static void method644() {
        field990.method3499();
        field1010.method3499();
    }
}
