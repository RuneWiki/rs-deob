package deob;

@ObfuscatedName("ji")
public class class278 extends class274 {

    @ObfuscatedName("ji.u")
    public int field3609;

    @ObfuscatedName("ji.u(Lji;I)I")
    public int method4813(class278 arg0) {
        return this.field3609 - arg0.field3609;
    }

    @ObfuscatedName("ji.v(Ljr;B)I")
    public int method4709(class274 arg0) {
        return this.method4813((class278) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4813((class278) arg0);
    }
}
