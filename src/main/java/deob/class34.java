package deob;

@ObfuscatedName("ak")
public class class34 extends class174 {

    @ObfuscatedName("ak.e")
    public static class170 field887 = new class170(64);

    @ObfuscatedName("ak.t")
    public static class170 field905 = new class170(100);

    @ObfuscatedName("ak.d")
    public int[] field889;

    @ObfuscatedName("ak.p")
    public int[] field890;

    @ObfuscatedName("ak.k")
    public int[] field891;

    @ObfuscatedName("ak.r")
    public int[] field895;

    @ObfuscatedName("ak.l")
    public int field898 = -1;

    @ObfuscatedName("ak.a")
    public int[] field884;

    @ObfuscatedName("ak.z")
    public boolean field903 = false;

    @ObfuscatedName("ak.s")
    public int field896 = 5;

    @ObfuscatedName("ak.m")
    public int field897 = -1;

    @ObfuscatedName("ak.u")
    public int field892 = -1;

    @ObfuscatedName("ak.g")
    public int field899 = 99;

    @ObfuscatedName("ak.o")
    public int field900 = -1;

    @ObfuscatedName("ak.v")
    public int field901 = -1;

    @ObfuscatedName("ak.j")
    public int field902 = 2;

    @ObfuscatedName("r.i(Leg;Leg;Leg;I)V")
    public static void method107(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field893 = arg0;
        Statics.field885 = arg1;
        Statics.field894 = arg2;
    }

    @ObfuscatedName("b.w(II)Lak;")
    public static class34 method235(int arg0) {
        class34 var1 = (class34) field887.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field893.method2970(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method729(new class127(var2));
        }
        var3.method719();
        field887.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.f(Ldz;B)V")
    public void method729(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method701(arg0, var2);
        }
    }

    @ObfuscatedName("ak.e(Ldz;II)V")
    public void method701(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2615();
            this.field891 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field891[var4] = arg0.method2615();
            }
            this.field889 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field889[var5] = arg0.method2615();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field889[var6] += arg0.method2615() << 16;
            }
        } else if (arg1 == 2) {
            this.field898 = arg0.method2615();
        } else if (arg1 == 3) {
            int var7 = arg0.method2472();
            this.field884 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field884[var8] = arg0.method2472();
            }
            this.field884[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field903 = true;
        } else if (arg1 == 5) {
            this.field896 = arg0.method2472();
        } else if (arg1 == 6) {
            this.field897 = arg0.method2615();
        } else if (arg1 == 7) {
            this.field892 = arg0.method2615();
        } else if (arg1 == 8) {
            this.field899 = arg0.method2472();
        } else if (arg1 == 9) {
            this.field900 = arg0.method2472();
        } else if (arg1 == 10) {
            this.field901 = arg0.method2472();
        } else if (arg1 == 11) {
            this.field902 = arg0.method2472();
        } else if (arg1 == 12) {
            int var9 = arg0.method2472();
            this.field890 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field890[var10] = arg0.method2615();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field890[var11] += arg0.method2615() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2472();
            this.field895 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field895[var13] = arg0.method2608();
            }
        }
    }

    @ObfuscatedName("ak.t(I)V")
    public void method719() {
        if (this.field900 == -1) {
            if (this.field884 == null) {
                this.field900 = 0;
            } else {
                this.field900 = 2;
            }
        }
        if (this.field901 != -1) {
            return;
        }
        if (this.field884 == null) {
            this.field901 = 0;
        } else {
            this.field901 = 2;
        }
    }

    @ObfuscatedName("ak.d(Ldb;II)Ldb;")
    public class112 method712(class112 arg0, int arg1) {
        int var3 = this.field889[arg1];
        class109 var4 = method1337(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2241(true);
        } else {
            class112 var6 = arg0.method2241(!var4.method2217(var5));
            var6.method2247(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.p(Ldb;IIS)Ldb;")
    public class112 method703(class112 arg0, int arg1, int arg2) {
        int var4 = this.field889[arg1];
        class109 var5 = method1337(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2241(true);
        }
        class112 var7 = arg0.method2241(!var5.method2217(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2252();
        } else if (var8 == 2) {
            var7.method2260();
        } else if (var8 == 3) {
            var7.method2301();
        }
        var7.method2247(var5, var6);
        if (var8 == 1) {
            var7.method2301();
        } else if (var8 == 2) {
            var7.method2260();
        } else if (var8 == 3) {
            var7.method2252();
        }
        return var7;
    }

    @ObfuscatedName("ak.k(Ldb;IB)Ldb;")
    public class112 method704(class112 arg0, int arg1) {
        int var3 = this.field889[arg1];
        class109 var4 = method1337(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2308(true);
        } else {
            class112 var6 = arg0.method2308(!var4.method2217(var5));
            var6.method2247(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.r(Ldb;ILak;II)Ldb;")
    public class112 method705(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field889[arg1];
        class109 var6 = method1337(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method712(arg0, arg3);
        }
        int var8 = arg2.field889[arg3];
        class109 var9 = method1337(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2241(!var6.method2217(var7));
            var11.method2247(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2241(!var6.method2217(var7) & !var9.method2217(var10));
            var12.method2248(var6, var7, var9, var10, this.field884);
            return var12;
        }
    }

    @ObfuscatedName("ak.l(Ldb;IB)Ldb;")
    public class112 method706(class112 arg0, int arg1) {
        int var3 = this.field889[arg1];
        class109 var4 = method1337(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2241(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field890 != null && arg1 < this.field890.length) {
            int var8 = this.field890[arg1];
            var6 = method1337(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2241(!var4.method2217(var5));
            var10.method2247(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2241(!var4.method2217(var5) & !var6.method2217(var7));
            var9.method2247(var4, var5);
            var9.method2247(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("by.a(IB)Ldk;")
    public static class109 method1337(int arg0) {
        class109 var1 = (class109) field905.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method2212(Statics.field885, Statics.field894, arg0, false);
        if (var2 != null) {
            field905.method3234(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("bx.z(I)V")
    public static void method1499() {
        field887.method3243();
        field905.method3243();
    }
}
