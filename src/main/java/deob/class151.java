package deob;

@ObfuscatedName("er")
public class class151 extends class298 {

    @ObfuscatedName("er.o")
    public final boolean field2144;

    public class151(boolean arg0) {
        this.field2144 = arg0;
    }

    @ObfuscatedName("er.o(Lkv;Lkv;I)I")
    public int method2872(class302 arg0, class302 arg1) {
        if (client.field871 == arg0.field3848 && client.field871 == arg1.field3848) {
            return this.field2144 ? arg0.method4883().method5020(arg1.method4883()) : arg1.method4883().method5020(arg0.method4883());
        } else {
            return this.method4894(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2872((class302) arg0, (class302) arg1);
    }
}
