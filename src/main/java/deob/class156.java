package deob;

@ObfuscatedName("ep")
public class class156 extends class287 {

    @ObfuscatedName("ep.m")
    public final boolean field1963;

    public class156(boolean arg0) {
        this.field1963 = arg0;
    }

    @ObfuscatedName("ep.m(Lke;Lke;B)I")
    public int method3088(class291 arg0, class291 arg1) {
        if (arg0.field3703 == 0) {
            if (arg1.field3703 != 0) {
                return this.field1963 ? 1 : -1;
            }
        } else if (arg1.field3703 == 0) {
            return this.field1963 ? -1 : 1;
        }
        return this.method5011(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3088((class291) arg0, (class291) arg1);
    }
}
