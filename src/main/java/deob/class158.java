package deob;

@ObfuscatedName("fk")
public class class158 extends class276 {

    @ObfuscatedName("fk.q")
    public final boolean field1991;

    public class158(boolean arg0) {
        this.field1991 = arg0;
    }

    @ObfuscatedName("fk.q(Ljz;Ljz;I)I")
    public int method3133(class280 arg0, class280 arg1) {
        if (arg0.field3637 == arg1.field3637) {
            return this.method4676(arg0, arg1);
        } else if (this.field1991) {
            return arg0.field3637 - arg1.field3637;
        } else {
            return arg1.field3637 - arg0.field3637;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3133((class280) arg0, (class280) arg1);
    }
}
