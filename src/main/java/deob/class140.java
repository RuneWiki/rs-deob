package deob;

@ObfuscatedName("ec")
public class class140 extends class284 {

    @ObfuscatedName("ec.z")
    public final boolean field1882;

    public class140(boolean arg0) {
        this.field1882 = arg0;
    }

    @ObfuscatedName("ec.z(Lkz;Lkz;B)I")
    public int method2909(class288 arg0, class288 arg1) {
        if (client.field582 == arg0.field3629) {
            if (client.field582 != arg1.field3629) {
                return this.field1882 ? -1 : 1;
            }
        } else if (client.field582 == arg1.field3629) {
            return this.field1882 ? 1 : -1;
        }
        return this.method4914(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2909((class288) arg0, (class288) arg1);
    }
}
