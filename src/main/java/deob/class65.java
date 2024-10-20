package deob;

@ObfuscatedName("bs")
public final class class65 extends class198 {

    @ObfuscatedName("bs.c")
    public int field826;

    @ObfuscatedName("bs.b")
    public int field838;

    @ObfuscatedName("bs.p")
    public int field825;

    @ObfuscatedName("bs.m")
    public int field828;

    @ObfuscatedName("bs.t")
    public int field829;

    @ObfuscatedName("bs.s")
    public int field830;

    @ObfuscatedName("bs.j")
    public class183 field831;

    @ObfuscatedName("bs.w")
    public int field832 = 0;

    @ObfuscatedName("bs.n")
    public int field833 = 0;

    @ObfuscatedName("bs.r")
    public boolean field834 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field826 = arg0;
        this.field825 = arg1;
        this.field828 = arg2;
        this.field829 = arg3;
        this.field830 = arg4;
        this.field838 = arg5 + arg6;
        int var8 = class173.method6501(this.field826).field1885;
        if (var8 == -1) {
            this.field834 = true;
        } else {
            this.field834 = false;
            this.field831 = class183.method2402(var8);
        }
    }

    @ObfuscatedName("bs.c(IB)V")
    public final void method1863(int arg0) {
        if (this.field834) {
            return;
        }
        this.field833 += arg0;
        if (this.field831.method3381()) {
            this.field832 += arg0;
            if (this.field832 >= this.field831.method3338()) {
                this.field834 = true;
            }
            return;
        }
        while (this.field833 > this.field831.field2081[this.field832]) {
            this.field833 -= this.field831.field2081[this.field832];
            this.field832++;
            if (this.field832 >= this.field831.field2099.length) {
                this.field834 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bs.b(I)Lgo;")
    public final class204 method1860() {
        class173 var1 = class173.method6501(this.field826);
        class204 var2;
        if (this.field834) {
            var2 = var1.method3047(-1);
        } else {
            var2 = var1.method3047(this.field832);
        }
        return var2 == null ? null : var2;
    }
}
