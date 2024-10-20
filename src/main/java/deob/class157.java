package deob;

@ObfuscatedName("fz")
public class class157 extends class275 {

    @ObfuscatedName("fz.s")
    public final boolean field1971;

    public class157(boolean arg0) {
        this.field1971 = arg0;
    }

    @ObfuscatedName("fz.s(Ljt;Ljt;I)I")
    public int method3147(class279 arg0, class279 arg1) {
        if (arg0.field3588 == 0) {
            if (arg1.field3588 != 0) {
                return this.field1971 ? 1 : -1;
            }
        } else if (arg1.field3588 == 0) {
            return this.field1971 ? -1 : 1;
        }
        return this.method4653(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3147((class279) arg0, (class279) arg1);
    }
}
