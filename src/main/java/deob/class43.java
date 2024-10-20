package deob;

@ObfuscatedName("ah")
public class class43 extends class205 {

    @ObfuscatedName("ah.h")
    public static class194 field981 = new class194(64);

    @ObfuscatedName("ah.z")
    public static class194 field985 = new class194(100);

    @ObfuscatedName("ah.r")
    public int[] field986;

    @ObfuscatedName("ah.f")
    public int[] field998;

    @ObfuscatedName("ah.s")
    public int[] field988;

    @ObfuscatedName("ah.d")
    public int[] field989;

    @ObfuscatedName("ah.l")
    public int field982 = -1;

    @ObfuscatedName("ah.y")
    public int[] field991;

    @ObfuscatedName("ah.p")
    public boolean field992 = false;

    @ObfuscatedName("ah.k")
    public int field984 = 5;

    @ObfuscatedName("ah.o")
    public int field983 = -1;

    @ObfuscatedName("ah.b")
    public int field995 = -1;

    @ObfuscatedName("ah.j")
    public int field996 = 99;

    @ObfuscatedName("ah.a")
    public int field990 = -1;

    @ObfuscatedName("ah.u")
    public int field993 = -1;

    @ObfuscatedName("ah.c")
    public int field987 = 2;

    @ObfuscatedName("c.t(II)Lah;")
    public static class43 method168(int arg0) {
        class43 var1 = (class43) field981.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field994.method3002(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method817(new class120(var2));
        }
        var3.method819();
        field981.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.i(Ldr;B)V")
    public void method817(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method818(arg0, var2);
        }
    }

    @ObfuscatedName("ah.g(Ldr;IS)V")
    public void method818(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2310();
            this.field988 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field988[var4] = arg0.method2310();
            }
            this.field986 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field986[var5] = arg0.method2310();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field986[var6] += arg0.method2310() << 16;
            }
        } else if (arg1 == 2) {
            this.field982 = arg0.method2310();
        } else if (arg1 == 3) {
            int var7 = arg0.method2334();
            this.field991 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field991[var8] = arg0.method2334();
            }
            this.field991[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field992 = true;
        } else if (arg1 == 5) {
            this.field984 = arg0.method2334();
        } else if (arg1 == 6) {
            this.field983 = arg0.method2310();
        } else if (arg1 == 7) {
            this.field995 = arg0.method2310();
        } else if (arg1 == 8) {
            this.field996 = arg0.method2334();
        } else if (arg1 == 9) {
            this.field990 = arg0.method2334();
        } else if (arg1 == 10) {
            this.field993 = arg0.method2334();
        } else if (arg1 == 11) {
            this.field987 = arg0.method2334();
        } else if (arg1 == 12) {
            int var9 = arg0.method2334();
            this.field998 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field998[var10] = arg0.method2310();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field998[var11] += arg0.method2310() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2334();
            this.field989 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field989[var13] = arg0.method2312();
            }
        }
    }

    @ObfuscatedName("ah.h(I)V")
    public void method819() {
        if (this.field990 == -1) {
            if (this.field991 == null) {
                this.field990 = 0;
            } else {
                this.field990 = 2;
            }
        }
        if (this.field993 != -1) {
            return;
        }
        if (this.field991 == null) {
            this.field993 = 0;
        } else {
            this.field993 = 2;
        }
    }

    @ObfuscatedName("ah.z(Ldk;II)Ldk;")
    public class106 method816(class106 arg0, int arg1) {
        int var3 = this.field986[arg1];
        class104 var4 = method2784(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2104(true);
        } else {
            class106 var6 = arg0.method2104(!var4.method2090(var5));
            var6.method2110(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.r(Ldk;IIS)Ldk;")
    public class106 method827(class106 arg0, int arg1, int arg2) {
        int var4 = this.field986[arg1];
        class104 var5 = method2784(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2104(true);
        }
        class106 var7 = arg0.method2104(!var5.method2090(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2114();
        } else if (var8 == 2) {
            var7.method2150();
        } else if (var8 == 3) {
            var7.method2112();
        }
        var7.method2110(var5, var6);
        if (var8 == 1) {
            var7.method2112();
        } else if (var8 == 2) {
            var7.method2150();
        } else if (var8 == 3) {
            var7.method2114();
        }
        return var7;
    }

    @ObfuscatedName("ah.f(Ldk;II)Ldk;")
    public class106 method822(class106 arg0, int arg1) {
        int var3 = this.field986[arg1];
        class104 var4 = method2784(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2144(true);
        } else {
            class106 var6 = arg0.method2144(!var4.method2090(var5));
            var6.method2110(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.s(Ldk;ILah;II)Ldk;")
    public class106 method823(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field986[arg1];
        class104 var6 = method2784(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method816(arg0, arg3);
        }
        int var8 = arg2.field986[arg3];
        class104 var9 = method2784(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2104(!var6.method2090(var7));
            var11.method2110(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2104(!var6.method2090(var7) & !var9.method2090(var10));
            var12.method2111(var6, var7, var9, var10, this.field991);
            return var12;
        }
    }

    @ObfuscatedName("ah.d(Ldk;IB)Ldk;")
    public class106 method824(class106 arg0, int arg1) {
        int var3 = this.field986[arg1];
        class104 var4 = method2784(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2104(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field998 != null && arg1 < this.field998.length) {
            int var8 = this.field998[arg1];
            var6 = method2784(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2104(!var4.method2090(var5));
            var10.method2110(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2104(!var4.method2090(var5) & !var6.method2090(var7));
            var9.method2110(var4, var5);
            var9.method2110(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ev.l(IB)Lcd;")
    public static class104 method2784(int arg0) {
        class104 var1 = (class104) field985.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class104 var2 = class104.method205(Statics.field997, Statics.field999, arg0, false);
        if (var2 != null) {
            field985.method3461(var2, (long) arg0);
        }
        return var2;
    }
}
