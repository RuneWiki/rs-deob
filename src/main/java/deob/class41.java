package deob;

@ObfuscatedName("an")
public class class41 extends class204 {

    @ObfuscatedName("an.j")
    public static boolean field942 = false;

    @ObfuscatedName("an.i")
    public static class193 field936 = new class193(64);

    @ObfuscatedName("an.f")
    public static class193 field958 = new class193(500);

    @ObfuscatedName("an.m")
    public static class193 field922 = new class193(30);

    @ObfuscatedName("an.o")
    public static class193 field952 = new class193(30);

    @ObfuscatedName("an.h")
    public static class100[] field924 = new class100[4];

    @ObfuscatedName("an.n")
    public int field925;

    @ObfuscatedName("an.k")
    public int[] field926;

    @ObfuscatedName("an.r")
    public int[] field927;

    @ObfuscatedName("an.b")
    public String field928 = "null";

    @ObfuscatedName("an.q")
    public short[] field929;

    @ObfuscatedName("an.u")
    public short[] field930;

    @ObfuscatedName("an.g")
    public short[] field931;

    @ObfuscatedName("an.y")
    public short[] field932;

    @ObfuscatedName("an.s")
    public int field933 = 1;

    @ObfuscatedName("an.d")
    public int field934 = 1;

    @ObfuscatedName("an.z")
    public int field935 = 2;

    @ObfuscatedName("an.p")
    public boolean field919 = true;

    @ObfuscatedName("an.w")
    public int field937 = -1;

    @ObfuscatedName("an.t")
    public int field938 = -1;

    @ObfuscatedName("an.c")
    public boolean field944 = false;

    @ObfuscatedName("an.x")
    public boolean field940 = false;

    @ObfuscatedName("an.e")
    public int field950 = -1;

    @ObfuscatedName("an.v")
    public int field962 = 16;

    @ObfuscatedName("an.ab")
    public int field917 = 0;

    @ObfuscatedName("an.ak")
    public int field923 = 0;

    @ObfuscatedName("an.am")
    public String[] field945 = new String[5];

    @ObfuscatedName("an.aw")
    public int field946 = -1;

    @ObfuscatedName("an.az")
    public int field947 = -1;

    @ObfuscatedName("an.ac")
    public boolean field948 = false;

    @ObfuscatedName("an.ax")
    public boolean field954 = true;

    @ObfuscatedName("an.ai")
    public int field920 = 128;

    @ObfuscatedName("an.ar")
    public int field951 = 128;

    @ObfuscatedName("an.aa")
    public int field959 = 128;

    @ObfuscatedName("an.as")
    public int field953 = 0;

    @ObfuscatedName("an.ag")
    public int field957 = 0;

    @ObfuscatedName("an.af")
    public int field955 = 0;

    @ObfuscatedName("an.ao")
    public boolean field956 = false;

    @ObfuscatedName("an.an")
    public boolean field943 = false;

    @ObfuscatedName("an.at")
    public int field918 = -1;

    @ObfuscatedName("an.al")
    public int[] field921;

    @ObfuscatedName("an.aq")
    public int field960 = -1;

    @ObfuscatedName("an.ae")
    public int field961 = -1;

    @ObfuscatedName("an.ap")
    public int field968 = -1;

    @ObfuscatedName("an.ad")
    public int field963 = 0;

    @ObfuscatedName("an.au")
    public int field964 = 0;

    @ObfuscatedName("an.ay")
    public int field965 = 0;

    @ObfuscatedName("an.av")
    public int[] field966;

