package deob;

@ObfuscatedName("kl")
public class class301 extends class297 {

    @ObfuscatedName("kl.o")
    public int field3845;

    @ObfuscatedName("kl.o(Lkl;I)I")
    public int method4984(class301 arg0) {
        return this.field3845 - arg0.field3845;
    }

    @ObfuscatedName("kl.at(Lku;I)I")
    public int method4880(class297 arg0) {
        return this.method4984((class301) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4984((class301) arg0);
    }
}
