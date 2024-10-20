package deob;

@ObfuscatedName("q")
public final class class3 extends class38 {

    @ObfuscatedName("q.l")
    public String field48;

    @ObfuscatedName("q.e")
    public class179 field34;

    @ObfuscatedName("q.q")
    public int field35 = -1;

    @ObfuscatedName("q.o")
    public int field42 = -1;

    @ObfuscatedName("q.m")
    public String[] field57 = new String[3];

    @ObfuscatedName("q.b")
    public int field38;

    @ObfuscatedName("q.p")
    public int field39;

    @ObfuscatedName("q.t")
    public int field40;

    @ObfuscatedName("q.w")
    public int field50;

    @ObfuscatedName("q.x")
    public int field36;

    @ObfuscatedName("q.k")
    public int field43;

    @ObfuscatedName("q.z")
    public int field44;

    @ObfuscatedName("q.v")
    public int field45;

    @ObfuscatedName("q.j")
    public class105 field46;

    @ObfuscatedName("q.f")
    public int field33;

    @ObfuscatedName("q.c")
    public int field41;

    @ObfuscatedName("q.s")
    public int field49;

    @ObfuscatedName("q.r")
    public int field37;

    @ObfuscatedName("q.u")
    public boolean field51;

    @ObfuscatedName("q.a")
    public int field52;

    @ObfuscatedName("q.h")
    public boolean field56;

    @ObfuscatedName("q.y")
    public int field54;

    @ObfuscatedName("q.d")
    public int field55;

    @ObfuscatedName("q.n")
    public boolean field53;

    @ObfuscatedName("q.i")
    public int field47;

    @ObfuscatedName("q.ad")
    public int field58;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field57[var1] = "";
        }
        this.field38 = 0;
        this.field39 = 0;
        this.field50 = 0;
        this.field36 = 0;
        this.field51 = false;
        this.field52 = 0;
        this.field56 = false;
        this.field53 = false;
    }

    @ObfuscatedName("q.l(Ldl;I)V")
    public final void method16(class119 arg0) {
        arg0.field1988 = 0;
        int var2 = arg0.method2388();
        this.field35 = arg0.method2389();
        this.field42 = arg0.method2389();
        int var3 = -1;
        this.field52 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2388();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2388();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2440();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method646(var4[var5] - 512).field1092;
                    if (var8 != 0) {
                        this.field52 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2388();
            if (var11 < 0 || var11 >= Statics.field2905[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field816 = arg0.method2440();
        if (this.field816 == 65535) {
            this.field816 = -1;
        }
        this.field817 = arg0.method2440();
        if (this.field817 == 65535) {
            this.field817 = -1;
        }
        this.field858 = this.field817;
        this.field819 = arg0.method2440();
        if (this.field819 == 65535) {
            this.field819 = -1;
        }
        this.field820 = arg0.method2440();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field821 = arg0.method2440();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field869 = arg0.method2440();
        if (this.field869 == 65535) {
            this.field869 = -1;
        }
        this.field823 = arg0.method2440();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field48 = arg0.method2396();
        if (Statics.field143 == this) {
            Statics.field2222 = this.field48;
        }
        this.field38 = arg0.method2388();
        this.field39 = arg0.method2440();
        this.field56 = arg0.method2388() == 1;
        if (client.field297 == 0 && client.field368 >= 2) {
            this.field56 = false;
        }
        if (this.field34 == null) {
            this.field34 = new class179();
        }
        this.field34.method3240(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("q.e(B)I")
    public int method17() {
        return this.field34 == null || this.field34.field2902 == -1 ? 1 : class40.method710(this.field34.field2902).field887;
    }

    @ObfuscatedName("q.q(B)Ldt;")
    public final class105 method18() {
        if (this.field34 == null) {
            return null;
        }
        class43 var1 = this.field842 != -1 && this.field845 == 0 ? class43.method2304(this.field842) : null;
        class43 var2 = this.field839 == -1 || this.field51 || this.field839 == this.field816 && var1 != null ? null : class43.method2304(this.field839);
        class105 var3 = this.field34.method3246(var1, this.field824, var2, this.field841);
        if (var3 == null) {
            return null;
        }
        var3.method2195();
        this.field860 = var3.field1442;
        if (!this.field51 && this.field871 != -1 && this.field848 != -1) {
            class105 var4 = class44.method3632(this.field871).method902(this.field848);
            if (var4 != null) {
                var4.method2222(0, -this.field851, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field51 && this.field46 != null) {
            if (client.field548 >= this.field36) {
                this.field46 = null;
            }
            if (client.field548 >= this.field50 && client.field548 < this.field36) {
                class105 var6 = this.field46;
                var6.method2222(this.field43 - this.field861, this.field44 - this.field40, this.field45 - this.field812);
                if (this.field818 == 512) {
                    var6.method2199();
                    var6.method2199();
                    var6.method2199();
                } else if (this.field818 == 1024) {
                    var6.method2199();
                    var6.method2199();
                } else if (this.field818 == 1536) {
                    var6.method2199();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field818 == 512) {
                    var6.method2199();
                } else if (this.field818 == 1024) {
                    var6.method2199();
                    var6.method2199();
                } else if (this.field818 == 1536) {
                    var6.method2199();
                    var6.method2199();
                    var6.method2199();
                }
                var6.method2222(this.field861 - this.field43, this.field40 - this.field44, this.field812 - this.field45);
            }
        }
        var3.field1813 = true;
        return var3;
    }

    @ObfuscatedName("q.o(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field842 != -1 && class43.method2304(this.field842).field996 == 1) {
            this.field842 = -1;
        }
        this.field828 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method23(arg0, arg1);
        } else if (this.field865[0] >= 0 && this.field865[0] < 104 && this.field866[0] >= 0 && this.field866[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field865[0];
                int var6 = this.field866[0];
                int var7 = this.method17();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class106.method166(var5, var6, this.method17(), client.method1533(arg0, arg1), client.field521[this.field54], true, client.field573, client.field336);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method21(client.field573[var9], client.field336[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method21(arg0, arg1, arg2);
        } else {
            this.method23(arg0, arg1);
        }
    }

    @ObfuscatedName("q.g(III)V")
    public void method23(int arg0, int arg1) {
        this.field864 = 0;
        this.field847 = 0;
        this.field868 = 0;
        this.field865[0] = arg0;
        this.field866[0] = arg1;
        int var3 = this.method17();
        this.field861 = this.field865[0] * 128 + var3 * 64;
        this.field812 = this.field866[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("q.m(IIBI)V")
    public final void method21(int arg0, int arg1, byte arg2) {
        if (this.field864 < 9) {
            this.field864++;
        }
        for (int var4 = this.field864; var4 > 0; var4--) {
            this.field865[var4] = this.field865[var4 - 1];
            this.field866[var4] = this.field866[var4 - 1];
            this.field857[var4] = this.field857[var4 - 1];
        }
        this.field865[0] = arg0;
        this.field866[0] = arg1;
        this.field857[0] = arg2;
    }

    @ObfuscatedName("q.b(B)Z")
    public final boolean method22() {
        return this.field34 != null;
    }
}
