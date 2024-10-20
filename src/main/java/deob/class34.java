package deob;

@ObfuscatedName("ac")
public final class class34 extends class90 {

    @ObfuscatedName("ac.q")
    public int field764;

    @ObfuscatedName("ac.d")
    public int field763;

    @ObfuscatedName("ac.h")
    public int field774;

    @ObfuscatedName("ac.p")
    public int field765;

    @ObfuscatedName("ac.j")
    public int field766;

    @ObfuscatedName("ac.n")
    public int field772;

    @ObfuscatedName("ac.r")
    public class202 field768;

    @ObfuscatedName("ac.c")
    public int field762 = 0;

    @ObfuscatedName("ac.i")
    public int field777 = 0;

    @ObfuscatedName("ac.o")
    public boolean field769 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field764 = arg0;
        this.field774 = arg1;
        this.field765 = arg2;
        this.field766 = arg3;
        this.field772 = arg4;
        this.field763 = arg5 + arg6;
        int var8 = class191.method1883(this.field764).field2808;
        if (var8 == -1) {
            this.field769 = true;
        } else {
            this.field769 = false;
            this.field768 = class202.method3379(var8);
        }
    }

    @ObfuscatedName("ac.q(II)V")
    public final void method774(int arg0) {
        if (this.field769) {
            return;
        }
        this.field777 += arg0;
        while (this.field777 > this.field768.field3064[this.field762]) {
            this.field777 -= this.field768.field3064[this.field762];
            this.field762++;
            if (this.field762 >= this.field768.field3057.length) {
                this.field769 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ac.h(I)Lcf;")
    public final class83 method229() {
        class191 var1 = class191.method1883(this.field764);
        class83 var2;
        if (this.field769) {
            var2 = var1.method3279(-1);
        } else {
            var2 = var1.method3279(this.field762);
        }
        return var2 == null ? null : var2;
    }
}
