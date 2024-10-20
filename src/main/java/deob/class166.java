package deob;

@ObfuscatedName("fc")
public class class166 extends class285 {

    @ObfuscatedName("fc.x")
    public final boolean field1994;

    public class166(boolean arg0) {
        this.field1994 = arg0;
    }

    @ObfuscatedName("fc.x(Lke;Lke;I)I")
    public int method3219(class289 arg0, class289 arg1) {
        if (arg0.field3611 == 0) {
            if (arg1.field3611 != 0) {
                return this.field1994 ? 1 : -1;
            }
        } else if (arg1.field3611 == 0) {
            return this.field1994 ? -1 : 1;
        }
        return this.method4715(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3219((class289) arg0, (class289) arg1);
    }
}
