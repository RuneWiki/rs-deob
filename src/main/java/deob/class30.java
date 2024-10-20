package deob;

@ObfuscatedName("al")
public final class class30 extends class85 {

    @ObfuscatedName("al.n")
    public int field692;

    @ObfuscatedName("al.q")
    public int field698;

    @ObfuscatedName("al.c")
    public int field685;

    @ObfuscatedName("al.l")
    public int field684;

    @ObfuscatedName("al.r")
    public int field687;

    @ObfuscatedName("al.u")
    public int field688;

    @ObfuscatedName("al.j")
    public class43 field689;

    @ObfuscatedName("al.w")
    public int field690 = 0;

    @ObfuscatedName("al.y")
    public int field691 = 0;

    @ObfuscatedName("al.o")
    public boolean field686 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field692 = arg0;
        this.field685 = arg1;
        this.field684 = arg2;
        this.field687 = arg3;
        this.field688 = arg4;
        this.field698 = arg5 + arg6;
        int var8 = class44.method601(this.field692).field1008;
        if (var8 == -1) {
            this.field686 = true;
        } else {
            this.field686 = false;
            this.field689 = class43.method788(var8);
        }
    }

    @ObfuscatedName("al.n(IS)V")
    public final void method661(int arg0) {
        if (this.field686) {
            return;
        }
        this.field691 += arg0;
        while (this.field691 > this.field689.field985[this.field690]) {
            this.field691 -= this.field689.field985[this.field690];
            this.field690++;
            if (this.field690 >= this.field689.field983.length) {
                this.field686 = true;
                break;
            }
        }
    }

    @ObfuscatedName("al.c(I)Ldt;")
    public final class105 method14() {
        class44 var1 = class44.method601(this.field692);
        class105 var2;
        if (this.field686) {
            var2 = var1.method895(-1);
        } else {
            var2 = var1.method895(this.field690);
        }
        return var2 == null ? null : var2;
    }
}
