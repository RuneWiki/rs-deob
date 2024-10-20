package deob;

@ObfuscatedName("mo")
public class class341 extends class338 {

    @ObfuscatedName("mo.l")
    public int field3972;

    @ObfuscatedName("mo.l(Lmo;I)I")
    public int method5606(class341 arg0) {
        return this.field3972 - arg0.field3972;
    }

    @ObfuscatedName("mo.q(Llu;B)I")
    public int method5482(class338 arg0) {
        return this.method5606((class341) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5606((class341) arg0);
    }
}
