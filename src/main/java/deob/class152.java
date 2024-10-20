package deob;

@ObfuscatedName("eq")
public class class152 extends class290 {

    @ObfuscatedName("eq.a")
    public final boolean field1974;

    public class152(boolean arg0) {
        this.field1974 = arg0;
    }

    @ObfuscatedName("eq.a(Lkl;Lkl;B)I")
    public int method3160(class294 arg0, class294 arg1) {
        if (arg0.field3711 == arg1.field3711) {
            return this.method5117(arg0, arg1);
        } else if (this.field1974) {
            return arg0.field3711 - arg1.field3711;
        } else {
            return arg1.field3711 - arg0.field3711;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3160((class294) arg0, (class294) arg1);
    }
}
