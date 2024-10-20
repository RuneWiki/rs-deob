package deob;

@ObfuscatedName("bf")
public final class class65 extends class206 {

    @ObfuscatedName("bf.o")
    public int field851;

    @ObfuscatedName("bf.q")
    public int field842;

    @ObfuscatedName("bf.l")
    public int field846;

    @ObfuscatedName("bf.k")
    public int field844;

    @ObfuscatedName("bf.a")
    public int field843;

    @ObfuscatedName("bf.m")
    public int field847;

    @ObfuscatedName("bf.p")
    public class191 field852;

    @ObfuscatedName("bf.s")
    public int field848 = 0;

    @ObfuscatedName("bf.r")
    public int field849 = 0;

    @ObfuscatedName("bf.v")
    public boolean field850 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field851 = arg0;
        this.field846 = arg1;
        this.field844 = arg2;
        this.field843 = arg3;
        this.field847 = arg4;
        this.field842 = arg5 + arg6;
        int var8 = class181.method2676(this.field851).field2011;
        if (var8 == -1) {
            this.field850 = true;
        } else {
            this.field850 = false;
            this.field852 = class191.method2497(var8);
        }
    }

    @ObfuscatedName("bf.o(IB)V")
    public final void method1782(int arg0) {
        if (this.field850) {
            return;
        }
        this.field849 += arg0;
        if (this.field852.method3417()) {
            this.field848 += arg0;
            if (this.field848 >= this.field852.method3434()) {
                this.field850 = true;
            }
            return;
        }
        while (this.field849 > this.field852.field2215[this.field848]) {
            this.field849 -= this.field852.field2215[this.field848];
            this.field848++;
            if (this.field848 >= this.field852.field2213.length) {
                this.field850 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bf.q(I)Lhv;")
    public final class212 method1774() {
        class181 var1 = class181.method2676(this.field851);
        class212 var2;
        if (this.field850) {
            var2 = var1.method3155(-1);
        } else {
            var2 = var1.method3155(this.field848);
        }
        return var2 == null ? null : var2;
    }
}
