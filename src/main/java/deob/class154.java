package deob;

@ObfuscatedName("en")
public class class154 extends class298 {

    @ObfuscatedName("en.d")
    public final boolean field2127;

    public class154(boolean arg0) {
        this.field2127 = arg0;
    }

    @ObfuscatedName("en.d(Lkz;Lkz;I)I")
    public int method2958(class302 arg0, class302 arg1) {
        if (arg0.field3840 == 0 || arg1.field3840 == 0) {
            return this.method4977(arg0, arg1);
        } else if (this.field2127) {
            return arg0.field3841 - arg1.field3841;
        } else {
            return arg1.field3841 - arg0.field3841;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2958((class302) arg0, (class302) arg1);
    }
}
