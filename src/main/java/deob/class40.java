package deob;

@ObfuscatedName("aj")
public class class40 extends class204 {

    @ObfuscatedName("aj.f")
    public static class193 field899 = new class193(64);

    @ObfuscatedName("aj.h")
    public static class193 field900 = new class193(50);

    @ObfuscatedName("aj.a")
    public int field911;

    @ObfuscatedName("aj.s")
    public String field902 = "null";

    @ObfuscatedName("aj.p")
    public int field903 = 1;

    @ObfuscatedName("aj.r")
    public int[] field904;

    @ObfuscatedName("aj.k")
    public int[] field916;

    @ObfuscatedName("aj.d")
    public int field901 = -1;

    @ObfuscatedName("aj.n")
    public int field907 = -1;

    @ObfuscatedName("aj.z")
    public int field908 = -1;

    @ObfuscatedName("aj.c")
    public int field913 = -1;

    @ObfuscatedName("aj.b")
    public int field910 = -1;

    @ObfuscatedName("aj.w")
    public int field917 = -1;

    @ObfuscatedName("aj.g")
    public int field912 = -1;

    @ObfuscatedName("aj.x")
    public short[] field914;

    @ObfuscatedName("aj.o")
    public short[] field919;

    @ObfuscatedName("aj.l")
    public short[] field915;

    @ObfuscatedName("aj.j")
    public short[] field905;

    @ObfuscatedName("aj.m")
    public String[] field909 = new String[5];

    @ObfuscatedName("aj.e")
    public boolean field918 = true;

    @ObfuscatedName("aj.u")
    public int field924 = -1;

    @ObfuscatedName("aj.y")
    public int field920 = 128;

    @ObfuscatedName("aj.t")
    public int field926 = 128;

    @ObfuscatedName("aj.q")
    public boolean field922 = false;

    @ObfuscatedName("aj.ak")
    public int field923 = 0;

    @ObfuscatedName("aj.ap")
    public int field929 = 0;

    @ObfuscatedName("aj.al")
    public int field925 = -1;

    @ObfuscatedName("aj.ab")
    public int field906 = 32;

    @ObfuscatedName("aj.at")
    public int[] field927;

    @ObfuscatedName("aj.au")
    public int field928 = -1;

    @ObfuscatedName("aj.ae")
    public int field921 = -1;

    @ObfuscatedName("aj.ax")
    public boolean field930 = true;

    @ObfuscatedName("aj.aq")
    public boolean field931 = true;

    @ObfuscatedName("aj.az")
    public boolean field932 = false;

    @ObfuscatedName("aj.ac")
    public int field933 = 30;

    @ObfuscatedName("c.i(IB)Laj;")
    public static class40 method151(int arg0) {
        class40 var1 = (class40) field899.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field897.method3080(9, arg0);
        class40 var3 = new class40();
        var3.field911 = arg0;
        if (var2 != null) {
            var3.method735(new class119(var2));
        }
        var3.method714();
        field899.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.v(I)V")
    public void method714() {
    }

    @ObfuscatedName("aj.f(Ldj;B)V")
    public void method735(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method716(arg0, var2);
        }
    }

