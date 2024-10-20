package deob;

@ObfuscatedName("ee")
public class class148 extends class286 {

    @ObfuscatedName("ee.y")
    public final boolean field1949;

    public class148(boolean arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("ee.y(Lkk;Lkk;I)I")
    public int method2947(class290 arg0, class290 arg1) {
        if (arg0.field3686 == 0 || arg1.field3686 == 0) {
            return this.method4980(arg0, arg1);
        } else if (this.field1949) {
            return arg0.method4962().method5080(arg1.method4962());
        } else {
            return arg1.method4962().method5080(arg0.method4962());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2947((class290) arg0, (class290) arg1);
    }
}
