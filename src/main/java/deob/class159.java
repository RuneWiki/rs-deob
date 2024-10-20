package deob;

@ObfuscatedName("fd")
public class class159 extends class275 {

    @ObfuscatedName("fd.z")
    public final boolean field1974;

    public class159(boolean arg0) {
        this.field1974 = arg0;
    }

    @ObfuscatedName("fd.z(Ljl;Ljl;I)I")
    public int method3097(class279 arg0, class279 arg1) {
        if (arg0.field3599 == arg1.field3599) {
            return this.method4596(arg0, arg1);
        } else if (this.field1974) {
            return arg0.field3599 - arg1.field3599;
        } else {
            return arg1.field3599 - arg0.field3599;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3097((class279) arg0, (class279) arg1);
    }
}
