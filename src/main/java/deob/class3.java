package deob;

@ObfuscatedName("o")
public final class class3 extends class38 {

    @ObfuscatedName("o.k")
    public String field41;

    @ObfuscatedName("o.h")
    public class179 field28;

    @ObfuscatedName("o.o")
    public int field29 = -1;

    @ObfuscatedName("o.z")
    public int field30 = -1;

    @ObfuscatedName("o.d")
    public String[] field44 = new String[3];

    @ObfuscatedName("o.l")
    public int field27;

    @ObfuscatedName("o.b")
    public int field51;

    @ObfuscatedName("o.j")
    public int field34;

    @ObfuscatedName("o.f")
    public int field35;

    @ObfuscatedName("o.i")
    public int field36;

    @ObfuscatedName("o.g")
    public int field37;

    @ObfuscatedName("o.t")
    public int field38;

    @ObfuscatedName("o.e")
    public int field33;

    @ObfuscatedName("o.q")
    public class105 field40;

    @ObfuscatedName("o.u")
    public int field32;

    @ObfuscatedName("o.r")
    public int field42;

    @ObfuscatedName("o.a")
    public int field39;

    @ObfuscatedName("o.m")
    public int field45;

    @ObfuscatedName("o.y")
    public boolean field31;

    @ObfuscatedName("o.x")
    public int field46;

    @ObfuscatedName("o.n")
    public boolean field47;

    @ObfuscatedName("o.v")
    public int field48;

    @ObfuscatedName("o.s")
    public int field49;

    @ObfuscatedName("o.w")
    public boolean field50;

    @ObfuscatedName("o.p")
    public int field53;

    @ObfuscatedName("o.ao")
    public int field52;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field44[var1] = "";
        }
        this.field27 = 0;
        this.field51 = 0;
        this.field35 = 0;
        this.field36 = 0;
        this.field31 = false;
        this.field46 = 0;
        this.field47 = false;
        this.field50 = false;
    }

    @ObfuscatedName("o.k(Ldk;S)V")
    public final void method9(class119 arg0) {
        arg0.field1949 = 0;
        int var2 = arg0.method2330();
        this.field29 = arg0.method2413();
        this.field30 = arg0.method2413();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2330();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2330();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2332();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2522(var4[var5] - 512).field1110;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2330();
            if (var11 < 0 || var11 >= Statics.field171[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field792 = arg0.method2332();
        if (this.field792 == 65535) {
            this.field792 = -1;
        }
        this.field793 = arg0.method2332();
        if (this.field793 == 65535) {
            this.field793 = -1;
        }
        this.field797 = this.field793;
        this.field795 = arg0.method2332();
        if (this.field795 == 65535) {
            this.field795 = -1;
        }
        this.field796 = arg0.method2332();
        if (this.field796 == 65535) {
            this.field796 = -1;
        }
        this.field834 = arg0.method2332();
        if (this.field834 == 65535) {
            this.field834 = -1;
        }
        this.field798 = arg0.method2332();
        if (this.field798 == 65535) {
            this.field798 = -1;
        }
        this.field799 = arg0.method2332();
        if (this.field799 == 65535) {
            this.field799 = -1;
        }
        this.field41 = arg0.method2337();
        if (Statics.field2258 == this) {
            Statics.field2200 = this.field41;
        }
        this.field27 = arg0.method2330();
        this.field51 = arg0.method2332();
        this.field47 = arg0.method2330() == 1;
        if (client.field287 == 0 && client.field450 >= 2) {
            this.field47 = false;
        }
        if (this.field28 == null) {
            this.field28 = new class179();
        }
        this.field28.method3273(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("o.h(I)I")
    public int method16() {
        return this.field28 == null || this.field28.field2901 == -1 ? 1 : class40.method96(this.field28.field2901).field863;
    }

    @ObfuscatedName("o.o(I)Ldl;")
    public final class105 method11() {
        if (this.field28 == null) {
            return null;
        }
        class43 var1 = this.field811 != -1 && this.field821 == 0 ? class43.method3491(this.field811) : null;
        class43 var2 = this.field814 == -1 || this.field31 || this.field814 == this.field792 && var1 != null ? null : class43.method3491(this.field814);
        class105 var3 = this.field28.method3287(var1, this.field816, var2, this.field841);
        if (var3 == null) {
            return null;
        }
        var3.method2149();
        this.field800 = var3.field1420;
        if (!this.field31 && this.field802 != -1 && this.field824 != -1) {
            class105 var4 = class44.method520(this.field802).method847(this.field824);
            if (var4 != null) {
                var4.method2141(0, -this.field836, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field31 && this.field40 != null) {
            if (client.field312 >= this.field36) {
                this.field40 = null;
            }
            if (client.field312 >= this.field35 && client.field312 < this.field36) {
                class105 var6 = this.field40;
                var6.method2141(this.field37 - this.field818, this.field38 - this.field34, this.field33 - this.field788);
                if (this.field837 == 512) {
                    var6.method2147();
                    var6.method2147();
                    var6.method2147();
                } else if (this.field837 == 1024) {
                    var6.method2147();
                    var6.method2147();
                } else if (this.field837 == 1536) {
                    var6.method2147();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field837 == 512) {
                    var6.method2147();
                } else if (this.field837 == 1024) {
                    var6.method2147();
                    var6.method2147();
                } else if (this.field837 == 1536) {
                    var6.method2147();
                    var6.method2147();
                    var6.method2147();
                }
                var6.method2141(this.field818 - this.field37, this.field34 - this.field38, this.field788 - this.field33);
            }
        }
        var3.field1777 = true;
        return var3;
    }

    @ObfuscatedName("o.z(IIBI)V")
    public final void method12(int arg0, int arg1, byte arg2) {
        if (this.field811 != -1 && class43.method3491(this.field811).field973 == 1) {
            this.field811 = -1;
        }
        this.field810 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method13(arg0, arg1);
        } else if (this.field842[0] >= 0 && this.field842[0] < 104 && this.field844[0] >= 0 && this.field844[0] < 104) {
            if (arg2 == 2) {
                client.method768(this, arg0, arg1, (byte) 2);
            }
            this.method14(arg0, arg1, arg2);
        } else {
            this.method13(arg0, arg1);
        }
    }

    @ObfuscatedName("o.c(III)V")
    public void method13(int arg0, int arg1) {
        this.field840 = 0;
        this.field823 = 0;
        this.field787 = 0;
        this.field842[0] = arg0;
        this.field844[0] = arg1;
        int var3 = this.method16();
        this.field818 = this.field842[0] * 128 + var3 * 64;
        this.field788 = this.field844[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("o.d(IIBB)V")
    public final void method14(int arg0, int arg1, byte arg2) {
        if (this.field840 < 9) {
            this.field840++;
        }
        for (int var4 = this.field840; var4 > 0; var4--) {
            this.field842[var4] = this.field842[var4 - 1];
            this.field844[var4] = this.field844[var4 - 1];
            this.field843[var4] = this.field843[var4 - 1];
        }
        this.field842[0] = arg0;
        this.field844[0] = arg1;
        this.field843[0] = arg2;
    }

    @ObfuscatedName("o.l(B)Z")
    public final boolean method15() {
        return this.field28 != null;
    }
}
