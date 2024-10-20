package deob;

@ObfuscatedName("al")
public class class43 extends class204 {

    @ObfuscatedName("al.i")
    public static class193 field985 = new class193(64);

    @ObfuscatedName("al.f")
    public static class193 field986 = new class193(100);

    @ObfuscatedName("al.m")
    public int[] field987;

    @ObfuscatedName("al.o")
    public int[] field988;

    @ObfuscatedName("al.h")
    public int[] field989;

    @ObfuscatedName("al.n")
    public int[] field996;

    @ObfuscatedName("al.k")
    public int field984 = -1;

    @ObfuscatedName("al.r")
    public int[] field992;

    @ObfuscatedName("al.b")
    public boolean field993 = false;

    @ObfuscatedName("al.q")
    public int field994 = 5;

    @ObfuscatedName("al.u")
    public int field995 = -1;

    @ObfuscatedName("al.g")
    public int field1005 = -1;

    @ObfuscatedName("al.y")
    public int field997 = 99;

    @ObfuscatedName("al.s")
    public int field1000 = -1;

    @ObfuscatedName("al.d")
    public int field999 = -1;

    @ObfuscatedName("al.z")
    public int field991 = 2;

    @ObfuscatedName("as.j(IB)Lal;")
    public static class43 method729(int arg0) {
        class43 var1 = (class43) field985.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method3005(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method848(new class119(var2));
        }
        var3.method850();
        field985.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.l(Ldc;I)V")
    public void method848(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method849(arg0, var2);
        }
    }

    @ObfuscatedName("al.a(Ldc;II)V")
    public void method849(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2318();
            this.field989 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field989[var4] = arg0.method2318();
            }
            this.field987 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field987[var5] = arg0.method2318();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field987[var6] += arg0.method2318() << 16;
            }
        } else if (arg1 == 2) {
            this.field984 = arg0.method2318();
        } else if (arg1 == 3) {
            int var7 = arg0.method2316();
            this.field992 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field992[var8] = arg0.method2316();
            }
            this.field992[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field993 = true;
        } else if (arg1 == 5) {
            this.field994 = arg0.method2316();
        } else if (arg1 == 6) {
            this.field995 = arg0.method2318();
        } else if (arg1 == 7) {
            this.field1005 = arg0.method2318();
        } else if (arg1 == 8) {
            this.field997 = arg0.method2316();
        } else if (arg1 == 9) {
            this.field1000 = arg0.method2316();
        } else if (arg1 == 10) {
            this.field999 = arg0.method2316();
        } else if (arg1 == 11) {
            this.field991 = arg0.method2316();
        } else if (arg1 == 12) {
            int var9 = arg0.method2316();
            this.field988 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field988[var10] = arg0.method2318();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field988[var11] += arg0.method2318() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2316();
            this.field996 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field996[var13] = arg0.method2416();
            }
        }
    }

    @ObfuscatedName("al.i(B)V")
    public void method850() {
        if (this.field1000 == -1) {
            if (this.field992 == null) {
                this.field1000 = 0;
            } else {
                this.field1000 = 2;
            }
        }
        if (this.field999 != -1) {
            return;
        }
        if (this.field992 == null) {
            this.field999 = 0;
        } else {
            this.field999 = 2;
        }
    }

    @ObfuscatedName("al.f(Ldd;II)Ldd;")
    public class105 method851(class105 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class103 var4 = method6(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2183(true);
        } else {
            class105 var6 = arg0.method2183(!var4.method2126(var5));
            var6.method2186(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("al.m(Ldd;IIB)Ldd;")
    public class105 method857(class105 arg0, int arg1, int arg2) {
        int var4 = this.field987[arg1];
        class103 var5 = method6(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2183(true);
        }
        class105 var7 = arg0.method2183(!var5.method2126(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2134();
        } else if (var8 == 2) {
            var7.method2139();
        } else if (var8 == 3) {
            var7.method2138();
        }
        var7.method2186(var5, var6);
        if (var8 == 1) {
            var7.method2138();
        } else if (var8 == 2) {
            var7.method2139();
        } else if (var8 == 3) {
            var7.method2134();
        }
        return var7;
    }

    @ObfuscatedName("al.o(Ldd;II)Ldd;")
    public class105 method865(class105 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class103 var4 = method6(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        } else {
            class105 var6 = arg0.method2166(!var4.method2126(var5));
            var6.method2186(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("al.h(Ldd;ILal;II)Ldd;")
    public class105 method855(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field987[arg1];
        class103 var6 = method6(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method851(arg0, arg3);
        }
        int var8 = arg2.field987[arg3];
        class103 var9 = method6(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2183(!var6.method2126(var7));
            var11.method2186(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2183(!var6.method2126(var7) & !var9.method2126(var10));
            var12.method2136(var6, var7, var9, var10, this.field992);
            return var12;
        }
    }

    @ObfuscatedName("al.n(Ldd;II)Ldd;")
    public class105 method853(class105 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class103 var4 = method6(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2183(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field988 != null && arg1 < this.field988.length) {
            int var8 = this.field988[arg1];
            var6 = method6(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2183(!var4.method2126(var5));
            var10.method2186(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2183(!var4.method2126(var5) & !var6.method2126(var7));
            var9.method2186(var4, var5);
            var9.method2186(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("l.k(II)Lcs;")
    public static class103 method6(int arg0) {
        class103 var1 = (class103) field986.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method738(Statics.field1002, Statics.field2047, arg0, false);
        if (var2 != null) {
            field986.method3468(var2, (long) arg0);
        }
        return var2;
    }
}
