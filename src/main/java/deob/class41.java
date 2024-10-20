package deob;

@ObfuscatedName("ai")
public class class41 extends class204 {

    @ObfuscatedName("ai.z")
    public static boolean field960 = false;

    @ObfuscatedName("ai.f")
    public static class193 field915 = new class193(64);

    @ObfuscatedName("ai.d")
    public static class193 field916 = new class193(500);

    @ObfuscatedName("ai.l")
    public static class193 field917 = new class193(30);

    @ObfuscatedName("ai.r")
    public static class193 field918 = new class193(30);

    @ObfuscatedName("ai.g")
    public static class100[] field921 = new class100[4];

    @ObfuscatedName("ai.h")
    public int field920;

    @ObfuscatedName("ai.n")
    public int[] field912;

    @ObfuscatedName("ai.j")
    public int[] field943;

    @ObfuscatedName("ai.a")
    public String field923 = "null";

    @ObfuscatedName("ai.b")
    public short[] field924;

    @ObfuscatedName("ai.c")
    public short[] field925;

    @ObfuscatedName("ai.v")
    public short[] field935;

    @ObfuscatedName("ai.p")
    public short[] field939;

    @ObfuscatedName("ai.i")
    public int field928 = 1;

    @ObfuscatedName("ai.t")
    public int field929 = 1;

    @ObfuscatedName("ai.u")
    public int field930 = 2;

    @ObfuscatedName("ai.e")
    public boolean field955 = true;

    @ObfuscatedName("ai.m")
    public int field932 = -1;

    @ObfuscatedName("ai.s")
    public int field933 = -1;

    @ObfuscatedName("ai.x")
    public boolean field934 = false;

    @ObfuscatedName("ai.y")
    public boolean field919 = false;

    @ObfuscatedName("ai.w")
    public int field937 = -1;

    @ObfuscatedName("ai.o")
    public int field941 = 16;

    @ObfuscatedName("ai.aw")
    public int field938 = 0;

    @ObfuscatedName("ai.an")
    public int field936 = 0;

    @ObfuscatedName("ai.ab")
    public String[] field913 = new String[5];

    @ObfuscatedName("ai.al")
    public int field926 = -1;

    @ObfuscatedName("ai.ay")
    public int field927 = -1;

    @ObfuscatedName("ai.aq")
    public boolean field914 = false;

    @ObfuscatedName("ai.ac")
    public boolean field944 = true;

    @ObfuscatedName("ai.ak")
    public int field942 = 128;

    @ObfuscatedName("ai.am")
    public int field946 = 128;

    @ObfuscatedName("ai.aj")
    public int field947 = 128;

    @ObfuscatedName("ai.au")
    public int field948 = 0;

    @ObfuscatedName("ai.av")
    public int field949 = 0;

    @ObfuscatedName("ai.ad")
    public int field950 = 0;

    @ObfuscatedName("ai.ae")
    public boolean field951 = false;

    @ObfuscatedName("ai.ai")
    public boolean field952 = false;

    @ObfuscatedName("ai.at")
    public int field922 = -1;

    @ObfuscatedName("ai.ah")
    public int[] field954;

    @ObfuscatedName("ai.ao")
    public int field931 = -1;

    @ObfuscatedName("ai.aa")
    public int field956 = -1;

    @ObfuscatedName("ai.ax")
    public int field957 = -1;

    @ObfuscatedName("ai.as")
    public int field958 = 0;

    @ObfuscatedName("ai.ar")
    public int field959 = 0;

    @ObfuscatedName("ai.ap")
    public int field940 = 0;

    @ObfuscatedName("ai.ag")
    public int[] field961;

    @ObfuscatedName("ae.z(Lfl;Lfl;ZI)V")
    public static void method759(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field945 = arg0;
        Statics.field953 = arg1;
        field960 = arg2;
    }

