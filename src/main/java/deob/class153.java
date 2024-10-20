package deob;

@ObfuscatedName("eh")
public class class153 extends class275 {

    @ObfuscatedName("eh.c")
    public final boolean field1940;

    public class153(boolean arg0) {
        this.field1940 = arg0;
    }

    @ObfuscatedName("eh.c(Lje;Lje;I)I")
    public int method3111(class279 arg0, class279 arg1) {
        if (client.field624 == arg0.field3582 && client.field624 == arg1.field3582) {
            return this.field1940 ? arg0.method4683().method4818(arg1.method4683()) : arg1.method4683().method4818(arg0.method4683());
        } else {
            return this.method4697(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3111((class279) arg0, (class279) arg1);
    }
}
