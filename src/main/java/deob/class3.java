package deob;

@ObfuscatedName("s")
public final class class3 extends class27 {

    @ObfuscatedName("s.g")
    public String field45;

    @ObfuscatedName("s.h")
    public class164 field51;

    @ObfuscatedName("s.s")
    public int field43 = -1;

    @ObfuscatedName("s.o")
    public int field48 = -1;

    @ObfuscatedName("s.p")
    public int field38 = 0;

    @ObfuscatedName("s.x")
    public int field39 = 0;

    @ObfuscatedName("s.k")
    public int field40;

    @ObfuscatedName("s.r")
    public int field41 = 0;

    @ObfuscatedName("s.z")
    public int field42 = 0;

    @ObfuscatedName("s.n")
    public int field47;

    @ObfuscatedName("s.j")
    public int field44;

    @ObfuscatedName("s.b")
    public int field53;

    @ObfuscatedName("s.t")
    public class112 field46;

    @ObfuscatedName("s.q")
    public int field35;

    @ObfuscatedName("s.e")
    public int field36;

    @ObfuscatedName("s.l")
    public int field49;

    @ObfuscatedName("s.u")
    public int field50;

    @ObfuscatedName("s.m")
    public boolean field34 = false;

    @ObfuscatedName("s.a")
    public int field52 = 0;

    @ObfuscatedName("s.g(Ldw;I)V")
    public final void method17(class127 arg0) {
        arg0.field2027 = 0;
        int var2 = arg0.method2499();
        this.field43 = arg0.method2500();
        this.field48 = arg0.method2500();
        int var3 = -1;
        this.field52 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2499();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2499();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2501();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method1333(var4[var5] - 512).field1009;
                    if (var8 != 0) {
                        this.field52 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2499();
            if (var11 < 0 || var11 >= Statics.field2753[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field426 = arg0.method2501();
        if (this.field426 == 65535) {
            this.field426 = -1;
        }
        this.field427 = arg0.method2501();
        if (this.field427 == 65535) {
            this.field427 = -1;
        }
        this.field428 = this.field427;
        this.field429 = arg0.method2501();
        if (this.field429 == 65535) {
            this.field429 = -1;
        }
        this.field434 = arg0.method2501();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field431 = arg0.method2501();
        if (this.field431 == 65535) {
            this.field431 = -1;
        }
        this.field444 = arg0.method2501();
        if (this.field444 == 65535) {
            this.field444 = -1;
        }
        this.field433 = arg0.method2501();
        if (this.field433 == 65535) {
            this.field433 = -1;
        }
        this.field45 = arg0.method2507();
        if (Statics.field461 == this) {
            Statics.field1404 = this.field45;
        }
        this.field38 = arg0.method2499();
        this.field39 = arg0.method2501();
        if (this.field51 == null) {
            this.field51 = new class164();
        }
        this.field51.method3266(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("s.h(I)Ldn;")
    public final class112 method18() {
        if (this.field51 == null) {
            return null;
        }
        class34 var1 = this.field450 != -1 && this.field453 == 0 ? class34.method152(this.field450) : null;
        class34 var2 = this.field447 == -1 || this.field34 || this.field447 == this.field426 && var1 != null ? null : class34.method152(this.field447);
        class112 var3 = this.field51.method3272(var1, this.field430, var2, this.field448);
        if (var3 == null) {
            return null;
        }
        var3.method2276();
        this.field468 = var3.field1535;
        if (!this.field34 && this.field455 != -1 && this.field456 != -1) {
            class112 var4 = class35.method3034(this.field455).method750(this.field456);
            if (var4 != null) {
                var4.method2286(0, -this.field441, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field34 && this.field46 != null) {
            if (client.field496 >= this.field42) {
                this.field46 = null;
            }
            if (client.field496 >= this.field41 && client.field496 < this.field42) {
                class112 var6 = this.field46;
                var6.method2286(this.field47 - this.field421, this.field44 - this.field40, this.field53 - this.field422);
                if (this.field469 == 512) {
                    var6.method2291();
                    var6.method2291();
                    var6.method2291();
                } else if (this.field469 == 1024) {
                    var6.method2291();
                    var6.method2291();
                } else if (this.field469 == 1536) {
                    var6.method2291();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field469 == 512) {
                    var6.method2291();
                } else if (this.field469 == 1024) {
                    var6.method2291();
                    var6.method2291();
                } else if (this.field469 == 1536) {
                    var6.method2291();
                    var6.method2291();
                    var6.method2291();
                }
                var6.method2286(this.field421 - this.field47, this.field40 - this.field44, this.field422 - this.field53);
            }
        }
        var3.field1868 = true;
        return var3;
    }

    @ObfuscatedName("s.s(B)Z")
    public final boolean method21() {
        return this.field51 != null;
    }
}
