package deob;

@ObfuscatedName("d")
public final class class3 extends class34 {

    @ObfuscatedName("d.p")
    public String field43;

    @ObfuscatedName("d.y")
    public class162 field31;

    @ObfuscatedName("d.d")
    public int field46 = -1;

    @ObfuscatedName("d.c")
    public int field33 = -1;

    @ObfuscatedName("d.r")
    public int field34 = 0;

    @ObfuscatedName("d.f")
    public int field50 = 0;

    @ObfuscatedName("d.z")
    public int field36;

    @ObfuscatedName("d.o")
    public int field32 = 0;

    @ObfuscatedName("d.k")
    public int field38 = 0;

    @ObfuscatedName("d.s")
    public int field39;

    @ObfuscatedName("d.h")
    public int field40;

    @ObfuscatedName("d.m")
    public int field41;

    @ObfuscatedName("d.w")
    public class99 field42;

    @ObfuscatedName("d.q")
    public int field45;

    @ObfuscatedName("d.u")
    public int field30;

    @ObfuscatedName("d.e")
    public int field35;

    @ObfuscatedName("d.b")
    public int field44;

    @ObfuscatedName("d.g")
    public boolean field47 = false;

    @ObfuscatedName("d.j")
    public int field48 = 0;

    @ObfuscatedName("d.a")
    public boolean field49 = false;

    @ObfuscatedName("d.p(Ldg;S)V")
    public final void method12(class110 arg0) {
        arg0.field1842 = 0;
        int var2 = arg0.method2309();
        this.field46 = arg0.method2125();
        this.field33 = arg0.method2125();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2309();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2309();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2243();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method607(var4[var5] - 512).field1035;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2309();
            if (var11 < 0 || var11 >= Statics.field2705[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field706 = arg0.method2243();
        if (this.field706 == 65535) {
            this.field706 = -1;
        }
        this.field707 = arg0.method2243();
        if (this.field707 == 65535) {
            this.field707 = -1;
        }
        this.field708 = this.field707;
        this.field754 = arg0.method2243();
        if (this.field754 == 65535) {
            this.field754 = -1;
        }
        this.field757 = arg0.method2243();
        if (this.field757 == 65535) {
            this.field757 = -1;
        }
        this.field709 = arg0.method2243();
        if (this.field709 == 65535) {
            this.field709 = -1;
        }
        this.field721 = arg0.method2243();
        if (this.field721 == 65535) {
            this.field721 = -1;
        }
        this.field749 = arg0.method2243();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field43 = arg0.method2132();
        if (Statics.field2498 == this) {
            Statics.field2081 = this.field43;
        }
        this.field34 = arg0.method2309();
        this.field50 = arg0.method2243();
        this.field49 = arg0.method2309() == 1;
        if (client.field235 == 0 && client.field402 >= 2) {
            this.field49 = false;
        }
        if (this.field31 == null) {
            this.field31 = new class162();
        }
        this.field31.method2947(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("d.y(I)Lcy;")
    public final class99 method13() {
        if (this.field31 == null) {
            return null;
        }
        class39 var1 = this.field732 != -1 && this.field760 == 0 ? class39.method2920(this.field732) : null;
        class39 var2 = this.field729 == -1 || this.field47 || this.field729 == this.field706 && var1 != null ? null : class39.method2920(this.field729);
        class99 var3 = this.field31.method2961(var1, this.field702, var2, this.field730);
        if (var3 == null) {
            return null;
        }
        var3.method1996();
        this.field750 = var3.field1344;
        if (!this.field47 && this.field738 != -1 && this.field762 != -1) {
            class99 var4 = class40.method761(this.field738).method774(this.field762);
            if (var4 != null) {
                var4.method2024(0, -this.field741, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field47 && this.field42 != null) {
            if (client.field243 >= this.field38) {
                this.field42 = null;
            }
            if (client.field243 >= this.field32 && client.field243 < this.field38) {
                class99 var6 = this.field42;
                var6.method2024(this.field39 - this.field746, this.field40 - this.field36, this.field41 - this.field752);
                if (this.field716 == 512) {
                    var6.method2002();
                    var6.method2002();
                    var6.method2002();
                } else if (this.field716 == 1024) {
                    var6.method2002();
                    var6.method2002();
                } else if (this.field716 == 1536) {
                    var6.method2002();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field716 == 512) {
                    var6.method2002();
                } else if (this.field716 == 1024) {
                    var6.method2002();
                    var6.method2002();
                } else if (this.field716 == 1536) {
                    var6.method2002();
                    var6.method2002();
                    var6.method2002();
                }
                var6.method2024(this.field746 - this.field39, this.field36 - this.field40, this.field752 - this.field41);
            }
        }
        var3.field1714 = true;
        return var3;
    }

    @ObfuscatedName("d.d(I)Z")
    public final boolean method14() {
        return this.field31 != null;
    }
}
