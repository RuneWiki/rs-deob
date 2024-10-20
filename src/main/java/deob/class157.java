package deob;

@ObfuscatedName("fb")
public class class157 extends class275 {

    @ObfuscatedName("fb.z")
    public final boolean field1968;

    public class157(boolean arg0) {
        this.field1968 = arg0;
    }

    @ObfuscatedName("fb.z(Ljl;Ljl;I)I")
    public int method3081(class279 arg0, class279 arg1) {
        if (arg0.field3600 == 0) {
            if (arg1.field3600 != 0) {
                return this.field1968 ? 1 : -1;
            }
        } else if (arg1.field3600 == 0) {
            return this.field1968 ? -1 : 1;
        }
        return this.method4596(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3081((class279) arg0, (class279) arg1);
    }
}
