package deob;

@ObfuscatedName("lz")
public class class324 extends class321 {

    @ObfuscatedName("lz.f")
    public int field3849;

    @ObfuscatedName("lz.f(Llz;S)I")
    public int method5185(class324 arg0) {
        return this.field3849 - arg0.field3849;
    }

    @ObfuscatedName("lz.o(Llt;I)I")
    public int method5062(class321 arg0) {
        return this.method5185((class324) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5185((class324) arg0);
    }
}
