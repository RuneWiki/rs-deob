package deob;

@ObfuscatedName("d")
public final class class3 extends class38 {

    @ObfuscatedName("d.a")
    public String field59;

    @ObfuscatedName("d.w")
    public class180 field34;

    @ObfuscatedName("d.d")
    public int field42 = -1;

    @ObfuscatedName("d.c")
    public int field51 = -1;

    @ObfuscatedName("d.k")
    public String[] field56 = new String[3];

    @ObfuscatedName("d.r")
    public int field39;

    @ObfuscatedName("d.p")
    public int field40;

    @ObfuscatedName("d.q")
    public int field41;

    @ObfuscatedName("d.m")
    public int field36;

    @ObfuscatedName("d.e")
    public int field43;

    @ObfuscatedName("d.x")
    public int field63;

    @ObfuscatedName("d.z")
    public int field45;

    @ObfuscatedName("d.i")
    public int field46;

    @ObfuscatedName("d.t")
    public class106 field47;

    @ObfuscatedName("d.n")
    public int field48;

    @ObfuscatedName("d.u")
    public int field49;

    @ObfuscatedName("d.g")
    public int field53;

    @ObfuscatedName("d.j")
    public int field54;

    @ObfuscatedName("d.h")
    public boolean field38;

    @ObfuscatedName("d.s")
    public int field64;

    @ObfuscatedName("d.f")
    public boolean field52;

    @ObfuscatedName("d.b")
    public int field55;

    @ObfuscatedName("d.l")
    public int field50;

    @ObfuscatedName("d.o")
    public boolean field57;

    @ObfuscatedName("d.v")
    public int field58;

    @ObfuscatedName("d.ad")
    public int field35;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field56[var1] = "";
        }
        this.field39 = 0;
        this.field40 = 0;
        this.field36 = 0;
        this.field43 = 0;
        this.field38 = false;
        this.field64 = 0;
        this.field52 = false;
        this.field57 = false;
    }

    @ObfuscatedName("d.a(Ldx;B)V")
    public final void method17(class120 arg0) {
        arg0.field1993 = 0;
        int var2 = arg0.method2462();
        this.field42 = arg0.method2548();
        this.field51 = arg0.method2548();
        int var3 = -1;
        this.field64 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2462();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2462();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2464();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method176(var4[var5] - 512).field1134;
                    if (var8 != 0) {
                        this.field64 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2462();
            if (var11 < 0 || var11 >= Statics.field2926[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field823 = arg0.method2464();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field879 = arg0.method2464();
        if (this.field879 == 65535) {
            this.field879 = -1;
        }
        this.field825 = this.field879;
        this.field826 = arg0.method2464();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field840 = arg0.method2464();
        if (this.field840 == 65535) {
            this.field840 = -1;
        }
        this.field837 = arg0.method2464();
        if (this.field837 == 65535) {
            this.field837 = -1;
        }
        this.field829 = arg0.method2464();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field830 = arg0.method2464();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field59 = arg0.method2470();
        if (Statics.field94 == this) {
            Statics.field2217 = this.field59;
        }
        this.field39 = arg0.method2462();
        this.field40 = arg0.method2464();
        this.field52 = arg0.method2462() == 1;
        if (client.field353 == 0 && client.field346 >= 2) {
            this.field52 = false;
        }
        if (this.field34 == null) {
            this.field34 = new class180();
        }
        this.field34.method3343(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("d.w(B)I")
    public int method18() {
        return this.field34 == null || this.field34.field2930 == -1 ? 1 : class40.method726(this.field34.field2930).field888;
    }

    @ObfuscatedName("d.d(I)Ldr;")
    public final class106 method32() {
        if (this.field34 == null) {
            return null;
        }
        class43 var1 = this.field849 != -1 && this.field852 == 0 ? class43.method2137(this.field849) : null;
        class43 var2 = this.field846 == -1 || this.field38 || this.field846 == this.field823 && var1 != null ? null : class43.method2137(this.field846);
        class106 var3 = this.field34.method3344(var1, this.field850, var2, this.field847);
        if (var3 == null) {
            return null;
        }
        var3.method2274();
        this.field868 = var3.field1466;
        if (!this.field38 && this.field866 != -1 && this.field855 != -1) {
            class106 var4 = class44.method688(this.field866).method972(this.field855);
            if (var4 != null) {
                var4.method2260(0, -this.field858, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field38 && this.field47 != null) {
            if (client.field307 >= this.field43) {
                this.field47 = null;
            }
            if (client.field307 >= this.field36 && client.field307 < this.field43) {
                class106 var6 = this.field47;
                var6.method2260(this.field63 - this.field845, this.field45 - this.field41, this.field46 - this.field820);
                if (this.field854 == 512) {
                    var6.method2256();
                    var6.method2256();
                    var6.method2256();
                } else if (this.field854 == 1024) {
                    var6.method2256();
                    var6.method2256();
                } else if (this.field854 == 1536) {
                    var6.method2256();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field854 == 512) {
                    var6.method2256();
                } else if (this.field854 == 1024) {
                    var6.method2256();
                    var6.method2256();
                } else if (this.field854 == 1536) {
                    var6.method2256();
                    var6.method2256();
                    var6.method2256();
                }
                var6.method2260(this.field845 - this.field63, this.field41 - this.field45, this.field820 - this.field46);
            }
        }
        var3.field1820 = true;
        return var3;
    }

    @ObfuscatedName("d.c(IIBB)V")
    public final void method20(int arg0, int arg1, byte arg2) {
        if (this.field849 != -1 && class43.method2137(this.field849).field1005 == 1) {
            this.field849 = -1;
        }
        this.field828 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method21(arg0, arg1);
        } else if (this.field872[0] >= 0 && this.field872[0] < 104 && this.field836[0] >= 0 && this.field836[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field872[0];
                int var6 = this.field836[0];
                int var7 = this.method18();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method18();
                    client.field574.field1874 = arg0;
                    client.field574.field1869 = arg1;
                    client.field574.field1870 = 1;
                    client.field574.field1879 = 1;
                    class11 var11 = client.field574;
                    int var12 = class107.method671(var5, var6, var10, var11, client.field362[this.field55], true, client.field575, client.field576);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method23(client.field575[var13], client.field576[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method23(arg0, arg1, arg2);
        } else {
            this.method21(arg0, arg1);
        }
    }

    @ObfuscatedName("d.y(III)V")
    public void method21(int arg0, int arg1) {
        this.field822 = 0;
        this.field876 = 0;
        this.field875 = 0;
        this.field872[0] = arg0;
        this.field836[0] = arg1;
        int var3 = this.method18();
        this.field845 = this.field872[0] * 128 + var3 * 64;
        this.field820 = this.field836[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("d.k(IIBI)V")
    public final void method23(int arg0, int arg1, byte arg2) {
        if (this.field822 < 9) {
            this.field822++;
        }
        for (int var4 = this.field822; var4 > 0; var4--) {
            this.field872[var4] = this.field872[var4 - 1];
            this.field836[var4] = this.field836[var4 - 1];
            this.field827[var4] = this.field827[var4 - 1];
        }
        this.field872[0] = arg0;
        this.field836[0] = arg1;
        this.field827[0] = arg2;
    }

    @ObfuscatedName("d.r(I)Z")
    public final boolean method29() {
        return this.field34 != null;
    }
}
