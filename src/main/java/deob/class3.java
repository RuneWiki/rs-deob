package deob;

@ObfuscatedName("e")
public final class class3 extends class40 {

    @ObfuscatedName("e.m")
    public String field44;

    @ObfuscatedName("e.w")
    public class183 field51;

    @ObfuscatedName("e.e")
    public int field39 = -1;

    @ObfuscatedName("e.o")
    public int field63 = -1;

    @ObfuscatedName("e.l")
    public String[] field59 = new String[3];

    @ObfuscatedName("e.j")
    public int field42;

    @ObfuscatedName("e.r")
    public int field40;

    @ObfuscatedName("e.x")
    public int field46;

    @ObfuscatedName("e.k")
    public int field45;

    @ObfuscatedName("e.v")
    public int field37;

    @ObfuscatedName("e.h")
    public int field41;

    @ObfuscatedName("e.u")
    public int field48;

    @ObfuscatedName("e.y")
    public int field49;

    @ObfuscatedName("e.p")
    public class109 field50;

    @ObfuscatedName("e.s")
    public int field38;

    @ObfuscatedName("e.f")
    public int field52;

    @ObfuscatedName("e.i")
    public int field53;

    @ObfuscatedName("e.d")
    public int field54;

    @ObfuscatedName("e.t")
    public boolean field55;

    @ObfuscatedName("e.c")
    public int field56;

    @ObfuscatedName("e.z")
    public boolean field57;

    @ObfuscatedName("e.n")
    public int field58;

    @ObfuscatedName("e.q")
    public int field47;

    @ObfuscatedName("e.a")
    public boolean field60;

    @ObfuscatedName("e.b")
    public int field61;

    @ObfuscatedName("e.aj")
    public int field62;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field59[var1] = "";
        }
        this.field42 = 0;
        this.field40 = 0;
        this.field45 = 0;
        this.field37 = 0;
        this.field55 = false;
        this.field56 = 0;
        this.field57 = false;
        this.field60 = false;
    }

    @ObfuscatedName("e.m(Ldj;I)V")
    public final void method13(class123 arg0) {
        arg0.field2046 = 0;
        int var2 = arg0.method2398();
        this.field39 = arg0.method2415();
        this.field63 = arg0.method2415();
        int var3 = -1;
        this.field56 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2398();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2398();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2548();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method43(var4[var5] - 512).field1183;
                    if (var8 != 0) {
                        this.field56 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2398();
            if (var11 < 0 || var11 >= Statics.field2970[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field848 = arg0.method2548();
        if (this.field848 == 65535) {
            this.field848 = -1;
        }
        this.field877 = arg0.method2548();
        if (this.field877 == 65535) {
            this.field877 = -1;
        }
        this.field838 = this.field877;
        this.field840 = arg0.method2548();
        if (this.field840 == 65535) {
            this.field840 = -1;
        }
        this.field879 = arg0.method2548();
        if (this.field879 == 65535) {
            this.field879 = -1;
        }
        this.field841 = arg0.method2548();
        if (this.field841 == 65535) {
            this.field841 = -1;
        }
        this.field842 = arg0.method2548();
        if (this.field842 == 65535) {
            this.field842 = -1;
        }
        this.field843 = arg0.method2548();
        if (this.field843 == 65535) {
            this.field843 = -1;
        }
        this.field44 = arg0.method2422();
        if (Statics.field2011 == this) {
            Statics.field1061 = this.field44;
        }
        this.field42 = arg0.method2398();
        this.field40 = arg0.method2548();
        this.field57 = arg0.method2398() == 1;
        if (client.field276 == 0 && client.field410 >= 2) {
            this.field57 = false;
        }
        if (this.field51 == null) {
            this.field51 = new class183();
        }
        this.field51.method3313(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("e.w(B)I")
    public int method15() {
        return this.field51 == null || this.field51.field2967 == -1 ? 1 : class42.method8(this.field51.field2967).field907;
    }

    @ObfuscatedName("e.e(I)Ldg;")
    public final class109 method22() {
        if (this.field51 == null) {
            return null;
        }
        class45 var1 = this.field885 != -1 && this.field866 == 0 ? class45.method637(this.field885) : null;
        class45 var2 = this.field860 == -1 || this.field55 || this.field860 == this.field848 && var1 != null ? null : class45.method637(this.field860);
        class109 var3 = this.field51.method3319(var1, this.field864, var2, this.field861);
        if (var3 == null) {
            return null;
        }
        var3.method2237();
        this.field881 = var3.field1537;
        if (!this.field55 && this.field835 != -1 && this.field869 != -1) {
            class109 var4 = class46.method3219(this.field835).method908(this.field869);
            if (var4 != null) {
                var4.method2226(0, -this.field872, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field55 && this.field50 != null) {
            if (client.field283 >= this.field37) {
                this.field50 = null;
            }
            if (client.field283 >= this.field45 && client.field283 < this.field37) {
                class109 var6 = this.field50;
                var6.method2226(this.field41 - this.field865, this.field48 - this.field46, this.field49 - this.field832);
                if (this.field882 == 512) {
                    var6.method2230();
                    var6.method2230();
                    var6.method2230();
                } else if (this.field882 == 1024) {
                    var6.method2230();
                    var6.method2230();
                } else if (this.field882 == 1536) {
                    var6.method2230();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field882 == 512) {
                    var6.method2230();
                } else if (this.field882 == 1024) {
                    var6.method2230();
                    var6.method2230();
                } else if (this.field882 == 1536) {
                    var6.method2230();
                    var6.method2230();
                    var6.method2230();
                }
                var6.method2226(this.field865 - this.field41, this.field46 - this.field48, this.field832 - this.field49);
            }
        }
        var3.field1925 = true;
        return var3;
    }

    @ObfuscatedName("e.o(IIBB)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field885 != -1 && class45.method637(this.field885).field1021 == 1) {
            this.field885 = -1;
        }
        this.field868 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method18(arg0, arg1);
        } else if (this.field886[0] >= 0 && this.field886[0] < 104 && this.field887[0] >= 0 && this.field887[0] < 104) {
            if (arg2 == 2) {
                client.method184(this, arg0, arg1, (byte) 2);
            }
            this.method34(arg0, arg1, arg2);
        } else {
            this.method18(arg0, arg1);
        }
    }

    @ObfuscatedName("e.g(III)V")
    public void method18(int arg0, int arg1) {
        this.field876 = 0;
        this.field852 = 0;
        this.field889 = 0;
        this.field886[0] = arg0;
        this.field887[0] = arg1;
        int var3 = this.method15();
        this.field865 = this.field886[0] * 128 + var3 * 64;
        this.field832 = this.field887[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("e.l(IIBS)V")
    public final void method34(int arg0, int arg1, byte arg2) {
        if (this.field876 < 9) {
            this.field876++;
        }
        for (int var4 = this.field876; var4 > 0; var4--) {
            this.field886[var4] = this.field886[var4 - 1];
            this.field887[var4] = this.field887[var4 - 1];
            this.field888[var4] = this.field888[var4 - 1];
        }
        this.field886[0] = arg0;
        this.field887[0] = arg1;
        this.field888[0] = arg2;
    }

    @ObfuscatedName("e.j(B)Z")
    public final boolean method20() {
        return this.field51 != null;
    }
}
