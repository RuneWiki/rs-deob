package deob;

@ObfuscatedName("nz")
public class class375 extends class372 {

    @ObfuscatedName("nz.o")
    public int field4333;

    @ObfuscatedName("nz.o(Lnz;B)I")
    public int method6085(class375 arg0) {
        return this.field4333 - arg0.field4333;
    }

    @ObfuscatedName("nz.q(Lnb;I)I")
    public int method5974(class372 arg0) {
        return this.method6085((class375) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6085((class375) arg0);
    }
}
