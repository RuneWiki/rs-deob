package deob;

@ObfuscatedName("gu")
public class class185 extends class425 {

    @ObfuscatedName("gu.c")
    public static class266 field1966 = new class266(64);

    @ObfuscatedName("gu.x")
    public static class266 field1958 = new class266(50);

    @ObfuscatedName("gu.h")
    public int field1959;

    @ObfuscatedName("gu.j")
    public String field1960 = class323.field3774;

    @ObfuscatedName("gu.y")
    public int field1961 = 1;

    @ObfuscatedName("gu.d")
    public int[] field1982;

    @ObfuscatedName("gu.n")
    public int[] field1974;

    @ObfuscatedName("gu.r")
    public int field1964 = -1;

    @ObfuscatedName("gu.l")
    public int field1965 = -1;

    @ObfuscatedName("gu.s")
    public int field1963 = -1;

    @ObfuscatedName("gu.p")
    public int field1967 = -1;

    @ObfuscatedName("gu.b")
    public int field1968 = -1;

    @ObfuscatedName("gu.o")
    public int field1969 = -1;

    @ObfuscatedName("gu.u")
    public int field1970 = -1;

    @ObfuscatedName("gu.z")
    public int field1971 = -1;

    @ObfuscatedName("gu.t")
    public int field1985 = -1;

    @ObfuscatedName("gu.w")
    public int field1973 = -1;

    @ObfuscatedName("gu.m")
    public int field1955 = -1;

    @ObfuscatedName("gu.q")
    public int field1972 = -1;

    @ObfuscatedName("gu.i")
    public int field1976 = -1;

    @ObfuscatedName("gu.e")
    public int field1996 = -1;

    @ObfuscatedName("gu.g")
    public int field1993 = -1;

    @ObfuscatedName("gu.k")
    public short[] field1979;

    @ObfuscatedName("gu.v")
    public short[] field1980;

    @ObfuscatedName("gu.aj")
    public short[] field1962;

    @ObfuscatedName("gu.an")
    public short[] field1957;

    @ObfuscatedName("gu.ah")
    public String[] field1983 = new String[5];

    @ObfuscatedName("gu.ao")
    public boolean field1984 = true;

    @ObfuscatedName("gu.ac")
    public int field1990 = -1;

    @ObfuscatedName("gu.af")
    public int field1978 = 128;

    @ObfuscatedName("gu.ad")
    public int field1987 = 128;

    @ObfuscatedName("gu.av")
    public boolean field1988 = false;

    @ObfuscatedName("gu.ak")
    public int field1989 = 0;

    @ObfuscatedName("gu.ae")
    public int field1975 = 0;

    @ObfuscatedName("gu.ap")
    public int field1991 = -1;

    @ObfuscatedName("gu.as")
    public int field1998 = 32;

    @ObfuscatedName("gu.aq")
    public int[] field1977;

    @ObfuscatedName("gu.al")
    public int field1994 = -1;

    @ObfuscatedName("gu.ag")
    public int field1995 = -1;

    @ObfuscatedName("gu.am")
    public boolean field1981 = true;

    @ObfuscatedName("gu.az")
    public boolean field1997 = true;

    @ObfuscatedName("gu.ab")
    public boolean field1986 = false;

    @ObfuscatedName("gu.ai")
    public class440 field1999;

    @ObfuscatedName("fb.a(IB)Lgu;")
    public static class185 method3209(int arg0) {
        class185 var1 = (class185) field1966.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1992.method5859(9, arg0);
        class185 var3 = new class185();
        var3.field1959 = arg0;
        if (var2 != null) {
            var3.method3238(new class464(var2));
        }
        var3.method3237();
        field1966.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.f(I)V")
    public void method3237() {
    }

    @ObfuscatedName("gu.c(Lqr;B)V")
    public void method3238(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3239(arg0, var2);
        }
    }

