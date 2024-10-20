package deob;

@ObfuscatedName("ed")
public class class153 extends class275 {

    @ObfuscatedName("ed.f")
    public final boolean field1959;

    public class153(boolean arg0) {
        this.field1959 = arg0;
    }

    @ObfuscatedName("ed.f(Ljt;Ljt;B)I")
    public int method3084(class279 arg0, class279 arg1) {
        if (arg0.field3592 == arg1.field3592) {
            return this.method4697(arg0, arg1);
        } else if (this.field1959) {
            return arg0.field3592 - arg1.field3592;
        } else {
            return arg1.field3592 - arg0.field3592;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3084((class279) arg0, (class279) arg1);
    }
}
