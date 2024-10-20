package deob;

@ObfuscatedName("av")
public class class41 extends class204 {

    @ObfuscatedName("av.n")
    public static boolean field916 = false;

    @ObfuscatedName("av.l")
    public static class193 field934 = new class193(64);

    @ObfuscatedName("av.r")
    public static class193 field917 = new class193(500);

    @ObfuscatedName("av.u")
    public static class193 field914 = new class193(30);

    @ObfuscatedName("av.j")
    public static class193 field919 = new class193(30);

    @ObfuscatedName("av.w")
    public static class100[] field930 = new class100[4];

    @ObfuscatedName("av.y")
    public int field921;

    @ObfuscatedName("av.o")
    public int[] field922;

    @ObfuscatedName("av.h")
    public int[] field923;

    @ObfuscatedName("av.e")
    public String field942 = "null";

    @ObfuscatedName("av.v")
    public short[] field925;

    @ObfuscatedName("av.p")
    public short[] field935;

    @ObfuscatedName("av.m")
    public short[] field953;

    @ObfuscatedName("av.b")
    public short[] field926;

    @ObfuscatedName("av.s")
    public int field927 = 1;

    @ObfuscatedName("av.x")
    public int field915 = 1;

    @ObfuscatedName("av.z")
    public int field931 = 2;

    @ObfuscatedName("av.d")
    public boolean field932 = true;

    @ObfuscatedName("av.a")
    public int field929 = -1;

    @ObfuscatedName("av.t")
    public int field933 = -1;

    @ObfuscatedName("av.k")
    public boolean field965 = false;

    @ObfuscatedName("av.f")
    public boolean field936 = false;

    @ObfuscatedName("av.g")
    public int field937 = -1;

    @ObfuscatedName("av.i")
    public int field938 = 16;

    @ObfuscatedName("av.ah")
    public int field939 = 0;

    @ObfuscatedName("av.ag")
    public int field924 = 0;

    @ObfuscatedName("av.ac")
    public String[] field941 = new String[5];

    @ObfuscatedName("av.al")
    public int field920 = -1;

    @ObfuscatedName("av.aj")
    public int field955 = -1;

    @ObfuscatedName("av.at")
    public boolean field944 = false;

    @ObfuscatedName("av.ap")
    public boolean field948 = true;

    @ObfuscatedName("av.aa")
    public int field946 = 128;

    @ObfuscatedName("av.ak")
    public int field947 = 128;

    @ObfuscatedName("av.an")
    public int field928 = 128;

    @ObfuscatedName("av.au")
    public int field949 = 0;

    @ObfuscatedName("av.ai")
    public int field950 = 0;

    @ObfuscatedName("av.az")
    public int field951 = 0;

    @ObfuscatedName("av.ao")
    public boolean field952 = false;

    @ObfuscatedName("av.av")
    public boolean field918 = false;

    @ObfuscatedName("av.ad")
    public int field954 = -1;

    @ObfuscatedName("av.af")
    public int[] field964;

    @ObfuscatedName("av.ax")
    public int field956 = -1;

    @ObfuscatedName("av.ae")
    public int field957 = -1;

    @ObfuscatedName("av.aw")
    public int field958 = -1;

    @ObfuscatedName("av.ay")
    public int field943 = 0;

    @ObfuscatedName("av.ab")
    public int field960 = 0;

    @ObfuscatedName("av.ar")
    public int field961 = 0;

    @ObfuscatedName("av.am")
    public int[] field962;

