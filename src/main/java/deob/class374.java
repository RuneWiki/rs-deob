package deob;

@ObfuscatedName("nb")
public class class374 extends class371 {

    @ObfuscatedName("nb.c")
    public int field4323;

    @ObfuscatedName("nb.c(Lnb;I)I")
    public int method6173(class374 arg0) {
        return this.field4323 - arg0.field4323;
    }

    @ObfuscatedName("nb.v(Lne;B)I")
    public int method6033(class371 arg0) {
        return this.method6173((class374) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6173((class374) arg0);
    }
}
