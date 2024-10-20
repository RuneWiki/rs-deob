package deob;

@ObfuscatedName("fd")
public class class162 extends class285 {

    @ObfuscatedName("fd.x")
    public final boolean field1987;

    public class162(boolean arg0) {
        this.field1987 = arg0;
    }

    @ObfuscatedName("fd.x(Lke;Lke;I)I")
    public int method3201(class289 arg0, class289 arg1) {
        if (client.field681 == arg0.field3611 && client.field681 == arg1.field3611) {
            return this.field1987 ? arg0.method4696().method4847(arg1.method4696()) : arg1.method4696().method4847(arg0.method4696());
        } else {
            return this.method4715(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3201((class289) arg0, (class289) arg1);
    }
}
