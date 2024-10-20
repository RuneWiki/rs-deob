package deob;

@ObfuscatedName("aa")
public class class41 extends class204 {

    @ObfuscatedName("aa.k")
    public static boolean field926 = false;

    @ObfuscatedName("aa.z")
    public static class193 field937 = new class193(64);

    @ObfuscatedName("aa.c")
    public static class193 field927 = new class193(500);

    @ObfuscatedName("aa.d")
    public static class193 field901 = new class193(30);

    @ObfuscatedName("aa.l")
    public static class193 field917 = new class193(30);

    @ObfuscatedName("aa.b")
    public static class100[] field896 = new class100[4];

    @ObfuscatedName("aa.j")
    public int field904;

    @ObfuscatedName("aa.f")
    public int[] field902;

    @ObfuscatedName("aa.i")
    public int[] field899;

    @ObfuscatedName("aa.g")
    public String field907 = "null";

    @ObfuscatedName("aa.t")
    public short[] field928;

    @ObfuscatedName("aa.e")
    public short[] field909;

    @ObfuscatedName("aa.q")
    public short[] field910;

    @ObfuscatedName("aa.u")
    public short[] field911;

    @ObfuscatedName("aa.r")
    public int field912 = 1;

    @ObfuscatedName("aa.a")
    public int field913 = 1;

    @ObfuscatedName("aa.m")
    public int field903 = 2;

    @ObfuscatedName("aa.y")
    public boolean field915 = true;

    @ObfuscatedName("aa.x")
    public int field922 = -1;

    @ObfuscatedName("aa.n")
    public int field936 = -1;

    @ObfuscatedName("aa.v")
    public boolean field918 = false;

    @ObfuscatedName("aa.s")
    public boolean field919 = false;

    @ObfuscatedName("aa.w")
    public int field939 = -1;

    @ObfuscatedName("aa.p")
    public int field900 = 16;

    @ObfuscatedName("aa.ao")
    public int field914 = 0;

    @ObfuscatedName("aa.ae")
    public int field923 = 0;

    @ObfuscatedName("aa.ay")
    public String[] field924 = new String[5];

    @ObfuscatedName("aa.ad")
    public int field925 = -1;

    @ObfuscatedName("aa.as")
    public int field921 = -1;

    @ObfuscatedName("aa.ag")
    public boolean field920 = false;

    @ObfuscatedName("aa.au")
    public boolean field932 = true;

    @ObfuscatedName("aa.ar")
    public int field929 = 128;

    @ObfuscatedName("aa.az")
    public int field930 = 128;

    @ObfuscatedName("aa.aw")
    public int field931 = 128;

    @ObfuscatedName("aa.at")
    public int field940 = 0;

    @ObfuscatedName("aa.ap")
    public int field933 = 0;

    @ObfuscatedName("aa.al")
    public int field934 = 0;

    @ObfuscatedName("aa.aq")
    public boolean field935 = false;

    @ObfuscatedName("aa.aa")
    public boolean field897 = false;

    @ObfuscatedName("aa.ax")
    public int field906 = -1;

    @ObfuscatedName("aa.ah")
    public int[] field938;

    @ObfuscatedName("aa.av")
    public int field950 = -1;

    @ObfuscatedName("aa.af")
    public int field908 = -1;

    @ObfuscatedName("aa.ai")
    public int field941 = -1;

    @ObfuscatedName("aa.ak")
    public int field942 = 0;

    @ObfuscatedName("aa.ab")
    public int field943 = 0;

    @ObfuscatedName("aa.aj")
    public int field944 = 0;

    @ObfuscatedName("aa.ac")
    public int[] field945;

