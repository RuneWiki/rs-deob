package deob;

@ObfuscatedName("ee")
public class class148 extends class286 {

    @ObfuscatedName("ee.c")
    public final boolean field1959;

    public class148(boolean arg0) {
        this.field1959 = arg0;
    }

    @ObfuscatedName("ee.c(Lkx;Lkx;I)I")
    public int method2934(class290 arg0, class290 arg1) {
        if (arg0.field3679 == 0 || arg1.field3679 == 0) {
            return this.method4951(arg0, arg1);
        } else if (this.field1959) {
            return arg0.method4943().method5077(arg1.method4943());
        } else {
            return arg1.method4943().method5077(arg0.method4943());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2934((class290) arg0, (class290) arg1);
    }
}
