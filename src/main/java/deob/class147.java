package deob;

@ObfuscatedName("eo")
public class class147 extends class286 {

    @ObfuscatedName("eo.y")
    public final boolean field1948;

    public class147(boolean arg0) {
        this.field1948 = arg0;
    }

    @ObfuscatedName("eo.y(Lkk;Lkk;I)I")
    public int method2936(class290 arg0, class290 arg1) {
        if (arg0.field3685 == arg1.field3685) {
            return this.method4980(arg0, arg1);
        } else if (this.field1948) {
            return arg0.field3685 - arg1.field3685;
        } else {
            return arg1.field3685 - arg0.field3685;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2936((class290) arg0, (class290) arg1);
    }
}
