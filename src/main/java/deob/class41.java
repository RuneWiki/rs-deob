package deob;

@ObfuscatedName("av")
public class class41 extends class204 {

    @ObfuscatedName("av.o")
    public static boolean field947 = false;

    @ObfuscatedName("av.b")
    public static class193 field921 = new class193(64);

    @ObfuscatedName("av.p")
    public static class193 field925 = new class193(500);

    @ObfuscatedName("av.s")
    public static class193 field923 = new class193(30);

    @ObfuscatedName("av.y")
    public static class193 field968 = new class193(30);

    @ObfuscatedName("av.t")
    public static class100[] field937 = new class100[4];

    @ObfuscatedName("av.w")
    public int field926;

    @ObfuscatedName("av.h")
    public int[] field918;

    @ObfuscatedName("av.d")
    public int[] field928;

    @ObfuscatedName("av.l")
    public String field929 = "null";

    @ObfuscatedName("av.n")
    public short[] field930;

    @ObfuscatedName("av.q")
    public short[] field940;

    @ObfuscatedName("av.f")
    public short[] field932;

    @ObfuscatedName("av.v")
    public short[] field961;

    @ObfuscatedName("av.a")
    public int field934 = 1;

    @ObfuscatedName("av.k")
    public int field935 = 1;

    @ObfuscatedName("av.r")
    public int field936 = 2;

    @ObfuscatedName("av.i")
    public boolean field969 = true;

    @ObfuscatedName("av.j")
    public int field938 = -1;

    @ObfuscatedName("av.z")
    public int field939 = -1;

    @ObfuscatedName("av.m")
    public boolean field959 = false;

    @ObfuscatedName("av.g")
    public boolean field941 = false;

    @ObfuscatedName("av.c")
    public int field942 = -1;

    @ObfuscatedName("av.x")
    public int field943 = 16;

    @ObfuscatedName("av.ah")
    public int field944 = 0;

    @ObfuscatedName("av.ap")
    public int field945 = 0;

    @ObfuscatedName("av.aa")
    public String[] field949 = new String[5];

    @ObfuscatedName("av.ay")
    public int field948 = -1;

    @ObfuscatedName("av.ak")
    public int field927 = -1;

    @ObfuscatedName("av.an")
    public boolean field922 = false;

    @ObfuscatedName("av.af")
    public boolean field950 = true;

    @ObfuscatedName("av.ao")
    public int field951 = 128;

    @ObfuscatedName("av.as")
    public int field952 = 128;

    @ObfuscatedName("av.am")
    public int field953 = 128;

    @ObfuscatedName("av.ae")
    public int field956 = 0;

    @ObfuscatedName("av.ax")
    public int field920 = 0;

    @ObfuscatedName("av.aj")
    public int field954 = 0;

    @ObfuscatedName("av.ab")
    public boolean field946 = false;

    @ObfuscatedName("av.av")
    public boolean field958 = false;

    @ObfuscatedName("av.aq")
    public int field924 = -1;

    @ObfuscatedName("av.ac")
    public int[] field960;

    @ObfuscatedName("av.ar")
    public int field957 = -1;

    @ObfuscatedName("av.az")
    public int field962 = -1;

    @ObfuscatedName("av.ad")
    public int field955 = -1;

    @ObfuscatedName("av.au")
    public int field964 = 0;

    @ObfuscatedName("av.aw")
    public int field965 = 0;

    @ObfuscatedName("av.ag")
    public int field966 = 0;

    @ObfuscatedName("av.al")
    public int[] field967;

    @ObfuscatedName("fk.o(Lfq;Lfq;ZI)V")
    public static void method2986(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field919 = arg0;
        Statics.field933 = arg1;
        field947 = arg2;
    }

