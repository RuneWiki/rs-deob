package deob;

@ObfuscatedName("ex")
public class class141 extends class284 {

    @ObfuscatedName("ex.z")
    public final boolean field1884;

    public class141(boolean arg0) {
        this.field1884 = arg0;
    }

    @ObfuscatedName("ex.z(Lkz;Lkz;I)I")
    public int method2917(class288 arg0, class288 arg1) {
        if (client.field582 == arg0.field3629 && client.field582 == arg1.field3629) {
            return this.field1884 ? arg0.field3628 - arg1.field3628 : arg1.field3628 - arg0.field3628;
        } else {
            return this.method4914(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2917((class288) arg0, (class288) arg1);
    }
}
