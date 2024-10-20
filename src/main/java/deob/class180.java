package deob;

@ObfuscatedName("fm")
public class class180 extends class382 {

    @ObfuscatedName("fm.c")
    public static boolean field1970 = false;

    @ObfuscatedName("fm.m")
    public static class249 field1954 = new class249(4096);

    @ObfuscatedName("fm.t")
    public static class249 field1955 = new class249(500);

    @ObfuscatedName("fm.s")
    public static class249 field1975 = new class249(30);

    @ObfuscatedName("fm.j")
    public static class249 field1957 = new class249(30);

    @ObfuscatedName("fm.w")
    public static class189[] field1958 = new class189[4];

    @ObfuscatedName("fm.n")
    public int field1951;

    @ObfuscatedName("fm.r")
    public int[] field1960;

    @ObfuscatedName("fm.o")
    public int[] field1961;

    @ObfuscatedName("fm.v")
    public String field1962 = class295.field3477;

    @ObfuscatedName("fm.d")
    public short[] field1963;

    @ObfuscatedName("fm.h")
    public short[] field1972;

    @ObfuscatedName("fm.g")
    public short[] field1959;

    @ObfuscatedName("fm.e")
    public short[] field1966;

    @ObfuscatedName("fm.a")
    public int field1967 = 1;

    @ObfuscatedName("fm.u")
    public int field1968 = 1;

    @ObfuscatedName("fm.k")
    public int field1973 = 2;

    @ObfuscatedName("fm.f")
    public boolean field1987 = true;

    @ObfuscatedName("fm.l")
    public int field1956 = -1;

    @ObfuscatedName("fm.q")
    public int field1993 = -1;

    @ObfuscatedName("fm.x")
    public boolean field1965 = false;

    @ObfuscatedName("fm.z")
    public boolean field1974 = false;

    @ObfuscatedName("fm.i")
    public int field1964 = -1;

    @ObfuscatedName("fm.y")
    public int field1976 = 16;

    @ObfuscatedName("fm.ah")
    public int field1971 = 0;

    @ObfuscatedName("fm.ao")
    public int field1978 = 0;

    @ObfuscatedName("fm.ab")
    public String[] field1979 = new String[5];

    @ObfuscatedName("fm.an")
    public int field1980 = -1;

    @ObfuscatedName("fm.ax")
    public int field1992 = -1;

    @ObfuscatedName("fm.am")
    public boolean field1982 = false;

    @ObfuscatedName("fm.az")
    public boolean field1983 = true;

    @ObfuscatedName("fm.au")
    public int field1984 = 128;

    @ObfuscatedName("fm.av")
    public int field1985 = 128;

    @ObfuscatedName("fm.ap")
    public int field1986 = 128;

    @ObfuscatedName("fm.ac")
    public int field1998 = 0;

    @ObfuscatedName("fm.aj")
    public int field1988 = 0;

    @ObfuscatedName("fm.af")
    public int field1969 = 0;

    @ObfuscatedName("fm.ar")
    public boolean field1990 = false;

    @ObfuscatedName("fm.ag")
    public boolean field1991 = false;

    @ObfuscatedName("fm.al")
    public int field2002 = -1;

    @ObfuscatedName("fm.aa")
    public int[] field1981;

    @ObfuscatedName("fm.as")
    public int field1994 = -1;

    @ObfuscatedName("fm.at")
    public int field1995 = -1;

    @ObfuscatedName("fm.ai")
    public int field1996 = -1;

    @ObfuscatedName("fm.aq")
    public int field1997 = 0;

    @ObfuscatedName("fm.aw")
    public int field1989 = 0;

    @ObfuscatedName("fm.ay")
    public int field1999 = 0;

    @ObfuscatedName("fm.ae")
    public int[] field2000;

    @ObfuscatedName("fm.ak")
    public boolean field2001 = true;

    @ObfuscatedName("fm.ad")
    public class396 field1977;

