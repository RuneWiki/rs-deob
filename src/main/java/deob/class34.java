package deob;

@ObfuscatedName("at")
public final class class34 extends class90 {

    @ObfuscatedName("at.x")
    public int field769;

    @ObfuscatedName("at.j")
    public int field771;

    @ObfuscatedName("at.c")
    public int field766;

    @ObfuscatedName("at.d")
    public int field767;

    @ObfuscatedName("at.w")
    public int field768;

    @ObfuscatedName("at.h")
    public int field777;

    @ObfuscatedName("at.u")
    public class202 field770;

    @ObfuscatedName("at.k")
    public int field765 = 0;

    @ObfuscatedName("at.g")
    public int field773 = 0;

    @ObfuscatedName("at.y")
    public boolean field774 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field771 = arg0;
        this.field767 = arg1;
        this.field768 = arg2;
        this.field769 = arg3;
        this.field777 = arg4;
        this.field766 = arg5 + arg6;
        int var8 = class191.method3043(this.field771).field2793;
        if (var8 == -1) {
            this.field774 = true;
        } else {
            this.field774 = false;
            this.field770 = class202.method2997(var8);
        }
    }

    @ObfuscatedName("at.x(II)V")
    public final void method753(int arg0) {
        if (this.field774) {
            return;
        }
        this.field773 += arg0;
        while (this.field773 > this.field770.field3061[this.field765]) {
            this.field773 -= this.field770.field3061[this.field765];
            this.field765++;
            if (this.field765 >= this.field770.field3064.length) {
                this.field774 = true;
                break;
            }
        }
    }

    @ObfuscatedName("at.c(S)Lcj;")
    public final class83 method247() {
        class191 var1 = class191.method3043(this.field771);
        class83 var2;
        if (this.field774) {
            var2 = var1.method3261(-1);
        } else {
            var2 = var1.method3261(this.field765);
        }
        return var2 == null ? null : var2;
    }
}
