package deob;

@ObfuscatedName("fk")
public class class164 extends class285 {

    @ObfuscatedName("fk.z")
    public final boolean field2017;

    public class164(boolean arg0) {
        this.field2017 = arg0;
    }

    @ObfuscatedName("fk.z(Lko;Lko;B)I")
    public int method3228(class289 arg0, class289 arg1) {
        if (client.field672 == arg0.field3632 && client.field672 == arg1.field3632) {
            return this.field2017 ? arg0.field3633 - arg1.field3633 : arg1.field3633 - arg0.field3633;
        } else {
            return this.method4783(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3228((class289) arg0, (class289) arg1);
    }
}
