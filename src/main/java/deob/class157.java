package deob;

@ObfuscatedName("fo")
public class class157 extends class284 {

    @ObfuscatedName("fo.b")
    public final boolean field2111;

    public class157(boolean arg0) {
        this.field2111 = arg0;
    }

    @ObfuscatedName("fo.b(Lku;Lku;I)I")
    public int method2925(class288 arg0, class288 arg1) {
        if (arg0.field3721 == 0 || arg1.field3721 == 0) {
            return this.method4811(arg0, arg1);
        } else if (this.field2111) {
            return arg0.method4780().method4928(arg1.method4780());
        } else {
            return arg1.method4780().method4928(arg0.method4780());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2925((class288) arg0, (class288) arg1);
    }
}
