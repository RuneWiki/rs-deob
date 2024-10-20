package deob;

@ObfuscatedName("ex")
public class class156 extends class275 {

    @ObfuscatedName("ex.c")
    public final boolean field1952;

    public class156(boolean arg0) {
        this.field1952 = arg0;
    }

    @ObfuscatedName("ex.c(Lje;Lje;I)I")
    public int method3139(class279 arg0, class279 arg1) {
        if (arg0.field3582 == 0 || arg1.field3582 == 0) {
            return this.method4697(arg0, arg1);
        } else if (this.field1952) {
            return arg0.field3581 - arg1.field3581;
        } else {
            return arg1.field3581 - arg0.field3581;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3139((class279) arg0, (class279) arg1);
    }
}
