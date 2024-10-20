package deob;

@ObfuscatedName("fg")
public class class169 extends class285 {

    @ObfuscatedName("fg.z")
    public final boolean field2038;

    public class169(boolean arg0) {
        this.field2038 = arg0;
    }

    @ObfuscatedName("fg.z(Lko;Lko;I)I")
    public int method3259(class289 arg0, class289 arg1) {
        if (arg0.field3632 == 0 || arg1.field3632 == 0) {
            return this.method4783(arg0, arg1);
        } else if (this.field2038) {
            return arg0.method4757().method4890(arg1.method4757());
        } else {
            return arg1.method4757().method4890(arg0.method4757());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3259((class289) arg0, (class289) arg1);
    }
}
