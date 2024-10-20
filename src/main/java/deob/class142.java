package deob;

@ObfuscatedName("ea")
public class class142 extends class284 {

    @ObfuscatedName("ea.z")
    public final boolean field1887;

    public class142(boolean arg0) {
        this.field1887 = arg0;
    }

    @ObfuscatedName("ea.z(Lkz;Lkz;I)I")
    public int method2923(class288 arg0, class288 arg1) {
        if (arg0.field3629 == 0 || arg1.field3629 == 0) {
            return this.method4914(arg0, arg1);
        } else if (this.field1887) {
            return arg0.field3628 - arg1.field3628;
        } else {
            return arg1.field3628 - arg0.field3628;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2923((class288) arg0, (class288) arg1);
    }
}