    @ObfuscatedName("aj.h(Ldj;IB)V")
    public void method716(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2310();
            this.field904 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field904[var4] = arg0.method2312();
            }
        } else if (arg1 == 2) {
            this.field902 = arg0.method2318();
        } else if (arg1 == 12) {
            this.field903 = arg0.method2310();
        } else if (arg1 == 13) {
            this.field901 = arg0.method2312();
        } else if (arg1 == 14) {
            this.field913 = arg0.method2312();
        } else if (arg1 == 15) {
            this.field907 = arg0.method2312();
        } else if (arg1 == 16) {
            this.field908 = arg0.method2312();
        } else if (arg1 == 17) {
            this.field913 = arg0.method2312();
            this.field910 = arg0.method2312();
            this.field917 = arg0.method2312();
            this.field912 = arg0.method2312();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field909[arg1 - 30] = arg0.method2318();
            if (this.field909[arg1 - 30].equalsIgnoreCase(class157.field2548)) {
                this.field909[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2310();
            this.field914 = new short[var5];
            this.field919 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field914[var6] = (short) arg0.method2312();
                this.field919[var6] = (short) arg0.method2312();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2310();
            this.field915 = new short[var7];
            this.field905 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field915[var8] = (short) arg0.method2312();
                this.field905[var8] = (short) arg0.method2312();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2310();
            this.field916 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field916[var10] = arg0.method2312();
            }
        } else if (arg1 == 93) {
            this.field918 = false;
        } else if (arg1 == 95) {
            this.field924 = arg0.method2312();
        } else if (arg1 == 97) {
            this.field920 = arg0.method2312();
        } else if (arg1 == 98) {
            this.field926 = arg0.method2312();
        } else if (arg1 == 99) {
            this.field922 = true;
        } else if (arg1 == 100) {
            this.field923 = arg0.method2311();
        } else if (arg1 == 101) {
            this.field929 = arg0.method2311() * 5;
        } else if (arg1 == 102) {
            this.field925 = arg0.method2312();
        } else if (arg1 == 103) {
            this.field906 = arg0.method2312();
        } else if (arg1 == 106) {
            this.field928 = arg0.method2312();
            if (this.field928 == 65535) {
                this.field928 = -1;
            }
            this.field921 = arg0.method2312();
            if (this.field921 == 65535) {
                this.field921 = -1;
            }
            int var11 = arg0.method2310();
            this.field927 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field927[var12] = arg0.method2312();
                if (this.field927[var12] == 65535) {
                    this.field927[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field930 = false;
        } else if (arg1 == 109) {
            this.field931 = false;
        } else if (arg1 == 111) {
            this.field932 = true;
        } else if (arg1 == 112) {
            this.field933 = arg0.method2310();
        }
    }

    @ObfuscatedName("aj.a(Lag;ILag;II)Ldo;")
    public final class105 method729(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field927 != null) {
            class40 var5 = this.method722();
            return var5 == null ? null : var5.method729(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field900.method3467((long) this.field911);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field904.length; var8++) {
                if (!Statics.field898.method3057(this.field904[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field904.length];
            for (int var10 = 0; var10 < this.field904.length; var10++) {
                var9[var10] = class100.method2014(Statics.field898, this.field904[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field914 != null) {
                for (int var12 = 0; var12 < this.field914.length; var12++) {
                    var11.method2019(this.field914[var12], this.field919[var12]);
                }
            }
            if (this.field915 != null) {
                for (int var13 = 0; var13 < this.field915.length; var13++) {
                    var11.method2029(this.field915[var13], this.field905[var13]);
                }
            }
            var6 = var11.method2036(this.field923 + 64, this.field929 + 850, -30, -50, -30);
            field900.method3466(var6, (long) this.field911);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method809(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method805(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2103(true);
        } else {
            var14 = arg2.method805(var6, arg3);
        }
        if (this.field920 != 128 || this.field926 != 128) {
            var14.method2115(this.field920, this.field926, this.field920);
        }
        return var14;
    }

    @ObfuscatedName("aj.s(I)Lcg;")
    public final class100 method718() {
        if (this.field927 != null) {
            class40 var1 = this.method722();
            return var1 == null ? null : var1.method718();
        } else if (this.field916 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field916.length; var3++) {
                if (!Statics.field898.method3057(this.field916[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field916.length];
            for (int var5 = 0; var5 < this.field916.length; var5++) {
                var4[var5] = class100.method2014(Statics.field898, this.field916[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field914 != null) {
                for (int var7 = 0; var7 < this.field914.length; var7++) {
                    var6.method2019(this.field914[var7], this.field919[var7]);
                }
            }
            if (this.field915 != null) {
                for (int var8 = 0; var8 < this.field915.length; var8++) {
                    var6.method2029(this.field915[var8], this.field905[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.p(I)Laj;")
    public final class40 method722() {
        int var1 = -1;
        if (this.field928 != -1) {
            var1 = Statics.method3146(this.field928);
        } else if (this.field921 != -1) {
            var1 = class176.field2895[this.field921];
        }
        return var1 < 0 || var1 >= this.field927.length || this.field927[var1] == -1 ? null : method151(this.field927[var1]);
    }

    @ObfuscatedName("aj.r(S)Z")
    public boolean method720() {
        if (this.field927 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field928 != -1) {
            var1 = Statics.method3146(this.field928);
        } else if (this.field921 != -1) {
            var1 = class176.field2895[this.field921];
        }
        return var1 >= 0 && var1 < this.field927.length && this.field927[var1] != -1;
    }
}
