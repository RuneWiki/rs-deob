package deob;

@ObfuscatedName("af")
public final class class34 extends class90 {

    @ObfuscatedName("af.k")
    public int field741;

    @ObfuscatedName("af.y")
    public class202 field742;

    @ObfuscatedName("af.o")
    public int field737;

    @ObfuscatedName("af.r")
    public int field749;

    @ObfuscatedName("af.w")
    public int field739;

    @ObfuscatedName("af.j")
    public int field740;

    @ObfuscatedName("af.q")
    public int field747;

    @ObfuscatedName("af.d")
    public int field736 = 0;

    @ObfuscatedName("af.n")
    public int field744 = 0;

    @ObfuscatedName("af.c")
    public boolean field745 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field741 = arg0;
        this.field749 = arg1;
        this.field739 = arg2;
        this.field740 = arg3;
        this.field747 = arg4;
        this.field737 = arg5 + arg6;
        int var8 = class191.method188(this.field741).field2779;
        if (var8 == -1) {
            this.field745 = true;
        } else {
            this.field745 = false;
            this.field742 = class202.method1368(var8);
        }
    }

    @ObfuscatedName("af.k(II)V")
    public final void method713(int arg0) {
        if (this.field745) {
            return;
        }
        this.field744 += arg0;
        while (this.field744 > this.field742.field3040[this.field736]) {
            this.field744 -= this.field742.field3040[this.field736];
            this.field736++;
            if (this.field736 >= this.field742.field3038.length) {
                this.field745 = true;
                break;
            }
        }
    }

    @ObfuscatedName("af.o(I)Lcu;")
    public final class83 method258() {
        class191 var1 = class191.method188(this.field741);
        class83 var2;
        if (this.field745) {
            var2 = var1.method3242(-1);
        } else {
            var2 = var1.method3242(this.field736);
        }
        return var2 == null ? null : var2;
    }
}
