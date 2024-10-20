package deob;

@ObfuscatedName("bb")
public final class class65 extends class198 {

    @ObfuscatedName("bb.c")
    public int field859;

    @ObfuscatedName("bb.l")
    public int field857;

    @ObfuscatedName("bb.s")
    public int field858;

    @ObfuscatedName("bb.e")
    public int field862;

    @ObfuscatedName("bb.r")
    public int field860;

    @ObfuscatedName("bb.o")
    public int field861;

    @ObfuscatedName("bb.i")
    public class183 field865;

    @ObfuscatedName("bb.w")
    public int field863 = 0;

    @ObfuscatedName("bb.v")
    public int field866 = 0;

    @ObfuscatedName("bb.a")
    public boolean field864 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field859 = arg0;
        this.field858 = arg1;
        this.field862 = arg2;
        this.field860 = arg3;
        this.field861 = arg4;
        this.field857 = arg5 + arg6;
        int var8 = class173.method4901(this.field859).field1900;
        if (var8 == -1) {
            this.field864 = true;
        } else {
            this.field864 = false;
            this.field865 = class183.method1980(var8);
        }
    }

    @ObfuscatedName("bb.c(II)V")
    public final void method1789(int arg0) {
        if (this.field864) {
            return;
        }
        this.field866 += arg0;
        if (this.field865.method3284()) {
            this.field863 += arg0;
            if (this.field863 >= this.field865.method3321()) {
                this.field864 = true;
            }
            return;
        }
        while (this.field866 > this.field865.field2094[this.field863]) {
            this.field866 -= this.field865.field2094[this.field863];
            this.field863++;
            if (this.field863 >= this.field865.field2107.length) {
                this.field864 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bb.l(B)Lgf;")
    public final class204 method1790() {
        class173 var1 = class173.method4901(this.field859);
        class204 var2;
        if (this.field864) {
            var2 = var1.method3009(-1);
        } else {
            var2 = var1.method3009(this.field863);
        }
        return var2 == null ? null : var2;
    }
}
