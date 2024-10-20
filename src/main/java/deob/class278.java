package deob;

@ObfuscatedName("je")
public class class278 extends class274 {

    @ObfuscatedName("je.f")
    public int field3591;

    @ObfuscatedName("je.f(Lje;I)I")
    public int method4796(class278 arg0) {
        return this.field3591 - arg0.field3591;
    }

    @ObfuscatedName("je.ay(Ljy;S)I")
    public int method4686(class274 arg0) {
        return this.method4796((class278) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4796((class278) arg0);
    }
}
