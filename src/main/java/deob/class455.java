package deob;

@ObfuscatedName("rb")
public class class455 extends class452 {

    @ObfuscatedName("rb.aq")
    public int field4768;

    @ObfuscatedName("rb.aq(Lrb;I)I")
    public int method7651(class455 arg0) {
        return this.field4768 - arg0.field4768;
    }

    @ObfuscatedName("rb.aw(Lra;B)I")
    public int method7534(class452 arg0) {
        return this.method7651((class455) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7651((class455) arg0);
    }
}
