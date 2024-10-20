package deob;

@ObfuscatedName("fc")
public class class167 extends class285 {

    @ObfuscatedName("fc.z")
    public final boolean field2030;

    public class167(boolean arg0) {
        this.field2030 = arg0;
    }

    @ObfuscatedName("fc.z(Lko;Lko;B)I")
    public int method3248(class289 arg0, class289 arg1) {
        if (arg0.field3632 == arg1.field3632) {
            return this.method4783(arg0, arg1);
        } else if (this.field2030) {
            return arg0.field3632 - arg1.field3632;
        } else {
            return arg1.field3632 - arg0.field3632;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3248((class289) arg0, (class289) arg1);
    }
}
