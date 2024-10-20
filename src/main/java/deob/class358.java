package deob;

@ObfuscatedName("mo")
public class class358 extends class355 {

    @ObfuscatedName("mo.c")
    public int field4170;

    @ObfuscatedName("mo.c(Lmo;B)I")
    public int method5858(class358 arg0) {
        return this.field4170 - arg0.field4170;
    }

    @ObfuscatedName("mo.l(Lmy;I)I")
    public int method5701(class355 arg0) {
        return this.method5858((class358) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5858((class358) arg0);
    }
}
