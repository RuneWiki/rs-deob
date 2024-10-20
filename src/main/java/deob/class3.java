package deob;

@ObfuscatedName("x")
public final class class3 extends class38 {

    @ObfuscatedName("x.f")
    public String field61;

    @ObfuscatedName("x.u")
    public class180 field37;

    @ObfuscatedName("x.x")
    public int field57 = -1;

    @ObfuscatedName("x.b")
    public int field39 = -1;

    @ObfuscatedName("x.d")
    public String[] field40 = new String[3];

    @ObfuscatedName("x.n")
    public int field41;

    @ObfuscatedName("x.m")
    public int field42;

    @ObfuscatedName("x.g")
    public int field43;

    @ObfuscatedName("x.s")
    public int field55;

    @ObfuscatedName("x.r")
    public int field49;

    @ObfuscatedName("x.k")
    public int field46;

    @ObfuscatedName("x.o")
    public int field45;

    @ObfuscatedName("x.q")
    public int field48;

    @ObfuscatedName("x.p")
    public class106 field44;

    @ObfuscatedName("x.h")
    public int field50;

    @ObfuscatedName("x.e")
    public int field51;

    @ObfuscatedName("x.t")
    public int field52;

    @ObfuscatedName("x.w")
    public int field53;

    @ObfuscatedName("x.v")
    public boolean field54;

    @ObfuscatedName("x.y")
    public int field58;

    @ObfuscatedName("x.c")
    public boolean field47;

    @ObfuscatedName("x.i")
    public int field36;

    @ObfuscatedName("x.a")
    public int field38;

    @ObfuscatedName("x.z")
    public boolean field59;

    @ObfuscatedName("x.j")
    public int field60;

    @ObfuscatedName("x.ag")
    public int field56;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field40[var1] = "";
        }
        this.field41 = 0;
        this.field42 = 0;
        this.field55 = 0;
        this.field49 = 0;
        this.field54 = false;
        this.field58 = 0;
        this.field47 = false;
        this.field59 = false;
    }

    @ObfuscatedName("x.f(Ldj;I)V")
    public final void method16(class120 arg0) {
        arg0.field1999 = 0;
        int var2 = arg0.method2385();
        this.field57 = arg0.method2369();
        this.field39 = arg0.method2369();
        int var3 = -1;
        this.field58 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2385();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2385();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2387();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2827(var4[var5] - 512).field1160;
                    if (var8 != 0) {
                        this.field58 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2385();
            if (var11 < 0 || var11 >= Statics.field2702[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field827 = arg0.method2387();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field828 = arg0.method2387();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field846 = this.field828;
        this.field830 = arg0.method2387();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field831 = arg0.method2387();
        if (this.field831 == 65535) {
            this.field831 = -1;
        }
        this.field832 = arg0.method2387();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field833 = arg0.method2387();
        if (this.field833 == 65535) {
            this.field833 = -1;
        }
        this.field834 = arg0.method2387();
        if (this.field834 == 65535) {
            this.field834 = -1;
        }
        this.field61 = arg0.method2499();
        if (Statics.field226 == this) {
            Statics.field2222 = this.field61;
        }
        this.field41 = arg0.method2385();
        this.field42 = arg0.method2387();
        this.field47 = arg0.method2385() == 1;
        if (client.field294 == 0 && client.field455 >= 2) {
            this.field47 = false;
        }
        if (this.field37 == null) {
            this.field37 = new class180();
        }
        this.field37.method3277(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("x.u(B)I")
    public int method17() {
        return this.field37 == null || this.field37.field2917 == -1 ? 1 : class40.method3193(this.field37.field2917).field908;
    }

    @ObfuscatedName("x.x(S)Ldr;")
    public final class106 method29() {
        if (this.field37 == null) {
            return null;
        }
        class43 var1 = this.field823 != -1 && this.field856 == 0 ? class43.method745(this.field823) : null;
        class43 var2 = this.field850 == -1 || this.field54 || this.field850 == this.field827 && var1 != null ? null : class43.method745(this.field850);
        class106 var3 = this.field37.method3283(var1, this.field854, var2, this.field869);
        if (var3 == null) {
            return null;
        }
        var3.method2195();
        this.field871 = var3.field1469;
        if (!this.field54 && this.field858 != -1 && this.field822 != -1) {
            class106 var4 = class44.method13(this.field858).method925(this.field822);
            if (var4 != null) {
                var4.method2203(0, -this.field843, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field54 && this.field44 != null) {
            if (client.field302 >= this.field49) {
                this.field44 = null;
            }
            if (client.field302 >= this.field55 && client.field302 < this.field49) {
                class106 var6 = this.field44;
                var6.method2203(this.field46 - this.field838, this.field45 - this.field43, this.field48 - this.field881);
                if (this.field872 == 512) {
                    var6.method2221();
                    var6.method2221();
                    var6.method2221();
                } else if (this.field872 == 1024) {
                    var6.method2221();
                    var6.method2221();
                } else if (this.field872 == 1536) {
                    var6.method2221();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field872 == 512) {
                    var6.method2221();
                } else if (this.field872 == 1024) {
                    var6.method2221();
                    var6.method2221();
                } else if (this.field872 == 1536) {
                    var6.method2221();
                    var6.method2221();
                    var6.method2221();
                }
                var6.method2203(this.field838 - this.field46, this.field43 - this.field45, this.field881 - this.field48);
            }
        }
        var3.field1830 = true;
        return var3;
    }

    @ObfuscatedName("x.b(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field823 != -1 && class43.method745(this.field823).field998 == 1) {
            this.field823 = -1;
        }
        this.field849 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method34(arg0, arg1);
        } else if (this.field876[0] >= 0 && this.field876[0] < 104 && this.field877[0] >= 0 && this.field877[0] < 104) {
            if (arg2 == 2) {
                client.method733(this, arg0, arg1, (byte) 2);
            }
            this.method31(arg0, arg1, arg2);
        } else {
            this.method34(arg0, arg1);
        }
    }

    @ObfuscatedName("x.l(IIS)V")
    public void method34(int arg0, int arg1) {
        this.field875 = 0;
        this.field880 = 0;
        this.field866 = 0;
        this.field876[0] = arg0;
        this.field877[0] = arg1;
        int var3 = this.method17();
        this.field838 = this.field876[0] * 128 + var3 * 64;
        this.field881 = this.field877[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("x.d(IIBI)V")
    public final void method31(int arg0, int arg1, byte arg2) {
        if (this.field875 < 9) {
            this.field875++;
        }
        for (int var4 = this.field875; var4 > 0; var4--) {
            this.field876[var4] = this.field876[var4 - 1];
            this.field877[var4] = this.field877[var4 - 1];
            this.field829[var4] = this.field829[var4 - 1];
        }
        this.field876[0] = arg0;
        this.field877[0] = arg1;
        this.field829[0] = arg2;
    }

    @ObfuscatedName("x.n(I)Z")
    public final boolean method22() {
        return this.field37 != null;
    }
}
