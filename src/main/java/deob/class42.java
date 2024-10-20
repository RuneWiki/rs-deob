package deob;

@ObfuscatedName("af")
public class class42 extends class208 {

    @ObfuscatedName("af.c")
    public static class197 field921 = new class197(64);

    @ObfuscatedName("af.h")
    public static class197 field919 = new class197(50);

    @ObfuscatedName("af.r")
    public int field923;

    @ObfuscatedName("af.a")
    public String field943 = "null";

    @ObfuscatedName("af.b")
    public int field925 = 1;

    @ObfuscatedName("af.u")
    public int[] field926;

    @ObfuscatedName("af.o")
    public int[] field927;

    @ObfuscatedName("af.p")
    public int field951 = -1;

    @ObfuscatedName("af.i")
    public int field929 = -1;

    @ObfuscatedName("af.q")
    public int field930 = -1;

    @ObfuscatedName("af.g")
    public int field954 = -1;

    @ObfuscatedName("af.j")
    public int field932 = -1;

    @ObfuscatedName("af.w")
    public int field933 = -1;

    @ObfuscatedName("af.x")
    public int field934 = -1;

    @ObfuscatedName("af.f")
    public short[] field935;

    @ObfuscatedName("af.t")
    public short[] field924;

    @ObfuscatedName("af.z")
    public short[] field937;

    @ObfuscatedName("af.y")
    public short[] field938;

    @ObfuscatedName("af.m")
    public String[] field939 = new String[5];

    @ObfuscatedName("af.v")
    public boolean field940 = true;

    @ObfuscatedName("af.k")
    public int field941 = -1;

    @ObfuscatedName("af.n")
    public int field942 = 128;

    @ObfuscatedName("af.d")
    public int field944 = 128;

    @ObfuscatedName("af.s")
    public boolean field922 = false;

    @ObfuscatedName("af.ah")
    public int field945 = 0;

    @ObfuscatedName("af.ak")
    public int field946 = 0;

    @ObfuscatedName("af.as")
    public int field947 = -1;

    @ObfuscatedName("af.ae")
    public int field955 = 32;

    @ObfuscatedName("af.ao")
    public int[] field949;

    @ObfuscatedName("af.av")
    public int field957 = -1;

    @ObfuscatedName("af.al")
    public int field931 = -1;

    @ObfuscatedName("af.ap")
    public boolean field948 = true;

    @ObfuscatedName("af.an")
    public boolean field953 = true;

    @ObfuscatedName("af.aw")
    public boolean field936 = false;

    @ObfuscatedName("af.ad")
    public int field928 = 30;

    @ObfuscatedName("client.e(Lfe;Lfe;I)V")
    public static void method465(class171 arg0, class171 arg1) {
        Statics.field952 = arg0;
        Statics.field920 = arg1;
    }

