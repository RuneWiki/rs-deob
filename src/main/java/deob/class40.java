package deob;

@ObfuscatedName("af")
public class class40 extends class175 {

    @ObfuscatedName("af.w")
    public static class171 field972 = new class171(64);

    @ObfuscatedName("af.r")
    public static class171 field977 = new class171(50);

    @ObfuscatedName("af.k")
    public static class171 field974 = new class171(100);

    @ObfuscatedName("af.g")
    public int field976;

    @ObfuscatedName("af.n")
    public int field969;

    @ObfuscatedName("af.j")
    public String field1010 = "null";

    @ObfuscatedName("af.c")
    public short[] field979;

    @ObfuscatedName("af.m")
    public short[] field973;

    @ObfuscatedName("af.a")
    public short[] field981;

    @ObfuscatedName("af.e")
    public short[] field982;

    @ObfuscatedName("af.q")
    public int field988 = 2000;

    @ObfuscatedName("af.y")
    public int field984 = 0;

    @ObfuscatedName("af.v")
    public int field985 = 0;

    @ObfuscatedName("af.s")
    public int field986 = 0;

    @ObfuscatedName("af.u")
    public int field980 = 0;

    @ObfuscatedName("af.d")
    public int field1019 = 0;

    @ObfuscatedName("af.i")
    public int field989 = 0;

    @ObfuscatedName("af.p")
    public int field990 = 1;

    @ObfuscatedName("af.h")
    public boolean field991 = false;

    @ObfuscatedName("af.f")
    public String[] field994 = new String[] { null, null, class136.field2091, null, null };

    @ObfuscatedName("af.t")
    public String[] field993 = new String[] { null, null, null, null, class136.field2200 };

    @ObfuscatedName("af.x")
    public int field978 = -1;

    @ObfuscatedName("af.ar")
    public int field1008 = -1;

    @ObfuscatedName("af.au")
    public int field996 = 0;

    @ObfuscatedName("af.an")
    public int field997 = -1;

    @ObfuscatedName("af.ad")
    public int field992 = -1;

    @ObfuscatedName("af.at")
    public int field999 = 0;

    @ObfuscatedName("af.ay")
    public int field1000 = -1;

    @ObfuscatedName("af.ac")
    public int field1013 = -1;

    @ObfuscatedName("af.av")
    public int field1002 = -1;

    @ObfuscatedName("af.ae")
    public int field1003 = -1;

    @ObfuscatedName("af.ah")
    public int field998 = -1;

    @ObfuscatedName("af.aq")
    public int field1005 = -1;

    @ObfuscatedName("af.ax")
    public int[] field1006;

    @ObfuscatedName("af.am")
    public int[] field1007;

    @ObfuscatedName("af.af")
    public int field987 = -1;

    @ObfuscatedName("af.ao")
    public int field1009 = -1;

    @ObfuscatedName("af.ab")
    public int field983 = 128;

    @ObfuscatedName("af.aj")
    public int field1011 = 128;

    @ObfuscatedName("af.ag")
    public int field995 = 128;

    @ObfuscatedName("af.aw")
    public int field1004 = 0;

    @ObfuscatedName("af.az")
    public int field1014 = 0;

    @ObfuscatedName("af.al")
    public int field1015 = 0;

