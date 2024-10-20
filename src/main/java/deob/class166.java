package deob;

@ObfuscatedName("fk")
public class class166 extends class286 {

    @ObfuscatedName("fk.h")
    public final boolean field2001;

    public class166(boolean arg0) {
        this.field2001 = arg0;
    }

    @ObfuscatedName("fk.h(Lkz;Lkz;B)I")
    public int method3226(class290 arg0, class290 arg1) {
        if (arg0.field3651 == 0) {
            if (arg1.field3651 != 0) {
                return this.field2001 ? 1 : -1;
            }
        } else if (arg1.field3651 == 0) {
            return this.field2001 ? -1 : 1;
        }
        return this.method4712(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3226((class290) arg0, (class290) arg1);
    }
}
