package deob;

@ObfuscatedName("sr")
public class class478 extends class475 {

    @ObfuscatedName("sr.ap")
    public int field5020;

    @ObfuscatedName("sr.ap(Lsr;B)I")
    public int method8427(class478 arg0) {
        return this.field5020 - arg0.field5020;
    }

    @ObfuscatedName("sr.aw(Lse;S)I")
    public int method8303(class475 arg0) {
        return this.method8427((class478) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method8427((class478) arg0);
    }
}
