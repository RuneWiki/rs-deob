package deob;

@ObfuscatedName("fv")
public class class162 extends class285 {

    @ObfuscatedName("fv.z")
    public final boolean field2013;

    public class162(boolean arg0) {
        this.field2013 = arg0;
    }

    @ObfuscatedName("fv.z(Lko;Lko;B)I")
    public int method3215(class289 arg0, class289 arg1) {
        if (client.field672 == arg0.field3632 && client.field672 == arg1.field3632) {
            return this.field2013 ? arg0.method4757().method4890(arg1.method4757()) : arg1.method4757().method4890(arg0.method4757());
        } else {
            return this.method4783(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3215((class289) arg0, (class289) arg1);
    }
}
