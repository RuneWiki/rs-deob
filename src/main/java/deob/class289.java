package deob;

@ObfuscatedName("ke")
public class class289 extends class285 {

    @ObfuscatedName("ke.n")
    public int field3642;

    @ObfuscatedName("ke.n(Lke;I)I")
    public int method4943(class289 arg0) {
        return this.field3642 - arg0.field3642;
    }

    @ObfuscatedName("ke.at(Ljn;I)I")
    public int method4844(class285 arg0) {
        return this.method4943((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4943((class289) arg0);
    }
}
