package deob;

@ObfuscatedName("ez")
public class class151 extends class284 {

    @ObfuscatedName("ez.b")
    public final boolean field2082;

    public class151(boolean arg0) {
        this.field2082 = arg0;
    }

    @ObfuscatedName("ez.b(Lku;Lku;I)I")
    public int method2886(class288 arg0, class288 arg1) {
        if (client.field1043 == arg0.field3721) {
            if (client.field1043 != arg1.field3721) {
                return this.field2082 ? -1 : 1;
            }
        } else if (client.field1043 == arg1.field3721) {
            return this.field2082 ? 1 : -1;
        }
        return this.method4811(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2886((class288) arg0, (class288) arg1);
    }
}
