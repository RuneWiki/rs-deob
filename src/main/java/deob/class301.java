package deob;

@ObfuscatedName("ka")
public class class301 extends class297 {

    @ObfuscatedName("ka.g")
    public int field3851;

    @ObfuscatedName("ka.g(Lka;B)I")
    public int method5040(class301 arg0) {
        return this.field3851 - arg0.field3851;
    }

    @ObfuscatedName("ka.ag(Lkg;I)I")
    public int method4932(class297 arg0) {
        return this.method5040((class301) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5040((class301) arg0);
    }
}
