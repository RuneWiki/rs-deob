package deob;

@ObfuscatedName("ad")
public class class33 extends class173 {

    @ObfuscatedName("ad.m")
    public static class169 field874 = new class169(64);

    @ObfuscatedName("ad.n")
    public static class169 field875 = new class169(100);

    @ObfuscatedName("ad.q")
    public int[] field884;

    @ObfuscatedName("ad.a")
    public int[] field877;

    @ObfuscatedName("ad.g")
    public int[] field878;

    @ObfuscatedName("ad.j")
    public int[] field879;

    @ObfuscatedName("ad.l")
    public int field880 = -1;

    @ObfuscatedName("ad.w")
    public int[] field876;

    @ObfuscatedName("ad.z")
    public boolean field882 = false;

    @ObfuscatedName("ad.e")
    public int field873 = 5;

    @ObfuscatedName("ad.b")
    public int field881 = -1;

    @ObfuscatedName("ad.c")
    public int field885 = -1;

    @ObfuscatedName("ad.d")
    public int field889 = 99;

    @ObfuscatedName("ad.h")
    public int field887 = -1;

    @ObfuscatedName("ad.i")
    public int field888 = -1;

    @ObfuscatedName("ad.v")
    public int field886 = 2;

    @ObfuscatedName("ad.k(Ldl;I)V")
    public void method673(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method704(arg0, var2);
        }
    }

    @ObfuscatedName("ad.x(Ldl;IB)V")
    public void method704(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2450();
            this.field878 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field878[var4] = arg0.method2450();
            }
            this.field884 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field884[var5] = arg0.method2450();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field884[var6] += arg0.method2450() << 16;
            }
        } else if (arg1 == 2) {
            this.field880 = arg0.method2450();
        } else if (arg1 == 3) {
            int var7 = arg0.method2559();
            this.field876 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field876[var8] = arg0.method2559();
            }
            this.field876[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field882 = true;
        } else if (arg1 == 5) {
            this.field873 = arg0.method2559();
        } else if (arg1 == 6) {
            this.field881 = arg0.method2450();
        } else if (arg1 == 7) {
            this.field885 = arg0.method2450();
        } else if (arg1 == 8) {
            this.field889 = arg0.method2559();
        } else if (arg1 == 9) {
            this.field887 = arg0.method2559();
        } else if (arg1 == 10) {
            this.field888 = arg0.method2559();
        } else if (arg1 == 11) {
            this.field886 = arg0.method2559();
        } else if (arg1 == 12) {
            int var9 = arg0.method2559();
            this.field877 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field877[var10] = arg0.method2450();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field877[var11] += arg0.method2450() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2559();
            this.field879 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field879[var13] = arg0.method2452();
            }
        }
    }

    @ObfuscatedName("ad.m(B)V")
    public void method697() {
        if (this.field887 == -1) {
            if (this.field876 == null) {
                this.field887 = 0;
            } else {
                this.field887 = 2;
            }
        }
        if (this.field888 != -1) {
            return;
        }
        if (this.field876 == null) {
            this.field888 = 0;
        } else {
            this.field888 = 2;
        }
    }

    @ObfuscatedName("ad.n(Ldd;II)Ldd;")
    public class111 method692(class111 arg0, int arg1) {
        int var3 = this.field884[arg1];
        class108 var4 = method137(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2234(true);
        } else {
            class111 var6 = arg0.method2234(!var4.method2213(var5));
            var6.method2269(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ad.q(Ldd;III)Ldd;")
    public class111 method688(class111 arg0, int arg1, int arg2) {
        int var4 = this.field884[arg1];
        class108 var5 = method137(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2234(true);
        }
        class111 var7 = arg0.method2234(!var5.method2213(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2255();
        } else if (var8 == 2) {
            var7.method2244();
        } else if (var8 == 3) {
            var7.method2243();
        }
        var7.method2269(var5, var6);
        if (var8 == 1) {
            var7.method2243();
        } else if (var8 == 2) {
            var7.method2244();
        } else if (var8 == 3) {
            var7.method2255();
        }
        return var7;
    }

    @ObfuscatedName("ad.a(Ldd;II)Ldd;")
    public class111 method677(class111 arg0, int arg1) {
        int var3 = this.field884[arg1];
        class108 var4 = method137(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2235(true);
        } else {
            class111 var6 = arg0.method2235(!var4.method2213(var5));
            var6.method2269(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ad.g(Ldd;ILad;II)Ldd;")
    public class111 method678(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field884[arg1];
        class108 var6 = method137(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method692(arg0, arg3);
        }
        int var8 = arg2.field884[arg3];
        class108 var9 = method137(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2234(!var6.method2213(var7));
            var11.method2269(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2234(!var6.method2213(var7) & !var9.method2213(var10));
            var12.method2241(var6, var7, var9, var10, this.field876);
            return var12;
        }
    }

    @ObfuscatedName("ad.j(Ldd;II)Ldd;")
    public class111 method679(class111 arg0, int arg1) {
        int var3 = this.field884[arg1];
        class108 var4 = method137(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2234(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field877 != null && arg1 < this.field877.length) {
            int var8 = this.field877[arg1];
            var6 = method137(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2234(!var4.method2213(var5));
            var10.method2269(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2234(!var4.method2213(var5) & !var6.method2213(var7));
            var9.method2269(var4, var5);
            var9.method2269(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("e.l(II)Ldw;")
    public static class108 method137(int arg0) {
        class108 var1 = (class108) field875.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class151 var2 = Statics.field2826;
        class151 var3 = Statics.field872;
        boolean var4 = true;
        int[] var5 = var2.method2974(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2971(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2971(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class108 var10;
        if (var4) {
            try {
                var10 = new class108(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field875.method3260(var10, (long) arg0);
        }
        return var10;
    }
}
