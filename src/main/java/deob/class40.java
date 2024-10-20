package deob;

@ObfuscatedName("aj")
public class class40 extends class174 {

    @ObfuscatedName("aj.t")
    public static class170 field965 = new class170(64);

    @ObfuscatedName("aj.k")
    public static class170 field966 = new class170(50);

    @ObfuscatedName("aj.x")
    public static class170 field967 = new class170(100);

    @ObfuscatedName("aj.g")
    public int field968;

    @ObfuscatedName("aj.n")
    public int field982;

    @ObfuscatedName("aj.q")
    public String field970 = "null";

    @ObfuscatedName("aj.i")
    public short[] field971;

    @ObfuscatedName("aj.p")
    public short[] field972;

    @ObfuscatedName("aj.e")
    public short[] field973;

    @ObfuscatedName("aj.o")
    public short[] field974;

    @ObfuscatedName("aj.j")
    public int field1010 = 2000;

    @ObfuscatedName("aj.s")
    public int field1005 = 0;

    @ObfuscatedName("aj.b")
    public int field964 = 0;

    @ObfuscatedName("aj.c")
    public int field978 = 0;

    @ObfuscatedName("aj.m")
    public int field962 = 0;

    @ObfuscatedName("aj.z")
    public int field979 = 0;

    @ObfuscatedName("aj.h")
    public int field981 = 0;

    @ObfuscatedName("aj.f")
    public int field993 = 1;

    @ObfuscatedName("aj.w")
    public boolean field998 = false;

    @ObfuscatedName("aj.l")
    public String[] field984 = new String[] { null, null, class134.field2128, null, null };

    @ObfuscatedName("aj.d")
    public String[] field994 = new String[] { null, null, null, null, class134.field2070 };

    @ObfuscatedName("aj.y")
    public int field986 = -1;

    @ObfuscatedName("aj.ah")
    public int field987 = -1;

    @ObfuscatedName("aj.ad")
    public int field988 = 0;

    @ObfuscatedName("aj.au")
    public int field989 = -1;

    @ObfuscatedName("aj.as")
    public int field990 = -1;

    @ObfuscatedName("aj.ag")
    public int field1008 = 0;

    @ObfuscatedName("aj.ab")
    public int field992 = -1;

    @ObfuscatedName("aj.aq")
    public int field977 = -1;

    @ObfuscatedName("aj.af")
    public int field1007 = -1;

    @ObfuscatedName("aj.ay")
    public int field995 = -1;

    @ObfuscatedName("aj.ax")
    public int field996 = -1;

    @ObfuscatedName("aj.aa")
    public int field997 = -1;

    @ObfuscatedName("aj.ak")
    public int[] field991;

    @ObfuscatedName("aj.ac")
    public int[] field999;

    @ObfuscatedName("aj.aj")
    public int field980 = -1;

    @ObfuscatedName("aj.av")
    public int field1001 = -1;

    @ObfuscatedName("aj.al")
    public int field1002 = 128;

    @ObfuscatedName("aj.an")
    public int field1003 = 128;

    @ObfuscatedName("aj.ap")
    public int field1004 = 128;

    @ObfuscatedName("aj.at")
    public int field969 = 0;

    @ObfuscatedName("aj.ae")
    public int field1006 = 0;

    @ObfuscatedName("aj.aw")
    public int field976 = 0;

    @ObfuscatedName("aj.r(I)V")
    public void method773() {
    }

