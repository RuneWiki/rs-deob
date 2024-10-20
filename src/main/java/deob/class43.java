package deob;

@ObfuscatedName("aj")
public class class43 extends class204 {

    @ObfuscatedName("aj.d")
    public static class193 field1005 = new class193(64);

    @ObfuscatedName("aj.z")
    public static class193 field990 = new class193(100);

    @ObfuscatedName("aj.l")
    public int[] field994;

    @ObfuscatedName("aj.m")
    public int[] field1009;

    @ObfuscatedName("aj.p")
    public int[] field996;

    @ObfuscatedName("aj.u")
    public int[] field1007;

    @ObfuscatedName("aj.c")
    public int field998 = -1;

    @ObfuscatedName("aj.v")
    public int[] field995;

    @ObfuscatedName("aj.o")
    public boolean field1000 = false;

    @ObfuscatedName("aj.n")
    public int field1001 = 5;

    @ObfuscatedName("aj.k")
    public int field1002 = -1;

    @ObfuscatedName("aj.f")
    public int field1003 = -1;

    @ObfuscatedName("aj.x")
    public int field1004 = 99;

    @ObfuscatedName("aj.j")
    public int field993 = -1;

    @ObfuscatedName("aj.r")
    public int field1006 = -1;

    @ObfuscatedName("aj.y")
    public int field991 = 2;

    @ObfuscatedName("hw.g(Lfc;Lfc;Lfc;I)V")
    public static void method3713(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field992 = arg0;
        Statics.field592 = arg1;
        Statics.field997 = arg2;
    }

    @ObfuscatedName("cv.b(IB)Laj;")
    public static class43 method2054(int arg0) {
        class43 var1 = (class43) field1005.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field992.method3112(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method866(new class119(var2));
        }
        var3.method868();
        field1005.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.w(Ldm;S)V")
    public void method866(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method886(arg0, var2);
        }
    }

    @ObfuscatedName("aj.d(Ldm;II)V")
    public void method886(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2376();
            this.field996 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field996[var4] = arg0.method2376();
            }
            this.field994 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field994[var5] = arg0.method2376();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field994[var6] += arg0.method2376() << 16;
            }
        } else if (arg1 == 2) {
            this.field998 = arg0.method2376();
        } else if (arg1 == 3) {
            int var7 = arg0.method2362();
            this.field995 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field995[var8] = arg0.method2362();
            }
            this.field995[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1000 = true;
        } else if (arg1 == 5) {
            this.field1001 = arg0.method2362();
        } else if (arg1 == 6) {
            this.field1002 = arg0.method2376();
        } else if (arg1 == 7) {
            this.field1003 = arg0.method2376();
        } else if (arg1 == 8) {
            this.field1004 = arg0.method2362();
        } else if (arg1 == 9) {
            this.field993 = arg0.method2362();
        } else if (arg1 == 10) {
            this.field1006 = arg0.method2362();
        } else if (arg1 == 11) {
            this.field991 = arg0.method2362();
        } else if (arg1 == 12) {
            int var9 = arg0.method2362();
            this.field1009 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1009[var10] = arg0.method2376();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1009[var11] += arg0.method2376() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2362();
            this.field1007 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1007[var13] = arg0.method2366();
            }
        }
    }

    @ObfuscatedName("aj.z(I)V")
    public void method868() {
        if (this.field993 == -1) {
            if (this.field995 == null) {
                this.field993 = 0;
            } else {
                this.field993 = 2;
            }
        }
        if (this.field1006 != -1) {
            return;
        }
        if (this.field995 == null) {
            this.field1006 = 0;
        } else {
            this.field1006 = 2;
        }
    }

    @ObfuscatedName("aj.l(Ldd;II)Ldd;")
    public class105 method869(class105 arg0, int arg1) {
        int var3 = this.field994[arg1];
        class103 var4 = method2693(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2176(true);
        } else {
            class105 var6 = arg0.method2176(!var4.method2168(var5));
            var6.method2182(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aj.m(Ldd;IIS)Ldd;")
    public class105 method870(class105 arg0, int arg1, int arg2) {
        int var4 = this.field994[arg1];
        class103 var5 = method2693(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2176(true);
        }
        class105 var7 = arg0.method2176(!var5.method2168(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2187();
        } else if (var8 == 2) {
            var7.method2241();
        } else if (var8 == 3) {
            var7.method2185();
        }
        var7.method2182(var5, var6);
        if (var8 == 1) {
            var7.method2185();
        } else if (var8 == 2) {
            var7.method2241();
        } else if (var8 == 3) {
            var7.method2187();
        }
        return var7;
    }

    @ObfuscatedName("aj.p(Ldd;II)Ldd;")
    public class105 method880(class105 arg0, int arg1) {
        int var3 = this.field994[arg1];
        class103 var4 = method2693(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2195(true);
        } else {
            class105 var6 = arg0.method2195(!var4.method2168(var5));
            var6.method2182(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aj.u(Ldd;ILaj;II)Ldd;")
    public class105 method872(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field994[arg1];
        class103 var6 = method2693(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method869(arg0, arg3);
        }
        int var8 = arg2.field994[arg3];
        class103 var9 = method2693(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2176(!var6.method2168(var7));
            var11.method2182(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2176(!var6.method2168(var7) & !var9.method2168(var10));
            var12.method2183(var6, var7, var9, var10, this.field995);
            return var12;
        }
    }

    @ObfuscatedName("aj.c(Ldd;II)Ldd;")
    public class105 method873(class105 arg0, int arg1) {
        int var3 = this.field994[arg1];
        class103 var4 = method2693(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2176(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field1009 != null && arg1 < this.field1009.length) {
            int var8 = this.field1009[arg1];
            var6 = method2693(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2176(!var4.method2168(var5));
            var10.method2182(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2176(!var4.method2168(var5) & !var6.method2168(var7));
            var9.method2182(var4, var5);
            var9.method2182(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ex.v(IB)Lck;")
    public static class103 method2693(int arg0) {
        class103 var1 = (class103) field990.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method108(Statics.field592, Statics.field997, arg0, false);
        if (var2 != null) {
            field990.method3528(var2, (long) arg0);
        }
        return var2;
    }
}
