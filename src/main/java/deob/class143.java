package deob;

@ObfuscatedName("er")
public class class143 extends class286 {

    @ObfuscatedName("er.f")
    public final boolean field1925;

    public class143(boolean arg0) {
        this.field1925 = arg0;
    }

    @ObfuscatedName("er.f(Lkd;Lkd;I)I")
    public int method2937(class290 arg0, class290 arg1) {
        if (client.field610 == arg0.field3696 && client.field610 == arg1.field3696) {
            return this.field1925 ? arg0.field3694 - arg1.field3694 : arg1.field3694 - arg0.field3694;
        } else {
            return this.method4946(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2937((class290) arg0, (class290) arg1);
    }
}
