package deob;

@ObfuscatedName("e")
public final class class3 extends class27 {

    @ObfuscatedName("e.a")
    public String field51;

    @ObfuscatedName("e.x")
    public class163 field34;

    @ObfuscatedName("e.e")
    public int field35 = -1;

    @ObfuscatedName("e.r")
    public int field38 = -1;

    @ObfuscatedName("e.p")
    public int field37 = 0;

    @ObfuscatedName("e.n")
    public int field33 = 0;

    @ObfuscatedName("e.o")
    public int field39;

    @ObfuscatedName("e.l")
    public int field52 = 0;

    @ObfuscatedName("e.t")
    public int field42 = 0;

    @ObfuscatedName("e.q")
    public int field40;

    @ObfuscatedName("e.c")
    public int field43;

    @ObfuscatedName("e.z")
    public int field44;

    @ObfuscatedName("e.s")
    public class112 field45;

    @ObfuscatedName("e.h")
    public int field46;

    @ObfuscatedName("e.f")
    public int field47;

    @ObfuscatedName("e.w")
    public int field48;

    @ObfuscatedName("e.d")
    public int field49;

    @ObfuscatedName("e.y")
    public boolean field50 = false;

    @ObfuscatedName("e.g")
    public int field41 = 0;

    @ObfuscatedName("e.a(Ldy;I)V")
    public final void method14(class127 arg0) {
        arg0.field2035 = 0;
        int var2 = arg0.method2411();
        this.field35 = arg0.method2412();
        this.field38 = arg0.method2412();
        int var3 = -1;
        this.field41 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2411();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2411();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2413();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method248(var4[var5] - 512).field1044;
                    if (var8 != 0) {
                        this.field41 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2411();
            if (var11 < 0 || var11 >= Statics.field2730[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field422 = arg0.method2413();
        if (this.field422 == 65535) {
            this.field422 = -1;
        }
        this.field423 = arg0.method2413();
        if (this.field423 == 65535) {
            this.field423 = -1;
        }
        this.field424 = this.field423;
        this.field434 = arg0.method2413();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field426 = arg0.method2413();
        if (this.field426 == 65535) {
            this.field426 = -1;
        }
        this.field427 = arg0.method2413();
        if (this.field427 == 65535) {
            this.field427 = -1;
        }
        this.field428 = arg0.method2413();
        if (this.field428 == 65535) {
            this.field428 = -1;
        }
        this.field431 = arg0.method2413();
        if (this.field431 == 65535) {
            this.field431 = -1;
        }
        this.field51 = arg0.method2564();
        if (Statics.field2370 == this) {
            Statics.field1426 = this.field51;
        }
        this.field37 = arg0.method2411();
        this.field33 = arg0.method2413();
        if (this.field34 == null) {
            this.field34 = new class163();
        }
        this.field34.method3149(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("e.x(B)Ldd;")
    public final class112 method15() {
        if (this.field34 == null) {
            return null;
        }
        class34 var1 = this.field447 != -1 && this.field418 == 0 ? class34.method57(this.field447) : null;
        class34 var2 = this.field444 == -1 || this.field50 || this.field444 == this.field422 && var1 != null ? null : class34.method57(this.field444);
        class112 var3 = this.field34.method3130(var1, this.field448, var2, this.field425);
        if (var3 == null) {
            return null;
        }
        var3.method2184();
        this.field465 = var3.field1549;
        if (!this.field50 && this.field433 != -1 && this.field453 != -1) {
            class112 var4 = class35.method2175(this.field433).method751(this.field453);
            if (var4 != null) {
                var4.method2246(0, -this.field450, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field50 && this.field45 != null) {
            if (client.field658 >= this.field42) {
                this.field45 = null;
            }
            if (client.field658 >= this.field52 && client.field658 < this.field42) {
                class112 var6 = this.field45;
                var6.method2246(this.field40 - this.field473, this.field43 - this.field39, this.field44 - this.field442);
                if (this.field466 == 512) {
                    var6.method2189();
                    var6.method2189();
                    var6.method2189();
                } else if (this.field466 == 1024) {
                    var6.method2189();
                    var6.method2189();
                } else if (this.field466 == 1536) {
                    var6.method2189();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field466 == 512) {
                    var6.method2189();
                } else if (this.field466 == 1024) {
                    var6.method2189();
                    var6.method2189();
                } else if (this.field466 == 1536) {
                    var6.method2189();
                    var6.method2189();
                    var6.method2189();
                }
                var6.method2246(this.field473 - this.field40, this.field39 - this.field43, this.field442 - this.field44);
            }
        }
        var3.field1879 = true;
        return var3;
    }

    @ObfuscatedName("e.e(B)Z")
    public final boolean method24() {
        return this.field34 != null;
    }
}
