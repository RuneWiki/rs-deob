package deob;

@ObfuscatedName("ew")
public class class155 extends class276 {

    @ObfuscatedName("ew.c")
    public final boolean field1975;

    public class155(boolean arg0) {
        this.field1975 = arg0;
    }

    @ObfuscatedName("ew.c(Lje;Lje;I)I")
    public int method3173(class280 arg0, class280 arg1) {
        if (client.field646 == arg0.field3600 && client.field646 == arg1.field3600) {
            return this.field1975 ? arg0.field3601 - arg1.field3601 : arg1.field3601 - arg0.field3601;
        } else {
            return this.method4714(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3173((class280) arg0, (class280) arg1);
    }
}
