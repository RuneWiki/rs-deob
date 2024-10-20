package deob;

@ObfuscatedName("ev")
public class class155 extends class298 {

    @ObfuscatedName("ev.d")
    public final boolean field2132;

    public class155(boolean arg0) {
        this.field2132 = arg0;
    }

    @ObfuscatedName("ev.d(Lkz;Lkz;B)I")
    public int method2963(class302 arg0, class302 arg1) {
        if (arg0.field3840 == 0) {
            if (arg1.field3840 != 0) {
                return this.field2132 ? 1 : -1;
            }
        } else if (arg1.field3840 == 0) {
            return this.field2132 ? -1 : 1;
        }
        return this.method4977(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2963((class302) arg0, (class302) arg1);
    }
}
