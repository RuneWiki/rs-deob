package deob;

@ObfuscatedName("er")
public class class147 extends class286 {

    @ObfuscatedName("er.g")
    public final boolean field1957;

    public class147(boolean arg0) {
        this.field1957 = arg0;
    }

    @ObfuscatedName("er.g(Lkv;Lkv;I)I")
    public int method3126(class290 arg0, class290 arg1) {
        if (arg0.field3711 == arg1.field3711) {
            return this.method5152(arg0, arg1);
        } else if (this.field1957) {
            return arg0.field3711 - arg1.field3711;
        } else {
            return arg1.field3711 - arg0.field3711;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3126((class290) arg0, (class290) arg1);
    }
}
