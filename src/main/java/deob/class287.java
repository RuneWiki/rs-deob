package deob;

@ObfuscatedName("kj")
public class class287 extends class283 {

    @ObfuscatedName("kj.w")
    public int field3647;

    @ObfuscatedName("kj.w(Lkj;I)I")
    public int method5025(class287 arg0) {
        return this.field3647 - arg0.field3647;
    }

    @ObfuscatedName("kj.aw(Ljn;I)I")
    public int method4914(class283 arg0) {
        return this.method5025((class287) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5025((class287) arg0);
    }
}
