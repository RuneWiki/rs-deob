package deob;

@ObfuscatedName("bu")
public final class class65 extends class214 {

    @ObfuscatedName("bu.n")
    public int field835;

    @ObfuscatedName("bu.c")
    public int field841;

    @ObfuscatedName("bu.m")
    public int field836;

    @ObfuscatedName("bu.k")
    public int field837;

    @ObfuscatedName("bu.o")
    public int field842;

    @ObfuscatedName("bu.g")
    public int field839;

    @ObfuscatedName("bu.z")
    public class172 field840;

    @ObfuscatedName("bu.a")
    public int field846 = 0;

    @ObfuscatedName("bu.u")
    public int field844 = 0;

    @ObfuscatedName("bu.e")
    public boolean field843 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field835 = arg0;
        this.field836 = arg1;
        this.field837 = arg2;
        this.field842 = arg3;
        this.field839 = arg4;
        this.field841 = arg5 + arg6;
        int var8 = class163.method2520(this.field835).field1751;
        if (var8 == -1) {
            this.field843 = true;
        } else {
            this.field843 = false;
            this.field840 = class172.method269(var8);
        }
    }

    @ObfuscatedName("bu.n(II)V")
    public final void method1765(int arg0) {
        if (this.field843) {
            return;
        }
        this.field844 += arg0;
        while (this.field844 > this.field840.field1951[this.field846]) {
            this.field844 -= this.field840.field1951[this.field846];
            this.field846++;
            if (this.field846 >= this.field840.field1952.length) {
                this.field843 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bu.c(B)Lhg;")
    public final class220 method1766() {
        class163 var1 = class163.method2520(this.field835);
        class220 var2;
        if (this.field843) {
            var2 = var1.method2749(-1);
        } else {
            var2 = var1.method2749(this.field846);
        }
        return var2 == null ? null : var2;
    }
}
