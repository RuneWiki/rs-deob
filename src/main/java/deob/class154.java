package deob;

@ObfuscatedName("ep")
public class class154 extends class284 {

    @ObfuscatedName("ep.b")
    public final boolean field2095;

    public class154(boolean arg0) {
        this.field2095 = arg0;
    }

    @ObfuscatedName("ep.b(Lku;Lku;I)I")
    public int method2904(class288 arg0, class288 arg1) {
        if (arg0.field3721 == 0) {
            if (arg1.field3721 != 0) {
                return this.field2095 ? 1 : -1;
            }
        } else if (arg1.field3721 == 0) {
            return this.field2095 ? -1 : 1;
        }
        return this.method4811(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2904((class288) arg0, (class288) arg1);
    }
}
