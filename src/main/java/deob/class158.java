package deob;

@ObfuscatedName("fl")
public class class158 extends class275 {

    @ObfuscatedName("fl.u")
    public final boolean field1992;

    public class158(boolean arg0) {
        this.field1992 = arg0;
    }

    @ObfuscatedName("fl.u(Ljt;Ljt;I)I")
    public int method3173(class279 arg0, class279 arg1) {
        if (arg0.field3614 == arg1.field3614) {
            return this.method4723(arg0, arg1);
        } else if (this.field1992) {
            return arg0.field3614 - arg1.field3614;
        } else {
            return arg1.field3614 - arg0.field3614;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3173((class279) arg0, (class279) arg1);
    }
}
