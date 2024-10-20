package deob;

@ObfuscatedName("ak")
public final class class27 extends class79 {

    @ObfuscatedName("ak.l")
    public int field625;

    @ObfuscatedName("ak.y")
    public class39 field616;

    @ObfuscatedName("ak.g")
    public int field611;

    @ObfuscatedName("ak.j")
    public int field621;

    @ObfuscatedName("ak.w")
    public int field620;

    @ObfuscatedName("ak.c")
    public int field614;

    @ObfuscatedName("ak.x")
    public int field615;

    @ObfuscatedName("ak.f")
    public int field617 = 0;

    @ObfuscatedName("ak.t")
    public int field622 = 0;

    @ObfuscatedName("ak.n")
    public boolean field619 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field625 = arg0;
        this.field621 = arg1;
        this.field620 = arg2;
        this.field614 = arg3;
        this.field615 = arg4;
        this.field611 = arg5 + arg6;
        int var8 = Statics.method503(this.field625).field920;
        if (var8 == -1) {
            this.field619 = true;
        } else {
            this.field619 = false;
            this.field616 = class39.method821(var8);
        }
    }

    @ObfuscatedName("ak.l(II)V")
    public final void method528(int arg0) {
        if (this.field619) {
            return;
        }
        this.field622 += arg0;
        while (this.field622 > this.field616.field904[this.field617]) {
            this.field622 -= this.field616.field904[this.field617];
            this.field617++;
            if (this.field617 >= this.field616.field902.length) {
                this.field619 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ak.y(I)Lck;")
    public final class99 method23() {
        class40 var1 = Statics.method503(this.field625);
        class99 var2;
        if (this.field619) {
            var2 = var1.method752(-1);
        } else {
            var2 = var1.method752(this.field617);
        }
        return var2 == null ? null : var2;
    }
}
