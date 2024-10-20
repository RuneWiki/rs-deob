package deob;

@ObfuscatedName("sn")
public class class474 extends class471 {

    @ObfuscatedName("sn.aq")
    public int field4954;

    @ObfuscatedName("sn.aq(Lsn;I)I")
    public int method7924(class474 arg0) {
        return this.field4954 - arg0.field4954;
    }

    @ObfuscatedName("sn.ad(Lsk;B)I")
    public int method7810(class471 arg0) {
        return this.method7924((class474) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7924((class474) arg0);
    }
}
