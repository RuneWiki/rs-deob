package deob;

@ObfuscatedName("cj")
public final class class72 extends class232 {

    @ObfuscatedName("cj.at")
    public int field885;

    @ObfuscatedName("cj.an")
    public int field878;

    @ObfuscatedName("cj.av")
    public int field886;

    @ObfuscatedName("cj.as")
    public int field883;

    @ObfuscatedName("cj.ax")
    public int field881;

    @ObfuscatedName("cj.ap")
    public int field882;

    @ObfuscatedName("cj.ab")
    public class208 field879;

    @ObfuscatedName("cj.ak")
    public int field884 = 0;

    @ObfuscatedName("cj.ae")
    public int field880 = 0;

    @ObfuscatedName("cj.af")
    public boolean field877 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field885 = arg0;
        this.field886 = arg1;
        this.field883 = arg2;
        this.field881 = arg3;
        this.field882 = arg4;
        this.field878 = arg5 + arg6;
        int var8 = class198.method983(this.field885).field2068;
        if (var8 == -1) {
            this.field877 = true;
        } else {
            this.field877 = false;
            this.field879 = class208.method4648(var8);
        }
    }

    @ObfuscatedName("cj.at(IB)V")
    public final void method1951(int arg0) {
        if (this.field877) {
            return;
        }
        this.field880 += arg0;
        if (this.field879.method3754()) {
            this.field884 += arg0;
            if (this.field884 >= this.field879.method3757()) {
                this.field877 = true;
            }
            return;
        }
        while (this.field880 > this.field879.field2287[this.field884]) {
            this.field880 -= this.field879.field2287[this.field884];
            this.field884++;
            if (this.field884 >= this.field879.field2285.length) {
                this.field877 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cj.an(I)Ljd;")
    public final class239 method1952() {
        class198 var1 = class198.method983(this.field885);
        class239 var2;
        if (this.field877) {
            var2 = var1.method3438(-1);
        } else {
            var2 = var1.method3438(this.field884);
        }
        return var2 == null ? null : var2;
    }
}
