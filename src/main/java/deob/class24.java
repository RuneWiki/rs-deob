package deob;

@ObfuscatedName("x")
public final class class24 extends class75 {

    @ObfuscatedName("x.m")
    public int field602;

    @ObfuscatedName("x.k")
    public int field599;

    @ObfuscatedName("x.y")
    public class35 field606;

    @ObfuscatedName("x.g")
    public int field600;

    @ObfuscatedName("x.r")
    public int field605;

    @ObfuscatedName("x.i")
    public int field613;

    @ObfuscatedName("x.f")
    public int field604;

    @ObfuscatedName("x.a")
    public int field601 = 0;

    @ObfuscatedName("x.w")
    public int field603 = 0;

    @ObfuscatedName("x.u")
    public boolean field607 = false;

    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field602 = arg0;
        this.field600 = arg1;
        this.field605 = arg2;
        this.field613 = arg3;
        this.field604 = arg4;
        this.field599 = arg5 + arg6;
        int var8 = class36.method2678(this.field602).field893;
        if (var8 == -1) {
            this.field607 = true;
        } else {
            this.field607 = false;
            this.field606 = class35.method162(var8);
        }
    }

    @ObfuscatedName("x.m(IB)V")
    public final void method513(int arg0) {
        if (this.field607) {
            return;
        }
        this.field603 += arg0;
        while (this.field603 > this.field606.field884[this.field601]) {
            this.field603 -= this.field606.field884[this.field601];
            this.field601++;
            if (this.field601 >= this.field606.field870.length) {
                this.field607 = true;
                break;
            }
        }
    }

    @ObfuscatedName("x.k(I)Lcl;")
    public final class95 method22() {
        class36 var1 = class36.method2678(this.field602);
        class95 var2;
        if (this.field607) {
            var2 = var1.method707(-1);
        } else {
            var2 = var1.method707(this.field601);
        }
        return var2 == null ? null : var2;
    }
}
