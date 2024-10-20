package deob;

@ObfuscatedName("ap")
public class class41 extends class204 {

    @ObfuscatedName("ap.i")
    public static boolean field949 = false;

    @ObfuscatedName("ap.n")
    public static class193 field952 = new class193(64);

    @ObfuscatedName("ap.x")
    public static class193 field945 = new class193(500);

    @ObfuscatedName("ap.q")
    public static class193 field925 = new class193(30);

    @ObfuscatedName("ap.h")
    public static class193 field926 = new class193(30);

    @ObfuscatedName("ap.d")
    public static class100[] field964 = new class100[4];

    @ObfuscatedName("ap.c")
    public int field960;

    @ObfuscatedName("ap.y")
    public int[] field929;

    @ObfuscatedName("ap.m")
    public int[] field953;

    @ObfuscatedName("ap.e")
    public String field931 = "null";

    @ObfuscatedName("ap.z")
    public short[] field948;

    @ObfuscatedName("ap.t")
    public short[] field933;

    @ObfuscatedName("ap.b")
    public short[] field966;

    @ObfuscatedName("ap.l")
    public short[] field932;

    @ObfuscatedName("ap.s")
    public int field936 = 1;

    @ObfuscatedName("ap.f")
    public int field937 = 1;

    @ObfuscatedName("ap.g")
    public int field938 = 2;

    @ObfuscatedName("ap.u")
    public boolean field939 = true;

    @ObfuscatedName("ap.o")
    public int field940 = -1;

    @ObfuscatedName("ap.k")
    public int field941 = -1;

    @ObfuscatedName("ap.a")
    public boolean field942 = false;

    @ObfuscatedName("ap.j")
    public boolean field928 = false;

    @ObfuscatedName("ap.p")
    public int field944 = -1;

    @ObfuscatedName("ap.w")
    public int field943 = 16;

    @ObfuscatedName("ap.au")
    public int field946 = 0;

    @ObfuscatedName("ap.ar")
    public int field923 = 0;

    @ObfuscatedName("ap.ah")
    public String[] field930 = new String[5];

    @ObfuscatedName("ap.af")
    public int field935 = -1;

    @ObfuscatedName("ap.az")
    public int field950 = -1;

    @ObfuscatedName("ap.av")
    public boolean field951 = false;

    @ObfuscatedName("ap.al")
    public boolean field924 = true;

    @ObfuscatedName("ap.aw")
    public int field969 = 128;

    @ObfuscatedName("ap.ac")
    public int field934 = 128;

    @ObfuscatedName("ap.ai")
    public int field955 = 128;

    @ObfuscatedName("ap.ab")
    public int field956 = 0;

    @ObfuscatedName("ap.aj")
    public int field957 = 0;

    @ObfuscatedName("ap.an")
    public int field927 = 0;

    @ObfuscatedName("ap.ay")
    public boolean field959 = false;

    @ObfuscatedName("ap.ap")
    public boolean field958 = false;

    @ObfuscatedName("ap.ax")
    public int field961 = -1;

    @ObfuscatedName("ap.aa")
    public int[] field962;

    @ObfuscatedName("ap.ae")
    public int field963 = -1;

    @ObfuscatedName("ap.ao")
    public int field954 = -1;

    @ObfuscatedName("ap.am")
    public int field965 = -1;

    @ObfuscatedName("ap.aq")
    public int field947 = 0;

    @ObfuscatedName("ap.ak")
    public int field967 = 0;

    @ObfuscatedName("ap.at")
    public int field968 = 0;

    @ObfuscatedName("ap.as")
    public int[] field920;

    @ObfuscatedName("w.i(Lfe;Lfe;ZI)V")
    public static void method644(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field921 = arg0;
        Statics.field922 = arg1;
        field949 = arg2;
    }

