package deob;

@ObfuscatedName("es")
public class class142 extends class286 {

    @ObfuscatedName("es.g")
    public final boolean field1937;

    public class142(boolean arg0) {
        this.field1937 = arg0;
    }

    @ObfuscatedName("es.g(Lkv;Lkv;I)I")
    public int method3088(class290 arg0, class290 arg1) {
        if (client.field692 == arg0.field3709) {
            if (client.field692 != arg1.field3709) {
                return this.field1937 ? -1 : 1;
            }
        } else if (client.field692 == arg1.field3709) {
            return this.field1937 ? 1 : -1;
        }
        return this.method5152(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3088((class290) arg0, (class290) arg1);
    }
}
