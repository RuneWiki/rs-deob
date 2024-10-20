package deob;

@ObfuscatedName("ah")
public class class41 extends class205 {

    @ObfuscatedName("ah.j")
    public static boolean field912 = false;

    @ObfuscatedName("ah.z")
    public static class194 field933 = new class194(64);

    @ObfuscatedName("ah.x")
    public static class194 field909 = new class194(500);

    @ObfuscatedName("ah.e")
    public static class194 field910 = new class194(30);

    @ObfuscatedName("ah.i")
    public static class194 field911 = new class194(30);

    @ObfuscatedName("ah.c")
    public static class101[] field913 = new class101[4];

    @ObfuscatedName("ah.n")
    public int field925;

    @ObfuscatedName("ah.l")
    public int[] field948;

    @ObfuscatedName("ah.u")
    public int[] field938;

    @ObfuscatedName("ah.r")
    public String field926 = "null";

    @ObfuscatedName("ah.a")
    public short[] field917;

    @ObfuscatedName("ah.d")
    public short[] field943;

    @ObfuscatedName("ah.p")
    public short[] field919;

    @ObfuscatedName("ah.q")
    public short[] field920;

    @ObfuscatedName("ah.b")
    public int field921 = 1;

    @ObfuscatedName("ah.t")
    public int field922 = 1;

    @ObfuscatedName("ah.y")
    public int field923 = 2;

    @ObfuscatedName("ah.w")
    public boolean field924 = true;

    @ObfuscatedName("ah.g")
    public int field918 = -1;

    @ObfuscatedName("ah.s")
    public int field947 = -1;

    @ObfuscatedName("ah.k")
    public boolean field950 = false;

    @ObfuscatedName("ah.o")
    public boolean field928 = false;

    @ObfuscatedName("ah.v")
    public int field929 = -1;

    @ObfuscatedName("ah.f")
    public int field930 = 16;

    @ObfuscatedName("ah.au")
    public int field931 = 0;

    @ObfuscatedName("ah.aq")
    public int field932 = 0;

    @ObfuscatedName("ah.ab")
    public String[] field927 = new String[5];

    @ObfuscatedName("ah.am")
    public int field934 = -1;

    @ObfuscatedName("ah.an")
    public int field935 = -1;

    @ObfuscatedName("ah.aj")
    public boolean field914 = false;

    @ObfuscatedName("ah.ay")
    public boolean field937 = true;

    @ObfuscatedName("ah.ao")
    public int field949 = 128;

    @ObfuscatedName("ah.ag")
    public int field944 = 128;

    @ObfuscatedName("ah.as")
    public int field940 = 128;

    @ObfuscatedName("ah.az")
    public int field941 = 0;

    @ObfuscatedName("ah.av")
    public int field942 = 0;

    @ObfuscatedName("ah.ax")
    public int field936 = 0;

    @ObfuscatedName("ah.aa")
    public boolean field916 = false;

    @ObfuscatedName("ah.ah")
    public boolean field945 = false;

    @ObfuscatedName("ah.ai")
    public int field946 = -1;

    @ObfuscatedName("ah.ae")
    public int[] field957;

    @ObfuscatedName("ah.at")
    public int field939 = -1;

    @ObfuscatedName("ah.ar")
    public int field956 = -1;

    @ObfuscatedName("ah.aw")
    public int field952 = -1;

    @ObfuscatedName("ah.ac")
    public int field951 = 0;

    @ObfuscatedName("ah.ap")
    public int field915 = 0;

    @ObfuscatedName("ah.af")
    public int field953 = 0;

    @ObfuscatedName("ah.al")
    public int[] field954;

