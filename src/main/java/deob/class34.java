package deob;

@ObfuscatedName("af")
public class class34 extends class174 {

    @ObfuscatedName("af.t")
    public static class170 field861 = new class170(64);

    @ObfuscatedName("af.k")
    public static class170 field862 = new class170(100);

    @ObfuscatedName("af.x")
    public int[] field863;

    @ObfuscatedName("af.v")
    public int[] field869;

    @ObfuscatedName("af.g")
    public int[] field865;

    @ObfuscatedName("af.n")
    public int[] field866;

    @ObfuscatedName("af.q")
    public int field867 = -1;

    @ObfuscatedName("af.i")
    public int[] field877;

    @ObfuscatedName("af.p")
    public boolean field864 = false;

    @ObfuscatedName("af.e")
    public int field870 = 5;

    @ObfuscatedName("af.o")
    public int field871 = -1;

    @ObfuscatedName("af.j")
    public int field876 = -1;

    @ObfuscatedName("af.s")
    public int field873 = 99;

    @ObfuscatedName("af.b")
    public int field874 = -1;

    @ObfuscatedName("af.c")
    public int field875 = -1;

    @ObfuscatedName("af.m")
    public int field868 = 2;

    @ObfuscatedName("k.a(II)Laf;")
    public static class34 method30(int arg0) {
        class34 var1 = (class34) field861.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field881.method2943(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method653(new class126(var2));
        }
        var3.method655();
        field861.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.r(Ldf;B)V")
    public void method653(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method654(arg0, var2);
        }
    }

    @ObfuscatedName("af.u(Ldf;II)V")
    public void method654(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2373();
            this.field865 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field865[var4] = arg0.method2373();
            }
            this.field863 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field863[var5] = arg0.method2373();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field863[var6] += arg0.method2373() << 16;
            }
        } else if (arg1 == 2) {
            this.field867 = arg0.method2373();
        } else if (arg1 == 3) {
            int var7 = arg0.method2481();
            this.field877 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field877[var8] = arg0.method2481();
            }
            this.field877[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field864 = true;
        } else if (arg1 == 5) {
            this.field870 = arg0.method2481();
        } else if (arg1 == 6) {
            this.field871 = arg0.method2373();
        } else if (arg1 == 7) {
            this.field876 = arg0.method2373();
        } else if (arg1 == 8) {
            this.field873 = arg0.method2481();
        } else if (arg1 == 9) {
            this.field874 = arg0.method2481();
        } else if (arg1 == 10) {
            this.field875 = arg0.method2481();
        } else if (arg1 == 11) {
            this.field868 = arg0.method2481();
        } else if (arg1 == 12) {
            int var9 = arg0.method2481();
            this.field869 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field869[var10] = arg0.method2373();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field869[var11] += arg0.method2373() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2481();
            this.field866 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field866[var13] = arg0.method2382();
            }
        }
    }

    @ObfuscatedName("af.t(I)V")
    public void method655() {
        if (this.field874 == -1) {
            if (this.field877 == null) {
                this.field874 = 0;
            } else {
                this.field874 = 2;
            }
        }
        if (this.field875 != -1) {
            return;
        }
        if (this.field877 == null) {
            this.field875 = 0;
        } else {
            this.field875 = 2;
        }
    }

    @ObfuscatedName("af.k(Ldw;IB)Ldw;")
    public class112 method656(class112 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class109 var4 = method1441(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2176(true);
        } else {
            class112 var6 = arg0.method2176(!var4.method2158(var5));
            var6.method2198(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.x(Ldw;III)Ldw;")
    public class112 method657(class112 arg0, int arg1, int arg2) {
        int var4 = this.field863[arg1];
        class109 var5 = method1441(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2176(true);
        }
        class112 var7 = arg0.method2176(!var5.method2158(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2225();
        } else if (var8 == 2) {
            var7.method2186();
        } else if (var8 == 3) {
            var7.method2208();
        }
        var7.method2198(var5, var6);
        if (var8 == 1) {
            var7.method2208();
        } else if (var8 == 2) {
            var7.method2186();
        } else if (var8 == 3) {
            var7.method2225();
        }
        return var7;
    }

    @ObfuscatedName("af.v(Ldw;II)Ldw;")
    public class112 method658(class112 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class109 var4 = method1441(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2177(true);
        } else {
            class112 var6 = arg0.method2177(!var4.method2158(var5));
            var6.method2198(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.g(Ldw;ILaf;II)Ldw;")
    public class112 method666(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field863[arg1];
        class109 var6 = method1441(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method656(arg0, arg3);
        }
        int var8 = arg2.field863[arg3];
        class109 var9 = method1441(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2176(!var6.method2158(var7));
            var11.method2198(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2176(!var6.method2158(var7) & !var9.method2158(var10));
            var12.method2183(var6, var7, var9, var10, this.field877);
            return var12;
        }
    }

    @ObfuscatedName("af.n(Ldw;IS)Ldw;")
    public class112 method677(class112 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class109 var4 = method1441(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2176(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field869 != null && arg1 < this.field869.length) {
            int var8 = this.field869[arg1];
            var6 = method1441(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2176(!var4.method2158(var5));
            var10.method2198(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2176(!var4.method2158(var5) & !var6.method2158(var7));
            var9.method2198(var4, var5);
            var9.method2198(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bn.q(II)Lda;")
    public static class109 method1441(int arg0) {
        class109 var1 = (class109) field862.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field860;
        class152 var3 = Statics.field254;
        boolean var4 = true;
        int[] var5 = var2.method2960(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2949(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2949(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field862.method3210(var10, (long) arg0);
        }
        return var10;
    }
}
