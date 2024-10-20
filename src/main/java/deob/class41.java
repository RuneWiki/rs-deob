package deob;

@ObfuscatedName("aa")
public class class41 extends class204 {

    @ObfuscatedName("aa.v")
    public static boolean field938 = false;

    @ObfuscatedName("aa.d")
    public static class193 field919 = new class193(64);

    @ObfuscatedName("aa.o")
    public static class193 field920 = new class193(500);

    @ObfuscatedName("aa.c")
    public static class193 field941 = new class193(30);

    @ObfuscatedName("aa.p")
    public static class193 field922 = new class193(30);

    @ObfuscatedName("aa.j")
    public static class100[] field923 = new class100[4];

    @ObfuscatedName("aa.a")
    public int field953;

    @ObfuscatedName("aa.y")
    public int[] field962;

    @ObfuscatedName("aa.h")
    public int[] field926;

    @ObfuscatedName("aa.z")
    public String field946 = "null";

    @ObfuscatedName("aa.w")
    public short[] field917;

    @ObfuscatedName("aa.l")
    public short[] field929;

    @ObfuscatedName("aa.q")
    public short[] field930;

    @ObfuscatedName("aa.x")
    public short[] field931;

    @ObfuscatedName("aa.s")
    public int field928 = 1;

    @ObfuscatedName("aa.n")
    public int field933 = 1;

    @ObfuscatedName("aa.u")
    public int field942 = 2;

    @ObfuscatedName("aa.m")
    public boolean field935 = true;

    @ObfuscatedName("aa.e")
    public int field936 = -1;

    @ObfuscatedName("aa.k")
    public int field937 = -1;

    @ObfuscatedName("aa.r")
    public boolean field932 = false;

    @ObfuscatedName("aa.b")
    public boolean field939 = false;

    @ObfuscatedName("aa.t")
    public int field940 = -1;

    @ObfuscatedName("aa.g")
    public int field925 = 16;

    @ObfuscatedName("aa.af")
    public int field951 = 0;

    @ObfuscatedName("aa.ad")
    public int field943 = 0;

    @ObfuscatedName("aa.ak")
    public String[] field944 = new String[5];

    @ObfuscatedName("aa.ai")
    public int field945 = -1;

    @ObfuscatedName("aa.au")
    public int field950 = -1;

    @ObfuscatedName("aa.ar")
    public boolean field927 = false;

    @ObfuscatedName("aa.aw")
    public boolean field948 = true;

    @ObfuscatedName("aa.at")
    public int field949 = 128;

    @ObfuscatedName("aa.al")
    public int field961 = 128;

    @ObfuscatedName("aa.aj")
    public int field916 = 128;

    @ObfuscatedName("aa.ag")
    public int field952 = 0;

    @ObfuscatedName("aa.ay")
    public int field967 = 0;

    @ObfuscatedName("aa.az")
    public int field954 = 0;

    @ObfuscatedName("aa.ac")
    public boolean field955 = false;

    @ObfuscatedName("aa.aa")
    public boolean field956 = false;

    @ObfuscatedName("aa.ao")
    public int field957 = -1;

    @ObfuscatedName("aa.av")
    public int[] field958;

    @ObfuscatedName("aa.am")
    public int field959 = -1;

    @ObfuscatedName("aa.an")
    public int field960 = -1;

    @ObfuscatedName("aa.ae")
    public int field924 = -1;

    @ObfuscatedName("aa.ap")
    public int field947 = 0;

    @ObfuscatedName("aa.ax")
    public int field934 = 0;

    @ObfuscatedName("aa.ab")
    public int field964 = 0;

    @ObfuscatedName("aa.as")
    public int[] field965;

    @ObfuscatedName("cw.v(Lfh;Lfh;ZI)V")
    public static void method2150(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field963 = arg0;
        Statics.field918 = arg1;
        field938 = arg2;
    }

