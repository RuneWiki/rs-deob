package deob;

@ObfuscatedName("k")
public final class class26 extends class78 {

    @ObfuscatedName("k.p")
    public int field634;

    @ObfuscatedName("k.g")
    public int field631;

    @ObfuscatedName("k.x")
    public int field624;

    @ObfuscatedName("k.c")
    public int field625;

    @ObfuscatedName("k.n")
    public int field626;

    @ObfuscatedName("k.s")
    public int field627;

    @ObfuscatedName("k.r")
    public class38 field629;

    @ObfuscatedName("k.w")
    public int field630 = 0;

    @ObfuscatedName("k.u")
    public int field623 = 0;

    @ObfuscatedName("k.d")
    public boolean field632 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field634 = arg0;
        this.field625 = arg1;
        this.field626 = arg2;
        this.field624 = arg3;
        this.field627 = arg4;
        this.field631 = arg5 + arg6;
        int var8 = class39.method3391(this.field634).field928;
        if (var8 == -1) {
            this.field632 = true;
        } else {
            this.field632 = false;
            this.field629 = class38.method507(var8);
        }
    }

    @ObfuscatedName("k.p(IB)V")
    public final void method547(int arg0) {
        if (this.field632) {
            return;
        }
        this.field623 += arg0;
        while (this.field623 > this.field629.field907[this.field630]) {
            this.field623 -= this.field629.field907[this.field630];
            this.field630++;
            if (this.field630 >= this.field629.field905.length) {
                this.field632 = true;
                break;
            }
        }
    }

    @ObfuscatedName("k.g(I)Lcn;")
    public final class98 method20() {
        class39 var1 = class39.method3391(this.field634);
        class98 var2;
        if (this.field632) {
            var2 = var1.method776(-1);
        } else {
            var2 = var1.method776(this.field630);
        }
        return var2 == null ? null : var2;
    }
}