    @ObfuscatedName("em.e(II)Lav;")
    public static class41 method2808(int arg0) {
        class41 var1 = (class41) field921.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field919.method3057(6, arg0);
        class41 var3 = new class41();
        var3.field926 = arg0;
        if (var2 != null) {
            var3.method781(new class119(var2));
        }
        var3.method782();
        if (var3.field958) {
            var3.field936 = 0;
            var3.field969 = false;
        }
        field921.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.u(I)V")
    public void method782() {
        if (this.field938 == -1) {
            this.field938 = 0;
            if (this.field918 != null && (this.field928 == null || this.field928[0] == 10)) {
                this.field938 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field949[var1] != null) {
                    this.field938 = 1;
                }
            }
        }
        if (this.field924 == -1) {
            this.field924 = this.field936 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.b(Ldi;B)V")
    public void method781(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method784(arg0, var2);
        }
    }

    @ObfuscatedName("av.p(Ldi;IB)V")
    public void method784(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2427();
            if (var3 > 0) {
                if (this.field918 == null || field947) {
                    this.field928 = new int[var3];
                    this.field918 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field918[var4] = arg0.method2339();
                        this.field928[var4] = arg0.method2427();
                    }
                } else {
                    arg0.field1974 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field929 = arg0.method2528();
        } else if (arg1 == 5) {
            int var5 = arg0.method2427();
            if (var5 > 0) {
                if (this.field918 == null || field947) {
                    this.field928 = null;
                    this.field918 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field918[var6] = arg0.method2339();
                    }
                } else {
                    arg0.field1974 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field934 = arg0.method2427();
        } else if (arg1 == 15) {
            this.field935 = arg0.method2427();
        } else if (arg1 == 17) {
            this.field936 = 0;
            this.field969 = false;
        } else if (arg1 == 18) {
            this.field969 = false;
        } else if (arg1 == 19) {
            this.field938 = arg0.method2427();
        } else if (arg1 == 21) {
            this.field939 = 0;
        } else if (arg1 == 22) {
            this.field959 = true;
        } else if (arg1 == 23) {
            this.field941 = true;
        } else if (arg1 == 24) {
            this.field942 = arg0.method2339();
            if (this.field942 == 65535) {
                this.field942 = -1;
            }
        } else if (arg1 == 27) {
            this.field936 = 1;
        } else if (arg1 == 28) {
            this.field943 = arg0.method2427();
        } else if (arg1 == 29) {
            this.field944 = arg0.method2338();
        } else if (arg1 == 39) {
            this.field945 = arg0.method2338();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field949[arg1 - 30] = arg0.method2528();
            if (this.field949[arg1 - 30].equalsIgnoreCase(class157.field2334)) {
                this.field949[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2427();
            this.field930 = new short[var7];
            this.field940 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field930[var8] = (short) arg0.method2339();
                this.field940[var8] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2427();
            this.field932 = new short[var9];
            this.field961 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field932[var10] = (short) arg0.method2339();
                this.field961[var10] = (short) arg0.method2339();
            }
        } else if (arg1 == 60) {
            this.field948 = arg0.method2339();
        } else if (arg1 == 62) {
            this.field922 = true;
        } else if (arg1 == 64) {
            this.field950 = false;
        } else if (arg1 == 65) {
            this.field951 = arg0.method2339();
        } else if (arg1 == 66) {
            this.field952 = arg0.method2339();
        } else if (arg1 == 67) {
            this.field953 = arg0.method2339();
        } else if (arg1 == 68) {
            this.field927 = arg0.method2339();
        } else if (arg1 == 69) {
            arg0.method2427();
        } else if (arg1 == 70) {
            this.field956 = arg0.method2340();
        } else if (arg1 == 71) {
            this.field920 = arg0.method2340();
        } else if (arg1 == 72) {
            this.field954 = arg0.method2340();
        } else if (arg1 == 73) {
            this.field946 = true;
        } else if (arg1 == 74) {
            this.field958 = true;
        } else if (arg1 == 75) {
            this.field924 = arg0.method2427();
        } else if (arg1 == 77) {
            this.field957 = arg0.method2339();
            if (this.field957 == 65535) {
                this.field957 = -1;
            }
            this.field962 = arg0.method2339();
            if (this.field962 == 65535) {
                this.field962 = -1;
            }
            int var11 = arg0.method2427();
            this.field960 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field960[var12] = arg0.method2339();
                if (this.field960[var12] == 65535) {
                    this.field960[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field955 = arg0.method2339();
            this.field964 = arg0.method2427();
        } else if (arg1 == 79) {
            this.field965 = arg0.method2339();
            this.field966 = arg0.method2339();
            this.field964 = arg0.method2427();
            int var13 = arg0.method2427();
            this.field967 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field967[var14] = arg0.method2339();
            }
        } else if (arg1 == 81) {
            this.field939 = arg0.method2427() * 256;
        }
    }

    @ObfuscatedName("av.s(II)Z")
    public final boolean method785(int arg0) {
        if (this.field928 != null) {
            for (int var4 = 0; var4 < this.field928.length; var4++) {
                if (this.field928[var4] == arg0) {
                    return Statics.field933.method3122(this.field918[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field918 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field918.length; var3++) {
                var2 &= Statics.field933.method3122(this.field918[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.y(I)Z")
    public final boolean method786() {
        if (this.field918 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field918.length; var2++) {
            var1 &= Statics.field933.method3122(this.field918[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.t(II[[IIIII)Lcp;")
    public final class85 method791(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field928 == null) {
            var7 = (long) ((this.field926 << 10) + arg1);
        } else {
            var7 = (long) ((this.field926 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field923.method3510(var7);
        if (var9 == null) {
            class100 var10 = this.method789(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field959) {
                var10.field1715 = (short) (this.field944 + 64);
                var10.field1714 = (short) (this.field945 * 25 + 768);
                var10.method2055();
                var9 = var10;
            } else {
                var9 = var10.method2059(this.field944 + 64, this.field945 * 25 + 768, -50, -10, -50);
            }
            field923.method3512(var9, var7);
        }
        if (this.field959) {
            var9 = ((class100) var9).method2104();
        }
        if (this.field939 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2121(arg2, arg3, arg4, arg5, true, this.field939);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2078(arg2, arg3, arg4, arg5, true, this.field939);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.w(II[[IIIII)Ldk;")
    public final class105 method787(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field928 == null) {
            var7 = (long) ((this.field926 << 10) + arg1);
        } else {
            var7 = (long) ((this.field926 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field968.method3510(var7);
        if (var9 == null) {
            class100 var10 = this.method789(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2059(this.field944 + 64, this.field945 * 25 + 768, -50, -10, -50);
            field968.method3512(var9, var7);
        }
        if (this.field939 >= 0) {
            var9 = var9.method2121(arg2, arg3, arg4, arg5, true, this.field939);
        }
        return var9;
    }

    @ObfuscatedName("av.h(II[[IIIILac;IB)Ldk;")
    public final class105 method788(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field928 == null) {
            var9 = (long) ((this.field926 << 10) + arg1);
        } else {
            var9 = (long) ((this.field926 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field968.method3510(var9);
        if (var11 == null) {
            class100 var12 = this.method789(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2059(this.field944 + 64, this.field945 * 25 + 768, -50, -10, -50);
            field968.method3512(var11, var9);
        }
        if (arg6 == null && this.field939 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2189(true);
        } else {
            var13 = arg6.method848(var11, arg7, arg1);
        }
        if (this.field939 >= 0) {
            var13 = var13.method2121(arg2, arg3, arg4, arg5, false, this.field939);
        }
        return var13;
    }

    @ObfuscatedName("av.d(III)Lcf;")
    public final class100 method789(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field928 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field918 == null) {
                return null;
            }
            boolean var4 = this.field922;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field918.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field918[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field925.method3510((long) var7);
                if (var3 == null) {
                    var3 = class100.method2040(Statics.field933, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2053();
                    }
                    field925.method3512(var3, (long) var7);
                }
                if (var5 > 1) {
                    field937[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field937, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field928.length; var9++) {
                if (this.field928[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field918[var8];
            boolean var11 = this.field922 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field925.method3510((long) var10);
            if (var3 == null) {
                var3 = class100.method2040(Statics.field933, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2053();
                }
                field925.method3512(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field951 == 128 && this.field952 == 128 && this.field953 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field956 == 0 && this.field920 == 0 && this.field954 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field930 == null, this.field932 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2099(256);
            var14.method2061(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2073();
        } else if (var15 == 2) {
            var14.method2047();
        } else if (var15 == 3) {
            var14.method2048();
        }
        if (this.field930 != null) {
            for (int var16 = 0; var16 < this.field930.length; var16++) {
                var14.method2062(this.field930[var16], this.field940[var16]);
            }
        }
        if (this.field932 != null) {
            for (int var17 = 0; var17 < this.field932.length; var17++) {
                var14.method2052(this.field932[var17], this.field961[var17]);
            }
        }
        if (var12) {
            var14.method2042(this.field951, this.field952, this.field953);
        }
        if (var13) {
            var14.method2061(this.field956, this.field920, this.field954);
        }
        return var14;
    }

    @ObfuscatedName("av.l(B)Lav;")
    public final class41 method790() {
        int var1 = -1;
        if (this.field957 != -1) {
            var1 = class176.method2678(this.field957);
        } else if (this.field962 != -1) {
            var1 = class176.field2906[this.field962];
        }
        return var1 < 0 || var1 >= this.field960.length || this.field960[var1] == -1 ? null : method2808(this.field960[var1]);
    }

    @ObfuscatedName("av.n(I)Z")
    public boolean method796() {
        if (this.field960 == null) {
            return this.field955 != -1 || this.field967 != null;
        }
        for (int var1 = 0; var1 < this.field960.length; var1++) {
            if (this.field960[var1] != -1) {
                class41 var2 = method2808(this.field960[var1]);
                if (var2.field955 != -1 || var2.field967 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
