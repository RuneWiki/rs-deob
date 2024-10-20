package deob;

@ObfuscatedName("ml")
public class class340 extends class337 {

    @ObfuscatedName("ml.n")
    public int field3961;

    @ObfuscatedName("ml.n(Lml;I)I")
    public int method5554(class340 arg0) {
        return this.field3961 - arg0.field3961;
    }

    @ObfuscatedName("ml.c(Lle;I)I")
    public int method5424(class337 arg0) {
        return this.method5554((class340) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5554((class340) arg0);
    }
}
