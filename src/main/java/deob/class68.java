package deob;

@ObfuscatedName("cx")
public final class class68 extends class225 {

    @ObfuscatedName("cx.af")
    public int field863;

    @ObfuscatedName("cx.an")
    public int field856;

    @ObfuscatedName("cx.aw")
    public int field857;

    @ObfuscatedName("cx.ac")
    public int field862;

    @ObfuscatedName("cx.au")
    public int field859;

    @ObfuscatedName("cx.ab")
    public int field860;

    @ObfuscatedName("cx.aq")
    public class204 field861;

    @ObfuscatedName("cx.al")
    public int field864 = 0;

    @ObfuscatedName("cx.at")
    public int field855 = 0;

    @ObfuscatedName("cx.aa")
    public boolean field858 = false;

    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field863 = arg0;
        this.field857 = arg1;
        this.field862 = arg2;
        this.field859 = arg3;
        this.field860 = arg4;
        this.field856 = arg5 + arg6;
        int var8 = class194.method2130(this.field863).field2079;
        if (var8 == -1) {
            this.field858 = true;
        } else {
            this.field858 = false;
            this.field861 = class204.method2139(var8);
        }
    }

    @ObfuscatedName("cx.af(IB)V")
    public final void method1924(int arg0) {
        if (this.field858) {
            return;
        }
        this.field855 += arg0;
        if (this.field861.method3816()) {
            this.field864 += arg0;
            if (this.field864 >= this.field861.method3817()) {
                this.field858 = true;
            }
            return;
        }
        while (this.field855 > this.field861.field2304[this.field864]) {
            this.field855 -= this.field861.field2304[this.field864];
            this.field864++;
            if (this.field864 >= this.field861.field2300.length) {
                this.field858 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cx.an(B)Lit;")
    public final class232 method1921() {
        class194 var1 = class194.method2130(this.field863);
        class232 var2;
        if (this.field858) {
            var2 = var1.method3516(-1);
        } else {
            var2 = var1.method3516(this.field864);
        }
        return var2 == null ? null : var2;
    }
}
