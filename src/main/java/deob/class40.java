package deob;

@ObfuscatedName("az")
public class class40 extends class174 {

    @ObfuscatedName("az.o")
    public static class170 field967 = new class170(64);

    @ObfuscatedName("az.a")
    public static class170 field968 = new class170(50);

    @ObfuscatedName("az.h")
    public static class170 field969 = new class170(100);

    @ObfuscatedName("az.f")
    public int field996;

    @ObfuscatedName("az.q")
    public int field987;

    @ObfuscatedName("az.l")
    public String field1008 = "null";

    @ObfuscatedName("az.d")
    public short[] field974;

    @ObfuscatedName("az.z")
    public short[] field975;

    @ObfuscatedName("az.n")
    public short[] field976;

    @ObfuscatedName("az.t")
    public short[] field977;

    @ObfuscatedName("az.w")
    public int field978 = 2000;

    @ObfuscatedName("az.r")
    public int field979 = 0;

    @ObfuscatedName("az.x")
    public int field980 = 0;

    @ObfuscatedName("az.v")
    public int field1010 = 0;

    @ObfuscatedName("az.y")
    public int field992 = 0;

    @ObfuscatedName("az.k")
    public int field983 = 0;

    @ObfuscatedName("az.p")
    public int field984 = 0;

    @ObfuscatedName("az.s")
    public int field985 = 1;

    @ObfuscatedName("az.m")
    public boolean field986 = false;

    @ObfuscatedName("az.c")
    public String[] field997 = new String[] { null, null, class135.field2098, null, null };

    @ObfuscatedName("az.i")
    public String[] field988 = new String[] { null, null, null, null, class135.field2099 };

    @ObfuscatedName("az.u")
    public int field989 = -1;

    @ObfuscatedName("az.at")
    public int field990 = -1;

    @ObfuscatedName("az.as")
    public int field1004 = 0;

    @ObfuscatedName("az.ax")
    public int field981 = -1;

    @ObfuscatedName("az.ao")
    public int field993 = -1;

    @ObfuscatedName("az.aq")
    public int field994 = 0;

    @ObfuscatedName("az.am")
    public int field995 = -1;

    @ObfuscatedName("az.al")
    public int field1002 = -1;

    @ObfuscatedName("az.ab")
    public int field965 = -1;

    @ObfuscatedName("az.aw")
    public int field998 = -1;

    @ObfuscatedName("az.ah")
    public int field1005 = -1;

    @ObfuscatedName("az.aa")
    public int field1000 = -1;

    @ObfuscatedName("az.ay")
    public int[] field971;

    @ObfuscatedName("az.ak")
    public int[] field991;

    @ObfuscatedName("az.az")
    public int field1003 = -1;

    @ObfuscatedName("az.ap")
    public int field973 = -1;

    @ObfuscatedName("az.af")
    public int field999 = 128;

    @ObfuscatedName("az.au")
    public int field1006 = 128;

    @ObfuscatedName("az.an")
    public int field1007 = 128;

    @ObfuscatedName("az.av")
    public int field1001 = 0;

    @ObfuscatedName("az.ac")
    public int field1009 = 0;

    @ObfuscatedName("az.ae")
    public int field972 = 0;

