package deob;

@ObfuscatedName("f")
public final class class3 extends class38 {

    @ObfuscatedName("f.i")
    public String field51;

    @ObfuscatedName("f.v")
    public class179 field35;

    @ObfuscatedName("f.f")
    public int field47 = -1;

    @ObfuscatedName("f.h")
    public int field38 = -1;

    @ObfuscatedName("f.a")
    public int field44 = 0;

    @ObfuscatedName("f.s")
    public int field40 = 0;

    @ObfuscatedName("f.p")
    public int field52;

    @ObfuscatedName("f.r")
    public int field36 = 0;

    @ObfuscatedName("f.k")
    public int field43 = 0;

    @ObfuscatedName("f.d")
    public int field50;

    @ObfuscatedName("f.n")
    public int field45;

    @ObfuscatedName("f.z")
    public int field46;

    @ObfuscatedName("f.c")
    public class105 field49;

    @ObfuscatedName("f.b")
    public int field48;

    @ObfuscatedName("f.w")
    public int field39;

    @ObfuscatedName("f.g")
    public int field60;

    @ObfuscatedName("f.x")
    public int field37;

    @ObfuscatedName("f.o")
    public boolean field42 = false;

    @ObfuscatedName("f.l")
    public int field53 = 0;

    @ObfuscatedName("f.j")
    public boolean field54 = false;

    @ObfuscatedName("f.m")
    public int field55;

    @ObfuscatedName("f.e")
    public int field56;

    @ObfuscatedName("f.u")
    public boolean field57 = false;

    @ObfuscatedName("f.y")
    public int field58;

    @ObfuscatedName("f.t")
    public int field59;

    @ObfuscatedName("f.i(Ldj;I)V")
    public final void method15(class119 arg0) {
        arg0.field1984 = 0;
        int var2 = arg0.method2310();
        this.field47 = arg0.method2311();
        this.field38 = arg0.method2311();
        int var3 = -1;
        this.field53 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2310();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2310();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2312();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2618(var4[var5] - 512).field1155;
                    if (var8 != 0) {
                        this.field53 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2310();
            if (var11 < 0 || var11 >= Statics.field2253[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field829 = arg0.method2312();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field827 = arg0.method2312();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field831 = this.field827;
        this.field857 = arg0.method2312();
        if (this.field857 == 65535) {
            this.field857 = -1;
        }
        this.field876 = arg0.method2312();
        if (this.field876 == 65535) {
            this.field876 = -1;
        }
        this.field883 = arg0.method2312();
        if (this.field883 == 65535) {
            this.field883 = -1;
        }
        this.field835 = arg0.method2312();
        if (this.field835 == 65535) {
            this.field835 = -1;
        }
        this.field867 = arg0.method2312();
        if (this.field867 == 65535) {
            this.field867 = -1;
        }
        this.field51 = arg0.method2318();
        if (Statics.field162 == this) {
            Statics.field2219 = this.field51;
        }
        this.field44 = arg0.method2310();
        this.field40 = arg0.method2312();
        this.field54 = arg0.method2310() == 1;
        if (client.field293 == 0 && client.field456 >= 2) {
            this.field54 = false;
        }
        if (this.field35 == null) {
            this.field35 = new class179();
        }
        this.field35.method3227(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.v(I)I")
    public int method16() {
        return this.field35 == null || this.field35.field2904 == -1 ? 1 : class40.method151(this.field35.field2904).field903;
    }

    @ObfuscatedName("f.f(I)Ldo;")
    public final class105 method29() {
        if (this.field35 == null) {
            return null;
        }
        class43 var1 = this.field839 != -1 && this.field858 == 0 ? class43.method3831(this.field839) : null;
        class43 var2 = this.field832 == -1 || this.field42 || this.field832 == this.field829 && var1 != null ? null : class43.method3831(this.field832);
        class105 var3 = this.field35.method3233(var1, this.field856, var2, this.field853);
        if (var3 == null) {
            return null;
        }
        var3.method2131();
        this.field873 = var3.field1452;
        if (!this.field42 && this.field852 != -1 && this.field861 != -1) {
            class105 var4 = class44.method769(this.field852).method840(this.field861);
            if (var4 != null) {
                var4.method2101(0, -this.field864, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field42 && this.field49 != null) {
            if (client.field302 >= this.field43) {
                this.field49 = null;
            }
            if (client.field302 >= this.field36 && client.field302 < this.field43) {
                class105 var6 = this.field49;
                var6.method2101(this.field50 - this.field855, this.field45 - this.field52, this.field46 - this.field825);
                if (this.field874 == 512) {
                    var6.method2107();
                    var6.method2107();
                    var6.method2107();
                } else if (this.field874 == 1024) {
                    var6.method2107();
                    var6.method2107();
                } else if (this.field874 == 1536) {
                    var6.method2107();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field874 == 512) {
                    var6.method2107();
                } else if (this.field874 == 1024) {
                    var6.method2107();
                    var6.method2107();
                } else if (this.field874 == 1536) {
                    var6.method2107();
                    var6.method2107();
                    var6.method2107();
                }
                var6.method2101(this.field855 - this.field50, this.field52 - this.field45, this.field825 - this.field46);
            }
        }
        var3.field1813 = true;
        return var3;
    }

    @ObfuscatedName("f.h(IIBI)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (this.field839 != -1 && class43.method3831(this.field839).field1013 == 1) {
            this.field839 = -1;
        }
        this.field830 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method37(arg0, arg1);
        } else if (this.field878[0] >= 0 && this.field878[0] < 104 && this.field879[0] >= 0 && this.field879[0] < 104) {
            if (arg2 == 2) {
                client.method2941(this, arg0, arg1, (byte) 2);
            }
            this.method19(arg0, arg1, arg2);
        } else {
            this.method37(arg0, arg1);
        }
    }

    @ObfuscatedName("f.a(III)V")
    public void method37(int arg0, int arg1) {
        this.field882 = 0;
        this.field851 = 0;
        this.field881 = 0;
        this.field878[0] = arg0;
        this.field879[0] = arg1;
        int var3 = this.method16();
        this.field855 = this.field878[0] * 128 + var3 * 64;
        this.field825 = this.field879[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("f.s(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field882 < 9) {
            this.field882++;
        }
        for (int var4 = this.field882; var4 > 0; var4--) {
            this.field878[var4] = this.field878[var4 - 1];
            this.field879[var4] = this.field879[var4 - 1];
            this.field880[var4] = this.field880[var4 - 1];
        }
        this.field878[0] = arg0;
        this.field879[0] = arg1;
        this.field880[0] = arg2;
    }

    @ObfuscatedName("f.p(I)Z")
    public final boolean method20() {
        return this.field35 != null;
    }
}
