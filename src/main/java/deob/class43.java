package deob;

@ObfuscatedName("ai")
public class class43 extends class208 {

    @ObfuscatedName("ai.s")
    public static boolean field921 = false;

    @ObfuscatedName("ai.y")
    public static class197 field911 = new class197(64);

    @ObfuscatedName("ai.p")
    public static class197 field927 = new class197(500);

    @ObfuscatedName("ai.g")
    public static class197 field913 = new class197(30);

    @ObfuscatedName("ai.m")
    public static class197 field914 = new class197(30);

    @ObfuscatedName("ai.f")
    public static class104[] field943 = new class104[4];

    @ObfuscatedName("ai.k")
    public int field941;

    @ObfuscatedName("ai.h")
    public int[] field917;

    @ObfuscatedName("ai.r")
    public int[] field918;

    @ObfuscatedName("ai.w")
    public String field919 = "null";

    @ObfuscatedName("ai.u")
    public short[] field945;

    @ObfuscatedName("ai.n")
    public short[] field932;

    @ObfuscatedName("ai.d")
    public short[] field926;

    @ObfuscatedName("ai.a")
    public short[] field923;

    @ObfuscatedName("ai.b")
    public int field924 = 1;

    @ObfuscatedName("ai.q")
    public int field925 = 1;

    @ObfuscatedName("ai.o")
    public int field915 = 2;

    @ObfuscatedName("ai.c")
    public boolean field952 = true;

    @ObfuscatedName("ai.i")
    public int field928 = -1;

    @ObfuscatedName("ai.x")
    public int field912 = -1;

    @ObfuscatedName("ai.v")
    public boolean field934 = false;

    @ObfuscatedName("ai.l")
    public boolean field931 = false;

    @ObfuscatedName("ai.e")
    public int field933 = -1;

    @ObfuscatedName("ai.j")
    public int field916 = 16;

    @ObfuscatedName("ai.ae")
    public int field929 = 0;

    @ObfuscatedName("ai.ah")
    public int field935 = 0;

    @ObfuscatedName("ai.am")
    public String[] field936 = new String[5];

    @ObfuscatedName("ai.aa")
    public int field937 = -1;

    @ObfuscatedName("ai.ax")
    public int field938 = -1;

    @ObfuscatedName("ai.ac")
    public boolean field939 = false;

    @ObfuscatedName("ai.ar")
    public boolean field940 = true;

    @ObfuscatedName("ai.an")
    public int field909 = 128;

    @ObfuscatedName("ai.ag")
    public int field942 = 128;

    @ObfuscatedName("ai.ab")
    public int field920 = 128;

    @ObfuscatedName("ai.ao")
    public int field944 = 0;

    @ObfuscatedName("ai.av")
    public int field910 = 0;

    @ObfuscatedName("ai.ap")
    public int field946 = 0;

    @ObfuscatedName("ai.au")
    public boolean field947 = false;

    @ObfuscatedName("ai.ad")
    public boolean field948 = false;

    @ObfuscatedName("ai.aj")
    public int field949 = -1;

    @ObfuscatedName("ai.ai")
    public int[] field950;

    @ObfuscatedName("ai.az")
    public int field951 = -1;

    @ObfuscatedName("ai.ay")
    public int field930 = -1;

    @ObfuscatedName("ai.at")
    public int field953 = -1;

    @ObfuscatedName("ai.al")
    public int field954 = 0;

    @ObfuscatedName("ai.aw")
    public int field955 = 0;

    @ObfuscatedName("ai.ak")
    public int field956 = 0;

    @ObfuscatedName("ai.as")
    public int[] field957;

    @ObfuscatedName("v.s(Lfu;Lfu;ZI)V")
    public static void method567(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field922 = arg0;
        Statics.field2954 = arg1;
        field921 = arg2;
    }

