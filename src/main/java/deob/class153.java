package deob;

@ObfuscatedName("eh")
public class class153 extends class276 {

    @ObfuscatedName("eh.q")
    public final boolean field1976;

    public class153(boolean arg0) {
        this.field1976 = arg0;
    }

    @ObfuscatedName("eh.q(Ljz;Ljz;I)I")
    public int method3095(class280 arg0, class280 arg1) {
        if (client.field808 == arg0.field3637 && client.field808 == arg1.field3637) {
            return this.field1976 ? arg0.method4656().method4791(arg1.method4656()) : arg1.method4656().method4791(arg0.method4656());
        } else {
            return this.method4676(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3095((class280) arg0, (class280) arg1);
    }
}
