package deob;

@ObfuscatedName("sk")
public class class475 extends class472 {

    @ObfuscatedName("sk.ab")
    public int field4933;

    @ObfuscatedName("sk.ab(Lsk;I)I")
    public int method8029(class475 arg0) {
        return this.field4933 - arg0.field4933;
    }

    @ObfuscatedName("sk.ay(Lsz;I)I")
    public int method7906(class472 arg0) {
        return this.method8029((class475) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method8029((class475) arg0);
    }
}
