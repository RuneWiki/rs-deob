package deob;

@ObfuscatedName("n")
public final class class3 extends class40 {

    @ObfuscatedName("n.f")
    public String field56;

    @ObfuscatedName("n.e")
    public class183 field32;

    @ObfuscatedName("n.n")
    public int field57 = -1;

    @ObfuscatedName("n.t")
    public int field34 = -1;

    @ObfuscatedName("n.b")
    public String[] field36 = new String[3];

    @ObfuscatedName("n.m")
    public int field54;

    @ObfuscatedName("n.k")
    public int field38;

    @ObfuscatedName("n.c")
    public int field39;

    @ObfuscatedName("n.w")
    public int field40;

    @ObfuscatedName("n.l")
    public int field41;

    @ObfuscatedName("n.h")
    public int field43;

    @ObfuscatedName("n.i")
    public int field33;

    @ObfuscatedName("n.u")
    public int field44;

    @ObfuscatedName("n.x")
    public class109 field45;

    @ObfuscatedName("n.d")
    public int field46;

    @ObfuscatedName("n.o")
    public int field47;

    @ObfuscatedName("n.j")
    public int field48;

    @ObfuscatedName("n.q")
    public int field31;

    @ObfuscatedName("n.r")
    public boolean field50;

    @ObfuscatedName("n.a")
    public int field51;

    @ObfuscatedName("n.z")
    public boolean field53;

    @ObfuscatedName("n.p")
    public int field42;

    @ObfuscatedName("n.y")
    public int field58;

    @ObfuscatedName("n.s")
    public boolean field55;

    @ObfuscatedName("n.g")
    public int field37;

    @ObfuscatedName("n.aj")
    public int field49;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field36[var1] = "";
        }
        this.field54 = 0;
        this.field38 = 0;
        this.field40 = 0;
        this.field41 = 0;
        this.field50 = false;
        this.field51 = 0;
        this.field53 = false;
        this.field55 = false;
    }

    @ObfuscatedName("n.f(Ldx;I)V")
    public final void method19(class123 arg0) {
        arg0.field2052 = 0;
        int var2 = arg0.method2522();
        this.field57 = arg0.method2400();
        this.field34 = arg0.method2400();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2522();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2522();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2401();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method905(var4[var5] - 512).field1194;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2522();
            if (var11 < 0 || var11 >= Statics.field2121[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field822 = arg0.method2401();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field848 = arg0.method2401();
        if (this.field848 == 65535) {
            this.field848 = -1;
        }
        this.field824 = this.field848;
        this.field825 = arg0.method2401();
        if (this.field825 == 65535) {
            this.field825 = -1;
        }
        this.field826 = arg0.method2401();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field827 = arg0.method2401();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field828 = arg0.method2401();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field829 = arg0.method2401();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field56 = arg0.method2407();
        if (Statics.field767 == this) {
            Statics.field2090 = this.field56;
        }
        this.field54 = arg0.method2522();
        this.field38 = arg0.method2401();
        this.field53 = arg0.method2522() == 1;
        if (client.field344 == 0 && client.field447 >= 2) {
            this.field53 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class183();
        }
        this.field32.method3365(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("n.e(B)I")
    public int method41() {
        return this.field32 == null || this.field32.field2965 == -1 ? 1 : class42.method644(this.field32.field2965).field895;
    }

    @ObfuscatedName("n.n(B)Ldg;")
    public final class109 method36() {
        if (this.field32 == null) {
            return null;
        }
        class45 var1 = this.field849 != -1 && this.field852 == 0 ? class45.method1289(this.field849) : null;
        class45 var2 = this.field857 == -1 || this.field50 || this.field857 == this.field822 && var1 != null ? null : class45.method1289(this.field857);
        class109 var3 = this.field32.method3339(var1, this.field850, var2, this.field855);
        if (var3 == null) {
            return null;
        }
        var3.method2251();
        this.field840 = var3.field1518;
        if (!this.field50 && this.field854 != -1 && this.field836 != -1) {
            class109 var4 = class46.method2917(this.field854).method901(this.field836);
            if (var4 != null) {
                var4.method2215(0, -this.field861, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field291 >= this.field41) {
                this.field45 = null;
            }
            if (client.field291 >= this.field40 && client.field291 < this.field41) {
                class109 var6 = this.field45;
                var6.method2215(this.field43 - this.field864, this.field33 - this.field39, this.field44 - this.field818);
                if (this.field874 == 512) {
                    var6.method2206();
                    var6.method2206();
                    var6.method2206();
                } else if (this.field874 == 1024) {
                    var6.method2206();
                    var6.method2206();
                } else if (this.field874 == 1536) {
                    var6.method2206();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field874 == 512) {
                    var6.method2206();
                } else if (this.field874 == 1024) {
                    var6.method2206();
                    var6.method2206();
                } else if (this.field874 == 1536) {
                    var6.method2206();
                    var6.method2206();
                    var6.method2206();
                }
                var6.method2215(this.field864 - this.field43, this.field39 - this.field33, this.field818 - this.field44);
            }
        }
        var3.field1916 = true;
        return var3;
    }

    @ObfuscatedName("n.t(IIBB)V")
    public final void method22(int arg0, int arg1, byte arg2) {
        if (this.field849 != -1 && class45.method1289(this.field849).field998 == 1) {
            this.field849 = -1;
        }
        this.field845 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method23(arg0, arg1);
        } else if (this.field872[0] >= 0 && this.field872[0] < 104 && this.field837[0] >= 0 && this.field837[0] < 104) {
            if (arg2 == 2) {
                client.method104(this, arg0, arg1, (byte) 2);
            }
            this.method24(arg0, arg1, arg2);
        } else {
            this.method23(arg0, arg1);
        }
    }

    @ObfuscatedName("n.v(III)V")
    public void method23(int arg0, int arg1) {
        this.field868 = 0;
        this.field876 = 0;
        this.field873 = 0;
        this.field872[0] = arg0;
        this.field837[0] = arg1;
        int var3 = this.method41();
        this.field864 = this.field872[0] * 128 + var3 * 64;
        this.field818 = this.field837[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("n.b(IIBI)V")
    public final void method24(int arg0, int arg1, byte arg2) {
        if (this.field868 < 9) {
            this.field868++;
        }
        for (int var4 = this.field868; var4 > 0; var4--) {
            this.field872[var4] = this.field872[var4 - 1];
            this.field837[var4] = this.field837[var4 - 1];
            this.field858[var4] = this.field858[var4 - 1];
        }
        this.field872[0] = arg0;
        this.field837[0] = arg1;
        this.field858[0] = arg2;
    }

    @ObfuscatedName("n.m(I)Z")
    public final boolean method25() {
        return this.field32 != null;
    }
}
