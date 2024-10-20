package deob;

@ObfuscatedName("u")
public final class class3 extends class38 {

    @ObfuscatedName("u.o")
    public String field58;

    @ObfuscatedName("u.e")
    public class179 field33;

    @ObfuscatedName("u.u")
    public int field56 = -1;

    @ObfuscatedName("u.b")
    public int field46 = -1;

    @ObfuscatedName("u.s")
    public String[] field37 = new String[3];

    @ObfuscatedName("u.y")
    public int field38;

    @ObfuscatedName("u.t")
    public int field39;

    @ObfuscatedName("u.w")
    public int field62;

    @ObfuscatedName("u.h")
    public int field41;

    @ObfuscatedName("u.d")
    public int field42;

    @ObfuscatedName("u.l")
    public int field43;

    @ObfuscatedName("u.n")
    public int field44;

    @ObfuscatedName("u.q")
    public int field57;

    @ObfuscatedName("u.f")
    public class105 field48;

    @ObfuscatedName("u.v")
    public int field47;

    @ObfuscatedName("u.a")
    public int field40;

    @ObfuscatedName("u.k")
    public int field45;

    @ObfuscatedName("u.r")
    public int field50;

    @ObfuscatedName("u.i")
    public boolean field51;

    @ObfuscatedName("u.j")
    public int field52;

    @ObfuscatedName("u.z")
    public boolean field53;

    @ObfuscatedName("u.m")
    public int field54;

    @ObfuscatedName("u.g")
    public int field35;

    @ObfuscatedName("u.c")
    public boolean field32;

    @ObfuscatedName("u.x")
    public int field49;

    @ObfuscatedName("u.ah")
    public int field34;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field37[var1] = "";
        }
        this.field38 = 0;
        this.field39 = 0;
        this.field41 = 0;
        this.field42 = 0;
        this.field51 = false;
        this.field52 = 0;
        this.field53 = false;
        this.field32 = false;
    }

    @ObfuscatedName("u.o(Ldi;I)V")
    public final void method12(class119 arg0) {
        arg0.field1974 = 0;
        int var2 = arg0.method2427();
        this.field56 = arg0.method2338();
        this.field46 = arg0.method2338();
        int var3 = -1;
        this.field52 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2427();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2427();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2339();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method1933(var4[var5] - 512).field1112;
                    if (var8 != 0) {
                        this.field52 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2427();
            if (var11 < 0 || var11 >= Statics.field623[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field826 = arg0.method2339();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field852 = arg0.method2339();
        if (this.field852 == 65535) {
            this.field852 = -1;
        }
        this.field818 = this.field852;
        this.field825 = arg0.method2339();
        if (this.field825 == 65535) {
            this.field825 = -1;
        }
        this.field820 = arg0.method2339();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field821 = arg0.method2339();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field822 = arg0.method2339();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field823 = arg0.method2339();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field58 = arg0.method2528();
        if (Statics.field159 == this) {
            Statics.field2218 = this.field58;
        }
        this.field38 = arg0.method2427();
        this.field39 = arg0.method2339();
        this.field53 = arg0.method2427() == 1;
        if (client.field280 == 0 && client.field442 >= 2) {
            this.field53 = false;
        }
        if (this.field33 == null) {
            this.field33 = new class179();
        }
        this.field33.method3264(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("u.e(B)I")
    public int method34() {
        return this.field33 == null || this.field33.field2915 == -1 ? 1 : class40.method3484(this.field33.field2915).field895;
    }

    @ObfuscatedName("u.u(I)Ldk;")
    public final class105 method14() {
        if (this.field33 == null) {
            return null;
        }
        class43 var1 = this.field842 != -1 && this.field853 == 0 ? class43.method774(this.field842) : null;
        class43 var2 = this.field816 == -1 || this.field51 || this.field826 == this.field816 && var1 != null ? null : class43.method774(this.field816);
        class105 var3 = this.field33.method3285(var1, this.field843, var2, this.field840);
        if (var3 == null) {
            return null;
        }
        var3.method2125();
        this.field811 = var3.field1441;
        if (!this.field51 && this.field847 != -1 && this.field867 != -1) {
            class105 var4 = class44.method3260(this.field847).method883(this.field867);
            if (var4 != null) {
                var4.method2169(0, -this.field851, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field51 && this.field48 != null) {
            if (client.field288 >= this.field42) {
                this.field48 = null;
            }
            if (client.field288 >= this.field41 && client.field288 < this.field42) {
                class105 var6 = this.field48;
                var6.method2169(this.field43 - this.field845, this.field44 - this.field62, this.field57 - this.field812);
                if (this.field849 == 512) {
                    var6.method2175();
                    var6.method2175();
                    var6.method2175();
                } else if (this.field849 == 1024) {
                    var6.method2175();
                    var6.method2175();
                } else if (this.field849 == 1536) {
                    var6.method2175();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field849 == 512) {
                    var6.method2175();
                } else if (this.field849 == 1024) {
                    var6.method2175();
                    var6.method2175();
                } else if (this.field849 == 1536) {
                    var6.method2175();
                    var6.method2175();
                    var6.method2175();
                }
                var6.method2169(this.field845 - this.field43, this.field62 - this.field44, this.field812 - this.field57);
            }
        }
        var3.field1805 = true;
        return var3;
    }

    @ObfuscatedName("u.b(IIBI)V")
    public final void method15(int arg0, int arg1, byte arg2) {
        if (this.field842 != -1 && class43.method774(this.field842).field996 == 1) {
            this.field842 = -1;
        }
        this.field838 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method27(arg0, arg1);
        } else if (this.field865[0] >= 0 && this.field865[0] < 104 && this.field827[0] >= 0 && this.field827[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field865[0];
                int var6 = this.field827[0];
                int var7 = this.method34();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method34();
                    client.field555.field1859 = arg0;
                    client.field555.field1861 = arg1;
                    client.field555.field1858 = 1;
                    client.field555.field1857 = 1;
                    class11 var11 = client.field555;
                    int var12 = class106.method726(var5, var6, var10, var11, client.field512[this.field54], true, client.field556, client.field557);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method17(client.field556[var13], client.field557[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method17(arg0, arg1, arg2);
        } else {
            this.method27(arg0, arg1);
        }
    }

    @ObfuscatedName("u.p(III)V")
    public void method27(int arg0, int arg1) {
        this.field864 = 0;
        this.field869 = 0;
        this.field832 = 0;
        this.field865[0] = arg0;
        this.field827[0] = arg1;
        int var3 = this.method34();
        this.field845 = this.field865[0] * 128 + var3 * 64;
        this.field812 = this.field827[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("u.s(IIBI)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field864 < 9) {
            this.field864++;
        }
        for (int var4 = this.field864; var4 > 0; var4--) {
            this.field865[var4] = this.field865[var4 - 1];
            this.field827[var4] = this.field827[var4 - 1];
            this.field848[var4] = this.field848[var4 - 1];
        }
        this.field865[0] = arg0;
        this.field827[0] = arg1;
        this.field848[0] = arg2;
    }

    @ObfuscatedName("u.y(B)Z")
    public final boolean method18() {
        return this.field33 != null;
    }
}
