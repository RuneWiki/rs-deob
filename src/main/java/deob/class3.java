package deob;

@ObfuscatedName("i")
public final class class3 extends class38 {

    @ObfuscatedName("i.v")
    public String field36;

    @ObfuscatedName("i.f")
    public class179 field32;

    @ObfuscatedName("i.i")
    public int field33 = -1;

    @ObfuscatedName("i.d")
    public int field40 = -1;

    @ObfuscatedName("i.c")
    public String[] field54 = new String[3];

    @ObfuscatedName("i.p")
    public int field31;

    @ObfuscatedName("i.j")
    public int field37;

    @ObfuscatedName("i.a")
    public int field39;

    @ObfuscatedName("i.y")
    public int field49;

    @ObfuscatedName("i.h")
    public int field41;

    @ObfuscatedName("i.z")
    public int field59;

    @ObfuscatedName("i.w")
    public int field43;

    @ObfuscatedName("i.l")
    public int field44;

    @ObfuscatedName("i.q")
    public class105 field45;

    @ObfuscatedName("i.x")
    public int field47;

    @ObfuscatedName("i.s")
    public int field34;

    @ObfuscatedName("i.n")
    public int field48;

    @ObfuscatedName("i.u")
    public int field52;

    @ObfuscatedName("i.m")
    public boolean field50;

    @ObfuscatedName("i.e")
    public int field51;

    @ObfuscatedName("i.k")
    public boolean field46;

    @ObfuscatedName("i.r")
    public int field53;

    @ObfuscatedName("i.b")
    public int field60;

    @ObfuscatedName("i.t")
    public boolean field55;

    @ObfuscatedName("i.g")
    public int field56;

    @ObfuscatedName("i.af")
    public int field57;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field54[var1] = "";
        }
        this.field31 = 0;
        this.field37 = 0;
        this.field49 = 0;
        this.field41 = 0;
        this.field50 = false;
        this.field51 = 0;
        this.field46 = false;
        this.field55 = false;
    }

    @ObfuscatedName("i.v(Ldx;I)V")
    public final void method16(class119 arg0) {
        arg0.field1984 = 0;
        int var2 = arg0.method2400();
        this.field33 = arg0.method2350();
        this.field40 = arg0.method2350();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2400();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2400();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2334();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method36(var4[var5] - 512).field1151;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2400();
            if (var11 < 0 || var11 >= Statics.field133[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field813 = arg0.method2334();
        if (this.field813 == 65535) {
            this.field813 = -1;
        }
        this.field814 = arg0.method2334();
        if (this.field814 == 65535) {
            this.field814 = -1;
        }
        this.field815 = this.field814;
        this.field810 = arg0.method2334();
        if (this.field810 == 65535) {
            this.field810 = -1;
        }
        this.field834 = arg0.method2334();
        if (this.field834 == 65535) {
            this.field834 = -1;
        }
        this.field866 = arg0.method2334();
        if (this.field866 == 65535) {
            this.field866 = -1;
        }
        this.field861 = arg0.method2334();
        if (this.field861 == 65535) {
            this.field861 = -1;
        }
        this.field820 = arg0.method2334();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field36 = arg0.method2357();
        if (Statics.field242 == this) {
            Statics.field2229 = this.field36;
        }
        this.field31 = arg0.method2400();
        this.field37 = arg0.method2334();
        this.field46 = arg0.method2400() == 1;
        if (client.field291 == 0 && client.field454 >= 2) {
            this.field46 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class179();
        }
        this.field32.method3242(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.f(I)I")
    public int method28() {
        return this.field32 == null || this.field32.field2925 == -1 ? 1 : class40.method706(this.field32.field2925).field883;
    }

    @ObfuscatedName("i.i(I)Ldq;")
    public final class105 method9() {
        if (this.field32 == null) {
            return null;
        }
        class43 var1 = this.field839 != -1 && this.field809 == 0 ? class43.method616(this.field839) : null;
        class43 var2 = this.field836 == -1 || this.field50 || this.field836 == this.field813 && var1 != null ? null : class43.method616(this.field836);
        class105 var3 = this.field32.method3248(var1, this.field840, var2, this.field816);
        if (var3 == null) {
            return null;
        }
        var3.method2159();
        this.field857 = var3.field1443;
        if (!this.field50 && this.field844 != -1 && this.field845 != -1) {
            class105 var4 = class44.method1502(this.field844).method874(this.field845);
            if (var4 != null) {
                var4.method2169(0, -this.field848, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field298 >= this.field41) {
                this.field45 = null;
            }
            if (client.field298 >= this.field49 && client.field298 < this.field41) {
                class105 var6 = this.field45;
                var6.method2169(this.field59 - this.field863, this.field43 - this.field39, this.field44 - this.field819);
                if (this.field858 == 512) {
                    var6.method2165();
                    var6.method2165();
                    var6.method2165();
                } else if (this.field858 == 1024) {
                    var6.method2165();
                    var6.method2165();
                } else if (this.field858 == 1536) {
                    var6.method2165();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field858 == 512) {
                    var6.method2165();
                } else if (this.field858 == 1024) {
                    var6.method2165();
                    var6.method2165();
                } else if (this.field858 == 1536) {
                    var6.method2165();
                    var6.method2165();
                    var6.method2165();
                }
                var6.method2169(this.field863 - this.field59, this.field39 - this.field43, this.field819 - this.field44);
            }
        }
        var3.field1796 = true;
        return var3;
    }

    @ObfuscatedName("i.d(IIBI)V")
    public final void method10(int arg0, int arg1, byte arg2) {
        if (this.field839 != -1 && class43.method616(this.field839).field983 == 1) {
            this.field839 = -1;
        }
        this.field835 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method11(arg0, arg1);
        } else if (this.field862[0] >= 0 && this.field862[0] < 104 && this.field856[0] >= 0 && this.field856[0] < 104) {
            if (arg2 == 2) {
                client.method3148(this, arg0, arg1, (byte) 2);
            }
            this.method12(arg0, arg1, arg2);
        } else {
            this.method11(arg0, arg1);
        }
    }

    @ObfuscatedName("i.o(III)V")
    public void method11(int arg0, int arg1) {
        this.field842 = 0;
        this.field853 = 0;
        this.field837 = 0;
        this.field862[0] = arg0;
        this.field856[0] = arg1;
        int var3 = this.method28();
        this.field863 = this.field862[0] * 128 + var3 * 64;
        this.field819 = this.field856[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("i.c(IIBI)V")
    public final void method12(int arg0, int arg1, byte arg2) {
        if (this.field842 < 9) {
            this.field842++;
        }
        for (int var4 = this.field842; var4 > 0; var4--) {
            this.field862[var4] = this.field862[var4 - 1];
            this.field856[var4] = this.field856[var4 - 1];
            this.field864[var4] = this.field864[var4 - 1];
        }
        this.field862[0] = arg0;
        this.field856[0] = arg1;
        this.field864[0] = arg2;
    }

    @ObfuscatedName("i.p(I)Z")
    public final boolean method13() {
        return this.field32 != null;
    }
}
