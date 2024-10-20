package deob;

@ObfuscatedName("en")
public class class143 implements class164 {

    @ObfuscatedName("en.f")
    public int field1590;

    @ObfuscatedName("en.o")
    public int field1583;

    @ObfuscatedName("en.u")
    public int field1591;

    @ObfuscatedName("en.p")
    public int field1587;

    @ObfuscatedName("en.b")
    public int field1586;

    @ObfuscatedName("en.e")
    public int field1582;

    @ObfuscatedName("en.k")
    public int field1588;

    @ObfuscatedName("en.g")
    public int field1589;

    @ObfuscatedName("en.h")
    public int field1584;

    @ObfuscatedName("en.n")
    public int field1585;

    @ObfuscatedName("en.f(Leq;I)V")
    public void method2409(class144 arg0) {
        if (arg0.field1600 > this.field1588) {
            arg0.field1600 = this.field1588;
        }
        if (arg0.field1601 < this.field1584) {
            arg0.field1601 = this.field1584;
        }
        if (arg0.field1602 > this.field1589) {
            arg0.field1602 = this.field1589;
        }
        if (arg0.field1594 < this.field1585) {
            arg0.field1594 = this.field1585;
        }
    }

    @ObfuscatedName("en.o(IIII)Z")
    public boolean method2392(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field1590 && arg0 < this.field1590 + this.field1583) {
            return arg1 >> 6 >= this.field1591 && arg1 >> 6 <= this.field1586 && arg2 >> 6 >= this.field1587 && arg2 >> 6 <= this.field1582;
        } else {
            return false;
        }
    }

    @ObfuscatedName("en.u(III)Z")
    public boolean method2390(int arg0, int arg1) {
        return arg0 >> 6 >= this.field1588 && arg0 >> 6 <= this.field1584 && arg1 >> 6 >= this.field1589 && arg1 >> 6 <= this.field1585;
    }

    @ObfuscatedName("en.p(IIII)[I")
    public int[] method2391(int arg0, int arg1, int arg2) {
        return this.method2392(arg0, arg1, arg2) ? new int[] { this.field1588 * 64 - this.field1591 * 64 + arg1, this.field1589 * 64 - this.field1587 * 64 + arg2 } : null;
    }

    @ObfuscatedName("en.b(III)Lhk;")
    public class221 method2387(int arg0, int arg1) {
        if (this.method2390(arg0, arg1)) {
            int var3 = this.field1591 * 64 - this.field1588 * 64 + arg0;
            int var4 = this.field1587 * 64 - this.field1589 * 64 + arg1;
            return new class221(this.field1590, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("en.e(Lnu;I)V")
    public void method2388(class382 arg0) {
        this.field1590 = arg0.method5856();
        this.field1583 = arg0.method5856();
        this.field1591 = arg0.method5858();
        this.field1587 = arg0.method5858();
        this.field1586 = arg0.method5858();
        this.field1582 = arg0.method5858();
        this.field1588 = arg0.method5858();
        this.field1589 = arg0.method5858();
        this.field1584 = arg0.method5858();
        this.field1585 = arg0.method5858();
        this.method2394();
    }

    @ObfuscatedName("en.k(I)V")
    public void method2394() {
    }
}
