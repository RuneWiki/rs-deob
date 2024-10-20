package deob;

@ObfuscatedName("oq")
public class class397 extends class394 {

    @ObfuscatedName("oq.h")
    public int field4541;

    @ObfuscatedName("oq.h(Loq;I)I")
    public int method6923(class397 arg0) {
        return this.field4541 - arg0.field4541;
    }

    @ObfuscatedName("oq.e(Lov;I)I")
    public int method6805(class394 arg0) {
        return this.method6923((class397) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6923((class397) arg0);
    }
}
