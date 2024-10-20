package deob;

@ObfuscatedName("fj")
public class class162 extends class286 {

    @ObfuscatedName("fj.h")
    public final boolean field1992;

    public class162(boolean arg0) {
        this.field1992 = arg0;
    }

    @ObfuscatedName("fj.h(Lkz;Lkz;B)I")
    public int method3199(class290 arg0, class290 arg1) {
        if (client.field646 == arg0.field3651 && client.field646 == arg1.field3651) {
            return this.field1992 ? arg0.method4699().method4830(arg1.method4699()) : arg1.method4699().method4830(arg0.method4699());
        } else {
            return this.method4712(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3199((class290) arg0, (class290) arg1);
    }
}
