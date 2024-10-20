package deob;

@ObfuscatedName("ex")
public class class154 extends class276 {

    @ObfuscatedName("ex.c")
    public final boolean field1970;

    public class154(boolean arg0) {
        this.field1970 = arg0;
    }

    @ObfuscatedName("ex.c(Lje;Lje;I)I")
    public int method3169(class280 arg0, class280 arg1) {
        if (client.field646 == arg0.field3600) {
            if (client.field646 != arg1.field3600) {
                return this.field1970 ? -1 : 1;
            }
        } else if (client.field646 == arg1.field3600) {
            return this.field1970 ? 1 : -1;
        }
        return this.method4714(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3169((class280) arg0, (class280) arg1);
    }
}
