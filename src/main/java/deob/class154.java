package deob;

@ObfuscatedName("ey")
public class class154 extends class276 {

    @ObfuscatedName("ey.q")
    public final boolean field1980;

    public class154(boolean arg0) {
        this.field1980 = arg0;
    }

    @ObfuscatedName("ey.q(Ljz;Ljz;I)I")
    public int method3102(class280 arg0, class280 arg1) {
        if (client.field808 == arg0.field3637) {
            if (client.field808 != arg1.field3637) {
                return this.field1980 ? -1 : 1;
            }
        } else if (client.field808 == arg1.field3637) {
            return this.field1980 ? 1 : -1;
        }
        return this.method4676(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3102((class280) arg0, (class280) arg1);
    }
}
