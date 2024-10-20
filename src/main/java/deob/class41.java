package deob;

@ObfuscatedName("as")
public class class41 extends class205 {

    @ObfuscatedName("as.b")
    public static boolean field913 = false;

    @ObfuscatedName("as.d")
    public static class194 field903 = new class194(64);

    @ObfuscatedName("as.x")
    public static class194 field902 = new class194(500);

    @ObfuscatedName("as.y")
    public static class194 field935 = new class194(30);

    @ObfuscatedName("as.r")
    public static class194 field942 = new class194(30);

    @ObfuscatedName("as.c")
    public static class101[] field951 = new class101[4];

    @ObfuscatedName("as.l")
    public int field908;

    @ObfuscatedName("as.u")
    public int[] field933;

    @ObfuscatedName("as.p")
    public int[] field910;

    @ObfuscatedName("as.n")
    public String field911 = "null";

    @ObfuscatedName("as.w")
    public short[] field912;

    @ObfuscatedName("as.z")
    public short[] field937;

    @ObfuscatedName("as.k")
    public short[] field914;

    @ObfuscatedName("as.o")
    public short[] field915;

    @ObfuscatedName("as.t")
    public int field916 = 1;

    @ObfuscatedName("as.h")
    public int field905 = 1;

    @ObfuscatedName("as.v")
    public int field918 = 2;

    @ObfuscatedName("as.a")
    public boolean field919 = true;

    @ObfuscatedName("as.f")
    public int field920 = -1;

    @ObfuscatedName("as.q")
    public int field921 = -1;

    @ObfuscatedName("as.m")
    public boolean field926 = false;

    @ObfuscatedName("as.s")
    public boolean field923 = false;

    @ObfuscatedName("as.i")
    public int field946 = -1;

    @ObfuscatedName("as.e")
    public int field909 = 16;

    @ObfuscatedName("as.aw")
    public int field900 = 0;

    @ObfuscatedName("as.an")
    public int field927 = 0;

    @ObfuscatedName("as.ag")
    public String[] field928 = new String[5];

    @ObfuscatedName("as.ae")
    public int field929 = -1;

    @ObfuscatedName("as.aj")
    public int field904 = -1;

    @ObfuscatedName("as.ah")
    public boolean field931 = false;

    @ObfuscatedName("as.af")
    public boolean field922 = true;

    @ObfuscatedName("as.az")
    public int field947 = 128;

    @ObfuscatedName("as.ax")
    public int field934 = 128;

    @ObfuscatedName("as.ac")
    public int field930 = 128;

    @ObfuscatedName("as.ar")
    public int field936 = 0;

    @ObfuscatedName("as.aq")
    public int field906 = 0;

    @ObfuscatedName("as.aa")
    public int field938 = 0;

    @ObfuscatedName("as.ay")
    public boolean field939 = false;

    @ObfuscatedName("as.as")
    public boolean field940 = false;

    @ObfuscatedName("as.ak")
    public int field941 = -1;

    @ObfuscatedName("as.au")
    public int[] field950;

    @ObfuscatedName("as.av")
    public int field943 = -1;

    @ObfuscatedName("as.at")
    public int field944 = -1;

    @ObfuscatedName("as.am")
    public int field945 = -1;

    @ObfuscatedName("as.ab")
    public int field907 = 0;

    @ObfuscatedName("as.ai")
    public int field932 = 0;

    @ObfuscatedName("as.ad")
    public int field948 = 0;

    @ObfuscatedName("as.ao")
    public int[] field949;

