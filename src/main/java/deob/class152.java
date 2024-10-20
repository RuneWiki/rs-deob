package deob;

@ObfuscatedName("ea")
public class class152 extends class298 {

    @ObfuscatedName("ea.t")
    public final boolean field2103;

    public class152(boolean arg0) {
        this.field2103 = arg0;
    }

    @ObfuscatedName("ea.t(Lkp;Lkp;S)I")
    public int method2879(class302 arg0, class302 arg1) {
        if (client.field850 == arg0.field3845) {
            if (client.field850 != arg1.field3845) {
                return this.field2103 ? -1 : 1;
            }
        } else if (client.field850 == arg1.field3845) {
            return this.field2103 ? 1 : -1;
        }
        return this.method4883(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2879((class302) arg0, (class302) arg1);
    }
}
