package deob;

@ObfuscatedName("bl")
public final class class65 extends class206 {

    @ObfuscatedName("bl.c")
    public int field862;

    @ObfuscatedName("bl.p")
    public int field853;

    @ObfuscatedName("bl.f")
    public int field854;

    @ObfuscatedName("bl.n")
    public int field855;

    @ObfuscatedName("bl.k")
    public int field852;

    @ObfuscatedName("bl.w")
    public int field857;

    @ObfuscatedName("bl.s")
    public class191 field860;

    @ObfuscatedName("bl.q")
    public int field858 = 0;

    @ObfuscatedName("bl.m")
    public int field856 = 0;

    @ObfuscatedName("bl.x")
    public boolean field861 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field862 = arg0;
        this.field854 = arg1;
        this.field855 = arg2;
        this.field852 = arg3;
        this.field857 = arg4;
        this.field853 = arg5 + arg6;
        int var8 = class181.method5344(this.field862).field1993;
        if (var8 == -1) {
            this.field861 = true;
        } else {
            this.field861 = false;
            this.field860 = class191.method22(var8);
        }
    }

    @ObfuscatedName("bl.c(II)V")
    public final void method1924(int arg0) {
        if (this.field861) {
            return;
        }
        this.field856 += arg0;
        if (this.field860.method3578()) {
            this.field858 += arg0;
            if (this.field858 >= this.field860.method3583()) {
                this.field861 = true;
            }
            return;
        }
        while (this.field856 > this.field860.field2221[this.field858]) {
            this.field856 -= this.field860.field2221[this.field858];
            this.field858++;
            if (this.field858 >= this.field860.field2205.length) {
                this.field861 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bl.p(B)Lha;")
    public final class212 method1926() {
        class181 var1 = class181.method5344(this.field862);
        class212 var2;
        if (this.field861) {
            var2 = var1.method3307(-1);
        } else {
            var2 = var1.method3307(this.field858);
        }
        return var2 == null ? null : var2;
    }
}
