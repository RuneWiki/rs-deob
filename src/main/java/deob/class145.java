package deob;

@ObfuscatedName("er")
public class class145 extends class286 {

    @ObfuscatedName("er.f")
    public final boolean field1943;

    public class145(boolean arg0) {
        this.field1943 = arg0;
    }

    @ObfuscatedName("er.f(Lkj;Lkj;I)I")
    public int method2997(class290 arg0, class290 arg1) {
        if (arg0.field3703 == 0) {
            if (arg1.field3703 != 0) {
                return this.field1943 ? 1 : -1;
            }
        } else if (arg1.field3703 == 0) {
            return this.field1943 ? -1 : 1;
        }
        return this.method5014(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2997((class290) arg0, (class290) arg1);
    }
}
