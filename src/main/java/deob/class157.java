package deob;

@ObfuscatedName("fe")
public class class157 extends class275 {

    @ObfuscatedName("fe.u")
    public final boolean field1987;

    public class157(boolean arg0) {
        this.field1987 = arg0;
    }

    @ObfuscatedName("fe.u(Ljt;Ljt;I)I")
    public int method3161(class279 arg0, class279 arg1) {
        if (arg0.field3614 == 0) {
            if (arg1.field3614 != 0) {
                return this.field1987 ? 1 : -1;
            }
        } else if (arg1.field3614 == 0) {
            return this.field1987 ? -1 : 1;
        }
        return this.method4723(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3161((class279) arg0, (class279) arg1);
    }
}
