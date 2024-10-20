package deob;

@ObfuscatedName("fi")
public class class164 extends class285 {

    @ObfuscatedName("fi.x")
    public final boolean field1991;

    public class164(boolean arg0) {
        this.field1991 = arg0;
    }

    @ObfuscatedName("fi.x(Lke;Lke;I)I")
    public int method3207(class289 arg0, class289 arg1) {
        if (client.field681 == arg0.field3611 && client.field681 == arg1.field3611) {
            return this.field1991 ? arg0.field3610 - arg1.field3610 : arg1.field3610 - arg0.field3610;
        } else {
            return this.method4715(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3207((class289) arg0, (class289) arg1);
    }
}
