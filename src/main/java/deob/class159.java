package deob;

@ObfuscatedName("fs")
public class class159 extends class275 {

    @ObfuscatedName("fs.a")
    public final boolean field1976;

    public class159(boolean arg0) {
        this.field1976 = arg0;
    }

    @ObfuscatedName("fs.a(Ljx;Ljx;I)I")
    public int method3234(class279 arg0, class279 arg1) {
        if (arg0.field3599 == arg1.field3599) {
            return this.method4741(arg0, arg1);
        } else if (this.field1976) {
            return arg0.field3599 - arg1.field3599;
        } else {
            return arg1.field3599 - arg0.field3599;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3234((class279) arg0, (class279) arg1);
    }
}
