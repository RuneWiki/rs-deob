package deob;

@ObfuscatedName("eu")
public class class153 extends class275 {

    @ObfuscatedName("eu.s")
    public final boolean field1952;

    public class153(boolean arg0) {
        this.field1952 = arg0;
    }

    @ObfuscatedName("eu.s(Ljt;Ljt;B)I")
    public int method3118(class279 arg0, class279 arg1) {
        if (client.field872 == arg0.field3588 && client.field872 == arg1.field3588) {
            return this.field1952 ? arg0.method4632().method4770(arg1.method4632()) : arg1.method4632().method4770(arg0.method4632());
        } else {
            return this.method4653(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3118((class279) arg0, (class279) arg1);
    }
}
