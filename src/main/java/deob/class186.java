package deob;

@ObfuscatedName("gu")
public class class186 extends class406 {

    @ObfuscatedName("gu.v")
    public static class256 field2015 = new class256(64);

    @ObfuscatedName("gu.c")
    public static class256 field2023 = new class256(64);

    @ObfuscatedName("gu.q")
    public static class256 field2017 = new class256(20);

    @ObfuscatedName("gu.a")
    public int field2018 = -1;

    @ObfuscatedName("gu.m")
    public int field2019 = 16777215;

    @ObfuscatedName("gu.u")
    public int field2020 = 70;

    @ObfuscatedName("gu.l")
    public int field2021 = -1;

    @ObfuscatedName("gu.z")
    public int field2022 = -1;

    @ObfuscatedName("gu.r")
    public int field2034 = -1;

    @ObfuscatedName("gu.y")
    public int field2029 = -1;

    @ObfuscatedName("gu.p")
    public int field2016 = 0;

    @ObfuscatedName("gu.e")
    public int field2026 = 0;

    @ObfuscatedName("gu.b")
    public int field2027 = -1;

    @ObfuscatedName("gu.x")
    public String field2028 = "";

    @ObfuscatedName("gu.f")
    public int field2033 = -1;

    @ObfuscatedName("gu.t")
    public int field2032 = 0;

    @ObfuscatedName("gu.j")
    public int[] field2031;

    @ObfuscatedName("gu.g")
    public int field2024 = -1;

    @ObfuscatedName("gu.ar")
    public int field2030 = -1;

    @ObfuscatedName("cj.s(II)Lgu;")
    public static class186 method2193(int arg0) {
        class186 var1 = (class186) field2015.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4649.method5179(32, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3210(new class444(var2));
        }
        field2015.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.h(Lqr;I)V")
    public void method3210(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3211(arg0, var2);
        }
    }

    @ObfuscatedName("gu.w(Lqr;II)V")
    public void method3211(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2018 = arg0.method6945();
        } else if (arg1 == 2) {
            this.field2019 = arg0.method7095();
        } else if (arg1 == 3) {
            this.field2021 = arg0.method6945();
        } else if (arg1 == 4) {
            this.field2034 = arg0.method6945();
        } else if (arg1 == 5) {
            this.field2022 = arg0.method6945();
        } else if (arg1 == 6) {
            this.field2029 = arg0.method6945();
        } else if (arg1 == 7) {
            this.field2016 = arg0.method6932();
        } else if (arg1 == 8) {
            this.field2028 = arg0.method7022();
        } else if (arg1 == 9) {
            this.field2020 = arg0.method7120();
        } else if (arg1 == 10) {
            this.field2026 = arg0.method6932();
        } else if (arg1 == 11) {
            this.field2027 = 0;
        } else if (arg1 == 12) {
            this.field2033 = arg0.method6929();
        } else if (arg1 == 13) {
            this.field2032 = arg0.method6932();
        } else if (arg1 == 14) {
            this.field2027 = arg0.method7120();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2024 = arg0.method7120();
            if (this.field2024 == 65535) {
                this.field2024 = -1;
            }
            this.field2030 = arg0.method7120();
            if (this.field2030 == 65535) {
                this.field2030 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7120();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6929();
            this.field2031 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2031[var5] = arg0.method7120();
                if (this.field2031[var5] == 65535) {
                    this.field2031[var5] = -1;
                }
            }
            this.field2031[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gu.v(I)Lgu;")
    public final class186 method3220() {
        int var1 = -1;
        if (this.field2024 != -1) {
            var1 = Statics.method2652(this.field2024);
        } else if (this.field2030 != -1) {
            var1 = class289.field3313[this.field2030];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2031.length - 1) {
            var2 = this.field2031[var1];
        } else {
            var2 = this.field2031[this.field2031.length - 1];
        }
        return var2 == -1 ? null : method2193(var2);
    }

    @ObfuscatedName("gu.c(II)Ljava/lang/String;")
    public String method3213(int arg0) {
        String var2 = this.field2028;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class344.method5168(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gu.q(I)Lqn;")
    public class457 method3214() {
        if (this.field2021 < 0) {
            return null;
        }
        class457 var1 = (class457) field2023.method4599((long) this.field2021);
        if (var1 != null) {
            return var1;
        }
        class457 var2 = class458.method4559(Statics.field2025, this.field2021, 0);
        if (var2 != null) {
            field2023.method4600(var2, (long) this.field2021);
        }
        return var2;
    }

    @ObfuscatedName("gu.i(B)Lqn;")
    public class457 method3215() {
        if (this.field2022 < 0) {
            return null;
        }
        class457 var1 = (class457) field2023.method4599((long) this.field2022);
        if (var1 != null) {
            return var1;
        }
        class457 var2 = class458.method4559(Statics.field2025, this.field2022, 0);
        if (var2 != null) {
            field2023.method4600(var2, (long) this.field2022);
        }
        return var2;
    }

    @ObfuscatedName("gu.k(I)Lqn;")
    public class457 method3219() {
        if (this.field2034 < 0) {
            return null;
        }
        class457 var1 = (class457) field2023.method4599((long) this.field2034);
        if (var1 != null) {
            return var1;
        }
        class457 var2 = class458.method4559(Statics.field2025, this.field2034, 0);
        if (var2 != null) {
            field2023.method4600(var2, (long) this.field2034);
        }
        return var2;
    }

    @ObfuscatedName("gu.o(B)Lqn;")
    public class457 method3226() {
        if (this.field2029 < 0) {
            return null;
        }
        class457 var1 = (class457) field2023.method4599((long) this.field2029);
        if (var1 != null) {
            return var1;
        }
        class457 var2 = class458.method4559(Statics.field2025, this.field2029, 0);
        if (var2 != null) {
            field2023.method4600(var2, (long) this.field2029);
        }
        return var2;
    }

    @ObfuscatedName("gu.n(I)Lmg;")
    public class350 method3218() {
        if (this.field2018 == -1) {
            return null;
        }
        class350 var1 = (class350) field2017.method4599((long) this.field2018);
        if (var1 != null) {
            return var1;
        }
        class316 var2 = Statics.field2025;
        class316 var3 = Statics.field2014;
        int var4 = this.field2018;
        class350 var5;
        if (class458.method3595(var2, var4, 0)) {
            byte[] var6 = var3.method5179(var4, 0);
            class350 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class350 var8 = new class350(var6, Statics.field4810, Statics.field1029, Statics.field4812, Statics.field325, Statics.field4811, Statics.field1982);
                Statics.field4810 = null;
                Statics.field1029 = null;
                Statics.field4812 = null;
                Statics.field325 = null;
                Statics.field4811 = null;
                Statics.field1982 = (byte[][]) null;
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2017.method4600(var5, (long) this.field2018);
        }
        return var5;
    }

    @ObfuscatedName("ey.d(I)V")
    public static void method2784() {
        field2015.method4603();
        field2023.method4603();
        field2017.method4603();
    }
}
