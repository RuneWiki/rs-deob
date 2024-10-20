package deob;

@ObfuscatedName("x")
public final class class3 extends class26 {

    @ObfuscatedName("x.j")
    public String field37;

    @ObfuscatedName("x.y")
    public class161 field55;

    @ObfuscatedName("x.x")
    public int field36 = -1;

    @ObfuscatedName("x.z")
    public int field39 = -1;

    @ObfuscatedName("x.c")
    public int field40 = 0;

    @ObfuscatedName("x.e")
    public int field43 = 0;

    @ObfuscatedName("x.s")
    public int field59;

    @ObfuscatedName("x.i")
    public int field47 = 0;

    @ObfuscatedName("x.g")
    public int field44 = 0;

    @ObfuscatedName("x.q")
    public int field45;

    @ObfuscatedName("x.w")
    public int field46;

    @ObfuscatedName("x.k")
    public int field38;

    @ObfuscatedName("x.v")
    public class111 field48;

    @ObfuscatedName("x.o")
    public int field49;

    @ObfuscatedName("x.m")
    public int field50;

    @ObfuscatedName("x.u")
    public int field53;

    @ObfuscatedName("x.r")
    public int field52;

    @ObfuscatedName("x.d")
    public boolean field42 = false;

    @ObfuscatedName("x.n")
    public int field54 = 0;

    @ObfuscatedName("x.j(Ldr;I)V")
    public final void method15(class126 arg0) {
        arg0.field2020 = 0;
        int var2 = arg0.method2399();
        this.field36 = arg0.method2383();
        this.field39 = arg0.method2383();
        int var3 = -1;
        this.field54 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2399();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2399();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2405();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method1818(var4[var5] - 512).field999;
                    if (var8 != 0) {
                        this.field54 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2399();
            if (var11 < 0 || var11 >= Statics.field2665[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field398 = arg0.method2405();
        if (this.field398 == 65535) {
            this.field398 = -1;
        }
        this.field399 = arg0.method2405();
        if (this.field399 == 65535) {
            this.field399 = -1;
        }
        this.field442 = this.field399;
        this.field401 = arg0.method2405();
        if (this.field401 == 65535) {
            this.field401 = -1;
        }
        this.field402 = arg0.method2405();
        if (this.field402 == 65535) {
            this.field402 = -1;
        }
        this.field403 = arg0.method2405();
        if (this.field403 == 65535) {
            this.field403 = -1;
        }
        this.field404 = arg0.method2405();
        if (this.field404 == 65535) {
            this.field404 = -1;
        }
        this.field405 = arg0.method2405();
        if (this.field405 == 65535) {
            this.field405 = -1;
        }
        this.field37 = arg0.method2390();
        if (Statics.field244 == this) {
            Statics.field1254 = this.field37;
        }
        this.field40 = arg0.method2399();
        this.field43 = arg0.method2405();
        if (this.field55 == null) {
            this.field55 = new class161();
        }
        this.field55.method3126(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("x.y(B)Ldh;")
    public final class111 method13() {
        if (this.field55 == null) {
            return null;
        }
        class33 var1 = this.field422 != -1 && this.field437 == 0 ? class33.method2614(this.field422) : null;
        class33 var2 = this.field443 == -1 || this.field42 || this.field443 == this.field398 && var1 != null ? null : class33.method2614(this.field443);
        class111 var3 = this.field55.method3114(var1, this.field423, var2, this.field420);
        if (var3 == null) {
            return null;
        }
        var3.method2170();
        this.field440 = var3.field1534;
        if (!this.field42 && this.field425 != -1 && this.field428 != -1) {
            class111 var4 = class34.method564(this.field425).method719(this.field428);
            if (var4 != null) {
                var4.method2174(0, -this.field431, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field42 && this.field48 != null) {
            if (client.field636 >= this.field44) {
                this.field48 = null;
            }
            if (client.field636 >= this.field47 && client.field636 < this.field44) {
                class111 var6 = this.field48;
                var6.method2174(this.field45 - this.field396, this.field46 - this.field59, this.field38 - this.field394);
                if (this.field441 == 512) {
                    var6.method2233();
                    var6.method2233();
                    var6.method2233();
                } else if (this.field441 == 1024) {
                    var6.method2233();
                    var6.method2233();
                } else if (this.field441 == 1536) {
                    var6.method2233();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field441 == 512) {
                    var6.method2233();
                } else if (this.field441 == 1024) {
                    var6.method2233();
                    var6.method2233();
                } else if (this.field441 == 1536) {
                    var6.method2233();
                    var6.method2233();
                    var6.method2233();
                }
                var6.method2174(this.field396 - this.field45, this.field59 - this.field46, this.field394 - this.field38);
            }
        }
        var3.field1866 = true;
        return var3;
    }

    @ObfuscatedName("x.x(B)Z")
    public final boolean method11() {
        return this.field55 != null;
    }
}
