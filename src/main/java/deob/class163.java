package deob;

@ObfuscatedName("fp")
public class class163 extends class286 {

    @ObfuscatedName("fp.h")
    public final boolean field1994;

    public class163(boolean arg0) {
        this.field1994 = arg0;
    }

    @ObfuscatedName("fp.h(Lkz;Lkz;I)I")
    public int method3206(class290 arg0, class290 arg1) {
        if (client.field646 == arg0.field3651) {
            if (client.field646 != arg1.field3651) {
                return this.field1994 ? -1 : 1;
            }
        } else if (client.field646 == arg1.field3651) {
            return this.field1994 ? 1 : -1;
        }
        return this.method4712(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3206((class290) arg0, (class290) arg1);
    }
}
