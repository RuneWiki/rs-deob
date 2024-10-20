package deob;

@ObfuscatedName("eo")
public class class153 extends class276 {

    @ObfuscatedName("eo.c")
    public final boolean field1968;

    public class153(boolean arg0) {
        this.field1968 = arg0;
    }

    @ObfuscatedName("eo.c(Lje;Lje;I)I")
    public int method3154(class280 arg0, class280 arg1) {
        if (client.field646 == arg0.field3600 && client.field646 == arg1.field3600) {
            return this.field1968 ? arg0.method4689().method4832(arg1.method4689()) : arg1.method4689().method4832(arg0.method4689());
        } else {
            return this.method4714(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3154((class280) arg0, (class280) arg1);
    }
}
