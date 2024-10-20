package deob;

@ObfuscatedName("jo")
public class class279 extends class275 {

    @ObfuscatedName("jo.q")
    public int field3631;

    @ObfuscatedName("jo.q(Ljo;I)I")
    public int method4763(class279 arg0) {
        return this.field3631 - arg0.field3631;
    }

    @ObfuscatedName("jo.ax(Ljd;I)I")
    public int method4660(class275 arg0) {
        return this.method4763((class279) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4763((class279) arg0);
    }
}
