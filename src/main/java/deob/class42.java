package deob;

@ObfuscatedName("ac")
public class class42 extends class208 {

    @ObfuscatedName("ac.e")
    public static class197 field907 = new class197(64);

    @ObfuscatedName("ac.g")
    public static class197 field918 = new class197(50);

    @ObfuscatedName("ac.n")
    public int field909;

    @ObfuscatedName("ac.u")
    public String field910 = "null";

    @ObfuscatedName("ac.d")
    public int field911 = 1;

    @ObfuscatedName("ac.l")
    public int[] field937;

    @ObfuscatedName("ac.m")
    public int[] field913;

    @ObfuscatedName("ac.j")
    public int field935 = -1;

    @ObfuscatedName("ac.y")
    public int field922 = -1;

    @ObfuscatedName("ac.s")
    public int field916 = -1;

    @ObfuscatedName("ac.p")
    public int field917 = -1;

    @ObfuscatedName("ac.v")
    public int field931 = -1;

    @ObfuscatedName("ac.r")
    public int field919 = -1;

    @ObfuscatedName("ac.c")
    public int field908 = -1;

    @ObfuscatedName("ac.w")
    public short[] field921;

    @ObfuscatedName("ac.x")
    public short[] field905;

    @ObfuscatedName("ac.k")
    public short[] field923;

    @ObfuscatedName("ac.z")
    public short[] field924;

    @ObfuscatedName("ac.q")
    public String[] field925 = new String[5];

    @ObfuscatedName("ac.o")
    public boolean field926 = true;

    @ObfuscatedName("ac.f")
    public int field927 = -1;

    @ObfuscatedName("ac.b")
    public int field933 = 128;

    @ObfuscatedName("ac.t")
    public int field929 = 128;

    @ObfuscatedName("ac.a")
    public boolean field930 = false;

    @ObfuscatedName("ac.am")
    public int field912 = 0;

    @ObfuscatedName("ac.as")
    public int field932 = 0;

    @ObfuscatedName("ac.ad")
    public int field936 = -1;

    @ObfuscatedName("ac.af")
    public int field934 = 32;

    @ObfuscatedName("ac.ak")
    public int[] field939;

    @ObfuscatedName("ac.aq")
    public int field941 = -1;

    @ObfuscatedName("ac.an")
    public int field914 = -1;

    @ObfuscatedName("ac.ag")
    public boolean field938 = true;

    @ObfuscatedName("ac.al")
    public boolean field940 = true;

    @ObfuscatedName("ac.au")
    public boolean field928 = false;

    @ObfuscatedName("x.i(IB)Lac;")
    public static class42 method187(int arg0) {
        class42 var1 = (class42) field907.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field920.method3086(9, arg0);
        class42 var3 = new class42();
        var3.field909 = arg0;
        if (var2 != null) {
            var3.method771(new class123(var2));
        }
        var3.method770();
        field907.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.h(B)V")
    public void method770() {
    }

    @ObfuscatedName("ac.e(Ldn;B)V")
    public void method771(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method772(arg0, var2);
        }
    }

