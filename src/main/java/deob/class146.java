package deob;

@ObfuscatedName("er")
public class class146 extends class286 {

    @ObfuscatedName("er.y")
    public final boolean field1942;

    public class146(boolean arg0) {
        this.field1942 = arg0;
    }

    @ObfuscatedName("er.y(Lkk;Lkk;I)I")
    public int method2929(class290 arg0, class290 arg1) {
        if (arg0.field3686 == arg1.field3686) {
            return this.method4980(arg0, arg1);
        } else if (this.field1942) {
            return arg0.field3686 - arg1.field3686;
        } else {
            return arg1.field3686 - arg0.field3686;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2929((class290) arg0, (class290) arg1);
    }
}
