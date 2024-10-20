package deob;

@ObfuscatedName("eb")
public class class155 extends class284 {

    @ObfuscatedName("eb.b")
    public final boolean field2098;

    public class155(boolean arg0) {
        this.field2098 = arg0;
    }

    @ObfuscatedName("eb.b(Lku;Lku;I)I")
    public int method2915(class288 arg0, class288 arg1) {
        if (arg0.field3721 == arg1.field3721) {
            return this.method4811(arg0, arg1);
        } else if (this.field2098) {
            return arg0.field3721 - arg1.field3721;
        } else {
            return arg1.field3721 - arg0.field3721;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2915((class288) arg0, (class288) arg1);
    }
}
