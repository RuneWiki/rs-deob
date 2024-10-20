package deob;

@ObfuscatedName("ai")
public class class39 extends class198 {

    @ObfuscatedName("ai.j")
    public static boolean field917 = false;

    @ObfuscatedName("ai.l")
    public static class187 field927 = new class187(64);

    @ObfuscatedName("ai.w")
    public static class187 field906 = new class187(500);

    @ObfuscatedName("ai.d")
    public static class187 field945 = new class187(30);

    @ObfuscatedName("ai.f")
    public static class187 field908 = new class187(30);

    @ObfuscatedName("ai.i")
    public static class98[] field909 = new class98[4];

    @ObfuscatedName("ai.a")
    public int field951;

    @ObfuscatedName("ai.o")
    public int[] field931;

    @ObfuscatedName("ai.u")
    public int[] field902;

    @ObfuscatedName("ai.m")
    public String field913 = "null";

    @ObfuscatedName("ai.e")
    public short[] field914;

    @ObfuscatedName("ai.v")
    public short[] field915;

    @ObfuscatedName("ai.r")
    public short[] field910;

    @ObfuscatedName("ai.t")
    public short[] field921;

    @ObfuscatedName("ai.g")
    public int field918 = 1;

    @ObfuscatedName("ai.s")
    public int field949 = 1;

    @ObfuscatedName("ai.n")
    public int field920 = 2;

    @ObfuscatedName("ai.h")
    public boolean field953 = true;

    @ObfuscatedName("ai.p")
    public int field922 = -1;

    @ObfuscatedName("ai.c")
    public int field923 = -1;

    @ObfuscatedName("ai.x")
    public boolean field905 = false;

    @ObfuscatedName("ai.q")
    public boolean field925 = false;

    @ObfuscatedName("ai.b")
    public int field926 = -1;

    @ObfuscatedName("ai.k")
    public int field940 = 16;

    @ObfuscatedName("ai.at")
    public int field928 = 0;

    @ObfuscatedName("ai.au")
    public int field929 = 0;

    @ObfuscatedName("ai.aa")
    public String[] field930 = new String[5];

    @ObfuscatedName("ai.ak")
    public int field907 = -1;

    @ObfuscatedName("ai.an")
    public int field919 = -1;

    @ObfuscatedName("ai.ad")
    public boolean field933 = false;

    @ObfuscatedName("ai.ap")
    public boolean field934 = true;

    @ObfuscatedName("ai.ag")
    public int field935 = 128;

    @ObfuscatedName("ai.aj")
    public int field936 = 128;

    @ObfuscatedName("ai.av")
    public int field937 = 128;

    @ObfuscatedName("ai.ar")
    public int field916 = 0;

    @ObfuscatedName("ai.ab")
    public int field939 = 0;

    @ObfuscatedName("ai.ai")
    public int field941 = 0;

    @ObfuscatedName("ai.ae")
    public boolean field932 = false;

    @ObfuscatedName("ai.ax")
    public boolean field942 = false;

    @ObfuscatedName("ai.aw")
    public int field903 = -1;

    @ObfuscatedName("ai.ac")
    public int[] field944;

    @ObfuscatedName("ai.al")
    public int field912 = -1;

    @ObfuscatedName("ai.az")
    public int field946 = -1;

    @ObfuscatedName("ai.as")
    public int field947 = -1;

    @ObfuscatedName("ai.am")
    public int field948 = 0;

    @ObfuscatedName("ai.ay")
    public int field924 = 0;

    @ObfuscatedName("ai.ao")
    public int field950 = 0;

    @ObfuscatedName("ai.aq")
    public int[] field938;

    @ObfuscatedName("du.j(Lfh;Lfh;ZI)V")
    public static void method2601(class161 arg0, class161 arg1, boolean arg2) {
        Statics.field943 = arg0;
        Statics.field904 = arg1;
        field917 = arg2;
    }

