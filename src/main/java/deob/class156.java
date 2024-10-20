package deob;

@ObfuscatedName("ey")
public class class156 extends class284 {

    @ObfuscatedName("ey.b")
    public final boolean field2103;

    public class156(boolean arg0) {
        this.field2103 = arg0;
    }

    @ObfuscatedName("ey.b(Lku;Lku;I)I")
    public int method2918(class288 arg0, class288 arg1) {
        if (arg0.field3720 == arg1.field3720) {
            return this.method4811(arg0, arg1);
        } else if (this.field2103) {
            return arg0.field3720 - arg1.field3720;
        } else {
            return arg1.field3720 - arg0.field3720;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2918((class288) arg0, (class288) arg1);
    }
}
