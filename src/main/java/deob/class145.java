package deob;

@ObfuscatedName("eg")
public class class145 extends class284 {

    @ObfuscatedName("eg.z")
    public final boolean field1903;

    public class145(boolean arg0) {
        this.field1903 = arg0;
    }

    @ObfuscatedName("eg.z(Lkz;Lkz;B)I")
    public int method2945(class288 arg0, class288 arg1) {
        if (arg0.field3630 == arg1.field3630) {
            return this.method4914(arg0, arg1);
        } else if (this.field1903) {
            return arg0.field3630 - arg1.field3630;
        } else {
            return arg1.field3630 - arg0.field3630;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2945((class288) arg0, (class288) arg1);
    }
}
