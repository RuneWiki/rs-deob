package deob;

@ObfuscatedName("eb")
public class class153 extends class275 {

    @ObfuscatedName("eb.u")
    public final boolean field1971;

    public class153(boolean arg0) {
        this.field1971 = arg0;
    }

    @ObfuscatedName("eb.u(Ljt;Ljt;B)I")
    public int method3130(class279 arg0, class279 arg1) {
        if (client.field645 == arg0.field3614 && client.field645 == arg1.field3614) {
            return this.field1971 ? arg0.method4716().method4848(arg1.method4716()) : arg1.method4716().method4848(arg0.method4716());
        } else {
            return this.method4723(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3130((class279) arg0, (class279) arg1);
    }
}
