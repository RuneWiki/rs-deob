package deob;

@ObfuscatedName("fi")
public class class157 extends class276 {

    @ObfuscatedName("fi.q")
    public final boolean field1988;

    public class157(boolean arg0) {
        this.field1988 = arg0;
    }

    @ObfuscatedName("fi.q(Ljz;Ljz;I)I")
    public int method3125(class280 arg0, class280 arg1) {
        if (arg0.field3637 == 0) {
            if (arg1.field3637 != 0) {
                return this.field1988 ? 1 : -1;
            }
        } else if (arg1.field3637 == 0) {
            return this.field1988 ? -1 : 1;
        }
        return this.method4676(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3125((class280) arg0, (class280) arg1);
    }
}
