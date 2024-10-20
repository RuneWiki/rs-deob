package deob;

@ObfuscatedName("v")
public final class class3 extends class38 {

    @ObfuscatedName("v.d")
    public String field43;

    @ObfuscatedName("v.p")
    public class179 field31;

    @ObfuscatedName("v.v")
    public int field32 = -1;

    @ObfuscatedName("v.l")
    public int field33 = -1;

    @ObfuscatedName("v.w")
    public String[] field34 = new String[3];

    @ObfuscatedName("v.u")
    public int field58;

    @ObfuscatedName("v.a")
    public int field36;

    @ObfuscatedName("v.e")
    public int field47;

    @ObfuscatedName("v.b")
    public int field38;

    @ObfuscatedName("v.o")
    public int field39;

    @ObfuscatedName("v.m")
    public int field40;

    @ObfuscatedName("v.x")
    public int field41;

    @ObfuscatedName("v.k")
    public int field42;

    @ObfuscatedName("v.n")
    public class105 field53;

    @ObfuscatedName("v.j")
    public int field44;

    @ObfuscatedName("v.t")
    public int field45;

    @ObfuscatedName("v.z")
    public int field35;

    @ObfuscatedName("v.h")
    public int field30;

    @ObfuscatedName("v.i")
    public boolean field46;

    @ObfuscatedName("v.q")
    public int field49;

    @ObfuscatedName("v.r")
    public boolean field50;

    @ObfuscatedName("v.s")
    public int field56;

    @ObfuscatedName("v.g")
    public int field52;

    @ObfuscatedName("v.f")
    public boolean field51;

    @ObfuscatedName("v.c")
    public int field54;

    @ObfuscatedName("v.ae")
    public int field55;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field34[var1] = "";
        }
        this.field58 = 0;
        this.field36 = 0;
        this.field38 = 0;
        this.field39 = 0;
        this.field46 = false;
        this.field49 = 0;
        this.field50 = false;
        this.field51 = false;
    }

    @ObfuscatedName("v.d(Ldf;I)V")
    public final void method14(class119 arg0) {
        arg0.field1966 = 0;
        int var2 = arg0.method2357();
        this.field32 = arg0.method2477();
        this.field33 = arg0.method2477();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2357();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2357();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2359();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method193(var4[var5] - 512).field1155;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2357();
            if (var11 < 0 || var11 >= Statics.field2903[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field881 = arg0.method2359();
        if (this.field881 == 65535) {
            this.field881 = -1;
        }
        this.field826 = arg0.method2359();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field827 = this.field826;
        this.field828 = arg0.method2359();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field871 = arg0.method2359();
        if (this.field871 == 65535) {
            this.field871 = -1;
        }
        this.field822 = arg0.method2359();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field857 = arg0.method2359();
        if (this.field857 == 65535) {
            this.field857 = -1;
        }
        this.field832 = arg0.method2359();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field43 = arg0.method2365();
        if (Statics.field2222 == this) {
            Statics.field2199 = this.field43;
        }
        this.field58 = arg0.method2357();
        this.field36 = arg0.method2359();
        this.field50 = arg0.method2357() == 1;
        if (client.field376 == 0 && client.field456 >= 2) {
            this.field50 = false;
        }
        if (this.field31 == null) {
            this.field31 = new class179();
        }
        this.field31.method3308(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.p(I)I")
    public int method28() {
        return this.field31 == null || this.field31.field2909 == -1 ? 1 : class40.method1083(this.field31.field2909).field905;
    }

    @ObfuscatedName("v.v(B)Ldn;")
    public final class105 method15() {
        if (this.field31 == null) {
            return null;
        }
        class43 var1 = this.field829 != -1 && this.field854 == 0 ? class43.method578(this.field829) : null;
        class43 var2 = this.field848 == -1 || this.field46 || this.field881 == this.field848 && var1 != null ? null : class43.method578(this.field848);
        class105 var3 = this.field31.method3314(var1, this.field852, var2, this.field823);
        if (var3 == null) {
            return null;
        }
        var3.method2157();
        this.field869 = var3.field1448;
        if (!this.field46 && this.field856 != -1 && this.field837 != -1) {
            class105 var4 = class44.method723(this.field856).method878(this.field837);
            if (var4 != null) {
                var4.method2169(0, -this.field831, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field46 && this.field53 != null) {
            if (client.field299 >= this.field39) {
                this.field53 = null;
            }
            if (client.field299 >= this.field38 && client.field299 < this.field39) {
                class105 var6 = this.field53;
                var6.method2169(this.field40 - this.field851, this.field41 - this.field47, this.field42 - this.field821);
                if (this.field873 == 512) {
                    var6.method2186();
                    var6.method2186();
                    var6.method2186();
                } else if (this.field873 == 1024) {
                    var6.method2186();
                    var6.method2186();
                } else if (this.field873 == 1536) {
                    var6.method2186();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field873 == 512) {
                    var6.method2186();
                } else if (this.field873 == 1024) {
                    var6.method2186();
                    var6.method2186();
                } else if (this.field873 == 1536) {
                    var6.method2186();
                    var6.method2186();
                    var6.method2186();
                }
                var6.method2169(this.field851 - this.field40, this.field47 - this.field41, this.field821 - this.field42);
            }
        }
        var3.field1815 = true;
        return var3;
    }

    @ObfuscatedName("v.l(IIBI)V")
    public final void method20(int arg0, int arg1, byte arg2) {
        if (this.field829 != -1 && class43.method578(this.field829).field991 == 1) {
            this.field829 = -1;
        }
        this.field847 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method17(arg0, arg1);
        } else if (this.field864[0] >= 0 && this.field864[0] < 104 && this.field875[0] >= 0 && this.field875[0] < 104) {
            if (arg2 == 2) {
                client.method2056(this, arg0, arg1, (byte) 2);
            }
            this.method18(arg0, arg1, arg2);
        } else {
            this.method17(arg0, arg1);
        }
    }

    @ObfuscatedName("v.y(III)V")
    public void method17(int arg0, int arg1) {
        this.field820 = 0;
        this.field878 = 0;
        this.field877 = 0;
        this.field864[0] = arg0;
        this.field875[0] = arg1;
        int var3 = this.method28();
        this.field851 = this.field864[0] * 128 + var3 * 64;
        this.field821 = this.field875[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("v.w(IIBI)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (this.field820 < 9) {
            this.field820++;
        }
        for (int var4 = this.field820; var4 > 0; var4--) {
            this.field864[var4] = this.field864[var4 - 1];
            this.field875[var4] = this.field875[var4 - 1];
            this.field870[var4] = this.field870[var4 - 1];
        }
        this.field864[0] = arg0;
        this.field875[0] = arg1;
        this.field870[0] = arg2;
    }

    @ObfuscatedName("v.u(B)Z")
    public final boolean method19() {
        return this.field31 != null;
    }
}
