package deob;

@ObfuscatedName("ea")
public class class151 extends class275 {

    @ObfuscatedName("ea.f")
    public final boolean field1952;

    public class151(boolean arg0) {
        this.field1952 = arg0;
    }

    @ObfuscatedName("ea.f(Ljt;Ljt;B)I")
    public int method3073(class279 arg0, class279 arg1) {
        if (arg0.field3595 == 0) {
            if (arg1.field3595 != 0) {
                return this.field1952 ? 1 : -1;
            }
        } else if (arg1.field3595 == 0) {
            return this.field1952 ? -1 : 1;
        }
        return this.method4697(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3073((class279) arg0, (class279) arg1);
    }
}
