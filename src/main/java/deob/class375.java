package deob;

@ObfuscatedName("nv")
public class class375 extends class372 {

    @ObfuscatedName("nv.s")
    public int field4323;

    @ObfuscatedName("nv.s(Lnv;I)I")
    public int method6091(class375 arg0) {
        return this.field4323 - arg0.field4323;
    }

    @ObfuscatedName("nv.h(Lnb;I)I")
    public int method5970(class372 arg0) {
        return this.method6091((class375) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6091((class375) arg0);
    }
}
