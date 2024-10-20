package deob;

@ObfuscatedName("ff")
public class class164 extends class286 {

    @ObfuscatedName("ff.h")
    public final boolean field1998;

    public class164(boolean arg0) {
        this.field1998 = arg0;
    }

    @ObfuscatedName("ff.h(Lkz;Lkz;I)I")
    public int method3212(class290 arg0, class290 arg1) {
        if (client.field646 == arg0.field3651 && client.field646 == arg1.field3651) {
            return this.field1998 ? arg0.field3650 - arg1.field3650 : arg1.field3650 - arg0.field3650;
        } else {
            return this.method4712(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3212((class290) arg0, (class290) arg1);
    }
}