    @ObfuscatedName("aw.y(II)Lai;")
    public static class39 method902(int arg0) {
        class39 var1 = (class39) field927.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field943.method2995(6, arg0);
        class39 var3 = new class39();
        var3.field951 = arg0;
        if (var2 != null) {
            var3.method797(new class114(var2));
        }
        var3.method800();
        if (var3.field942) {
            var3.field920 = 0;
            var3.field953 = false;
        }
        field927.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.z(I)V")
    public void method800() {
        if (this.field922 == -1) {
            this.field922 = 0;
            if (this.field931 != null && (this.field902 == null || this.field902[0] == 10)) {
                this.field922 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field930[var1] != null) {
                    this.field922 = 1;
                }
            }
        }
        if (this.field903 == -1) {
            this.field903 = this.field920 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.l(Lde;B)V")
    public void method797(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method763(arg0, var2);
        }
    }

    @ObfuscatedName("ai.w(Lde;II)V")
    public void method763(class114 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2322();
            if (var3 > 0) {
                if (this.field931 == null || field917) {
                    this.field902 = new int[var3];
                    this.field931 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field931[var4] = arg0.method2324();
                        this.field902[var4] = arg0.method2322();
                    }
                } else {
                    arg0.field1894 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field913 = arg0.method2440();
        } else if (arg1 == 5) {
            int var5 = arg0.method2322();
            if (var5 > 0) {
                if (this.field931 == null || field917) {
                    this.field902 = null;
                    this.field931 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field931[var6] = arg0.method2324();
                    }
                } else {
                    arg0.field1894 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field918 = arg0.method2322();
        } else if (arg1 == 15) {
            this.field949 = arg0.method2322();
        } else if (arg1 == 17) {
            this.field920 = 0;
            this.field953 = false;
        } else if (arg1 == 18) {
            this.field953 = false;
        } else if (arg1 == 19) {
            this.field922 = arg0.method2322();
        } else if (arg1 == 21) {
            this.field923 = 0;
        } else if (arg1 == 22) {
            this.field905 = true;
        } else if (arg1 == 23) {
            this.field925 = true;
        } else if (arg1 == 24) {
            this.field926 = arg0.method2324();
            if (this.field926 == 65535) {
                this.field926 = -1;
            }
        } else if (arg1 == 27) {
            this.field920 = 1;
        } else if (arg1 == 28) {
            this.field940 = arg0.method2322();
        } else if (arg1 == 29) {
            this.field928 = arg0.method2323();
        } else if (arg1 == 39) {
            this.field929 = arg0.method2323() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field930[arg1 - 30] = arg0.method2440();
            if (this.field930[arg1 - 30].equalsIgnoreCase(class151.field2231)) {
                this.field930[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2322();
            this.field914 = new short[var7];
            this.field915 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field914[var8] = (short) arg0.method2324();
                this.field915[var8] = (short) arg0.method2324();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2322();
            this.field910 = new short[var9];
            this.field921 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field910[var10] = (short) arg0.method2324();
                this.field921[var10] = (short) arg0.method2324();
            }
        } else if (arg1 == 60) {
            this.field907 = arg0.method2324();
        } else if (arg1 == 62) {
            this.field933 = true;
        } else if (arg1 == 64) {
            this.field934 = false;
        } else if (arg1 == 65) {
            this.field935 = arg0.method2324();
        } else if (arg1 == 66) {
            this.field936 = arg0.method2324();
        } else if (arg1 == 67) {
            this.field937 = arg0.method2324();
        } else if (arg1 == 68) {
            this.field919 = arg0.method2324();
        } else if (arg1 == 69) {
            arg0.method2322();
        } else if (arg1 == 70) {
            this.field916 = arg0.method2308();
        } else if (arg1 == 71) {
            this.field939 = arg0.method2308();
        } else if (arg1 == 72) {
            this.field941 = arg0.method2308();
        } else if (arg1 == 73) {
            this.field932 = true;
        } else if (arg1 == 74) {
            this.field942 = true;
        } else if (arg1 == 75) {
            this.field903 = arg0.method2322();
        } else if (arg1 == 77) {
            this.field912 = arg0.method2324();
            if (this.field912 == 65535) {
                this.field912 = -1;
            }
            this.field946 = arg0.method2324();
            if (this.field946 == 65535) {
                this.field946 = -1;
            }
            int var11 = arg0.method2322();
            this.field944 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field944[var12] = arg0.method2324();
                if (this.field944[var12] == 65535) {
                    this.field944[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field947 = arg0.method2324();
            this.field948 = arg0.method2322();
        } else if (arg1 == 79) {
            this.field924 = arg0.method2324();
            this.field950 = arg0.method2324();
            this.field948 = arg0.method2322();
            int var13 = arg0.method2322();
            this.field938 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field938[var14] = arg0.method2324();
            }
        } else if (arg1 == 81) {
            this.field923 = arg0.method2322() * 256;
        }
    }

    @ObfuscatedName("ai.d(IB)Z")
    public final boolean method766(int arg0) {
        if (this.field902 != null) {
            for (int var4 = 0; var4 < this.field902.length; var4++) {
                if (this.field902[var4] == arg0) {
                    return Statics.field904.method2981(this.field931[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field931 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field931.length; var3++) {
                var2 &= Statics.field904.method2981(this.field931[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.f(B)Z")
    public final boolean method767() {
        if (this.field931 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field931.length; var2++) {
            var1 &= Statics.field904.method2981(this.field931[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.i(II[[IIIIB)Lcz;")
    public final class83 method768(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field902 == null) {
            var7 = (long) ((this.field951 << 10) + arg1);
        } else {
            var7 = (long) ((this.field951 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field945.method3432(var7);
        if (var9 == null) {
            class98 var10 = this.method802(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field905) {
                var10.field1669 = (short) (this.field928 + 64);
                var10.field1670 = (short) (this.field929 + 768);
                var10.method2139();
                var9 = var10;
            } else {
                var9 = var10.method2094(this.field928 + 64, this.field929 + 768, -50, -10, -50);
            }
            field945.method3434(var9, var7);
        }
        if (this.field905) {
            var9 = ((class98) var9).method2078();
        }
        if (this.field923 >= 0) {
            if (var9 instanceof class103) {
                var9 = ((class103) var9).method2244(arg2, arg3, arg4, arg5, true, this.field923);
            } else if (var9 instanceof class98) {
                var9 = ((class98) var9).method2079(arg2, arg3, arg4, arg5, true, this.field923);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.a(II[[IIIII)Lcw;")
    public final class103 method769(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field902 == null) {
            var7 = (long) ((this.field951 << 10) + arg1);
        } else {
            var7 = (long) ((this.field951 << 10) + (arg0 << 3) + arg1);
        }
        class103 var9 = (class103) field908.method3432(var7);
        if (var9 == null) {
            class98 var10 = this.method802(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2094(this.field928 + 64, this.field929 + 768, -50, -10, -50);
            field908.method3434(var9, var7);
        }
        if (this.field923 >= 0) {
            var9 = var9.method2244(arg2, arg3, arg4, arg5, true, this.field923);
        }
        return var9;
    }

    @ObfuscatedName("ai.o(II[[IIIILax;II)Lcw;")
    public final class103 method780(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class41 arg6, int arg7) {
        long var9;
        if (this.field902 == null) {
            var9 = (long) ((this.field951 << 10) + arg1);
        } else {
            var9 = (long) ((this.field951 << 10) + (arg0 << 3) + arg1);
        }
        class103 var11 = (class103) field908.method3432(var9);
        if (var11 == null) {
            class98 var12 = this.method802(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2094(this.field928 + 64, this.field929 + 768, -50, -10, -50);
            field908.method3434(var11, var9);
        }
        if (arg6 == null && this.field923 == -1) {
            return var11;
        }
        class103 var13;
        if (arg6 == null) {
            var13 = var11.method2167(true);
        } else {
            var13 = arg6.method847(var11, arg7, arg1);
        }
        if (this.field923 >= 0) {
            var13 = var13.method2244(arg2, arg3, arg4, arg5, false, this.field923);
        }
        return var13;
    }

    @ObfuscatedName("ai.u(III)Lcd;")
    public final class98 method802(int arg0, int arg1) {
        class98 var3 = null;
        if (this.field902 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field931 == null) {
                return null;
            }
            boolean var4 = this.field933;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field931.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field931[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class98) field906.method3432((long) var7);
                if (var3 == null) {
                    var3 = class98.method2092(Statics.field904, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2088();
                    }
                    field906.method3434(var3, (long) var7);
                }
                if (var5 > 1) {
                    field909[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class98(field909, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field902.length; var9++) {
                if (this.field902[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field931[var8];
            boolean var11 = this.field933 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class98) field906.method3432((long) var10);
            if (var3 == null) {
                var3 = class98.method2092(Statics.field904, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2088();
                }
                field906.method3434(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field935 == 128 && this.field936 == 128 && this.field937 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field916 == 0 && this.field939 == 0 && this.field941 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class98 var14 = new class98(var3, arg1 == 0 && !var12 && !var13, this.field914 == null, this.field910 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2084(256);
            var14.method2085(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2081();
        } else if (var15 == 2) {
            var14.method2082();
        } else if (var15 == 3) {
            var14.method2083();
        }
        if (this.field914 != null) {
            for (int var16 = 0; var16 < this.field914.length; var16++) {
                var14.method2140(this.field914[var16], this.field915[var16]);
            }
        }
        if (this.field910 != null) {
            for (int var17 = 0; var17 < this.field910.length; var17++) {
                var14.method2087(this.field910[var17], this.field921[var17]);
            }
        }
        if (var12) {
            var14.method2089(this.field935, this.field936, this.field937);
        }
        if (var13) {
            var14.method2085(this.field916, this.field939, this.field941);
        }
        return var14;
    }

    @ObfuscatedName("ai.m(B)Lai;")
    public final class39 method771() {
        int var1 = -1;
        if (this.field912 != -1) {
            var1 = class170.method2874(this.field912);
        } else if (this.field946 != -1) {
            var1 = class170.field2823[this.field946];
        }
        return var1 < 0 || var1 >= this.field944.length || this.field944[var1] == -1 ? null : method902(this.field944[var1]);
    }

    @ObfuscatedName("dm.e(I)V")
    public static void method2562() {
        field927.method3435();
        field906.method3435();
        field945.method3435();
        field908.method3435();
    }

    @ObfuscatedName("ai.v(I)Z")
    public boolean method807() {
        if (this.field944 == null) {
            return this.field947 != -1 || this.field938 != null;
        }
        for (int var1 = 0; var1 < this.field944.length; var1++) {
            if (this.field944[var1] != -1) {
                class39 var2 = method902(this.field944[var1]);
                if (var2.field947 != -1 || var2.field938 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
