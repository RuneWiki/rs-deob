package deob;

@ObfuscatedName("ak")
public class class43 extends class208 {

    @ObfuscatedName("ak.f")
    public static boolean field942 = false;

    @ObfuscatedName("ak.t")
    public static class197 field924 = new class197(64);

    @ObfuscatedName("ak.v")
    public static class197 field925 = new class197(500);

    @ObfuscatedName("ak.b")
    public static class197 field961 = new class197(30);

    @ObfuscatedName("ak.m")
    public static class197 field927 = new class197(30);

    @ObfuscatedName("ak.k")
    public static class104[] field928 = new class104[4];

    @ObfuscatedName("ak.c")
    public int field929;

    @ObfuscatedName("ak.w")
    public int[] field930;

    @ObfuscatedName("ak.l")
    public int[] field931;

    @ObfuscatedName("ak.h")
    public String field936 = "null";

    @ObfuscatedName("ak.i")
    public short[] field933;

    @ObfuscatedName("ak.u")
    public short[] field951;

    @ObfuscatedName("ak.x")
    public short[] field935;

    @ObfuscatedName("ak.d")
    public short[] field960;

    @ObfuscatedName("ak.o")
    public int field937 = 1;

    @ObfuscatedName("ak.j")
    public int field938 = 1;

    @ObfuscatedName("ak.q")
    public int field939 = 2;

    @ObfuscatedName("ak.r")
    public boolean field968 = true;

    @ObfuscatedName("ak.a")
    public int field959 = -1;

    @ObfuscatedName("ak.z")
    public int field934 = -1;

    @ObfuscatedName("ak.p")
    public boolean field958 = false;

    @ObfuscatedName("ak.y")
    public boolean field944 = false;

    @ObfuscatedName("ak.s")
    public int field945 = -1;

    @ObfuscatedName("ak.g")
    public int field946 = 16;

    @ObfuscatedName("ak.aj")
    public int field947 = 0;

    @ObfuscatedName("ak.ay")
    public int field948 = 0;

    @ObfuscatedName("ak.ah")
    public String[] field940 = new String[5];

    @ObfuscatedName("ak.ax")
    public int field943 = -1;

    @ObfuscatedName("ak.ar")
    public int field950 = -1;

    @ObfuscatedName("ak.ae")
    public boolean field952 = false;

    @ObfuscatedName("ak.ac")
    public boolean field953 = true;

    @ObfuscatedName("ak.aw")
    public int field954 = 128;

    @ObfuscatedName("ak.am")
    public int field941 = 128;

    @ObfuscatedName("ak.aq")
    public int field956 = 128;

    @ObfuscatedName("ak.at")
    public int field957 = 0;

    @ObfuscatedName("ak.aa")
    public int field964 = 0;

    @ObfuscatedName("ak.as")
    public int field921 = 0;

    @ObfuscatedName("ak.ao")
    public boolean field932 = false;

    @ObfuscatedName("ak.ai")
    public boolean field949 = false;

    @ObfuscatedName("ak.ap")
    public int field962 = -1;

    @ObfuscatedName("ak.ak")
    public int[] field963;

    @ObfuscatedName("ak.ag")
    public int field926 = -1;

    @ObfuscatedName("ak.az")
    public int field965 = -1;

    @ObfuscatedName("ak.au")
    public int field966 = -1;

    @ObfuscatedName("ak.af")
    public int field967 = 0;

    @ObfuscatedName("ak.al")
    public int field974 = 0;

    @ObfuscatedName("ak.av")
    public int field969 = 0;

    @ObfuscatedName("ak.ad")
    public int[] field970;

