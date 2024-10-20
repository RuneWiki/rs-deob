package deob;

@ObfuscatedName("bh")
public final class class65 extends class205 {

    @ObfuscatedName("bh.c")
    public int field853;

    @ObfuscatedName("bh.v")
    public int field864;

    @ObfuscatedName("bh.q")
    public int field859;

    @ObfuscatedName("bh.f")
    public int field855;

    @ObfuscatedName("bh.j")
    public int field852;

    @ObfuscatedName("bh.e")
    public int field857;

    @ObfuscatedName("bh.g")
    public class190 field858;

    @ObfuscatedName("bh.w")
    public int field860 = 0;

    @ObfuscatedName("bh.y")
    public int field856 = 0;

    @ObfuscatedName("bh.i")
    public boolean field861 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field853 = arg0;
        this.field859 = arg1;
        this.field855 = arg2;
        this.field852 = arg3;
        this.field857 = arg4;
        this.field864 = arg5 + arg6;
        int var8 = class180.method1612(this.field853).field1976;
        if (var8 == -1) {
            this.field861 = true;
        } else {
            this.field861 = false;
            this.field858 = class190.method983(var8);
        }
    }

    @ObfuscatedName("bh.c(II)V")
    public final void method1787(int arg0) {
        if (this.field861) {
            return;
        }
        this.field856 += arg0;
        if (this.field858.method3509()) {
            this.field860 += arg0;
            if (this.field860 >= this.field858.method3510()) {
                this.field861 = true;
            }
            return;
        }
        while (this.field856 > this.field858.field2180[this.field860]) {
            this.field856 -= this.field858.field2180[this.field860];
            this.field860++;
            if (this.field860 >= this.field858.field2176.length) {
                this.field861 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bh.v(I)Lhy;")
    public final class211 method1782() {
        class180 var1 = class180.method1612(this.field853);
        class211 var2;
        if (this.field861) {
            var2 = var1.method3213(-1);
        } else {
            var2 = var1.method3213(this.field860);
        }
        return var2 == null ? null : var2;
    }
}