    @ObfuscatedName("ay.j(II)Lan;")
    public static class41 method981(int arg0) {
        class41 var1 = (class41) field936.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field949.method3005(6, arg0);
        class41 var3 = new class41();
        var3.field925 = arg0;
        if (var2 != null) {
            var3.method785(new class119(var2));
        }
        var3.method784();
        if (var3.field943) {
            var3.field935 = 0;
            var3.field919 = false;
        }
        field936.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.l(B)V")
    public void method784() {
        if (this.field937 == -1) {
            this.field937 = 0;
            if (this.field926 != null && (this.field927 == null || this.field927[0] == 10)) {
                this.field937 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field945[var1] != null) {
                    this.field937 = 1;
                }
            }
        }
        if (this.field918 == -1) {
            this.field918 = this.field935 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("an.a(Ldc;B)V")
    public void method785(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method819(arg0, var2);
        }
    }

    @ObfuscatedName("an.i(Ldc;II)V")
    public void method819(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2316();
            if (var3 > 0) {
                if (this.field926 == null || field942) {
                    this.field927 = new int[var3];
                    this.field926 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field926[var4] = arg0.method2318();
                        this.field927[var4] = arg0.method2316();
                    }
                } else {
                    arg0.field1999 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field928 = arg0.method2324();
        } else if (arg1 == 5) {
            int var5 = arg0.method2316();
            if (var5 > 0) {
                if (this.field926 == null || field942) {
                    this.field927 = null;
                    this.field926 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field926[var6] = arg0.method2318();
                    }
                } else {
                    arg0.field1999 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field933 = arg0.method2316();
        } else if (arg1 == 15) {
            this.field934 = arg0.method2316();
        } else if (arg1 == 17) {
            this.field935 = 0;
            this.field919 = false;
        } else if (arg1 == 18) {
            this.field919 = false;
        } else if (arg1 == 19) {
            this.field937 = arg0.method2316();
        } else if (arg1 == 21) {
            this.field938 = 0;
        } else if (arg1 == 22) {
            this.field944 = true;
        } else if (arg1 == 23) {
            this.field940 = true;
        } else if (arg1 == 24) {
            this.field950 = arg0.method2318();
            if (this.field950 == 65535) {
                this.field950 = -1;
            }
        } else if (arg1 == 27) {
            this.field935 = 1;
        } else if (arg1 == 28) {
            this.field962 = arg0.method2316();
        } else if (arg1 == 29) {
            this.field917 = arg0.method2317();
        } else if (arg1 == 39) {
            this.field923 = arg0.method2317() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field945[arg1 - 30] = arg0.method2324();
            if (this.field945[arg1 - 30].equalsIgnoreCase(class157.field2318)) {
                this.field945[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2316();
            this.field929 = new short[var7];
            this.field930 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field929[var8] = (short) arg0.method2318();
                this.field930[var8] = (short) arg0.method2318();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2316();
            this.field931 = new short[var9];
            this.field932 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field931[var10] = (short) arg0.method2318();
                this.field932[var10] = (short) arg0.method2318();
            }
        } else if (arg1 == 60) {
            this.field946 = arg0.method2318();
        } else if (arg1 == 62) {
            this.field948 = true;
        } else if (arg1 == 64) {
            this.field954 = false;
        } else if (arg1 == 65) {
            this.field920 = arg0.method2318();
        } else if (arg1 == 66) {
            this.field951 = arg0.method2318();
        } else if (arg1 == 67) {
            this.field959 = arg0.method2318();
        } else if (arg1 == 68) {
            this.field947 = arg0.method2318();
        } else if (arg1 == 69) {
            arg0.method2316();
        } else if (arg1 == 70) {
            this.field953 = arg0.method2421();
        } else if (arg1 == 71) {
            this.field957 = arg0.method2421();
        } else if (arg1 == 72) {
            this.field955 = arg0.method2421();
        } else if (arg1 == 73) {
            this.field956 = true;
        } else if (arg1 == 74) {
            this.field943 = true;
        } else if (arg1 == 75) {
            this.field918 = arg0.method2316();
        } else if (arg1 == 77) {
            this.field960 = arg0.method2318();
            if (this.field960 == 65535) {
                this.field960 = -1;
            }
            this.field961 = arg0.method2318();
            if (this.field961 == 65535) {
                this.field961 = -1;
            }
            int var11 = arg0.method2316();
            this.field921 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field921[var12] = arg0.method2318();
                if (this.field921[var12] == 65535) {
                    this.field921[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field968 = arg0.method2318();
            this.field963 = arg0.method2316();
        } else if (arg1 == 79) {
            this.field964 = arg0.method2318();
            this.field965 = arg0.method2318();
            this.field963 = arg0.method2316();
            int var13 = arg0.method2316();
            this.field966 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field966[var14] = arg0.method2318();
            }
        } else if (arg1 == 81) {
            this.field938 = arg0.method2316() * 256;
        }
    }

    @ObfuscatedName("an.f(II)Z")
    public final boolean method807(int arg0) {
        if (this.field927 != null) {
            for (int var4 = 0; var4 < this.field927.length; var4++) {
                if (this.field927[var4] == arg0) {
                    return Statics.field941.method3007(this.field926[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field926 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field926.length; var3++) {
                var2 &= Statics.field941.method3007(this.field926[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("an.m(I)Z")
    public final boolean method788() {
        if (this.field926 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field926.length; var2++) {
            var1 &= Statics.field941.method3007(this.field926[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("an.o(II[[IIIII)Lce;")
    public final class85 method789(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field927 == null) {
            var7 = (long) ((this.field925 << 10) + arg1);
        } else {
            var7 = (long) ((this.field925 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field922.method3466(var7);
        if (var9 == null) {
            class100 var10 = this.method822(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field944) {
                var10.field1734 = (short) (this.field917 + 64);
                var10.field1735 = (short) (this.field923 + 768);
                var10.method2074();
                var9 = var10;
            } else {
                var9 = var10.method2041(this.field917 + 64, this.field923 + 768, -50, -10, -50);
            }
            field922.method3468(var9, var7);
        }
        if (this.field944) {
            var9 = ((class100) var9).method2046();
        }
        if (this.field938 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2181(arg2, arg3, arg4, arg5, true, this.field938);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2056(arg2, arg3, arg4, arg5, true, this.field938);
            }
        }
        return var9;
    }

    @ObfuscatedName("an.h(II[[IIIII)Ldd;")
    public final class105 method790(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field927 == null) {
            var7 = (long) ((this.field925 << 10) + arg1);
        } else {
            var7 = (long) ((this.field925 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field952.method3466(var7);
        if (var9 == null) {
            class100 var10 = this.method822(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2041(this.field917 + 64, this.field923 + 768, -50, -10, -50);
            field952.method3468(var9, var7);
        }
        if (this.field938 >= 0) {
            var9 = var9.method2181(arg2, arg3, arg4, arg5, true, this.field938);
        }
        return var9;
    }

    @ObfuscatedName("an.n(II[[IIIILal;II)Ldd;")
    public final class105 method791(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field927 == null) {
            var9 = (long) ((this.field925 << 10) + arg1);
        } else {
            var9 = (long) ((this.field925 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field952.method3466(var9);
        if (var11 == null) {
            class100 var12 = this.method822(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2041(this.field917 + 64, this.field923 + 768, -50, -10, -50);
            field952.method3468(var11, var9);
        }
        if (arg6 == null && this.field938 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2183(true);
        } else {
            var13 = arg6.method857(var11, arg7, arg1);
        }
        if (this.field938 >= 0) {
            var13 = var13.method2181(arg2, arg3, arg4, arg5, false, this.field938);
        }
        return var13;
    }

    @ObfuscatedName("an.k(IIS)Lcb;")
    public final class100 method822(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field927 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field926 == null) {
                return null;
            }
            boolean var4 = this.field948;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field926.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field926[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field958.method3466((long) var7);
                if (var3 == null) {
                    var3 = class100.method2109(Statics.field941, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2076();
                    }
                    field958.method3468(var3, (long) var7);
                }
                if (var5 > 1) {
                    field924[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field924, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field927.length; var9++) {
                if (this.field927[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field926[var8];
            boolean var11 = this.field948 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field958.method3466((long) var10);
            if (var3 == null) {
                var3 = class100.method2109(Statics.field941, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2076();
                }
                field958.method3468(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field920 == 128 && this.field951 == 128 && this.field959 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field953 == 0 && this.field957 == 0 && this.field955 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field929 == null, this.field931 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2052(256);
            var14.method2053(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2075();
        } else if (var15 == 2) {
            var14.method2050();
        } else if (var15 == 3) {
            var14.method2077();
        }
        if (this.field929 != null) {
            for (int var16 = 0; var16 < this.field929.length; var16++) {
                var14.method2061(this.field929[var16], this.field930[var16]);
            }
        }
        if (this.field931 != null) {
            for (int var17 = 0; var17 < this.field931.length; var17++) {
                var14.method2055(this.field931[var17], this.field932[var17]);
            }
        }
        if (var12) {
            var14.method2086(this.field920, this.field951, this.field959);
        }
        if (var13) {
            var14.method2053(this.field953, this.field957, this.field955);
        }
        return var14;
    }

    @ObfuscatedName("an.r(I)Lan;")
    public final class41 method809() {
        int var1 = -1;
        if (this.field960 != -1) {
            var1 = class176.method2248(this.field960);
        } else if (this.field961 != -1) {
            var1 = class176.field2907[this.field961];
        }
        return var1 < 0 || var1 >= this.field921.length || this.field921[var1] == -1 ? null : method981(this.field921[var1]);
    }

    @ObfuscatedName("ds.b(I)V")
    public static void method2613() {
        field936.method3475();
        field958.method3475();
        field922.method3475();
        field952.method3475();
    }

    @ObfuscatedName("an.q(I)Z")
    public boolean method794() {
        if (this.field921 == null) {
            return this.field968 != -1 || this.field966 != null;
        }
        for (int var1 = 0; var1 < this.field921.length; var1++) {
            if (this.field921[var1] != -1) {
                class41 var2 = method981(this.field921[var1]);
                if (var2.field968 != -1 || var2.field966 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
