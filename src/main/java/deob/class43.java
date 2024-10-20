package deob;

@ObfuscatedName("av")
public class class43 extends class204 {

    @ObfuscatedName("av.d")
    public static class193 field979 = new class193(64);

    @ObfuscatedName("av.o")
    public static class193 field980 = new class193(100);

    @ObfuscatedName("av.c")
    public int[] field984;

    @ObfuscatedName("av.p")
    public int[] field993;

    @ObfuscatedName("av.j")
    public int[] field978;

    @ObfuscatedName("av.a")
    public int[] field990;

    @ObfuscatedName("av.y")
    public int field985 = -1;

    @ObfuscatedName("av.h")
    public int[] field981;

    @ObfuscatedName("av.z")
    public boolean field987 = false;

    @ObfuscatedName("av.w")
    public int field988 = 5;

    @ObfuscatedName("av.l")
    public int field989 = -1;

    @ObfuscatedName("av.q")
    public int field986 = -1;

    @ObfuscatedName("av.x")
    public int field991 = 99;

    @ObfuscatedName("av.s")
    public int field992 = -1;

    @ObfuscatedName("av.n")
    public int field983 = -1;

    @ObfuscatedName("av.u")
    public int field994 = 2;

    @ObfuscatedName("cp.v(Lfh;Lfh;Lfh;I)V")
    public static void method2138(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field982 = arg0;
        Statics.field3173 = arg1;
        Statics.field977 = arg2;
    }

    @ObfuscatedName("g.f(II)Lav;")
    public static class43 method616(int arg0) {
        class43 var1 = (class43) field979.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field982.method3082(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method860(new class119(var2));
        }
        var3.method843();
        field979.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.i(Ldx;I)V")
    public void method860(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("av.d(Ldx;IB)V")
    public void method841(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2334();
            this.field978 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field978[var4] = arg0.method2334();
            }
            this.field984 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field984[var5] = arg0.method2334();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field984[var6] += arg0.method2334() << 16;
            }
        } else if (arg1 == 2) {
            this.field985 = arg0.method2334();
        } else if (arg1 == 3) {
            int var7 = arg0.method2400();
            this.field981 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field981[var8] = arg0.method2400();
            }
            this.field981[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field987 = true;
        } else if (arg1 == 5) {
            this.field988 = arg0.method2400();
        } else if (arg1 == 6) {
            this.field989 = arg0.method2334();
        } else if (arg1 == 7) {
            this.field986 = arg0.method2334();
        } else if (arg1 == 8) {
            this.field991 = arg0.method2400();
        } else if (arg1 == 9) {
            this.field992 = arg0.method2400();
        } else if (arg1 == 10) {
            this.field983 = arg0.method2400();
        } else if (arg1 == 11) {
            this.field994 = arg0.method2400();
        } else if (arg1 == 12) {
            int var9 = arg0.method2400();
            this.field993 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field993[var10] = arg0.method2334();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field993[var11] += arg0.method2334() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2400();
            this.field990 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field990[var13] = arg0.method2353();
            }
        }
    }

    @ObfuscatedName("av.o(I)V")
    public void method843() {
        if (this.field992 == -1) {
            if (this.field981 == null) {
                this.field992 = 0;
            } else {
                this.field992 = 2;
            }
        }
        if (this.field983 != -1) {
            return;
        }
        if (this.field981 == null) {
            this.field983 = 0;
        } else {
            this.field983 = 2;
        }
    }

    @ObfuscatedName("av.c(Ldq;II)Ldq;")
    public class105 method844(class105 arg0, int arg1) {
        int var3 = this.field984[arg1];
        class103 var4 = method942(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2156(true);
        } else {
            class105 var6 = arg0.method2156(!var4.method2142(var5));
            var6.method2162(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.p(Ldq;IIB)Ldq;")
    public class105 method845(class105 arg0, int arg1, int arg2) {
        int var4 = this.field984[arg1];
        class103 var5 = method942(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2156(true);
        }
        class105 var7 = arg0.method2156(!var5.method2142(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2219();
        } else if (var8 == 2) {
            var7.method2166();
        } else if (var8 == 3) {
            var7.method2165();
        }
        var7.method2162(var5, var6);
        if (var8 == 1) {
            var7.method2165();
        } else if (var8 == 2) {
            var7.method2166();
        } else if (var8 == 3) {
            var7.method2219();
        }
        return var7;
    }

    @ObfuscatedName("av.j(Ldq;IB)Ldq;")
    public class105 method848(class105 arg0, int arg1) {
        int var3 = this.field984[arg1];
        class103 var4 = method942(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2157(true);
        } else {
            class105 var6 = arg0.method2157(!var4.method2142(var5));
            var6.method2162(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.a(Ldq;ILav;II)Ldq;")
    public class105 method847(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field984[arg1];
        class103 var6 = method942(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method844(arg0, arg3);
        }
        int var8 = arg2.field984[arg3];
        class103 var9 = method942(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2156(!var6.method2142(var7));
            var11.method2162(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2156(!var6.method2142(var7) & !var9.method2142(var10));
            var12.method2210(var6, var7, var9, var10, this.field981);
            return var12;
        }
    }

    @ObfuscatedName("av.y(Ldq;II)Ldq;")
    public class105 method842(class105 arg0, int arg1) {
        int var3 = this.field984[arg1];
        class103 var4 = method942(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2156(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field993 != null && arg1 < this.field993.length) {
            int var8 = this.field993[arg1];
            var6 = method942(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2156(!var4.method2142(var5));
            var10.method2162(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2156(!var4.method2142(var5) & !var6.method2142(var7));
            var9.method2162(var4, var5);
            var9.method2162(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ap.h(II)Lcw;")
    public static class103 method942(int arg0) {
        class103 var1 = (class103) field980.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method885(Statics.field3173, Statics.field977, arg0, false);
        if (var2 != null) {
            field980.method3502(var2, (long) arg0);
        }
        return var2;
    }
}
