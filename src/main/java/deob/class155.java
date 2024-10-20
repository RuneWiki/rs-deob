package deob;

@ObfuscatedName("ec")
public class class155 extends class276 {

    @ObfuscatedName("ec.q")
    public final boolean field1984;

    public class155(boolean arg0) {
        this.field1984 = arg0;
    }

    @ObfuscatedName("ec.q(Ljz;Ljz;I)I")
    public int method3112(class280 arg0, class280 arg1) {
        if (client.field808 == arg0.field3637 && client.field808 == arg1.field3637) {
            return this.field1984 ? arg0.field3634 - arg1.field3634 : arg1.field3634 - arg0.field3634;
        } else {
            return this.method4676(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3112((class280) arg0, (class280) arg1);
    }
}
