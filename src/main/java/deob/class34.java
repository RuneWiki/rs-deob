package deob;

@ObfuscatedName("az")
public class class34 extends class174 {

    @ObfuscatedName("az.o")
    public static class170 field885 = new class170(64);

    @ObfuscatedName("az.p")
    public static class170 field886 = new class170(100);

    @ObfuscatedName("az.x")
    public int[] field887;

    @ObfuscatedName("az.k")
    public int[] field889;

    @ObfuscatedName("az.r")
    public int[] field901;

    @ObfuscatedName("az.z")
    public int[] field890;

    @ObfuscatedName("az.n")
    public int field891 = -1;

    @ObfuscatedName("az.j")
    public int[] field882;

    @ObfuscatedName("az.b")
    public boolean field893 = false;

    @ObfuscatedName("az.t")
    public int field894 = 5;

    @ObfuscatedName("az.q")
    public int field895 = -1;

    @ObfuscatedName("az.e")
    public int field884 = -1;

    @ObfuscatedName("az.l")
    public int field897 = 99;

    @ObfuscatedName("az.u")
    public int field898 = -1;

    @ObfuscatedName("az.m")
    public int field896 = -1;

    @ObfuscatedName("az.a")
    public int field900 = 2;

    @ObfuscatedName("bp.g(Leu;Leu;Leu;B)V")
    public static void method1553(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field888 = arg0;
        Statics.field899 = arg1;
        Statics.field892 = arg2;
    }

    @ObfuscatedName("q.h(II)Laz;")
    public static class34 method152(int arg0) {
        class34 var1 = (class34) field885.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field888.method3080(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method709(new class127(var2));
        }
        var3.method721();
        field885.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.s(Ldw;I)V")
    public void method709(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method710(arg0, var2);
        }
    }

    @ObfuscatedName("az.o(Ldw;II)V")
    public void method710(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2501();
            this.field901 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field901[var4] = arg0.method2501();
            }
            this.field887 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field887[var5] = arg0.method2501();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field887[var6] += arg0.method2501() << 16;
            }
        } else if (arg1 == 2) {
            this.field891 = arg0.method2501();
        } else if (arg1 == 3) {
            int var7 = arg0.method2499();
            this.field882 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field882[var8] = arg0.method2499();
            }
            this.field882[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field893 = true;
        } else if (arg1 == 5) {
            this.field894 = arg0.method2499();
        } else if (arg1 == 6) {
            this.field895 = arg0.method2501();
        } else if (arg1 == 7) {
            this.field884 = arg0.method2501();
        } else if (arg1 == 8) {
            this.field897 = arg0.method2499();
        } else if (arg1 == 9) {
            this.field898 = arg0.method2499();
        } else if (arg1 == 10) {
            this.field896 = arg0.method2499();
        } else if (arg1 == 11) {
            this.field900 = arg0.method2499();
        } else if (arg1 == 12) {
            int var9 = arg0.method2499();
            this.field889 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field889[var10] = arg0.method2501();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field889[var11] += arg0.method2501() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2499();
            this.field890 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field890[var13] = arg0.method2503();
            }
        }
    }

    @ObfuscatedName("az.p(B)V")
    public void method721() {
        if (this.field898 == -1) {
            if (this.field882 == null) {
                this.field898 = 0;
            } else {
                this.field898 = 2;
            }
        }
        if (this.field896 != -1) {
            return;
        }
        if (this.field882 == null) {
            this.field896 = 0;
        } else {
            this.field896 = 2;
        }
    }

    @ObfuscatedName("az.x(Ldn;II)Ldn;")
    public class112 method712(class112 arg0, int arg1) {
        int var3 = this.field887[arg1];
        class109 var4 = method2407(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2273(true);
        } else {
            class112 var6 = arg0.method2273(!var4.method2245(var5));
            var6.method2279(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.k(Ldn;IIS)Ldn;")
    public class112 method713(class112 arg0, int arg1, int arg2) {
        int var4 = this.field887[arg1];
        class109 var5 = method2407(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2273(true);
        }
        class112 var7 = arg0.method2273(!var5.method2245(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2284();
        } else if (var8 == 2) {
            var7.method2283();
        } else if (var8 == 3) {
            var7.method2291();
        }
        var7.method2279(var5, var6);
        if (var8 == 1) {
            var7.method2291();
        } else if (var8 == 2) {
            var7.method2283();
        } else if (var8 == 3) {
            var7.method2284();
        }
        return var7;
    }

    @ObfuscatedName("az.r(Ldn;II)Ldn;")
    public class112 method714(class112 arg0, int arg1) {
        int var3 = this.field887[arg1];
        class109 var4 = method2407(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2298(true);
        } else {
            class112 var6 = arg0.method2298(!var4.method2245(var5));
            var6.method2279(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.z(Ldn;ILaz;II)Ldn;")
    public class112 method719(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field887[arg1];
        class109 var6 = method2407(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method712(arg0, arg3);
        }
        int var8 = arg2.field887[arg3];
        class109 var9 = method2407(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2273(!var6.method2245(var7));
            var11.method2279(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2273(!var6.method2245(var7) & !var9.method2245(var10));
            var12.method2280(var6, var7, var9, var10, this.field882);
            return var12;
        }
    }

    @ObfuscatedName("az.n(Ldn;II)Ldn;")
    public class112 method716(class112 arg0, int arg1) {
        int var3 = this.field887[arg1];
        class109 var4 = method2407(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2273(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field889 != null && arg1 < this.field889.length) {
            int var8 = this.field889[arg1];
            var6 = method2407(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2273(!var4.method2245(var5));
            var10.method2279(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2273(!var4.method2245(var5) & !var6.method2245(var7));
            var9.method2279(var4, var5);
            var9.method2279(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("do.j(II)Ldl;")
    public static class109 method2407(int arg0) {
        class109 var1 = (class109) field886.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method2764(Statics.field899, Statics.field892, arg0, false);
        if (var2 != null) {
            field886.method3313(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("aq.b(I)V")
    public static void method546() {
        field885.method3306();
        field886.method3306();
    }
}