    @ObfuscatedName("gm.c(Lku;Lku;ZI)V")
    public static void method3424(class302 arg0, class302 arg1, boolean arg2) {
        Statics.field1952 = arg0;
        Statics.field1953 = arg1;
        field1970 = arg2;
    }

    @ObfuscatedName("ea.b(II)Lfm;")
    public static class180 method2760(int arg0) {
        class180 var1 = (class180) field1954.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1952.method5053(6, arg0);
        class180 var3 = new class180();
        var3.field1951 = arg0;
        if (var2 != null) {
            var3.method3201(new class419(var2));
        }
        var3.method3191();
        if (var3.field1991) {
            var3.field1973 = 0;
            var3.field1987 = false;
        }
        field1954.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fm.p(I)V")
    public void method3191() {
        if (this.field1956 == -1) {
            this.field1956 = 0;
            if (this.field1960 != null && (this.field1961 == null || this.field1961[0] == 10)) {
                this.field1956 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1979[var1] != null) {
                    this.field1956 = 1;
                }
            }
        }
        if (this.field2002 == -1) {
            this.field2002 = this.field1973 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("fm.m(Lpi;B)V")
    public void method3201(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3207(arg0, var2);
        }
    }

    @ObfuscatedName("fm.t(Lpi;IB)V")
    public void method3207(class419 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6781();
            if (var3 > 0) {
                if (this.field1960 == null || field1970) {
                    this.field1961 = new int[var3];
                    this.field1960 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1960[var4] = arg0.method6672();
                        this.field1961[var4] = arg0.method6781();
                    }
                } else {
                    arg0.field4475 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1962 = arg0.method6707();
        } else if (arg1 == 5) {
            int var5 = arg0.method6781();
            if (var5 > 0) {
                if (this.field1960 == null || field1970) {
                    this.field1961 = null;
                    this.field1960 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1960[var6] = arg0.method6672();
                    }
                } else {
                    arg0.field4475 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1967 = arg0.method6781();
        } else if (arg1 == 15) {
            this.field1968 = arg0.method6781();
        } else if (arg1 == 17) {
            this.field1973 = 0;
            this.field1987 = false;
        } else if (arg1 == 18) {
            this.field1987 = false;
        } else if (arg1 == 19) {
            this.field1956 = arg0.method6781();
        } else if (arg1 == 21) {
            this.field1993 = 0;
        } else if (arg1 == 22) {
            this.field1965 = true;
        } else if (arg1 == 23) {
            this.field1974 = true;
        } else if (arg1 == 24) {
            this.field1964 = arg0.method6672();
            if (this.field1964 == 65535) {
                this.field1964 = -1;
            }
        } else if (arg1 == 27) {
            this.field1973 = 1;
        } else if (arg1 == 28) {
            this.field1976 = arg0.method6781();
        } else if (arg1 == 29) {
            this.field1971 = arg0.method6846();
        } else if (arg1 == 39) {
            this.field1978 = arg0.method6846() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1979[arg1 - 30] = arg0.method6707();
            if (this.field1979[arg1 - 30].equalsIgnoreCase(class295.field3472)) {
                this.field1979[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6781();
            this.field1963 = new short[var7];
            this.field1972 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1963[var8] = (short) arg0.method6672();
                this.field1972[var8] = (short) arg0.method6672();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6781();
            this.field1959 = new short[var9];
            this.field1966 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1959[var10] = (short) arg0.method6672();
                this.field1966[var10] = (short) arg0.method6672();
            }
        } else if (arg1 == 61) {
            arg0.method6672();
        } else if (arg1 == 62) {
            this.field1982 = true;
        } else if (arg1 == 64) {
            this.field1983 = false;
        } else if (arg1 == 65) {
            this.field1984 = arg0.method6672();
        } else if (arg1 == 66) {
            this.field1985 = arg0.method6672();
        } else if (arg1 == 67) {
            this.field1986 = arg0.method6672();
        } else if (arg1 == 68) {
            this.field1992 = arg0.method6672();
        } else if (arg1 == 69) {
            arg0.method6781();
        } else if (arg1 == 70) {
            this.field1998 = arg0.method6673();
        } else if (arg1 == 71) {
            this.field1988 = arg0.method6673();
        } else if (arg1 == 72) {
            this.field1969 = arg0.method6673();
        } else if (arg1 == 73) {
            this.field1990 = true;
        } else if (arg1 == 74) {
            this.field1991 = true;
        } else if (arg1 == 75) {
            this.field2002 = arg0.method6781();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1994 = arg0.method6672();
            if (this.field1994 == 65535) {
                this.field1994 = -1;
            }
            this.field1995 = arg0.method6672();
            if (this.field1995 == 65535) {
                this.field1995 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method6672();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6781();
            this.field1981 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1981[var15] = arg0.method6672();
                if (this.field1981[var15] == 65535) {
                    this.field1981[var15] = -1;
                }
            }
            this.field1981[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1996 = arg0.method6672();
            this.field1997 = arg0.method6781();
        } else if (arg1 == 79) {
            this.field1989 = arg0.method6672();
            this.field1999 = arg0.method6672();
            this.field1997 = arg0.method6781();
            int var11 = arg0.method6781();
            this.field2000 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2000[var12] = arg0.method6672();
            }
        } else if (arg1 == 81) {
            this.field1993 = arg0.method6781() * 256;
        } else if (arg1 == 82) {
            this.field1980 = arg0.method6672();
        } else if (arg1 == 89) {
            this.field2001 = false;
        } else if (arg1 == 249) {
            this.field1977 = class168.method399(arg0, this.field1977);
        }
    }

    @ObfuscatedName("fm.s(II)Z")
    public final boolean method3182(int arg0) {
        if (this.field1961 != null) {
            for (int var4 = 0; var4 < this.field1961.length; var4++) {
                if (this.field1961[var4] == arg0) {
                    return Statics.field1953.method5055(this.field1960[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1960 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1960.length; var3++) {
                var2 &= Statics.field1953.method5055(this.field1960[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fm.j(I)Z")
    public final boolean method3181() {
        if (this.field1960 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1960.length; var2++) {
            var1 &= Statics.field1953.method5055(this.field1960[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("fm.w(II[[IIIII)Lgt;")
    public final class198 method3186(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1961 == null) {
            var7 = (long) ((this.field1951 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1951 << 10) + (arg0 << 3) + arg1);
        }
        class198 var9 = (class198) field1975.method4514(var7);
        if (var9 == null) {
            class189 var10 = this.method3185(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1965) {
                var10.field2170 = (short) (this.field1971 + 64);
                var10.field2181 = (short) (this.field1978 + 768);
                var10.method3471();
                var9 = var10;
            } else {
                var9 = var10.method3450(this.field1971 + 64, this.field1978 + 768, -50, -10, -50);
            }
            field1975.method4515(var9, var7);
        }
        if (this.field1965) {
            var9 = ((class189) var9).method3435();
        }
        if (this.field1993 >= 0) {
            if (var9 instanceof class204) {
                var9 = ((class204) var9).method3867(arg2, arg3, arg4, arg5, true, this.field1993);
            } else if (var9 instanceof class189) {
                var9 = ((class189) var9).method3436(arg2, arg3, arg4, arg5, true, this.field1993);
            }
        }
        return var9;
    }

    @ObfuscatedName("fm.n(II[[IIIII)Lgo;")
    public final class204 method3183(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1961 == null) {
            var7 = (long) ((this.field1951 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1951 << 10) + (arg0 << 3) + arg1);
        }
        class204 var9 = (class204) field1957.method4514(var7);
        if (var9 == null) {
            class189 var10 = this.method3185(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3450(this.field1971 + 64, this.field1978 + 768, -50, -10, -50);
            field1957.method4515(var9, var7);
        }
        if (this.field1993 >= 0) {
            var9 = var9.method3867(arg2, arg3, arg4, arg5, true, this.field1993);
        }
        return var9;
    }

    @ObfuscatedName("fm.r(II[[IIIILgn;IB)Lgo;")
    public final class204 method3184(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class183 arg6, int arg7) {
        long var9;
        if (this.field1961 == null) {
            var9 = (long) ((this.field1951 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1951 << 10) + (arg0 << 3) + arg1);
        }
        class204 var11 = (class204) field1957.method4514(var9);
        if (var11 == null) {
            class189 var12 = this.method3185(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3450(this.field1971 + 64, this.field1978 + 768, -50, -10, -50);
            field1957.method4515(var11, var9);
        }
        if (arg6 == null && this.field1993 == -1) {
            return var11;
        }
        class204 var13;
        if (arg6 == null) {
            var13 = var11.method3868(true);
        } else {
            var13 = arg6.method3333(var11, arg7, arg1);
        }
        if (this.field1993 >= 0) {
            var13 = var13.method3867(arg2, arg3, arg4, arg5, false, this.field1993);
        }
        return var13;
    }

    @ObfuscatedName("fm.o(IIB)Lge;")
    public final class189 method3185(int arg0, int arg1) {
        class189 var3 = null;
        if (this.field1961 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1960 == null) {
                return null;
            }
            boolean var4 = this.field1982;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1960.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1960[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class189) field1955.method4514((long) var7);
                if (var3 == null) {
                    var3 = class189.method3427(Statics.field1953, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3445();
                    }
                    field1955.method4515(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1958[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class189(field1958, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1961.length; var9++) {
                if (this.field1961[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1960[var8];
            boolean var11 = this.field1982 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class189) field1955.method4514((long) var10);
            if (var3 == null) {
                var3 = class189.method3427(Statics.field1953, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3445();
                }
                field1955.method4515(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1984 == 128 && this.field1985 == 128 && this.field1986 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1998 == 0 && this.field1988 == 0 && this.field1969 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class189 var14 = new class189(var3, arg1 == 0 && !var12 && !var13, this.field1963 == null, this.field1959 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3441(256);
            var14.method3459(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3438();
        } else if (var15 == 2) {
            var14.method3439();
        } else if (var15 == 3) {
            var14.method3440();
        }
        if (this.field1963 != null) {
            for (int var16 = 0; var16 < this.field1963.length; var16++) {
                var14.method3443(this.field1963[var16], this.field1972[var16]);
            }
        }
        if (this.field1959 != null) {
            for (int var17 = 0; var17 < this.field1959.length; var17++) {
                var14.method3456(this.field1959[var17], this.field1966[var17]);
            }
        }
        if (var12) {
            var14.method3453(this.field1984, this.field1985, this.field1986);
        }
        if (var13) {
            var14.method3459(this.field1998, this.field1988, this.field1969);
        }
        return var14;
    }

    @ObfuscatedName("fm.v(I)Lfm;")
    public final class180 method3208() {
        int var1 = -1;
        if (this.field1994 != -1) {
            var1 = class276.method4820(this.field1994);
        } else if (this.field1995 != -1) {
            var1 = class276.field3185[this.field1995];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1981.length - 1) {
            var2 = this.field1981[var1];
        } else {
            var2 = this.field1981[this.field1981.length - 1];
        }
        return var2 == -1 ? null : method2760(var2);
    }

    @ObfuscatedName("fm.d(III)I")
    public int method3214(int arg0, int arg1) {
        return class168.method150(this.field1977, arg0, arg1);
    }

    @ObfuscatedName("fm.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3188(int arg0, String arg1) {
        return class168.method3632(this.field1977, arg0, arg1);
    }

    @ObfuscatedName("dm.g(I)V")
    public static void method2401() {
        field1954.method4518();
        field1955.method4518();
        field1975.method4518();
        field1957.method4518();
    }

    @ObfuscatedName("fm.e(I)Z")
    public boolean method3189() {
        if (this.field1981 == null) {
            return this.field1996 != -1 || this.field2000 != null;
        }
        for (int var1 = 0; var1 < this.field1981.length; var1++) {
            if (this.field1981[var1] != -1) {
                class180 var2 = method2760(this.field1981[var1]);
                if (var2.field1996 != -1 || var2.field2000 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
