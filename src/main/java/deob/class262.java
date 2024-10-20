package deob;

@ObfuscatedName("jw")
public class class262 extends class196 {

    @ObfuscatedName("jw.r")
    public static class191 field3602 = new class191(64);

    @ObfuscatedName("jw.o")
    public static class191 field3601 = new class191(100);

    @ObfuscatedName("jw.n")
    public int[] field3614;

    @ObfuscatedName("jw.q")
    public int[] field3611;

    @ObfuscatedName("jw.b")
    public int[] field3604;

    @ObfuscatedName("jw.k")
    public int[] field3600;

    @ObfuscatedName("jw.s")
    public int field3605 = -1;

    @ObfuscatedName("jw.d")
    public int[] field3607;

    @ObfuscatedName("jw.l")
    public boolean field3608 = false;

    @ObfuscatedName("jw.t")
    public int field3597 = 5;

    @ObfuscatedName("jw.y")
    public int field3610 = -1;

    @ObfuscatedName("jw.v")
    public int field3612 = -1;

    @ObfuscatedName("jw.c")
    public int field3606 = 99;

    @ObfuscatedName("jw.z")
    public int field3613 = -1;

    @ObfuscatedName("jw.u")
    public int field3609 = -1;

    @ObfuscatedName("jw.e")
    public int field3615 = 2;

    @ObfuscatedName("hv.i(IB)Ljw;")
    public static class262 method3737(int arg0) {
        class262 var1 = (class262) field3602.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3603.method3824(12, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4350(new class175(var2));
        }
        var3.method4346();
        field3602.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.j(Lfp;I)V")
    public void method4350(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4338(arg0, var2);
        }
    }

    @ObfuscatedName("jw.a(Lfp;II)V")
    public void method4338(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2995();
            this.field3604 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3604[var4] = arg0.method2995();
            }
            this.field3614 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3614[var5] = arg0.method2995();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3614[var6] += arg0.method2995() << 16;
            }
        } else if (arg1 == 2) {
            this.field3605 = arg0.method2995();
        } else if (arg1 == 3) {
            int var7 = arg0.method2999();
            this.field3607 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3607[var8] = arg0.method2999();
            }
            this.field3607[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3608 = true;
        } else if (arg1 == 5) {
            this.field3597 = arg0.method2999();
        } else if (arg1 == 6) {
            this.field3610 = arg0.method2995();
        } else if (arg1 == 7) {
            this.field3612 = arg0.method2995();
        } else if (arg1 == 8) {
            this.field3606 = arg0.method2999();
        } else if (arg1 == 9) {
            this.field3613 = arg0.method2999();
        } else if (arg1 == 10) {
            this.field3609 = arg0.method2999();
        } else if (arg1 == 11) {
            this.field3615 = arg0.method2999();
        } else if (arg1 == 12) {
            int var9 = arg0.method2999();
            this.field3611 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3611[var10] = arg0.method2995();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3611[var11] += arg0.method2995() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2999();
            this.field3600 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3600[var13] = arg0.method2997();
            }
        }
    }

    @ObfuscatedName("jw.r(I)V")
    public void method4346() {
        if (this.field3613 == -1) {
            if (this.field3607 == null) {
                this.field3613 = 0;
            } else {
                this.field3613 = 2;
            }
        }
        if (this.field3609 != -1) {
            return;
        }
        if (this.field3607 == null) {
            this.field3609 = 0;
        } else {
            this.field3609 = 2;
        }
    }

    @ObfuscatedName("jw.o(Lem;IB)Lem;")
    public class133 method4341(class133 arg0, int arg1) {
        int var3 = this.field3614[arg1];
        class144 var4 = method2745(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2306(true);
        } else {
            class133 var6 = arg0.method2306(!var4.method2707(var5));
            var6.method2314(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jw.n(Lem;IIB)Lem;")
    public class133 method4342(class133 arg0, int arg1, int arg2) {
        int var4 = this.field3614[arg1];
        class144 var5 = method2745(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2306(true);
        }
        class133 var7 = arg0.method2306(!var5.method2707(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2382();
        } else if (var8 == 2) {
            var7.method2318();
        } else if (var8 == 3) {
            var7.method2304();
        }
        var7.method2314(var5, var6);
        if (var8 == 1) {
            var7.method2304();
        } else if (var8 == 2) {
            var7.method2318();
        } else if (var8 == 3) {
            var7.method2382();
        }
        return var7;
    }

    @ObfuscatedName("jw.q(Lem;II)Lem;")
    public class133 method4343(class133 arg0, int arg1) {
        int var3 = this.field3614[arg1];
        class144 var4 = method2745(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2325(true);
        } else {
            class133 var6 = arg0.method2325(!var4.method2707(var5));
            var6.method2314(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jw.b(Lem;ILjw;IB)Lem;")
    public class133 method4344(class133 arg0, int arg1, class262 arg2, int arg3) {
        int var5 = this.field3614[arg1];
        class144 var6 = method2745(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4341(arg0, arg3);
        }
        int var8 = arg2.field3614[arg3];
        class144 var9 = method2745(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class133 var11 = arg0.method2306(!var6.method2707(var7));
            var11.method2314(var6, var7);
            return var11;
        } else {
            class133 var12 = arg0.method2306(!var6.method2707(var7) & !var9.method2707(var10));
            var12.method2315(var6, var7, var9, var10, this.field3607);
            return var12;
        }
    }

    @ObfuscatedName("jw.k(Lem;IB)Lem;")
    public class133 method4345(class133 arg0, int arg1) {
        int var3 = this.field3614[arg1];
        class144 var4 = method2745(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2306(true);
        }
        class144 var6 = null;
        int var7 = 0;
        if (this.field3611 != null && arg1 < this.field3611.length) {
            int var8 = this.field3611[arg1];
            var6 = method2745(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class133 var10 = arg0.method2306(!var4.method2707(var5));
            var10.method2314(var4, var5);
            return var10;
        } else {
            class133 var9 = arg0.method2306(!var4.method2707(var5) & !var6.method2707(var7));
            var9.method2314(var4, var5);
            var9.method2314(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("eb.s(II)Leg;")
    public static class144 method2745(int arg0) {
        class144 var1 = (class144) field3601.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class144 var2 = class144.method191(Statics.field3598, Statics.field3599, arg0, false);
        if (var2 != null) {
            field3601.method3346(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("dv.d(S)V")
    public static void method2207() {
        field3602.method3355();
        field3601.method3355();
    }
}
