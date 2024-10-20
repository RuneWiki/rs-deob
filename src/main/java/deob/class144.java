package deob;

@ObfuscatedName("ei")
public class class144 extends class284 {

    @ObfuscatedName("ei.z")
    public final boolean field1894;

    public class144(boolean arg0) {
        this.field1894 = arg0;
    }

    @ObfuscatedName("ei.z(Lkz;Lkz;B)I")
    public int method2935(class288 arg0, class288 arg1) {
        if (arg0.field3629 == arg1.field3629) {
            return this.method4914(arg0, arg1);
        } else if (this.field1894) {
            return arg0.field3629 - arg1.field3629;
        } else {
            return arg1.field3629 - arg0.field3629;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2935((class288) arg0, (class288) arg1);
    }
}
