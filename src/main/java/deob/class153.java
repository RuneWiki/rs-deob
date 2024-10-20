package deob;

@ObfuscatedName("es")
public class class153 extends class287 {

    @ObfuscatedName("es.m")
    public final boolean field1956;

    public class153(boolean arg0) {
        this.field1956 = arg0;
    }

    @ObfuscatedName("es.m(Lke;Lke;B)I")
    public int method3064(class291 arg0, class291 arg1) {
        if (client.field622 == arg0.field3703) {
            if (client.field622 != arg1.field3703) {
                return this.field1956 ? -1 : 1;
            }
        } else if (client.field622 == arg1.field3703) {
            return this.field1956 ? 1 : -1;
        }
        return this.method5011(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3064((class291) arg0, (class291) arg1);
    }
}
