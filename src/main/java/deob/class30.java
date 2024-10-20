package deob;

@ObfuscatedName("ay")
public final class class30 extends class85 {

    @ObfuscatedName("ay.o")
    public int field688;

    @ObfuscatedName("ay.e")
    public int field686;

    @ObfuscatedName("ay.u")
    public int field691;

    @ObfuscatedName("ay.b")
    public int field690;

    @ObfuscatedName("ay.p")
    public int field687;

    @ObfuscatedName("ay.s")
    public int field685;

    @ObfuscatedName("ay.y")
    public class43 field689;

    @ObfuscatedName("ay.t")
    public int field683 = 0;

    @ObfuscatedName("ay.w")
    public int field684 = 0;

    @ObfuscatedName("ay.h")
    public boolean field692 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field688 = arg0;
        this.field691 = arg1;
        this.field690 = arg2;
        this.field687 = arg3;
        this.field685 = arg4;
        this.field686 = arg5 + arg6;
        int var8 = class44.method3260(this.field688).field1004;
        if (var8 == -1) {
            this.field692 = true;
        } else {
            this.field692 = false;
            this.field689 = class43.method774(var8);
        }
    }

    @ObfuscatedName("ay.o(II)V")
    public final void method669(int arg0) {
        if (this.field692) {
            return;
        }
        this.field684 += arg0;
        while (this.field684 > this.field689.field986[this.field683]) {
            this.field684 -= this.field689.field986[this.field683];
            this.field683++;
            if (this.field683 >= this.field689.field984.length) {
                this.field692 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ay.u(I)Ldk;")
    public final class105 method14() {
        class44 var1 = class44.method3260(this.field688);
        class105 var2;
        if (this.field692) {
            var2 = var1.method883(-1);
        } else {
            var2 = var1.method883(this.field683);
        }
        return var2 == null ? null : var2;
    }
}
