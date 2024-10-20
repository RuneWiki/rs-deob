package deob;

@ObfuscatedName("i")
public final class class3 extends class38 {

    @ObfuscatedName("i.h")
    public String field56;

    @ObfuscatedName("i.m")
    public class179 field32;

    @ObfuscatedName("i.i")
    public int field34 = -1;

    @ObfuscatedName("i.q")
    public int field35 = -1;

    @ObfuscatedName("i.p")
    public int field36 = 0;

    @ObfuscatedName("i.c")
    public int field37 = 0;

    @ObfuscatedName("i.f")
    public int field38;

    @ObfuscatedName("i.y")
    public int field39 = 0;

    @ObfuscatedName("i.w")
    public int field48 = 0;

    @ObfuscatedName("i.l")
    public int field33;

    @ObfuscatedName("i.v")
    public int field42;

    @ObfuscatedName("i.k")
    public int field49;

    @ObfuscatedName("i.o")
    public class105 field45;

    @ObfuscatedName("i.u")
    public int field46;

    @ObfuscatedName("i.s")
    public int field43;

    @ObfuscatedName("i.g")
    public int field47;

    @ObfuscatedName("i.x")
    public int field41;

    @ObfuscatedName("i.a")
    public boolean field40 = false;

    @ObfuscatedName("i.t")
    public int field50 = 0;

    @ObfuscatedName("i.z")
    public boolean field51 = false;

    @ObfuscatedName("i.r")
    public int field52;

    @ObfuscatedName("i.d")
    public int field53;

    @ObfuscatedName("i.n")
    public int field54;

    @ObfuscatedName("i.j")
    public int field55;

    @ObfuscatedName("i.h(Ldp;I)V")
    public final void method9(class119 arg0) {
        arg0.field1988 = 0;
        int var2 = arg0.method2320();
        this.field34 = arg0.method2425();
        this.field35 = arg0.method2425();
        int var3 = -1;
        this.field50 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2320();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2320();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2322();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2933(var4[var5] - 512).field1161;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2320();
            if (var11 < 0 || var11 >= Statics.field160[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field822 = arg0.method2322();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field832 = arg0.method2322();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field824 = this.field832;
        this.field825 = arg0.method2322();
        if (this.field825 == 65535) {
            this.field825 = -1;
        }
        this.field831 = arg0.method2322();
        if (this.field831 == 65535) {
            this.field831 = -1;
        }
        this.field827 = arg0.method2322();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field862 = arg0.method2322();
        if (this.field862 == 65535) {
            this.field862 = -1;
        }
        this.field829 = arg0.method2322();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field56 = arg0.method2350();
        if (Statics.field2683 == this) {
            Statics.field2222 = this.field56;
        }
        this.field36 = arg0.method2320();
        this.field37 = arg0.method2322();
        this.field51 = arg0.method2320() == 1;
        if (client.field324 == 0 && client.field452 >= 2) {
            this.field51 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class179();
        }
        this.field32.method3230(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.m(B)I")
    public int method10() {
        return this.field32 == null || this.field32.field2907 == -1 ? 1 : class40.method2608(this.field32.field2907).field894;
    }

    @ObfuscatedName("i.i(B)Ldb;")
    public final class105 method34() {
        if (this.field32 == null) {
            return null;
        }
        class43 var1 = this.field848 != -1 && this.field855 == 0 ? class43.method2257(this.field848) : null;
        class43 var2 = this.field849 == -1 || this.field40 || this.field849 == this.field822 && var1 != null ? null : class43.method2257(this.field849);
        class105 var3 = this.field32.method3246(var1, this.field856, var2, this.field846);
        if (var3 == null) {
            return null;
        }
        var3.method2121();
        this.field866 = var3.field1458;
        if (!this.field40 && this.field853 != -1 && this.field876 != -1) {
            class105 var4 = class44.method2239(this.field853).method870(this.field876);
            if (var4 != null) {
                var4.method2130(0, -this.field857, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field40 && this.field45 != null) {
            if (client.field295 >= this.field48) {
                this.field45 = null;
            }
            if (client.field295 >= this.field39 && client.field295 < this.field48) {
                class105 var6 = this.field45;
                var6.method2130(this.field33 - this.field861, this.field42 - this.field38, this.field49 - this.field818);
                if (this.field867 == 512) {
                    var6.method2127();
                    var6.method2127();
                    var6.method2127();
                } else if (this.field867 == 1024) {
                    var6.method2127();
                    var6.method2127();
                } else if (this.field867 == 1536) {
                    var6.method2127();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field867 == 512) {
                    var6.method2127();
                } else if (this.field867 == 1024) {
                    var6.method2127();
                    var6.method2127();
                } else if (this.field867 == 1536) {
                    var6.method2127();
                    var6.method2127();
                    var6.method2127();
                }
                var6.method2130(this.field861 - this.field33, this.field38 - this.field42, this.field818 - this.field49);
            }
        }
        var3.field1807 = true;
        return var3;
    }

    @ObfuscatedName("i.q(IIBI)V")
    public final void method16(int arg0, int arg1, byte arg2) {
        if (this.field848 != -1 && class43.method2257(this.field848).field1005 == 1) {
            this.field848 = -1;
        }
        this.field844 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method22(this.field861, this.field818);
        } else if (this.field871[0] >= 0 && this.field871[0] < 104 && this.field872[0] >= 0 && this.field872[0] < 104) {
            if (arg2 == 2) {
                client.method159(this, arg0, arg1, (byte) 2);
            }
            this.method17(arg0, arg1, arg2);
        } else {
            this.method22(this.field861, this.field818);
        }
    }

    @ObfuscatedName("i.p(III)V")
    public void method22(int arg0, int arg1) {
        this.field870 = 0;
        this.field875 = 0;
        this.field874 = 0;
        this.field871[0] = arg0;
        this.field872[0] = arg1;
        int var3 = this.method10();
        this.field861 = this.field871[0] * 128 + var3 * 64;
        this.field818 = this.field872[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("i.c(IIBI)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field870 < 9) {
            this.field870++;
        }
        for (int var4 = this.field870; var4 > 0; var4--) {
            this.field871[var4] = this.field871[var4 - 1];
            this.field872[var4] = this.field872[var4 - 1];
            this.field873[var4] = this.field873[var4 - 1];
        }
        this.field871[0] = arg0;
        this.field872[0] = arg1;
        this.field873[0] = arg2;
    }

    @ObfuscatedName("i.f(I)Z")
    public final boolean method14() {
        return this.field32 != null;
    }
}
