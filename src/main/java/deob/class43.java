package deob;

@ObfuscatedName("al")
public class class43 extends class208 {

    @ObfuscatedName("al.m")
    public static boolean field979 = false;

    @ObfuscatedName("al.o")
    public static class197 field945 = new class197(64);

    @ObfuscatedName("al.g")
    public static class197 field946 = new class197(500);

    @ObfuscatedName("al.l")
    public static class197 field947 = new class197(30);

    @ObfuscatedName("al.j")
    public static class197 field948 = new class197(30);

    @ObfuscatedName("al.r")
    public static class104[] field949 = new class104[4];

    @ObfuscatedName("al.x")
    public int field950;

    @ObfuscatedName("al.k")
    public int[] field951;

    @ObfuscatedName("al.v")
    public int[] field952;

    @ObfuscatedName("al.h")
    public String field953 = "null";

    @ObfuscatedName("al.u")
    public short[] field954;

    @ObfuscatedName("al.y")
    public short[] field955;

    @ObfuscatedName("al.p")
    public short[] field956;

    @ObfuscatedName("al.s")
    public short[] field970;

    @ObfuscatedName("al.f")
    public int field977 = 1;

    @ObfuscatedName("al.i")
    public int field981 = 1;

    @ObfuscatedName("al.d")
    public int field960 = 2;

    @ObfuscatedName("al.t")
    public boolean field961 = true;

    @ObfuscatedName("al.c")
    public int field975 = -1;

    @ObfuscatedName("al.z")
    public int field963 = -1;

    @ObfuscatedName("al.n")
    public boolean field989 = false;

    @ObfuscatedName("al.q")
    public boolean field965 = false;

    @ObfuscatedName("al.a")
    public int field943 = -1;

    @ObfuscatedName("al.b")
    public int field967 = 16;

    @ObfuscatedName("al.aj")
    public int field968 = 0;

    @ObfuscatedName("al.an")
    public int field969 = 0;

    @ObfuscatedName("al.ap")
    public String[] field974 = new String[5];

    @ObfuscatedName("al.ar")
    public int field959 = -1;

    @ObfuscatedName("al.ab")
    public int field962 = -1;

    @ObfuscatedName("al.ai")
    public boolean field973 = false;

    @ObfuscatedName("al.aa")
    public boolean field985 = true;

    @ObfuscatedName("al.ax")
    public int field982 = 128;

    @ObfuscatedName("al.ad")
    public int field976 = 128;

    @ObfuscatedName("al.av")
    public int field964 = 128;

    @ObfuscatedName("al.aq")
    public int field971 = 0;

    @ObfuscatedName("al.af")
    public int field957 = 0;

    @ObfuscatedName("al.at")
    public int field980 = 0;

    @ObfuscatedName("al.aw")
    public boolean field972 = false;

    @ObfuscatedName("al.ay")
    public boolean field958 = false;

    @ObfuscatedName("al.ah")
    public int field983 = -1;

    @ObfuscatedName("al.al")
    public int[] field984;

    @ObfuscatedName("al.as")
    public int field978 = -1;

    @ObfuscatedName("al.ac")
    public int field986 = -1;

    @ObfuscatedName("al.ao")
    public int field987 = -1;

    @ObfuscatedName("al.au")
    public int field988 = 0;

    @ObfuscatedName("al.am")
    public int field966 = 0;

    @ObfuscatedName("al.ag")
    public int field990 = 0;

    @ObfuscatedName("al.az")
    public int[] field991;

    @ObfuscatedName("ce.m(Lfa;Lfa;ZI)V")
    public static void method1867(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field3213 = arg0;
        Statics.field944 = arg1;
        field979 = arg2;
    }

