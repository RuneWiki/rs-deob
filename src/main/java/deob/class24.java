package deob;

@ObfuscatedName("x")
public final class class24 extends class28 {

    @ObfuscatedName("x.q")
    public String field263;

    @ObfuscatedName("x.d")
    public class167 field284;

    @ObfuscatedName("x.h")
    public int field258 = -1;

    @ObfuscatedName("x.p")
    public int field259 = -1;

    @ObfuscatedName("x.n")
    public String[] field261 = new String[3];

    @ObfuscatedName("x.r")
    public int field282;

    @ObfuscatedName("x.c")
    public int field257;

    @ObfuscatedName("x.i")
    public int field264;

    @ObfuscatedName("x.o")
    public int field265;

    @ObfuscatedName("x.m")
    public int field266;

    @ObfuscatedName("x.s")
    public int field267;

    @ObfuscatedName("x.u")
    public int field268;

    @ObfuscatedName("x.b")
    public int field269;

    @ObfuscatedName("x.v")
    public class83 field270;

    @ObfuscatedName("x.f")
    public int field271;

    @ObfuscatedName("x.z")
    public int field283;

    @ObfuscatedName("x.t")
    public int field272;

    @ObfuscatedName("x.y")
    public int field274;

    @ObfuscatedName("x.w")
    public boolean field275;

    @ObfuscatedName("x.a")
    public int field276;

    @ObfuscatedName("x.k")
    public boolean field277;

    @ObfuscatedName("x.l")
    public int field278;

    @ObfuscatedName("x.x")
    public int field256;

    @ObfuscatedName("x.g")
    public boolean field262;

    @ObfuscatedName("x.e")
    public int field281;

    @ObfuscatedName("x.ae")
    public int field279;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field261[var1] = "";
        }
        this.field282 = 0;
        this.field257 = 0;
        this.field265 = 0;
        this.field266 = 0;
        this.field275 = false;
        this.field276 = 0;
        this.field277 = false;
        this.field262 = false;
    }

    @ObfuscatedName("x.q(Lel;I)V")
    public final void method227(class154 arg0) {
        arg0.field2091 = 0;
        int var2 = arg0.method2666();
        this.field258 = arg0.method2835();
        this.field259 = arg0.method2835();
        int var3 = -1;
        this.field276 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2666();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2666();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2668();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method1947(var4[var5] - 512).field2949;
                    if (var8 != 0) {
                        this.field276 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2666();
            if (var11 < 0 || var11 >= Statics.field1789[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field660 = arg0.method2668();
        if (this.field660 == 65535) {
            this.field660 = -1;
        }
        this.field677 = arg0.method2668();
        if (this.field677 == 65535) {
            this.field677 = -1;
        }
        this.field631 = this.field677;
        this.field632 = arg0.method2668();
        if (this.field632 == 65535) {
            this.field632 = -1;
        }
        this.field653 = arg0.method2668();
        if (this.field653 == 65535) {
            this.field653 = -1;
        }
        this.field634 = arg0.method2668();
        if (this.field634 == 65535) {
            this.field634 = -1;
        }
        this.field635 = arg0.method2668();
        if (this.field635 == 65535) {
            this.field635 = -1;
        }
        this.field680 = arg0.method2668();
        if (this.field680 == 65535) {
            this.field680 = -1;
        }
        this.field263 = arg0.method2701();
        if (Statics.field792 == this) {
            Statics.field1661 = this.field263;
        }
        this.field282 = arg0.method2666();
        this.field257 = arg0.method2668();
        this.field277 = arg0.method2666() == 1;
        if (client.field306 == 0 && client.field473 >= 2) {
            this.field277 = false;
        }
        if (this.field284 == null) {
            this.field284 = new class167();
        }
        this.field284.method2993(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("x.d(B)I")
    public int method228() {
        return this.field284 == null || this.field284.field2178 == -1 ? 1 : class200.method175(this.field284.field2178).field3011;
    }

    @ObfuscatedName("x.h(I)Lcf;")
    public final class83 method229() {
        if (this.field284 == null) {
            return null;
        }
        class202 var1 = this.field656 != -1 && this.field637 == 0 ? class202.method3379(this.field656) : null;
        class202 var2 = this.field633 == -1 || this.field275 || this.field660 == this.field633 && var1 != null ? null : class202.method3379(this.field633);
        class83 var3 = this.field284.method3012(var1, this.field657, var2, this.field654);
        if (var3 == null) {
            return null;
        }
        var3.method1582();
        this.field630 = var3.field1558;
        if (!this.field275 && this.field659 != -1 && this.field662 != -1) {
            class83 var4 = class191.method1883(this.field659).method3279(this.field662);
            if (var4 != null) {
                var4.method1562(0, -this.field665, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field275 && this.field270 != null) {
            if (client.field450 >= this.field266) {
                this.field270 = null;
            }
            if (client.field450 >= this.field265 && client.field450 < this.field266) {
                class83 var6 = this.field270;
                var6.method1562(this.field267 - this.field638, this.field268 - this.field264, this.field269 - this.field625);
                if (this.field675 == 512) {
                    var6.method1558();
                    var6.method1558();
                    var6.method1558();
                } else if (this.field675 == 1024) {
                    var6.method1558();
                    var6.method1558();
                } else if (this.field675 == 1536) {
                    var6.method1558();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field675 == 512) {
                    var6.method1558();
                } else if (this.field675 == 1024) {
                    var6.method1558();
                    var6.method1558();
                } else if (this.field675 == 1536) {
                    var6.method1558();
                    var6.method1558();
                    var6.method1558();
                }
                var6.method1562(this.field638 - this.field267, this.field264 - this.field268, this.field625 - this.field269);
            }
        }
        var3.field1403 = true;
        return var3;
    }

    @ObfuscatedName("x.p(IIBI)V")
    public final void method249(int arg0, int arg1, byte arg2) {
        if (this.field656 != -1 && class202.method3379(this.field656).field3069 == 1) {
            this.field656 = -1;
        }
        this.field652 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method231(arg0, arg1);
        } else if (this.field679[0] >= 0 && this.field679[0] < 104 && this.field629[0] >= 0 && this.field629[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field679[0];
                int var6 = this.field629[0];
                int var7 = this.method228();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class119.method2917(var5, var6, this.method228(), client.method2508(arg0, arg1), client.field366[this.field278], true, client.field587, client.field588);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method230(client.field587[var9], client.field588[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method230(arg0, arg1, arg2);
        } else {
            this.method231(arg0, arg1);
        }
    }

    @ObfuscatedName("x.j(III)V")
    public void method231(int arg0, int arg1) {
        this.field674 = 0;
        this.field683 = 0;
        this.field682 = 0;
        this.field679[0] = arg0;
        this.field629[0] = arg1;
        int var3 = this.method228();
        this.field638 = this.field679[0] * 128 + var3 * 64;
        this.field625 = this.field629[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("x.n(IIBI)V")
    public final void method230(int arg0, int arg1, byte arg2) {
        if (this.field674 < 9) {
            this.field674++;
        }
        for (int var4 = this.field674; var4 > 0; var4--) {
            this.field679[var4] = this.field679[var4 - 1];
            this.field629[var4] = this.field629[var4 - 1];
            this.field681[var4] = this.field681[var4 - 1];
        }
        this.field679[0] = arg0;
        this.field629[0] = arg1;
        this.field681[0] = arg2;
    }

    @ObfuscatedName("x.c(I)Z")
    public final boolean method233() {
        return this.field284 != null;
    }
}
