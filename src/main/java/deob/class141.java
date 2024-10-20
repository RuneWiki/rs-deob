package deob;

@ObfuscatedName("eh")
public class class141 extends class286 {

    @ObfuscatedName("eh.y")
    public final boolean field1923;

    public class141(boolean arg0) {
        this.field1923 = arg0;
    }

    @ObfuscatedName("eh.y(Lkk;Lkk;I)I")
    public int method2902(class290 arg0, class290 arg1) {
        if (client.field627 == arg0.field3686 && client.field627 == arg1.field3686) {
            return this.field1923 ? arg0.method4962().method5080(arg1.method4962()) : arg1.method4962().method5080(arg0.method4962());
        } else {
            return this.method4980(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2902((class290) arg0, (class290) arg1);
    }
}
