package deob;

@ObfuscatedName("em")
public class class148 extends class286 {

    @ObfuscatedName("em.f")
    public final boolean field1964;

    public class148(boolean arg0) {
        this.field1964 = arg0;
    }

    @ObfuscatedName("em.f(Lkj;Lkj;I)I")
    public int method3021(class290 arg0, class290 arg1) {
        if (arg0.field3703 == 0 || arg1.field3703 == 0) {
            return this.method5014(arg0, arg1);
        } else if (this.field1964) {
            return arg0.method5002().method5149(arg1.method5002());
        } else {
            return arg1.method5002().method5149(arg0.method5002());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3021((class290) arg0, (class290) arg1);
    }
}
