package deob;

@ObfuscatedName("ho")
public class class190 extends class488 {

    @ObfuscatedName("ho.ai")
    public static class304 field1966 = new class304(64);

    @ObfuscatedName("ho.ar")
    public static class304 field1978 = new class304(50);

    @ObfuscatedName("ho.as")
    public int field1968;

    @ObfuscatedName("ho.aa")
    public String field1969 = class370.field4015;

    @ObfuscatedName("ho.az")
    public int field1986 = 1;

    @ObfuscatedName("ho.ao")
    public int[] field1971;

    @ObfuscatedName("ho.au")
    public int[] field1995;

    @ObfuscatedName("ho.ak")
    public int field1973 = -1;

    @ObfuscatedName("ho.ah")
    public int field2003 = -1;

    @ObfuscatedName("ho.aj")
    public int field1975 = -1;

    @ObfuscatedName("ho.af")
    public int field1976 = -1;

    @ObfuscatedName("ho.ax")
    public int field1977 = -1;

    @ObfuscatedName("ho.an")
    public int field1972 = -1;

    @ObfuscatedName("ho.ag")
    public int field1991 = -1;

    @ObfuscatedName("ho.am")
    public int field1980 = -1;

    @ObfuscatedName("ho.ad")
    public int field1981 = -1;

    @ObfuscatedName("ho.at")
    public int field1988 = -1;

    @ObfuscatedName("ho.ay")
    public int field1983 = -1;

    @ObfuscatedName("ho.ae")
    public int field1984 = -1;

    @ObfuscatedName("ho.ac")
    public int field1967 = -1;

    @ObfuscatedName("ho.ab")
    public int field1985 = -1;

    @ObfuscatedName("ho.av")
    public int field1987 = -1;

    @ObfuscatedName("ho.ap")
    public short[] field1999;

    @ObfuscatedName("ho.bu")
    public short[] field1970;

    @ObfuscatedName("ho.bo")
    public short[] field1990;

    @ObfuscatedName("ho.bd")
    public short[] field1974;

    @ObfuscatedName("ho.bi")
    public String[] field1992 = new String[5];

    @ObfuscatedName("ho.bq")
    public boolean field1963 = true;

    @ObfuscatedName("ho.ba")
    public int field1994 = -1;

    @ObfuscatedName("ho.bt")
    public int field1997 = 128;

    @ObfuscatedName("ho.bk")
    public int field1996 = 128;

    @ObfuscatedName("ho.bm")
    public boolean field1989 = false;

    @ObfuscatedName("ho.bw")
    public int field1979 = 0;

    @ObfuscatedName("ho.bv")
    public int field1993 = 0;

    @ObfuscatedName("ho.by")
    public int field1998 = 32;

    @ObfuscatedName("ho.bb")
    public int[] field2001;

    @ObfuscatedName("ho.bn")
    public int field2002 = -1;

    @ObfuscatedName("ho.br")
    public int field1982 = -1;

    @ObfuscatedName("ho.bp")
    public boolean field2004 = true;

    @ObfuscatedName("ho.bf")
    public boolean field2005 = true;

    @ObfuscatedName("ho.bg")
    public boolean field2006 = false;

    @ObfuscatedName("ho.be")
    public boolean field2007 = false;

    @ObfuscatedName("ho.bc")
    public int[] field2000 = null;

    @ObfuscatedName("ho.bz")
    public short[] field2009 = null;

    @ObfuscatedName("ho.bh")
    public class507 field2010;

    @ObfuscatedName("gu.aq(II)Lho;")
    public static class190 method3274(int arg0) {
        class190 var1 = (class190) field1966.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1964.method6489(9, arg0);
        class190 var3 = new class190();
        var3.field1968 = arg0;
        if (var2 != null) {
            var3.method3370(new class534(var2));
        }
        var3.method3369();
        field1966.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.aw(I)V")
    public void method3369() {
    }

    @ObfuscatedName("ho.al(Luq;B)V")
    public void method3370(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3429(arg0, var2);
        }
    }

