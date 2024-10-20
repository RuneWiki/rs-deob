package deob;

@ObfuscatedName("eu")
public class class150 extends class275 {

    @ObfuscatedName("eu.f")
    public final boolean field1949;

    public class150(boolean arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("eu.f(Ljt;Ljt;B)I")
    public int method3066(class279 arg0, class279 arg1) {
        if (arg0.field3595 == 0 || arg1.field3595 == 0) {
            return this.method4697(arg0, arg1);
        } else if (this.field1949) {
            return arg0.field3593 - arg1.field3593;
        } else {
            return arg1.field3593 - arg0.field3593;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3066((class279) arg0, (class279) arg1);
    }
}