    @ObfuscatedName("cy.v(II)Lap;")
    public static class41 method1767(int arg0) {
        class41 var1 = (class41) field952.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method3035(6, arg0);
        class41 var3 = new class41();
        var3.field960 = arg0;
        if (var2 != null) {
            var3.method824(new class119(var2));
        }
        var3.method803();
        if (var3.field958) {
            var3.field938 = 0;
            var3.field939 = false;
        }
        field952.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.r(B)V")
    public void method803() {
        if (this.field940 == -1) {
            this.field940 = 0;
            if (this.field929 != null && (this.field953 == null || this.field953[0] == 10)) {
                this.field940 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field930[var1] != null) {
                    this.field940 = 1;
                }
            }
        }
        if (this.field961 == -1) {
            this.field961 = this.field938 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.n(Ldx;I)V")
    public void method824(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method802(arg0, var2);
        }
    }

    @ObfuscatedName("ap.x(Ldx;IB)V")
    public void method802(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2380();
            if (var3 > 0) {
                if (this.field929 == null || field949) {
                    this.field953 = new int[var3];
                    this.field929 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field929[var4] = arg0.method2347();
                        this.field953[var4] = arg0.method2380();
                    }
                } else {
                    arg0.field1980 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field931 = arg0.method2356();
        } else if (arg1 == 5) {
            int var5 = arg0.method2380();
            if (var5 > 0) {
                if (this.field929 == null || field949) {
                    this.field953 = null;
                    this.field929 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field929[var6] = arg0.method2347();
                    }
                } else {
                    arg0.field1980 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field936 = arg0.method2380();
        } else if (arg1 == 15) {
            this.field937 = arg0.method2380();
        } else if (arg1 == 17) {
            this.field938 = 0;
            this.field939 = false;
        } else if (arg1 == 18) {
            this.field939 = false;
        } else if (arg1 == 19) {
            this.field940 = arg0.method2380();
        } else if (arg1 == 21) {
            this.field941 = 0;
        } else if (arg1 == 22) {
            this.field942 = true;
        } else if (arg1 == 23) {
            this.field928 = true;
        } else if (arg1 == 24) {
            this.field944 = arg0.method2347();
            if (this.field944 == 65535) {
                this.field944 = -1;
            }
        } else if (arg1 == 27) {
            this.field938 = 1;
        } else if (arg1 == 28) {
            this.field943 = arg0.method2380();
        } else if (arg1 == 29) {
            this.field946 = arg0.method2346();
        } else if (arg1 == 39) {
            this.field923 = arg0.method2346() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field930[arg1 - 30] = arg0.method2356();
            if (this.field930[arg1 - 30].equalsIgnoreCase(class157.field2302)) {
                this.field930[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2380();
            this.field948 = new short[var7];
            this.field933 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field948[var8] = (short) arg0.method2347();
                this.field933[var8] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2380();
            this.field966 = new short[var9];
            this.field932 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field966[var10] = (short) arg0.method2347();
                this.field932[var10] = (short) arg0.method2347();
            }
        } else if (arg1 == 60) {
            this.field935 = arg0.method2347();
        } else if (arg1 == 62) {
            this.field951 = true;
        } else if (arg1 == 64) {
            this.field924 = false;
        } else if (arg1 == 65) {
            this.field969 = arg0.method2347();
        } else if (arg1 == 66) {
            this.field934 = arg0.method2347();
        } else if (arg1 == 67) {
            this.field955 = arg0.method2347();
        } else if (arg1 == 68) {
            this.field950 = arg0.method2347();
        } else if (arg1 == 69) {
            arg0.method2380();
        } else if (arg1 == 70) {
            this.field956 = arg0.method2348();
        } else if (arg1 == 71) {
            this.field957 = arg0.method2348();
        } else if (arg1 == 72) {
            this.field927 = arg0.method2348();
        } else if (arg1 == 73) {
            this.field959 = true;
        } else if (arg1 == 74) {
            this.field958 = true;
        } else if (arg1 == 75) {
            this.field961 = arg0.method2380();
        } else if (arg1 == 77) {
            this.field963 = arg0.method2347();
            if (this.field963 == 65535) {
                this.field963 = -1;
            }
            this.field954 = arg0.method2347();
            if (this.field954 == 65535) {
                this.field954 = -1;
            }
            int var11 = arg0.method2380();
            this.field962 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field962[var12] = arg0.method2347();
                if (this.field962[var12] == 65535) {
                    this.field962[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field965 = arg0.method2347();
            this.field947 = arg0.method2380();
        } else if (arg1 == 79) {
            this.field967 = arg0.method2347();
            this.field968 = arg0.method2347();
            this.field947 = arg0.method2380();
            int var13 = arg0.method2380();
            this.field920 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field920[var14] = arg0.method2347();
            }
        } else if (arg1 == 81) {
            this.field941 = arg0.method2380() * 256;
        }
    }

    @ObfuscatedName("ap.q(II)Z")
    public final boolean method829(int arg0) {
        if (this.field953 != null) {
            for (int var4 = 0; var4 < this.field953.length; var4++) {
                if (this.field953[var4] == arg0) {
                    return Statics.field922.method3063(this.field929[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field929 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field929.length; var3++) {
                var2 &= Statics.field922.method3063(this.field929[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.h(S)Z")
    public final boolean method804() {
        if (this.field929 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field929.length; var2++) {
            var1 &= Statics.field922.method3063(this.field929[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.d(II[[IIIII)Lcy;")
    public final class85 method805(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field953 == null) {
            var7 = (long) ((this.field960 << 10) + arg1);
        } else {
            var7 = (long) ((this.field960 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field925.method3464(var7);
        if (var9 == null) {
            class100 var10 = this.method808(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field942) {
                var10.field1710 = (short) (this.field946 + 64);
                var10.field1711 = (short) (this.field923 + 768);
                var10.method2105();
                var9 = var10;
            } else {
                var9 = var10.method2062(this.field946 + 64, this.field923 + 768, -50, -10, -50);
            }
            field925.method3466(var9, var7);
        }
        if (this.field942) {
            var9 = ((class100) var9).method2046();
        }
        if (this.field941 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2149(arg2, arg3, arg4, arg5, true, this.field941);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2047(arg2, arg3, arg4, arg5, true, this.field941);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.c(II[[IIIIB)Ldj;")
    public final class105 method812(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field953 == null) {
            var7 = (long) ((this.field960 << 10) + arg1);
        } else {
            var7 = (long) ((this.field960 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field926.method3464(var7);
        if (var9 == null) {
            class100 var10 = this.method808(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2062(this.field946 + 64, this.field923 + 768, -50, -10, -50);
            field926.method3466(var9, var7);
        }
        if (this.field941 >= 0) {
            var9 = var9.method2149(arg2, arg3, arg4, arg5, true, this.field941);
        }
        return var9;
    }

    @ObfuscatedName("ap.y(II[[IIIILaa;II)Ldj;")
    public final class105 method807(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field953 == null) {
            var9 = (long) ((this.field960 << 10) + arg1);
        } else {
            var9 = (long) ((this.field960 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field926.method3464(var9);
        if (var11 == null) {
            class100 var12 = this.method808(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2062(this.field946 + 64, this.field923 + 768, -50, -10, -50);
            field926.method3466(var11, var9);
        }
        if (arg6 == null && this.field941 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2150(true);
        } else {
            var13 = arg6.method868(var11, arg7, arg1);
        }
        if (this.field941 >= 0) {
            var13 = var13.method2149(arg2, arg3, arg4, arg5, false, this.field941);
        }
        return var13;
    }

    @ObfuscatedName("ap.m(III)Lcx;")
    public final class100 method808(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field953 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field929 == null) {
                return null;
            }
            boolean var4 = this.field951;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field929.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field929[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field945.method3464((long) var7);
                if (var3 == null) {
                    var3 = class100.method2042(Statics.field922, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2056();
                    }
                    field945.method3466(var3, (long) var7);
                }
                if (var5 > 1) {
                    field964[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field964, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field953.length; var9++) {
                if (this.field953[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field929[var8];
            boolean var11 = this.field951 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field945.method3464((long) var10);
            if (var3 == null) {
                var3 = class100.method2042(Statics.field922, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2056();
                }
                field945.method3466(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field969 == 128 && this.field934 == 128 && this.field955 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field956 == 0 && this.field957 == 0 && this.field927 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field948 == null, this.field966 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2107(256);
            var14.method2043(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2049();
        } else if (var15 == 2) {
            var14.method2050();
        } else if (var15 == 3) {
            var14.method2051();
        }
        if (this.field948 != null) {
            for (int var16 = 0; var16 < this.field948.length; var16++) {
                var14.method2054(this.field948[var16], this.field933[var16]);
            }
        }
        if (this.field966 != null) {
            for (int var17 = 0; var17 < this.field966.length; var17++) {
                var14.method2055(this.field966[var17], this.field932[var17]);
            }
        }
        if (var12) {
            var14.method2057(this.field969, this.field934, this.field955);
        }
        if (var13) {
            var14.method2043(this.field956, this.field957, this.field927);
        }
        return var14;
    }

    @ObfuscatedName("ap.e(B)Lap;")
    public final class41 method809() {
        int var1 = -1;
        if (this.field963 != -1) {
            var1 = class176.method140(this.field963);
        } else if (this.field954 != -1) {
            var1 = class176.field2886[this.field954];
        }
        return var1 < 0 || var1 >= this.field962.length || this.field962[var1] == -1 ? null : method1767(this.field962[var1]);
    }

    @ObfuscatedName("ap.z(I)Z")
    public boolean method810() {
        if (this.field962 == null) {
            return this.field965 != -1 || this.field920 != null;
        }
        for (int var1 = 0; var1 < this.field962.length; var1++) {
            if (this.field962[var1] != -1) {
                class41 var2 = method1767(this.field962[var1]);
                if (var2.field965 != -1 || var2.field920 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
