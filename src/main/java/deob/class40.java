package deob;

@ObfuscatedName("ae")
public class class40 extends class174 {

    @ObfuscatedName("ae.j")
    public static class170 field985 = new class170(64);

    @ObfuscatedName("ae.o")
    public static class170 field1009 = new class170(50);

    @ObfuscatedName("ae.l")
    public static class170 field987 = new class170(100);

    @ObfuscatedName("ae.w")
    public int field988;

    @ObfuscatedName("ae.c")
    public int field991;

    @ObfuscatedName("ae.z")
    public String field990 = "null";

    @ObfuscatedName("ae.f")
    public short[] field1022;

    @ObfuscatedName("ae.a")
    public short[] field986;

    @ObfuscatedName("ae.d")
    public short[] field993;

    @ObfuscatedName("ae.e")
    public short[] field994;

    @ObfuscatedName("ae.y")
    public int field999 = 2000;

    @ObfuscatedName("ae.k")
    public int field1007 = 0;

    @ObfuscatedName("ae.h")
    public int field997 = 0;

    @ObfuscatedName("ae.x")
    public int field1005 = 0;

    @ObfuscatedName("ae.b")
    public int field992 = 0;

    @ObfuscatedName("ae.n")
    public int field1000 = 0;

    @ObfuscatedName("ae.q")
    public int field1001 = 0;

    @ObfuscatedName("ae.r")
    public int field1002 = 1;

    @ObfuscatedName("ae.u")
    public boolean field1003 = false;

    @ObfuscatedName("ae.p")
    public String[] field1004 = new String[] { null, null, class134.field2302, null, null };

    @ObfuscatedName("ae.t")
    public String[] field983 = new String[] { null, null, null, null, class134.field2085 };

    @ObfuscatedName("ae.s")
    public int field1011 = -1;

    @ObfuscatedName("ae.ah")
    public int field995 = -1;

    @ObfuscatedName("ae.ar")
    public int field1008 = 0;

    @ObfuscatedName("ae.ac")
    public int field1012 = -1;

    @ObfuscatedName("ae.as")
    public int field1010 = -1;

    @ObfuscatedName("ae.ag")
    public int field989 = 0;

    @ObfuscatedName("ae.ak")
    public int field1015 = -1;

    @ObfuscatedName("ae.am")
    public int field1013 = -1;

    @ObfuscatedName("ae.ap")
    public int field1014 = -1;

    @ObfuscatedName("ae.au")
    public int field984 = -1;

    @ObfuscatedName("ae.aq")
    public int field1016 = -1;

    @ObfuscatedName("ae.at")
    public int field1017 = -1;

    @ObfuscatedName("ae.aw")
    public int[] field1018;

    @ObfuscatedName("ae.ai")
    public int[] field1019;

    @ObfuscatedName("ae.ae")
    public int field1020 = -1;

    @ObfuscatedName("ae.ab")
    public int field1021 = -1;

    @ObfuscatedName("ae.ay")
    public int field1006 = 128;

    @ObfuscatedName("ae.ax")
    public int field1023 = 128;

    @ObfuscatedName("ae.ao")
    public int field1024 = 128;

    @ObfuscatedName("ae.al")
    public int field1025 = 0;

    @ObfuscatedName("ae.az")
    public int field1026 = 0;

    @ObfuscatedName("ae.aj")
    public int field1027 = 0;

    @ObfuscatedName("ae.i(Ler;Ler;ZLgb;I)V")
    public static void method896(class152 arg0, class152 arg1, boolean arg2, class183 arg3) {
        Statics.field998 = arg0;
        Statics.field1272 = arg1;
        Statics.field996 = arg2;
        Statics.field998.method3088(10);
        Statics.field2329 = arg3;
    }

    @ObfuscatedName("ah.v(II)Lae;")
    public static class40 method259(int arg0) {
        class40 var1 = (class40) field985.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field998.method3032(10, arg0);
        class40 var3 = new class40();
        var3.field988 = arg0;
        if (var2 != null) {
            var3.method860(new class127(var2));
        }
        var3.method888();
        if (var3.field1021 != -1) {
            var3.method853(method259(var3.field1021), method259(var3.field1020));
        }
        if (!Statics.field996 && var3.field1003) {
            var3.field990 = class134.field2186;
            var3.field1004 = null;
            var3.field983 = null;
            var3.field1027 = 0;
        }
        field985.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.m(I)V")
    public void method888() {
    }

    @ObfuscatedName("ae.j(Lda;B)V")
    public void method860(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method851(arg0, var2);
        }
    }