    @ObfuscatedName("hv.q(IS)Lai;")
    public static class41 method3664(int arg0) {
        class41 var1 = (class41) field915.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field945.method2986(6, arg0);
        class41 var3 = new class41();
        var3.field920 = arg0;
        if (var2 != null) {
            var3.method763(new class119(var2));
        }
        var3.method766();
        if (var3.field952) {
            var3.field930 = 0;
            var3.field955 = false;
        }
        field915.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(I)V")
    public void method766() {
        if (this.field932 == -1) {
            this.field932 = 0;
            if (this.field912 != null && (this.field943 == null || this.field943[0] == 10)) {
                this.field932 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field913[var1] != null) {
                    this.field932 = 1;
                }
            }
        }
        if (this.field922 == -1) {
            this.field922 = this.field930 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.f(Lda;B)V")
    public void method763(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method762(arg0, var2);
        }
    }

    @ObfuscatedName("ai.d(Lda;II)V")
    public void method762(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2457();
            if (var3 > 0) {
                if (this.field912 == null || field960) {
                    this.field943 = new int[var3];
                    this.field912 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field912[var4] = arg0.method2415();
                        this.field943[var4] = arg0.method2457();
                    }
                } else {
                    arg0.field1986 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field923 = arg0.method2309();
        } else if (arg1 == 5) {
            int var5 = arg0.method2457();
            if (var5 > 0) {
                if (this.field912 == null || field960) {
                    this.field943 = null;
                    this.field912 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field912[var6] = arg0.method2415();
                    }
                } else {
                    arg0.field1986 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field928 = arg0.method2457();
        } else if (arg1 == 15) {
            this.field929 = arg0.method2457();
        } else if (arg1 == 17) {
            this.field930 = 0;
            this.field955 = false;
        } else if (arg1 == 18) {
            this.field955 = false;
        } else if (arg1 == 19) {
            this.field932 = arg0.method2457();
        } else if (arg1 == 21) {
            this.field933 = 0;
        } else if (arg1 == 22) {
            this.field934 = true;
        } else if (arg1 == 23) {
            this.field919 = true;
        } else if (arg1 == 24) {
            this.field937 = arg0.method2415();
            if (this.field937 == 65535) {
                this.field937 = -1;
            }
        } else if (arg1 == 27) {
            this.field930 = 1;
        } else if (arg1 == 28) {
            this.field941 = arg0.method2457();
        } else if (arg1 == 29) {
            this.field938 = arg0.method2423();
        } else if (arg1 == 39) {
            this.field936 = arg0.method2423() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field913[arg1 - 30] = arg0.method2309();
            if (this.field913[arg1 - 30].equalsIgnoreCase(class157.field2554)) {
                this.field913[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2457();
            this.field924 = new short[var7];
            this.field925 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field924[var8] = (short) arg0.method2415();
                this.field925[var8] = (short) arg0.method2415();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2457();
            this.field935 = new short[var9];
            this.field939 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field935[var10] = (short) arg0.method2415();
                this.field939[var10] = (short) arg0.method2415();
            }
        } else if (arg1 == 60) {
            this.field926 = arg0.method2415();
        } else if (arg1 == 62) {
            this.field914 = true;
        } else if (arg1 == 64) {
            this.field944 = false;
        } else if (arg1 == 65) {
            this.field942 = arg0.method2415();
        } else if (arg1 == 66) {
            this.field946 = arg0.method2415();
        } else if (arg1 == 67) {
            this.field947 = arg0.method2415();
        } else if (arg1 == 68) {
            this.field927 = arg0.method2415();
        } else if (arg1 == 69) {
            arg0.method2457();
        } else if (arg1 == 70) {
            this.field948 = arg0.method2494();
        } else if (arg1 == 71) {
            this.field949 = arg0.method2494();
        } else if (arg1 == 72) {
            this.field950 = arg0.method2494();
        } else if (arg1 == 73) {
            this.field951 = true;
        } else if (arg1 == 74) {
            this.field952 = true;
        } else if (arg1 == 75) {
            this.field922 = arg0.method2457();
        } else if (arg1 == 77) {
            this.field931 = arg0.method2415();
            if (this.field931 == 65535) {
                this.field931 = -1;
            }
            this.field956 = arg0.method2415();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
            int var11 = arg0.method2457();
            this.field954 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field954[var12] = arg0.method2415();
                if (this.field954[var12] == 65535) {
                    this.field954[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field957 = arg0.method2415();
            this.field958 = arg0.method2457();
        } else if (arg1 == 79) {
            this.field959 = arg0.method2415();
            this.field940 = arg0.method2415();
            this.field958 = arg0.method2457();
            int var13 = arg0.method2457();
            this.field961 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field961[var14] = arg0.method2415();
            }
        } else if (arg1 == 81) {
            this.field933 = arg0.method2457() * 256;
        }
    }

    @ObfuscatedName("ai.l(II)Z")
    public final boolean method792(int arg0) {
        if (this.field943 != null) {
            for (int var4 = 0; var4 < this.field943.length; var4++) {
                if (this.field943[var4] == arg0) {
                    return Statics.field953.method3067(this.field912[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field912 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field912.length; var3++) {
                var2 &= Statics.field953.method3067(this.field912[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.r(I)Z")
    public final boolean method772() {
        if (this.field912 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field912.length; var2++) {
            var1 &= Statics.field953.method3067(this.field912[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.g(II[[IIIII)Lcc;")
    public final class85 method791(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field943 == null) {
            var7 = (long) ((this.field920 << 10) + arg1);
        } else {
            var7 = (long) ((this.field920 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field917.method3439(var7);
        if (var9 == null) {
            class100 var10 = this.method769(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field934) {
                var10.field1680 = (short) (this.field938 + 64);
                var10.field1715 = (short) (this.field936 + 768);
                var10.method2014();
                var9 = var10;
            } else {
                var9 = var10.method2019(this.field938 + 64, this.field936 + 768, -50, -10, -50);
            }
            field917.method3429(var9, var7);
        }
        if (this.field934) {
            var9 = ((class100) var9).method2018();
        }
        if (this.field933 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2102(arg2, arg3, arg4, arg5, true, this.field933);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2051(arg2, arg3, arg4, arg5, true, this.field933);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.h(II[[IIIII)Ldb;")
    public final class105 method767(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field943 == null) {
            var7 = (long) ((this.field920 << 10) + arg1);
        } else {
            var7 = (long) ((this.field920 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field918.method3439(var7);
        if (var9 == null) {
            class100 var10 = this.method769(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2019(this.field938 + 64, this.field936 + 768, -50, -10, -50);
            field918.method3429(var9, var7);
        }
        if (this.field933 >= 0) {
            var9 = var9.method2102(arg2, arg3, arg4, arg5, true, this.field933);
        }
        return var9;
    }

    @ObfuscatedName("ai.n(II[[IIIILah;IB)Ldb;")
    public final class105 method768(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field943 == null) {
            var9 = (long) ((this.field920 << 10) + arg1);
        } else {
            var9 = (long) ((this.field920 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field918.method3439(var9);
        if (var11 == null) {
            class100 var12 = this.method769(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2019(this.field938 + 64, this.field936 + 768, -50, -10, -50);
            field918.method3429(var11, var9);
        }
        if (arg6 == null && this.field933 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2123(true);
        } else {
            var13 = arg6.method826(var11, arg7, arg1);
        }
        if (this.field933 >= 0) {
            var13 = var13.method2102(arg2, arg3, arg4, arg5, false, this.field933);
        }
        return var13;
    }

    @ObfuscatedName("ai.j(III)Lcn;")
    public final class100 method769(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field943 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field912 == null) {
                return null;
            }
            boolean var4 = this.field914;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field912.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field912[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field916.method3439((long) var7);
                if (var3 == null) {
                    var3 = class100.method2071(Statics.field953, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2012();
                    }
                    field916.method3429(var3, (long) var7);
                }
                if (var5 > 1) {
                    field921[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field921, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field943.length; var9++) {
                if (this.field943[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field912[var8];
            boolean var11 = this.field914 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field916.method3439((long) var10);
            if (var3 == null) {
                var3 = class100.method2071(Statics.field953, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2012();
                }
                field916.method3429(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field942 == 128 && this.field946 == 128 && this.field947 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field948 == 0 && this.field949 == 0 && this.field950 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field924 == null, this.field935 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2008(256);
            var14.method2009(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2005();
        } else if (var15 == 2) {
            var14.method2006();
        } else if (var15 == 3) {
            var14.method2007();
        }
        if (this.field924 != null) {
            for (int var16 = 0; var16 < this.field924.length; var16++) {
                var14.method2010(this.field924[var16], this.field925[var16]);
            }
        }
        if (this.field935 != null) {
            for (int var17 = 0; var17 < this.field935.length; var17++) {
                var14.method2011(this.field935[var17], this.field939[var17]);
            }
        }
        if (var12) {
            var14.method2000(this.field942, this.field946, this.field947);
        }
        if (var13) {
            var14.method2009(this.field948, this.field949, this.field950);
        }
        return var14;
    }

    @ObfuscatedName("ai.a(I)Lai;")
    public final class41 method770() {
        int var1 = -1;
        if (this.field931 != -1) {
            var1 = class176.method951(this.field931);
        } else if (this.field956 != -1) {
            var1 = class176.field2892[this.field956];
        }
        return var1 < 0 || var1 >= this.field954.length || this.field954[var1] == -1 ? null : method3664(this.field954[var1]);
    }

    @ObfuscatedName("ai.b(I)Z")
    public boolean method798() {
        if (this.field954 == null) {
            return this.field957 != -1 || this.field961 != null;
        }
        for (int var1 = 0; var1 < this.field954.length; var1++) {
            if (this.field954[var1] != -1) {
                class41 var2 = method3664(this.field954[var1]);
                if (var2.field957 != -1 || var2.field961 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
