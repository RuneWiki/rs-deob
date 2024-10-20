package deob;

@ObfuscatedName("ex")
public class class151 implements class164 {

    @ObfuscatedName("ex.f")
    public int field1679;

    @ObfuscatedName("ex.o")
    public int field1668;

    @ObfuscatedName("ex.u")
    public int field1669;

    @ObfuscatedName("ex.p")
    public int field1670;

    @ObfuscatedName("ex.b")
    public int field1671;

    @ObfuscatedName("ex.e")
    public int field1672;

    @ObfuscatedName("ex.k")
    public int field1673;

    @ObfuscatedName("ex.g")
    public int field1667;

    @ObfuscatedName("ex.h")
    public int field1675;

    @ObfuscatedName("ex.n")
    public int field1677;

    @ObfuscatedName("ex.l")
    public int field1676;

    @ObfuscatedName("ex.m")
    public int field1678;

    @ObfuscatedName("ex.d")
    public int field1674;

    @ObfuscatedName("ex.c")
    public int field1680;

    @ObfuscatedName("ex.f(Leq;I)V")
    public void method2409(class144 arg0) {
        if (arg0.field1600 > this.field1671) {
            arg0.field1600 = this.field1671;
        }
        if (arg0.field1601 < this.field1671) {
            arg0.field1601 = this.field1671;
        }
        if (arg0.field1602 > this.field1672) {
            arg0.field1602 = this.field1672;
        }
        if (arg0.field1594 < this.field1672) {
            arg0.field1594 = this.field1672;
        }
    }

    @ObfuscatedName("ex.o(IIII)Z")
    public boolean method2392(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1679 && arg0 < this.field1679 + this.field1668) {
            return arg1 >= (this.field1673 << 3) + (this.field1669 << 6) && arg1 <= (this.field1675 << 3) + (this.field1669 << 6) + 7 && arg2 >= (this.field1670 << 6) + (this.field1667 << 3) && arg2 <= (this.field1677 << 3) + (this.field1670 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ex.u(III)Z")
    public boolean method2390(int arg0, int arg1) {
        return arg0 >= (this.field1676 << 3) + (this.field1671 << 6) && arg0 <= (this.field1674 << 3) + (this.field1671 << 6) + 7 && arg1 >= (this.field1678 << 3) + (this.field1672 << 6) && arg1 <= (this.field1680 << 3) + (this.field1672 << 6) + 7;
    }

    @ObfuscatedName("ex.p(IIII)[I")
    public int[] method2391(int arg0, int arg1, int arg2) {
        return this.method2392(arg0, arg1, arg2) ? new int[] { this.field1676 * 8 - this.field1673 * 8 + this.field1671 * 64 - this.field1669 * 64 + arg1, this.field1678 * 8 - this.field1667 * 8 + this.field1672 * 64 - this.field1670 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ex.b(III)Lhk;")
    public class221 method2387(int arg0, int arg1) {
        if (this.method2390(arg0, arg1)) {
            int var3 = this.field1673 * 8 - this.field1676 * 8 + this.field1669 * 64 - this.field1671 * 64 + arg0;
            int var4 = this.field1667 * 8 - this.field1678 * 8 + this.field1670 * 64 - this.field1672 * 64 + arg1;
            return new class221(this.field1679, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ex.e(Lnu;I)V")
    public void method2388(class382 arg0) {
        this.field1679 = arg0.method5856();
        this.field1668 = arg0.method5856();
        this.field1669 = arg0.method5858();
        this.field1673 = arg0.method5856();
        this.field1675 = arg0.method5856();
        this.field1670 = arg0.method5858();
        this.field1667 = arg0.method5856();
        this.field1677 = arg0.method5856();
        this.field1671 = arg0.method5858();
        this.field1676 = arg0.method5856();
        this.field1674 = arg0.method5856();
        this.field1672 = arg0.method5858();
        this.field1678 = arg0.method5856();
        this.field1680 = arg0.method5856();
        this.method2683();
    }

    @ObfuscatedName("ex.k(B)V")
    public void method2683() {
    }
}
