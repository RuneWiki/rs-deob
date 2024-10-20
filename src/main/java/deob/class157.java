package deob;

@ObfuscatedName("ft")
public class class157 extends class275 {

    @ObfuscatedName("ft.a")
    public final boolean field1972;

    public class157(boolean arg0) {
        this.field1972 = arg0;
    }

    @ObfuscatedName("ft.a(Ljx;Ljx;I)I")
    public int method3214(class279 arg0, class279 arg1) {
        if (arg0.field3597 == 0) {
            if (arg1.field3597 != 0) {
                return this.field1972 ? 1 : -1;
            }
        } else if (arg1.field3597 == 0) {
            return this.field1972 ? -1 : 1;
        }
        return this.method4741(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3214((class279) arg0, (class279) arg1);
    }
}
