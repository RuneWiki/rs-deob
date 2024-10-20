package deob;

@ObfuscatedName("aa")
public class class43 extends class204 {

    @ObfuscatedName("aa.n")
    public static class193 field981 = new class193(64);

    @ObfuscatedName("aa.x")
    public static class193 field984 = new class193(100);

    @ObfuscatedName("aa.q")
    public int[] field983;

    @ObfuscatedName("aa.h")
    public int[] field982;

    @ObfuscatedName("aa.d")
    public int[] field985;

    @ObfuscatedName("aa.c")
    public int[] field986;

    @ObfuscatedName("aa.y")
    public int field987 = -1;

    @ObfuscatedName("aa.m")
    public int[] field989;

    @ObfuscatedName("aa.e")
    public boolean field990 = false;

    @ObfuscatedName("aa.z")
    public int field996 = 5;

    @ObfuscatedName("aa.t")
    public int field991 = -1;

    @ObfuscatedName("aa.b")
    public int field992 = -1;

    @ObfuscatedName("aa.l")
    public int field993 = 99;

    @ObfuscatedName("aa.s")
    public int field994 = -1;

    @ObfuscatedName("aa.f")
    public int field979 = -1;

    @ObfuscatedName("aa.g")
    public int field995 = 2;

    @ObfuscatedName("ds.i(IB)Laa;")
    public static class43 method2299(int arg0) {
        class43 var1 = (class43) field981.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2158.method3035(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method886(new class119(var2));
        }
        var3.method866();
        field981.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.v(Ldx;I)V")
    public void method886(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method865(arg0, var2);
        }
    }

    @ObfuscatedName("aa.r(Ldx;II)V")
    public void method865(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2347();
            this.field985 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field985[var4] = arg0.method2347();
            }
            this.field983 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field983[var5] = arg0.method2347();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field983[var6] += arg0.method2347() << 16;
            }
        } else if (arg1 == 2) {
            this.field987 = arg0.method2347();
        } else if (arg1 == 3) {
            int var7 = arg0.method2380();
            this.field989 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field989[var8] = arg0.method2380();
            }
            this.field989[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field990 = true;
        } else if (arg1 == 5) {
            this.field996 = arg0.method2380();
        } else if (arg1 == 6) {
            this.field991 = arg0.method2347();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2347();
        } else if (arg1 == 8) {
            this.field993 = arg0.method2380();
        } else if (arg1 == 9) {
            this.field994 = arg0.method2380();
        } else if (arg1 == 10) {
            this.field979 = arg0.method2380();
        } else if (arg1 == 11) {
            this.field995 = arg0.method2380();
        } else if (arg1 == 12) {
            int var9 = arg0.method2380();
            this.field982 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field982[var10] = arg0.method2347();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field982[var11] += arg0.method2347() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2380();
            this.field986 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field986[var13] = arg0.method2349();
            }
        }
    }

    @ObfuscatedName("aa.n(B)V")
    public void method866() {
        if (this.field994 == -1) {
            if (this.field989 == null) {
                this.field994 = 0;
            } else {
                this.field994 = 2;
            }
        }
        if (this.field979 != -1) {
            return;
        }
        if (this.field989 == null) {
            this.field979 = 0;
        } else {
            this.field979 = 2;
        }
    }

    @ObfuscatedName("aa.x(Ldj;II)Ldj;")
    public class105 method867(class105 arg0, int arg1) {
        int var3 = this.field983[arg1];
        class103 var4 = method59(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2150(true);
        } else {
            class105 var6 = arg0.method2150(!var4.method2138(var5));
            var6.method2156(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.q(Ldj;III)Ldj;")
    public class105 method868(class105 arg0, int arg1, int arg2) {
        int var4 = this.field983[arg1];
        class103 var5 = method59(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2150(true);
        }
        class105 var7 = arg0.method2150(!var5.method2138(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2160();
        } else if (var8 == 2) {
            var7.method2159();
        } else if (var8 == 3) {
            var7.method2158();
        }
        var7.method2156(var5, var6);
        if (var8 == 1) {
            var7.method2158();
        } else if (var8 == 2) {
            var7.method2159();
        } else if (var8 == 3) {
            var7.method2160();
        }
        return var7;
    }

    @ObfuscatedName("aa.h(Ldj;IB)Ldj;")
    public class105 method890(class105 arg0, int arg1) {
        int var3 = this.field983[arg1];
        class103 var4 = method59(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2151(true);
        } else {
            class105 var6 = arg0.method2151(!var4.method2138(var5));
            var6.method2156(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.d(Ldj;ILaa;II)Ldj;")
    public class105 method870(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field983[arg1];
        class103 var6 = method59(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method867(arg0, arg3);
        }
        int var8 = arg2.field983[arg3];
        class103 var9 = method59(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2150(!var6.method2138(var7));
            var11.method2156(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2150(!var6.method2138(var7) & !var9.method2138(var10));
            var12.method2157(var6, var7, var9, var10, this.field989);
            return var12;
        }
    }

    @ObfuscatedName("aa.c(Ldj;IB)Ldj;")
    public class105 method874(class105 arg0, int arg1) {
        int var3 = this.field983[arg1];
        class103 var4 = method59(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2150(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field982 != null && arg1 < this.field982.length) {
            int var8 = this.field982[arg1];
            var6 = method59(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2150(!var4.method2138(var5));
            var10.method2156(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2150(!var4.method2138(var5) & !var6.method2138(var7));
            var9.method2156(var4, var5);
            var9.method2156(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("q.y(II)Lcn;")
    public static class103 method59(int arg0) {
        class103 var1 = (class103) field984.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method162(Statics.field999, Statics.field980, arg0, false);
        if (var2 != null) {
            field984.method3466(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("j.m(B)V")
    public static void method594() {
        field981.method3467();
        field984.method3467();
    }
}
