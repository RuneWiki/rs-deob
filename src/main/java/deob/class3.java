package deob;

@ObfuscatedName("f")
public final class class3 extends class38 {

    @ObfuscatedName("f.j")
    public String field35;

    @ObfuscatedName("f.m")
    public class179 field32;

    @ObfuscatedName("f.f")
    public int field47 = -1;

    @ObfuscatedName("f.l")
    public int field34 = -1;

    @ObfuscatedName("f.a")
    public String[] field33 = new String[3];

    @ObfuscatedName("f.h")
    public int field54;

    @ObfuscatedName("f.i")
    public int field38;

    @ObfuscatedName("f.t")
    public int field39;

    @ObfuscatedName("f.k")
    public int field40;

    @ObfuscatedName("f.s")
    public int field41;

    @ObfuscatedName("f.w")
    public int field42;

    @ObfuscatedName("f.e")
    public int field43;

    @ObfuscatedName("f.z")
    public int field44;

    @ObfuscatedName("f.p")
    public class105 field45;

    @ObfuscatedName("f.r")
    public int field46;

    @ObfuscatedName("f.g")
    public int field53;

    @ObfuscatedName("f.n")
    public int field48;

    @ObfuscatedName("f.y")
    public int field49;

    @ObfuscatedName("f.v")
    public boolean field50;

    @ObfuscatedName("f.q")
    public int field51;

    @ObfuscatedName("f.x")
    public boolean field36;

    @ObfuscatedName("f.d")
    public int field57;

    @ObfuscatedName("f.o")
    public int field59;

    @ObfuscatedName("f.c")
    public boolean field55;

    @ObfuscatedName("f.b")
    public int field56;

    @ObfuscatedName("f.aa")
    public int field52;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field33[var1] = "";
        }
        this.field54 = 0;
        this.field38 = 0;
        this.field40 = 0;
        this.field41 = 0;
        this.field50 = false;
        this.field51 = 0;
        this.field36 = false;
        this.field55 = false;
    }

    @ObfuscatedName("f.j(Ldc;I)V")
    public final void method15(class119 arg0) {
        arg0.field1982 = 0;
        int var2 = arg0.method2372();
        this.field47 = arg0.method2373();
        this.field34 = arg0.method2373();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2372();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2372();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2374();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method154(var4[var5] - 512).field1125;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2372();
            if (var11 < 0 || var11 >= Statics.field1980[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field804 = arg0.method2374();
        if (this.field804 == 65535) {
            this.field804 = -1;
        }
        this.field805 = arg0.method2374();
        if (this.field805 == 65535) {
            this.field805 = -1;
        }
        this.field850 = this.field805;
        this.field807 = arg0.method2374();
        if (this.field807 == 65535) {
            this.field807 = -1;
        }
        this.field808 = arg0.method2374();
        if (this.field808 == 65535) {
            this.field808 = -1;
        }
        this.field823 = arg0.method2374();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field819 = arg0.method2374();
        if (this.field819 == 65535) {
            this.field819 = -1;
        }
        this.field811 = arg0.method2374();
        if (this.field811 == 65535) {
            this.field811 = -1;
        }
        this.field35 = arg0.method2380();
        if (Statics.field13 == this) {
            Statics.field3148 = this.field35;
        }
        this.field54 = arg0.method2372();
        this.field38 = arg0.method2374();
        this.field36 = arg0.method2372() == 1;
        if (client.field280 == 0 && client.field442 >= 2) {
            this.field36 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class179();
        }
        this.field32.method3300(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.m(I)I")
    public int method16() {
        return this.field32 == null || this.field32.field2899 == -1 ? 1 : class40.method609(this.field32.field2899).field872;
    }

    @ObfuscatedName("f.f(I)Lda;")
    public final class105 method17() {
        if (this.field32 == null) {
            return null;
        }
        class43 var1 = this.field830 != -1 && this.field833 == 0 ? class43.method575(this.field830) : null;
        class43 var2 = this.field827 == -1 || this.field50 || this.field827 == this.field804 && var1 != null ? null : class43.method575(this.field827);
        class105 var3 = this.field32.method3306(var1, this.field831, var2, this.field828);
        if (var3 == null) {
            return null;
        }
        var3.method2179();
        this.field812 = var3.field1442;
        if (!this.field50 && this.field806 != -1 && this.field836 != -1) {
            class105 var4 = class44.method152(this.field806).method914(this.field836);
            if (var4 != null) {
                var4.method2189(0, -this.field839, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field287 >= this.field41) {
                this.field45 = null;
            }
            if (client.field287 >= this.field40 && client.field287 < this.field41) {
                class105 var6 = this.field45;
                var6.method2189(this.field42 - this.field847, this.field43 - this.field39, this.field44 - this.field835);
                if (this.field849 == 512) {
                    var6.method2185();
                    var6.method2185();
                    var6.method2185();
                } else if (this.field849 == 1024) {
                    var6.method2185();
                    var6.method2185();
                } else if (this.field849 == 1536) {
                    var6.method2185();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field849 == 512) {
                    var6.method2185();
                } else if (this.field849 == 1024) {
                    var6.method2185();
                    var6.method2185();
                } else if (this.field849 == 1536) {
                    var6.method2185();
                    var6.method2185();
                    var6.method2185();
                }
                var6.method2189(this.field847 - this.field42, this.field39 - this.field43, this.field835 - this.field44);
            }
        }
        var3.field1822 = true;
        return var3;
    }

    @ObfuscatedName("f.l(IIBI)V")
    public final void method33(int arg0, int arg1, byte arg2) {
        if (this.field830 != -1 && class43.method575(this.field830).field986 == 1) {
            this.field830 = -1;
        }
        this.field826 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method27(arg0, arg1);
        } else if (this.field810[0] >= 0 && this.field810[0] < 104 && this.field817[0] >= 0 && this.field817[0] < 104) {
            if (arg2 == 2) {
                client.method2972(this, arg0, arg1, (byte) 2);
            }
            this.method19(arg0, arg1, arg2);
        } else {
            this.method27(arg0, arg1);
        }
    }

    @ObfuscatedName("f.u(IIB)V")
    public void method27(int arg0, int arg1) {
        this.field852 = 0;
        this.field857 = 0;
        this.field832 = 0;
        this.field810[0] = arg0;
        this.field817[0] = arg1;
        int var3 = this.method16();
        this.field847 = this.field810[0] * 128 + var3 * 64;
        this.field835 = this.field817[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("f.a(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field852 < 9) {
            this.field852++;
        }
        for (int var4 = this.field852; var4 > 0; var4--) {
            this.field810[var4] = this.field810[var4 - 1];
            this.field817[var4] = this.field817[var4 - 1];
            this.field856[var4] = this.field856[var4 - 1];
        }
        this.field810[0] = arg0;
        this.field817[0] = arg1;
        this.field856[0] = arg2;
    }

    @ObfuscatedName("f.h(B)Z")
    public final boolean method21() {
        return this.field32 != null;
    }
}