    @ObfuscatedName("z.f(IB)Laa;")
    public static class41 method151(int arg0) {
        class41 var1 = (class41) field919.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field963.method3082(6, arg0);
        class41 var3 = new class41();
        var3.field953 = arg0;
        if (var2 != null) {
            var3.method772(new class119(var2));
        }
        var3.method771();
        if (var3.field956) {
            var3.field942 = 0;
            var3.field935 = false;
        }
        field919.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.i(B)V")
    public void method771() {
        if (this.field936 == -1) {
            this.field936 = 0;
            if (this.field962 != null && (this.field926 == null || this.field926[0] == 10)) {
                this.field936 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field944[var1] != null) {
                    this.field936 = 1;
                }
            }
        }
        if (this.field957 == -1) {
            this.field957 = this.field942 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aa.d(Ldx;I)V")
    public void method772(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("aa.o(Ldx;II)V")
    public void method773(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2400();
            if (var3 > 0) {
                if (this.field962 == null || field938) {
                    this.field926 = new int[var3];
                    this.field962 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field962[var4] = arg0.method2334();
                        this.field926[var4] = arg0.method2400();
                    }
                } else {
                    arg0.field1984 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field946 = arg0.method2357();
        } else if (arg1 == 5) {
            int var5 = arg0.method2400();
            if (var5 > 0) {
                if (this.field962 == null || field938) {
                    this.field926 = null;
                    this.field962 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field962[var6] = arg0.method2334();
                    }
                } else {
                    arg0.field1984 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field928 = arg0.method2400();
        } else if (arg1 == 15) {
            this.field933 = arg0.method2400();
        } else if (arg1 == 17) {
            this.field942 = 0;
            this.field935 = false;
        } else if (arg1 == 18) {
            this.field935 = false;
        } else if (arg1 == 19) {
            this.field936 = arg0.method2400();
        } else if (arg1 == 21) {
            this.field937 = 0;
        } else if (arg1 == 22) {
            this.field932 = true;
        } else if (arg1 == 23) {
            this.field939 = true;
        } else if (arg1 == 24) {
            this.field940 = arg0.method2334();
            if (this.field940 == 65535) {
                this.field940 = -1;
            }
        } else if (arg1 == 27) {
            this.field942 = 1;
        } else if (arg1 == 28) {
            this.field925 = arg0.method2400();
        } else if (arg1 == 29) {
            this.field951 = arg0.method2350();
        } else if (arg1 == 39) {
            this.field943 = arg0.method2350() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field944[arg1 - 30] = arg0.method2357();
            if (this.field944[arg1 - 30].equalsIgnoreCase(class157.field2406)) {
                this.field944[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2400();
            this.field917 = new short[var7];
            this.field929 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field917[var8] = (short) arg0.method2334();
                this.field929[var8] = (short) arg0.method2334();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2400();
            this.field930 = new short[var9];
            this.field931 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field930[var10] = (short) arg0.method2334();
                this.field931[var10] = (short) arg0.method2334();
            }
        } else if (arg1 == 60) {
            this.field945 = arg0.method2334();
        } else if (arg1 == 62) {
            this.field927 = true;
        } else if (arg1 == 64) {
            this.field948 = false;
        } else if (arg1 == 65) {
            this.field949 = arg0.method2334();
        } else if (arg1 == 66) {
            this.field961 = arg0.method2334();
        } else if (arg1 == 67) {
            this.field916 = arg0.method2334();
        } else if (arg1 == 68) {
            this.field950 = arg0.method2334();
        } else if (arg1 == 69) {
            arg0.method2400();
        } else if (arg1 == 70) {
            this.field952 = arg0.method2538();
        } else if (arg1 == 71) {
            this.field967 = arg0.method2538();
        } else if (arg1 == 72) {
            this.field954 = arg0.method2538();
        } else if (arg1 == 73) {
            this.field955 = true;
        } else if (arg1 == 74) {
            this.field956 = true;
        } else if (arg1 == 75) {
            this.field957 = arg0.method2400();
        } else if (arg1 == 77) {
            this.field959 = arg0.method2334();
            if (this.field959 == 65535) {
                this.field959 = -1;
            }
            this.field960 = arg0.method2334();
            if (this.field960 == 65535) {
                this.field960 = -1;
            }
            int var11 = arg0.method2400();
            this.field958 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field958[var12] = arg0.method2334();
                if (this.field958[var12] == 65535) {
                    this.field958[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field924 = arg0.method2334();
            this.field947 = arg0.method2400();
        } else if (arg1 == 79) {
            this.field934 = arg0.method2334();
            this.field964 = arg0.method2334();
            this.field947 = arg0.method2400();
            int var13 = arg0.method2400();
            this.field965 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field965[var14] = arg0.method2334();
            }
        } else if (arg1 == 81) {
            this.field937 = arg0.method2400() * 256;
        }
    }

    @ObfuscatedName("aa.c(II)Z")
    public final boolean method774(int arg0) {
        if (this.field926 != null) {
            for (int var4 = 0; var4 < this.field926.length; var4++) {
                if (this.field926[var4] == arg0) {
                    return Statics.field918.method3070(this.field962[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field962 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field962.length; var3++) {
                var2 &= Statics.field918.method3070(this.field962[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aa.p(B)Z")
    public final boolean method775() {
        if (this.field962 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field962.length; var2++) {
            var1 &= Statics.field918.method3070(this.field962[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aa.j(II[[IIIII)Lck;")
    public final class85 method770(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field926 == null) {
            var7 = (long) ((this.field953 << 10) + arg1);
        } else {
            var7 = (long) ((this.field953 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field941.method3490(var7);
        if (var9 == null) {
            class100 var10 = this.method790(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field932) {
                var10.field1668 = (short) (this.field951 + 64);
                var10.field1699 = (short) (this.field943 + 768);
                var10.method2070();
                var9 = var10;
            } else {
                var9 = var10.method2074(this.field951 + 64, this.field943 + 768, -50, -10, -50);
            }
            field941.method3502(var9, var7);
        }
        if (this.field932) {
            var9 = ((class100) var9).method2058();
        }
        if (this.field937 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2155(arg2, arg3, arg4, arg5, true, this.field937);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2059(arg2, arg3, arg4, arg5, true, this.field937);
            }
        }
        return var9;
    }

    @ObfuscatedName("aa.a(II[[IIIII)Ldq;")
    public final class105 method779(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field926 == null) {
            var7 = (long) ((this.field953 << 10) + arg1);
        } else {
            var7 = (long) ((this.field953 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field922.method3490(var7);
        if (var9 == null) {
            class100 var10 = this.method790(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2074(this.field951 + 64, this.field943 + 768, -50, -10, -50);
            field922.method3502(var9, var7);
        }
        if (this.field937 >= 0) {
            var9 = var9.method2155(arg2, arg3, arg4, arg5, true, this.field937);
        }
        return var9;
    }

    @ObfuscatedName("aa.y(II[[IIIILav;II)Ldq;")
    public final class105 method778(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field926 == null) {
            var9 = (long) ((this.field953 << 10) + arg1);
        } else {
            var9 = (long) ((this.field953 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field922.method3490(var9);
        if (var11 == null) {
            class100 var12 = this.method790(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2074(this.field951 + 64, this.field943 + 768, -50, -10, -50);
            field922.method3502(var11, var9);
        }
        if (arg6 == null && this.field937 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2156(true);
        } else {
            var13 = arg6.method845(var11, arg7, arg1);
        }
        if (this.field937 >= 0) {
            var13 = var13.method2155(arg2, arg3, arg4, arg5, false, this.field937);
        }
        return var13;
    }

    @ObfuscatedName("aa.h(IIB)Lca;")
    public final class100 method790(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field926 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field962 == null) {
                return null;
            }
            boolean var4 = this.field927;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field962.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field962[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field920.method3490((long) var7);
                if (var3 == null) {
                    var3 = class100.method2053(Statics.field918, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2068();
                    }
                    field920.method3502(var3, (long) var7);
                }
                if (var5 > 1) {
                    field923[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field923, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field926.length; var9++) {
                if (this.field926[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field962[var8];
            boolean var11 = this.field927 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field920.method3490((long) var10);
            if (var3 == null) {
                var3 = class100.method2053(Statics.field918, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2068();
                }
                field920.method3502(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field949 == 128 && this.field961 == 128 && this.field916 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field952 == 0 && this.field967 == 0 && this.field954 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field917 == null, this.field930 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2126(256);
            var14.method2065(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2086();
        } else if (var15 == 2) {
            var14.method2062();
        } else if (var15 == 3) {
            var14.method2063();
        }
        if (this.field917 != null) {
            for (int var16 = 0; var16 < this.field917.length; var16++) {
                var14.method2123(this.field917[var16], this.field929[var16]);
            }
        }
        if (this.field930 != null) {
            for (int var17 = 0; var17 < this.field930.length; var17++) {
                var14.method2067(this.field930[var17], this.field931[var17]);
            }
        }
        if (var12) {
            var14.method2095(this.field949, this.field961, this.field916);
        }
        if (var13) {
            var14.method2065(this.field952, this.field967, this.field954);
        }
        return var14;
    }

    @ObfuscatedName("aa.z(I)Laa;")
    public final class41 method780() {
        int var1 = -1;
        if (this.field959 != -1) {
            var1 = class176.method542(this.field959);
        } else if (this.field960 != -1) {
            var1 = class176.field2908[this.field960];
        }
        return var1 < 0 || var1 >= this.field958.length || this.field958[var1] == -1 ? null : method151(this.field958[var1]);
    }

    @ObfuscatedName("aa.w(I)Z")
    public boolean method781() {
        if (this.field958 == null) {
            return this.field924 != -1 || this.field965 != null;
        }
        for (int var1 = 0; var1 < this.field958.length; var1++) {
            if (this.field958[var1] != -1) {
                class41 var2 = method151(this.field958[var1]);
                if (var2.field924 != -1 || var2.field965 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