    @ObfuscatedName("c.f(II)Lak;")
    public static class43 method106(int arg0) {
        class43 var1 = (class43) field924.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field922.method3107(6, arg0);
        class43 var3 = new class43();
        var3.field929 = arg0;
        if (var2 != null) {
            var3.method803(new class123(var2));
        }
        var3.method819();
        if (var3.field949) {
            var3.field939 = 0;
            var3.field968 = false;
        }
        field924.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.e(I)V")
    public void method819() {
        if (this.field959 == -1) {
            this.field959 = 0;
            if (this.field930 != null && (this.field931 == null || this.field931[0] == 10)) {
                this.field959 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field940[var1] != null) {
                    this.field959 = 1;
                }
            }
        }
        if (this.field962 == -1) {
            this.field962 = this.field939 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ak.n(Ldx;I)V")
    public void method803(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method804(arg0, var2);
        }
    }

    @ObfuscatedName("ak.t(Ldx;IS)V")
    public void method804(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2522();
            if (var3 > 0) {
                if (this.field930 == null || field942) {
                    this.field931 = new int[var3];
                    this.field930 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field930[var4] = arg0.method2401();
                        this.field931[var4] = arg0.method2522();
                    }
                } else {
                    arg0.field2052 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field936 = arg0.method2407();
        } else if (arg1 == 5) {
            int var5 = arg0.method2522();
            if (var5 > 0) {
                if (this.field930 == null || field942) {
                    this.field931 = null;
                    this.field930 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field930[var6] = arg0.method2401();
                    }
                } else {
                    arg0.field2052 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field937 = arg0.method2522();
        } else if (arg1 == 15) {
            this.field938 = arg0.method2522();
        } else if (arg1 == 17) {
            this.field939 = 0;
            this.field968 = false;
        } else if (arg1 == 18) {
            this.field968 = false;
        } else if (arg1 == 19) {
            this.field959 = arg0.method2522();
        } else if (arg1 == 21) {
            this.field934 = 0;
        } else if (arg1 == 22) {
            this.field958 = true;
        } else if (arg1 == 23) {
            this.field944 = true;
        } else if (arg1 == 24) {
            this.field945 = arg0.method2401();
            if (this.field945 == 65535) {
                this.field945 = -1;
            }
        } else if (arg1 == 27) {
            this.field939 = 1;
        } else if (arg1 == 28) {
            this.field946 = arg0.method2522();
        } else if (arg1 == 29) {
            this.field947 = arg0.method2400();
        } else if (arg1 == 39) {
            this.field948 = arg0.method2400();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field940[arg1 - 30] = arg0.method2407();
            if (this.field940[arg1 - 30].equalsIgnoreCase(class161.field2351)) {
                this.field940[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2522();
            this.field933 = new short[var7];
            this.field951 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field933[var8] = (short) arg0.method2401();
                this.field951[var8] = (short) arg0.method2401();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2522();
            this.field935 = new short[var9];
            this.field960 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field935[var10] = (short) arg0.method2401();
                this.field960[var10] = (short) arg0.method2401();
            }
        } else if (arg1 == 60) {
            this.field943 = arg0.method2401();
        } else if (arg1 == 62) {
            this.field952 = true;
        } else if (arg1 == 64) {
            this.field953 = false;
        } else if (arg1 == 65) {
            this.field954 = arg0.method2401();
        } else if (arg1 == 66) {
            this.field941 = arg0.method2401();
        } else if (arg1 == 67) {
            this.field956 = arg0.method2401();
        } else if (arg1 == 68) {
            this.field950 = arg0.method2401();
        } else if (arg1 == 69) {
            arg0.method2522();
        } else if (arg1 == 70) {
            this.field957 = arg0.method2499();
        } else if (arg1 == 71) {
            this.field964 = arg0.method2499();
        } else if (arg1 == 72) {
            this.field921 = arg0.method2499();
        } else if (arg1 == 73) {
            this.field932 = true;
        } else if (arg1 == 74) {
            this.field949 = true;
        } else if (arg1 == 75) {
            this.field962 = arg0.method2522();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field926 = arg0.method2401();
            if (this.field926 == 65535) {
                this.field926 = -1;
            }
            this.field965 = arg0.method2401();
            if (this.field965 == 65535) {
                this.field965 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2401();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2522();
            this.field963 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field963[var15] = arg0.method2401();
                if (this.field963[var15] == 65535) {
                    this.field963[var15] = -1;
                }
            }
            this.field963[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field966 = arg0.method2401();
            this.field967 = arg0.method2522();
        } else if (arg1 == 79) {
            this.field974 = arg0.method2401();
            this.field969 = arg0.method2401();
            this.field967 = arg0.method2522();
            int var11 = arg0.method2522();
            this.field970 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field970[var12] = arg0.method2401();
            }
        } else if (arg1 == 81) {
            this.field934 = arg0.method2522() * 256;
        }
    }

    @ObfuscatedName("ak.v(IB)Z")
    public final boolean method805(int arg0) {
        if (this.field931 != null) {
            for (int var4 = 0; var4 < this.field931.length; var4++) {
                if (this.field931[var4] == arg0) {
                    return Statics.field923.method3156(this.field930[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field930 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field930.length; var3++) {
                var2 &= Statics.field923.method3156(this.field930[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ak.b(I)Z")
    public final boolean method812() {
        if (this.field930 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field930.length; var2++) {
            var1 &= Statics.field923.method3156(this.field930[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ak.m(II[[IIIIB)Lcx;")
    public final class89 method807(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field931 == null) {
            var7 = (long) ((this.field929 << 10) + arg1);
        } else {
            var7 = (long) ((this.field929 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field961.method3569(var7);
        if (var9 == null) {
            class104 var10 = this.method810(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field958) {
                var10.field1783 = (short) (this.field947 + 64);
                var10.field1784 = (short) (this.field948 * 25 + 768);
                var10.method2185();
                var9 = var10;
            } else {
                var9 = var10.method2134(this.field947 + 64, this.field948 * 25 + 768, -50, -10, -50);
            }
            field961.method3571(var9, var7);
        }
        if (this.field958) {
            var9 = ((class104) var9).method2118();
        }
        if (this.field934 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2196(arg2, arg3, arg4, arg5, true, this.field934);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2119(arg2, arg3, arg4, arg5, true, this.field934);
            }
        }
        return var9;
    }

    @ObfuscatedName("ak.k(II[[IIIII)Ldg;")
    public final class109 method808(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field931 == null) {
            var7 = (long) ((this.field929 << 10) + arg1);
        } else {
            var7 = (long) ((this.field929 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field927.method3569(var7);
        if (var9 == null) {
            class104 var10 = this.method810(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2134(this.field947 + 64, this.field948 * 25 + 768, -50, -10, -50);
            field927.method3571(var9, var7);
        }
        if (this.field934 >= 0) {
            var9 = var9.method2196(arg2, arg3, arg4, arg5, true, this.field934);
        }
        return var9;
    }

    @ObfuscatedName("ak.c(II[[IIIILaz;IB)Ldg;")
    public final class109 method809(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field931 == null) {
            var9 = (long) ((this.field929 << 10) + arg1);
        } else {
            var9 = (long) ((this.field929 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field927.method3569(var9);
        if (var11 == null) {
            class104 var12 = this.method810(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2134(this.field947 + 64, this.field948 * 25 + 768, -50, -10, -50);
            field927.method3571(var11, var9);
        }
        if (arg6 == null && this.field934 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2228(true);
        } else {
            var13 = arg6.method863(var11, arg7, arg1);
        }
        if (this.field934 >= 0) {
            var13 = var13.method2196(arg2, arg3, arg4, arg5, false, this.field934);
        }
        return var13;
    }

    @ObfuscatedName("ak.w(IIB)Lca;")
    public final class104 method810(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field931 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field930 == null) {
                return null;
            }
            boolean var4 = this.field952;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field930.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field930[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field925.method3569((long) var7);
                if (var3 == null) {
                    var3 = class104.method2114(Statics.field923, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2162();
                    }
                    field925.method3571(var3, (long) var7);
                }
                if (var5 > 1) {
                    field928[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field928, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field931.length; var9++) {
                if (this.field931[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field930[var8];
            boolean var11 = this.field952 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field925.method3569((long) var10);
            if (var3 == null) {
                var3 = class104.method2114(Statics.field923, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2162();
                }
                field925.method3571(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field954 == 128 && this.field941 == 128 && this.field956 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field957 == 0 && this.field964 == 0 && this.field921 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field933 == null, this.field935 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2137(256);
            var14.method2125(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2121();
        } else if (var15 == 2) {
            var14.method2179();
        } else if (var15 == 3) {
            var14.method2123();
        }
        if (this.field933 != null) {
            for (int var16 = 0; var16 < this.field933.length; var16++) {
                var14.method2126(this.field933[var16], this.field951[var16]);
            }
        }
        if (this.field935 != null) {
            for (int var17 = 0; var17 < this.field935.length; var17++) {
                var14.method2127(this.field935[var17], this.field960[var17]);
            }
        }
        if (var12) {
            var14.method2129(this.field954, this.field941, this.field956);
        }
        if (var13) {
            var14.method2125(this.field957, this.field964, this.field921);
        }
        return var14;
    }

    @ObfuscatedName("ak.l(B)Lak;")
    public final class43 method811() {
        int var1 = -1;
        if (this.field926 != -1) {
            var1 = class180.method2322(this.field926);
        } else if (this.field965 != -1) {
            var1 = class180.field2941[this.field965];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field963.length - 1) {
            var2 = this.field963[var1];
        } else {
            var2 = this.field963[this.field963.length - 1];
        }
        return var2 == -1 ? null : method106(var2);
    }

    @ObfuscatedName("ak.h(B)Z")
    public boolean method816() {
        if (this.field963 == null) {
            return this.field966 != -1 || this.field970 != null;
        }
        for (int var1 = 0; var1 < this.field963.length; var1++) {
            if (this.field963[var1] != -1) {
                class43 var2 = method106(this.field963[var1]);
                if (var2.field966 != -1 || var2.field970 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
