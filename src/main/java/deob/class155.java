package deob;

@ObfuscatedName("ea")
public class class155 extends class298 {

    @ObfuscatedName("ea.c")
    public final boolean field2136;

    public class155(boolean arg0) {
        this.field2136 = arg0;
    }

    @ObfuscatedName("ea.c(Lke;Lke;I)I")
    public int method2929(class302 arg0, class302 arg1) {
        if (arg0.field3841 == 0) {
            if (arg1.field3841 != 0) {
                return this.field2136 ? 1 : -1;
            }
        } else if (arg1.field3841 == 0) {
            return this.field2136 ? -1 : 1;
        }
        return this.method4912(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2929((class302) arg0, (class302) arg1);
    }
}