    @ObfuscatedName("bb.l(II)Laf;")
    public static class40 method1243(int arg0) {
        class40 var1 = (class40) field972.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1017.method3029(10, arg0);
        class40 var3 = new class40();
        var3.field976 = arg0;
        if (var2 != null) {
            var3.method849(new class127(var2));
        }
        var3.method851();
        if (var3.field1009 != -1) {
            var3.method842(method1243(var3.field1009), method1243(var3.field987));
        }
        if (!Statics.field971 && var3.field991) {
            var3.field1010 = class136.field2110;
            var3.field994 = null;
            var3.field993 = null;
            var3.field1015 = 0;
        }
        field972.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.b(I)V")
    public void method851() {
    }

    @ObfuscatedName("af.o(Ldm;B)V")
    public void method849(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("af.w(Ldm;II)V")
    public void method841(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field969 = arg0.method2442();
        } else if (arg1 == 2) {
            this.field1010 = arg0.method2471();
        } else if (arg1 == 4) {
            this.field988 = arg0.method2442();
        } else if (arg1 == 5) {
            this.field984 = arg0.method2442();
        } else if (arg1 == 6) {
            this.field985 = arg0.method2442();
        } else if (arg1 == 7) {
            this.field980 = arg0.method2442();
            if (this.field980 > 32767) {
                this.field980 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1019 = arg0.method2442();
            if (this.field1019 > 32767) {
                this.field1019 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field989 = 1;
        } else if (arg1 == 12) {
            this.field990 = arg0.method2586();
        } else if (arg1 == 16) {
            this.field991 = true;
        } else if (arg1 == 23) {
            this.field978 = arg0.method2442();
            this.field996 = arg0.method2440();
        } else if (arg1 == 24) {
            this.field1008 = arg0.method2442();
        } else if (arg1 == 25) {
            this.field997 = arg0.method2442();
            this.field999 = arg0.method2440();
        } else if (arg1 == 26) {
            this.field992 = arg0.method2442();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field994[arg1 - 30] = arg0.method2471();
            if (this.field994[arg1 - 30].equalsIgnoreCase(class136.field2093)) {
                this.field994[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field993[arg1 - 35] = arg0.method2471();
        } else if (arg1 == 40) {
            int var3 = arg0.method2440();
            this.field979 = new short[var3];
            this.field973 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field979[var4] = (short) arg0.method2442();
                this.field973[var4] = (short) arg0.method2442();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2440();
            this.field981 = new short[var5];
            this.field982 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field981[var6] = (short) arg0.method2442();
                this.field982[var6] = (short) arg0.method2442();
            }
        } else if (arg1 == 78) {
            this.field1000 = arg0.method2442();
        } else if (arg1 == 79) {
            this.field1013 = arg0.method2442();
        } else if (arg1 == 90) {
            this.field1002 = arg0.method2442();
        } else if (arg1 == 91) {
            this.field998 = arg0.method2442();
        } else if (arg1 == 92) {
            this.field1003 = arg0.method2442();
        } else if (arg1 == 93) {
            this.field1005 = arg0.method2442();
        } else if (arg1 == 95) {
            this.field986 = arg0.method2442();
        } else if (arg1 == 97) {
            this.field987 = arg0.method2442();
        } else if (arg1 == 98) {
            this.field1009 = arg0.method2442();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1006 == null) {
                this.field1006 = new int[10];
                this.field1007 = new int[10];
            }
            this.field1006[arg1 - 100] = arg0.method2442();
            this.field1007[arg1 - 100] = arg0.method2442();
        } else if (arg1 == 110) {
            this.field983 = arg0.method2442();
        } else if (arg1 == 111) {
            this.field1011 = arg0.method2442();
        } else if (arg1 == 112) {
            this.field995 = arg0.method2442();
        } else if (arg1 == 113) {
            this.field1004 = arg0.method2438();
        } else if (arg1 == 114) {
            this.field1014 = arg0.method2438();
        } else if (arg1 == 115) {
            this.field1015 = arg0.method2440();
        }
    }

    @ObfuscatedName("af.r(Laf;Laf;I)V")
    public void method842(class40 arg0, class40 arg1) {
        this.field969 = arg0.field969;
        this.field988 = arg0.field988;
        this.field984 = arg0.field984;
        this.field985 = arg0.field985;
        this.field986 = arg0.field986;
        this.field980 = arg0.field980;
        this.field1019 = arg0.field1019;
        this.field979 = arg0.field979;
        this.field973 = arg0.field973;
        this.field981 = arg0.field981;
        this.field982 = arg0.field982;
        this.field1010 = arg1.field1010;
        this.field991 = arg1.field991;
        this.field990 = arg1.field990;
        this.field989 = 1;
    }

    @ObfuscatedName("af.k(IS)Lcc;")
    public final class101 method843(int arg0) {
        if (this.field1006 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1007[var3] && this.field1007[var3] != 0) {
                    var2 = this.field1006[var3];
                }
            }
            if (var2 != -1) {
                return method1243(var2).method843(1);
            }
        }
        class101 var4 = class101.method2087(Statics.field970, this.field969, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field983 != 128 || this.field1011 != 128 || this.field995 != 128) {
            var4.method2040(this.field983, this.field1011, this.field995);
        }
        if (this.field979 != null) {
            for (int var5 = 0; var5 < this.field979.length; var5++) {
                var4.method2071(this.field979[var5], this.field973[var5]);
            }
        }
        if (this.field981 != null) {
            for (int var6 = 0; var6 < this.field981.length; var6++) {
                var4.method2038(this.field981[var6], this.field982[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.z(II)Ldt;")
    public final class112 method844(int arg0) {
        if (this.field1006 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1007[var3] && this.field1007[var3] != 0) {
                    var2 = this.field1006[var3];
                }
            }
            if (var2 != -1) {
                return method1243(var2).method844(1);
            }
        }
        class112 var4 = (class112) field977.method3255((long) this.field976);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2087(Statics.field970, this.field969, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field983 != 128 || this.field1011 != 128 || this.field995 != 128) {
            var5.method2040(this.field983, this.field1011, this.field995);
        }
        if (this.field979 != null) {
            for (int var6 = 0; var6 < this.field979.length; var6++) {
                var5.method2071(this.field979[var6], this.field973[var6]);
            }
        }
        if (this.field981 != null) {
            for (int var7 = 0; var7 < this.field981.length; var7++) {
                var5.method2038(this.field981[var7], this.field982[var7]);
            }
        }
        class112 var8 = var5.method2105(this.field1004 + 64, this.field1014 * 5 + 768, -50, -10, -50);
        var8.field1879 = true;
        field977.method3253(var8, (long) this.field976);
        return var8;
    }

    @ObfuscatedName("af.g(II)Laf;")
    public class40 method845(int arg0) {
        if (this.field1006 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1007[var3] && this.field1007[var3] != 0) {
                    var2 = this.field1006[var3];
                }
            }
            if (var2 != -1) {
                return method1243(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ax.n(IIIIZI)Lch;")
    public static final class86 method825(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field974.method3255(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method1243(arg0);
        if (arg1 > 1 && var8.field1006 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1007[var10] && var8.field1007[var10] != 0) {
                    var9 = var8.field1006[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1243(var9);
            }
        }
        class112 var11 = var8.method844(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1009 != -1) {
            var12 = method825(var8.field987, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1480;
        int var14 = Statics.field1479;
        int var15 = Statics.field1481;
        int[] var16 = new int[4];
        class89.method1785(var16);
        class86 var17 = new class86(36, 32);
        class89.method1790(var17.field1464, 36, 32);
        class89.method1780();
        class104.method2126();
        class104.method2116(16, 16);
        class104.field1737 = false;
        int var18 = var8.field988;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1757[var8.field984] * var18 >> 16;
        int var20 = class104.field1736[var8.field984] * var18 >> 16;
        var11.method2230();
        var11.method2241(0, var8.field985, var8.field986, var8.field984, var8.field980, var8.field1019 + var11.field1537 / 2 + var19, var8.field1019 + var20);
        if (arg2 >= 1) {
            var17.method1684(1);
        }
        if (arg2 >= 2) {
            var17.method1684(16777215);
        }
        if (arg3 != 0) {
            var17.method1685(arg3);
        }
        class89.method1790(var17.field1464, 36, 32);
        if (var8.field1009 != -1) {
            var12.method1688(0, 0);
        }
        if (!arg4 && (var8.field989 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field975.method3467(method2019(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field974.method3253(var17, var5);
        }
        class89.method1790(var13, var14, var15);
        class89.method1779(var16);
        class104.method2126();
        class104.field1737 = true;
        return var17;
    }

    @ObfuscatedName("cr.j(II)Ljava/lang/String;")
    public static final String method2019(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class136.field2243 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class136.field2241 + "</col>";
        }
    }

    @ObfuscatedName("af.c(ZB)Z")
    public final boolean method866(boolean arg0) {
        int var2 = this.field978;
        int var3 = this.field1008;
        int var4 = this.field1000;
        if (arg0) {
            var2 = this.field997;
            var3 = this.field992;
            var4 = this.field1013;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field970.method3031(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field970.method3031(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field970.method3031(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.m(ZB)Lcc;")
    public final class101 method839(boolean arg0) {
        int var2 = this.field978;
        int var3 = this.field1008;
        int var4 = this.field1000;
        if (arg0) {
            var2 = this.field997;
            var3 = this.field992;
            var4 = this.field1013;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2087(Statics.field970, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2087(Statics.field970, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2087(Statics.field970, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field996 != 0) {
            var5.method2036(0, this.field996, 0);
        }
        if (arg0 && this.field999 != 0) {
            var5.method2036(0, this.field999, 0);
        }
        if (this.field979 != null) {
            for (int var10 = 0; var10 < this.field979.length; var10++) {
                var5.method2071(this.field979[var10], this.field973[var10]);
            }
        }
        if (this.field981 != null) {
            for (int var11 = 0; var11 < this.field981.length; var11++) {
                var5.method2038(this.field981[var11], this.field982[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.a(ZB)Z")
    public final boolean method847(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1003;
        if (arg0) {
            var2 = this.field998;
            var3 = this.field1005;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field970.method3031(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field970.method3031(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.e(ZI)Lcc;")
    public final class101 method848(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1003;
        if (arg0) {
            var2 = this.field998;
            var3 = this.field1005;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2087(Statics.field970, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2087(Statics.field970, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field979 != null) {
            for (int var7 = 0; var7 < this.field979.length; var7++) {
                var4.method2071(this.field979[var7], this.field973[var7]);
            }
        }
        if (this.field981 != null) {
            for (int var8 = 0; var8 < this.field981.length; var8++) {
                var4.method2038(this.field981[var8], this.field982[var8]);
            }
        }
        return var4;
    }
}
