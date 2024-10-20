package deob;

@ObfuscatedName("lq")
public class class326 extends class323 {

    @ObfuscatedName("lq.f")
    public int field3845;

    @ObfuscatedName("lq.f(Llq;I)I")
    public int method5253(class326 arg0) {
        return this.field3845 - arg0.field3845;
    }

    @ObfuscatedName("lq.e(Llf;I)I")
    public int method5145(class323 arg0) {
        return this.method5253((class326) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5253((class326) arg0);
    }
}
