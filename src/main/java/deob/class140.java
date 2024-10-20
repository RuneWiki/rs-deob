package deob;

@ObfuscatedName("eb")
public class class140 extends class284 {

    @ObfuscatedName("eb.w")
    public final boolean field1897;

    public class140(boolean arg0) {
        this.field1897 = arg0;
    }

    @ObfuscatedName("eb.w(Lkd;Lkd;I)I")
    public int method2931(class288 arg0, class288 arg1) {
        if (client.field677 == arg0.field3649) {
            if (client.field677 != arg1.field3649) {
                return this.field1897 ? -1 : 1;
            }
        } else if (client.field677 == arg1.field3649) {
            return this.field1897 ? 1 : -1;
        }
        return this.method4931(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2931((class288) arg0, (class288) arg1);
    }
}