    @ObfuscatedName("fu.b(II)Las;")
    public static class41 method3164(int arg0) {
        class41 var1 = (class41) field903.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field901.method3037(6, arg0);
        class41 var3 = new class41();
        var3.field908 = arg0;
        if (var2 != null) {
            var3.method823(new class120(var2));
        }
        var3.method787();
        if (var3.field940) {
            var3.field918 = 0;
            var3.field919 = false;
        }
        field903.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.g(I)V")
    public void method787() {
        if (this.field920 == -1) {
            this.field920 = 0;
            if (this.field933 != null && (this.field910 == null || this.field910[0] == 10)) {
                this.field920 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field928[var1] != null) {
                    this.field920 = 1;
                }
            }
        }
        if (this.field941 == -1) {
            this.field941 = this.field918 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("as.j(Lds;I)V")
    public void method823(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method800(arg0, var2);
        }
    }

    @ObfuscatedName("as.d(Lds;II)V")
    public void method800(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2344();
            if (var3 > 0) {
                if (this.field933 == null || field913) {
                    this.field910 = new int[var3];
                    this.field933 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field933[var4] = arg0.method2346();
                        this.field910[var4] = arg0.method2344();
                    }
                } else {
                    arg0.field1977 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field911 = arg0.method2352();
        } else if (arg1 == 5) {
            int var5 = arg0.method2344();
            if (var5 > 0) {
                if (this.field933 == null || field913) {
                    this.field910 = null;
                    this.field933 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field933[var6] = arg0.method2346();
                    }
                } else {
                    arg0.field1977 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field916 = arg0.method2344();
        } else if (arg1 == 15) {
            this.field905 = arg0.method2344();
        } else if (arg1 == 17) {
            this.field918 = 0;
            this.field919 = false;
        } else if (arg1 == 18) {
            this.field919 = false;
        } else if (arg1 == 19) {
            this.field920 = arg0.method2344();
        } else if (arg1 == 21) {
            this.field921 = 0;
        } else if (arg1 == 22) {
            this.field926 = true;
        } else if (arg1 == 23) {
            this.field923 = true;
        } else if (arg1 == 24) {
            this.field946 = arg0.method2346();
            if (this.field946 == 65535) {
                this.field946 = -1;
            }
        } else if (arg1 == 27) {
            this.field918 = 1;
        } else if (arg1 == 28) {
            this.field909 = arg0.method2344();
        } else if (arg1 == 29) {
            this.field900 = arg0.method2345();
        } else if (arg1 == 39) {
            this.field927 = arg0.method2345() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field928[arg1 - 30] = arg0.method2352();
            if (this.field928[arg1 - 30].equalsIgnoreCase(class158.field2300)) {
                this.field928[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2344();
            this.field912 = new short[var7];
            this.field937 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field912[var8] = (short) arg0.method2346();
                this.field937[var8] = (short) arg0.method2346();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2344();
            this.field914 = new short[var9];
            this.field915 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field914[var10] = (short) arg0.method2346();
                this.field915[var10] = (short) arg0.method2346();
            }
        } else if (arg1 == 60) {
            this.field929 = arg0.method2346();
        } else if (arg1 == 62) {
            this.field931 = true;
        } else if (arg1 == 64) {
            this.field922 = false;
        } else if (arg1 == 65) {
            this.field947 = arg0.method2346();
        } else if (arg1 == 66) {
            this.field934 = arg0.method2346();
        } else if (arg1 == 67) {
            this.field930 = arg0.method2346();
        } else if (arg1 == 68) {
            this.field904 = arg0.method2346();
        } else if (arg1 == 69) {
            arg0.method2344();
        } else if (arg1 == 70) {
            this.field936 = arg0.method2347();
        } else if (arg1 == 71) {
            this.field906 = arg0.method2347();
        } else if (arg1 == 72) {
            this.field938 = arg0.method2347();
        } else if (arg1 == 73) {
            this.field939 = true;
        } else if (arg1 == 74) {
            this.field940 = true;
        } else if (arg1 == 75) {
            this.field941 = arg0.method2344();
        } else if (arg1 == 77) {
            this.field943 = arg0.method2346();
            if (this.field943 == 65535) {
                this.field943 = -1;
            }
            this.field944 = arg0.method2346();
            if (this.field944 == 65535) {
                this.field944 = -1;
            }
            int var11 = arg0.method2344();
            this.field950 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field950[var12] = arg0.method2346();
                if (this.field950[var12] == 65535) {
                    this.field950[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field945 = arg0.method2346();
            this.field907 = arg0.method2344();
        } else if (arg1 == 79) {
            this.field932 = arg0.method2346();
            this.field948 = arg0.method2346();
            this.field907 = arg0.method2344();
            int var13 = arg0.method2344();
            this.field949 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field949[var14] = arg0.method2346();
            }
        } else if (arg1 == 81) {
            this.field921 = arg0.method2344() * 256;
        }
    }

    @ObfuscatedName("as.x(II)Z")
    public final boolean method784(int arg0) {
        if (this.field910 != null) {
            for (int var4 = 0; var4 < this.field910.length; var4++) {
                if (this.field910[var4] == arg0) {
                    return Statics.field917.method3039(this.field933[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field933 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field933.length; var3++) {
                var2 &= Statics.field917.method3039(this.field933[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("as.y(B)Z")
    public final boolean method785() {
        if (this.field933 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field933.length; var2++) {
            var1 &= Statics.field917.method3039(this.field933[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("as.r(II[[IIIII)Lci;")
    public final class86 method814(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field910 == null) {
            var7 = (long) ((this.field908 << 10) + arg1);
        } else {
            var7 = (long) ((this.field908 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field935.method3495(var7);
        if (var9 == null) {
            class101 var10 = this.method789(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field926) {
                var10.field1700 = (short) (this.field900 + 64);
                var10.field1701 = (short) (this.field927 + 768);
                var10.method2055();
                var9 = var10;
            } else {
                var9 = var10.method2072(this.field900 + 64, this.field927 + 768, -50, -10, -50);
            }
            field935.method3490(var9, var7);
        }
        if (this.field926) {
            var9 = ((class101) var9).method2056();
        }
        if (this.field921 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2210(arg2, arg3, arg4, arg5, true, this.field921);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2057(arg2, arg3, arg4, arg5, true, this.field921);
            }
        }
        return var9;
    }

    @ObfuscatedName("as.c(II[[IIIII)Ldd;")
    public final class106 method782(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field910 == null) {
            var7 = (long) ((this.field908 << 10) + arg1);
        } else {
            var7 = (long) ((this.field908 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field942.method3495(var7);
        if (var9 == null) {
            class101 var10 = this.method789(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2072(this.field900 + 64, this.field927 + 768, -50, -10, -50);
            field942.method3490(var9, var7);
        }
        if (this.field921 >= 0) {
            var9 = var9.method2210(arg2, arg3, arg4, arg5, true, this.field921);
        }
        return var9;
    }

    @ObfuscatedName("as.l(II[[IIIILau;II)Ldd;")
    public final class106 method788(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field910 == null) {
            var9 = (long) ((this.field908 << 10) + arg1);
        } else {
            var9 = (long) ((this.field908 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field942.method3495(var9);
        if (var11 == null) {
            class101 var12 = this.method789(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2072(this.field900 + 64, this.field927 + 768, -50, -10, -50);
            field942.method3490(var11, var9);
        }
        if (arg6 == null && this.field921 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2139(true);
        } else {
            var13 = arg6.method848(var11, arg7, arg1);
        }
        if (this.field921 >= 0) {
            var13 = var13.method2210(arg2, arg3, arg4, arg5, false, this.field921);
        }
        return var13;
    }

    @ObfuscatedName("as.u(IIB)Lch;")
    public final class101 method789(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field910 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field933 == null) {
                return null;
            }
            boolean var4 = this.field931;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field933.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field933[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field902.method3495((long) var7);
                if (var3 == null) {
                    var3 = class101.method2051(Statics.field917, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2066();
                    }
                    field902.method3490(var3, (long) var7);
                }
                if (var5 > 1) {
                    field951[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field951, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field910.length; var9++) {
                if (this.field910[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field933[var8];
            boolean var11 = this.field931 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field902.method3495((long) var10);
            if (var3 == null) {
                var3 = class101.method2051(Statics.field917, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2066();
                }
                field902.method3490(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field947 == 128 && this.field934 == 128 && this.field930 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field936 == 0 && this.field906 == 0 && this.field938 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field912 == null, this.field914 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2052(256);
            var14.method2063(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2059();
        } else if (var15 == 2) {
            var14.method2060();
        } else if (var15 == 3) {
            var14.method2061();
        }
        if (this.field912 != null) {
            for (int var16 = 0; var16 < this.field912.length; var16++) {
                var14.method2064(this.field912[var16], this.field937[var16]);
            }
        }
        if (this.field914 != null) {
            for (int var17 = 0; var17 < this.field914.length; var17++) {
                var14.method2065(this.field914[var17], this.field915[var17]);
            }
        }
        if (var12) {
            var14.method2114(this.field947, this.field934, this.field930);
        }
        if (var13) {
            var14.method2063(this.field936, this.field906, this.field938);
        }
        return var14;
    }

    @ObfuscatedName("as.p(I)Las;")
    public final class41 method786() {
        int var1 = -1;
        if (this.field943 != -1) {
            var1 = class177.method89(this.field943);
        } else if (this.field944 != -1) {
            var1 = class177.field2897[this.field944];
        }
        return var1 < 0 || var1 >= this.field950.length || this.field950[var1] == -1 ? null : method3164(this.field950[var1]);
    }

    @ObfuscatedName("dn.n(I)V")
    public static void method2263() {
        field903.method3486();
        field902.method3486();
        field935.method3486();
        field942.method3486();
    }

    @ObfuscatedName("as.w(B)Z")
    public boolean method791() {
        if (this.field950 == null) {
            return this.field945 != -1 || this.field949 != null;
        }
        for (int var1 = 0; var1 < this.field950.length; var1++) {
            if (this.field950[var1] != -1) {
                class41 var2 = method3164(this.field950[var1]);
                if (var2.field945 != -1 || var2.field949 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
