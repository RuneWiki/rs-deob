package deob;

@ObfuscatedName("pc")
public class class407 extends class404 {

    @ObfuscatedName("pc.aj")
    public int field4531;

    @ObfuscatedName("pc.aj(Lpc;I)I")
    public int method7020(class407 arg0) {
        return this.field4531 - arg0.field4531;
    }

    @ObfuscatedName("pc.al(Lpb;I)I")
    public int method6896(class404 arg0) {
        return this.method7020((class407) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7020((class407) arg0);
    }
}
