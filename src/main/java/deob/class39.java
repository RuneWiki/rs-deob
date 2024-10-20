package deob;

@ObfuscatedName("am")
public class class39 extends class172 {

    @ObfuscatedName("am.j")
    public static class168 field970 = new class168(64);

    @ObfuscatedName("am.i")
    public static class168 field1007 = new class168(50);

    @ObfuscatedName("am.o")
    public static class168 field972 = new class168(100);

    @ObfuscatedName("am.p")
    public int field973;

    @ObfuscatedName("am.t")
    public int field1012;

    @ObfuscatedName("am.w")
    public String field975 = "null";

    @ObfuscatedName("am.r")
    public short[] field976;

    @ObfuscatedName("am.a")
    public short[] field977;

    @ObfuscatedName("am.q")
    public short[] field978;

    @ObfuscatedName("am.z")
    public short[] field979;

    @ObfuscatedName("am.d")
    public int field996 = 2000;

    @ObfuscatedName("am.x")
    public int field981 = 0;

    @ObfuscatedName("am.s")
    public int field982 = 0;

    @ObfuscatedName("am.m")
    public int field983 = 0;

    @ObfuscatedName("am.y")
    public int field984 = 0;

    @ObfuscatedName("am.b")
    public int field985 = 0;

    @ObfuscatedName("am.h")
    public int field986 = 0;

    @ObfuscatedName("am.f")
    public int field987 = 1;

    @ObfuscatedName("am.v")
    public boolean field993 = false;

    @ObfuscatedName("am.u")
    public String[] field991 = new String[] { null, null, class133.field2122, null, null };

    @ObfuscatedName("am.k")
    public String[] field990 = new String[] { null, null, null, null, class133.field2060 };

    @ObfuscatedName("am.c")
    public int field974 = -1;

    @ObfuscatedName("am.al")
    public int field992 = -1;

    @ObfuscatedName("am.ai")
    public int field968 = 0;

    @ObfuscatedName("am.ad")
    public int field1002 = -1;

    @ObfuscatedName("am.aw")
    public int field995 = -1;

    @ObfuscatedName("am.af")
    public int field998 = 0;

    @ObfuscatedName("am.an")
    public int field997 = -1;

    @ObfuscatedName("am.ao")
    public int field971 = -1;

    @ObfuscatedName("am.ak")
    public int field999 = -1;

    @ObfuscatedName("am.ah")
    public int field1000 = -1;

    @ObfuscatedName("am.aq")
    public int field1001 = -1;

    @ObfuscatedName("am.ax")
    public int field967 = -1;

    @ObfuscatedName("am.ag")
    public int[] field1003;

    @ObfuscatedName("am.am")
    public int[] field994;

    @ObfuscatedName("am.at")
    public int field1018 = -1;

    @ObfuscatedName("am.ae")
    public int field1006 = -1;

    @ObfuscatedName("am.ay")
    public int field1010 = 128;

    @ObfuscatedName("am.as")
    public int field1011 = 128;

    @ObfuscatedName("am.ar")
    public int field1009 = 128;

    @ObfuscatedName("am.aj")
    public int field989 = 0;

    @ObfuscatedName("am.av")
    public int field1008 = 0;

    @ObfuscatedName("am.az")
    public int field980 = 0;

    @ObfuscatedName("h.g(II)Lam;")
    public static class39 method196(int arg0) {
        class39 var1 = (class39) field970.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field988.method3012(10, arg0);
        class39 var3 = new class39();
        var3.field973 = arg0;
        if (var2 != null) {
            var3.method839(new class126(var2));
        }
        var3.method852();
        if (var3.field1006 != -1) {
            var3.method841(method196(var3.field1006), method196(var3.field1018));
        }
        if (!Statics.field969 && var3.field993) {
            var3.field975 = class133.field2260;
            var3.field991 = null;
            var3.field990 = null;
            var3.field980 = 0;
        }
        field970.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.e(B)V")
    public void method852() {
    }

    @ObfuscatedName("am.n(Ldu;I)V")
    public void method839(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method840(arg0, var2);
        }
    }

