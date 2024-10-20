package deob;

@ObfuscatedName("ee")
public class class150 extends class290 {

    @ObfuscatedName("ee.a")
    public final boolean field1967;

    public class150(boolean arg0) {
        this.field1967 = arg0;
    }

    @ObfuscatedName("ee.a(Lkl;Lkl;S)I")
    public int method3149(class294 arg0, class294 arg1) {
        if (arg0.field3713 == 0) {
            if (arg1.field3713 != 0) {
                return this.field1967 ? 1 : -1;
            }
        } else if (arg1.field3713 == 0) {
            return this.field1967 ? -1 : 1;
        }
        return this.method5117(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3149((class294) arg0, (class294) arg1);
    }
}
