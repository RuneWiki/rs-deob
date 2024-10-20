package deob;

@ObfuscatedName("y")
public final class class24 extends class28 {

    @ObfuscatedName("y.s")
    public String field259;

    @ObfuscatedName("y.c")
    public class167 field272;

    @ObfuscatedName("y.f")
    public int field283 = -1;

    @ObfuscatedName("y.h")
    public int field260 = -1;

    @ObfuscatedName("y.g")
    public String[] field261 = new String[3];

    @ObfuscatedName("y.k")
    public int field262;

    @ObfuscatedName("y.u")
    public int field263;

    @ObfuscatedName("y.b")
    public int field271;

    @ObfuscatedName("y.x")
    public int field265;

    @ObfuscatedName("y.r")
    public int field266;

    @ObfuscatedName("y.n")
    public int field257;

    @ObfuscatedName("y.m")
    public int field277;

    @ObfuscatedName("y.j")
    public int field269;

    @ObfuscatedName("y.w")
    public class83 field273;

    @ObfuscatedName("y.p")
    public int field276;

    @ObfuscatedName("y.o")
    public int field264;

    @ObfuscatedName("y.i")
    public int field270;

    @ObfuscatedName("y.z")
    public int field274;

    @ObfuscatedName("y.e")
    public boolean field275;

    @ObfuscatedName("y.d")
    public int field267;

    @ObfuscatedName("y.t")
    public boolean field258;

    @ObfuscatedName("y.q")
    public int field278;

    @ObfuscatedName("y.y")
    public int field279;

    @ObfuscatedName("y.l")
    public boolean field280;

    @ObfuscatedName("y.v")
    public int field281;

