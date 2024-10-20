package deob;

@ObfuscatedName("eh")
public class class149 extends class275 {

    @ObfuscatedName("eh.f")
    public final boolean field1943;

    public class149(boolean arg0) {
        this.field1943 = arg0;
    }

    @ObfuscatedName("eh.f(Ljt;Ljt;B)I")
    public int method3059(class279 arg0, class279 arg1) {
        if (client.field829 == arg0.field3595 && client.field829 == arg1.field3595) {
            return this.field1943 ? arg0.field3593 - arg1.field3593 : arg1.field3593 - arg0.field3593;
        } else {
            return this.method4697(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3059((class279) arg0, (class279) arg1);
    }
}