    @ObfuscatedName("gu.x(Lqr;IB)V")
    public void method3239(class464 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7735();
            this.field1982 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1982[var4] = arg0.method7716();
            }
        } else if (arg1 == 2) {
            this.field1960 = arg0.method7725();
        } else if (arg1 == 12) {
            this.field1961 = arg0.method7735();
        } else if (arg1 == 13) {
            this.field1964 = arg0.method7716();
        } else if (arg1 == 14) {
            this.field1967 = arg0.method7716();
        } else if (arg1 == 15) {
            this.field1965 = arg0.method7716();
        } else if (arg1 == 16) {
            this.field1963 = arg0.method7716();
        } else if (arg1 == 17) {
            this.field1967 = arg0.method7716();
            this.field1968 = arg0.method7716();
            this.field1969 = arg0.method7716();
            this.field1970 = arg0.method7716();
        } else if (arg1 == 18) {
            arg0.method7716();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1983[arg1 - 30] = arg0.method7725();
            if (this.field1983[arg1 - 30].equalsIgnoreCase(class323.field3769)) {
                this.field1983[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7735();
            this.field1979 = new short[var5];
            this.field1980 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1979[var6] = (short) arg0.method7716();
                this.field1980[var6] = (short) arg0.method7716();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7735();
            this.field1962 = new short[var7];
            this.field1957 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1962[var8] = (short) arg0.method7716();
                this.field1957[var8] = (short) arg0.method7716();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7735();
            this.field1974 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1974[var10] = arg0.method7716();
            }
        } else if (arg1 == 93) {
            this.field1984 = false;
        } else if (arg1 == 95) {
            this.field1990 = arg0.method7716();
        } else if (arg1 == 97) {
            this.field1978 = arg0.method7716();
        } else if (arg1 == 98) {
            this.field1987 = arg0.method7716();
        } else if (arg1 == 99) {
            this.field1988 = true;
        } else if (arg1 == 100) {
            this.field1989 = arg0.method7881();
        } else if (arg1 == 101) {
            this.field1975 = arg0.method7881() * 5;
        } else if (arg1 == 102) {
            this.field1991 = arg0.method7716();
        } else if (arg1 == 103) {
            this.field1998 = arg0.method7716();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1994 = arg0.method7716();
            if (this.field1994 == 65535) {
                this.field1994 = -1;
            }
            this.field1995 = arg0.method7716();
            if (this.field1995 == 65535) {
                this.field1995 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method7716();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method7735();
            this.field1977 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1977[var13] = arg0.method7716();
                if (this.field1977[var13] == 65535) {
                    this.field1977[var13] = -1;
                }
            }
            this.field1977[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1981 = false;
        } else if (arg1 == 109) {
            this.field1997 = false;
        } else if (arg1 == 111) {
            this.field1986 = true;
        } else if (arg1 == 114) {
            this.field1971 = arg0.method7716();
        } else if (arg1 == 115) {
            this.field1971 = arg0.method7716();
            this.field1985 = arg0.method7716();
            this.field1973 = arg0.method7716();
            this.field1955 = arg0.method7716();
        } else if (arg1 == 116) {
            this.field1972 = arg0.method7716();
        } else if (arg1 == 117) {
            this.field1972 = arg0.method7716();
            this.field1976 = arg0.method7716();
            this.field1996 = arg0.method7716();
            this.field1993 = arg0.method7716();
        } else if (arg1 == 249) {
            this.field1999 = class182.method4112(arg0, this.field1999);
        }
    }

    @ObfuscatedName("gu.h(Lgg;ILgg;II)Lha;")
    public final class221 method3240(class197 arg0, int arg1, class197 arg2, int arg3) {
        if (this.field1977 != null) {
            class185 var5 = this.method3242();
            return var5 == null ? null : var5.method3240(arg0, arg1, arg2, arg3);
        }
        class221 var6 = (class221) field1958.method4839((long) this.field1959);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1982.length; var8++) {
                if (!Statics.field1956.method5784(this.field1982[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class206[] var9 = new class206[this.field1982.length];
            for (int var10 = 0; var10 < this.field1982.length; var10++) {
                var9[var10] = class206.method3710(Statics.field1956, this.field1982[var10], 0);
            }
            class206 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class206(var9, var9.length);
            }
            if (this.field1979 != null) {
                for (int var12 = 0; var12 < this.field1979.length; var12++) {
                    var11.method3726(this.field1979[var12], this.field1980[var12]);
                }
            }
            if (this.field1962 != null) {
                for (int var13 = 0; var13 < this.field1962.length; var13++) {
                    var11.method3727(this.field1962[var13], this.field1957[var13]);
                }
            }
            var6 = var11.method3732(this.field1989 + 64, this.field1975 + 850, -30, -50, -30);
            field1958.method4834(var6, (long) this.field1959);
        }
        class221 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3562(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3569(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4154(true);
        } else {
            var14 = arg2.method3569(var6, arg3);
        }
        if (this.field1978 != 128 || this.field1987 != 128) {
            var14.method4227(this.field1978, this.field1987, this.field1978);
        }
        return var14;
    }

    @ObfuscatedName("gu.j(B)Lgs;")
    public final class206 method3270() {
        if (this.field1977 != null) {
            class185 var1 = this.method3242();
            return var1 == null ? null : var1.method3270();
        } else if (this.field1974 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1974.length; var3++) {
                if (!Statics.field1956.method5784(this.field1974[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class206[] var4 = new class206[this.field1974.length];
            for (int var5 = 0; var5 < this.field1974.length; var5++) {
                var4[var5] = class206.method3710(Statics.field1956, this.field1974[var5], 0);
            }
            class206 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class206(var4, var4.length);
            }
            if (this.field1979 != null) {
                for (int var7 = 0; var7 < this.field1979.length; var7++) {
                    var6.method3726(this.field1979[var7], this.field1980[var7]);
                }
            }
            if (this.field1962 != null) {
                for (int var8 = 0; var8 < this.field1962.length; var8++) {
                    var6.method3727(this.field1962[var8], this.field1957[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gu.y(B)Lgu;")
    public final class185 method3242() {
        int var1 = -1;
        if (this.field1994 != -1) {
            var1 = class293.method1999(this.field1994);
        } else if (this.field1995 != -1) {
            var1 = class293.field3391[this.field1995];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1977.length - 1) {
            var2 = this.field1977[var1];
        } else {
            var2 = this.field1977[this.field1977.length - 1];
        }
        return var2 == -1 ? null : method3209(var2);
    }

    @ObfuscatedName("gu.d(B)Z")
    public boolean method3255() {
        if (this.field1977 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1994 != -1) {
            var1 = class293.method1999(this.field1994);
        } else if (this.field1995 != -1) {
            var1 = class293.field3391[this.field1995];
        }
        if (var1 >= 0 && var1 < this.field1977.length) {
            return this.field1977[var1] != -1;
        } else {
            return this.field1977[this.field1977.length - 1] != -1;
        }
    }

    @ObfuscatedName("gu.n(III)I")
    public int method3244(int arg0, int arg1) {
        class440 var3 = this.field1999;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class429 var5 = (class429) var3.method7455((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4634;
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3245(int arg0, String arg1) {
        return class182.method6701(this.field1999, arg0, arg1);
    }

    @ObfuscatedName("w.l(B)V")
    public static void method263() {
        field1966.method4837();
        field1958.method4837();
    }
}
