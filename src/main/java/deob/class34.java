package deob;

@ObfuscatedName("ab")
public class class34 extends class174 {

    @ObfuscatedName("ab.o")
    public static class170 field881 = new class170(64);

    @ObfuscatedName("ab.a")
    public static class170 field866 = new class170(100);

    @ObfuscatedName("ab.h")
    public int[] field867;

    @ObfuscatedName("ab.j")
    public int[] field868;

    @ObfuscatedName("ab.f")
    public int[] field869;

    @ObfuscatedName("ab.q")
    public int[] field870;

    @ObfuscatedName("ab.l")
    public int field874 = -1;

    @ObfuscatedName("ab.d")
    public int[] field871;

    @ObfuscatedName("ab.z")
    public boolean field879 = false;

    @ObfuscatedName("ab.n")
    public int field873 = 5;

    @ObfuscatedName("ab.t")
    public int field875 = -1;

    @ObfuscatedName("ab.w")
    public int field876 = -1;

    @ObfuscatedName("ab.r")
    public int field877 = 99;

    @ObfuscatedName("ab.x")
    public int field878 = -1;

    @ObfuscatedName("ab.v")
    public int field865 = -1;

    @ObfuscatedName("ab.y")
    public int field880 = 2;

    @ObfuscatedName("cm.b(Lej;Lej;Lej;B)V")
    public static void method2030(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field2034 = arg0;
        Statics.field2770 = arg1;
        Statics.field864 = arg2;
    }

    @ObfuscatedName("m.e(II)Lab;")
    public static class34 method215(int arg0) {
        class34 var1 = (class34) field881.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2034.method3026(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method729(new class126(var2));
        }
        var3.method693();
        field881.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.g(Ldv;B)V")
    public void method729(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method705(arg0, var2);
        }
    }

    @ObfuscatedName("ab.o(Ldv;IB)V")
    public void method705(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2572();
            this.field869 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field869[var4] = arg0.method2572();
            }
            this.field867 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field867[var5] = arg0.method2572();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field867[var6] += arg0.method2572() << 16;
            }
        } else if (arg1 == 2) {
            this.field874 = arg0.method2572();
        } else if (arg1 == 3) {
            int var7 = arg0.method2436();
            this.field871 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field871[var8] = arg0.method2436();
            }
            this.field871[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field879 = true;
        } else if (arg1 == 5) {
            this.field873 = arg0.method2436();
        } else if (arg1 == 6) {
            this.field875 = arg0.method2572();
        } else if (arg1 == 7) {
            this.field876 = arg0.method2572();
        } else if (arg1 == 8) {
            this.field877 = arg0.method2436();
        } else if (arg1 == 9) {
            this.field878 = arg0.method2436();
        } else if (arg1 == 10) {
            this.field865 = arg0.method2436();
        } else if (arg1 == 11) {
            this.field880 = arg0.method2436();
        } else if (arg1 == 12) {
            int var9 = arg0.method2436();
            this.field868 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field868[var10] = arg0.method2572();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field868[var11] += arg0.method2572() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2436();
            this.field870 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field870[var13] = arg0.method2440();
            }
        }
    }

    @ObfuscatedName("ab.a(I)V")
    public void method693() {
        if (this.field878 == -1) {
            if (this.field871 == null) {
                this.field878 = 0;
            } else {
                this.field878 = 2;
            }
        }
        if (this.field865 != -1) {
            return;
        }
        if (this.field871 == null) {
            this.field865 = 0;
        } else {
            this.field865 = 2;
        }
    }

    @ObfuscatedName("ab.h(Ldp;II)Ldp;")
    public class112 method726(class112 arg0, int arg1) {
        int var3 = this.field867[arg1];
        class109 var4 = method2195(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2247(true);
        } else {
            class112 var6 = arg0.method2247(!var4.method2203(var5));
            var6.method2229(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ab.j(Ldp;III)Ldp;")
    public class112 method695(class112 arg0, int arg1, int arg2) {
        int var4 = this.field867[arg1];
        class109 var5 = method2195(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2247(true);
        }
        class112 var7 = arg0.method2247(!var5.method2203(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2234();
        } else if (var8 == 2) {
            var7.method2287();
        } else if (var8 == 3) {
            var7.method2232();
        }
        var7.method2229(var5, var6);
        if (var8 == 1) {
            var7.method2232();
        } else if (var8 == 2) {
            var7.method2287();
        } else if (var8 == 3) {
            var7.method2234();
        }
        return var7;
    }

    @ObfuscatedName("ab.f(Ldp;II)Ldp;")
    public class112 method699(class112 arg0, int arg1) {
        int var3 = this.field867[arg1];
        class109 var4 = method2195(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2224(true);
        } else {
            class112 var6 = arg0.method2224(!var4.method2203(var5));
            var6.method2229(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ab.q(Ldp;ILab;II)Ldp;")
    public class112 method697(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field867[arg1];
        class109 var6 = method2195(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method726(arg0, arg3);
        }
        int var8 = arg2.field867[arg3];
        class109 var9 = method2195(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2247(!var6.method2203(var7));
            var11.method2229(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2247(!var6.method2203(var7) & !var9.method2203(var10));
            var12.method2230(var6, var7, var9, var10, this.field871);
            return var12;
        }
    }

    @ObfuscatedName("ab.l(Ldp;IB)Ldp;")
    public class112 method698(class112 arg0, int arg1) {
        int var3 = this.field867[arg1];
        class109 var4 = method2195(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2247(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field868 != null && arg1 < this.field868.length) {
            int var8 = this.field868[arg1];
            var6 = method2195(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2247(!var4.method2203(var5));
            var10.method2229(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2247(!var4.method2203(var5) & !var6.method2203(var7));
            var9.method2229(var4, var5);
            var9.method2229(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dr.d(II)Ldo;")
    public static class109 method2195(int arg0) {
        class109 var1 = (class109) field866.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class153 var2 = Statics.field2770;
        class153 var3 = Statics.field864;
        boolean var4 = true;
        int[] var5 = var2.method3002(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3054(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3054(var8, 0);
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
            field866.method3252(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("t.z(S)V")
    public static void method125() {
        field881.method3251();
        field866.method3251();
    }
}
