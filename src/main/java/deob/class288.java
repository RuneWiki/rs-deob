package deob;

@ObfuscatedName("kc")
public class class288 extends class284 {

    @ObfuscatedName("kc.m")
    public int field3640;

    @ObfuscatedName("kc.m(Lkc;I)I")
    public int method4891(class288 arg0) {
        return this.field3640 - arg0.field3640;
    }

    @ObfuscatedName("kc.ah(Ljf;I)I")
    public int method4773(class284 arg0) {
        return this.method4891((class288) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4891((class288) arg0);
    }
}