    @ObfuscatedName("ac.g(Ldn;II)V")
    public void method772(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2404();
            this.field937 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field937[var4] = arg0.method2406();
            }
        } else if (arg1 == 2) {
            this.field910 = arg0.method2412();
        } else if (arg1 == 12) {
            this.field911 = arg0.method2404();
        } else if (arg1 == 13) {
            this.field935 = arg0.method2406();
        } else if (arg1 == 14) {
            this.field917 = arg0.method2406();
        } else if (arg1 == 15) {
            this.field922 = arg0.method2406();
        } else if (arg1 == 16) {
            this.field916 = arg0.method2406();
        } else if (arg1 == 17) {
            this.field917 = arg0.method2406();
            this.field931 = arg0.method2406();
            this.field919 = arg0.method2406();
            this.field908 = arg0.method2406();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field925[arg1 - 30] = arg0.method2412();
            if (this.field925[arg1 - 30].equalsIgnoreCase(class161.field2437)) {
                this.field925[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2404();
            this.field921 = new short[var5];
            this.field905 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field921[var6] = (short) arg0.method2406();
                this.field905[var6] = (short) arg0.method2406();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2404();
            this.field923 = new short[var7];
            this.field924 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field923[var8] = (short) arg0.method2406();
                this.field924[var8] = (short) arg0.method2406();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2404();
            this.field913 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field913[var10] = arg0.method2406();
            }
        } else if (arg1 == 93) {
            this.field926 = false;
        } else if (arg1 == 95) {
            this.field927 = arg0.method2406();
        } else if (arg1 == 97) {
            this.field933 = arg0.method2406();
        } else if (arg1 == 98) {
            this.field929 = arg0.method2406();
        } else if (arg1 == 99) {
            this.field930 = true;
        } else if (arg1 == 100) {
            this.field912 = arg0.method2405();
        } else if (arg1 == 101) {
            this.field932 = arg0.method2405() * 5;
        } else if (arg1 == 102) {
            this.field936 = arg0.method2406();
        } else if (arg1 == 103) {
            this.field934 = arg0.method2406();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field941 = arg0.method2406();
            if (this.field941 == 65535) {
                this.field941 = -1;
            }
            this.field914 = arg0.method2406();
            if (this.field914 == 65535) {
                this.field914 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2406();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2404();
            this.field939 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field939[var13] = arg0.method2406();
                if (this.field939[var13] == 65535) {
                    this.field939[var13] = -1;
                }
            }
            this.field939[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field938 = false;
        } else if (arg1 == 109) {
            this.field940 = false;
        } else if (arg1 == 111) {
            this.field928 = true;
        }
    }

    @ObfuscatedName("ac.n(Laa;ILaa;IB)Ldo;")
    public final class109 method780(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field939 != null) {
            class42 var5 = this.method779();
            return var5 == null ? null : var5.method780(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field918.method3541((long) this.field909);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field937.length; var8++) {
                if (!Statics.field906.method3085(this.field937[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field937.length];
            for (int var10 = 0; var10 < this.field937.length; var10++) {
                var9[var10] = class104.method2115(Statics.field906, this.field937[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field921 != null) {
                for (int var12 = 0; var12 < this.field921.length; var12++) {
                    var11.method2185(this.field921[var12], this.field905[var12]);
                }
            }
            if (this.field923 != null) {
                for (int var13 = 0; var13 < this.field923.length; var13++) {
                    var11.method2128(this.field923[var13], this.field924[var13]);
                }
            }
            var6 = var11.method2135(this.field912 + 64, this.field932 + 850, -30, -50, -30);
            field918.method3532(var6, (long) this.field909);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method887(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method866(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2227(true);
        } else {
            var14 = arg2.method866(var6, arg3);
        }
        if (this.field933 != 128 || this.field929 != 128) {
            var14.method2215(this.field933, this.field929, this.field933);
        }
        return var14;
    }

    @ObfuscatedName("ac.u(B)Lco;")
    public final class104 method774() {
        if (this.field939 != null) {
            class42 var1 = this.method779();
            return var1 == null ? null : var1.method774();
        } else if (this.field913 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field913.length; var3++) {
                if (!Statics.field906.method3085(this.field913[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field913.length];
            for (int var5 = 0; var5 < this.field913.length; var5++) {
                var4[var5] = class104.method2115(Statics.field906, this.field913[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field921 != null) {
                for (int var7 = 0; var7 < this.field921.length; var7++) {
                    var6.method2185(this.field921[var7], this.field905[var7]);
                }
            }
            if (this.field923 != null) {
                for (int var8 = 0; var8 < this.field923.length; var8++) {
                    var6.method2128(this.field923[var8], this.field924[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ac.d(I)Lac;")
    public final class42 method779() {
        int var1 = -1;
        if (this.field941 != -1) {
            var1 = class180.method123(this.field941);
        } else if (this.field914 != -1) {
            var1 = class180.field2955[this.field914];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field939.length - 1) {
            var2 = this.field939[var1];
        } else {
            var2 = this.field939[this.field939.length - 1];
        }
        return var2 == -1 ? null : method187(var2);
    }

    @ObfuscatedName("ac.l(B)Z")
    public boolean method798() {
        if (this.field939 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field941 != -1) {
            var1 = class180.method123(this.field941);
        } else if (this.field914 != -1) {
            var1 = class180.field2955[this.field914];
        }
        if (var1 >= 0 && var1 < this.field939.length) {
            return this.field939[var1] != -1;
        } else {
            return this.field939[this.field939.length - 1] != -1;
        }
    }

    @ObfuscatedName("g.m(I)V")
    public static void method51() {
        field907.method3533();
        field918.method3533();
    }
}
