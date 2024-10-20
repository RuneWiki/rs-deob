package deob;

@ObfuscatedName("fz")
public class class163 extends class285 {

    @ObfuscatedName("fz.z")
    public final boolean field2016;

    public class163(boolean arg0) {
        this.field2016 = arg0;
    }

    @ObfuscatedName("fz.z(Lko;Lko;I)I")
    public int method3222(class289 arg0, class289 arg1) {
        if (client.field672 == arg0.field3632) {
            if (client.field672 != arg1.field3632) {
                return this.field2016 ? -1 : 1;
            }
        } else if (client.field672 == arg1.field3632) {
            return this.field2016 ? 1 : -1;
        }
        return this.method4783(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3222((class289) arg0, (class289) arg1);
    }
}
