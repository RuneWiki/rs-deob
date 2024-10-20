package deob;

@ObfuscatedName("ew")
public class class155 extends class298 {

    @ObfuscatedName("ew.g")
    public final boolean field2125;

    public class155(boolean arg0) {
        this.field2125 = arg0;
    }

    @ObfuscatedName("ew.g(Lku;Lku;I)I")
    public int method3000(class302 arg0, class302 arg1) {
        if (arg0.field3854 == 0) {
            if (arg1.field3854 != 0) {
                return this.field2125 ? 1 : -1;
            }
        } else if (arg1.field3854 == 0) {
            return this.field2125 ? -1 : 1;
        }
        return this.method4947(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3000((class302) arg0, (class302) arg1);
    }
}
