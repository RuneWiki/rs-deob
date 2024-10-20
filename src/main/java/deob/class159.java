package deob;

@ObfuscatedName("fi")
public class class159 extends class275 {

    @ObfuscatedName("fi.s")
    public final boolean field1977;

    public class159(boolean arg0) {
        this.field1977 = arg0;
    }

    @ObfuscatedName("fi.s(Ljt;Ljt;I)I")
    public int method3156(class279 arg0, class279 arg1) {
        if (arg0.field3592 == arg1.field3592) {
            return this.method4653(arg0, arg1);
        } else if (this.field1977) {
            return arg0.field3592 - arg1.field3592;
        } else {
            return arg1.field3592 - arg0.field3592;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3156((class279) arg0, (class279) arg1);
    }
}
