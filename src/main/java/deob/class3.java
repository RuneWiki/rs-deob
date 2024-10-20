package deob;

@ObfuscatedName("j")
public final class class3 extends class27 {

    @ObfuscatedName("j.b")
    public String field52;

    @ObfuscatedName("j.c")
    public class164 field36;

    @ObfuscatedName("j.j")
    public int field37 = -1;

    @ObfuscatedName("j.i")
    public int field38 = -1;

    @ObfuscatedName("j.k")
    public int field54 = 0;

    @ObfuscatedName("j.q")
    public int field40 = 0;

    @ObfuscatedName("j.t")
    public int field41;

    @ObfuscatedName("j.v")
    public int field42 = 0;

    @ObfuscatedName("j.y")
    public int field43 = 0;

    @ObfuscatedName("j.w")
    public int field45;

    @ObfuscatedName("j.g")
    public int field49;

    @ObfuscatedName("j.s")
    public int field46;

    @ObfuscatedName("j.n")
    public class112 field35;

    @ObfuscatedName("j.x")
    public int field48;

    @ObfuscatedName("j.o")
    public int field50;

    @ObfuscatedName("j.l")
    public int field47;

    @ObfuscatedName("j.u")
    public int field51;

    @ObfuscatedName("j.z")
    public boolean field44 = false;

    @ObfuscatedName("j.d")
    public int field53 = 0;

    @ObfuscatedName("j.b(Ldv;B)V")
    public final void method23(class127 arg0) {
        arg0.field2051 = 0;
        int var2 = arg0.method2416();
        this.field37 = arg0.method2397();
        this.field38 = arg0.method2397();
        int var3 = -1;
        this.field53 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2416();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2416();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2394();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method1565(var4[var5] - 512).field1005;
                    if (var8 != 0) {
                        this.field53 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2416();
            if (var11 < 0 || var11 >= Statics.field2757[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field424 = arg0.method2394();
        if (this.field424 == 65535) {
            this.field424 = -1;
        }
        this.field464 = arg0.method2394();
        if (this.field464 == 65535) {
            this.field464 = -1;
        }
        this.field426 = this.field464;
        this.field427 = arg0.method2394();
        if (this.field427 == 65535) {
            this.field427 = -1;
        }
        this.field428 = arg0.method2394();
        if (this.field428 == 65535) {
            this.field428 = -1;
        }
        this.field449 = arg0.method2394();
        if (this.field449 == 65535) {
            this.field449 = -1;
        }
        this.field442 = arg0.method2394();
        if (this.field442 == 65535) {
            this.field442 = -1;
        }
        this.field434 = arg0.method2394();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field52 = arg0.method2473();
        if (Statics.field368 == this) {
            Statics.field1776 = this.field52;
        }
        this.field54 = arg0.method2416();
        this.field40 = arg0.method2394();
        if (this.field36 == null) {
            this.field36 = new class164();
        }
        this.field36.method3167(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("j.c(I)Ldr;")
    public final class112 method13() {
        if (this.field36 == null) {
            return null;
        }
        class34 var1 = this.field448 != -1 && this.field451 == 0 ? Statics.method61(this.field448) : null;
        class34 var2 = this.field445 == -1 || this.field44 || this.field445 == this.field424 && var1 != null ? null : Statics.method61(this.field445);
        class112 var3 = this.field36.method3179(var1, this.field425, var2, this.field446);
        if (var3 == null) {
            return null;
        }
        var3.method2196();
        this.field466 = var3.field1572;
        if (!this.field44 && this.field453 != -1 && this.field454 != -1) {
            class112 var4 = class35.method216(this.field453).method731(this.field454);
            if (var4 != null) {
                var4.method2205(0, -this.field457, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field44 && this.field35 != null) {
            if (client.field489 >= this.field43) {
                this.field35 = null;
            }
            if (client.field489 >= this.field42 && client.field489 < this.field43) {
                class112 var6 = this.field35;
                var6.method2205(this.field45 - this.field444, this.field49 - this.field41, this.field46 - this.field420);
                if (this.field467 == 512) {
                    var6.method2202();
                    var6.method2202();
                    var6.method2202();
                } else if (this.field467 == 1024) {
                    var6.method2202();
                    var6.method2202();
                } else if (this.field467 == 1536) {
                    var6.method2202();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field467 == 512) {
                    var6.method2202();
                } else if (this.field467 == 1024) {
                    var6.method2202();
                    var6.method2202();
                } else if (this.field467 == 1536) {
                    var6.method2202();
                    var6.method2202();
                    var6.method2202();
                }
                var6.method2205(this.field444 - this.field45, this.field41 - this.field49, this.field420 - this.field46);
            }
        }
        var3.field1895 = true;
        return var3;
    }

    @ObfuscatedName("j.j(I)Z")
    public final boolean method14() {
        return this.field36 != null;
    }
}
