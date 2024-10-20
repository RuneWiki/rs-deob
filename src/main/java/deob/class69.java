package deob;

@ObfuscatedName("by")
public final class class69 extends class215 {

    @ObfuscatedName("by.a")
    public int field864;

    @ObfuscatedName("by.f")
    public int field858;

    @ObfuscatedName("by.c")
    public int field859;

    @ObfuscatedName("by.x")
    public int field857;

    @ObfuscatedName("by.h")
    public int field860;

    @ObfuscatedName("by.j")
    public int field870;

    @ObfuscatedName("by.y")
    public class197 field863;

    @ObfuscatedName("by.d")
    public int field862 = 0;

    @ObfuscatedName("by.n")
    public int field865 = 0;

    @ObfuscatedName("by.r")
    public boolean field866 = false;

    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field864 = arg0;
        this.field859 = arg1;
        this.field860 = arg2;
        this.field857 = arg3;
        this.field870 = arg4;
        this.field858 = arg5 + arg6;
        int var8 = class187.method710(this.field864).field2015;
        if (var8 == -1) {
            this.field866 = true;
        } else {
            this.field866 = false;
            this.field863 = class197.method3143(var8);
        }
    }

    @ObfuscatedName("by.a(II)V")
    public final void method1925(int arg0) {
        if (this.field866) {
            return;
        }
        this.field865 += arg0;
        if (this.field863.method3576()) {
            this.field862 += arg0;
            if (this.field862 >= this.field863.method3566()) {
                this.field866 = true;
            }
            return;
        }
        while (this.field865 > this.field863.field2220[this.field862]) {
            this.field865 -= this.field863.field2220[this.field862];
            this.field862++;
            if (this.field862 >= this.field863.field2218.length) {
                this.field866 = true;
                break;
            }
        }
    }

    @ObfuscatedName("by.f(I)Lha;")
    public final class221 method1929() {
        class187 var1 = class187.method710(this.field864);
        class221 var2;
        if (this.field866) {
            var2 = var1.method3279(-1);
        } else {
            var2 = var1.method3279(this.field862);
        }
        return var2 == null ? null : var2;
    }
}
