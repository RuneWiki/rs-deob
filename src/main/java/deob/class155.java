package deob;

@ObfuscatedName("eu")
public class class155 extends class298 {

    @ObfuscatedName("eu.o")
    public final boolean field2159;

    public class155(boolean arg0) {
        this.field2159 = arg0;
    }

    @ObfuscatedName("eu.o(Lkv;Lkv;I)I")
    public int method2900(class302 arg0, class302 arg1) {
        if (arg0.field3848 == 0) {
            if (arg1.field3848 != 0) {
                return this.field2159 ? 1 : -1;
            }
        } else if (arg1.field3848 == 0) {
            return this.field2159 ? -1 : 1;
        }
        return this.method4894(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2900((class302) arg0, (class302) arg1);
    }
}
