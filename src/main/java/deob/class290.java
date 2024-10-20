package deob;

@ObfuscatedName("ks")
public class class290 extends class286 {

    @ObfuscatedName("ks.m")
    public int field3699;

    @ObfuscatedName("ks.m(Lks;I)I")
    public int method5110(class290 arg0) {
        return this.field3699 - arg0.field3699;
    }

    @ObfuscatedName("ks.aj(Ljs;I)I")
    public int method4991(class286 arg0) {
        return this.method5110((class290) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5110((class290) arg0);
    }
}
