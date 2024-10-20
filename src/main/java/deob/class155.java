package deob;

@ObfuscatedName("ed")
public class class155 extends class275 {

    @ObfuscatedName("ed.u")
    public final boolean field1981;

    public class155(boolean arg0) {
        this.field1981 = arg0;
    }

    @ObfuscatedName("ed.u(Ljt;Ljt;S)I")
    public int method3146(class279 arg0, class279 arg1) {
        if (client.field645 == arg0.field3614 && client.field645 == arg1.field3614) {
            return this.field1981 ? arg0.field3613 - arg1.field3613 : arg1.field3613 - arg0.field3613;
        } else {
            return this.method4723(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3146((class279) arg0, (class279) arg1);
    }
}