    @ObfuscatedName("cs.j(II)Lah;")
    public static class41 method1789(int arg0) {
        class41 var1 = (class41) field933.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field906.method3011(6, arg0);
        class41 var3 = new class41();
        var3.field925 = arg0;
        if (var2 != null) {
            var3.method812(new class120(var2));
        }
        var3.method777();
        if (var3.field945) {
            var3.field923 = 0;
            var3.field924 = false;
        }
        field933.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.h(I)V")
    public void method777() {
        if (this.field918 == -1) {
            this.field918 = 0;
            if (this.field948 != null && (this.field938 == null || this.field938[0] == 10)) {
                this.field918 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field927[var1] != null) {
                    this.field918 = 1;
                }
            }
        }
        if (this.field946 == -1) {
            this.field946 = this.field923 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ah.m(Ldx;I)V")
    public void method812(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("ah.z(Ldx;IB)V")
    public void method775(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2361();
            if (var3 > 0) {
                if (this.field948 == null || field912) {
                    this.field938 = new int[var3];
                    this.field948 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field948[var4] = arg0.method2363();
                        this.field938[var4] = arg0.method2361();
                    }
                } else {
                    arg0.field1972 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field926 = arg0.method2369();
        } else if (arg1 == 5) {
            int var5 = arg0.method2361();
            if (var5 > 0) {
                if (this.field948 == null || field912) {
                    this.field938 = null;
                    this.field948 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field948[var6] = arg0.method2363();
                    }
                } else {
                    arg0.field1972 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field921 = arg0.method2361();
        } else if (arg1 == 15) {
            this.field922 = arg0.method2361();
        } else if (arg1 == 17) {
            this.field923 = 0;
            this.field924 = false;
        } else if (arg1 == 18) {
            this.field924 = false;
        } else if (arg1 == 19) {
            this.field918 = arg0.method2361();
        } else if (arg1 == 21) {
            this.field947 = 0;
        } else if (arg1 == 22) {
            this.field950 = true;
        } else if (arg1 == 23) {
            this.field928 = true;
        } else if (arg1 == 24) {
            this.field929 = arg0.method2363();
            if (this.field929 == 65535) {
                this.field929 = -1;
            }
        } else if (arg1 == 27) {
            this.field923 = 1;
        } else if (arg1 == 28) {
            this.field930 = arg0.method2361();
        } else if (arg1 == 29) {
            this.field931 = arg0.method2531();
        } else if (arg1 == 39) {
            this.field932 = arg0.method2531() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field927[arg1 - 30] = arg0.method2369();
            if (this.field927[arg1 - 30].equalsIgnoreCase(class158.field2302)) {
                this.field927[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2361();
            this.field917 = new short[var7];
            this.field943 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field917[var8] = (short) arg0.method2363();
                this.field943[var8] = (short) arg0.method2363();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2361();
            this.field919 = new short[var9];
            this.field920 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field919[var10] = (short) arg0.method2363();
                this.field920[var10] = (short) arg0.method2363();
            }
        } else if (arg1 == 60) {
            this.field934 = arg0.method2363();
        } else if (arg1 == 62) {
            this.field914 = true;
        } else if (arg1 == 64) {
            this.field937 = false;
        } else if (arg1 == 65) {
            this.field949 = arg0.method2363();
        } else if (arg1 == 66) {
            this.field944 = arg0.method2363();
        } else if (arg1 == 67) {
            this.field940 = arg0.method2363();
        } else if (arg1 == 68) {
            this.field935 = arg0.method2363();
        } else if (arg1 == 69) {
            arg0.method2361();
        } else if (arg1 == 70) {
            this.field941 = arg0.method2362();
        } else if (arg1 == 71) {
            this.field942 = arg0.method2362();
        } else if (arg1 == 72) {
            this.field936 = arg0.method2362();
        } else if (arg1 == 73) {
            this.field916 = true;
        } else if (arg1 == 74) {
            this.field945 = true;
        } else if (arg1 == 75) {
            this.field946 = arg0.method2361();
        } else if (arg1 == 77) {
            this.field939 = arg0.method2363();
            if (this.field939 == 65535) {
                this.field939 = -1;
            }
            this.field956 = arg0.method2363();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
            int var11 = arg0.method2361();
            this.field957 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field957[var12] = arg0.method2363();
                if (this.field957[var12] == 65535) {
                    this.field957[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field952 = arg0.method2363();
            this.field951 = arg0.method2361();
        } else if (arg1 == 79) {
            this.field915 = arg0.method2363();
            this.field953 = arg0.method2363();
            this.field951 = arg0.method2361();
            int var13 = arg0.method2361();
            this.field954 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field954[var14] = arg0.method2363();
            }
        } else if (arg1 == 81) {
            this.field947 = arg0.method2361() * 256;
        }
    }

    @ObfuscatedName("ah.x(IB)Z")
    public final boolean method776(int arg0) {
        if (this.field938 != null) {
            for (int var4 = 0; var4 < this.field938.length; var4++) {
                if (this.field938[var4] == arg0) {
                    return Statics.field907.method3088(this.field948[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field948 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field948.length; var3++) {
                var2 &= Statics.field907.method3088(this.field948[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ah.e(I)Z")
    public final boolean method774() {
        if (this.field948 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field948.length; var2++) {
            var1 &= Statics.field907.method3088(this.field948[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ah.i(II[[IIIII)Lcs;")
    public final class86 method778(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field938 == null) {
            var7 = (long) ((this.field925 << 10) + arg1);
        } else {
            var7 = (long) ((this.field925 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field910.method3460(var7);
        if (var9 == null) {
            class101 var10 = this.method780(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field950) {
                var10.field1703 = (short) (this.field931 + 64);
                var10.field1704 = (short) (this.field932 + 768);
                var10.method2086();
                var9 = var10;
            } else {
                var9 = var10.method2089(this.field931 + 64, this.field932 + 768, -50, -10, -50);
            }
            field910.method3462(var9, var7);
        }
        if (this.field950) {
            var9 = ((class101) var9).method2074();
        }
        if (this.field947 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2213(arg2, arg3, arg4, arg5, true, this.field947);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2083(arg2, arg3, arg4, arg5, true, this.field947);
            }
        }
        return var9;
    }

    @ObfuscatedName("ah.c(II[[IIIIS)Ldf;")
    public final class106 method788(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field938 == null) {
            var7 = (long) ((this.field925 << 10) + arg1);
        } else {
            var7 = (long) ((this.field925 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field911.method3460(var7);
        if (var9 == null) {
            class101 var10 = this.method780(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2089(this.field931 + 64, this.field932 + 768, -50, -10, -50);
            field911.method3462(var9, var7);
        }
        if (this.field947 >= 0) {
            var9 = var9.method2213(arg2, arg3, arg4, arg5, true, this.field947);
        }
        return var9;
    }

    @ObfuscatedName("ah.n(II[[IIIILae;II)Ldf;")
    public final class106 method779(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field938 == null) {
            var9 = (long) ((this.field925 << 10) + arg1);
        } else {
            var9 = (long) ((this.field925 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field911.method3460(var9);
        if (var11 == null) {
            class101 var12 = this.method780(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2089(this.field931 + 64, this.field932 + 768, -50, -10, -50);
            field911.method3462(var11, var9);
        }
        if (arg6 == null && this.field947 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2157(true);
        } else {
            var13 = arg6.method841(var11, arg7, arg1);
        }
        if (this.field947 >= 0) {
            var13 = var13.method2213(arg2, arg3, arg4, arg5, false, this.field947);
        }
        return var13;
    }

    @ObfuscatedName("ah.l(IIB)Lcd;")
    public final class101 method780(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field938 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field948 == null) {
                return null;
            }
            boolean var4 = this.field914;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field948.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field948[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field909.method3460((long) var7);
                if (var3 == null) {
                    var3 = class101.method2069(Statics.field907, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2084();
                    }
                    field909.method3462(var3, (long) var7);
                }
                if (var5 > 1) {
                    field913[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field913, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field938.length; var9++) {
                if (this.field938[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field948[var8];
            boolean var11 = this.field914 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field909.method3460((long) var10);
            if (var3 == null) {
                var3 = class101.method2069(Statics.field907, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2084();
                }
                field909.method3462(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field949 == 128 && this.field944 == 128 && this.field940 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field941 == 0 && this.field942 == 0 && this.field936 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field917 == null, this.field919 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2080(256);
            var14.method2081(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2107();
        } else if (var15 == 2) {
            var14.method2078();
        } else if (var15 == 3) {
            var14.method2079();
        }
        if (this.field917 != null) {
            for (int var16 = 0; var16 < this.field917.length; var16++) {
                var14.method2073(this.field917[var16], this.field943[var16]);
            }
        }
        if (this.field919 != null) {
            for (int var17 = 0; var17 < this.field919.length; var17++) {
                var14.method2085(this.field919[var17], this.field920[var17]);
            }
        }
        if (var12) {
            var14.method2071(this.field949, this.field944, this.field940);
        }
        if (var13) {
            var14.method2081(this.field941, this.field942, this.field936);
        }
        return var14;
    }

    @ObfuscatedName("ah.u(I)Lah;")
    public final class41 method791() {
        int var1 = -1;
        if (this.field939 != -1) {
            var1 = class177.method1227(this.field939);
        } else if (this.field956 != -1) {
            var1 = class177.field2901[this.field956];
        }
        return var1 < 0 || var1 >= this.field957.length || this.field957[var1] == -1 ? null : method1789(this.field957[var1]);
    }

    @ObfuscatedName("ah.r(I)Z")
    public boolean method782() {
        if (this.field957 == null) {
            return this.field952 != -1 || this.field954 != null;
        }
        for (int var1 = 0; var1 < this.field957.length; var1++) {
            if (this.field957[var1] != -1) {
                class41 var2 = method1789(this.field957[var1]);
                if (var2.field952 != -1 || var2.field954 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