    @ObfuscatedName("ho.ai(Luq;II)V")
    public void method3429(class534 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8591();
            this.field1971 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1971[var4] = arg0.method8593();
            }
        } else if (arg1 == 2) {
            this.field1969 = arg0.method8741();
        } else if (arg1 == 12) {
            this.field1986 = arg0.method8591();
        } else if (arg1 == 13) {
            this.field1973 = arg0.method8593();
        } else if (arg1 == 14) {
            this.field1976 = arg0.method8593();
        } else if (arg1 == 15) {
            this.field2003 = arg0.method8593();
        } else if (arg1 == 16) {
            this.field1975 = arg0.method8593();
        } else if (arg1 == 17) {
            this.field1976 = arg0.method8593();
            this.field1977 = arg0.method8593();
            this.field1972 = arg0.method8593();
            this.field1991 = arg0.method8593();
        } else if (arg1 == 18) {
            arg0.method8593();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1992[arg1 - 30] = arg0.method8741();
            if (this.field1992[arg1 - 30].equalsIgnoreCase(class370.field4010)) {
                this.field1992[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8591();
            this.field1999 = new short[var5];
            this.field1970 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1999[var6] = (short) arg0.method8593();
                this.field1970[var6] = (short) arg0.method8593();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8591();
            this.field1990 = new short[var7];
            this.field1974 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1990[var8] = (short) arg0.method8593();
                this.field1974[var8] = (short) arg0.method8593();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8591();
            this.field1995 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1995[var10] = arg0.method8593();
            }
        } else if (arg1 == 93) {
            this.field1963 = false;
        } else if (arg1 == 95) {
            this.field1994 = arg0.method8593();
        } else if (arg1 == 97) {
            this.field1997 = arg0.method8593();
        } else if (arg1 == 98) {
            this.field1996 = arg0.method8593();
        } else if (arg1 == 99) {
            this.field1989 = true;
        } else if (arg1 == 100) {
            this.field1979 = arg0.method8592();
        } else if (arg1 == 101) {
            this.field1993 = arg0.method8592() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method8591();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2000 = new int[var12];
            this.field2009 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2000[var14] = -1;
                    this.field2009[var14] = -1;
                } else {
                    this.field2000[var14] = arg0.method8811();
                    this.field2009[var14] = (short) arg0.method8608();
                }
            }
        } else if (arg1 == 103) {
            this.field1998 = arg0.method8593();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2002 = arg0.method8593();
            if (this.field2002 == 65535) {
                this.field2002 = -1;
            }
            this.field1982 = arg0.method8593();
            if (this.field1982 == 65535) {
                this.field1982 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8593();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8591();
            this.field2001 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2001[var17] = arg0.method8593();
                if (this.field2001[var17] == 65535) {
                    this.field2001[var17] = -1;
                }
            }
            this.field2001[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2004 = false;
        } else if (arg1 == 109) {
            this.field2005 = false;
        } else if (arg1 == 114) {
            this.field1980 = arg0.method8593();
        } else if (arg1 == 115) {
            this.field1980 = arg0.method8593();
            this.field1981 = arg0.method8593();
            this.field1988 = arg0.method8593();
            this.field1983 = arg0.method8593();
        } else if (arg1 == 116) {
            this.field1984 = arg0.method8593();
        } else if (arg1 == 117) {
            this.field1984 = arg0.method8593();
            this.field1967 = arg0.method8593();
            this.field1985 = arg0.method8593();
            this.field1987 = arg0.method8593();
        } else if (arg1 == 122) {
            this.field2006 = true;
        } else if (arg1 == 123) {
            this.field2007 = true;
        } else if (arg1 == 249) {
            this.field2010 = class183.method5700(arg0, this.field2010);
        }
    }

    @ObfuscatedName("ho.ar(Lhs;ILhs;ILht;I)Lkz;")
    public final class285 method3372(class207 arg0, int arg1, class207 arg2, int arg3, class189 arg4) {
        if (this.field2001 != null) {
            class190 var6 = this.method3398();
            return var6 == null ? null : var6.method3372(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field1968;
        if (arg4 != null) {
            var7 |= arg4.field1961 << 16;
        }
        class285 var9 = (class285) field1978.method5414(var7);
        if (var9 == null) {
            class267 var10 = this.method3407(this.field1971, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4723(this.field1979 + 64, this.field1993 + 850, -30, -50, -30);
            field1978.method5421(var9, var7);
        }
        class285 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3728(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3725(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method5150(true);
        } else {
            var11 = arg2.method3725(var9, arg3);
        }
        if (this.field1997 != 128 || this.field1996 != 128) {
            var11.method5171(this.field1997, this.field1996, this.field1997);
        }
        return var11;
    }

    @ObfuscatedName("ho.as(Lht;B)Lkf;")
    public final class267 method3373(class189 arg0) {
        if (this.field2001 == null) {
            return this.method3407(this.field1995, arg0);
        } else {
            class190 var2 = this.method3398();
            return var2 == null ? null : var2.method3373(arg0);
        }
    }

    @ObfuscatedName("ho.aa([ILht;I)Lkf;")
    public class267 method3407(int[] arg0, class189 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1959 != null) {
            var3 = arg1.field1959;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1965.method6420(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class267[] var6 = new class267[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class267.method4644(Statics.field1965, var3[var7], 0);
        }
        class267 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class267(var6, var6.length);
            }
        } else {
            var8 = new class267(var6, var6.length);
        }
        if (this.field1999 != null) {
            short[] var9 = this.field1970;
            if (arg1 != null && arg1.field1958 != null) {
                var9 = arg1.field1958;
            }
            for (int var10 = 0; var10 < this.field1999.length; var10++) {
                var8.method4664(this.field1999[var10], var9[var10]);
            }
        }
        if (this.field1990 != null) {
            short[] var11 = this.field1974;
            if (arg1 != null && arg1.field1960 != null) {
                var11 = arg1.field1960;
            }
            for (int var12 = 0; var12 < this.field1990.length; var12++) {
                var8.method4666(this.field1990[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("ho.az(B)Lho;")
    public final class190 method3398() {
        int var1 = -1;
        if (this.field2002 != -1) {
            var1 = class338.method5735(this.field2002);
        } else if (this.field1982 != -1) {
            var1 = class338.field3620[this.field1982];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2001.length - 1) {
            var2 = this.field2001[var1];
        } else {
            var2 = this.field2001[this.field2001.length - 1];
        }
        return var2 == -1 ? null : method3274(var2);
    }

    @ObfuscatedName("ho.ao(S)Z")
    public boolean method3389() {
        if (this.field2001 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2002 != -1) {
            var1 = class338.method5735(this.field2002);
        } else if (this.field1982 != -1) {
            var1 = class338.field3620[this.field1982];
        }
        if (var1 >= 0 && var1 < this.field2001.length) {
            return this.field2001[var1] != -1;
        } else {
            return this.field2001[this.field2001.length - 1] != -1;
        }
    }

    @ObfuscatedName("ho.au(III)I")
    public int method3377(int arg0, int arg1) {
        class507 var3 = this.field2010;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class491 var5 = (class491) var3.method8299((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4917;
            }
        }
        return var4;
    }

    @ObfuscatedName("ho.ak(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3378(int arg0, String arg1) {
        class507 var3 = this.field2010;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class489 var5 = (class489) var3.method8299((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4915;
            }
        }
        return var4;
    }

    @ObfuscatedName("md.ah(B)V")
    public static void method5724() {
        field1966.method5418();
        field1978.method5418();
    }

    @ObfuscatedName("ho.aj(I)Z")
    public boolean method3380() {
        return this.field2000 != null && this.field2009 != null;
    }

    @ObfuscatedName("ho.af(I)[I")
    public int[] method3371() {
        return this.field2000;
    }

    @ObfuscatedName("ho.ax(II)I")
    public int method3374(int arg0) {
        return this.field2000 == null || arg0 >= this.field2000.length ? -1 : this.field2000[arg0];
    }

    @ObfuscatedName("ho.an(I)[S")
    public short[] method3414() {
        return this.field2009;
    }

    @ObfuscatedName("ho.ag(IS)S")
    public short method3383(int arg0) {
        return this.field2009 == null || arg0 >= this.field2009.length ? -1 : this.field2009[arg0];
    }
}
