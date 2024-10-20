package deob;

@ObfuscatedName("ag")
public class class41 extends class204 {

    @ObfuscatedName("ag.n")
    public static boolean field924 = false;

    @ObfuscatedName("ag.q")
    public static class193 field901 = new class193(64);

    @ObfuscatedName("ag.j")
    public static class193 field902 = new class193(500);

    @ObfuscatedName("ag.k")
    public static class193 field903 = new class193(30);

    @ObfuscatedName("ag.i")
    public static class193 field939 = new class193(30);

    @ObfuscatedName("ag.m")
    public static class100[] field928 = new class100[4];

    @ObfuscatedName("ag.p")
    public int field900;

    @ObfuscatedName("ag.h")
    public int[] field907;

    @ObfuscatedName("ag.e")
    public int[] field911;

    @ObfuscatedName("ag.g")
    public String field904 = "null";

    @ObfuscatedName("ag.b")
    public short[] field910;

    @ObfuscatedName("ag.f")
    public short[] field906;

    @ObfuscatedName("ag.y")
    public short[] field912;

    @ObfuscatedName("ag.z")
    public short[] field933;

    @ObfuscatedName("ag.t")
    public int field914 = 1;

    @ObfuscatedName("ag.o")
    public int field908 = 1;

    @ObfuscatedName("ag.r")
    public int field916 = 2;

    @ObfuscatedName("ag.u")
    public boolean field921 = true;

    @ObfuscatedName("ag.v")
    public int field918 = -1;

    @ObfuscatedName("ag.a")
    public int field935 = -1;

    @ObfuscatedName("ag.c")
    public boolean field920 = false;

    @ObfuscatedName("ag.l")
    public boolean field946 = false;

    @ObfuscatedName("ag.x")
    public int field917 = -1;

    @ObfuscatedName("ag.w")
    public int field923 = 16;

    @ObfuscatedName("ag.aq")
    public int field919 = 0;

    @ObfuscatedName("ag.az")
    public int field925 = 0;

    @ObfuscatedName("ag.ab")
    public String[] field937 = new String[5];

    @ObfuscatedName("ag.ac")
    public int field927 = -1;

    @ObfuscatedName("ag.ad")
    public int field913 = -1;

    @ObfuscatedName("ag.av")
    public boolean field929 = false;

    @ObfuscatedName("ag.ar")
    public boolean field930 = true;

    @ObfuscatedName("ag.al")
    public int field931 = 128;

    @ObfuscatedName("ag.aj")
    public int field932 = 128;

    @ObfuscatedName("ag.au")
    public int field922 = 128;

    @ObfuscatedName("ag.aw")
    public int field934 = 0;

    @ObfuscatedName("ag.ax")
    public int field898 = 0;

    @ObfuscatedName("ag.ap")
    public int field936 = 0;

    @ObfuscatedName("ag.af")
    public boolean field909 = false;

    @ObfuscatedName("ag.ag")
    public boolean field938 = false;

    @ObfuscatedName("ag.ah")
    public int field947 = -1;

    @ObfuscatedName("ag.at")
    public int[] field915;

    @ObfuscatedName("ag.ak")
    public int field941 = -1;

    @ObfuscatedName("ag.ay")
    public int field926 = -1;

    @ObfuscatedName("ag.ai")
    public int field943 = -1;

    @ObfuscatedName("ag.am")
    public int field944 = 0;

    @ObfuscatedName("ag.ao")
    public int field945 = 0;

    @ObfuscatedName("ag.as")
    public int field940 = 0;

    @ObfuscatedName("ag.aa")
    public int[] field905;

    @ObfuscatedName("e.n(Lfm;Lfm;ZI)V")
    public static void method120(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field899 = arg0;
        Statics.field942 = arg1;
        field924 = arg2;
    }

