package deob;

@ObfuscatedName("mm")
public class class341 extends class338 {

    @ObfuscatedName("mm.i")
    public int field3961;

    @ObfuscatedName("mm.i(Lmm;I)I")
    public int method5575(class341 arg0) {
        return this.field3961 - arg0.field3961;
    }

    @ObfuscatedName("mm.w(Lla;I)I")
    public int method5447(class338 arg0) {
        return this.method5575((class341) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5575((class341) arg0);
    }
}
