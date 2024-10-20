package deob;

@ObfuscatedName("gr")
public class class186 extends class405 {

    @ObfuscatedName("gr.f")
    public static class256 field2019 = new class256(64);

    @ObfuscatedName("gr.j")
    public static class256 field2025 = new class256(64);

    @ObfuscatedName("gr.e")
    public static class256 field2021 = new class256(20);

    @ObfuscatedName("gr.t")
    public int field2040 = -1;

    @ObfuscatedName("gr.z")
    public int field2037 = 16777215;

    @ObfuscatedName("gr.r")
    public int field2027 = 70;

    @ObfuscatedName("gr.u")
    public int field2022 = -1;

    @ObfuscatedName("gr.k")
    public int field2017 = -1;

    @ObfuscatedName("gr.h")
    public int field2030 = -1;

    @ObfuscatedName("gr.x")
    public int field2028 = -1;

    @ObfuscatedName("gr.l")
    public int field2032 = 0;

    @ObfuscatedName("gr.a")
    public int field2033 = 0;

    @ObfuscatedName("gr.p")
    public int field2031 = -1;

    @ObfuscatedName("gr.b")
    public String field2035 = "";

    @ObfuscatedName("gr.n")
    public int field2036 = -1;

    @ObfuscatedName("gr.o")
    public int field2020 = 0;

    @ObfuscatedName("gr.m")
    public int[] field2034;

    @ObfuscatedName("gr.d")
    public int field2039 = -1;

    @ObfuscatedName("gr.ad")
    public int field2029 = -1;

    @ObfuscatedName("da.c(II)Lgr;")
    public static class186 method2666(int arg0) {
        class186 var1 = (class186) field2019.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2038.method5305(32, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3294(new class443(var2));
        }
        field2019.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.v(Lqt;I)V")
    public void method3294(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3295(arg0, var2);
        }
    }

    @ObfuscatedName("gr.q(Lqt;II)V")
    public void method3295(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2040 = arg0.method7066();
        } else if (arg1 == 2) {
            this.field2037 = arg0.method7051();
        } else if (arg1 == 3) {
            this.field2022 = arg0.method7066();
        } else if (arg1 == 4) {
            this.field2030 = arg0.method7066();
        } else if (arg1 == 5) {
            this.field2017 = arg0.method7066();
        } else if (arg1 == 6) {
            this.field2028 = arg0.method7066();
        } else if (arg1 == 7) {
            this.field2032 = arg0.method7216();
        } else if (arg1 == 8) {
            this.field2035 = arg0.method7211();
        } else if (arg1 == 9) {
            this.field2027 = arg0.method7049();
        } else if (arg1 == 10) {
            this.field2033 = arg0.method7216();
        } else if (arg1 == 11) {
            this.field2031 = 0;
        } else if (arg1 == 12) {
            this.field2036 = arg0.method7047();
        } else if (arg1 == 13) {
            this.field2020 = arg0.method7216();
        } else if (arg1 == 14) {
            this.field2031 = arg0.method7049();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2039 = arg0.method7049();
            if (this.field2039 == 65535) {
                this.field2039 = -1;
            }
            this.field2029 = arg0.method7049();
            if (this.field2029 == 65535) {
                this.field2029 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7049();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7047();
            this.field2034 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2034[var5] = arg0.method7049();
                if (this.field2034[var5] == 65535) {
                    this.field2034[var5] = -1;
                }
            }
            this.field2034[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gr.f(I)Lgr;")
    public final class186 method3296() {
        int var1 = -1;
        if (this.field2039 != -1) {
            var1 = class288.method6395(this.field2039);
        } else if (this.field2029 != -1) {
            var1 = class288.field3326[this.field2029];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2034.length - 1) {
            var2 = this.field2034[var1];
        } else {
            var2 = this.field2034[this.field2034.length - 1];
        }
        return var2 == -1 ? null : method2666(var2);
    }

    @ObfuscatedName("gr.j(II)Ljava/lang/String;")
    public String method3310(int arg0) {
        String var2 = this.field2035;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class343.method3689(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gr.e(I)Lqe;")
    public class456 method3298() {
        if (this.field2022 < 0) {
            return null;
        }
        class456 var1 = (class456) field2025.method4691((long) this.field2022);
        if (var1 != null) {
            return var1;
        }
        class456 var2 = class457.method52(Statics.field2018, this.field2022, 0);
        if (var2 != null) {
            field2025.method4693(var2, (long) this.field2022);
        }
        return var2;
    }

    @ObfuscatedName("gr.g(B)Lqe;")
    public class456 method3318() {
        if (this.field2017 < 0) {
            return null;
        }
        class456 var1 = (class456) field2025.method4691((long) this.field2017);
        if (var1 != null) {
            return var1;
        }
        class456 var2 = class457.method52(Statics.field2018, this.field2017, 0);
        if (var2 != null) {
            field2025.method4693(var2, (long) this.field2017);
        }
        return var2;
    }

    @ObfuscatedName("gr.w(B)Lqe;")
    public class456 method3300() {
        if (this.field2030 < 0) {
            return null;
        }
        class456 var1 = (class456) field2025.method4691((long) this.field2030);
        if (var1 != null) {
            return var1;
        }
        class456 var2 = class457.method52(Statics.field2018, this.field2030, 0);
        if (var2 != null) {
            field2025.method4693(var2, (long) this.field2030);
        }
        return var2;
    }

    @ObfuscatedName("gr.y(B)Lqe;")
    public class456 method3301() {
        if (this.field2028 < 0) {
            return null;
        }
        class456 var1 = (class456) field2025.method4691((long) this.field2028);
        if (var1 != null) {
            return var1;
        }
        class456 var2 = class457.method52(Statics.field2018, this.field2028, 0);
        if (var2 != null) {
            field2025.method4693(var2, (long) this.field2028);
        }
        return var2;
    }

    @ObfuscatedName("gr.i(S)Lmt;")
    public class349 method3302() {
        if (this.field2040 == -1) {
            return null;
        }
        class349 var1 = (class349) field2021.method4691((long) this.field2040);
        if (var1 != null) {
            return var1;
        }
        class315 var2 = Statics.field2018;
        class315 var3 = Statics.field9;
        int var4 = this.field2040;
        class349 var5;
        if (class457.method6174(var2, var4, 0)) {
            byte[] var6 = var3.method5305(var4, 0);
            class349 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class349 var8 = new class349(var6, Statics.field4648, Statics.field1664, Statics.field4262, Statics.field4809, Statics.field73, Statics.field4609);
                Statics.field4648 = null;
                Statics.field1664 = null;
                Statics.field4262 = null;
                Statics.field4809 = null;
                Statics.field73 = null;
                Statics.field4609 = (byte[][]) null;
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2021.method4693(var5, (long) this.field2040);
        }
        return var5;
    }
}