    @ObfuscatedName("r.w(II)Lal;")
    public static class43 method96(int arg0) {
        class43 var1 = (class43) field945.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3213.method3086(6, arg0);
        class43 var3 = new class43();
        var3.field950 = arg0;
        if (var2 != null) {
            var3.method797(new class123(var2));
        }
        var3.method803();
        if (var3.field958) {
            var3.field960 = 0;
            var3.field961 = false;
        }
        field945.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.e(I)V")
    public void method803() {
        if (this.field975 == -1) {
            this.field975 = 0;
            if (this.field951 != null && (this.field952 == null || this.field952[0] == 10)) {
                this.field975 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field974[var1] != null) {
                    this.field975 = 1;
                }
            }
        }
        if (this.field983 == -1) {
            this.field983 = this.field960 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("al.o(Ldj;B)V")
    public void method797(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("al.g(Ldj;IB)V")
    public void method798(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2398();
            if (var3 > 0) {
                if (this.field951 == null || field979) {
                    this.field952 = new int[var3];
                    this.field951 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field951[var4] = arg0.method2548();
                        this.field952[var4] = arg0.method2398();
                    }
                } else {
                    arg0.field2046 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field953 = arg0.method2422();
        } else if (arg1 == 5) {
            int var5 = arg0.method2398();
            if (var5 > 0) {
                if (this.field951 == null || field979) {
                    this.field952 = null;
                    this.field951 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field951[var6] = arg0.method2548();
                    }
                } else {
                    arg0.field2046 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field977 = arg0.method2398();
        } else if (arg1 == 15) {
            this.field981 = arg0.method2398();
        } else if (arg1 == 17) {
            this.field960 = 0;
            this.field961 = false;
        } else if (arg1 == 18) {
            this.field961 = false;
        } else if (arg1 == 19) {
            this.field975 = arg0.method2398();
        } else if (arg1 == 21) {
            this.field963 = 0;
        } else if (arg1 == 22) {
            this.field989 = true;
        } else if (arg1 == 23) {
            this.field965 = true;
        } else if (arg1 == 24) {
            this.field943 = arg0.method2548();
            if (this.field943 == 65535) {
                this.field943 = -1;
            }
        } else if (arg1 == 27) {
            this.field960 = 1;
        } else if (arg1 == 28) {
            this.field967 = arg0.method2398();
        } else if (arg1 == 29) {
            this.field968 = arg0.method2415();
        } else if (arg1 == 39) {
            this.field969 = arg0.method2415();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field974[arg1 - 30] = arg0.method2422();
            if (this.field974[arg1 - 30].equalsIgnoreCase(class161.field2372)) {
                this.field974[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2398();
            this.field954 = new short[var7];
            this.field955 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field954[var8] = (short) arg0.method2548();
                this.field955[var8] = (short) arg0.method2548();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2398();
            this.field956 = new short[var9];
            this.field970 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field956[var10] = (short) arg0.method2548();
                this.field970[var10] = (short) arg0.method2548();
            }
        } else if (arg1 == 60) {
            this.field959 = arg0.method2548();
        } else if (arg1 == 62) {
            this.field973 = true;
        } else if (arg1 == 64) {
            this.field985 = false;
        } else if (arg1 == 65) {
            this.field982 = arg0.method2548();
        } else if (arg1 == 66) {
            this.field976 = arg0.method2548();
        } else if (arg1 == 67) {
            this.field964 = arg0.method2548();
        } else if (arg1 == 68) {
            this.field962 = arg0.method2548();
        } else if (arg1 == 69) {
            arg0.method2398();
        } else if (arg1 == 70) {
            this.field971 = arg0.method2417();
        } else if (arg1 == 71) {
            this.field957 = arg0.method2417();
        } else if (arg1 == 72) {
            this.field980 = arg0.method2417();
        } else if (arg1 == 73) {
            this.field972 = true;
        } else if (arg1 == 74) {
            this.field958 = true;
        } else if (arg1 == 75) {
            this.field983 = arg0.method2398();
        } else if (arg1 == 77) {
            this.field978 = arg0.method2548();
            if (this.field978 == 65535) {
                this.field978 = -1;
            }
            this.field986 = arg0.method2548();
            if (this.field986 == 65535) {
                this.field986 = -1;
            }
            int var11 = arg0.method2398();
            this.field984 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field984[var12] = arg0.method2548();
                if (this.field984[var12] == 65535) {
                    this.field984[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field987 = arg0.method2548();
            this.field988 = arg0.method2398();
        } else if (arg1 == 79) {
            this.field966 = arg0.method2548();
            this.field990 = arg0.method2548();
            this.field988 = arg0.method2398();
            int var13 = arg0.method2398();
            this.field991 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field991[var14] = arg0.method2548();
            }
        } else if (arg1 == 81) {
            this.field963 = arg0.method2398() * 256;
        }
    }

    @ObfuscatedName("al.l(II)Z")
    public final boolean method799(int arg0) {
        if (this.field952 != null) {
            for (int var4 = 0; var4 < this.field952.length; var4++) {
                if (this.field952[var4] == arg0) {
                    return Statics.field944.method3141(this.field951[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field951 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field951.length; var3++) {
                var2 &= Statics.field944.method3141(this.field951[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("al.j(B)Z")
    public final boolean method800() {
        if (this.field951 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field951.length; var2++) {
            var1 &= Statics.field944.method3141(this.field951[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("al.r(II[[IIIIB)Lce;")
    public final class89 method801(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field952 == null) {
            var7 = (long) ((this.field950 << 10) + arg1);
        } else {
            var7 = (long) ((this.field950 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field947.method3556(var7);
        if (var9 == null) {
            class104 var10 = this.method839(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field989) {
                var10.field1791 = (short) (this.field968 + 64);
                var10.field1792 = (short) (this.field969 * 25 + 768);
                var10.method2155();
                var9 = var10;
            } else {
                var9 = var10.method2159(this.field968 + 64, this.field969 * 25 + 768, -50, -10, -50);
            }
            field947.method3562(var9, var7);
        }
        if (this.field989) {
            var9 = ((class104) var9).method2144();
        }
        if (this.field963 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2221(arg2, arg3, arg4, arg5, true, this.field963);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2208(arg2, arg3, arg4, arg5, true, this.field963);
            }
        }
        return var9;
    }

    @ObfuscatedName("al.x(II[[IIIII)Ldg;")
    public final class109 method830(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field952 == null) {
            var7 = (long) ((this.field950 << 10) + arg1);
        } else {
            var7 = (long) ((this.field950 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field948.method3556(var7);
        if (var9 == null) {
            class104 var10 = this.method839(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2159(this.field968 + 64, this.field969 * 25 + 768, -50, -10, -50);
            field948.method3562(var9, var7);
        }
        if (this.field963 >= 0) {
            var9 = var9.method2221(arg2, arg3, arg4, arg5, true, this.field963);
        }
        return var9;
    }

    @ObfuscatedName("al.k(II[[IIIILac;II)Ldg;")
    public final class109 method825(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field952 == null) {
            var9 = (long) ((this.field950 << 10) + arg1);
        } else {
            var9 = (long) ((this.field950 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field948.method3556(var9);
        if (var11 == null) {
            class104 var12 = this.method839(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2159(this.field968 + 64, this.field969 * 25 + 768, -50, -10, -50);
            field948.method3562(var11, var9);
        }
        if (arg6 == null && this.field963 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2222(true);
        } else {
            var13 = arg6.method877(var11, arg7, arg1);
        }
        if (this.field963 >= 0) {
            var13 = var13.method2221(arg2, arg3, arg4, arg5, false, this.field963);
        }
        return var13;
    }

    @ObfuscatedName("al.v(IIS)Lcj;")
    public final class104 method839(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field952 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field951 == null) {
                return null;
            }
            boolean var4 = this.field973;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field951.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field951[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field946.method3556((long) var7);
                if (var3 == null) {
                    var3 = class104.method2177(Statics.field944, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2153();
                    }
                    field946.method3562(var3, (long) var7);
                }
                if (var5 > 1) {
                    field949[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field949, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field952.length; var9++) {
                if (this.field952[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field951[var8];
            boolean var11 = this.field973 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field946.method3556((long) var10);
            if (var3 == null) {
                var3 = class104.method2177(Statics.field944, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2153();
                }
                field946.method3562(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field982 == 128 && this.field976 == 128 && this.field964 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field971 == 0 && this.field957 == 0 && this.field980 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field954 == null, this.field956 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2150(256);
            var14.method2168(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2140();
        } else if (var15 == 2) {
            var14.method2148();
        } else if (var15 == 3) {
            var14.method2141();
        }
        if (this.field954 != null) {
            for (int var16 = 0; var16 < this.field954.length; var16++) {
                var14.method2171(this.field954[var16], this.field955[var16]);
            }
        }
        if (this.field956 != null) {
            for (int var17 = 0; var17 < this.field956.length; var17++) {
                var14.method2152(this.field956[var17], this.field970[var17]);
            }
        }
        if (var12) {
            var14.method2202(this.field982, this.field976, this.field964);
        }
        if (var13) {
            var14.method2168(this.field971, this.field957, this.field980);
        }
        return var14;
    }

    @ObfuscatedName("al.h(B)Lal;")
    public final class43 method817() {
        int var1 = -1;
        if (this.field978 != -1) {
            var1 = class180.method145(this.field978);
        } else if (this.field986 != -1) {
            var1 = class180.field2950[this.field986];
        }
        return var1 < 0 || var1 >= this.field984.length || this.field984[var1] == -1 ? null : method96(this.field984[var1]);
    }

    @ObfuscatedName("al.u(I)Z")
    public boolean method806() {
        if (this.field984 == null) {
            return this.field987 != -1 || this.field991 != null;
        }
        for (int var1 = 0; var1 < this.field984.length; var1++) {
            if (this.field984[var1] != -1) {
                class43 var2 = method96(this.field984[var1]);
                if (var2.field987 != -1 || var2.field991 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
