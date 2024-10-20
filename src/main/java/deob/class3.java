package deob;

@ObfuscatedName("o")
public final class class3 extends class27 {

    @ObfuscatedName("o.l")
    public String field41;

    @ObfuscatedName("o.b")
    public class165 field28;

    @ObfuscatedName("o.o")
    public int field29 = -1;

    @ObfuscatedName("o.w")
    public int field30 = -1;

    @ObfuscatedName("o.r")
    public int field31 = 0;

    @ObfuscatedName("o.k")
    public int field27 = 0;

    @ObfuscatedName("o.z")
    public int field32;

    @ObfuscatedName("o.g")
    public int field33 = 0;

    @ObfuscatedName("o.n")
    public int field35 = 0;

    @ObfuscatedName("o.j")
    public int field38;

    @ObfuscatedName("o.c")
    public int field36;

    @ObfuscatedName("o.m")
    public int field34;

    @ObfuscatedName("o.a")
    public class112 field42;

    @ObfuscatedName("o.e")
    public int field40;

    @ObfuscatedName("o.q")
    public int field37;

    @ObfuscatedName("o.y")
    public int field45;

    @ObfuscatedName("o.v")
    public int field43;

    @ObfuscatedName("o.s")
    public boolean field44 = false;

    @ObfuscatedName("o.u")
    public int field39 = 0;

    @ObfuscatedName("o.l(Ldm;I)V")
    public final void method9(class127 arg0) {
        arg0.field2022 = 0;
        int var2 = arg0.method2440();
        this.field29 = arg0.method2438();
        this.field30 = arg0.method2438();
        int var3 = -1;
        this.field39 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2440();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2440();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2442();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method1243(var4[var5] - 512).field1015;
                    if (var8 != 0) {
                        this.field39 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2440();
            if (var11 < 0 || var11 >= Statics.field2764[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field416 = arg0.method2442();
        if (this.field416 == 65535) {
            this.field416 = -1;
        }
        this.field417 = arg0.method2442();
        if (this.field417 == 65535) {
            this.field417 = -1;
        }
        this.field418 = this.field417;
        this.field419 = arg0.method2442();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field420 = arg0.method2442();
        if (this.field420 == 65535) {
            this.field420 = -1;
        }
        this.field421 = arg0.method2442();
        if (this.field421 == 65535) {
            this.field421 = -1;
        }
        this.field412 = arg0.method2442();
        if (this.field412 == 65535) {
            this.field412 = -1;
        }
        this.field411 = arg0.method2442();
        if (this.field411 == 65535) {
            this.field411 = -1;
        }
        this.field41 = arg0.method2471();
        if (Statics.field1096 == this) {
            Statics.field1401 = this.field41;
        }
        this.field31 = arg0.method2440();
        this.field27 = arg0.method2442();
        if (this.field28 == null) {
            this.field28 = new class165();
        }
        this.field28.method3217(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("o.b(I)Ldt;")
    public final class112 method11() {
        if (this.field28 == null) {
            return null;
        }
        class34 var1 = this.field414 != -1 && this.field443 == 0 ? class34.method2198(this.field414) : null;
        class34 var2 = this.field456 == -1 || this.field44 || this.field456 == this.field416 && var1 != null ? null : class34.method2198(this.field456);
        class112 var3 = this.field28.method3223(var1, this.field441, var2, this.field438);
        if (var3 == null) {
            return null;
        }
        var3.method2230();
        this.field431 = var3.field1537;
        if (!this.field44 && this.field445 != -1 && this.field446 != -1) {
            class112 var4 = class35.method2114(this.field445).method742(this.field446);
            if (var4 != null) {
                var4.method2239(0, -this.field451, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field44 && this.field42 != null) {
            if (client.field723 >= this.field35) {
                this.field42 = null;
            }
            if (client.field723 >= this.field33 && client.field723 < this.field35) {
                class112 var6 = this.field42;
                var6.method2239(this.field38 - this.field442, this.field36 - this.field32, this.field34 - this.field430);
                if (this.field459 == 512) {
                    var6.method2236();
                    var6.method2236();
                    var6.method2236();
                } else if (this.field459 == 1024) {
                    var6.method2236();
                    var6.method2236();
                } else if (this.field459 == 1536) {
                    var6.method2236();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field459 == 512) {
                    var6.method2236();
                } else if (this.field459 == 1024) {
                    var6.method2236();
                    var6.method2236();
                } else if (this.field459 == 1536) {
                    var6.method2236();
                    var6.method2236();
                    var6.method2236();
                }
                var6.method2239(this.field442 - this.field38, this.field32 - this.field36, this.field430 - this.field34);
            }
        }
        var3.field1879 = true;
        return var3;
    }

    @ObfuscatedName("o.o(I)Z")
    public final boolean method20() {
        return this.field28 != null;
    }
}
