package deob;

@ObfuscatedName("ex")
public class class141 extends class286 {

    @ObfuscatedName("ex.f")
    public final boolean field1930;

    public class141(boolean arg0) {
        this.field1930 = arg0;
    }

    @ObfuscatedName("ex.f(Lkj;Lkj;I)I")
    public int method2964(class290 arg0, class290 arg1) {
        if (client.field683 == arg0.field3703 && client.field683 == arg1.field3703) {
            return this.field1930 ? arg0.method5002().method5149(arg1.method5002()) : arg1.method5002().method5149(arg0.method5002());
        } else {
            return this.method5014(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2964((class290) arg0, (class290) arg1);
    }
}
