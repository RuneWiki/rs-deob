package deob;

@ObfuscatedName("ae")
public class class39 extends class172 {

    @ObfuscatedName("ae.p")
    public static class168 field990 = new class168(64);

    @ObfuscatedName("ae.i")
    public static class168 field983 = new class168(50);

    @ObfuscatedName("ae.v")
    public static class168 field988 = new class168(100);

    @ObfuscatedName("ae.m")
    public int field1007;

    @ObfuscatedName("ae.g")
    public int field986;

    @ObfuscatedName("ae.t")
    public String field1026 = "null";

    @ObfuscatedName("ae.o")
    public short[] field1011;

    @ObfuscatedName("ae.b")
    public short[] field989;

    @ObfuscatedName("ae.d")
    public short[] field1015;

    @ObfuscatedName("ae.k")
    public short[] field1018;

    @ObfuscatedName("ae.f")
    public int field992 = 2000;

    @ObfuscatedName("ae.e")
    public int field1024 = 0;

    @ObfuscatedName("ae.u")
    public int field994 = 0;

    @ObfuscatedName("ae.n")
    public int field995 = 0;

    @ObfuscatedName("ae.q")
    public int field996 = 0;

    @ObfuscatedName("ae.y")
    public int field993 = 0;

    @ObfuscatedName("ae.a")
    public int field998 = 0;

    @ObfuscatedName("ae.r")
    public int field1016 = 1;

    @ObfuscatedName("ae.x")
    public boolean field1019 = false;

    @ObfuscatedName("ae.w")
    public String[] field1001 = new String[] { null, null, class133.field2133, null, null };

    @ObfuscatedName("ae.j")
    public String[] field1002 = new String[] { null, null, null, null, class133.field2042 };

    @ObfuscatedName("ae.s")
    public int field1003 = -1;

    @ObfuscatedName("ae.au")
    public int field999 = -1;

    @ObfuscatedName("ae.ay")
    public int field1005 = 0;

    @ObfuscatedName("ae.ar")
    public int field1006 = -1;

    @ObfuscatedName("ae.aj")
    public int field985 = -1;

    @ObfuscatedName("ae.ad")
    public int field1008 = 0;

    @ObfuscatedName("ae.at")
    public int field1009 = -1;

    @ObfuscatedName("ae.as")
    public int field1010 = -1;

    @ObfuscatedName("ae.aw")
    public int field1000 = -1;

    @ObfuscatedName("ae.ax")
    public int field1012 = -1;

    @ObfuscatedName("ae.am")
    public int field1013 = -1;

    @ObfuscatedName("ae.an")
    public int field1014 = -1;

    @ObfuscatedName("ae.ap")
    public int[] field991;

    @ObfuscatedName("ae.ae")
    public int[] field1004;

    @ObfuscatedName("ae.av")
    public int field1017 = -1;

    @ObfuscatedName("ae.ac")
    public int field982 = -1;

    @ObfuscatedName("ae.ai")
    public int field979 = 128;

    @ObfuscatedName("ae.ak")
    public int field1020 = 128;

    @ObfuscatedName("ae.ag")
    public int field997 = 128;

    @ObfuscatedName("ae.ah")
    public int field1022 = 0;

    @ObfuscatedName("ae.af")
    public int field1023 = 0;

    @ObfuscatedName("ae.aa")
    public int field987 = 0;

    @ObfuscatedName("ew.z(II)Lae;")
    public static class39 method2704(int arg0) {
        class39 var1 = (class39) field990.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method2951(10, arg0);
        class39 var3 = new class39();
        var3.field1007 = arg0;
        if (var2 != null) {
            var3.method826(new class126(var2));
        }
        var3.method825();
        if (var3.field982 != -1) {
            var3.method828(method2704(var3.field982), method2704(var3.field1017));
        }
        if (!Statics.field1021 && var3.field1019) {
            var3.field1026 = class133.field2251;
            var3.field1001 = null;
            var3.field1002 = null;
            var3.field987 = 0;
        }
        field990.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.h(I)V")
    public void method825() {
    }

    @ObfuscatedName("ae.c(Ldq;I)V")
    public void method826(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method827(arg0, var2);
        }
    }

