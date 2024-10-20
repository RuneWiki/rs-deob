package deob;

@ObfuscatedName("o")
public final class class68 extends class181 {

    @ObfuscatedName("o.f")
    public int field638;

    @ObfuscatedName("o.g")
    public int field636 = 0;

    @ObfuscatedName("o.e")
    public int field637 = 0;

    @ObfuscatedName("o.c")
    public int field647 = 0;

    @ObfuscatedName("o.n")
    public int field643;

    @ObfuscatedName("o.o")
    public int field631 = -1;

    @ObfuscatedName("o.l")
    public class41 field641;

    @ObfuscatedName("o.m")
    public int field645;

    @ObfuscatedName("o.j")
    public String field632;

    @ObfuscatedName("o.h")
    public int field635 = 0;

    @ObfuscatedName("o.i")
    public int field630;

    @ObfuscatedName("o.w")
    public int field642;

    @ObfuscatedName("o.v")
    public boolean field646 = false;

    @ObfuscatedName("o.t")
    public int field639 = -1;

    @ObfuscatedName("o.s")
    public int field644;

    @ObfuscatedName("o.r")
    public int field634 = 0;

    @ObfuscatedName("o.p")
    public class73 field633;

    @ObfuscatedName("o.z")
    public int field640;

    @ObfuscatedName("o.x")
    public int field629;

    @ObfuscatedName("o.o(B)Z")
    public final boolean method821() {
        return this.field633 != null;
    }

    @ObfuscatedName("o.j(Ldy;I)V")
    public final void method919(class31 arg0) {
        arg0.field172 = 0;
        int var2 = arg0.method512();
        this.field631 = arg0.method492();
        this.field639 = arg0.method492();
        int var3 = -1;
        this.field647 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method512();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method512();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method373();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class165.method3520(var4[var5] - 512).field2519;
                    if (var8 != 0) {
                        this.field647 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method512();
            if (var11 < 0 || var11 >= Statics.field696[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field2687 = arg0.method373();
        if (this.field2687 == 65535) {
            this.field2687 = -1;
        }
        this.field2688 = arg0.method373();
        if (this.field2688 == 65535) {
            this.field2688 = -1;
        }
        this.field2715 = this.field2688;
        this.field2690 = arg0.method373();
        if (this.field2690 == 65535) {
            this.field2690 = -1;
        }
        this.field2691 = arg0.method373();
        if (this.field2691 == 65535) {
            this.field2691 = -1;
        }
        this.field2692 = arg0.method373();
        if (this.field2692 == 65535) {
            this.field2692 = -1;
        }
        this.field2719 = arg0.method373();
        if (this.field2719 == 65535) {
            this.field2719 = -1;
        }
        this.field2694 = arg0.method373();
        if (this.field2694 == 65535) {
            this.field2694 = -1;
        }
        this.field632 = arg0.method379();
        if (Statics.field387 == this) {
            Statics.field2350 = this.field632;
        }
        this.field635 = arg0.method512();
        this.field634 = arg0.method373();
        if (this.field633 == null) {
            this.field633 = new class73();
        }
        this.field633.method960(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("o.p(B)Ldi;")
    public final class41 method784() {
        if (this.field633 == null) {
            return null;
        }
        class166 var1 = this.field2711 != -1 && this.field2714 == 0 ? class166.method274(this.field2711) : null;
        class166 var2 = this.field2682 == -1 || this.field646 || this.field2687 == this.field2682 && var1 != null ? null : class166.method274(this.field2682);
        class41 var3 = this.field633.method966(var1, this.field2726, var2, this.field2733);
        if (var3 == null) {
            return null;
        }
        var3.method704();
        this.field2729 = var3.field2174;
        if (!this.field646 && this.field2716 != -1 && this.field2717 != -1) {
            class41 var4 = class173.method2209(this.field2716).method3335(this.field2717);
            if (var4 != null) {
                var4.method674(0, -this.field2720, 0);
                class41[] var5 = new class41[] { var3, var4 };
                var3 = new class41(var5, 2);
            }
        }
        if (!this.field646 && this.field641 != null) {
            if (client.field1483 >= this.field637) {
                this.field641 = null;
            }
            if (client.field1483 >= this.field636 && client.field1483 < this.field637) {
                class41 var6 = this.field641;
                var6.method674(this.field638 - this.field2735, this.field629 - this.field643, this.field640 - this.field2683);
                if (this.field2707 == 512) {
                    var6.method683();
                    var6.method683();
                    var6.method683();
                } else if (this.field2707 == 1024) {
                    var6.method683();
                    var6.method683();
                } else if (this.field2707 == 1536) {
                    var6.method683();
                }
                class41[] var7 = new class41[] { var3, var6 };
                var3 = new class41(var7, 2);
                if (this.field2707 == 512) {
                    var6.method683();
                } else if (this.field2707 == 1024) {
                    var6.method683();
                    var6.method683();
                } else if (this.field2707 == 1536) {
                    var6.method683();
                    var6.method683();
                    var6.method683();
                }
                var6.method674(this.field2735 - this.field638, this.field643 - this.field629, this.field2683 - this.field640);
            }
        }
        var3.field305 = true;
        return var3;
    }
}
