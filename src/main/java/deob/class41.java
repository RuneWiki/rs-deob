package deob;

@ObfuscatedName("ar")
public class class41 extends class204 {

    @ObfuscatedName("ar.y")
    public static boolean field954 = false;

    @ObfuscatedName("ar.w")
    public static class193 field916 = new class193(64);

    @ObfuscatedName("ar.e")
    public static class193 field917 = new class193(500);

    @ObfuscatedName("ar.c")
    public static class193 field950 = new class193(30);

    @ObfuscatedName("ar.a")
    public static class193 field918 = new class193(30);

    @ObfuscatedName("ar.q")
    public static class100[] field955 = new class100[4];

    @ObfuscatedName("ar.m")
    public int field923;

    @ObfuscatedName("ar.n")
    public int[] field922;

    @ObfuscatedName("ar.k")
    public int[] field914;

    @ObfuscatedName("ar.o")
    public String field934 = "null";

    @ObfuscatedName("ar.f")
    public short[] field951;

    @ObfuscatedName("ar.s")
    public short[] field919;

    @ObfuscatedName("ar.z")
    public short[] field927;

    @ObfuscatedName("ar.b")
    public short[] field928;

    @ObfuscatedName("ar.p")
    public int field929 = 1;

    @ObfuscatedName("ar.r")
    public int field930 = 1;

    @ObfuscatedName("ar.x")
    public int field931 = 2;

    @ObfuscatedName("ar.h")
    public boolean field932 = true;

    @ObfuscatedName("ar.j")
    public int field933 = -1;

    @ObfuscatedName("ar.v")
    public int field926 = -1;

    @ObfuscatedName("ar.l")
    public boolean field935 = false;

    @ObfuscatedName("ar.u")
    public boolean field936 = false;

    @ObfuscatedName("ar.t")
    public int field937 = -1;

    @ObfuscatedName("ar.i")
    public int field938 = 16;

    @ObfuscatedName("ar.ah")
    public int field921 = 0;

    @ObfuscatedName("ar.aa")
    public int field920 = 0;

    @ObfuscatedName("ar.ao")
    public String[] field963 = new String[5];

    @ObfuscatedName("ar.ai")
    public int field942 = -1;

    @ObfuscatedName("ar.ab")
    public int field943 = -1;

    @ObfuscatedName("ar.ae")
    public boolean field960 = false;

    @ObfuscatedName("ar.aw")
    public boolean field945 = true;

    @ObfuscatedName("ar.aj")
    public int field946 = 128;

    @ObfuscatedName("ar.ay")
    public int field947 = 128;

    @ObfuscatedName("ar.af")
    public int field948 = 128;

    @ObfuscatedName("ar.al")
    public int field949 = 0;

    @ObfuscatedName("ar.aq")
    public int field967 = 0;

    @ObfuscatedName("ar.ak")
    public int field944 = 0;

    @ObfuscatedName("ar.az")
    public boolean field952 = false;

    @ObfuscatedName("ar.ar")
    public boolean field953 = false;

    @ObfuscatedName("ar.as")
    public int field924 = -1;

    @ObfuscatedName("ar.am")
    public int[] field962;

    @ObfuscatedName("ar.an")
    public int field956 = -1;

    @ObfuscatedName("ar.au")
    public int field957 = -1;

    @ObfuscatedName("ar.av")
    public int field958 = -1;

    @ObfuscatedName("ar.ac")
    public int field959 = 0;

    @ObfuscatedName("ar.ap")
    public int field940 = 0;

    @ObfuscatedName("ar.ad")
    public int field961 = 0;

    @ObfuscatedName("ar.ag")
    public int[] field939;

