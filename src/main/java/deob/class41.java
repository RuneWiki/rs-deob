package deob;

@ObfuscatedName("ad")
public class class41 extends class205 {

    @ObfuscatedName("ad.w")
    public static boolean field965 = false;

    @ObfuscatedName("ad.p")
    public static class194 field929 = new class194(64);

    @ObfuscatedName("ad.e")
    public static class194 field930 = new class194(500);

    @ObfuscatedName("ad.y")
    public static class194 field931 = new class194(30);

    @ObfuscatedName("ad.m")
    public static class194 field940 = new class194(30);

    @ObfuscatedName("ad.c")
    public static class101[] field949 = new class101[4];

    @ObfuscatedName("ad.v")
    public int field937;

    @ObfuscatedName("ad.l")
    public int[] field935;

    @ObfuscatedName("ad.z")
    public int[] field936;

    @ObfuscatedName("ad.s")
    public String field971 = "null";

    @ObfuscatedName("ad.j")
    public short[] field938;

    @ObfuscatedName("ad.q")
    public short[] field968;

    @ObfuscatedName("ad.a")
    public short[] field974;

    @ObfuscatedName("ad.d")
    public short[] field941;

    @ObfuscatedName("ad.u")
    public int field980 = 1;

    @ObfuscatedName("ad.i")
    public int field943 = 1;

    @ObfuscatedName("ad.o")
    public int field932 = 2;

    @ObfuscatedName("ad.h")
    public boolean field978 = true;

    @ObfuscatedName("ad.k")
    public int field976 = -1;

    @ObfuscatedName("ad.f")
    public int field947 = -1;

    @ObfuscatedName("ad.r")
    public boolean field948 = false;

    @ObfuscatedName("ad.n")
    public boolean field939 = false;

    @ObfuscatedName("ad.g")
    public int field950 = -1;

    @ObfuscatedName("ad.b")
    public int field951 = 16;

    @ObfuscatedName("ad.af")
    public int field952 = 0;

    @ObfuscatedName("ad.am")
    public int field953 = 0;

    @ObfuscatedName("ad.ar")
    public String[] field954 = new String[5];

    @ObfuscatedName("ad.ay")
    public int field955 = -1;

    @ObfuscatedName("ad.ai")
    public int field956 = -1;

    @ObfuscatedName("ad.ab")
    public boolean field934 = false;

    @ObfuscatedName("ad.av")
    public boolean field958 = true;

    @ObfuscatedName("ad.ac")
    public int field959 = 128;

    @ObfuscatedName("ad.ah")
    public int field960 = 128;

    @ObfuscatedName("ad.ae")
    public int field946 = 128;

    @ObfuscatedName("ad.aj")
    public int field962 = 0;

    @ObfuscatedName("ad.az")
    public int field963 = 0;

    @ObfuscatedName("ad.al")
    public int field957 = 0;

    @ObfuscatedName("ad.ag")
    public boolean field942 = false;

    @ObfuscatedName("ad.ad")
    public boolean field966 = false;

    @ObfuscatedName("ad.au")
    public int field967 = -1;

    @ObfuscatedName("ad.ao")
    public int[] field944;

    @ObfuscatedName("ad.ak")
    public int field933 = -1;

    @ObfuscatedName("ad.at")
    public int field970 = -1;

    @ObfuscatedName("ad.aw")
    public int field964 = -1;

    @ObfuscatedName("ad.as")
    public int field972 = 0;

    @ObfuscatedName("ad.aq")
    public int field973 = 0;

    @ObfuscatedName("ad.ax")
    public int field961 = 0;

    @ObfuscatedName("ad.an")
    public int[] field975;

