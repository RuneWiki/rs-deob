package deob;

@ObfuscatedName("ee")
public class class153 extends class298 {

    @ObfuscatedName("ee.d")
    public final boolean field2124;

    public class153(boolean arg0) {
        this.field2124 = arg0;
    }

    @ObfuscatedName("ee.d(Lkz;Lkz;B)I")
    public int method2951(class302 arg0, class302 arg1) {
        if (client.field1084 == arg0.field3840 && client.field1084 == arg1.field3840) {
            return this.field2124 ? arg0.field3841 - arg1.field3841 : arg1.field3841 - arg0.field3841;
        } else {
            return this.method4977(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2951((class302) arg0, (class302) arg1);
    }
}