    @ObfuscatedName("ae.p(Ldq;IB)V")
    public void method827(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field986 = arg0.method2627();
        } else if (arg1 == 2) {
            this.field1026 = arg0.method2603();
        } else if (arg1 == 4) {
            this.field992 = arg0.method2627();
        } else if (arg1 == 5) {
            this.field1024 = arg0.method2627();
        } else if (arg1 == 6) {
            this.field994 = arg0.method2627();
        } else if (arg1 == 7) {
            this.field996 = arg0.method2627();
            if (this.field996 > 32767) {
                this.field996 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field993 = arg0.method2627();
            if (this.field993 > 32767) {
                this.field993 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field998 = 1;
        } else if (arg1 == 12) {
            this.field1016 = arg0.method2467();
        } else if (arg1 == 16) {
            this.field1019 = true;
        } else if (arg1 == 23) {
            this.field1003 = arg0.method2627();
            this.field1005 = arg0.method2450();
        } else if (arg1 == 24) {
            this.field999 = arg0.method2627();
        } else if (arg1 == 25) {
            this.field1006 = arg0.method2627();
            this.field1008 = arg0.method2450();
        } else if (arg1 == 26) {
            this.field985 = arg0.method2627();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1001[arg1 - 30] = arg0.method2603();
            if (this.field1001[arg1 - 30].equalsIgnoreCase(class133.field2145)) {
                this.field1001[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1002[arg1 - 35] = arg0.method2603();
        } else if (arg1 == 40) {
            int var3 = arg0.method2450();
            this.field1011 = new short[var3];
            this.field989 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1011[var4] = (short) arg0.method2627();
                this.field989[var4] = (short) arg0.method2627();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2450();
            this.field1015 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1015[var6] = (short) arg0.method2627();
                this.field1018[var6] = (short) arg0.method2627();
            }
        } else if (arg1 == 78) {
            this.field1009 = arg0.method2627();
        } else if (arg1 == 79) {
            this.field1010 = arg0.method2627();
        } else if (arg1 == 90) {
            this.field1000 = arg0.method2627();
        } else if (arg1 == 91) {
            this.field1013 = arg0.method2627();
        } else if (arg1 == 92) {
            this.field1012 = arg0.method2627();
        } else if (arg1 == 93) {
            this.field1014 = arg0.method2627();
        } else if (arg1 == 95) {
            this.field995 = arg0.method2627();
        } else if (arg1 == 97) {
            this.field1017 = arg0.method2627();
        } else if (arg1 == 98) {
            this.field982 = arg0.method2627();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field991 == null) {
                this.field991 = new int[10];
                this.field1004 = new int[10];
            }
            this.field991[arg1 - 100] = arg0.method2627();
            this.field1004[arg1 - 100] = arg0.method2627();
        } else if (arg1 == 110) {
            this.field979 = arg0.method2627();
        } else if (arg1 == 111) {
            this.field1020 = arg0.method2627();
        } else if (arg1 == 112) {
            this.field997 = arg0.method2627();
        } else if (arg1 == 113) {
            this.field1022 = arg0.method2451();
        } else if (arg1 == 114) {
            this.field1023 = arg0.method2451();
        } else if (arg1 == 115) {
            this.field987 = arg0.method2450();
        }
    }

    @ObfuscatedName("ae.i(Lae;Lae;B)V")
    public void method828(class39 arg0, class39 arg1) {
        this.field986 = arg0.field986;
        this.field992 = arg0.field992;
        this.field1024 = arg0.field1024;
        this.field994 = arg0.field994;
        this.field995 = arg0.field995;
        this.field996 = arg0.field996;
        this.field993 = arg0.field993;
        this.field1011 = arg0.field1011;
        this.field989 = arg0.field989;
        this.field1015 = arg0.field1015;
        this.field1018 = arg0.field1018;
        this.field1026 = arg1.field1026;
        this.field1019 = arg1.field1019;
        this.field1016 = arg1.field1016;
        this.field998 = 1;
    }

    @ObfuscatedName("ae.v(II)Lcj;")
    public final class100 method868(int arg0) {
        if (this.field991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1004[var3] && this.field1004[var3] != 0) {
                    var2 = this.field991[var3];
                }
            }
            if (var2 != -1) {
                return method2704(var2).method868(1);
            }
        }
        class100 var4 = class100.method2037(Statics.field980, this.field986, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field979 != 128 || this.field1020 != 128 || this.field997 != 128) {
            var4.method2048(this.field979, this.field1020, this.field997);
        }
        if (this.field1011 != null) {
            for (int var5 = 0; var5 < this.field1011.length; var5++) {
                var4.method2059(this.field1011[var5], this.field989[var5]);
            }
        }
        if (this.field1015 != null) {
            for (int var6 = 0; var6 < this.field1015.length; var6++) {
                var4.method2082(this.field1015[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.l(IB)Ldh;")
    public final class111 method849(int arg0) {
        if (this.field991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1004[var3] && this.field1004[var3] != 0) {
                    var2 = this.field991[var3];
                }
            }
            if (var2 != -1) {
                return method2704(var2).method849(1);
            }
        }
        class111 var4 = (class111) field983.method3240((long) this.field1007);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2037(Statics.field980, this.field986, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field979 != 128 || this.field1020 != 128 || this.field997 != 128) {
            var5.method2048(this.field979, this.field1020, this.field997);
        }
        if (this.field1011 != null) {
            for (int var6 = 0; var6 < this.field1011.length; var6++) {
                var5.method2059(this.field1011[var6], this.field989[var6]);
            }
        }
        if (this.field1015 != null) {
            for (int var7 = 0; var7 < this.field1015.length; var7++) {
                var5.method2082(this.field1015[var7], this.field1018[var7]);
            }
        }
        class111 var8 = var5.method2046(this.field1022 + 64, this.field1023 * 5 + 768, -50, -10, -50);
        var8.field1865 = true;
        field983.method3237(var8, (long) this.field1007);
        return var8;
    }

    @ObfuscatedName("ae.m(IB)Lae;")
    public class39 method831(int arg0) {
        if (this.field991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1004[var3] && this.field1004[var3] != 0) {
                    var2 = this.field991[var3];
                }
            }
            if (var2 != -1) {
                return method2704(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ck.g(IIIIZI)Lcm;")
    public static final class85 method1577(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field988.method3240(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method2704(arg0);
        if (arg1 > 1 && var8.field991 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1004[var10] && var8.field1004[var10] != 0) {
                    var9 = var8.field991[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2704(var9);
            }
        }
        class111 var11 = var8.method849(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field982 != -1) {
            var12 = method1577(var8.field1017, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1477;
        int var14 = Statics.field1476;
        int var15 = Statics.field1481;
        int[] var16 = new int[4];
        class88.method1759(var16);
        class85 var17 = new class85(36, 32);
        class88.method1753(var17.field1461, 36, 32);
        class88.method1758();
        class103.method2106();
        class103.method2116(16, 16);
        class103.field1742 = false;
        int var18 = var8.field992;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1757[var8.field1024] * var18 >> 16;
        int var20 = class103.field1746[var8.field1024] * var18 >> 16;
        var11.method2219();
        var11.method2231(0, var8.field994, var8.field995, var8.field1024, var8.field996, var8.field993 + var11.field1537 / 2 + var19, var8.field993 + var20);
        if (arg2 >= 1) {
            var17.method1663(1);
        }
        if (arg2 >= 2) {
            var17.method1663(16777215);
        }
        if (arg3 != 0) {
            var17.method1670(arg3);
        }
        class88.method1753(var17.field1461, 36, 32);
        if (var8.field982 != -1) {
            var12.method1665(0, 0);
        }
        if (!arg4 && (var8.field998 == 1 || arg1 != 1) && arg1 != -1) {
            class181 var21 = Statics.field379;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class133.field2195 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class133.field2193 + "</col>";
            }
            var21.method3408(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field988.method3237(var17, var5);
        }
        class88.method1753(var13, var14, var15);
        class88.method1764(var16);
        class103.method2106();
        class103.field1742 = true;
        return var17;
    }

    @ObfuscatedName("ae.t(ZI)Z")
    public final boolean method832(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field999;
        int var4 = this.field1009;
        if (arg0) {
            var2 = this.field1006;
            var3 = this.field985;
            var4 = this.field1010;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field980.method2995(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field980.method2995(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field980.method2995(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ae.o(ZB)Lcj;")
    public final class100 method833(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field999;
        int var4 = this.field1009;
        if (arg0) {
            var2 = this.field1006;
            var3 = this.field985;
            var4 = this.field1010;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2037(Statics.field980, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2037(Statics.field980, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2037(Statics.field980, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1005 != 0) {
            var5.method2036(0, this.field1005, 0);
        }
        if (arg0 && this.field1008 != 0) {
            var5.method2036(0, this.field1008, 0);
        }
        if (this.field1011 != null) {
            for (int var10 = 0; var10 < this.field1011.length; var10++) {
                var5.method2059(this.field1011[var10], this.field989[var10]);
            }
        }
        if (this.field1015 != null) {
            for (int var11 = 0; var11 < this.field1015.length; var11++) {
                var5.method2082(this.field1015[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ae.b(ZB)Z")
    public final boolean method834(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1012;
        if (arg0) {
            var2 = this.field1013;
            var3 = this.field1014;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field980.method2995(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field980.method2995(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ae.d(ZI)Lcj;")
    public final class100 method835(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1012;
        if (arg0) {
            var2 = this.field1013;
            var3 = this.field1014;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2037(Statics.field980, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2037(Statics.field980, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1011 != null) {
            for (int var7 = 0; var7 < this.field1011.length; var7++) {
                var4.method2059(this.field1011[var7], this.field989[var7]);
            }
        }
        if (this.field1015 != null) {
            for (int var8 = 0; var8 < this.field1015.length; var8++) {
                var4.method2082(this.field1015[var8], this.field1018[var8]);
            }
        }
        return var4;
    }
}
