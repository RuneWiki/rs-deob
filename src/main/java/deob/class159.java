package deob;

@ObfuscatedName("fg")
public class class159 extends class276 {

    @ObfuscatedName("fg.q")
    public final boolean field1994;

    public class159(boolean arg0) {
        this.field1994 = arg0;
    }

    @ObfuscatedName("fg.q(Ljz;Ljz;I)I")
    public int method3142(class280 arg0, class280 arg1) {
        if (arg0.field3635 == arg1.field3635) {
            return this.method4676(arg0, arg1);
        } else if (this.field1994) {
            return arg0.field3635 - arg1.field3635;
        } else {
            return arg1.field3635 - arg0.field3635;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3142((class280) arg0, (class280) arg1);
    }
}
