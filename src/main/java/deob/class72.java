package deob;

@ObfuscatedName("cu")
public final class class72 extends class273 {

    @ObfuscatedName("cu.at")
    public int field860;

    @ObfuscatedName("cu.ah")
    public int field858;

    @ObfuscatedName("cu.ar")
    public int field859;

    @ObfuscatedName("cu.ao")
    public int field866;

    @ObfuscatedName("cu.ab")
    public int field857;

    @ObfuscatedName("cu.au")
    public int field861;

    @ObfuscatedName("cu.aa")
    public class205 field863;

    @ObfuscatedName("cu.ac")
    public int field864 = 0;

    @ObfuscatedName("cu.al")
    public int field865 = 0;

    @ObfuscatedName("cu.az")
    public boolean field862 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field860 = arg0;
        this.field859 = arg1;
        this.field866 = arg2;
        this.field857 = arg3;
        this.field861 = arg4;
        this.field858 = arg5 + arg6;
        int var8 = class194.method318(this.field860).field2009;
        if (var8 == -1) {
            this.field862 = true;
        } else {
            this.field862 = false;
            this.field863 = class205.method2129(var8);
        }
    }

    @ObfuscatedName("cu.at(IB)V")
    public final void method2020(int arg0) {
        if (this.field862) {
            return;
        }
        this.field865 += arg0;
        if (this.field863.method3733()) {
            this.field864 += arg0;
            if (this.field864 >= this.field863.method3749()) {
                this.field862 = true;
            }
            return;
        }
        while (this.field865 > this.field863.field2218[this.field864]) {
            this.field865 -= this.field863.field2218[this.field864];
            this.field864++;
            if (this.field864 >= this.field863.field2216.length) {
                this.field862 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cu.ah(B)Lka;")
    public final class280 method2019() {
        class194 var1 = class194.method318(this.field860);
        class280 var2;
        if (this.field862) {
            var2 = var1.method3447(-1);
        } else {
            var2 = var1.method3447(this.field864);
        }
        return var2 == null ? null : var2;
    }
}
