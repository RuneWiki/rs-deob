package deob;

@ObfuscatedName("rn")
public class class456 extends class453 {

    @ObfuscatedName("rn.az")
    public int field4803;

    @ObfuscatedName("rn.az(Lrn;I)I")
    public int method7530(class456 arg0) {
        return this.field4803 - arg0.field4803;
    }

    @ObfuscatedName("rn.ah(Lrr;B)I")
    public int method7403(class453 arg0) {
        return this.method7530((class456) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7530((class456) arg0);
    }
}
