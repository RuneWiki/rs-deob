package deob;

@ObfuscatedName("ae")
public final class class34 extends class90 {

    @ObfuscatedName("ae.n")
    public int field738;

    @ObfuscatedName("ae.d")
    public int field733;

    @ObfuscatedName("ae.m")
    public int field734;

    @ObfuscatedName("ae.h")
    public int field735;

    @ObfuscatedName("ae.w")
    public int field732;

    @ObfuscatedName("ae.r")
    public int field737;

    @ObfuscatedName("ae.c")
    public class202 field736;

    @ObfuscatedName("ae.p")
    public int field739 = 0;

    @ObfuscatedName("ae.g")
    public int field740 = 0;

    @ObfuscatedName("ae.z")
    public boolean field741 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field738 = arg0;
        this.field734 = arg1;
        this.field735 = arg2;
        this.field732 = arg3;
        this.field737 = arg4;
        this.field733 = arg5 + arg6;
        int var8 = class191.method3085(this.field738).field2801;
        if (var8 == -1) {
            this.field741 = true;
        } else {
            this.field741 = false;
            this.field736 = class202.method119(var8);
        }
    }

    @ObfuscatedName("ae.n(II)V")
    public final void method703(int arg0) {
        if (this.field741) {
            return;
        }
        this.field740 += arg0;
        while (this.field740 > this.field736.field3051[this.field739]) {
            this.field740 -= this.field736.field3051[this.field739];
            this.field739++;
            if (this.field739 >= this.field736.field3048.length) {
                this.field741 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.m(I)Lca;")
    public final class83 method233() {
        class191 var1 = class191.method3085(this.field738);
        class83 var2;
        if (this.field741) {
            var2 = var1.method3266(-1);
        } else {
            var2 = var1.method3266(this.field739);
        }
        return var2 == null ? null : var2;
    }
}
