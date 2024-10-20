package deob;

@ObfuscatedName("ev")
public class class148 implements class164 {

    @ObfuscatedName("ev.f")
    public int field1646;

    @ObfuscatedName("ev.o")
    public int field1649;

    @ObfuscatedName("ev.u")
    public int field1647;

    @ObfuscatedName("ev.p")
    public int field1651;

    @ObfuscatedName("ev.b")
    public int field1648;

    @ObfuscatedName("ev.e")
    public int field1650;

    @ObfuscatedName("ev.k")
    public int field1645;

    @ObfuscatedName("ev.g")
    public int field1652;

    @ObfuscatedName("ev.h")
    public int field1653;

    @ObfuscatedName("ev.n")
    public int field1654;

    @ObfuscatedName("ev.f(Leq;I)V")
    public void method2409(class144 arg0) {
        if (arg0.field1600 > this.field1648) {
            arg0.field1600 = this.field1648;
        }
        if (arg0.field1601 < this.field1648) {
            arg0.field1601 = this.field1648;
        }
        if (arg0.field1602 > this.field1650) {
            arg0.field1602 = this.field1650;
        }
        if (arg0.field1594 < this.field1650) {
            arg0.field1594 = this.field1650;
        }
    }

    @ObfuscatedName("ev.o(IIII)Z")
    public boolean method2392(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1646 && arg0 < this.field1649 + this.field1646) {
            return arg1 >= (this.field1647 << 6) + (this.field1645 << 3) && arg1 <= (this.field1647 << 6) + (this.field1645 << 3) + 7 && arg2 >= (this.field1652 << 3) + (this.field1651 << 6) && arg2 <= (this.field1652 << 3) + (this.field1651 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ev.u(III)Z")
    public boolean method2390(int arg0, int arg1) {
        return arg0 >= (this.field1653 << 3) + (this.field1648 << 6) && arg0 <= (this.field1653 << 3) + (this.field1648 << 6) + 7 && arg1 >= (this.field1654 << 3) + (this.field1650 << 6) && arg1 <= (this.field1654 << 3) + (this.field1650 << 6) + 7;
    }

    @ObfuscatedName("ev.p(IIII)[I")
    public int[] method2391(int arg0, int arg1, int arg2) {
        return this.method2392(arg0, arg1, arg2) ? new int[] { this.field1653 * 8 - this.field1645 * 8 + this.field1648 * 64 - this.field1647 * 64 + arg1, this.field1654 * 8 - this.field1652 * 8 + this.field1650 * 64 - this.field1651 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ev.b(III)Lhk;")
    public class221 method2387(int arg0, int arg1) {
        if (this.method2390(arg0, arg1)) {
            int var3 = this.field1645 * 8 - this.field1653 * 8 + this.field1647 * 64 - this.field1648 * 64 + arg0;
            int var4 = this.field1652 * 8 - this.field1654 * 8 + this.field1651 * 64 - this.field1650 * 64 + arg1;
            return new class221(this.field1646, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ev.e(Lnu;I)V")
    public void method2388(class382 arg0) {
        this.field1646 = arg0.method5856();
        this.field1649 = arg0.method5856();
        this.field1647 = arg0.method5858();
        this.field1645 = arg0.method5856();
        this.field1651 = arg0.method5858();
        this.field1652 = arg0.method5856();
        this.field1648 = arg0.method5858();
        this.field1653 = arg0.method5856();
        this.field1650 = arg0.method5858();
        this.field1654 = arg0.method5856();
        this.method2674();
    }

    @ObfuscatedName("ev.k(B)V")
    public void method2674() {
    }
}
