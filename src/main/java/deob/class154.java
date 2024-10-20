package deob;

@ObfuscatedName("es")
public class class154 extends class275 {

    @ObfuscatedName("es.u")
    public final boolean field1975;

    public class154(boolean arg0) {
        this.field1975 = arg0;
    }

    @ObfuscatedName("es.u(Ljt;Ljt;B)I")
    public int method3142(class279 arg0, class279 arg1) {
        if (client.field645 == arg0.field3614) {
            if (client.field645 != arg1.field3614) {
                return this.field1975 ? -1 : 1;
            }
        } else if (client.field645 == arg1.field3614) {
            return this.field1975 ? 1 : -1;
        }
        return this.method4723(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3142((class279) arg0, (class279) arg1);
    }
}
