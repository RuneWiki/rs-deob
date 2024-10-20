package deob;

@ObfuscatedName("lt")
public class class327 extends class324 {

    @ObfuscatedName("lt.s")
    public int field3863;

    @ObfuscatedName("lt.s(Llt;I)I")
    public int method5292(class327 arg0) {
        return this.field3863 - arg0.field3863;
    }

    @ObfuscatedName("lt.t(Llm;I)I")
    public int method5167(class324 arg0) {
        return this.method5292((class327) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5292((class327) arg0);
    }
}