    @ObfuscatedName("am.b(IB)Laz;")
    public static class40 method672(int arg0) {
        class40 var1 = (class40) field967.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field982.method3026(10, arg0);
        class40 var3 = new class40();
        var3.field996 = arg0;
        if (var2 != null) {
            var3.method815(new class126(var2));
        }
        var3.method837();
        if (var3.field973 != -1) {
            var3.method825(method672(var3.field973), method672(var3.field1003));
        }
        if (!Statics.field2772 && var3.field986) {
            var3.field1008 = class135.field2222;
            var3.field997 = null;
            var3.field988 = null;
            var3.field972 = 0;
        }
        field967.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.e(I)V")
    public void method837() {
    }

    @ObfuscatedName("az.g(Ldv;I)V")
    public void method815(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("az.o(Ldv;II)V")
    public void method816(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field987 = arg0.method2572();
        } else if (arg1 == 2) {
            this.field1008 = arg0.method2444();
        } else if (arg1 == 4) {
            this.field978 = arg0.method2572();
        } else if (arg1 == 5) {
            this.field979 = arg0.method2572();
        } else if (arg1 == 6) {
            this.field980 = arg0.method2572();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2572();
            if (this.field992 > 32767) {
                this.field992 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field983 = arg0.method2572();
            if (this.field983 > 32767) {
                this.field983 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field984 = 1;
        } else if (arg1 == 12) {
            this.field985 = arg0.method2439();
        } else if (arg1 == 16) {
            this.field986 = true;
        } else if (arg1 == 23) {
            this.field989 = arg0.method2572();
            this.field1004 = arg0.method2436();
        } else if (arg1 == 24) {
            this.field990 = arg0.method2572();
        } else if (arg1 == 25) {
            this.field981 = arg0.method2572();
            this.field994 = arg0.method2436();
        } else if (arg1 == 26) {
            this.field993 = arg0.method2572();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field997[arg1 - 30] = arg0.method2444();
            if (this.field997[arg1 - 30].equalsIgnoreCase(class135.field2241)) {
                this.field997[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field988[arg1 - 35] = arg0.method2444();
        } else if (arg1 == 40) {
            int var3 = arg0.method2436();
            this.field974 = new short[var3];
            this.field975 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field974[var4] = (short) arg0.method2572();
                this.field975[var4] = (short) arg0.method2572();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2436();
            this.field976 = new short[var5];
            this.field977 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field976[var6] = (short) arg0.method2572();
                this.field977[var6] = (short) arg0.method2572();
            }
        } else if (arg1 == 78) {
            this.field995 = arg0.method2572();
        } else if (arg1 == 79) {
            this.field1002 = arg0.method2572();
        } else if (arg1 == 90) {
            this.field965 = arg0.method2572();
        } else if (arg1 == 91) {
            this.field1005 = arg0.method2572();
        } else if (arg1 == 92) {
            this.field998 = arg0.method2572();
        } else if (arg1 == 93) {
            this.field1000 = arg0.method2572();
        } else if (arg1 == 95) {
            this.field1010 = arg0.method2572();
        } else if (arg1 == 97) {
            this.field1003 = arg0.method2572();
        } else if (arg1 == 98) {
            this.field973 = arg0.method2572();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field971 == null) {
                this.field971 = new int[10];
                this.field991 = new int[10];
            }
            this.field971[arg1 - 100] = arg0.method2572();
            this.field991[arg1 - 100] = arg0.method2572();
        } else if (arg1 == 110) {
            this.field999 = arg0.method2572();
        } else if (arg1 == 111) {
            this.field1006 = arg0.method2572();
        } else if (arg1 == 112) {
            this.field1007 = arg0.method2572();
        } else if (arg1 == 113) {
            this.field1001 = arg0.method2437();
        } else if (arg1 == 114) {
            this.field1009 = arg0.method2437();
        } else if (arg1 == 115) {
            this.field972 = arg0.method2436();
        }
    }

    @ObfuscatedName("az.a(Laz;Laz;I)V")
    public void method825(class40 arg0, class40 arg1) {
        this.field987 = arg0.field987;
        this.field978 = arg0.field978;
        this.field979 = arg0.field979;
        this.field980 = arg0.field980;
        this.field1010 = arg0.field1010;
        this.field992 = arg0.field992;
        this.field983 = arg0.field983;
        this.field974 = arg0.field974;
        this.field975 = arg0.field975;
        this.field976 = arg0.field976;
        this.field977 = arg0.field977;
        this.field1008 = arg1.field1008;
        this.field986 = arg1.field986;
        this.field985 = arg1.field985;
        this.field984 = 1;
    }

    @ObfuscatedName("az.h(II)Lcu;")
    public final class101 method836(int arg0) {
        if (this.field971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field991[var3] && this.field991[var3] != 0) {
                    var2 = this.field971[var3];
                }
            }
            if (var2 != -1) {
                return method672(var2).method836(1);
            }
        }
        class101 var4 = class101.method2032(Statics.field966, this.field987, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field999 != 128 || this.field1006 != 128 || this.field1007 != 128) {
            var4.method2042(this.field999, this.field1006, this.field1007);
        }
        if (this.field974 != null) {
            for (int var5 = 0; var5 < this.field974.length; var5++) {
                var4.method2047(this.field974[var5], this.field975[var5]);
            }
        }
        if (this.field976 != null) {
            for (int var6 = 0; var6 < this.field976.length; var6++) {
                var4.method2048(this.field976[var6], this.field977[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.j(IB)Ldp;")
    public final class112 method850(int arg0) {
        if (this.field971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field991[var3] && this.field991[var3] != 0) {
                    var2 = this.field971[var3];
                }
            }
            if (var2 != -1) {
                return method672(var2).method850(1);
            }
        }
        class112 var4 = (class112) field968.method3248((long) this.field996);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2032(Statics.field966, this.field987, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field999 != 128 || this.field1006 != 128 || this.field1007 != 128) {
            var5.method2042(this.field999, this.field1006, this.field1007);
        }
        if (this.field974 != null) {
            for (int var6 = 0; var6 < this.field974.length; var6++) {
                var5.method2047(this.field974[var6], this.field975[var6]);
            }
        }
        if (this.field976 != null) {
            for (int var7 = 0; var7 < this.field976.length; var7++) {
                var5.method2048(this.field976[var7], this.field977[var7]);
            }
        }
        class112 var8 = var5.method2056(this.field1001 + 64, this.field1009 * 5 + 768, -50, -10, -50);
        var8.field1868 = true;
        field968.method3252(var8, (long) this.field996);
        return var8;
    }

    @ObfuscatedName("az.f(IB)Laz;")
    public class40 method818(int arg0) {
        if (this.field971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field991[var3] && this.field991[var3] != 0) {
                    var2 = this.field971[var3];
                }
            }
            if (var2 != -1) {
                return method672(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("az.l(ZI)Z")
    public final boolean method821(boolean arg0) {
        int var2 = this.field989;
        int var3 = this.field990;
        int var4 = this.field995;
        if (arg0) {
            var2 = this.field981;
            var3 = this.field993;
            var4 = this.field1002;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field966.method2998(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field966.method2998(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field966.method2998(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("az.d(ZI)Lcu;")
    public final class101 method838(boolean arg0) {
        int var2 = this.field989;
        int var3 = this.field990;
        int var4 = this.field995;
        if (arg0) {
            var2 = this.field981;
            var3 = this.field993;
            var4 = this.field1002;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2032(Statics.field966, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2032(Statics.field966, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2032(Statics.field966, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1004 != 0) {
            var5.method2071(0, this.field1004, 0);
        }
        if (arg0 && this.field994 != 0) {
            var5.method2071(0, this.field994, 0);
        }
        if (this.field974 != null) {
            for (int var10 = 0; var10 < this.field974.length; var10++) {
                var5.method2047(this.field974[var10], this.field975[var10]);
            }
        }
        if (this.field976 != null) {
            for (int var11 = 0; var11 < this.field976.length; var11++) {
                var5.method2048(this.field976[var11], this.field977[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("az.z(ZI)Z")
    public final boolean method822(boolean arg0) {
        int var2 = this.field965;
        int var3 = this.field998;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1000;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field966.method2998(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field966.method2998(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("az.n(ZI)Lcu;")
    public final class101 method823(boolean arg0) {
        int var2 = this.field965;
        int var3 = this.field998;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1000;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2032(Statics.field966, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2032(Statics.field966, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field974 != null) {
            for (int var7 = 0; var7 < this.field974.length; var7++) {
                var4.method2047(this.field974[var7], this.field975[var7]);
            }
        }
        if (this.field976 != null) {
            for (int var8 = 0; var8 < this.field976.length; var8++) {
                var4.method2048(this.field976[var8], this.field977[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("r.t(I)V")
    public static void method132() {
        field967.method3251();
        field968.method3251();
        field969.method3251();
    }
}
