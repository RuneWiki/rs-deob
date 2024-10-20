package deob;

@ObfuscatedName("br")
public final class class65 extends class205 {

    @ObfuscatedName("br.s")
    public int field845;

    @ObfuscatedName("br.h")
    public int field838;

    @ObfuscatedName("br.w")
    public int field839;

    @ObfuscatedName("br.v")
    public int field840;

    @ObfuscatedName("br.c")
    public int field837;

    @ObfuscatedName("br.q")
    public int field842;

    @ObfuscatedName("br.i")
    public class190 field843;

    @ObfuscatedName("br.k")
    public int field844 = 0;

    @ObfuscatedName("br.o")
    public int field847 = 0;

    @ObfuscatedName("br.n")
    public boolean field846 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field845 = arg0;
        this.field839 = arg1;
        this.field840 = arg2;
        this.field837 = arg3;
        this.field842 = arg4;
        this.field838 = arg5 + arg6;
        int var8 = class180.method6177(this.field845).field1961;
        if (var8 == -1) {
            this.field846 = true;
        } else {
            this.field846 = false;
            this.field843 = class190.method5853(var8);
        }
    }

    @ObfuscatedName("br.s(IB)V")
    public final void method1752(int arg0) {
        if (this.field846) {
            return;
        }
        this.field847 += arg0;
        if (this.field843.method3388()) {
            this.field844 += arg0;
            if (this.field844 >= this.field843.method3392()) {
                this.field846 = true;
            }
            return;
        }
        while (this.field847 > this.field843.field2164[this.field844]) {
            this.field847 -= this.field843.field2164[this.field844];
            this.field844++;
            if (this.field844 >= this.field843.field2167.length) {
                this.field846 = true;
                break;
            }
        }
    }

    @ObfuscatedName("br.h(B)Lhp;")
    public final class211 method1748() {
        class180 var1 = class180.method6177(this.field845);
        class211 var2;
        if (this.field846) {
            var2 = var1.method3109(-1);
        } else {
            var2 = var1.method3109(this.field844);
        }
        return var2 == null ? null : var2;
    }
}
