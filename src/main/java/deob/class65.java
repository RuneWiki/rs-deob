package deob;

@ObfuscatedName("bn")
public final class class65 extends class235 {

    @ObfuscatedName("bn.v")
    public int field853;

    @ObfuscatedName("bn.c")
    public int field851;

    @ObfuscatedName("bn.i")
    public int field850;

    @ObfuscatedName("bn.f")
    public int field855;

    @ObfuscatedName("bn.b")
    public int field854;

    @ObfuscatedName("bn.n")
    public int field859;

    @ObfuscatedName("bn.s")
    public class191 field856;

    @ObfuscatedName("bn.l")
    public int field857 = 0;

    @ObfuscatedName("bn.q")
    public int field858 = 0;

    @ObfuscatedName("bn.o")
    public boolean field852 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field853 = arg0;
        this.field850 = arg1;
        this.field855 = arg2;
        this.field854 = arg3;
        this.field859 = arg4;
        this.field851 = arg5 + arg6;
        int var8 = class181.method2196(this.field853).field1944;
        if (var8 == -1) {
            this.field852 = true;
        } else {
            this.field852 = false;
            this.field856 = class191.method3011(var8);
        }
    }

    @ObfuscatedName("bn.v(IB)V")
    public final void method1811(int arg0) {
        if (this.field852) {
            return;
        }
        this.field858 += arg0;
        if (this.field856.method3462()) {
            this.field857 += arg0;
            if (this.field857 >= this.field856.method3507()) {
                this.field852 = true;
            }
            return;
        }
        while (this.field858 > this.field856.field2150[this.field857]) {
            this.field858 -= this.field856.field2150[this.field857];
            this.field857++;
            if (this.field857 >= this.field856.field2148.length) {
                this.field852 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bn.c(B)Liq;")
    public final class241 method1809() {
        class181 var1 = class181.method2196(this.field853);
        class241 var2;
        if (this.field852) {
            var2 = var1.method3206(-1);
        } else {
            var2 = var1.method3206(this.field857);
        }
        return var2 == null ? null : var2;
    }
}
