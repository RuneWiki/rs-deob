package deob;

@ObfuscatedName("ar")
public final class class34 extends class90 {

    @ObfuscatedName("ar.p")
    public int field732;

    @ObfuscatedName("ar.g")
    public int field731;

    @ObfuscatedName("ar.x")
    public int field739;

    @ObfuscatedName("ar.q")
    public int field737;

    @ObfuscatedName("ar.d")
    public int field734;

    @ObfuscatedName("ar.k")
    public int field736;

    @ObfuscatedName("ar.j")
    public class202 field735;

    @ObfuscatedName("ar.s")
    public int field738 = 0;

    @ObfuscatedName("ar.o")
    public int field733 = 0;

    @ObfuscatedName("ar.a")
    public boolean field740 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field732 = arg0;
        this.field737 = arg1;
        this.field734 = arg2;
        this.field739 = arg3;
        this.field736 = arg4;
        this.field731 = arg5 + arg6;
        int var8 = class191.method1354(this.field732).field2793;
        if (var8 == -1) {
            this.field740 = true;
        } else {
            this.field740 = false;
            this.field735 = class202.method2533(var8);
        }
    }

    @ObfuscatedName("ar.p(II)V")
    public final void method672(int arg0) {
        if (this.field740) {
            return;
        }
        this.field733 += arg0;
        while (this.field733 > this.field735.field3061[this.field738]) {
            this.field733 -= this.field735.field3061[this.field738];
            this.field738++;
            if (this.field738 >= this.field735.field3050.length) {
                this.field740 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ar.x(I)Lcw;")
    public final class83 method223() {
        class191 var1 = class191.method1354(this.field732);
        class83 var2;
        if (this.field740) {
            var2 = var1.method3209(-1);
        } else {
            var2 = var1.method3209(this.field738);
        }
        return var2 == null ? null : var2;
    }
}
