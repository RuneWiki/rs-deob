package deob;

@ObfuscatedName("eq")
public class class151 extends class298 {

    @ObfuscatedName("eq.t")
    public final boolean field2100;

    public class151(boolean arg0) {
        this.field2100 = arg0;
    }

    @ObfuscatedName("eq.t(Lkp;Lkp;I)I")
    public int method2872(class302 arg0, class302 arg1) {
        if (client.field850 == arg0.field3845 && client.field850 == arg1.field3845) {
            return this.field2100 ? arg0.method4856().method5007(arg1.method4856()) : arg1.method4856().method5007(arg0.method4856());
        } else {
            return this.method4883(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2872((class302) arg0, (class302) arg1);
    }
}
