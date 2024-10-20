package deob;

@ObfuscatedName("eu")
public class class144 extends class286 {

    @ObfuscatedName("eu.y")
    public final boolean field1932;

    public class144(boolean arg0) {
        this.field1932 = arg0;
    }

    @ObfuscatedName("eu.y(Lkk;Lkk;I)I")
    public int method2916(class290 arg0, class290 arg1) {
        if (arg0.field3686 == 0 || arg1.field3686 == 0) {
            return this.method4980(arg0, arg1);
        } else if (this.field1932) {
            return arg0.field3683 - arg1.field3683;
        } else {
            return arg1.field3683 - arg0.field3683;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2916((class290) arg0, (class290) arg1);
    }
}