    @ObfuscatedName("dx.y(II)Lar;")
    public static class41 method2614(int arg0) {
        class41 var1 = (class41) field916.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3188.method3045(6, arg0);
        class41 var3 = new class41();
        var3.field923 = arg0;
        if (var2 != null) {
            var3.method789(new class119(var2));
        }
        var3.method765();
        if (var3.field953) {
            var3.field931 = 0;
            var3.field932 = false;
        }
        field916.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.d(I)V")
    public void method765() {
        if (this.field933 == -1) {
            this.field933 = 0;
            if (this.field922 != null && (this.field914 == null || this.field914[0] == 10)) {
                this.field933 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field963[var1] != null) {
                    this.field933 = 1;
                }
            }
        }
        if (this.field924 == -1) {
            this.field924 = this.field931 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ar.g(Ldd;I)V")
    public void method789(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method767(arg0, var2);
        }
    }

    @ObfuscatedName("ar.w(Ldd;II)V")
    public void method767(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2326();
            if (var3 > 0) {
                if (this.field922 == null || field954) {
                    this.field914 = new int[var3];
                    this.field922 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field922[var4] = arg0.method2525();
                        this.field914[var4] = arg0.method2326();
                    }
                } else {
                    arg0.field1973 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field934 = arg0.method2334();
        } else if (arg1 == 5) {
            int var5 = arg0.method2326();
            if (var5 > 0) {
                if (this.field922 == null || field954) {
                    this.field914 = null;
                    this.field922 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field922[var6] = arg0.method2525();
                    }
                } else {
                    arg0.field1973 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field929 = arg0.method2326();
        } else if (arg1 == 15) {
            this.field930 = arg0.method2326();
        } else if (arg1 == 17) {
            this.field931 = 0;
            this.field932 = false;
        } else if (arg1 == 18) {
            this.field932 = false;
        } else if (arg1 == 19) {
            this.field933 = arg0.method2326();
        } else if (arg1 == 21) {
            this.field926 = 0;
        } else if (arg1 == 22) {
            this.field935 = true;
        } else if (arg1 == 23) {
            this.field936 = true;
        } else if (arg1 == 24) {
            this.field937 = arg0.method2525();
            if (this.field937 == 65535) {
                this.field937 = -1;
            }
        } else if (arg1 == 27) {
            this.field931 = 1;
        } else if (arg1 == 28) {
            this.field938 = arg0.method2326();
        } else if (arg1 == 29) {
            this.field921 = arg0.method2461();
        } else if (arg1 == 39) {
            this.field920 = arg0.method2461() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field963[arg1 - 30] = arg0.method2334();
            if (this.field963[arg1 - 30].equalsIgnoreCase(class157.field2295)) {
                this.field963[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2326();
            this.field951 = new short[var7];
            this.field919 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field951[var8] = (short) arg0.method2525();
                this.field919[var8] = (short) arg0.method2525();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2326();
            this.field927 = new short[var9];
            this.field928 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field927[var10] = (short) arg0.method2525();
                this.field928[var10] = (short) arg0.method2525();
            }
        } else if (arg1 == 60) {
            this.field942 = arg0.method2525();
        } else if (arg1 == 62) {
            this.field960 = true;
        } else if (arg1 == 64) {
            this.field945 = false;
        } else if (arg1 == 65) {
            this.field946 = arg0.method2525();
        } else if (arg1 == 66) {
            this.field947 = arg0.method2525();
        } else if (arg1 == 67) {
            this.field948 = arg0.method2525();
        } else if (arg1 == 68) {
            this.field943 = arg0.method2525();
        } else if (arg1 == 69) {
            arg0.method2326();
        } else if (arg1 == 70) {
            this.field949 = arg0.method2383();
        } else if (arg1 == 71) {
            this.field967 = arg0.method2383();
        } else if (arg1 == 72) {
            this.field944 = arg0.method2383();
        } else if (arg1 == 73) {
            this.field952 = true;
        } else if (arg1 == 74) {
            this.field953 = true;
        } else if (arg1 == 75) {
            this.field924 = arg0.method2326();
        } else if (arg1 == 77) {
            this.field956 = arg0.method2525();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
            this.field957 = arg0.method2525();
            if (this.field957 == 65535) {
                this.field957 = -1;
            }
            int var11 = arg0.method2326();
            this.field962 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field962[var12] = arg0.method2525();
                if (this.field962[var12] == 65535) {
                    this.field962[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field958 = arg0.method2525();
            this.field959 = arg0.method2326();
        } else if (arg1 == 79) {
            this.field940 = arg0.method2525();
            this.field961 = arg0.method2525();
            this.field959 = arg0.method2326();
            int var13 = arg0.method2326();
            this.field939 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field939[var14] = arg0.method2525();
            }
        } else if (arg1 == 81) {
            this.field926 = arg0.method2326() * 256;
        }
    }

    @ObfuscatedName("ar.e(IB)Z")
    public final boolean method768(int arg0) {
        if (this.field914 != null) {
            for (int var4 = 0; var4 < this.field914.length; var4++) {
                if (this.field914[var4] == arg0) {
                    return Statics.field915.method2998(this.field922[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field922 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field922.length; var3++) {
                var2 &= Statics.field915.method2998(this.field922[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ar.c(I)Z")
    public final boolean method809() {
        if (this.field922 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            var1 &= Statics.field915.method2998(this.field922[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ar.a(II[[IIIIB)Lci;")
    public final class85 method770(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field914 == null) {
            var7 = (long) ((this.field923 << 10) + arg1);
        } else {
            var7 = (long) ((this.field923 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field950.method3425(var7);
        if (var9 == null) {
            class100 var10 = this.method773(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field935) {
                var10.field1707 = (short) (this.field921 + 64);
                var10.field1708 = (short) (this.field920 + 768);
                var10.method2047();
                var9 = var10;
            } else {
                var9 = var10.method2051(this.field921 + 64, this.field920 + 768, -50, -10, -50);
            }
            field950.method3427(var9, var7);
        }
        if (this.field935) {
            var9 = ((class100) var9).method2035();
        }
        if (this.field926 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2125(arg2, arg3, arg4, arg5, true, this.field926);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2036(arg2, arg3, arg4, arg5, true, this.field926);
            }
        }
        return var9;
    }

    @ObfuscatedName("ar.q(II[[IIIIS)Ldg;")
    public final class105 method771(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field914 == null) {
            var7 = (long) ((this.field923 << 10) + arg1);
        } else {
            var7 = (long) ((this.field923 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field918.method3425(var7);
        if (var9 == null) {
            class100 var10 = this.method773(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2051(this.field921 + 64, this.field920 + 768, -50, -10, -50);
            field918.method3427(var9, var7);
        }
        if (this.field926 >= 0) {
            var9 = var9.method2125(arg2, arg3, arg4, arg5, true, this.field926);
        }
        return var9;
    }

    @ObfuscatedName("ar.m(II[[IIIILam;II)Ldg;")
    public final class105 method772(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field914 == null) {
            var9 = (long) ((this.field923 << 10) + arg1);
        } else {
            var9 = (long) ((this.field923 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field918.method3425(var9);
        if (var11 == null) {
            class100 var12 = this.method773(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2051(this.field921 + 64, this.field920 + 768, -50, -10, -50);
            field918.method3427(var11, var9);
        }
        if (arg6 == null && this.field926 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2181(true);
        } else {
            var13 = arg6.method834(var11, arg7, arg1);
        }
        if (this.field926 >= 0) {
            var13 = var13.method2125(arg2, arg3, arg4, arg5, false, this.field926);
        }
        return var13;
    }

    @ObfuscatedName("ar.n(IIB)Lcl;")
    public final class100 method773(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field914 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field922 == null) {
                return null;
            }
            boolean var4 = this.field960;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field922.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field922[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field917.method3425((long) var7);
                if (var3 == null) {
                    var3 = class100.method2031(Statics.field915, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2045();
                    }
                    field917.method3427(var3, (long) var7);
                }
                if (var5 > 1) {
                    field955[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field955, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field914.length; var9++) {
                if (this.field914[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field922[var8];
            boolean var11 = this.field960 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field917.method3425((long) var10);
            if (var3 == null) {
                var3 = class100.method2031(Statics.field915, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2045();
                }
                field917.method3427(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field946 == 128 && this.field947 == 128 && this.field948 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field949 == 0 && this.field967 == 0 && this.field944 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field951 == null, this.field927 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2041(256);
            var14.method2042(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2038();
        } else if (var15 == 2) {
            var14.method2039();
        } else if (var15 == 3) {
            var14.method2040();
        }
        if (this.field951 != null) {
            for (int var16 = 0; var16 < this.field951.length; var16++) {
                var14.method2089(this.field951[var16], this.field919[var16]);
            }
        }
        if (this.field927 != null) {
            for (int var17 = 0; var17 < this.field927.length; var17++) {
                var14.method2044(this.field927[var17], this.field928[var17]);
            }
        }
        if (var12) {
            var14.method2046(this.field946, this.field947, this.field948);
        }
        if (var13) {
            var14.method2042(this.field949, this.field967, this.field944);
        }
        return var14;
    }

    @ObfuscatedName("ar.k(I)Lar;")
    public final class41 method769() {
        int var1 = -1;
        if (this.field956 != -1) {
            var1 = class176.method2749(this.field956);
        } else if (this.field957 != -1) {
            var1 = class176.field2875[this.field957];
        }
        return var1 < 0 || var1 >= this.field962.length || this.field962[var1] == -1 ? null : method2614(this.field962[var1]);
    }

    @ObfuscatedName("ar.o(B)Z")
    public boolean method807() {
        if (this.field962 == null) {
            return this.field958 != -1 || this.field939 != null;
        }
        for (int var1 = 0; var1 < this.field962.length; var1++) {
            if (this.field962[var1] != -1) {
                class41 var2 = method2614(this.field962[var1]);
                if (var2.field958 != -1 || var2.field939 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
