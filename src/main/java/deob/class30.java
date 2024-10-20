package deob;

@ObfuscatedName("ai")
public final class class30 extends class85 {

    @ObfuscatedName("ai.y")
    public class43 field690;

    @ObfuscatedName("ai.d")
    public int field685;

    @ObfuscatedName("ai.g")
    public int field687;

    @ObfuscatedName("ai.w")
    public int field686;

    @ObfuscatedName("ai.e")
    public int field699;

    @ObfuscatedName("ai.c")
    public int field684;

    @ObfuscatedName("ai.a")
    public int field689;

    @ObfuscatedName("ai.q")
    public int field691 = 0;

    @ObfuscatedName("ai.m")
    public int field695 = 0;

    @ObfuscatedName("ai.n")
    public boolean field688 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field685 = arg0;
        this.field686 = arg1;
        this.field699 = arg2;
        this.field684 = arg3;
        this.field689 = arg4;
        this.field687 = arg5 + arg6;
        int var8 = class44.method3639(this.field685).field1010;
        if (var8 == -1) {
            this.field688 = true;
        } else {
            this.field688 = false;
            this.field690 = class43.method750(var8);
        }
    }

    @ObfuscatedName("ai.y(II)V")
    public final void method631(int arg0) {
        if (this.field688) {
            return;
        }
        this.field695 += arg0;
        while (this.field695 > this.field690.field985[this.field691]) {
            this.field695 -= this.field690.field985[this.field691];
            this.field691++;
            if (this.field691 >= this.field690.field986.length) {
                this.field688 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ai.g(I)Ldg;")
    public final class105 method10() {
        class44 var1 = class44.method3639(this.field685);
        class105 var2;
        if (this.field688) {
            var2 = var1.method874(-1);
        } else {
            var2 = var1.method874(this.field691);
        }
        return var2 == null ? null : var2;
    }
}
