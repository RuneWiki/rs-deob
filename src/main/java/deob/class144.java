package deob;

@ObfuscatedName("eb")
public class class144 extends class286 {

    @ObfuscatedName("eb.v")
    public final boolean field1939;

    public class144(boolean arg0) {
        this.field1939 = arg0;
    }

    @ObfuscatedName("eb.v(Lkx;Lkx;I)I")
    public int method2918(class290 arg0, class290 arg1) {
        if (arg0.field3664 == 0 || arg1.field3664 == 0) {
            return this.method4967(arg0, arg1);
        } else if (this.field1939) {
            return arg0.field3662 - arg1.field3662;
        } else {
            return arg1.field3662 - arg0.field3662;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2918((class290) arg0, (class290) arg1);
    }
}