    @ObfuscatedName("l.n(II)Lav;")
    public static class41 method39(int arg0) {
        class41 var1 = (class41) field934.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field940.method3094(6, arg0);
        class41 var3 = new class41();
        var3.field921 = arg0;
        if (var2 != null) {
            var3.method801(new class119(var2));
        }
        var3.method826();
        if (var3.field918) {
            var3.field931 = 0;
            var3.field932 = false;
        }
        field934.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.q(I)V")
    public void method826() {
        if (this.field929 == -1) {
            this.field929 = 0;
            if (this.field922 != null && (this.field923 == null || this.field923[0] == 10)) {
                this.field929 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field941[var1] != null) {
                    this.field929 = 1;
                }
            }
        }
        if (this.field954 == -1) {
            this.field954 = this.field931 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.c(Ldc;I)V")
    public void method801(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method802(arg0, var2);
        }
    }

    @ObfuscatedName("av.l(Ldc;IB)V")
    public void method802(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2360();
            if (var3 > 0) {
                if (this.field922 == null || field916) {
                    this.field923 = new int[var3];
                    this.field922 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field922[var4] = arg0.method2430();
                        this.field923[var4] = arg0.method2360();
                    }
                } else {
                    arg0.field1982 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field942 = arg0.method2368();
        } else if (arg1 == 5) {
            int var5 = arg0.method2360();
            if (var5 > 0) {
                if (this.field922 == null || field916) {
                    this.field923 = null;
                    this.field922 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field922[var6] = arg0.method2430();
                    }
                } else {
                    arg0.field1982 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field927 = arg0.method2360();
        } else if (arg1 == 15) {
            this.field915 = arg0.method2360();
        } else if (arg1 == 17) {
            this.field931 = 0;
            this.field932 = false;
        } else if (arg1 == 18) {
            this.field932 = false;
        } else if (arg1 == 19) {
            this.field929 = arg0.method2360();
        } else if (arg1 == 21) {
            this.field933 = 0;
        } else if (arg1 == 22) {
            this.field965 = true;
        } else if (arg1 == 23) {
            this.field936 = true;
        } else if (arg1 == 24) {
            this.field937 = arg0.method2430();
            if (this.field937 == 65535) {
                this.field937 = -1;
            }
        } else if (arg1 == 27) {
            this.field931 = 1;
        } else if (arg1 == 28) {
            this.field938 = arg0.method2360();
        } else if (arg1 == 29) {
            this.field939 = arg0.method2512();
        } else if (arg1 == 39) {
            this.field924 = arg0.method2512() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field941[arg1 - 30] = arg0.method2368();
            if (this.field941[arg1 - 30].equalsIgnoreCase(class157.field2302)) {
                this.field941[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2360();
            this.field925 = new short[var7];
            this.field935 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field925[var8] = (short) arg0.method2430();
                this.field935[var8] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2360();
            this.field953 = new short[var9];
            this.field926 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field953[var10] = (short) arg0.method2430();
                this.field926[var10] = (short) arg0.method2430();
            }
        } else if (arg1 == 60) {
            this.field920 = arg0.method2430();
        } else if (arg1 == 62) {
            this.field944 = true;
        } else if (arg1 == 64) {
            this.field948 = false;
        } else if (arg1 == 65) {
            this.field946 = arg0.method2430();
        } else if (arg1 == 66) {
            this.field947 = arg0.method2430();
        } else if (arg1 == 67) {
            this.field928 = arg0.method2430();
        } else if (arg1 == 68) {
            this.field955 = arg0.method2430();
        } else if (arg1 == 69) {
            arg0.method2360();
        } else if (arg1 == 70) {
            this.field949 = arg0.method2449();
        } else if (arg1 == 71) {
            this.field950 = arg0.method2449();
        } else if (arg1 == 72) {
            this.field951 = arg0.method2449();
        } else if (arg1 == 73) {
            this.field952 = true;
        } else if (arg1 == 74) {
            this.field918 = true;
        } else if (arg1 == 75) {
            this.field954 = arg0.method2360();
        } else if (arg1 == 77) {
            this.field956 = arg0.method2430();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
            this.field957 = arg0.method2430();
            if (this.field957 == 65535) {
                this.field957 = -1;
            }
            int var11 = arg0.method2360();
            this.field964 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field964[var12] = arg0.method2430();
                if (this.field964[var12] == 65535) {
                    this.field964[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field958 = arg0.method2430();
            this.field943 = arg0.method2360();
        } else if (arg1 == 79) {
            this.field960 = arg0.method2430();
            this.field961 = arg0.method2430();
            this.field943 = arg0.method2360();
            int var13 = arg0.method2360();
            this.field962 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field962[var14] = arg0.method2430();
            }
        } else if (arg1 == 81) {
            this.field933 = arg0.method2360() * 256;
        }
    }

    @ObfuscatedName("av.r(II)Z")
    public final boolean method809(int arg0) {
        if (this.field923 != null) {
            for (int var4 = 0; var4 < this.field923.length; var4++) {
                if (this.field923[var4] == arg0) {
                    return Statics.field2043.method3022(this.field922[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field922 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field922.length; var3++) {
                var2 &= Statics.field2043.method3022(this.field922[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.u(I)Z")
    public final boolean method806() {
        if (this.field922 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            var1 &= Statics.field2043.method3022(this.field922[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.j(II[[IIIII)Lck;")
    public final class85 method805(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field923 == null) {
            var7 = (long) ((this.field921 << 10) + arg1);
        } else {
            var7 = (long) ((this.field921 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field914.method3475(var7);
        if (var9 == null) {
            class100 var10 = this.method808(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field965) {
                var10.field1704 = (short) (this.field939 + 64);
                var10.field1707 = (short) (this.field924 + 768);
                var10.method2089();
                var9 = var10;
            } else {
                var9 = var10.method2079(this.field939 + 64, this.field924 + 768, -50, -10, -50);
            }
            field914.method3488(var9, var7);
        }
        if (this.field965) {
            var9 = ((class100) var9).method2078();
        }
        if (this.field933 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2172(arg2, arg3, arg4, arg5, true, this.field933);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2084(arg2, arg3, arg4, arg5, true, this.field933);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.w(II[[IIIII)Ldt;")
    public final class105 method825(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field923 == null) {
            var7 = (long) ((this.field921 << 10) + arg1);
        } else {
            var7 = (long) ((this.field921 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field919.method3475(var7);
        if (var9 == null) {
            class100 var10 = this.method808(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2079(this.field939 + 64, this.field924 + 768, -50, -10, -50);
            field919.method3488(var9, var7);
        }
        if (this.field933 >= 0) {
            var9 = var9.method2172(arg2, arg3, arg4, arg5, true, this.field933);
        }
        return var9;
    }

    @ObfuscatedName("av.y(II[[IIIILaf;IB)Ldt;")
    public final class105 method807(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field923 == null) {
            var9 = (long) ((this.field921 << 10) + arg1);
        } else {
            var9 = (long) ((this.field921 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field919.method3475(var9);
        if (var11 == null) {
            class100 var12 = this.method808(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2079(this.field939 + 64, this.field924 + 768, -50, -10, -50);
            field919.method3488(var11, var9);
        }
        if (arg6 == null && this.field933 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2173(true);
        } else {
            var13 = arg6.method859(var11, arg7, arg1);
        }
        if (this.field933 >= 0) {
            var13 = var13.method2172(arg2, arg3, arg4, arg5, false, this.field933);
        }
        return var13;
    }

    @ObfuscatedName("av.o(III)Lcg;")
    public final class100 method808(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field923 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field922 == null) {
                return null;
            }
            boolean var4 = this.field944;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field922.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field922[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field917.method3475((long) var7);
                if (var3 == null) {
                    var3 = class100.method2075(Statics.field2043, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2087();
                    }
                    field917.method3488(var3, (long) var7);
                }
                if (var5 > 1) {
                    field930[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field930, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field923.length; var9++) {
                if (this.field923[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field922[var8];
            boolean var11 = this.field944 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field917.method3475((long) var10);
            if (var3 == null) {
                var3 = class100.method2075(Statics.field2043, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2087();
                }
                field917.method3488(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field946 == 128 && this.field947 == 128 && this.field928 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field949 == 0 && this.field950 == 0 && this.field951 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field925 == null, this.field953 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2108(256);
            var14.method2071(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2081();
        } else if (var15 == 2) {
            var14.method2082();
        } else if (var15 == 3) {
            var14.method2083();
        }
        if (this.field925 != null) {
            for (int var16 = 0; var16 < this.field925.length; var16++) {
                var14.method2085(this.field925[var16], this.field935[var16]);
            }
        }
        if (this.field953 != null) {
            for (int var17 = 0; var17 < this.field953.length; var17++) {
                var14.method2124(this.field953[var17], this.field926[var17]);
            }
        }
        if (var12) {
            var14.method2088(this.field946, this.field947, this.field928);
        }
        if (var13) {
            var14.method2071(this.field949, this.field950, this.field951);
        }
        return var14;
    }

    @ObfuscatedName("av.h(I)Lav;")
    public final class41 method804() {
        int var1 = -1;
        if (this.field956 != -1) {
            var1 = class176.method2038(this.field956);
        } else if (this.field957 != -1) {
            var1 = class176.field2896[this.field957];
        }
        return var1 < 0 || var1 >= this.field964.length || this.field964[var1] == -1 ? null : method39(this.field964[var1]);
    }

    @ObfuscatedName("av.e(I)Z")
    public boolean method810() {
        if (this.field964 == null) {
            return this.field958 != -1 || this.field962 != null;
        }
        for (int var1 = 0; var1 < this.field964.length; var1++) {
            if (this.field964[var1] != -1) {
                class41 var2 = method39(this.field964[var1]);
                if (var2.field958 != -1 || var2.field962 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
