package deob;

@ObfuscatedName("w")
public final class class3 extends class26 {

    @ObfuscatedName("w.p")
    public String field57;

    @ObfuscatedName("w.j")
    public class162 field52;

    @ObfuscatedName("w.w")
    public int field44 = -1;

    @ObfuscatedName("w.h")
    public int field65 = -1;

    @ObfuscatedName("w.v")
    public int field46 = 0;

    @ObfuscatedName("w.k")
    public int field47 = 0;

    @ObfuscatedName("w.g")
    public int field48;

    @ObfuscatedName("w.n")
    public int field49 = 0;

    @ObfuscatedName("w.c")
    public int field64 = 0;

    @ObfuscatedName("w.o")
    public int field51;

    @ObfuscatedName("w.u")
    public int field56;

    @ObfuscatedName("w.z")
    public int field53;

    @ObfuscatedName("w.e")
    public class111 field54;

    @ObfuscatedName("w.l")
    public int field55;

    @ObfuscatedName("w.m")
    public int field61;

    @ObfuscatedName("w.s")
    public int field63;

    @ObfuscatedName("w.i")
    public int field58;

    @ObfuscatedName("w.y")
    public boolean field59 = false;

    @ObfuscatedName("w.d")
    public int field60 = 0;

    @ObfuscatedName("w.p(Ldv;B)V")
    public final void method20(class126 arg0) {
        arg0.field2043 = 0;
        int var2 = arg0.method2544();
        this.field44 = arg0.method2376();
        this.field65 = arg0.method2376();
        int var3 = -1;
        this.field60 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2544();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2544();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2489();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method1244(var4[var5] - 512).field1021;
                    if (var8 != 0) {
                        this.field60 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2544();
            if (var11 < 0 || var11 >= Statics.field2720[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field410 = arg0.method2489();
        if (this.field410 == 65535) {
            this.field410 = -1;
        }
        this.field442 = arg0.method2489();
        if (this.field442 == 65535) {
            this.field442 = -1;
        }
        this.field417 = this.field442;
        this.field467 = arg0.method2489();
        if (this.field467 == 65535) {
            this.field467 = -1;
        }
        this.field419 = arg0.method2489();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field420 = arg0.method2489();
        if (this.field420 == 65535) {
            this.field420 = -1;
        }
        this.field446 = arg0.method2489();
        if (this.field446 == 65535) {
            this.field446 = -1;
        }
        this.field422 = arg0.method2489();
        if (this.field422 == 65535) {
            this.field422 = -1;
        }
        this.field57 = arg0.method2383();
        if (Statics.field2035 == this) {
            Statics.field1416 = this.field57;
        }
        this.field46 = arg0.method2544();
        this.field47 = arg0.method2489();
        if (this.field52 == null) {
            this.field52 = new class162();
        }
        this.field52.method3125(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("w.j(I)Ldm;")
    public final class111 method19() {
        if (this.field52 == null) {
            return null;
        }
        class33 var1 = this.field439 != -1 && this.field418 == 0 ? class33.method751(this.field439) : null;
        class33 var2 = this.field436 == -1 || this.field59 || this.field436 == this.field410 && var1 != null ? null : class33.method751(this.field436);
        class111 var3 = this.field52.method3132(var1, this.field440, var2, this.field437);
        if (var3 == null) {
            return null;
        }
        var3.method2184();
        this.field430 = var3.field1558;
        if (!this.field59 && this.field444 != -1 && this.field445 != -1) {
            class111 var4 = class34.method7(this.field444).method713(this.field445);
            if (var4 != null) {
                var4.method2183(0, -this.field455, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field59 && this.field54 != null) {
            if (client.field568 >= this.field64) {
                this.field54 = null;
            }
            if (client.field568 >= this.field49 && client.field568 < this.field64) {
                class111 var6 = this.field54;
                var6.method2183(this.field51 - this.field427, this.field56 - this.field48, this.field53 - this.field411);
                if (this.field458 == 512) {
                    var6.method2189();
                    var6.method2189();
                    var6.method2189();
                } else if (this.field458 == 1024) {
                    var6.method2189();
                    var6.method2189();
                } else if (this.field458 == 1536) {
                    var6.method2189();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field458 == 512) {
                    var6.method2189();
                } else if (this.field458 == 1024) {
                    var6.method2189();
                    var6.method2189();
                } else if (this.field458 == 1536) {
                    var6.method2189();
                    var6.method2189();
                    var6.method2189();
                }
                var6.method2183(this.field427 - this.field51, this.field48 - this.field56, this.field411 - this.field53);
            }
        }
        var3.field1891 = true;
        return var3;
    }

    @ObfuscatedName("w.w(B)Z")
    public final boolean method18() {
        return this.field52 != null;
    }
}