    @ObfuscatedName("fa.k(II)Laa;")
    public static class41 method2962(int arg0) {
        class41 var1 = (class41) field937.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field905.method3118(6, arg0);
        class41 var3 = new class41();
        var3.field904 = arg0;
        if (var2 != null) {
            var3.method757(new class119(var2));
        }
        var3.method745();
        if (var3.field897) {
            var3.field903 = 0;
            var3.field915 = false;
        }
        field937.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.h(I)V")
    public void method745() {
        if (this.field922 == -1) {
            this.field922 = 0;
            if (this.field902 != null && (this.field899 == null || this.field899[0] == 10)) {
                this.field922 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field924[var1] != null) {
                    this.field922 = 1;
                }
            }
        }
        if (this.field906 == -1) {
            this.field906 = this.field903 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aa.o(Ldk;B)V")
    public void method757(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("aa.z(Ldk;II)V")
    public void method747(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2330();
            if (var3 > 0) {
                if (this.field902 == null || field926) {
                    this.field899 = new int[var3];
                    this.field902 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field902[var4] = arg0.method2332();
                        this.field899[var4] = arg0.method2330();
                    }
                } else {
                    arg0.field1949 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field907 = arg0.method2337();
        } else if (arg1 == 5) {
            int var5 = arg0.method2330();
            if (var5 > 0) {
                if (this.field902 == null || field926) {
                    this.field899 = null;
                    this.field902 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field902[var6] = arg0.method2332();
                    }
                } else {
                    arg0.field1949 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field912 = arg0.method2330();
        } else if (arg1 == 15) {
            this.field913 = arg0.method2330();
        } else if (arg1 == 17) {
            this.field903 = 0;
            this.field915 = false;
        } else if (arg1 == 18) {
            this.field915 = false;
        } else if (arg1 == 19) {
            this.field922 = arg0.method2330();
        } else if (arg1 == 21) {
            this.field936 = 0;
        } else if (arg1 == 22) {
            this.field918 = true;
        } else if (arg1 == 23) {
            this.field919 = true;
        } else if (arg1 == 24) {
            this.field939 = arg0.method2332();
            if (this.field939 == 65535) {
                this.field939 = -1;
            }
        } else if (arg1 == 27) {
            this.field903 = 1;
        } else if (arg1 == 28) {
            this.field900 = arg0.method2330();
        } else if (arg1 == 29) {
            this.field914 = arg0.method2413();
        } else if (arg1 == 39) {
            this.field923 = arg0.method2413() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field924[arg1 - 30] = arg0.method2337();
            if (this.field924[arg1 - 30].equalsIgnoreCase(class157.field2296)) {
                this.field924[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2330();
            this.field928 = new short[var7];
            this.field909 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field928[var8] = (short) arg0.method2332();
                this.field909[var8] = (short) arg0.method2332();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2330();
            this.field910 = new short[var9];
            this.field911 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field910[var10] = (short) arg0.method2332();
                this.field911[var10] = (short) arg0.method2332();
            }
        } else if (arg1 == 60) {
            this.field925 = arg0.method2332();
        } else if (arg1 == 62) {
            this.field920 = true;
        } else if (arg1 == 64) {
            this.field932 = false;
        } else if (arg1 == 65) {
            this.field929 = arg0.method2332();
        } else if (arg1 == 66) {
            this.field930 = arg0.method2332();
        } else if (arg1 == 67) {
            this.field931 = arg0.method2332();
        } else if (arg1 == 68) {
            this.field921 = arg0.method2332();
        } else if (arg1 == 69) {
            arg0.method2330();
        } else if (arg1 == 70) {
            this.field940 = arg0.method2333();
        } else if (arg1 == 71) {
            this.field933 = arg0.method2333();
        } else if (arg1 == 72) {
            this.field934 = arg0.method2333();
        } else if (arg1 == 73) {
            this.field935 = true;
        } else if (arg1 == 74) {
            this.field897 = true;
        } else if (arg1 == 75) {
            this.field906 = arg0.method2330();
        } else if (arg1 == 77) {
            this.field950 = arg0.method2332();
            if (this.field950 == 65535) {
                this.field950 = -1;
            }
            this.field908 = arg0.method2332();
            if (this.field908 == 65535) {
                this.field908 = -1;
            }
            int var11 = arg0.method2330();
            this.field938 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field938[var12] = arg0.method2332();
                if (this.field938[var12] == 65535) {
                    this.field938[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field941 = arg0.method2332();
            this.field942 = arg0.method2330();
        } else if (arg1 == 79) {
            this.field943 = arg0.method2332();
            this.field944 = arg0.method2332();
            this.field942 = arg0.method2330();
            int var13 = arg0.method2330();
            this.field945 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field945[var14] = arg0.method2332();
            }
        } else if (arg1 == 81) {
            this.field936 = arg0.method2330() * 256;
        }
    }

    @ObfuscatedName("aa.c(II)Z")
    public final boolean method748(int arg0) {
        if (this.field899 != null) {
            for (int var4 = 0; var4 < this.field899.length; var4++) {
                if (this.field899[var4] == arg0) {
                    return Statics.field898.method3051(this.field902[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field902 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field902.length; var3++) {
                var2 &= Statics.field898.method3051(this.field902[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aa.d(I)Z")
    public final boolean method749() {
        if (this.field902 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field902.length; var2++) {
            var1 &= Statics.field898.method3051(this.field902[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aa.l(II[[IIIIB)Lcw;")
    public final class85 method750(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field899 == null) {
            var7 = (long) ((this.field904 << 10) + arg1);
        } else {
            var7 = (long) ((this.field904 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field901.method3510(var7);
        if (var9 == null) {
            class100 var10 = this.method744(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field918) {
                var10.field1694 = (short) (this.field914 + 64);
                var10.field1686 = (short) (this.field923 + 768);
                var10.method2068();
                var9 = var10;
            } else {
                var9 = var10.method2089(this.field914 + 64, this.field923 + 768, -50, -10, -50);
            }
            field901.method3512(var9, var7);
        }
        if (this.field918) {
            var9 = ((class100) var9).method2056();
        }
        if (this.field936 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2137(arg2, arg3, arg4, arg5, true, this.field936);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2050(arg2, arg3, arg4, arg5, true, this.field936);
            }
        }
        return var9;
    }

    @ObfuscatedName("aa.b(II[[IIIII)Ldl;")
    public final class105 method746(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field899 == null) {
            var7 = (long) ((this.field904 << 10) + arg1);
        } else {
            var7 = (long) ((this.field904 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field917.method3510(var7);
        if (var9 == null) {
            class100 var10 = this.method744(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2089(this.field914 + 64, this.field923 + 768, -50, -10, -50);
            field917.method3512(var9, var7);
        }
        if (this.field936 >= 0) {
            var9 = var9.method2137(arg2, arg3, arg4, arg5, true, this.field936);
        }
        return var9;
    }

    @ObfuscatedName("aa.j(II[[IIIILah;II)Ldl;")
    public final class105 method752(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field899 == null) {
            var9 = (long) ((this.field904 << 10) + arg1);
        } else {
            var9 = (long) ((this.field904 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field917.method3510(var9);
        if (var11 == null) {
            class100 var12 = this.method744(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2089(this.field914 + 64, this.field923 + 768, -50, -10, -50);
            field917.method3512(var11, var9);
        }
        if (arg6 == null && this.field936 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2138(true);
        } else {
            var13 = arg6.method834(var11, arg7, arg1);
        }
        if (this.field936 >= 0) {
            var13 = var13.method2137(arg2, arg3, arg4, arg5, false, this.field936);
        }
        return var13;
    }

    @ObfuscatedName("aa.f(IIB)Lcg;")
    public final class100 method744(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field899 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field902 == null) {
                return null;
            }
            boolean var4 = this.field920;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field902.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field902[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field927.method3510((long) var7);
                if (var3 == null) {
                    var3 = class100.method2051(Statics.field898, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2066();
                    }
                    field927.method3512(var3, (long) var7);
                }
                if (var5 > 1) {
                    field896[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field896, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field899.length; var9++) {
                if (this.field899[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field902[var8];
            boolean var11 = this.field920 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field927.method3510((long) var10);
            if (var3 == null) {
                var3 = class100.method2051(Statics.field898, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2066();
                }
                field927.method3512(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field929 == 128 && this.field930 == 128 && this.field931 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field940 == 0 && this.field933 == 0 && this.field934 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field928 == null, this.field910 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2062(256);
            var14.method2120(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2059();
        } else if (var15 == 2) {
            var14.method2071();
        } else if (var15 == 3) {
            var14.method2061();
        }
        if (this.field928 != null) {
            for (int var16 = 0; var16 < this.field928.length; var16++) {
                var14.method2064(this.field928[var16], this.field909[var16]);
            }
        }
        if (this.field910 != null) {
            for (int var17 = 0; var17 < this.field910.length; var17++) {
                var14.method2070(this.field910[var17], this.field911[var17]);
            }
        }
        if (var12) {
            var14.method2067(this.field929, this.field930, this.field931);
        }
        if (var13) {
            var14.method2120(this.field940, this.field933, this.field934);
        }
        return var14;
    }

    @ObfuscatedName("aa.i(B)Laa;")
    public final class41 method754() {
        int var1 = -1;
        if (this.field950 != -1) {
            var1 = class176.method3506(this.field950);
        } else if (this.field908 != -1) {
            var1 = class176.field2886[this.field908];
        }
        return var1 < 0 || var1 >= this.field938.length || this.field938[var1] == -1 ? null : method2962(this.field938[var1]);
    }

    @ObfuscatedName("aa.g(I)Z")
    public boolean method755() {
        if (this.field938 == null) {
            return this.field941 != -1 || this.field945 != null;
        }
        for (int var1 = 0; var1 < this.field938.length; var1++) {
            if (this.field938[var1] != -1) {
                class41 var2 = method2962(this.field938[var1]);
                if (var2.field941 != -1 || var2.field945 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
