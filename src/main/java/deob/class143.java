package deob;

@ObfuscatedName("eb")
public class class143 extends class286 {

    @ObfuscatedName("eb.f")
    public final boolean field1936;

    public class143(boolean arg0) {
        this.field1936 = arg0;
    }

    @ObfuscatedName("eb.f(Lkj;Lkj;B)I")
    public int method2980(class290 arg0, class290 arg1) {
        if (client.field683 == arg0.field3703 && client.field683 == arg1.field3703) {
            return this.field1936 ? arg0.field3700 - arg1.field3700 : arg1.field3700 - arg0.field3700;
        } else {
            return this.method5014(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2980((class290) arg0, (class290) arg1);
    }
}