    @ObfuscatedName("am.j(Ldu;II)V")
    public void method840(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1012 = arg0.method2487();
        } else if (arg1 == 2) {
            this.field975 = arg0.method2470();
        } else if (arg1 == 4) {
            this.field996 = arg0.method2487();
        } else if (arg1 == 5) {
            this.field981 = arg0.method2487();
        } else if (arg1 == 6) {
            this.field982 = arg0.method2487();
        } else if (arg1 == 7) {
            this.field984 = arg0.method2487();
            if (this.field984 > 32767) {
                this.field984 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field985 = arg0.method2487();
            if (this.field985 > 32767) {
                this.field985 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field986 = 1;
        } else if (arg1 == 12) {
            this.field987 = arg0.method2593();
        } else if (arg1 == 16) {
            this.field993 = true;
        } else if (arg1 == 23) {
            this.field974 = arg0.method2487();
            this.field968 = arg0.method2485();
        } else if (arg1 == 24) {
            this.field992 = arg0.method2487();
        } else if (arg1 == 25) {
            this.field1002 = arg0.method2487();
            this.field998 = arg0.method2485();
        } else if (arg1 == 26) {
            this.field995 = arg0.method2487();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field991[arg1 - 30] = arg0.method2470();
            if (this.field991[arg1 - 30].equalsIgnoreCase(class133.field2061)) {
                this.field991[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field990[arg1 - 35] = arg0.method2470();
        } else if (arg1 == 40) {
            int var3 = arg0.method2485();
            this.field976 = new short[var3];
            this.field977 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field976[var4] = (short) arg0.method2487();
                this.field977[var4] = (short) arg0.method2487();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2485();
            this.field978 = new short[var5];
            this.field979 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field978[var6] = (short) arg0.method2487();
                this.field979[var6] = (short) arg0.method2487();
            }
        } else if (arg1 == 78) {
            this.field997 = arg0.method2487();
        } else if (arg1 == 79) {
            this.field971 = arg0.method2487();
        } else if (arg1 == 90) {
            this.field999 = arg0.method2487();
        } else if (arg1 == 91) {
            this.field1001 = arg0.method2487();
        } else if (arg1 == 92) {
            this.field1000 = arg0.method2487();
        } else if (arg1 == 93) {
            this.field967 = arg0.method2487();
        } else if (arg1 == 95) {
            this.field983 = arg0.method2487();
        } else if (arg1 == 97) {
            this.field1018 = arg0.method2487();
        } else if (arg1 == 98) {
            this.field1006 = arg0.method2487();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1003 == null) {
                this.field1003 = new int[10];
                this.field994 = new int[10];
            }
            this.field1003[arg1 - 100] = arg0.method2487();
            this.field994[arg1 - 100] = arg0.method2487();
        } else if (arg1 == 110) {
            this.field1010 = arg0.method2487();
        } else if (arg1 == 111) {
            this.field1011 = arg0.method2487();
        } else if (arg1 == 112) {
            this.field1009 = arg0.method2487();
        } else if (arg1 == 113) {
            this.field989 = arg0.method2479();
        } else if (arg1 == 114) {
            this.field1008 = arg0.method2479() * 5;
        } else if (arg1 == 115) {
            this.field980 = arg0.method2485();
        }
    }

    @ObfuscatedName("am.i(Lam;Lam;B)V")
    public void method841(class39 arg0, class39 arg1) {
        this.field1012 = arg0.field1012;
        this.field996 = arg0.field996;
        this.field981 = arg0.field981;
        this.field982 = arg0.field982;
        this.field983 = arg0.field983;
        this.field984 = arg0.field984;
        this.field985 = arg0.field985;
        this.field976 = arg0.field976;
        this.field977 = arg0.field977;
        this.field978 = arg0.field978;
        this.field979 = arg0.field979;
        this.field975 = arg1.field975;
        this.field993 = arg1.field993;
        this.field987 = arg1.field987;
        this.field986 = 1;
    }

    @ObfuscatedName("am.o(II)Lcm;")
    public final class100 method842(int arg0) {
        if (this.field1003 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field994[var3] && this.field994[var3] != 0) {
                    var2 = this.field1003[var3];
                }
            }
            if (var2 != -1) {
                return method196(var2).method842(1);
            }
        }
        class100 var4 = class100.method2068(Statics.field1014, this.field1012, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1010 != 128 || this.field1011 != 128 || this.field1009 != 128) {
            var4.method2085(this.field1010, this.field1011, this.field1009);
        }
        if (this.field976 != null) {
            for (int var5 = 0; var5 < this.field976.length; var5++) {
                var4.method2100(this.field976[var5], this.field977[var5]);
            }
        }
        if (this.field978 != null) {
            for (int var6 = 0; var6 < this.field978.length; var6++) {
                var4.method2083(this.field978[var6], this.field979[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("am.l(IS)Ldk;")
    public final class111 method855(int arg0) {
        if (this.field1003 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field994[var3] && this.field994[var3] != 0) {
                    var2 = this.field1003[var3];
                }
            }
            if (var2 != -1) {
                return method196(var2).method855(1);
            }
        }
        class111 var4 = (class111) field1007.method3311((long) this.field973);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2068(Statics.field1014, this.field1012, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1010 != 128 || this.field1011 != 128 || this.field1009 != 128) {
            var5.method2085(this.field1010, this.field1011, this.field1009);
        }
        if (this.field976 != null) {
            for (int var6 = 0; var6 < this.field976.length; var6++) {
                var5.method2100(this.field976[var6], this.field977[var6]);
            }
        }
        if (this.field978 != null) {
            for (int var7 = 0; var7 < this.field978.length; var7++) {
                var5.method2083(this.field978[var7], this.field979[var7]);
            }
        }
        class111 var8 = var5.method2067(this.field989 + 64, this.field1008 + 768, -50, -10, -50);
        var8.field1852 = true;
        field1007.method3314(var8, (long) this.field973);
        return var8;
    }

    @ObfuscatedName("am.p(II)Lam;")
    public class39 method844(int arg0) {
        if (this.field1003 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field994[var3] && this.field994[var3] != 0) {
                    var2 = this.field1003[var3];
                }
            }
            if (var2 != -1) {
                return method196(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("client.t(IIIIZI)Lcf;")
    public static final class85 method531(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field972.method3311(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method196(arg0);
        if (arg1 > 1 && var8.field1003 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field994[var10] && var8.field994[var10] != 0) {
                    var9 = var8.field1003[var10];
                }
            }
            if (var9 != -1) {
                var8 = method196(var9);
            }
        }
        class111 var11 = var8.method855(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field1006 != -1) {
            var12 = method531(var8.field1018, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1481;
        int var14 = Statics.field1475;
        int var15 = Statics.field1477;
        int[] var16 = new int[4];
        class88.method1794(var16);
        class85 var17 = new class85(36, 32);
        class88.method1848(var17.field1454, 36, 32);
        class88.method1796();
        class103.method2166();
        class103.method2211(16, 16);
        class103.field1736 = false;
        int var18 = var8.field996;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1756[var8.field981] * var18 >> 16;
        int var20 = class103.field1757[var8.field981] * var18 >> 16;
        var11.method2267();
        var11.method2279(0, var8.field982, var8.field983, var8.field981, var8.field984, var8.field985 + var11.field1534 / 2 + var19, var8.field985 + var20);
        if (arg2 >= 1) {
            var17.method1708(1);
        }
        if (arg2 >= 2) {
            var17.method1708(16777215);
        }
        if (arg3 != 0) {
            var17.method1699(arg3);
        }
        class88.method1848(var17.field1454, 36, 32);
        if (var8.field1006 != -1) {
            var12.method1702(0, 0);
        }
        if (!arg4 && (var8.field986 == 1 || arg1 != 1) && arg1 != -1) {
            class181 var21 = Statics.field1259;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class133.field2213 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class133.field2211 + "</col>";
            }
            var21.method3510(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field972.method3314(var17, var5);
        }
        class88.method1848(var13, var14, var15);
        class88.method1795(var16);
        class103.method2166();
        class103.field1736 = true;
        return var17;
    }

    @ObfuscatedName("am.w(ZB)Z")
    public final boolean method845(boolean arg0) {
        int var2 = this.field974;
        int var3 = this.field992;
        int var4 = this.field997;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field995;
            var4 = this.field971;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1014.method3014(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1014.method3014(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1014.method3014(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("am.r(ZB)Lcm;")
    public final class100 method843(boolean arg0) {
        int var2 = this.field974;
        int var3 = this.field992;
        int var4 = this.field997;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field995;
            var4 = this.field971;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2068(Statics.field1014, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2068(Statics.field1014, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2068(Statics.field1014, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field968 != 0) {
            var5.method2081(0, this.field968, 0);
        }
        if (arg0 && this.field998 != 0) {
            var5.method2081(0, this.field998, 0);
        }
        if (this.field976 != null) {
            for (int var10 = 0; var10 < this.field976.length; var10++) {
                var5.method2100(this.field976[var10], this.field977[var10]);
            }
        }
        if (this.field978 != null) {
            for (int var11 = 0; var11 < this.field978.length; var11++) {
                var5.method2083(this.field978[var11], this.field979[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("am.a(ZB)Z")
    public final boolean method847(boolean arg0) {
        int var2 = this.field999;
        int var3 = this.field1000;
        if (arg0) {
            var2 = this.field1001;
            var3 = this.field967;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1014.method3014(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1014.method3014(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("am.q(ZI)Lcm;")
    public final class100 method848(boolean arg0) {
        int var2 = this.field999;
        int var3 = this.field1000;
        if (arg0) {
            var2 = this.field1001;
            var3 = this.field967;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2068(Statics.field1014, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2068(Statics.field1014, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field976 != null) {
            for (int var7 = 0; var7 < this.field976.length; var7++) {
                var4.method2100(this.field976[var7], this.field977[var7]);
            }
        }
        if (this.field978 != null) {
            for (int var8 = 0; var8 < this.field978.length; var8++) {
                var4.method2083(this.field978[var8], this.field979[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ak.z(I)V")
    public static void method751() {
        field970.method3315();
        field1007.method3315();
        field972.method3315();
    }
}
