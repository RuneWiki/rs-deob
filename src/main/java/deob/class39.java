package deob;

@ObfuscatedName("am")
public class class39 extends class172 {

    @ObfuscatedName("am.y")
    public static class168 field959 = new class168(64);

    @ObfuscatedName("am.x")
    public static class168 field976 = new class168(50);

    @ObfuscatedName("am.e")
    public static class168 field961 = new class168(100);

    @ObfuscatedName("am.s")
    public int field996;

    @ObfuscatedName("am.p")
    public int field964;

    @ObfuscatedName("am.w")
    public String field965 = "null";

    @ObfuscatedName("am.r")
    public short[] field966;

    @ObfuscatedName("am.n")
    public short[] field967;

    @ObfuscatedName("am.b")
    public short[] field968;

    @ObfuscatedName("am.z")
    public short[] field969;

    @ObfuscatedName("am.h")
    public int field956 = 2000;

    @ObfuscatedName("am.q")
    public int field971 = 0;

    @ObfuscatedName("am.l")
    public int field962 = 0;

    @ObfuscatedName("am.t")
    public int field973 = 0;

    @ObfuscatedName("am.g")
    public int field974 = 0;

    @ObfuscatedName("am.a")
    public int field975 = 0;

    @ObfuscatedName("am.v")
    public int field980 = 0;

    @ObfuscatedName("am.i")
    public int field977 = 1;

    @ObfuscatedName("am.k")
    public boolean field978 = false;

    @ObfuscatedName("am.o")
    public String[] field979 = new String[] { null, null, class133.field2056, null, null };

    @ObfuscatedName("am.d")
    public String[] field970 = new String[] { null, null, null, null, class133.field2099 };

    @ObfuscatedName("am.u")
    public int field1003 = -1;

    @ObfuscatedName("am.ap")
    public int field1005 = -1;

    @ObfuscatedName("am.ad")
    public int field972 = 0;

    @ObfuscatedName("am.ao")
    public int field988 = -1;

    @ObfuscatedName("am.av")
    public int field985 = -1;

    @ObfuscatedName("am.af")
    public int field986 = 0;

    @ObfuscatedName("am.ae")
    public int field991 = -1;

    @ObfuscatedName("am.ax")
    public int field999 = -1;

    @ObfuscatedName("am.aw")
    public int field989 = -1;

    @ObfuscatedName("am.an")
    public int field990 = -1;

    @ObfuscatedName("am.az")
    public int field983 = -1;

    @ObfuscatedName("am.as")
    public int field992 = -1;

    @ObfuscatedName("am.ag")
    public int[] field993;

    @ObfuscatedName("am.am")
    public int[] field994;

    @ObfuscatedName("am.ah")
    public int field987 = -1;

    @ObfuscatedName("am.aj")
    public int field995 = -1;

    @ObfuscatedName("am.ab")
    public int field997 = 128;

    @ObfuscatedName("am.at")
    public int field998 = 128;

    @ObfuscatedName("am.ai")
    public int field963 = 128;

    @ObfuscatedName("am.aa")
    public int field1000 = 0;

    @ObfuscatedName("am.ar")
    public int field1001 = 0;

    @ObfuscatedName("am.au")
    public int field1002 = 0;

    @ObfuscatedName("ee.j(II)Lam;")
    public static class39 method2570(int arg0) {
        class39 var1 = (class39) field959.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field982.method2821(10, arg0);
        class39 var3 = new class39();
        var3.field996 = arg0;
        if (var2 != null) {
            var3.method794(new class125(var2));
        }
        var3.method837();
        if (var3.field995 != -1) {
            var3.method796(method2570(var3.field995), method2570(var3.field987));
        }
        if (!Statics.field958 && var3.field978) {
            var3.field965 = class133.field2185;
            var3.field979 = null;
            var3.field970 = null;
            var3.field1002 = 0;
        }
        field959.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.f(I)V")
    public void method837() {
    }

    @ObfuscatedName("am.y(Ldl;I)V")
    public void method794(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method795(arg0, var2);
        }
    }

