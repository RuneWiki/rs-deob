package deob;

@ObfuscatedName("bs")
public final class class65 extends class214 {

    @ObfuscatedName("bs.l")
    public int field847;

    @ObfuscatedName("bs.q")
    public int field837;

    @ObfuscatedName("bs.f")
    public int field840;

    @ObfuscatedName("bs.j")
    public int field844;

    @ObfuscatedName("bs.m")
    public int field841;

    @ObfuscatedName("bs.k")
    public int field842;

    @ObfuscatedName("bs.t")
    public class172 field843;

    @ObfuscatedName("bs.a")
    public int field838 = 0;

    @ObfuscatedName("bs.e")
    public int field845 = 0;

    @ObfuscatedName("bs.i")
    public boolean field846 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field847 = arg0;
        this.field840 = arg1;
        this.field844 = arg2;
        this.field841 = arg3;
        this.field842 = arg4;
        this.field837 = arg5 + arg6;
        int var8 = Statics.method304(this.field847).field1761;
        if (var8 == -1) {
            this.field846 = true;
        } else {
            this.field846 = false;
            this.field843 = class172.method2708(var8);
        }
    }

    @ObfuscatedName("bs.l(IB)V")
    public final void method1783(int arg0) {
        if (this.field846) {
            return;
        }
        this.field845 += arg0;
        while (this.field845 > this.field843.field1951[this.field838]) {
            this.field845 -= this.field843.field1951[this.field838];
            this.field838++;
            if (this.field838 >= this.field843.field1959.length) {
                this.field846 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bs.q(B)Lhl;")
    public final class220 method1785() {
        class163 var1 = Statics.method304(this.field847);
        class220 var2;
        if (this.field846) {
            var2 = var1.method2814(-1);
        } else {
            var2 = var1.method2814(this.field838);
        }
        return var2 == null ? null : var2;
    }
}
