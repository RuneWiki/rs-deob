package deob;

@ObfuscatedName("fv")
public class class160 extends class275 {

    @ObfuscatedName("fv.u")
    public final boolean field2001;

    public class160(boolean arg0) {
        this.field2001 = arg0;
    }

    @ObfuscatedName("fv.u(Ljt;Ljt;B)I")
    public int method3184(class279 arg0, class279 arg1) {
        if (arg0.field3614 == 0 || arg1.field3614 == 0) {
            return this.method4723(arg0, arg1);
        } else if (this.field2001) {
            return arg0.method4716().method4848(arg1.method4716());
        } else {
            return arg1.method4716().method4848(arg0.method4716());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3184((class279) arg0, (class279) arg1);
    }
}
