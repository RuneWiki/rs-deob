package deob;

@ObfuscatedName("fi")
public class class160 extends class275 {

    @ObfuscatedName("fi.a")
    public final boolean field1981;

    public class160(boolean arg0) {
        this.field1981 = arg0;
    }

    @ObfuscatedName("fi.a(Ljx;Ljx;B)I")
    public int method3240(class279 arg0, class279 arg1) {
        if (arg0.field3597 == 0 || arg1.field3597 == 0) {
            return this.method4741(arg0, arg1);
        } else if (this.field1981) {
            return arg0.method4737().method4860(arg1.method4737());
        } else {
            return arg1.method4737().method4860(arg0.method4737());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3240((class279) arg0, (class279) arg1);
    }
}
