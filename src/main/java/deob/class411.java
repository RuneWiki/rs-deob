package deob;

@ObfuscatedName("pi")
public class class411 extends class408 {

    @ObfuscatedName("pi.af")
    public int field4595;

    @ObfuscatedName("pi.af(Lpi;B)I")
    public int method7269(class411 arg0) {
        return this.field4595 - arg0.field4595;
    }

    @ObfuscatedName("pi.an(Lpw;I)I")
    public int method7139(class408 arg0) {
        return this.method7269((class411) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7269((class411) arg0);
    }
}