    @ObfuscatedName("ae.o(Lda;II)V")
    public void method851(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field991 = arg0.method2493();
        } else if (arg1 == 2) {
            this.field990 = arg0.method2500();
        } else if (arg1 == 4) {
            this.field999 = arg0.method2493();
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2493();
        } else if (arg1 == 6) {
            this.field997 = arg0.method2493();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2493();
            if (this.field992 > 32767) {
                this.field992 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1000 = arg0.method2493();
            if (this.field1000 > 32767) {
                this.field1000 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1001 = 1;
        } else if (arg1 == 12) {
            this.field1002 = arg0.method2668();
        } else if (arg1 == 16) {
            this.field1003 = true;
        } else if (arg1 == 23) {
            this.field1011 = arg0.method2493();
            this.field1008 = arg0.method2491();
        } else if (arg1 == 24) {
            this.field995 = arg0.method2493();
        } else if (arg1 == 25) {
            this.field1012 = arg0.method2493();
            this.field989 = arg0.method2491();
        } else if (arg1 == 26) {
            this.field1010 = arg0.method2493();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1004[arg1 - 30] = arg0.method2500();
            if (this.field1004[arg1 - 30].equalsIgnoreCase(class134.field2246)) {
                this.field1004[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field983[arg1 - 35] = arg0.method2500();
        } else if (arg1 == 40) {
            int var3 = arg0.method2491();
            this.field1022 = new short[var3];
            this.field986 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1022[var4] = (short) arg0.method2493();
                this.field986[var4] = (short) arg0.method2493();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2491();
            this.field993 = new short[var5];
            this.field994 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field993[var6] = (short) arg0.method2493();
                this.field994[var6] = (short) arg0.method2493();
            }
        } else if (arg1 == 78) {
            this.field1015 = arg0.method2493();
        } else if (arg1 == 79) {
            this.field1013 = arg0.method2493();
        } else if (arg1 == 90) {
            this.field1014 = arg0.method2493();
        } else if (arg1 == 91) {
            this.field1016 = arg0.method2493();
        } else if (arg1 == 92) {
            this.field984 = arg0.method2493();
        } else if (arg1 == 93) {
            this.field1017 = arg0.method2493();
        } else if (arg1 == 95) {
            this.field1005 = arg0.method2493();
        } else if (arg1 == 97) {
            this.field1020 = arg0.method2493();
        } else if (arg1 == 98) {
            this.field1021 = arg0.method2493();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1018 == null) {
                this.field1018 = new int[10];
                this.field1019 = new int[10];
            }
            this.field1018[arg1 - 100] = arg0.method2493();
            this.field1019[arg1 - 100] = arg0.method2493();
        } else if (arg1 == 110) {
            this.field1006 = arg0.method2493();
        } else if (arg1 == 111) {
            this.field1023 = arg0.method2493();
        } else if (arg1 == 112) {
            this.field1024 = arg0.method2493();
        } else if (arg1 == 113) {
            this.field1025 = arg0.method2492();
        } else if (arg1 == 114) {
            this.field1026 = arg0.method2492();
        } else if (arg1 == 115) {
            this.field1027 = arg0.method2491();
        }
    }

    @ObfuscatedName("ae.l(Lae;Lae;I)V")
    public void method853(class40 arg0, class40 arg1) {
        this.field991 = arg0.field991;
        this.field999 = arg0.field999;
        this.field1007 = arg0.field1007;
        this.field997 = arg0.field997;
        this.field1005 = arg0.field1005;
        this.field992 = arg0.field992;
        this.field1000 = arg0.field1000;
        this.field1022 = arg0.field1022;
        this.field986 = arg0.field986;
        this.field993 = arg0.field993;
        this.field994 = arg0.field994;
        this.field990 = arg1.field990;
        this.field1003 = arg1.field1003;
        this.field1002 = arg1.field1002;
        this.field1001 = 1;
    }

    @ObfuscatedName("ae.g(II)Lcw;")
    public final class101 method854(int arg0) {
        if (this.field1018 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1019[var3] && this.field1019[var3] != 0) {
                    var2 = this.field1018[var3];
                }
            }
            if (var2 != -1) {
                return method259(var2).method854(1);
            }
        }
        class101 var4 = class101.method2081(Statics.field1272, this.field991, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1006 != 128 || this.field1023 != 128 || this.field1024 != 128) {
            var4.method2098(this.field1006, this.field1023, this.field1024);
        }
        if (this.field1022 != null) {
            for (int var5 = 0; var5 < this.field1022.length; var5++) {
                var4.method2095(this.field1022[var5], this.field986[var5]);
            }
        }
        if (this.field993 != null) {
            for (int var6 = 0; var6 < this.field993.length; var6++) {
                var4.method2152(this.field993[var6], this.field994[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.w(II)Ldl;")
    public final class112 method887(int arg0) {
        if (this.field1018 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1019[var3] && this.field1019[var3] != 0) {
                    var2 = this.field1018[var3];
                }
            }
            if (var2 != -1) {
                return method259(var2).method887(1);
            }
        }
        class112 var4 = (class112) field1009.method3308((long) this.field988);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2081(Statics.field1272, this.field991, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1006 != 128 || this.field1023 != 128 || this.field1024 != 128) {
            var5.method2098(this.field1006, this.field1023, this.field1024);
        }
        if (this.field1022 != null) {
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var5.method2095(this.field1022[var6], this.field986[var6]);
            }
        }
        if (this.field993 != null) {
            for (int var7 = 0; var7 < this.field993.length; var7++) {
                var5.method2152(this.field993[var7], this.field994[var7]);
            }
        }
        class112 var8 = var5.method2102(this.field1025 + 64, this.field1026 * 5 + 768, -50, -10, -50);
        var8.field1889 = true;
        field1009.method3307(var8, (long) this.field988);
        return var8;
    }

    @ObfuscatedName("ae.c(II)Lae;")
    public class40 method871(int arg0) {
        if (this.field1018 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1019[var3] && this.field1019[var3] != 0) {
                    var2 = this.field1018[var3];
                }
            }
            if (var2 != -1) {
                return method259(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ae.f(ZI)Z")
    public final boolean method857(boolean arg0) {
        int var2 = this.field1011;
        int var3 = this.field995;
        int var4 = this.field1015;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1010;
            var4 = this.field1013;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1272.method3105(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1272.method3105(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1272.method3105(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ae.a(ZI)Lcw;")
    public final class101 method858(boolean arg0) {
        int var2 = this.field1011;
        int var3 = this.field995;
        int var4 = this.field1015;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1010;
            var4 = this.field1013;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2081(Statics.field1272, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2081(Statics.field1272, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2081(Statics.field1272, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1008 != 0) {
            var5.method2161(0, this.field1008, 0);
        }
        if (arg0 && this.field989 != 0) {
            var5.method2161(0, this.field989, 0);
        }
        if (this.field1022 != null) {
            for (int var10 = 0; var10 < this.field1022.length; var10++) {
                var5.method2095(this.field1022[var10], this.field986[var10]);
            }
        }
        if (this.field993 != null) {
            for (int var11 = 0; var11 < this.field993.length; var11++) {
                var5.method2152(this.field993[var11], this.field994[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ae.d(ZI)Z")
    public final boolean method859(boolean arg0) {
        int var2 = this.field1014;
        int var3 = this.field984;
        if (arg0) {
            var2 = this.field1016;
            var3 = this.field1017;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1272.method3105(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1272.method3105(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ae.e(ZB)Lcw;")
    public final class101 method862(boolean arg0) {
        int var2 = this.field1014;
        int var3 = this.field984;
        if (arg0) {
            var2 = this.field1016;
            var3 = this.field1017;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2081(Statics.field1272, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2081(Statics.field1272, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1022 != null) {
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                var4.method2095(this.field1022[var7], this.field986[var7]);
            }
        }
        if (this.field993 != null) {
            for (int var8 = 0; var8 < this.field993.length; var8++) {
                var4.method2152(this.field993[var8], this.field994[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.y(I)V")
    public static void method655() {
        field987.method3311();
    }

    @ObfuscatedName("ae.k(ZI)V")
    public static void method898(boolean arg0) {
        if (Statics.field996 != arg0) {
            field985.method3311();
            field1009.method3311();
            field987.method3311();
            Statics.field996 = arg0;
        }
    }
}