    @ObfuscatedName("r.w(IB)Lad;")
    public static class41 method589(int arg0) {
        class41 var1 = (class41) field929.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field927.method3127(6, arg0);
        class41 var3 = new class41();
        var3.field937 = arg0;
        if (var2 != null) {
            var3.method804(new class120(var2));
        }
        var3.method803();
        if (var3.field966) {
            var3.field932 = 0;
            var3.field978 = false;
        }
        field929.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.x(I)V")
    public void method803() {
        if (this.field976 == -1) {
            this.field976 = 0;
            if (this.field935 != null && (this.field936 == null || this.field936[0] == 10)) {
                this.field976 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field954[var1] != null) {
                    this.field976 = 1;
                }
            }
        }
        if (this.field967 == -1) {
            this.field967 = this.field932 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ad.t(Lde;I)V")
    public void method804(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method805(arg0, var2);
        }
    }

    @ObfuscatedName("ad.p(Lde;IB)V")
    public void method805(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            if (var3 > 0) {
                if (this.field935 == null || field965) {
                    this.field936 = new int[var3];
                    this.field935 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field935[var4] = arg0.method2365();
                        this.field936[var4] = arg0.method2363();
                    }
                } else {
                    arg0.field2012 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field971 = arg0.method2540();
        } else if (arg1 == 5) {
            int var5 = arg0.method2363();
            if (var5 > 0) {
                if (this.field935 == null || field965) {
                    this.field936 = null;
                    this.field935 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field935[var6] = arg0.method2365();
                    }
                } else {
                    arg0.field2012 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field980 = arg0.method2363();
        } else if (arg1 == 15) {
            this.field943 = arg0.method2363();
        } else if (arg1 == 17) {
            this.field932 = 0;
            this.field978 = false;
        } else if (arg1 == 18) {
            this.field978 = false;
        } else if (arg1 == 19) {
            this.field976 = arg0.method2363();
        } else if (arg1 == 21) {
            this.field947 = 0;
        } else if (arg1 == 22) {
            this.field948 = true;
        } else if (arg1 == 23) {
            this.field939 = true;
        } else if (arg1 == 24) {
            this.field950 = arg0.method2365();
            if (this.field950 == 65535) {
                this.field950 = -1;
            }
        } else if (arg1 == 27) {
            this.field932 = 1;
        } else if (arg1 == 28) {
            this.field951 = arg0.method2363();
        } else if (arg1 == 29) {
            this.field952 = arg0.method2381();
        } else if (arg1 == 39) {
            this.field953 = arg0.method2381() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field954[arg1 - 30] = arg0.method2540();
            if (this.field954[arg1 - 30].equalsIgnoreCase(class158.field2338)) {
                this.field954[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2363();
            this.field938 = new short[var7];
            this.field968 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field938[var8] = (short) arg0.method2365();
                this.field968[var8] = (short) arg0.method2365();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2363();
            this.field974 = new short[var9];
            this.field941 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field974[var10] = (short) arg0.method2365();
                this.field941[var10] = (short) arg0.method2365();
            }
        } else if (arg1 == 60) {
            this.field955 = arg0.method2365();
        } else if (arg1 == 62) {
            this.field934 = true;
        } else if (arg1 == 64) {
            this.field958 = false;
        } else if (arg1 == 65) {
            this.field959 = arg0.method2365();
        } else if (arg1 == 66) {
            this.field960 = arg0.method2365();
        } else if (arg1 == 67) {
            this.field946 = arg0.method2365();
        } else if (arg1 == 68) {
            this.field956 = arg0.method2365();
        } else if (arg1 == 69) {
            arg0.method2363();
        } else if (arg1 == 70) {
            this.field962 = arg0.method2366();
        } else if (arg1 == 71) {
            this.field963 = arg0.method2366();
        } else if (arg1 == 72) {
            this.field957 = arg0.method2366();
        } else if (arg1 == 73) {
            this.field942 = true;
        } else if (arg1 == 74) {
            this.field966 = true;
        } else if (arg1 == 75) {
            this.field967 = arg0.method2363();
        } else if (arg1 == 77) {
            this.field933 = arg0.method2365();
            if (this.field933 == 65535) {
                this.field933 = -1;
            }
            this.field970 = arg0.method2365();
            if (this.field970 == 65535) {
                this.field970 = -1;
            }
            int var11 = arg0.method2363();
            this.field944 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field944[var12] = arg0.method2365();
                if (this.field944[var12] == 65535) {
                    this.field944[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field964 = arg0.method2365();
            this.field972 = arg0.method2363();
        } else if (arg1 == 79) {
            this.field973 = arg0.method2365();
            this.field961 = arg0.method2365();
            this.field972 = arg0.method2363();
            int var13 = arg0.method2363();
            this.field975 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field975[var14] = arg0.method2365();
            }
        } else if (arg1 == 81) {
            this.field947 = arg0.method2363() * 256;
        }
    }

    @ObfuscatedName("ad.e(II)Z")
    public final boolean method806(int arg0) {
        if (this.field936 != null) {
            for (int var4 = 0; var4 < this.field936.length; var4++) {
                if (this.field936[var4] == arg0) {
                    return Statics.field928.method3082(this.field935[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field935 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field935.length; var3++) {
                var2 &= Statics.field928.method3082(this.field935[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ad.y(I)Z")
    public final boolean method802() {
        if (this.field935 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field935.length; var2++) {
            var1 &= Statics.field928.method3082(this.field935[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ad.m(II[[IIIIB)Lcw;")
    public final class86 method808(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field936 == null) {
            var7 = (long) ((this.field937 << 10) + arg1);
        } else {
            var7 = (long) ((this.field937 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field931.method3520(var7);
        if (var9 == null) {
            class101 var10 = this.method855(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field948) {
                var10.field1735 = (short) (this.field952 + 64);
                var10.field1736 = (short) (this.field953 + 768);
                var10.method2129();
                var9 = var10;
            } else {
                var9 = var10.method2079(this.field952 + 64, this.field953 + 768, -50, -10, -50);
            }
            field931.method3522(var9, var7);
        }
        if (this.field948) {
            var9 = ((class101) var9).method2115();
        }
        if (this.field947 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2167(arg2, arg3, arg4, arg5, true, this.field947);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2092(arg2, arg3, arg4, arg5, true, this.field947);
            }
        }
        return var9;
    }

    @ObfuscatedName("ad.c(II[[IIIII)Ldp;")
    public final class106 method851(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field936 == null) {
            var7 = (long) ((this.field937 << 10) + arg1);
        } else {
            var7 = (long) ((this.field937 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field940.method3520(var7);
        if (var9 == null) {
            class101 var10 = this.method855(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2079(this.field952 + 64, this.field953 + 768, -50, -10, -50);
            field940.method3522(var9, var7);
        }
        if (this.field947 >= 0) {
            var9 = var9.method2167(arg2, arg3, arg4, arg5, true, this.field947);
        }
        return var9;
    }

    @ObfuscatedName("ad.v(II[[IIIILao;II)Ldp;")
    public final class106 method810(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field936 == null) {
            var9 = (long) ((this.field937 << 10) + arg1);
        } else {
            var9 = (long) ((this.field937 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field940.method3520(var9);
        if (var11 == null) {
            class101 var12 = this.method855(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2079(this.field952 + 64, this.field953 + 768, -50, -10, -50);
            field940.method3522(var11, var9);
        }
        if (arg6 == null && this.field947 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2178(true);
        } else {
            var13 = arg6.method900(var11, arg7, arg1);
        }
        if (this.field947 >= 0) {
            var13 = var13.method2167(arg2, arg3, arg4, arg5, false, this.field947);
        }
        return var13;
    }

    @ObfuscatedName("ad.l(IIB)Lcu;")
    public final class101 method855(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field936 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field935 == null) {
                return null;
            }
            boolean var4 = this.field934;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field935.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field935[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field930.method3520((long) var7);
                if (var3 == null) {
                    var3 = class101.method2081(Statics.field928, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2073();
                    }
                    field930.method3522(var3, (long) var7);
                }
                if (var5 > 1) {
                    field949[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field949, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field936.length; var9++) {
                if (this.field936[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field935[var8];
            boolean var11 = this.field934 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field930.method3520((long) var10);
            if (var3 == null) {
                var3 = class101.method2081(Statics.field928, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2073();
                }
                field930.method3522(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field959 == 128 && this.field960 == 128 && this.field946 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field962 == 0 && this.field963 == 0 && this.field957 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field938 == null, this.field974 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2069(256);
            var14.method2070(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2061();
        } else if (var15 == 2) {
            var14.method2067();
        } else if (var15 == 3) {
            var14.method2068();
        }
        if (this.field938 != null) {
            for (int var16 = 0; var16 < this.field938.length; var16++) {
                var14.method2105(this.field938[var16], this.field968[var16]);
            }
        }
        if (this.field974 != null) {
            for (int var17 = 0; var17 < this.field974.length; var17++) {
                var14.method2072(this.field974[var17], this.field941[var17]);
            }
        }
        if (var12) {
            var14.method2074(this.field959, this.field960, this.field946);
        }
        if (var13) {
            var14.method2070(this.field962, this.field963, this.field957);
        }
        return var14;
    }

    @ObfuscatedName("ad.z(I)Lad;")
    public final class41 method823() {
        int var1 = -1;
        if (this.field933 != -1) {
            var1 = class177.method2977(this.field933);
        } else if (this.field970 != -1) {
            var1 = class177.field2917[this.field970];
        }
        return var1 < 0 || var1 >= this.field944.length || this.field944[var1] == -1 ? null : method589(this.field944[var1]);
    }

    @ObfuscatedName("dg.s(I)V")
    public static void method2675() {
        field929.method3525();
        field930.method3525();
        field931.method3525();
        field940.method3525();
    }

    @ObfuscatedName("ad.j(B)Z")
    public boolean method813() {
        if (this.field944 == null) {
            return this.field964 != -1 || this.field975 != null;
        }
        for (int var1 = 0; var1 < this.field944.length; var1++) {
            if (this.field944[var1] != -1) {
                class41 var2 = method589(this.field944[var1]);
                if (var2.field964 != -1 || var2.field975 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
