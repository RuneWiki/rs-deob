package deob;

@ObfuscatedName("jn")
public class class278 extends class274 {

    @ObfuscatedName("jn.z")
    public int field3595;

    @ObfuscatedName("jn.z(Ljn;I)I")
    public int method4682(class278 arg0) {
        return this.field3595 - arg0.field3595;
    }

    @ObfuscatedName("jn.l(Ljh;I)I")
    public int method4578(class274 arg0) {
        return this.method4682((class278) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4682((class278) arg0);
    }
}