    @ObfuscatedName("ad.z(IB)Lai;")
    public static class43 method768(int arg0) {
        class43 var1 = (class43) field911.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field922.method3091(6, arg0);
        class43 var3 = new class43();
        var3.field941 = arg0;
        if (var2 != null) {
            var3.method799(new class123(var2));
        }
        var3.method801();
        if (var3.field948) {
            var3.field915 = 0;
            var3.field952 = false;
        }
        field911.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.t(I)V")
    public void method801() {
        if (this.field928 == -1) {
            this.field928 = 0;
            if (this.field917 != null && (this.field918 == null || this.field918[0] == 10)) {
                this.field928 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field936[var1] != null) {
                    this.field928 = 1;
                }
            }
        }
        if (this.field949 == -1) {
            this.field949 = this.field915 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.y(Ldy;I)V")
    public void method799(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("ai.p(Ldy;II)V")
    public void method816(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            if (var3 > 0) {
                if (this.field917 == null || field921) {
                    this.field918 = new int[var3];
                    this.field917 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field917[var4] = arg0.method2550();
                        this.field918[var4] = arg0.method2363();
                    }
                } else {
                    arg0.field2028 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field919 = arg0.method2385();
        } else if (arg1 == 5) {
            int var5 = arg0.method2363();
            if (var5 > 0) {
                if (this.field917 == null || field921) {
                    this.field918 = null;
                    this.field917 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field917[var6] = arg0.method2550();
                    }
                } else {
                    arg0.field2028 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field924 = arg0.method2363();
        } else if (arg1 == 15) {
            this.field925 = arg0.method2363();
        } else if (arg1 == 17) {
            this.field915 = 0;
            this.field952 = false;
        } else if (arg1 == 18) {
            this.field952 = false;
        } else if (arg1 == 19) {
            this.field928 = arg0.method2363();
        } else if (arg1 == 21) {
            this.field912 = 0;
        } else if (arg1 == 22) {
            this.field934 = true;
        } else if (arg1 == 23) {
            this.field931 = true;
        } else if (arg1 == 24) {
            this.field933 = arg0.method2550();
            if (this.field933 == 65535) {
                this.field933 = -1;
            }
        } else if (arg1 == 27) {
            this.field915 = 1;
        } else if (arg1 == 28) {
            this.field916 = arg0.method2363();
        } else if (arg1 == 29) {
            this.field929 = arg0.method2483();
        } else if (arg1 == 39) {
            this.field935 = arg0.method2483();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field936[arg1 - 30] = arg0.method2385();
            if (this.field936[arg1 - 30].equalsIgnoreCase(class161.field2496)) {
                this.field936[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2363();
            this.field945 = new short[var7];
            this.field932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field945[var8] = (short) arg0.method2550();
                this.field932[var8] = (short) arg0.method2550();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2363();
            this.field926 = new short[var9];
            this.field923 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field926[var10] = (short) arg0.method2550();
                this.field923[var10] = (short) arg0.method2550();
            }
        } else if (arg1 == 60) {
            this.field937 = arg0.method2550();
        } else if (arg1 == 62) {
            this.field939 = true;
        } else if (arg1 == 64) {
            this.field940 = false;
        } else if (arg1 == 65) {
            this.field909 = arg0.method2550();
        } else if (arg1 == 66) {
            this.field942 = arg0.method2550();
        } else if (arg1 == 67) {
            this.field920 = arg0.method2550();
        } else if (arg1 == 68) {
            this.field938 = arg0.method2550();
        } else if (arg1 == 69) {
            arg0.method2363();
        } else if (arg1 == 70) {
            this.field944 = arg0.method2356();
        } else if (arg1 == 71) {
            this.field910 = arg0.method2356();
        } else if (arg1 == 72) {
            this.field946 = arg0.method2356();
        } else if (arg1 == 73) {
            this.field947 = true;
        } else if (arg1 == 74) {
            this.field948 = true;
        } else if (arg1 == 75) {
            this.field949 = arg0.method2363();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field951 = arg0.method2550();
            if (this.field951 == 65535) {
                this.field951 = -1;
            }
            this.field930 = arg0.method2550();
            if (this.field930 == 65535) {
                this.field930 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2550();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2363();
            this.field950 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field950[var15] = arg0.method2550();
                if (this.field950[var15] == 65535) {
                    this.field950[var15] = -1;
                }
            }
            this.field950[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field953 = arg0.method2550();
            this.field954 = arg0.method2363();
        } else if (arg1 == 79) {
            this.field955 = arg0.method2550();
            this.field956 = arg0.method2550();
            this.field954 = arg0.method2363();
            int var11 = arg0.method2363();
            this.field957 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field957[var12] = arg0.method2550();
            }
        } else if (arg1 == 81) {
            this.field912 = arg0.method2363() * 256;
        }
    }

    @ObfuscatedName("ai.g(IB)Z")
    public final boolean method811(int arg0) {
        if (this.field918 != null) {
            for (int var4 = 0; var4 < this.field918.length; var4++) {
                if (this.field918[var4] == arg0) {
                    return Statics.field2954.method3071(this.field917[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field917 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field917.length; var3++) {
                var2 &= Statics.field2954.method3071(this.field917[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.m(I)Z")
    public final boolean method797() {
        if (this.field917 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field917.length; var2++) {
            var1 &= Statics.field2954.method3071(this.field917[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.f(II[[IIIII)Lcl;")
    public final class89 method803(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field918 == null) {
            var7 = (long) ((this.field941 << 10) + arg1);
        } else {
            var7 = (long) ((this.field941 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field913.method3523(var7);
        if (var9 == null) {
            class104 var10 = this.method806(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field934) {
                var10.field1764 = (short) (this.field929 + 64);
                var10.field1765 = (short) (this.field935 * 25 + 768);
                var10.method2093();
                var9 = var10;
            } else {
                var9 = var10.method2097(this.field929 + 64, this.field935 * 25 + 768, -50, -10, -50);
            }
            field913.method3521(var9, var7);
        }
        if (this.field934) {
            var9 = ((class104) var9).method2083();
        }
        if (this.field912 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2185(arg2, arg3, arg4, arg5, true, this.field912);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2094(arg2, arg3, arg4, arg5, true, this.field912);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.k(II[[IIIIB)Lde;")
    public final class109 method804(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field918 == null) {
            var7 = (long) ((this.field941 << 10) + arg1);
        } else {
            var7 = (long) ((this.field941 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field914.method3523(var7);
        if (var9 == null) {
            class104 var10 = this.method806(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2097(this.field929 + 64, this.field935 * 25 + 768, -50, -10, -50);
            field914.method3521(var9, var7);
        }
        if (this.field912 >= 0) {
            var9 = var9.method2185(arg2, arg3, arg4, arg5, true, this.field912);
        }
        return var9;
    }

    @ObfuscatedName("ai.h(II[[IIIILay;II)Lde;")
    public final class109 method800(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field918 == null) {
            var9 = (long) ((this.field941 << 10) + arg1);
        } else {
            var9 = (long) ((this.field941 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field914.method3523(var9);
        if (var11 == null) {
            class104 var12 = this.method806(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2097(this.field929 + 64, this.field935 * 25 + 768, -50, -10, -50);
            field914.method3521(var11, var9);
        }
        if (arg6 == null && this.field912 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2166(true);
        } else {
            var13 = arg6.method867(var11, arg7, arg1);
        }
        if (this.field912 >= 0) {
            var13 = var13.method2185(arg2, arg3, arg4, arg5, false, this.field912);
        }
        return var13;
    }

    @ObfuscatedName("ai.r(III)Lch;")
    public final class104 method806(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field918 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field917 == null) {
                return null;
            }
            boolean var4 = this.field939;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field917.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field917[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field927.method3523((long) var7);
                if (var3 == null) {
                    var3 = class104.method2078(Statics.field2954, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2118();
                    }
                    field927.method3521(var3, (long) var7);
                }
                if (var5 > 1) {
                    field943[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field943, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field918.length; var9++) {
                if (this.field918[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field917[var8];
            boolean var11 = this.field939 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field927.method3523((long) var10);
            if (var3 == null) {
                var3 = class104.method2078(Statics.field2954, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2118();
                }
                field927.method3521(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field909 == 128 && this.field942 == 128 && this.field920 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field944 == 0 && this.field910 == 0 && this.field946 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field945 == null, this.field926 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2089(256);
            var14.method2085(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2077();
        } else if (var15 == 2) {
            var14.method2081();
        } else if (var15 == 3) {
            var14.method2131();
        }
        if (this.field945 != null) {
            for (int var16 = 0; var16 < this.field945.length; var16++) {
                var14.method2091(this.field945[var16], this.field932[var16]);
            }
        }
        if (this.field926 != null) {
            for (int var17 = 0; var17 < this.field926.length; var17++) {
                var14.method2128(this.field926[var17], this.field923[var17]);
            }
        }
        if (var12) {
            var14.method2092(this.field909, this.field942, this.field920);
        }
        if (var13) {
            var14.method2085(this.field944, this.field910, this.field946);
        }
        return var14;
    }

    @ObfuscatedName("ai.w(I)Lai;")
    public final class43 method807() {
        int var1 = -1;
        if (this.field951 != -1) {
            var1 = class180.method3191(this.field951);
        } else if (this.field930 != -1) {
            var1 = class180.field2952[this.field930];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field950.length - 1) {
            var2 = this.field950[var1];
        } else {
            var2 = this.field950[this.field950.length - 1];
        }
        return var2 == -1 ? null : method768(var2);
    }

    @ObfuscatedName("fk.u(I)V")
    public static void method3039() {
        field911.method3522();
        field927.method3522();
        field913.method3522();
        field914.method3522();
    }

    @ObfuscatedName("ai.n(I)Z")
    public boolean method808() {
        if (this.field950 == null) {
            return this.field953 != -1 || this.field957 != null;
        }
        for (int var1 = 0; var1 < this.field950.length; var1++) {
            if (this.field950[var1] != -1) {
                class43 var2 = method768(this.field950[var1]);
                if (var2.field953 != -1 || var2.field957 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
