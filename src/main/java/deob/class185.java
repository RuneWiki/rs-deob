package deob;

@ObfuscatedName("gu")
public class class185 implements class188 {

    @ObfuscatedName("gu.s")
    public int field2105;

    @ObfuscatedName("gu.t")
    public int field2103;

    @ObfuscatedName("gu.v")
    public int field2104;

    @ObfuscatedName("gu.j")
    public int field2106;

    @ObfuscatedName("gu.l")
    public int field2107;

    @ObfuscatedName("gu.n")
    public int field2108;

    @ObfuscatedName("gu.s(Lfa;I)V")
    public void method2967(class168 arg0) {
        if (arg0.field1953 > this.field2107) {
            arg0.field1953 = this.field2107;
        }
        if (arg0.field1951 < this.field2107) {
            arg0.field1951 = this.field2107;
        }
        if (arg0.field1952 > this.field2108) {
            arg0.field1952 = this.field2108;
        }
        if (arg0.field1957 < this.field2108) {
            arg0.field1957 = this.field2108;
        }
    }

    @ObfuscatedName("gu.t(IIIB)Z")
    public boolean method2946(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2105 && arg0 < this.field2105 + this.field2103) {
            return arg1 >> 6 == this.field2104 && arg2 >> 6 == this.field2106;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gu.v(III)Z")
    public boolean method2948(int arg0, int arg1) {
        return arg0 >> 6 == this.field2107 && arg1 >> 6 == this.field2108;
    }

    @ObfuscatedName("gu.j(IIII)[I")
    public int[] method2962(int arg0, int arg1, int arg2) {
        return this.method2946(arg0, arg1, arg2) ? new int[] { this.field2107 * 64 - this.field2104 * 64 + arg1, this.field2108 * 64 - this.field2106 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gu.l(IIB)Lij;")
    public class245 method2947(int arg0, int arg1) {
        if (this.method2948(arg0, arg1)) {
            int var3 = this.field2104 * 64 - this.field2107 * 64 + arg0;
            int var4 = this.field2106 * 64 - this.field2108 * 64 + arg1;
            return new class245(this.field2105, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gu.n(Lnv;I)V")
    public void method2949(class385 arg0) {
        this.field2105 = arg0.method5958();
        this.field2103 = arg0.method5958();
        this.field2104 = arg0.method6053();
        this.field2106 = arg0.method6053();
        this.field2107 = arg0.method6053();
        this.field2108 = arg0.method6053();
        this.method3279();
    }

    @ObfuscatedName("gu.w(I)V")
    public void method3279() {
    }
}
