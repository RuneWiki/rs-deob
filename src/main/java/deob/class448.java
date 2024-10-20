package deob;

@ObfuscatedName("rr")
public class class448 extends class445 {

    @ObfuscatedName("rr.at")
    public int field4700;

    @ObfuscatedName("rr.at(Lrr;I)I")
    public int method7511(class448 arg0) {
        return this.field4700 - arg0.field4700;
    }

    @ObfuscatedName("rr.ah(Lrf;B)I")
    public int method7381(class445 arg0) {
        return this.method7511((class448) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7511((class448) arg0);
    }
}
