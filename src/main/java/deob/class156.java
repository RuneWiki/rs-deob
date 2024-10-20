package deob;

@ObfuscatedName("eg")
public class class156 extends class298 {

    @ObfuscatedName("eg.d")
    public final boolean field2134;

    public class156(boolean arg0) {
        this.field2134 = arg0;
    }

    @ObfuscatedName("eg.d(Lkz;Lkz;B)I")
    public int method2974(class302 arg0, class302 arg1) {
        if (arg0.field3840 == arg1.field3840) {
            return this.method4977(arg0, arg1);
        } else if (this.field2134) {
            return arg0.field3840 - arg1.field3840;
        } else {
            return arg1.field3840 - arg0.field3840;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2974((class302) arg0, (class302) arg1);
    }
}
