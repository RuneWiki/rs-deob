package deob;

@ObfuscatedName("eb")
public class class156 extends class276 {

    @ObfuscatedName("eb.q")
    public final boolean field1986;

    public class156(boolean arg0) {
        this.field1986 = arg0;
    }

    @ObfuscatedName("eb.q(Ljz;Ljz;S)I")
    public int method3120(class280 arg0, class280 arg1) {
        if (arg0.field3637 == 0 || arg1.field3637 == 0) {
            return this.method4676(arg0, arg1);
        } else if (this.field1986) {
            return arg0.field3634 - arg1.field3634;
        } else {
            return arg1.field3634 - arg0.field3634;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3120((class280) arg0, (class280) arg1);
    }
}
