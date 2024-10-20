package deob;

@ObfuscatedName("cv")
public class class96 extends class325 {

    @ObfuscatedName("cv.s")
    public final boolean field1256;

    public class96(boolean arg0) {
        this.field1256 = arg0;
    }

    @ObfuscatedName("cv.s(Llr;Llr;I)I")
    public int method2084(class328 arg0, class328 arg1) {
        if (arg0.field3866 == arg1.field3866) {
            return this.method5216(arg0, arg1);
        } else if (this.field1256) {
            return arg0.field3866 - arg1.field3866;
        } else {
            return arg1.field3866 - arg0.field3866;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2084((class328) arg0, (class328) arg1);
    }
}
