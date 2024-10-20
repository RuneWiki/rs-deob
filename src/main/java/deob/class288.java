package deob;

@ObfuscatedName("km")
public class class288 extends class284 {

    @ObfuscatedName("km.x")
    public int field3609;

    @ObfuscatedName("km.x(Lkm;I)I")
    public int method4825(class288 arg0) {
        return this.field3609 - arg0.field3609;
    }

    @ObfuscatedName("km.am(Ljd;I)I")
    public int method4699(class284 arg0) {
        return this.method4825((class288) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4825((class288) arg0);
    }
}
