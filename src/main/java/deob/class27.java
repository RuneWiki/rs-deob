package deob;

@ObfuscatedName("ad")
public final class class27 extends class79 {

    @ObfuscatedName("ad.v")
    public int field641;

    @ObfuscatedName("ad.t")
    public int field629;

    @ObfuscatedName("ad.f")
    public int field627;

    @ObfuscatedName("ad.j")
    public int field630;

    @ObfuscatedName("ad.l")
    public int field637;

    @ObfuscatedName("ad.g")
    public int field631;

    @ObfuscatedName("ad.k")
    public class39 field633;

    @ObfuscatedName("ad.p")
    public int field634 = 0;

    @ObfuscatedName("ad.y")
    public int field635 = 0;

    @ObfuscatedName("ad.m")
    public boolean field636 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field641 = arg0;
        this.field627 = arg1;
        this.field630 = arg2;
        this.field637 = arg3;
        this.field631 = arg4;
        this.field629 = arg5 + arg6;
        int var8 = class40.method2864(this.field641).field933;
        if (var8 == -1) {
            this.field636 = true;
        } else {
            this.field636 = false;
            this.field633 = class39.method682(var8);
        }
    }

    @ObfuscatedName("ad.v(IB)V")
    public final void method533(int arg0) {
        if (this.field636) {
            return;
        }
        this.field635 += arg0;
        while (this.field635 > this.field633.field911[this.field634]) {
            this.field635 -= this.field633.field911[this.field634];
            this.field634++;
            if (this.field634 >= this.field633.field908.length) {
                this.field636 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ad.t(I)Lcy;")
    public final class99 method11() {
        class40 var1 = class40.method2864(this.field641);
        class99 var2;
        if (this.field636) {
            var2 = var1.method754(-1);
        } else {
            var2 = var1.method754(this.field634);
        }
        return var2 == null ? null : var2;
    }
}
