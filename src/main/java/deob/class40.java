package deob;

@ObfuscatedName("am")
public class class40 extends class205 {

    @ObfuscatedName("am.f")
    public static class194 field867 = new class194(64);

    @ObfuscatedName("am.s")
    public static class194 field862 = new class194(50);

    @ObfuscatedName("am.p")
    public int field883;

    @ObfuscatedName("am.h")
    public String field864 = "null";

    @ObfuscatedName("am.g")
    public int field872 = 1;

    @ObfuscatedName("am.a")
    public int[] field874;

    @ObfuscatedName("am.r")
    public int[] field876;

    @ObfuscatedName("am.k")
    public int field868 = -1;

    @ObfuscatedName("am.m")
    public int field869 = -1;

    @ObfuscatedName("am.n")
    public int field870 = -1;

    @ObfuscatedName("am.y")
    public int field871 = -1;

    @ObfuscatedName("am.i")
    public int field898 = -1;

    @ObfuscatedName("am.j")
    public int field873 = -1;

    @ObfuscatedName("am.l")
    public int field863 = -1;

    @ObfuscatedName("am.o")
    public short[] field875;

    @ObfuscatedName("am.c")
    public short[] field861;

    @ObfuscatedName("am.x")
    public short[] field877;

    @ObfuscatedName("am.b")
    public short[] field878;

    @ObfuscatedName("am.q")
    public String[] field879 = new String[5];

    @ObfuscatedName("am.u")
    public boolean field880 = true;

    @ObfuscatedName("am.t")
    public int field881 = -1;

    @ObfuscatedName("am.d")
    public int field865 = 128;

    @ObfuscatedName("am.z")
    public int field894 = 128;

    @ObfuscatedName("am.v")
    public boolean field882 = false;

    @ObfuscatedName("am.aq")
    public int field885 = 0;

    @ObfuscatedName("am.ap")
    public int field886 = 0;

    @ObfuscatedName("am.ai")
    public int field887 = -1;

    @ObfuscatedName("am.ae")
    public int field888 = 32;

    @ObfuscatedName("am.az")
    public int[] field889;

    @ObfuscatedName("am.ah")
    public int field890 = -1;

    @ObfuscatedName("am.ar")
    public int field891 = -1;

    @ObfuscatedName("am.ab")
    public boolean field892 = true;

    @ObfuscatedName("am.aj")
    public boolean field884 = true;

    @ObfuscatedName("am.ay")
    public boolean field897 = false;

    @ObfuscatedName("am.ag")
    public int field893 = 30;

    @ObfuscatedName("ax.e(Lft;Lft;I)V")
    public static void method932(class168 arg0, class168 arg1) {
        Statics.field895 = arg0;
        Statics.field3167 = arg1;
    }

    @ObfuscatedName("fr.w(II)Lam;")
    public static class40 method3129(int arg0) {
        class40 var1 = (class40) field867.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field895.method3048(9, arg0);
        class40 var3 = new class40();
        var3.field883 = arg0;
        if (var2 != null) {
            var3.method752(new class120(var2));
        }
        var3.method732();
        field867.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.f(I)V")
    public void method732() {
    }

    @ObfuscatedName("am.s(Ldq;I)V")
    public void method752(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method734(arg0, var2);
        }
    }