    @ObfuscatedName("ba.l(IB)Laf;")
    public static class42 method1250(int arg0) {
        class42 var1 = (class42) field921.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field952.method3130(9, arg0);
        class42 var3 = new class42();
        var3.field923 = arg0;
        if (var2 != null) {
            var3.method776(new class123(var2));
        }
        var3.method774();
        field921.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.c(I)V")
    public void method774() {
    }

    @ObfuscatedName("af.h(Ldd;B)V")
    public void method776(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("af.r(Ldd;II)V")
    public void method775(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2464();
            this.field926 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field926[var4] = arg0.method2466();
            }
        } else if (arg1 == 2) {
            this.field943 = arg0.method2471();
        } else if (arg1 == 12) {
            this.field925 = arg0.method2464();
        } else if (arg1 == 13) {
            this.field951 = arg0.method2466();
        } else if (arg1 == 14) {
            this.field954 = arg0.method2466();
        } else if (arg1 == 15) {
            this.field929 = arg0.method2466();
        } else if (arg1 == 16) {
            this.field930 = arg0.method2466();
        } else if (arg1 == 17) {
            this.field954 = arg0.method2466();
            this.field932 = arg0.method2466();
            this.field933 = arg0.method2466();
            this.field934 = arg0.method2466();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field939[arg1 - 30] = arg0.method2471();
            if (this.field939[arg1 - 30].equalsIgnoreCase(class161.field2362)) {
                this.field939[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2464();
            this.field935 = new short[var5];
            this.field924 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field935[var6] = (short) arg0.method2466();
                this.field924[var6] = (short) arg0.method2466();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2464();
            this.field937 = new short[var7];
            this.field938 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field937[var8] = (short) arg0.method2466();
                this.field938[var8] = (short) arg0.method2466();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2464();
            this.field927 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field927[var10] = arg0.method2466();
            }
        } else if (arg1 == 93) {
            this.field940 = false;
        } else if (arg1 == 95) {
            this.field941 = arg0.method2466();
        } else if (arg1 == 97) {
            this.field942 = arg0.method2466();
        } else if (arg1 == 98) {
            this.field944 = arg0.method2466();
        } else if (arg1 == 99) {
            this.field922 = true;
        } else if (arg1 == 100) {
            this.field945 = arg0.method2465();
        } else if (arg1 == 101) {
            this.field946 = arg0.method2465() * 5;
        } else if (arg1 == 102) {
            this.field947 = arg0.method2466();
        } else if (arg1 == 103) {
            this.field955 = arg0.method2466();
        } else if (arg1 == 106) {
            this.field957 = arg0.method2466();
            if (this.field957 == 65535) {
                this.field957 = -1;
            }
            this.field931 = arg0.method2466();
            if (this.field931 == 65535) {
                this.field931 = -1;
            }
            int var11 = arg0.method2464();
            this.field949 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field949[var12] = arg0.method2466();
                if (this.field949[var12] == 65535) {
                    this.field949[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field948 = false;
        } else if (arg1 == 109) {
            this.field953 = false;
        } else if (arg1 == 111) {
            this.field936 = true;
        } else if (arg1 == 112) {
            this.field928 = arg0.method2464();
        }
    }

    @ObfuscatedName("af.a(Lar;ILar;II)Lds;")
    public final class109 method796(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field949 != null) {
            class42 var5 = this.method792();
            return var5 == null ? null : var5.method796(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field919.method3589((long) this.field923);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field926.length; var8++) {
                if (!Statics.field920.method3134(this.field926[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field926.length];
            for (int var10 = 0; var10 < this.field926.length; var10++) {
                var9[var10] = class104.method2178(Statics.field920, this.field926[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field935 != null) {
                for (int var12 = 0; var12 < this.field935.length; var12++) {
                    var11.method2217(this.field935[var12], this.field924[var12]);
                }
            }
            if (this.field937 != null) {
                for (int var13 = 0; var13 < this.field937.length; var13++) {
                    var11.method2168(this.field937[var13], this.field938[var13]);
                }
            }
            var6 = var11.method2175(this.field945 + 64, this.field946 + 850, -30, -50, -30);
            field919.method3591(var6, (long) this.field923);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method900(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method887(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2315(true);
        } else {
            var14 = arg2.method887(var6, arg3);
        }
        if (this.field942 != 128 || this.field944 != 128) {
            var14.method2268(this.field942, this.field944, this.field942);
        }
        return var14;
    }

    @ObfuscatedName("af.b(I)Lcv;")
    public final class104 method779() {
        if (this.field949 != null) {
            class42 var1 = this.method792();
            return var1 == null ? null : var1.method779();
        } else if (this.field927 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field927.length; var3++) {
                if (!Statics.field920.method3134(this.field927[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field927.length];
            for (int var5 = 0; var5 < this.field927.length; var5++) {
                var4[var5] = class104.method2178(Statics.field920, this.field927[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field935 != null) {
                for (int var7 = 0; var7 < this.field935.length; var7++) {
                    var6.method2217(this.field935[var7], this.field924[var7]);
                }
            }
            if (this.field937 != null) {
                for (int var8 = 0; var8 < this.field937.length; var8++) {
                    var6.method2168(this.field937[var8], this.field938[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("af.u(I)Laf;")
    public final class42 method792() {
        int var1 = -1;
        if (this.field957 != -1) {
            var1 = class180.method3258(this.field957);
        } else if (this.field931 != -1) {
            var1 = class180.field2945[this.field931];
        }
        return var1 < 0 || var1 >= this.field949.length || this.field949[var1] == -1 ? null : method1250(this.field949[var1]);
    }

    @ObfuscatedName("af.o(I)Z")
    public boolean method781() {
        if (this.field949 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field957 != -1) {
            var1 = class180.method3258(this.field957);
        } else if (this.field931 != -1) {
            var1 = class180.field2945[this.field931];
        }
        return var1 >= 0 && var1 < this.field949.length && this.field949[var1] != -1;
    }

    @ObfuscatedName("el.p(I)V")
    public static void method2782() {
        field921.method3590();
        field919.method3590();
    }
}
