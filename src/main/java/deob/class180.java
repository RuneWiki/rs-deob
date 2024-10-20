package deob;

@ObfuscatedName("fg")
public class class180 extends class387 {

    @ObfuscatedName("fg.c")
    public static boolean field1992 = false;

    @ObfuscatedName("fg.e")
    public static class249 field1993 = new class249(4096);

    @ObfuscatedName("fg.r")
    public static class249 field1972 = new class249(500);

    @ObfuscatedName("fg.o")
    public static class249 field1973 = new class249(30);

    @ObfuscatedName("fg.i")
    public static class249 field1974 = new class249(30);

    @ObfuscatedName("fg.w")
    public static class189[] field1975 = new class189[4];

    @ObfuscatedName("fg.v")
    public int field1976;

    @ObfuscatedName("fg.a")
    public int[] field2007;

    @ObfuscatedName("fg.y")
    public int[] field1978;

    @ObfuscatedName("fg.u")
    public String field2003 = class300.field3605;

    @ObfuscatedName("fg.h")
    public short[] field1987;

    @ObfuscatedName("fg.q")
    public short[] field2009;

    @ObfuscatedName("fg.x")
    public short[] field1982;

    @ObfuscatedName("fg.p")
    public short[] field2017;

    @ObfuscatedName("fg.n")
    public int field1995 = 1;

    @ObfuscatedName("fg.m")
    public int field1985 = 1;

    @ObfuscatedName("fg.d")
    public int field1996 = 2;

    @ObfuscatedName("fg.j")
    public boolean field1983 = true;

    @ObfuscatedName("fg.f")
    public int field1984 = -1;

    @ObfuscatedName("fg.g")
    public int field1989 = -1;

    @ObfuscatedName("fg.t")
    public boolean field1990 = false;

    @ObfuscatedName("fg.k")
    public boolean field1991 = false;

    @ObfuscatedName("fg.b")
    public int field1969 = -1;

    @ObfuscatedName("fg.z")
    public int field1986 = 16;

    @ObfuscatedName("fg.ap")
    public int field1994 = 0;

    @ObfuscatedName("fg.af")
    public int field2000 = 0;

    @ObfuscatedName("fg.ak")
    public String[] field1981 = new String[5];

    @ObfuscatedName("fg.av")
    public int field1997 = -1;

    @ObfuscatedName("fg.ar")
    public int field1998 = -1;

    @ObfuscatedName("fg.al")
    public boolean field1999 = false;

    @ObfuscatedName("fg.aa")
    public boolean field1979 = true;

    @ObfuscatedName("fg.ao")
    public int field2001 = 128;

    @ObfuscatedName("fg.aq")
    public int field2002 = 128;

    @ObfuscatedName("fg.ay")
    public int field1977 = 128;

    @ObfuscatedName("fg.ac")
    public int field2004 = 0;

    @ObfuscatedName("fg.ab")
    public int field2005 = 0;

    @ObfuscatedName("fg.as")
    public int field2006 = 0;

    @ObfuscatedName("fg.ag")
    public boolean field2008 = false;

    @ObfuscatedName("fg.az")
    public boolean field2019 = false;

    @ObfuscatedName("fg.ad")
    public int field1988 = -1;

    @ObfuscatedName("fg.au")
    public int[] field2010;

    @ObfuscatedName("fg.at")
    public int field2011 = -1;

    @ObfuscatedName("fg.ae")
    public int field2012 = -1;

    @ObfuscatedName("fg.an")
    public int field2013 = -1;

    @ObfuscatedName("fg.aw")
    public int field2014 = 0;

    @ObfuscatedName("fg.aj")
    public int field2015 = 0;

    @ObfuscatedName("fg.ax")
    public int field2016 = 0;

    @ObfuscatedName("fg.ah")
    public int[] field1980;

    @ObfuscatedName("fg.ai")
    public boolean field2018 = true;

    @ObfuscatedName("fg.am")
    public class401 field1970;

