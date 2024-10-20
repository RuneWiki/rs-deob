package deob;

@ObfuscatedName("ef")
public class class150 extends class284 {

    @ObfuscatedName("ef.b")
    public final boolean field2079;

    public class150(boolean arg0) {
        this.field2079 = arg0;
    }

    @ObfuscatedName("ef.b(Lku;Lku;I)I")
    public int method2874(class288 arg0, class288 arg1) {
        if (client.field1043 == arg0.field3721 && client.field1043 == arg1.field3721) {
            return this.field2079 ? arg0.method4780().method4928(arg1.method4780()) : arg1.method4780().method4928(arg0.method4780());
        } else {
            return this.method4811(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2874((class288) arg0, (class288) arg1);
    }
}