    @ObfuscatedName("am.x(Ldl;IB)V")
    public void method795(class125 arg0, int arg1) {
        if (arg1 == 1) {
            this.field964 = arg0.method2328();
        } else if (arg1 == 2) {
            this.field965 = arg0.method2515();
        } else if (arg1 == 4) {
            this.field956 = arg0.method2328();
        } else if (arg1 == 5) {
            this.field971 = arg0.method2328();
        } else if (arg1 == 6) {
            this.field962 = arg0.method2328();
        } else if (arg1 == 7) {
            this.field974 = arg0.method2328();
            if (this.field974 > 32767) {
                this.field974 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field975 = arg0.method2328();
            if (this.field975 > 32767) {
                this.field975 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field980 = 1;
        } else if (arg1 == 12) {
            this.field977 = arg0.method2489();
        } else if (arg1 == 16) {
            this.field978 = true;
        } else if (arg1 == 23) {
            this.field1003 = arg0.method2328();
            this.field972 = arg0.method2326();
        } else if (arg1 == 24) {
            this.field1005 = arg0.method2328();
        } else if (arg1 == 25) {
            this.field988 = arg0.method2328();
            this.field986 = arg0.method2326();
        } else if (arg1 == 26) {
            this.field985 = arg0.method2328();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field979[arg1 - 30] = arg0.method2515();
            if (this.field979[arg1 - 30].equalsIgnoreCase(class133.field2181)) {
                this.field979[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field970[arg1 - 35] = arg0.method2515();
        } else if (arg1 == 40) {
            int var3 = arg0.method2326();
            this.field966 = new short[var3];
            this.field967 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field966[var4] = (short) arg0.method2328();
                this.field967[var4] = (short) arg0.method2328();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2326();
            this.field968 = new short[var5];
            this.field969 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field968[var6] = (short) arg0.method2328();
                this.field969[var6] = (short) arg0.method2328();
            }
        } else if (arg1 == 78) {
            this.field991 = arg0.method2328();
        } else if (arg1 == 79) {
            this.field999 = arg0.method2328();
        } else if (arg1 == 90) {
            this.field989 = arg0.method2328();
        } else if (arg1 == 91) {
            this.field983 = arg0.method2328();
        } else if (arg1 == 92) {
            this.field990 = arg0.method2328();
        } else if (arg1 == 93) {
            this.field992 = arg0.method2328();
        } else if (arg1 == 95) {
            this.field973 = arg0.method2328();
        } else if (arg1 == 97) {
            this.field987 = arg0.method2328();
        } else if (arg1 == 98) {
            this.field995 = arg0.method2328();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field993 == null) {
                this.field993 = new int[10];
                this.field994 = new int[10];
            }
            this.field993[arg1 - 100] = arg0.method2328();
            this.field994[arg1 - 100] = arg0.method2328();
        } else if (arg1 == 110) {
            this.field997 = arg0.method2328();
        } else if (arg1 == 111) {
            this.field998 = arg0.method2328();
        } else if (arg1 == 112) {
            this.field963 = arg0.method2328();
        } else if (arg1 == 113) {
            this.field1000 = arg0.method2347();
        } else if (arg1 == 114) {
            this.field1001 = arg0.method2347() * 5;
        } else if (arg1 == 115) {
            this.field1002 = arg0.method2326();
        }
    }

    @ObfuscatedName("am.e(Lam;Lam;B)V")
    public void method796(class39 arg0, class39 arg1) {
        this.field964 = arg0.field964;
        this.field956 = arg0.field956;
        this.field971 = arg0.field971;
        this.field962 = arg0.field962;
        this.field973 = arg0.field973;
        this.field974 = arg0.field974;
        this.field975 = arg0.field975;
        this.field966 = arg0.field966;
        this.field967 = arg0.field967;
        this.field968 = arg0.field968;
        this.field969 = arg0.field969;
        this.field965 = arg1.field965;
        this.field978 = arg1.field978;
        this.field977 = arg1.field977;
        this.field980 = 1;
    }

    @ObfuscatedName("am.m(II)Lcl;")
    public final class100 method805(int arg0) {
        if (this.field993 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field994[var3] && this.field994[var3] != 0) {
                    var2 = this.field993[var3];
                }
            }
            if (var2 != -1) {
                return method2570(var2).method805(1);
            }
        }
        class100 var4 = class100.method1925(Statics.field957, this.field964, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field997 != 128 || this.field998 != 128 || this.field963 != 128) {
            var4.method1941(this.field997, this.field998, this.field963);
        }
        if (this.field966 != null) {
            for (int var5 = 0; var5 < this.field966.length; var5++) {
                var4.method1938(this.field966[var5], this.field967[var5]);
            }
        }
        if (this.field968 != null) {
            for (int var6 = 0; var6 < this.field968.length; var6++) {
                var4.method1959(this.field968[var6], this.field969[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("am.s(II)Ldf;")
    public final class111 method793(int arg0) {
        if (this.field993 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field994[var3] && this.field994[var3] != 0) {
                    var2 = this.field993[var3];
                }
            }
            if (var2 != -1) {
                return method2570(var2).method793(1);
            }
        }
        class111 var4 = (class111) field976.method3087((long) this.field996);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method1925(Statics.field957, this.field964, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field997 != 128 || this.field998 != 128 || this.field963 != 128) {
            var5.method1941(this.field997, this.field998, this.field963);
        }
        if (this.field966 != null) {
            for (int var6 = 0; var6 < this.field966.length; var6++) {
                var5.method1938(this.field966[var6], this.field967[var6]);
            }
        }
        if (this.field968 != null) {
            for (int var7 = 0; var7 < this.field968.length; var7++) {
                var5.method1959(this.field968[var7], this.field969[var7]);
            }
        }
        class111 var8 = var5.method1946(this.field1000 + 64, this.field1001 + 768, -50, -10, -50);
        var8.field1860 = true;
        field976.method3089(var8, (long) this.field996);
        return var8;
    }

    @ObfuscatedName("am.p(II)Lam;")
    public class39 method799(int arg0) {
        if (this.field993 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field994[var3] && this.field994[var3] != 0) {
                    var2 = this.field993[var3];
                }
            }
            if (var2 != -1) {
                return method2570(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("w.w(IIIIZI)Lcu;")
    public static final class85 method110(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field961.method3087(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method2570(arg0);
        if (arg1 > 1 && var8.field993 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field994[var10] && var8.field994[var10] != 0) {
                    var9 = var8.field993[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2570(var9);
            }
        }
        class111 var11 = var8.method793(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field995 != -1) {
            var12 = method110(var8.field987, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1465;
        int var14 = Statics.field1464;
        int var15 = Statics.field1461;
        int[] var16 = new int[4];
        class88.method1695(var16);
        class85 var17 = new class85(36, 32);
        class88.method1710(var17.field1449, 36, 32);
        class88.method1697();
        class103.method2012();
        class103.method2015(16, 16);
        class103.field1742 = false;
        int var18 = var8.field956;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1763[var8.field971] * var18 >> 16;
        int var20 = class103.field1757[var8.field971] * var18 >> 16;
        var11.method2121();
        var11.method2133(0, var8.field962, var8.field973, var8.field971, var8.field974, var8.field975 + var11.field1521 / 2 + var19, var8.field975 + var20);
        if (arg2 >= 1) {
            var17.method1667(1);
        }
        if (arg2 >= 2) {
            var17.method1667(16777215);
        }
        if (arg3 != 0) {
            var17.method1604(arg3);
        }
        class88.method1710(var17.field1449, 36, 32);
        if (var8.field995 != -1) {
            var12.method1596(0, 0);
        }
        if (!arg4 && (var8.field980 == 1 || arg1 != 1) && arg1 != -1) {
            class181 var21 = Statics.field960;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class133.field2210 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class133.field2104 + "</col>";
            }
            var21.method3230(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field961.method3089(var17, var5);
        }
        class88.method1710(var13, var14, var15);
        class88.method1696(var16);
        class103.method2012();
        class103.field1742 = true;
        return var17;
    }

    @ObfuscatedName("am.r(ZI)Z")
    public final boolean method808(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field1005;
        int var4 = this.field991;
        if (arg0) {
            var2 = this.field988;
            var3 = this.field985;
            var4 = this.field999;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field957.method2823(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field957.method2823(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field957.method2823(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("am.n(ZI)Lcl;")
    public final class100 method801(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field1005;
        int var4 = this.field991;
        if (arg0) {
            var2 = this.field988;
            var3 = this.field985;
            var4 = this.field999;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method1925(Statics.field957, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method1925(Statics.field957, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method1925(Statics.field957, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field972 != 0) {
            var5.method1937(0, this.field972, 0);
        }
        if (arg0 && this.field986 != 0) {
            var5.method1937(0, this.field986, 0);
        }
        if (this.field966 != null) {
            for (int var10 = 0; var10 < this.field966.length; var10++) {
                var5.method1938(this.field966[var10], this.field967[var10]);
            }
        }
        if (this.field968 != null) {
            for (int var11 = 0; var11 < this.field968.length; var11++) {
                var5.method1959(this.field968[var11], this.field969[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("am.b(ZI)Z")
    public final boolean method814(boolean arg0) {
        int var2 = this.field989;
        int var3 = this.field990;
        if (arg0) {
            var2 = this.field983;
            var3 = this.field992;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field957.method2823(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field957.method2823(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("am.z(ZI)Lcl;")
    public final class100 method803(boolean arg0) {
        int var2 = this.field989;
        int var3 = this.field990;
        if (arg0) {
            var2 = this.field983;
            var3 = this.field992;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method1925(Statics.field957, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method1925(Statics.field957, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field966 != null) {
            for (int var7 = 0; var7 < this.field966.length; var7++) {
                var4.method1938(this.field966[var7], this.field967[var7]);
            }
        }
        if (this.field968 != null) {
            for (int var8 = 0; var8 < this.field968.length; var8++) {
                var4.method1959(this.field968[var8], this.field969[var8]);
            }
        }
        return var4;
    }
}
