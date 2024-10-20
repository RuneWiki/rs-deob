package deob;

@ObfuscatedName("eu")
public class class154 extends class275 {

    @ObfuscatedName("eu.c")
    public final boolean field1943;

    public class154(boolean arg0) {
        this.field1943 = arg0;
    }

    @ObfuscatedName("eu.c(Lje;Lje;I)I")
    public int method3120(class279 arg0, class279 arg1) {
        if (client.field624 == arg0.field3582) {
            if (client.field624 != arg1.field3582) {
                return this.field1943 ? -1 : 1;
            }
        } else if (client.field624 == arg1.field3582) {
            return this.field1943 ? 1 : -1;
        }
        return this.method4697(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3120((class279) arg0, (class279) arg1);
    }
}
