package deob;

@ObfuscatedName("g")
public final class class3 extends class38 {

    @ObfuscatedName("g.t")
    public String field40;

    @ObfuscatedName("g.i")
    public class180 field60;

    @ObfuscatedName("g.g")
    public int field38 = -1;

    @ObfuscatedName("g.h")
    public int field39 = -1;

    @ObfuscatedName("g.r")
    public String[] field41 = new String[3];

    @ObfuscatedName("g.f")
    public int field42;

    @ObfuscatedName("g.s")
    public int field55;

    @ObfuscatedName("g.d")
    public int field44;

    @ObfuscatedName("g.l")
    public int field54;

    @ObfuscatedName("g.y")
    public int field46;

    @ObfuscatedName("g.p")
    public int field47;

    @ObfuscatedName("g.k")
    public int field48;

    @ObfuscatedName("g.o")
    public int field53;

    @ObfuscatedName("g.b")
    public class106 field36;

    @ObfuscatedName("g.j")
    public int field61;

    @ObfuscatedName("g.a")
    public int field50;

    @ObfuscatedName("g.u")
    public int field37;

    @ObfuscatedName("g.c")
    public int field51;

    @ObfuscatedName("g.n")
    public boolean field52;

    @ObfuscatedName("g.q")
    public int field56;

    @ObfuscatedName("g.x")
    public boolean field57;

    @ObfuscatedName("g.v")
    public int field58;

    @ObfuscatedName("g.m")
    public int field59;

    @ObfuscatedName("g.w")
    public boolean field49;

    @ObfuscatedName("g.e")
    public int field45;

    @ObfuscatedName("g.ad")
    public int field62;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field41[var1] = "";
        }
        this.field42 = 0;
        this.field55 = 0;
        this.field54 = 0;
        this.field46 = 0;
        this.field52 = false;
        this.field56 = 0;
        this.field57 = false;
        this.field49 = false;
    }

    @ObfuscatedName("g.t(Ldr;I)V")
    public final void method13(class120 arg0) {
        arg0.field2001 = 0;
        int var2 = arg0.method2334();
        this.field38 = arg0.method2309();
        this.field39 = arg0.method2309();
        int var3 = -1;
        this.field56 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2334();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2334();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2310();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2583(var4[var5] - 512).field1158;
                    if (var8 != 0) {
                        this.field56 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2334();
            if (var11 < 0 || var11 >= Statics.field2061[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field809 = arg0.method2310();
        if (this.field809 == 65535) {
            this.field809 = -1;
        }
        this.field838 = arg0.method2310();
        if (this.field838 == 65535) {
            this.field838 = -1;
        }
        this.field811 = this.field838;
        this.field812 = arg0.method2310();
        if (this.field812 == 65535) {
            this.field812 = -1;
        }
        this.field813 = arg0.method2310();
        if (this.field813 == 65535) {
            this.field813 = -1;
        }
        this.field815 = arg0.method2310();
        if (this.field815 == 65535) {
            this.field815 = -1;
        }
        this.field858 = arg0.method2310();
        if (this.field858 == 65535) {
            this.field858 = -1;
        }
        this.field816 = arg0.method2310();
        if (this.field816 == 65535) {
            this.field816 = -1;
        }
        this.field40 = arg0.method2316();
        if (Statics.field2302 == this) {
            Statics.field2170 = this.field40;
        }
        this.field42 = arg0.method2334();
        this.field55 = arg0.method2310();
        this.field57 = arg0.method2334() == 1;
        if (client.field385 == 0 && client.field450 >= 2) {
            this.field57 = false;
        }
        if (this.field60 == null) {
            this.field60 = new class180();
        }
        this.field60.method3204(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("g.i(I)I")
    public int method31() {
        return this.field60 == null || this.field60.field2942 == -1 ? 1 : class40.method160(this.field60.field2942).field882;
    }

    @ObfuscatedName("g.g(I)Ldk;")
    public final class106 method11() {
        if (this.field60 == null) {
            return null;
        }
        class43 var1 = this.field835 != -1 && this.field825 == 0 ? class43.method168(this.field835) : null;
        class43 var2 = this.field828 == -1 || this.field52 || this.field828 == this.field809 && var1 != null ? null : class43.method168(this.field828);
        class106 var3 = this.field60.method3209(var1, this.field820, var2, this.field833);
        if (var3 == null) {
            return null;
        }
        var3.method2107();
        this.field853 = var3.field1467;
        if (!this.field52 && this.field837 != -1 && this.field841 != -1) {
            class106 var4 = class44.method153(this.field837).method851(this.field841);
            if (var4 != null) {
                var4.method2116(0, -this.field804, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field52 && this.field36 != null) {
            if (client.field333 >= this.field46) {
                this.field36 = null;
            }
            if (client.field333 >= this.field54 && client.field333 < this.field46) {
                class106 var6 = this.field36;
                var6.method2116(this.field47 - this.field810, this.field48 - this.field44, this.field53 - this.field805);
                if (this.field832 == 512) {
                    var6.method2112();
                    var6.method2112();
                    var6.method2112();
                } else if (this.field832 == 1024) {
                    var6.method2112();
                    var6.method2112();
                } else if (this.field832 == 1536) {
                    var6.method2112();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field832 == 512) {
                    var6.method2112();
                } else if (this.field832 == 1024) {
                    var6.method2112();
                    var6.method2112();
                } else if (this.field832 == 1536) {
                    var6.method2112();
                    var6.method2112();
                    var6.method2112();
                }
                var6.method2116(this.field810 - this.field47, this.field44 - this.field48, this.field805 - this.field53);
            }
        }
        var3.field1807 = true;
        return var3;
    }

    @ObfuscatedName("g.h(IIBI)V")
    public final void method12(int arg0, int arg1, byte arg2) {
        if (this.field835 != -1 && class43.method168(this.field835).field993 == 1) {
            this.field835 = -1;
        }
        this.field831 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method30(arg0, arg1);
        } else if (this.field848[0] >= 0 && this.field848[0] < 104 && this.field840[0] >= 0 && this.field840[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field848[0];
                int var6 = this.field840[0];
                int var7 = this.method31();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method31();
                    client.field325.field1884 = arg0;
                    client.field325.field1888 = arg1;
                    client.field325.field1885 = 1;
                    client.field325.field1890 = 1;
                    class11 var11 = client.field325;
                    int var12 = class107.method1907(var5, var6, var10, var11, client.field345[this.field58], true, client.field564, client.field436);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method14(client.field564[var13], client.field436[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method14(arg0, arg1, arg2);
        } else {
            this.method30(arg0, arg1);
        }
    }

    @ObfuscatedName("g.z(IIS)V")
    public void method30(int arg0, int arg1) {
        this.field857 = 0;
        this.field862 = 0;
        this.field861 = 0;
        this.field848[0] = arg0;
        this.field840[0] = arg1;
        int var3 = this.method31();
        this.field810 = this.field848[0] * 128 + var3 * 64;
        this.field805 = this.field840[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("g.r(IIBI)V")
    public final void method14(int arg0, int arg1, byte arg2) {
        if (this.field857 < 9) {
            this.field857++;
        }
        for (int var4 = this.field857; var4 > 0; var4--) {
            this.field848[var4] = this.field848[var4 - 1];
            this.field840[var4] = this.field840[var4 - 1];
            this.field860[var4] = this.field860[var4 - 1];
        }
        this.field848[0] = arg0;
        this.field840[0] = arg1;
        this.field860[0] = arg2;
    }

    @ObfuscatedName("g.f(I)Z")
    public final boolean method25() {
        return this.field60 != null;
    }
}
