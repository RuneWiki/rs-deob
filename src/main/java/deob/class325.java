package deob;

@ObfuscatedName("la")
public class class325 extends class322 {

    @ObfuscatedName("la.v")
    public int field3849;

    @ObfuscatedName("la.v(Lla;I)I")
    public int method5322(class325 arg0) {
        return this.field3849 - arg0.field3849;
    }

    @ObfuscatedName("la.n(Llx;I)I")
    public int method5188(class322 arg0) {
        return this.method5322((class325) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5322((class325) arg0);
    }
}
