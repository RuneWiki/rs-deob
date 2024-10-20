package deob;

@ObfuscatedName("n")
public final class class3 extends class26 {

    @ObfuscatedName("n.v")
    public String field33;

    @ObfuscatedName("n.f")
    public class162 field30;

    @ObfuscatedName("n.n")
    public int field47 = -1;

    @ObfuscatedName("n.c")
    public int field32 = -1;

    @ObfuscatedName("n.r")
    public int field34 = 0;

    @ObfuscatedName("n.k")
    public int field45 = 0;

    @ObfuscatedName("n.e")
    public int field35;

    @ObfuscatedName("n.q")
    public int field36 = 0;

    @ObfuscatedName("n.u")
    public int field37 = 0;

    @ObfuscatedName("n.s")
    public int field38;

    @ObfuscatedName("n.l")
    public int field39;

    @ObfuscatedName("n.o")
    public int field29;

    @ObfuscatedName("n.h")
    public class111 field40;

    @ObfuscatedName("n.p")
    public int field42;

    @ObfuscatedName("n.d")
    public int field43;

    @ObfuscatedName("n.m")
    public int field44;

    @ObfuscatedName("n.z")
    public int field41;

    @ObfuscatedName("n.t")
    public boolean field46 = false;

    @ObfuscatedName("n.i")
    public int field31 = 0;

    @ObfuscatedName("n.v(Ldr;I)V")
    public final void method12(class126 arg0) {
        arg0.field2027 = 0;
        int var2 = arg0.method2466();
        this.field47 = arg0.method2499();
        this.field32 = arg0.method2499();
        int var3 = -1;
        this.field31 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2466();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2466();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2468();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method1211(var4[var5] - 512).field989;
                    if (var8 != 0) {
                        this.field31 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2466();
            if (var11 < 0 || var11 >= Statics.field2710[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field437 = arg0.method2468();
        if (this.field437 == 65535) {
            this.field437 = -1;
        }
        this.field396 = arg0.method2468();
        if (this.field396 == 65535) {
            this.field396 = -1;
        }
        this.field403 = this.field396;
        this.field404 = arg0.method2468();
        if (this.field404 == 65535) {
            this.field404 = -1;
        }
        this.field405 = arg0.method2468();
        if (this.field405 == 65535) {
            this.field405 = -1;
        }
        this.field406 = arg0.method2468();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field409 = arg0.method2468();
        if (this.field409 == 65535) {
            this.field409 = -1;
        }
        this.field427 = arg0.method2468();
        if (this.field427 == 65535) {
            this.field427 = -1;
        }
        this.field33 = arg0.method2462();
        if (Statics.field2540 == this) {
            Statics.field1395 = this.field33;
        }
        this.field34 = arg0.method2466();
        this.field45 = arg0.method2468();
        if (this.field30 == null) {
            this.field30 = new class162();
        }
        this.field30.method3152(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("n.f(I)Ldf;")
    public final class111 method13() {
        if (this.field30 == null) {
            return null;
        }
        class33 var1 = this.field425 != -1 && this.field451 == 0 ? class33.method1401(this.field425) : null;
        class33 var2 = this.field422 == -1 || this.field46 || this.field437 == this.field422 && var1 != null ? null : class33.method1401(this.field422);
        class111 var3 = this.field30.method3157(var1, this.field426, var2, this.field423);
        if (var3 == null) {
            return null;
        }
        var3.method2253();
        this.field443 = var3.field1531;
        if (!this.field46 && this.field401 != -1 && this.field431 != -1) {
            class111 var4 = class34.method239(this.field401).method743(this.field431);
            if (var4 != null) {
                var4.method2263(0, -this.field434, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field46 && this.field40 != null) {
            if (client.field510 >= this.field37) {
                this.field40 = null;
            }
            if (client.field510 >= this.field36 && client.field510 < this.field37) {
                class111 var6 = this.field40;
                var6.method2263(this.field38 - this.field410, this.field39 - this.field35, this.field29 - this.field397);
                if (this.field408 == 512) {
                    var6.method2259();
                    var6.method2259();
                    var6.method2259();
                } else if (this.field408 == 1024) {
                    var6.method2259();
                    var6.method2259();
                } else if (this.field408 == 1536) {
                    var6.method2259();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field408 == 512) {
                    var6.method2259();
                } else if (this.field408 == 1024) {
                    var6.method2259();
                    var6.method2259();
                } else if (this.field408 == 1536) {
                    var6.method2259();
                    var6.method2259();
                    var6.method2259();
                }
                var6.method2263(this.field410 - this.field38, this.field35 - this.field39, this.field397 - this.field29);
            }
        }
        var3.field1868 = true;
        return var3;
    }

    @ObfuscatedName("n.n(I)Z")
    public final boolean method24() {
        return this.field30 != null;
    }
}
