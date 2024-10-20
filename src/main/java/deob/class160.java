package deob;

@ObfuscatedName("ff")
public class class160 extends class275 {

    @ObfuscatedName("ff.s")
    public final boolean field1980;

    public class160(boolean arg0) {
        this.field1980 = arg0;
    }

    @ObfuscatedName("ff.s(Ljt;Ljt;B)I")
    public int method3162(class279 arg0, class279 arg1) {
        if (arg0.field3588 == 0 || arg1.field3588 == 0) {
            return this.method4653(arg0, arg1);
        } else if (this.field1980) {
            return arg0.method4632().method4770(arg1.method4632());
        } else {
            return arg1.method4632().method4770(arg0.method4632());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3162((class279) arg0, (class279) arg1);
    }
}