    @ObfuscatedName("aj.u(Ldf;B)V")
    public void method792(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("aj.t(Ldf;II)V")
    public void method775(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field982 = arg0.method2373();
        } else if (arg1 == 2) {
            this.field970 = arg0.method2386();
        } else if (arg1 == 4) {
            this.field1010 = arg0.method2373();
        } else if (arg1 == 5) {
            this.field1005 = arg0.method2373();
        } else if (arg1 == 6) {
            this.field964 = arg0.method2373();
        } else if (arg1 == 7) {
            this.field962 = arg0.method2373();
            if (this.field962 > 32767) {
                this.field962 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field979 = arg0.method2373();
            if (this.field979 > 32767) {
                this.field979 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field981 = 1;
        } else if (arg1 == 12) {
            this.field993 = arg0.method2383();
        } else if (arg1 == 16) {
            this.field998 = true;
        } else if (arg1 == 23) {
            this.field986 = arg0.method2373();
            this.field988 = arg0.method2481();
        } else if (arg1 == 24) {
            this.field987 = arg0.method2373();
        } else if (arg1 == 25) {
            this.field989 = arg0.method2373();
            this.field1008 = arg0.method2481();
        } else if (arg1 == 26) {
            this.field990 = arg0.method2373();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field984[arg1 - 30] = arg0.method2386();
            if (this.field984[arg1 - 30].equalsIgnoreCase(class134.field2234)) {
                this.field984[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field994[arg1 - 35] = arg0.method2386();
        } else if (arg1 == 40) {
            int var3 = arg0.method2481();
            this.field971 = new short[var3];
            this.field972 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field971[var4] = (short) arg0.method2373();
                this.field972[var4] = (short) arg0.method2373();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2481();
            this.field973 = new short[var5];
            this.field974 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field973[var6] = (short) arg0.method2373();
                this.field974[var6] = (short) arg0.method2373();
            }
        } else if (arg1 == 78) {
            this.field992 = arg0.method2373();
        } else if (arg1 == 79) {
            this.field977 = arg0.method2373();
        } else if (arg1 == 90) {
            this.field1007 = arg0.method2373();
        } else if (arg1 == 91) {
            this.field996 = arg0.method2373();
        } else if (arg1 == 92) {
            this.field995 = arg0.method2373();
        } else if (arg1 == 93) {
            this.field997 = arg0.method2373();
        } else if (arg1 == 95) {
            this.field978 = arg0.method2373();
        } else if (arg1 == 97) {
            this.field980 = arg0.method2373();
        } else if (arg1 == 98) {
            this.field1001 = arg0.method2373();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field991 == null) {
                this.field991 = new int[10];
                this.field999 = new int[10];
            }
            this.field991[arg1 - 100] = arg0.method2373();
            this.field999[arg1 - 100] = arg0.method2373();
        } else if (arg1 == 110) {
            this.field1002 = arg0.method2373();
        } else if (arg1 == 111) {
            this.field1003 = arg0.method2373();
        } else if (arg1 == 112) {
            this.field1004 = arg0.method2373();
        } else if (arg1 == 113) {
            this.field969 = arg0.method2379();
        } else if (arg1 == 114) {
            this.field1006 = arg0.method2379() * 5;
        } else if (arg1 == 115) {
            this.field976 = arg0.method2481();
        }
    }

    @ObfuscatedName("aj.k(Laj;Laj;I)V")
    public void method776(class40 arg0, class40 arg1) {
        this.field982 = arg0.field982;
        this.field1010 = arg0.field1010;
        this.field1005 = arg0.field1005;
        this.field964 = arg0.field964;
        this.field978 = arg0.field978;
        this.field962 = arg0.field962;
        this.field979 = arg0.field979;
        this.field971 = arg0.field971;
        this.field972 = arg0.field972;
        this.field973 = arg0.field973;
        this.field974 = arg0.field974;
        this.field970 = arg1.field970;
        this.field998 = arg1.field998;
        this.field993 = arg1.field993;
        this.field981 = 1;
    }

    @ObfuscatedName("aj.x(II)Lck;")
    public final class101 method777(int arg0) {
        if (this.field991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field999[var3] && this.field999[var3] != 0) {
                    var2 = this.field991[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method1799(var2).method777(1);
            }
        }
        class101 var4 = class101.method1993(Statics.field963, this.field982, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1002 != 128 || this.field1003 != 128 || this.field1004 != 128) {
            var4.method2009(this.field1002, this.field1003, this.field1004);
        }
        if (this.field971 != null) {
            for (int var5 = 0; var5 < this.field971.length; var5++) {
                var4.method2006(this.field971[var5], this.field972[var5]);
            }
        }
        if (this.field973 != null) {
            for (int var6 = 0; var6 < this.field973.length; var6++) {
                var4.method2007(this.field973[var6], this.field974[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.v(II)Ldw;")
    public final class112 method781(int arg0) {
        if (this.field991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field999[var3] && this.field999[var3] != 0) {
                    var2 = this.field991[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method1799(var2).method781(1);
            }
        }
        class112 var4 = (class112) field966.method3208((long) this.field968);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method1993(Statics.field963, this.field982, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1002 != 128 || this.field1003 != 128 || this.field1004 != 128) {
            var5.method2009(this.field1002, this.field1003, this.field1004);
        }
        if (this.field971 != null) {
            for (int var6 = 0; var6 < this.field971.length; var6++) {
                var5.method2006(this.field971[var6], this.field972[var6]);
            }
        }
        if (this.field973 != null) {
            for (int var7 = 0; var7 < this.field973.length; var7++) {
                var5.method2007(this.field973[var7], this.field974[var7]);
            }
        }
        class112 var8 = var5.method2014(this.field969 + 64, this.field1006 + 768, -50, -10, -50);
        var8.field1853 = true;
        field966.method3210(var8, (long) this.field968);
        return var8;
    }

    @ObfuscatedName("aj.g(II)Laj;")
    public class40 method779(int arg0) {
        if (this.field991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field999[var3] && this.field999[var3] != 0) {
                    var2 = this.field991[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method1799(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("b.q(IB)Ljava/lang/String;")
    public static final String method125(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class134.field2223 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class134.field2182 + "</col>";
        }
    }

    @ObfuscatedName("aj.i(ZB)Z")
    public final boolean method772(boolean arg0) {
        int var2 = this.field986;
        int var3 = this.field987;
        int var4 = this.field992;
        if (arg0) {
            var2 = this.field989;
            var3 = this.field990;
            var4 = this.field977;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field963.method2945(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field963.method2945(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field963.method2945(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.p(ZI)Lck;")
    public final class101 method796(boolean arg0) {
        int var2 = this.field986;
        int var3 = this.field987;
        int var4 = this.field992;
        if (arg0) {
            var2 = this.field989;
            var3 = this.field990;
            var4 = this.field977;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method1993(Statics.field963, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method1993(Statics.field963, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method1993(Statics.field963, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field988 != 0) {
            var5.method2036(0, this.field988, 0);
        }
        if (arg0 && this.field1008 != 0) {
            var5.method2036(0, this.field1008, 0);
        }
        if (this.field971 != null) {
            for (int var10 = 0; var10 < this.field971.length; var10++) {
                var5.method2006(this.field971[var10], this.field972[var10]);
            }
        }
        if (this.field973 != null) {
            for (int var11 = 0; var11 < this.field973.length; var11++) {
                var5.method2007(this.field973[var11], this.field974[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.e(ZI)Z")
    public final boolean method782(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field995;
        if (arg0) {
            var2 = this.field996;
            var3 = this.field997;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field963.method2945(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field963.method2945(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.o(ZI)Lck;")
    public final class101 method778(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field995;
        if (arg0) {
            var2 = this.field996;
            var3 = this.field997;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method1993(Statics.field963, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method1993(Statics.field963, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field971 != null) {
            for (int var7 = 0; var7 < this.field971.length; var7++) {
                var4.method2006(this.field971[var7], this.field972[var7]);
            }
        }
        if (this.field973 != null) {
            for (int var8 = 0; var8 < this.field973.length; var8++) {
                var4.method2007(this.field973[var8], this.field974[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("o.j(ZB)V")
    public static void method112(boolean arg0) {
        if (Statics.field975 != arg0) {
            field965.method3216();
            field966.method3216();
            field967.method3216();
            Statics.field975 = arg0;
        }
    }
}