    @ObfuscatedName("e.d(IS)Lag;")
    public static class41 method116(int arg0) {
        class41 var1 = (class41) field901.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field899.method3010(6, arg0);
        class41 var3 = new class41();
        var3.field900 = arg0;
        if (var2 != null) {
            var3.method772(new class119(var2));
        }
        var3.method768();
        if (var3.field938) {
            var3.field916 = 0;
            var3.field921 = false;
        }
        field901.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.s(I)V")
    public void method768() {
        if (this.field918 == -1) {
            this.field918 = 0;
            if (this.field907 != null && (this.field911 == null || this.field911[0] == 10)) {
                this.field918 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field937[var1] != null) {
                    this.field918 = 1;
                }
            }
        }
        if (this.field947 == -1) {
            this.field947 = this.field916 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ag.q(Ldq;B)V")
    public void method772(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method794(arg0, var2);
        }
    }

    @ObfuscatedName("ag.j(Ldq;II)V")
    public void method794(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2338();
            if (var3 > 0) {
                if (this.field907 == null || field924) {
                    this.field911 = new int[var3];
                    this.field907 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field907[var4] = arg0.method2377();
                        this.field911[var4] = arg0.method2338();
                    }
                } else {
                    arg0.field1977 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field904 = arg0.method2492();
        } else if (arg1 == 5) {
            int var5 = arg0.method2338();
            if (var5 > 0) {
                if (this.field907 == null || field924) {
                    this.field911 = null;
                    this.field907 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field907[var6] = arg0.method2377();
                    }
                } else {
                    arg0.field1977 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field914 = arg0.method2338();
        } else if (arg1 == 15) {
            this.field908 = arg0.method2338();
        } else if (arg1 == 17) {
            this.field916 = 0;
            this.field921 = false;
        } else if (arg1 == 18) {
            this.field921 = false;
        } else if (arg1 == 19) {
            this.field918 = arg0.method2338();
        } else if (arg1 == 21) {
            this.field935 = 0;
        } else if (arg1 == 22) {
            this.field920 = true;
        } else if (arg1 == 23) {
            this.field946 = true;
        } else if (arg1 == 24) {
            this.field917 = arg0.method2377();
            if (this.field917 == 65535) {
                this.field917 = -1;
            }
        } else if (arg1 == 27) {
            this.field916 = 1;
        } else if (arg1 == 28) {
            this.field923 = arg0.method2338();
        } else if (arg1 == 29) {
            this.field919 = arg0.method2330();
        } else if (arg1 == 39) {
            this.field925 = arg0.method2330() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field937[arg1 - 30] = arg0.method2492();
            if (this.field937[arg1 - 30].equalsIgnoreCase(class157.field2512)) {
                this.field937[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2338();
            this.field910 = new short[var7];
            this.field906 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field910[var8] = (short) arg0.method2377();
                this.field906[var8] = (short) arg0.method2377();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2338();
            this.field912 = new short[var9];
            this.field933 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field912[var10] = (short) arg0.method2377();
                this.field933[var10] = (short) arg0.method2377();
            }
        } else if (arg1 == 60) {
            this.field927 = arg0.method2377();
        } else if (arg1 == 62) {
            this.field929 = true;
        } else if (arg1 == 64) {
            this.field930 = false;
        } else if (arg1 == 65) {
            this.field931 = arg0.method2377();
        } else if (arg1 == 66) {
            this.field932 = arg0.method2377();
        } else if (arg1 == 67) {
            this.field922 = arg0.method2377();
        } else if (arg1 == 68) {
            this.field913 = arg0.method2377();
        } else if (arg1 == 69) {
            arg0.method2338();
        } else if (arg1 == 70) {
            this.field934 = arg0.method2341();
        } else if (arg1 == 71) {
            this.field898 = arg0.method2341();
        } else if (arg1 == 72) {
            this.field936 = arg0.method2341();
        } else if (arg1 == 73) {
            this.field909 = true;
        } else if (arg1 == 74) {
            this.field938 = true;
        } else if (arg1 == 75) {
            this.field947 = arg0.method2338();
        } else if (arg1 == 77) {
            this.field941 = arg0.method2377();
            if (this.field941 == 65535) {
                this.field941 = -1;
            }
            this.field926 = arg0.method2377();
            if (this.field926 == 65535) {
                this.field926 = -1;
            }
            int var11 = arg0.method2338();
            this.field915 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field915[var12] = arg0.method2377();
                if (this.field915[var12] == 65535) {
                    this.field915[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field943 = arg0.method2377();
            this.field944 = arg0.method2338();
        } else if (arg1 == 79) {
            this.field945 = arg0.method2377();
            this.field940 = arg0.method2377();
            this.field944 = arg0.method2338();
            int var13 = arg0.method2338();
            this.field905 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field905[var14] = arg0.method2377();
            }
        } else if (arg1 == 81) {
            this.field935 = arg0.method2338() * 256;
        }
    }

    @ObfuscatedName("ag.k(IB)Z")
    public final boolean method771(int arg0) {
        if (this.field911 != null) {
            for (int var4 = 0; var4 < this.field911.length; var4++) {
                if (this.field911[var4] == arg0) {
                    return Statics.field942.method3012(this.field907[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field907 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field907.length; var3++) {
                var2 &= Statics.field942.method3012(this.field907[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ag.i(I)Z")
    public final boolean method803() {
        if (this.field907 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field907.length; var2++) {
            var1 &= Statics.field942.method3012(this.field907[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ag.m(II[[IIIII)Lcd;")
    public final class85 method805(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field911 == null) {
            var7 = (long) ((this.field900 << 10) + arg1);
        } else {
            var7 = (long) ((this.field900 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field903.method3478(var7);
        if (var9 == null) {
            class100 var10 = this.method793(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field920) {
                var10.field1707 = (short) (this.field919 + 64);
                var10.field1708 = (short) (this.field925 + 768);
                var10.method2040();
                var9 = var10;
            } else {
                var9 = var10.method2093(this.field919 + 64, this.field925 + 768, -50, -10, -50);
            }
            field903.method3481(var9, var7);
        }
        if (this.field920) {
            var9 = ((class100) var9).method2104();
        }
        if (this.field935 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2123(arg2, arg3, arg4, arg5, true, this.field935);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2062(arg2, arg3, arg4, arg5, true, this.field935);
            }
        }
        return var9;
    }

    @ObfuscatedName("ag.p(II[[IIIII)Ldb;")
    public final class105 method774(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field911 == null) {
            var7 = (long) ((this.field900 << 10) + arg1);
        } else {
            var7 = (long) ((this.field900 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field939.method3478(var7);
        if (var9 == null) {
            class100 var10 = this.method793(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2093(this.field919 + 64, this.field925 + 768, -50, -10, -50);
            field939.method3481(var9, var7);
        }
        if (this.field935 >= 0) {
            var9 = var9.method2123(arg2, arg3, arg4, arg5, true, this.field935);
        }
        return var9;
    }

    @ObfuscatedName("ag.h(II[[IIIILat;II)Ldb;")
    public final class105 method775(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field911 == null) {
            var9 = (long) ((this.field900 << 10) + arg1);
        } else {
            var9 = (long) ((this.field900 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field939.method3478(var9);
        if (var11 == null) {
            class100 var12 = this.method793(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2093(this.field919 + 64, this.field925 + 768, -50, -10, -50);
            field939.method3481(var11, var9);
        }
        if (arg6 == null && this.field935 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2124(true);
        } else {
            var13 = arg6.method829(var11, arg7, arg1);
        }
        if (this.field935 >= 0) {
            var13 = var13.method2123(arg2, arg3, arg4, arg5, false, this.field935);
        }
        return var13;
    }

    @ObfuscatedName("ag.e(IIB)Lcl;")
    public final class100 method793(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field911 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field907 == null) {
                return null;
            }
            boolean var4 = this.field929;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field907.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field907[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field902.method3478((long) var7);
                if (var3 == null) {
                    var3 = class100.method2024(Statics.field942, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2038();
                    }
                    field902.method3481(var3, (long) var7);
                }
                if (var5 > 1) {
                    field928[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field928, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field911.length; var9++) {
                if (this.field911[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field907[var8];
            boolean var11 = this.field929 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field902.method3478((long) var10);
            if (var3 == null) {
                var3 = class100.method2024(Statics.field942, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2038();
                }
                field902.method3481(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field931 == 128 && this.field932 == 128 && this.field922 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field934 == 0 && this.field898 == 0 && this.field936 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field910 == null, this.field912 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2035(256);
            var14.method2036(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2032();
        } else if (var15 == 2) {
            var14.method2029();
        } else if (var15 == 3) {
            var14.method2034();
        }
        if (this.field910 != null) {
            for (int var16 = 0; var16 < this.field910.length; var16++) {
                var14.method2060(this.field910[var16], this.field906[var16]);
            }
        }
        if (this.field912 != null) {
            for (int var17 = 0; var17 < this.field912.length; var17++) {
                var14.method2076(this.field912[var17], this.field933[var17]);
            }
        }
        if (var12) {
            var14.method2039(this.field931, this.field932, this.field922);
        }
        if (var13) {
            var14.method2036(this.field934, this.field898, this.field936);
        }
        return var14;
    }

    @ObfuscatedName("ag.g(I)Lag;")
    public final class41 method777() {
        int var1 = -1;
        if (this.field941 != -1) {
            var1 = class176.method3086(this.field941);
        } else if (this.field926 != -1) {
            var1 = class176.field2886[this.field926];
        }
        return var1 < 0 || var1 >= this.field915.length || this.field915[var1] == -1 ? null : method116(this.field915[var1]);
    }

    @ObfuscatedName("ag.b(B)Z")
    public boolean method799() {
        if (this.field915 == null) {
            return this.field943 != -1 || this.field905 != null;
        }
        for (int var1 = 0; var1 < this.field915.length; var1++) {
            if (this.field915[var1] != -1) {
                class41 var2 = method116(this.field915[var1]);
                if (var2.field943 != -1 || var2.field905 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
