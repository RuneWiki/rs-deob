package deob;

@ObfuscatedName("kl")
public class class289 extends class285 {

    @ObfuscatedName("kl.f")
    public int field3697;

    @ObfuscatedName("kl.f(Lkl;I)I")
    public int method5102(class289 arg0) {
        return this.field3697 - arg0.field3697;
    }

    @ObfuscatedName("kl.am(Ljb;I)I")
    public int method4995(class285 arg0) {
        return this.method5102((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5102((class289) arg0);
    }
}