    @ObfuscatedName("am.p(Ldq;IB)V")
    public void method734(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2355();
            this.field874 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field874[var4] = arg0.method2532();
            }
        } else if (arg1 == 2) {
            this.field864 = arg0.method2363();
        } else if (arg1 == 12) {
            this.field872 = arg0.method2355();
        } else if (arg1 == 13) {
            this.field868 = arg0.method2532();
        } else if (arg1 == 14) {
            this.field871 = arg0.method2532();
        } else if (arg1 == 15) {
            this.field869 = arg0.method2532();
        } else if (arg1 == 16) {
            this.field870 = arg0.method2532();
        } else if (arg1 == 17) {
            this.field871 = arg0.method2532();
            this.field898 = arg0.method2532();
            this.field873 = arg0.method2532();
            this.field863 = arg0.method2532();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field879[arg1 - 30] = arg0.method2363();
            if (this.field879[arg1 - 30].equalsIgnoreCase(class158.field2310)) {
                this.field879[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2355();
            this.field875 = new short[var5];
            this.field861 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field875[var6] = (short) arg0.method2532();
                this.field861[var6] = (short) arg0.method2532();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2355();
            this.field877 = new short[var7];
            this.field878 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field877[var8] = (short) arg0.method2532();
                this.field878[var8] = (short) arg0.method2532();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2355();
            this.field876 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field876[var10] = arg0.method2532();
            }
        } else if (arg1 == 93) {
            this.field880 = false;
        } else if (arg1 == 95) {
            this.field881 = arg0.method2532();
        } else if (arg1 == 97) {
            this.field865 = arg0.method2532();
        } else if (arg1 == 98) {
            this.field894 = arg0.method2532();
        } else if (arg1 == 99) {
            this.field882 = true;
        } else if (arg1 == 100) {
            this.field885 = arg0.method2465();
        } else if (arg1 == 101) {
            this.field886 = arg0.method2465();
        } else if (arg1 == 102) {
            this.field887 = arg0.method2532();
        } else if (arg1 == 103) {
            this.field888 = arg0.method2532();
        } else if (arg1 == 106) {
            this.field890 = arg0.method2532();
            if (this.field890 == 65535) {
                this.field890 = -1;
            }
            this.field891 = arg0.method2532();
            if (this.field891 == 65535) {
                this.field891 = -1;
            }
            int var11 = arg0.method2355();
            this.field889 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field889[var12] = arg0.method2532();
                if (this.field889[var12] == 65535) {
                    this.field889[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field892 = false;
        } else if (arg1 == 109) {
            this.field884 = false;
        } else if (arg1 == 111) {
            this.field897 = true;
        } else if (arg1 == 112) {
            this.field893 = arg0.method2355();
        }
    }

    @ObfuscatedName("am.h(Laa;ILaa;II)Ldy;")
    public final class106 method735(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field889 != null) {
            class40 var5 = this.method737();
            return var5 == null ? null : var5.method735(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field862.method3473((long) this.field883);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field874.length; var8++) {
                if (!Statics.field3167.method3032(this.field874[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field874.length];
            for (int var10 = 0; var10 < this.field874.length; var10++) {
                var9[var10] = class101.method2063(Statics.field3167, this.field874[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field875 != null) {
                for (int var12 = 0; var12 < this.field875.length; var12++) {
                    var11.method2076(this.field875[var12], this.field861[var12]);
                }
            }
            if (this.field877 != null) {
                for (int var13 = 0; var13 < this.field877.length; var13++) {
                    var11.method2077(this.field877[var13], this.field878[var13]);
                }
            }
            var6 = var11.method2078(this.field885 + 64, this.field886 * 5 + 850, -30, -50, -30);
            field862.method3475(var6, (long) this.field883);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method843(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method872(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2166(true);
        } else {
            var14 = arg2.method872(var6, arg3);
        }
        if (this.field865 != 128 || this.field894 != 128) {
            var14.method2225(this.field865, this.field894, this.field865);
        }
        return var14;
    }

    @ObfuscatedName("am.g(I)Lcp;")
    public final class101 method739() {
        if (this.field889 != null) {
            class40 var1 = this.method737();
            return var1 == null ? null : var1.method739();
        } else if (this.field876 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field876.length; var3++) {
                if (!Statics.field3167.method3032(this.field876[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field876.length];
            for (int var5 = 0; var5 < this.field876.length; var5++) {
                var4[var5] = class101.method2063(Statics.field3167, this.field876[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field875 != null) {
                for (int var7 = 0; var7 < this.field875.length; var7++) {
                    var6.method2076(this.field875[var7], this.field861[var7]);
                }
            }
            if (this.field877 != null) {
                for (int var8 = 0; var8 < this.field877.length; var8++) {
                    var6.method2077(this.field877[var8], this.field878[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("am.a(B)Lam;")
    public final class40 method737() {
        int var1 = -1;
        if (this.field890 != -1) {
            var1 = class177.method2798(this.field890);
        } else if (this.field891 != -1) {
            var1 = class177.field2904[this.field891];
        }
        return var1 < 0 || var1 >= this.field889.length || this.field889[var1] == -1 ? null : method3129(this.field889[var1]);
    }

    @ObfuscatedName("am.r(I)Z")
    public boolean method738() {
        if (this.field889 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field890 != -1) {
            var1 = class177.method2798(this.field890);
        } else if (this.field891 != -1) {
            var1 = class177.field2904[this.field891];
        }
        return var1 >= 0 && var1 < this.field889.length && this.field889[var1] != -1;
    }

    @ObfuscatedName("u.k(I)V")
    public static void method571() {
        field867.method3479();
        field862.method3479();
    }
}
