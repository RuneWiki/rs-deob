package deob;

@ObfuscatedName("ai")
public class class35 extends class176 {

    @ObfuscatedName("ai.l")
    public static class172 field883 = new class172(64);

    @ObfuscatedName("ai.s")
    public static class172 field887 = new class172(100);

    @ObfuscatedName("ai.d")
    public int[] field901;

    @ObfuscatedName("ai.e")
    public int[] field889;

    @ObfuscatedName("ai.u")
    public int[] field890;

    @ObfuscatedName("ai.q")
    public int[] field906;

    @ObfuscatedName("ai.o")
    public int field888 = -1;

    @ObfuscatedName("ai.v")
    public int[] field893;

    @ObfuscatedName("ai.m")
    public boolean field892 = false;

    @ObfuscatedName("ai.x")
    public int field891 = 5;

    @ObfuscatedName("ai.w")
    public int field895 = -1;

    @ObfuscatedName("ai.p")
    public int field897 = -1;

    @ObfuscatedName("ai.z")
    public int field898 = 99;

    @ObfuscatedName("ai.h")
    public int field899 = -1;

    @ObfuscatedName("ai.a")
    public int field900 = -1;

    @ObfuscatedName("ai.c")
    public int field886 = 2;

    @ObfuscatedName("ag.i(II)Lai;")
    public static class35 method708(int arg0) {
        class35 var1 = (class35) field883.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field896.method3043(12, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method716(new class128(var2));
        }
        var3.method718();
        field883.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.b(Lds;I)V")
    public void method716(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method717(arg0, var2);
        }
    }

    @ObfuscatedName("ai.r(Lds;IB)V")
    public void method717(class128 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2473();
            this.field890 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field890[var4] = arg0.method2473();
            }
            this.field901 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field901[var5] = arg0.method2473();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field901[var6] += arg0.method2473() << 16;
            }
        } else if (arg1 == 2) {
            this.field888 = arg0.method2473();
        } else if (arg1 == 3) {
            int var7 = arg0.method2531();
            this.field893 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field893[var8] = arg0.method2531();
            }
            this.field893[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field892 = true;
        } else if (arg1 == 5) {
            this.field891 = arg0.method2531();
        } else if (arg1 == 6) {
            this.field895 = arg0.method2473();
        } else if (arg1 == 7) {
            this.field897 = arg0.method2473();
        } else if (arg1 == 8) {
            this.field898 = arg0.method2531();
        } else if (arg1 == 9) {
            this.field899 = arg0.method2531();
        } else if (arg1 == 10) {
            this.field900 = arg0.method2531();
        } else if (arg1 == 11) {
            this.field886 = arg0.method2531();
        } else if (arg1 == 12) {
            int var9 = arg0.method2531();
            this.field889 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field889[var10] = arg0.method2473();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field889[var11] += arg0.method2473() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2531();
            this.field906 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field906[var13] = arg0.method2599();
            }
        }
    }

    @ObfuscatedName("ai.l(I)V")
    public void method718() {
        if (this.field899 == -1) {
            if (this.field893 == null) {
                this.field899 = 0;
            } else {
                this.field899 = 2;
            }
        }
        if (this.field900 != -1) {
            return;
        }
        if (this.field893 == null) {
            this.field900 = 0;
        } else {
            this.field900 = 2;
        }
    }

    @ObfuscatedName("ai.s(Ldt;II)Ldt;")
    public class113 method747(class113 arg0, int arg1) {
        int var3 = this.field901[arg1];
        class110 var4 = method115(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2311(true);
        } else {
            class113 var6 = arg0.method2311(!var4.method2231(var5));
            var6.method2288(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.d(Ldt;III)Ldt;")
    public class113 method720(class113 arg0, int arg1, int arg2) {
        int var4 = this.field901[arg1];
        class110 var5 = method115(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2311(true);
        }
        class113 var7 = arg0.method2311(!var5.method2231(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2317();
        } else if (var8 == 2) {
            var7.method2302();
        } else if (var8 == 3) {
            var7.method2266();
        }
        var7.method2288(var5, var6);
        if (var8 == 1) {
            var7.method2266();
        } else if (var8 == 2) {
            var7.method2302();
        } else if (var8 == 3) {
            var7.method2317();
        }
        return var7;
    }

    @ObfuscatedName("ai.e(Ldt;II)Ldt;")
    public class113 method748(class113 arg0, int arg1) {
        int var3 = this.field901[arg1];
        class110 var4 = method115(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2309(true);
        } else {
            class113 var6 = arg0.method2309(!var4.method2231(var5));
            var6.method2288(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.u(Ldt;ILai;II)Ldt;")
    public class113 method722(class113 arg0, int arg1, class35 arg2, int arg3) {
        int var5 = this.field901[arg1];
        class110 var6 = method115(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method747(arg0, arg3);
        }
        int var8 = arg2.field901[arg3];
        class110 var9 = method115(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class113 var11 = arg0.method2311(!var6.method2231(var7));
            var11.method2288(var6, var7);
            return var11;
        } else {
            class113 var12 = arg0.method2311(!var6.method2231(var7) & !var9.method2231(var10));
            var12.method2264(var6, var7, var9, var10, this.field893);
            return var12;
        }
    }

    @ObfuscatedName("ai.q(Ldt;IB)Ldt;")
    public class113 method723(class113 arg0, int arg1) {
        int var3 = this.field901[arg1];
        class110 var4 = method115(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2311(true);
        }
        class110 var6 = null;
        int var7 = 0;
        if (this.field889 != null && arg1 < this.field889.length) {
            int var8 = this.field889[arg1];
            var6 = method115(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class113 var10 = arg0.method2311(!var4.method2231(var5));
            var10.method2288(var4, var5);
            return var10;
        } else {
            class113 var9 = arg0.method2311(!var4.method2231(var5) & !var6.method2231(var7));
            var9.method2288(var4, var5);
            var9.method2288(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("v.o(IB)Ldj;")
    public static class110 method115(int arg0) {
        class110 var1 = (class110) field887.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class110 var2 = class110.method145(Statics.field884, Statics.field885, arg0, false);
        if (var2 != null) {
            field887.method3281(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ew.v(I)V")
    public static void method2975() {
        field883.method3279();
        field887.method3279();
    }
}
