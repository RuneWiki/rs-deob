package deob;

@ObfuscatedName("ji")
public class class278 extends class274 {

    @ObfuscatedName("ji.a")
    public int field3595;

    @ObfuscatedName("ji.a(Lji;B)I")
    public int method4822(class278 arg0) {
        return this.field3595 - arg0.field3595;
    }

    @ObfuscatedName("ji.av(Ljg;I)I")
    public int method4715(class274 arg0) {
        return this.method4822((class278) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4822((class278) arg0);
    }
}
