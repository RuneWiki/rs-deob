package deob;

@ObfuscatedName("mi")
public class class353 extends class350 {

    @ObfuscatedName("mi.c")
    public int field4118;

    @ObfuscatedName("mi.c(Lmi;B)I")
    public int method5858(class353 arg0) {
        return this.field4118 - arg0.field4118;
    }

    @ObfuscatedName("mi.b(Lmv;I)I")
    public int method5718(class350 arg0) {
        return this.method5858((class353) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5858((class353) arg0);
    }
}
