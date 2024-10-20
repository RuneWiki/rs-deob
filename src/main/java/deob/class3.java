package deob;

@ObfuscatedName("d")
public final class class3 extends class27 {

    @ObfuscatedName("d.p")
    public String field37;

    @ObfuscatedName("d.l")
    public class164 field50;

    @ObfuscatedName("d.d")
    public int field51 = -1;

    @ObfuscatedName("d.x")
    public int field35 = -1;

    @ObfuscatedName("d.o")
    public int field36 = 0;

    @ObfuscatedName("d.a")
    public int field38 = 0;

    @ObfuscatedName("d.w")
    public int field39;

    @ObfuscatedName("d.i")
    public int field32 = 0;

    @ObfuscatedName("d.y")
    public int field40 = 0;

    @ObfuscatedName("d.m")
    public int field41;

    @ObfuscatedName("d.u")
    public int field42;

    @ObfuscatedName("d.s")
    public int field34;

    @ObfuscatedName("d.e")
    public class112 field44;

    @ObfuscatedName("d.r")
    public int field33;

    @ObfuscatedName("d.n")
    public int field46;

    @ObfuscatedName("d.g")
    public int field47;

    @ObfuscatedName("d.c")
    public int field48;

    @ObfuscatedName("d.v")
    public boolean field45 = false;

    @ObfuscatedName("d.b")
    public int field43 = 0;

    @ObfuscatedName("d.p(Lds;I)V")
    public final void method19(class127 arg0) {
        arg0.field2030 = 0;
        int var2 = arg0.method2498();
        this.field51 = arg0.method2499();
        this.field35 = arg0.method2499();
        int var3 = -1;
        this.field43 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2498();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2498();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2581();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method31(var4[var5] - 512).field1013;
                    if (var8 != 0) {
                        this.field43 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2498();
            if (var11 < 0 || var11 >= Statics.field2747[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field398 = arg0.method2581();
        if (this.field398 == 65535) {
            this.field398 = -1;
        }
        this.field399 = arg0.method2581();
        if (this.field399 == 65535) {
            this.field399 = -1;
        }
        this.field400 = this.field399;
        this.field401 = arg0.method2581();
        if (this.field401 == 65535) {
            this.field401 = -1;
        }
        this.field402 = arg0.method2581();
        if (this.field402 == 65535) {
            this.field402 = -1;
        }
        this.field445 = arg0.method2581();
        if (this.field445 == 65535) {
            this.field445 = -1;
        }
        this.field419 = arg0.method2581();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field405 = arg0.method2581();
        if (this.field405 == 65535) {
            this.field405 = -1;
        }
        this.field37 = arg0.method2506();
        if (Statics.field905 == this) {
            Statics.field2739 = this.field37;
        }
        this.field36 = arg0.method2498();
        this.field38 = arg0.method2581();
        if (this.field50 == null) {
            this.field50 = new class164();
        }
        this.field50.method3348(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("d.l(I)Ldl;")
    public final class112 method9() {
        if (this.field50 == null) {
            return null;
        }
        class34 var1 = this.field403 != -1 && this.field410 == 0 ? class34.method93(this.field403) : null;
        class34 var2 = this.field424 == -1 || this.field45 || this.field424 == this.field398 && var1 != null ? null : class34.method93(this.field424);
        class112 var3 = this.field50.method3338(var1, this.field423, var2, this.field420);
        if (var3 == null) {
            return null;
        }
        var3.method2274();
        this.field440 = var3.field1546;
        if (!this.field45 && this.field427 != -1 && this.field422 != -1) {
            class112 var4 = class35.method144(this.field427).method747(this.field422);
            if (var4 != null) {
                var4.method2283(0, -this.field431, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field45 && this.field44 != null) {
            if (client.field465 >= this.field40) {
                this.field44 = null;
            }
            if (client.field465 >= this.field32 && client.field465 < this.field40) {
                class112 var6 = this.field44;
                var6.method2283(this.field41 - this.field404, this.field42 - this.field39, this.field34 - this.field394);
                if (this.field441 == 512) {
                    var6.method2279();
                    var6.method2279();
                    var6.method2279();
                } else if (this.field441 == 1024) {
                    var6.method2279();
                    var6.method2279();
                } else if (this.field441 == 1536) {
                    var6.method2279();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field441 == 512) {
                    var6.method2279();
                } else if (this.field441 == 1024) {
                    var6.method2279();
                    var6.method2279();
                } else if (this.field441 == 1536) {
                    var6.method2279();
                    var6.method2279();
                    var6.method2279();
                }
                var6.method2283(this.field404 - this.field41, this.field39 - this.field42, this.field394 - this.field34);
            }
        }
        var3.field1877 = true;
        return var3;
    }

    @ObfuscatedName("d.d(B)Z")
    public final boolean method14() {
        return this.field50 != null;
    }
}
