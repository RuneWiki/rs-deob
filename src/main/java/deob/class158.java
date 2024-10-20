package deob;

@ObfuscatedName("ff")
public class class158 extends class275 {

    @ObfuscatedName("ff.c")
    public final boolean field1963;

    public class158(boolean arg0) {
        this.field1963 = arg0;
    }

    @ObfuscatedName("ff.c(Lje;Lje;I)I")
    public int method3157(class279 arg0, class279 arg1) {
        if (arg0.field3582 == arg1.field3582) {
            return this.method4697(arg0, arg1);
        } else if (this.field1963) {
            return arg0.field3582 - arg1.field3582;
        } else {
            return arg1.field3582 - arg0.field3582;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3157((class279) arg0, (class279) arg1);
    }
}
