package deob;

@ObfuscatedName("y")
public final class class3 extends class38 {

    @ObfuscatedName("y.m")
    public String field47;

    @ObfuscatedName("y.l")
    public class179 field32;

    @ObfuscatedName("y.y")
    public int field33 = -1;

    @ObfuscatedName("y.u")
    public int field34 = -1;

    @ObfuscatedName("y.k")
    public int field35 = 0;

    @ObfuscatedName("y.j")
    public int field36 = 0;

    @ObfuscatedName("y.i")
    public int field51;

    @ObfuscatedName("y.x")
    public int field38 = 0;

    @ObfuscatedName("y.g")
    public int field50 = 0;

    @ObfuscatedName("y.e")
    public int field46;

    @ObfuscatedName("y.p")
    public int field41;

    @ObfuscatedName("y.a")
    public int field42;

    @ObfuscatedName("y.v")
    public class105 field43;

    @ObfuscatedName("y.c")
    public int field31;

    @ObfuscatedName("y.s")
    public int field45;

    @ObfuscatedName("y.r")
    public int field40;

    @ObfuscatedName("y.h")
    public int field37;

    @ObfuscatedName("y.n")
    public boolean field48 = false;

    @ObfuscatedName("y.b")
    public int field49 = 0;

    @ObfuscatedName("y.f")
    public boolean field44 = false;

    @ObfuscatedName("y.d")
    public int field55;

    @ObfuscatedName("y.q")
    public int field52;

    @ObfuscatedName("y.o")
    public int field53;

    @ObfuscatedName("y.w")
    public int field54;

    @ObfuscatedName("y.m(Ldx;I)V")
    public final void method14(class119 arg0) {
        arg0.field1955 = 0;
        int var2 = arg0.method2562();
        this.field33 = arg0.method2382();
        this.field34 = arg0.method2382();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2562();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2562();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2541();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method168(var4[var5] - 512).field1115;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2562();
            if (var11 < 0 || var11 >= Statics.field2875[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field782 = arg0.method2541();
        if (this.field782 == 65535) {
            this.field782 = -1;
        }
        this.field783 = arg0.method2541();
        if (this.field783 == 65535) {
            this.field783 = -1;
        }
        this.field784 = this.field783;
        this.field786 = arg0.method2541();
        if (this.field786 == 65535) {
            this.field786 = -1;
        }
        this.field791 = arg0.method2541();
        if (this.field791 == 65535) {
            this.field791 = -1;
        }
        this.field787 = arg0.method2541();
        if (this.field787 == 65535) {
            this.field787 = -1;
        }
        this.field821 = arg0.method2541();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field789 = arg0.method2541();
        if (this.field789 == 65535) {
            this.field789 = -1;
        }
        this.field47 = arg0.method2389();
        if (Statics.field989 == this) {
            Statics.field2194 = this.field47;
        }
        this.field35 = arg0.method2562();
        this.field36 = arg0.method2541();
        this.field44 = arg0.method2562() == 1;
        if (client.field520 == 0 && client.field493 >= 2) {
            this.field44 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class179();
        }
        this.field32.method3309(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.l(I)I")
    public int method15() {
        return this.field32 == null || this.field32.field2900 == -1 ? 1 : class40.method50(this.field32.field2900).field876;
    }

    @ObfuscatedName("y.y(I)Ldb;")
    public final class105 method16() {
        if (this.field32 == null) {
            return null;
        }
        class43 var1 = this.field808 != -1 && this.field811 == 0 ? class43.method2262(this.field808) : null;
        class43 var2 = this.field792 == -1 || this.field48 || this.field792 == this.field782 && var1 != null ? null : class43.method2262(this.field792);
        class105 var3 = this.field32.method3305(var1, this.field828, var2, this.field806);
        if (var3 == null) {
            return null;
        }
        var3.method2188();
        this.field826 = var3.field1408;
        if (!this.field48 && this.field813 != -1 && this.field814 != -1) {
            class105 var4 = class44.method875(this.field813).method922(this.field814);
            if (var4 != null) {
                var4.method2198(0, -this.field809, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field423 >= this.field50) {
                this.field43 = null;
            }
            if (client.field423 >= this.field38 && client.field423 < this.field50) {
                class105 var6 = this.field43;
                var6.method2198(this.field46 - this.field815, this.field41 - this.field51, this.field42 - this.field805);
                if (this.field827 == 512) {
                    var6.method2184();
                    var6.method2184();
                    var6.method2184();
                } else if (this.field827 == 1024) {
                    var6.method2184();
                    var6.method2184();
                } else if (this.field827 == 1536) {
                    var6.method2184();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field827 == 512) {
                    var6.method2184();
                } else if (this.field827 == 1024) {
                    var6.method2184();
                    var6.method2184();
                } else if (this.field827 == 1536) {
                    var6.method2184();
                    var6.method2184();
                    var6.method2184();
                }
                var6.method2198(this.field815 - this.field46, this.field51 - this.field41, this.field805 - this.field42);
            }
        }
        var3.field1772 = true;
        return var3;
    }

    @ObfuscatedName("y.u(IIBI)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field808 != -1 && class43.method2262(this.field808).field967 == 1) {
            this.field808 = -1;
        }
        this.field804 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method18(this.field815, this.field805);
        } else if (this.field831[0] >= 0 && this.field831[0] < 104 && this.field832[0] >= 0 && this.field832[0] < 104) {
            if (arg2 == 2) {
                client.method2829(this, arg0, arg1, (byte) 2);
            }
            this.method21(arg0, arg1, arg2);
        } else {
            this.method18(this.field815, this.field805);
        }
    }

    @ObfuscatedName("y.k(III)V")
    public void method18(int arg0, int arg1) {
        this.field830 = 0;
        this.field825 = 0;
        this.field817 = 0;
        this.field831[0] = arg0;
        this.field832[0] = arg1;
        int var3 = this.method15();
        this.field815 = this.field831[0] * 128 + var3 * 64;
        this.field805 = this.field832[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("y.j(IIBB)V")
    public final void method21(int arg0, int arg1, byte arg2) {
        if (this.field830 < 9) {
            this.field830++;
        }
        for (int var4 = this.field830; var4 > 0; var4--) {
            this.field831[var4] = this.field831[var4 - 1];
            this.field832[var4] = this.field832[var4 - 1];
            this.field834[var4] = this.field834[var4 - 1];
        }
        this.field831[0] = arg0;
        this.field832[0] = arg1;
        this.field834[0] = arg2;
    }

    @ObfuscatedName("y.i(I)Z")
    public final boolean method20() {
        return this.field32 != null;
    }
}
