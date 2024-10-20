package deob;

@ObfuscatedName("qt")
public class class424 extends class421 {

    @ObfuscatedName("qt.at")
    public int field4610;

    @ObfuscatedName("qt.at(Lqt;I)I")
    public int method7244(class424 arg0) {
        return this.field4610 - arg0.field4610;
    }

    @ObfuscatedName("qt.an(Lqm;I)I")
    public int method7110(class421 arg0) {
        return this.method7244((class424) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7244((class424) arg0);
    }
}