    @ObfuscatedName("fl.l(IB)Lfg;")
    public static class180 method3056(int arg0) {
        class180 var1 = (class180) field1993.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field73.method5066(6, arg0);
        class180 var3 = new class180();
        var3.field1976 = arg0;
        if (var2 != null) {
            var3.method3179(new class421(var2));
        }
        var3.method3143();
        if (var3.field2019) {
            var3.field1996 = 0;
            var3.field1983 = false;
        }
        field1993.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fg.s(B)V")
    public void method3143() {
        if (this.field1984 == -1) {
            this.field1984 = 0;
            if (this.field2007 != null && (this.field1978 == null || this.field1978[0] == 10)) {
                this.field1984 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1981[var1] != null) {
                    this.field1984 = 1;
                }
            }
        }
        if (this.field1988 == -1) {
            this.field1988 = this.field1996 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("fg.e(Lpi;I)V")
    public void method3179(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3144(arg0, var2);
        }
    }

    @ObfuscatedName("fg.r(Lpi;II)V")
    public void method3144(class421 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6686();
            if (var3 > 0) {
                if (this.field2007 == null || field1992) {
                    this.field1978 = new int[var3];
                    this.field2007 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2007[var4] = arg0.method6666();
                        this.field1978[var4] = arg0.method6686();
                    }
                } else {
                    arg0.field4512 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2003 = arg0.method6674();
        } else if (arg1 == 5) {
            int var5 = arg0.method6686();
            if (var5 > 0) {
                if (this.field2007 == null || field1992) {
                    this.field1978 = null;
                    this.field2007 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2007[var6] = arg0.method6666();
                    }
                } else {
                    arg0.field4512 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1995 = arg0.method6686();
        } else if (arg1 == 15) {
            this.field1985 = arg0.method6686();
        } else if (arg1 == 17) {
            this.field1996 = 0;
            this.field1983 = false;
        } else if (arg1 == 18) {
            this.field1983 = false;
        } else if (arg1 == 19) {
            this.field1984 = arg0.method6686();
        } else if (arg1 == 21) {
            this.field1989 = 0;
        } else if (arg1 == 22) {
            this.field1990 = true;
        } else if (arg1 == 23) {
            this.field1991 = true;
        } else if (arg1 == 24) {
            this.field1969 = arg0.method6666();
            if (this.field1969 == 65535) {
                this.field1969 = -1;
            }
        } else if (arg1 == 27) {
            this.field1996 = 1;
        } else if (arg1 == 28) {
            this.field1986 = arg0.method6686();
        } else if (arg1 == 29) {
            this.field1994 = arg0.method6664();
        } else if (arg1 == 39) {
            this.field2000 = arg0.method6664() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1981[arg1 - 30] = arg0.method6674();
            if (this.field1981[arg1 - 30].equalsIgnoreCase(class300.field3527)) {
                this.field1981[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6686();
            this.field1987 = new short[var7];
            this.field2009 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1987[var8] = (short) arg0.method6666();
                this.field2009[var8] = (short) arg0.method6666();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6686();
            this.field1982 = new short[var9];
            this.field2017 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1982[var10] = (short) arg0.method6666();
                this.field2017[var10] = (short) arg0.method6666();
            }
        } else if (arg1 == 61) {
            arg0.method6666();
        } else if (arg1 == 62) {
            this.field1999 = true;
        } else if (arg1 == 64) {
            this.field1979 = false;
        } else if (arg1 == 65) {
            this.field2001 = arg0.method6666();
        } else if (arg1 == 66) {
            this.field2002 = arg0.method6666();
        } else if (arg1 == 67) {
            this.field1977 = arg0.method6666();
        } else if (arg1 == 68) {
            this.field1998 = arg0.method6666();
        } else if (arg1 == 69) {
            arg0.method6686();
        } else if (arg1 == 70) {
            this.field2004 = arg0.method6830();
        } else if (arg1 == 71) {
            this.field2005 = arg0.method6830();
        } else if (arg1 == 72) {
            this.field2006 = arg0.method6830();
        } else if (arg1 == 73) {
            this.field2008 = true;
        } else if (arg1 == 74) {
            this.field2019 = true;
        } else if (arg1 == 75) {
            this.field1988 = arg0.method6686();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2011 = arg0.method6666();
            if (this.field2011 == 65535) {
                this.field2011 = -1;
            }
            this.field2012 = arg0.method6666();
            if (this.field2012 == 65535) {
                this.field2012 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method6666();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6686();
            this.field2010 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2010[var15] = arg0.method6666();
                if (this.field2010[var15] == 65535) {
                    this.field2010[var15] = -1;
                }
            }
            this.field2010[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2013 = arg0.method6666();
            this.field2014 = arg0.method6686();
        } else if (arg1 == 79) {
            this.field2015 = arg0.method6666();
            this.field2016 = arg0.method6666();
            this.field2014 = arg0.method6686();
            int var11 = arg0.method6686();
            this.field1980 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1980[var12] = arg0.method6666();
            }
        } else if (arg1 == 81) {
            this.field1989 = arg0.method6686() * 256;
        } else if (arg1 == 82) {
            this.field1997 = arg0.method6666();
        } else if (arg1 == 89) {
            this.field2018 = false;
        } else if (arg1 == 249) {
            this.field1970 = class168.method4950(arg0, this.field1970);
        }
    }

    @ObfuscatedName("fg.o(II)Z")
    public final boolean method3159(int arg0) {
        if (this.field1978 != null) {
            for (int var4 = 0; var4 < this.field1978.length; var4++) {
                if (this.field1978[var4] == arg0) {
                    return Statics.field1971.method5057(this.field2007[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2007 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2007.length; var3++) {
                var2 &= Statics.field1971.method5057(this.field2007[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fg.i(I)Z")
    public final boolean method3191() {
        if (this.field2007 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2007.length; var2++) {
            var1 &= Statics.field1971.method5057(this.field2007[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("fg.w(II[[IIIII)Lgp;")
    public final class198 method3147(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1978 == null) {
            var7 = (long) ((this.field1976 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1976 << 10) + (arg0 << 3) + arg1);
        }
        class198 var9 = (class198) field1973.method4472(var7);
        if (var9 == null) {
            class189 var10 = this.method3150(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1990) {
                var10.field2186 = (short) (this.field1994 + 64);
                var10.field2197 = (short) (this.field2000 + 768);
                var10.method3389();
                var9 = var10;
            } else {
                var9 = var10.method3396(this.field1994 + 64, this.field2000 + 768, -50, -10, -50);
            }
            field1973.method4482(var9, var7);
        }
        if (this.field1990) {
            var9 = ((class189) var9).method3382();
        }
        if (this.field1989 >= 0) {
            if (var9 instanceof class204) {
                var9 = ((class204) var9).method3876(arg2, arg3, arg4, arg5, true, this.field1989);
            } else if (var9 instanceof class189) {
                var9 = ((class189) var9).method3383(arg2, arg3, arg4, arg5, true, this.field1989);
            }
        }
        return var9;
    }

    @ObfuscatedName("fg.v(II[[IIIIB)Lgf;")
    public final class204 method3148(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1978 == null) {
            var7 = (long) ((this.field1976 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1976 << 10) + (arg0 << 3) + arg1);
        }
        class204 var9 = (class204) field1974.method4472(var7);
        if (var9 == null) {
            class189 var10 = this.method3150(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3396(this.field1994 + 64, this.field2000 + 768, -50, -10, -50);
            field1974.method4482(var9, var7);
        }
        if (this.field1989 >= 0) {
            var9 = var9.method3876(arg2, arg3, arg4, arg5, true, this.field1989);
        }
        return var9;
    }

    @ObfuscatedName("fg.a(II[[IIIILgm;IB)Lgf;")
    public final class204 method3181(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class183 arg6, int arg7) {
        long var9;
        if (this.field1978 == null) {
            var9 = (long) ((this.field1976 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1976 << 10) + (arg0 << 3) + arg1);
        }
        class204 var11 = (class204) field1974.method4472(var9);
        if (var11 == null) {
            class189 var12 = this.method3150(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3396(this.field1994 + 64, this.field2000 + 768, -50, -10, -50);
            field1974.method4482(var11, var9);
        }
        if (arg6 == null && this.field1989 == -1) {
            return var11;
        }
        class204 var13;
        if (arg6 == null) {
            var13 = var11.method3844(true);
        } else {
            var13 = arg6.method3279(var11, arg7, arg1);
        }
        if (this.field1989 >= 0) {
            var13 = var13.method3876(arg2, arg3, arg4, arg5, false, this.field1989);
        }
        return var13;
    }

    @ObfuscatedName("fg.y(III)Lgq;")
    public final class189 method3150(int arg0, int arg1) {
        class189 var3 = null;
        if (this.field1978 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2007 == null) {
                return null;
            }
            boolean var4 = this.field1999;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2007.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2007[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class189) field1972.method4472((long) var7);
                if (var3 == null) {
                    var3 = class189.method3374(Statics.field1971, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3408();
                    }
                    field1972.method4482(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1975[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class189(field1975, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1978.length; var9++) {
                if (this.field1978[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2007[var8];
            boolean var11 = this.field1999 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class189) field1972.method4472((long) var10);
            if (var3 == null) {
                var3 = class189.method3374(Statics.field1971, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3408();
                }
                field1972.method4482(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2001 == 128 && this.field2002 == 128 && this.field1977 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2004 == 0 && this.field2005 == 0 && this.field2006 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class189 var14 = new class189(var3, arg1 == 0 && !var12 && !var13, this.field1987 == null, this.field1982 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3392(256);
            var14.method3390(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3385();
        } else if (var15 == 2) {
            var14.method3386();
        } else if (var15 == 3) {
            var14.method3409();
        }
        if (this.field1987 != null) {
            for (int var16 = 0; var16 < this.field1987.length; var16++) {
                var14.method3380(this.field1987[var16], this.field2009[var16]);
            }
        }
        if (this.field1982 != null) {
            for (int var17 = 0; var17 < this.field1982.length; var17++) {
                var14.method3404(this.field1982[var17], this.field2017[var17]);
            }
        }
        if (var12) {
            var14.method3391(this.field2001, this.field2002, this.field1977);
        }
        if (var13) {
            var14.method3390(this.field2004, this.field2005, this.field2006);
        }
        return var14;
    }

    @ObfuscatedName("fg.u(I)Lfg;")
    public final class180 method3151() {
        int var1 = -1;
        if (this.field2011 != -1) {
            var1 = class281.method6117(this.field2011);
        } else if (this.field2012 != -1) {
            var1 = class281.field3224[this.field2012];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2010.length - 1) {
            var2 = this.field2010[var1];
        } else {
            var2 = this.field2010[this.field2010.length - 1];
        }
        return var2 == -1 ? null : method3056(var2);
    }

    @ObfuscatedName("fg.h(IIB)I")
    public int method3152(int arg0, int arg1) {
        return class168.method6932(this.field1970, arg0, arg1);
    }

    @ObfuscatedName("fg.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3153(int arg0, String arg1) {
        return class168.method4942(this.field1970, arg0, arg1);
    }

    @ObfuscatedName("g.x(B)V")
    public static void method297() {
        field1993.method4475();
        field1972.method4475();
        field1973.method4475();
        field1974.method4475();
    }

    @ObfuscatedName("fg.p(I)Z")
    public boolean method3162() {
        if (this.field2010 == null) {
            return this.field2013 != -1 || this.field1980 != null;
        }
        for (int var1 = 0; var1 < this.field2010.length; var1++) {
            if (this.field2010[var1] != -1) {
                class180 var2 = method3056(this.field2010[var1]);
                if (var2.field2013 != -1 || var2.field1980 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
