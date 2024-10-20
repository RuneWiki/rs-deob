package deob;

@ObfuscatedName("ry")
public class class451 extends class448 {

    @ObfuscatedName("ry.ac")
    public int field4710;

    @ObfuscatedName("ry.ac(Lry;B)I")
    public int method7423(class451 arg0) {
        return this.field4710 - arg0.field4710;
    }

    @ObfuscatedName("ry.al(Lrp;I)I")
    public int method7303(class448 arg0) {
        return this.method7423((class451) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7423((class451) arg0);
    }
}
