package deob;

@ObfuscatedName("kt")
public class class301 extends class297 {

    @ObfuscatedName("kt.t")
    public int field3840;

    @ObfuscatedName("kt.t(Lkt;B)I")
    public int method4982(class301 arg0) {
        return this.field3840 - arg0.field3840;
    }

    @ObfuscatedName("kt.aj(Lkv;I)I")
    public int method4859(class297 arg0) {
        return this.method4982((class301) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4982((class301) arg0);
    }
}
