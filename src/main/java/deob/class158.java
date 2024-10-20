package deob;

@ObfuscatedName("fq")
public class class158 extends class298 {

    @ObfuscatedName("fq.d")
    public final boolean field2139;

    public class158(boolean arg0) {
        this.field2139 = arg0;
    }

    @ObfuscatedName("fq.d(Lkz;Lkz;S)I")
    public int method2981(class302 arg0, class302 arg1) {
        if (arg0.field3840 == 0 || arg1.field3840 == 0) {
            return this.method4977(arg0, arg1);
        } else if (this.field2139) {
            return arg0.method4975().method5099(arg1.method4975());
        } else {
            return arg1.method4975().method5099(arg0.method4975());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2981((class302) arg0, (class302) arg1);
    }
}