    @ObfuscatedName("y.az")
    public int field282;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field261[var1] = "";
        }
        this.field262 = 0;
        this.field263 = 0;
        this.field265 = 0;
        this.field266 = 0;
        this.field275 = false;
        this.field267 = 0;
        this.field258 = false;
        this.field280 = false;
    }

    @ObfuscatedName("y.s(Lea;B)V")
    public final void method213(class154 arg0) {
        arg0.field2098 = 0;
        int var2 = arg0.method2545();
        this.field283 = arg0.method2657();
        this.field260 = arg0.method2657();
        int var3 = -1;
        this.field267 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2545();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2545();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2541();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method699(var4[var5] - 512).field2998;
                    if (var8 != 0) {
                        this.field267 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2545();
            if (var11 < 0 || var11 >= Statics.field1817[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field610 = arg0.method2541();
        if (this.field610 == 65535) {
            this.field610 = -1;
        }
        this.field611 = arg0.method2541();
        if (this.field611 == 65535) {
            this.field611 = -1;
        }
        this.field612 = this.field611;
        this.field637 = arg0.method2541();
        if (this.field637 == 65535) {
            this.field637 = -1;
        }
        this.field614 = arg0.method2541();
        if (this.field614 == 65535) {
            this.field614 = -1;
        }
        this.field615 = arg0.method2541();
        if (this.field615 == 65535) {
            this.field615 = -1;
        }
        this.field616 = arg0.method2541();
        if (this.field616 == 65535) {
            this.field616 = -1;
        }
        this.field640 = arg0.method2541();
        if (this.field640 == 65535) {
            this.field640 = -1;
        }
        this.field259 = arg0.method2734();
        if (Statics.field129 == this) {
            Statics.field1658 = this.field259;
        }
        this.field262 = arg0.method2545();
        this.field263 = arg0.method2541();
        this.field258 = arg0.method2545() == 1;
        if (client.field298 == 0 && client.field459 >= 2) {
            this.field258 = false;
        }
        if (this.field272 == null) {
            this.field272 = new class167();
        }
        this.field272.method2852(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.c(B)I")
    public int method196() {
        return this.field272 == null || this.field272.field2181 == -1 ? 1 : Statics.method2743(this.field272.field2181).field3011;
    }

    @ObfuscatedName("y.f(I)Lcz;")
    public final class83 method195() {
        if (this.field272 == null) {
            return null;
        }
        class202 var1 = this.field631 != -1 && this.field617 == 0 ? class202.method1914(this.field631) : null;
        class202 var2 = this.field634 == -1 || this.field275 || this.field634 == this.field610 && var1 != null ? null : class202.method1914(this.field634);
        class83 var3 = this.field272.method2858(var1, this.field638, var2, this.field635);
        if (var3 == null) {
            return null;
        }
        var3.method1443();
        this.field655 = var3.field1546;
        if (!this.field275 && this.field613 != -1 && this.field643 != -1) {
            class83 var4 = class191.method827(this.field613).method3150(this.field643);
            if (var4 != null) {
                var4.method1442(0, -this.field632, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field275 && this.field273 != null) {
            if (client.field304 >= this.field266) {
                this.field273 = null;
            }
            if (client.field304 >= this.field265 && client.field304 < this.field266) {
                class83 var6 = this.field273;
                var6.method1442(this.field257 - this.field609, this.field277 - this.field271, this.field269 - this.field606);
                if (this.field656 == 512) {
                    var6.method1514();
                    var6.method1514();
                    var6.method1514();
                } else if (this.field656 == 1024) {
                    var6.method1514();
                    var6.method1514();
                } else if (this.field656 == 1536) {
                    var6.method1514();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field656 == 512) {
                    var6.method1514();
                } else if (this.field656 == 1024) {
                    var6.method1514();
                    var6.method1514();
                } else if (this.field656 == 1536) {
                    var6.method1514();
                    var6.method1514();
                    var6.method1514();
                }
                var6.method1442(this.field609 - this.field257, this.field271 - this.field277, this.field606 - this.field269);
            }
        }
        var3.field1383 = true;
        return var3;
    }

    @ObfuscatedName("y.g(IIBI)V")
    public final void method198(int arg0, int arg1, byte arg2) {
        if (this.field631 != -1 && class202.method1914(this.field631).field3069 == 1) {
            this.field631 = -1;
        }
        this.field633 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method199(arg0, arg1);
        } else if (this.field663[0] >= 0 && this.field663[0] < 104 && this.field661[0] >= 0 && this.field661[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field663[0];
                int var6 = this.field661[0];
                int var7 = this.method196();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method196();
                    client.field499.field1863 = arg0;
                    client.field499.field1865 = arg1;
                    client.field499.field1858 = 1;
                    client.field499.field1861 = 1;
                    class23 var11 = client.field499;
                    int var12 = class119.method1875(var5, var6, var10, var11, client.field354[this.field278], true, client.field573, client.field574);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method194(client.field573[var13], client.field574[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method194(arg0, arg1, arg2);
        } else {
            this.method199(arg0, arg1);
        }
    }

    @ObfuscatedName("y.k(IIB)V")
    public void method199(int arg0, int arg1) {
        this.field659 = 0;
        this.field664 = 0;
        this.field648 = 0;
        this.field663[0] = arg0;
        this.field661[0] = arg1;
        int var3 = this.method196();
        this.field609 = this.field663[0] * 128 + var3 * 64;
        this.field606 = this.field661[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("y.u(IIBB)V")
    public final void method194(int arg0, int arg1, byte arg2) {
        if (this.field659 < 9) {
            this.field659++;
        }
        for (int var4 = this.field659; var4 > 0; var4--) {
            this.field663[var4] = this.field663[var4 - 1];
            this.field661[var4] = this.field661[var4 - 1];
            this.field625[var4] = this.field625[var4 - 1];
        }
        this.field663[0] = arg0;
        this.field661[0] = arg1;
        this.field625[0] = arg2;
    }

    @ObfuscatedName("y.b(I)Z")
    public final boolean method201() {
        return this.field272 != null;
    }
}
