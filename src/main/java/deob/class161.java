package deob;

@ObfuscatedName("ff")
public class class161 implements class164 {

    @ObfuscatedName("ff.f")
    public int field1749;

    @ObfuscatedName("ff.o")
    public int field1753;

    @ObfuscatedName("ff.u")
    public int field1750;

    @ObfuscatedName("ff.p")
    public int field1751;

    @ObfuscatedName("ff.b")
    public int field1752;

    @ObfuscatedName("ff.e")
    public int field1748;

    @ObfuscatedName("ff.f(Leq;I)V")
    public void method2409(class144 arg0) {
        if (arg0.field1600 > this.field1752) {
            arg0.field1600 = this.field1752;
        }
        if (arg0.field1601 < this.field1752) {
            arg0.field1601 = this.field1752;
        }
        if (arg0.field1602 > this.field1748) {
            arg0.field1602 = this.field1748;
        }
        if (arg0.field1594 < this.field1748) {
            arg0.field1594 = this.field1748;
        }
    }

    @ObfuscatedName("ff.o(IIII)Z")
    public boolean method2392(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1749 && arg0 < this.field1753 + this.field1749) {
            return arg1 >> 6 == this.field1750 && arg2 >> 6 == this.field1751;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ff.u(III)Z")
    public boolean method2390(int arg0, int arg1) {
        return arg0 >> 6 == this.field1752 && arg1 >> 6 == this.field1748;
    }

    @ObfuscatedName("ff.p(IIII)[I")
    public int[] method2391(int arg0, int arg1, int arg2) {
        return this.method2392(arg0, arg1, arg2) ? new int[] { this.field1752 * 64 - this.field1750 * 64 + arg1, this.field1748 * 64 - this.field1751 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ff.b(III)Lhk;")
    public class221 method2387(int arg0, int arg1) {
        if (this.method2390(arg0, arg1)) {
            int var3 = this.field1750 * 64 - this.field1752 * 64 + arg0;
            int var4 = this.field1751 * 64 - this.field1748 * 64 + arg1;
            return new class221(this.field1749, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ff.e(Lnu;I)V")
    public void method2388(class382 arg0) {
        this.field1749 = arg0.method5856();
        this.field1753 = arg0.method5856();
        this.field1750 = arg0.method5858();
        this.field1751 = arg0.method5858();
        this.field1752 = arg0.method5858();
        this.field1748 = arg0.method5858();
        this.method2754();
    }

    @ObfuscatedName("ff.k(B)V")
    public void method2754() {
    }
}
