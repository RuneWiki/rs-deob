package deob;

@ObfuscatedName("kh")
public class class289 extends class285 {

    @ObfuscatedName("kh.y")
    public int field3681;

    @ObfuscatedName("kh.y(Lkh;I)I")
    public int method5054(class289 arg0) {
        return this.field3681 - arg0.field3681;
    }

    @ObfuscatedName("kh.h(Ljd;B)I")
    public int method4963(class285 arg0) {
        return this.method5054((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5054((class289) arg0);
    }
}
