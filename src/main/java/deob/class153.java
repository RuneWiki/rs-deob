package deob;

@ObfuscatedName("el")
public class class153 extends class275 {

    @ObfuscatedName("el.z")
    public final boolean field1951;

    public class153(boolean arg0) {
        this.field1951 = arg0;
    }

    @ObfuscatedName("el.z(Ljl;Ljl;B)I")
    public int method3055(class279 arg0, class279 arg1) {
        if (client.field856 == arg0.field3600 && client.field856 == arg1.field3600) {
            return this.field1951 ? arg0.method4570().method4700(arg1.method4570()) : arg1.method4570().method4700(arg0.method4570());
        } else {
            return this.method4596(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3055((class279) arg0, (class279) arg1);
    }
}
