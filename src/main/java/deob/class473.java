package deob;

@ObfuscatedName("sj")
public class class473 extends class470 {

    @ObfuscatedName("sj.ak")
    public int field4931;

    @ObfuscatedName("sj.ak(Lsj;I)I")
    public int method7985(class473 arg0) {
        return this.field4931 - arg0.field4931;
    }

    @ObfuscatedName("sj.al(Lsg;I)I")
    public int method7852(class470 arg0) {
        return this.method7985((class473) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7985((class473) arg0);
    }
}
