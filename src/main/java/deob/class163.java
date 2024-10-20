package deob;

@ObfuscatedName("fq")
public class class163 extends class286 {

    @ObfuscatedName("fq.n")
    public final boolean field1993;

    public class163(boolean arg0) {
        this.field1993 = arg0;
    }

    @ObfuscatedName("fq.n(Lky;Lky;I)I")
    public int method3288(class290 arg0, class290 arg1) {
        if (client.field844 == arg0.field3645) {
            if (client.field844 != arg1.field3645) {
                return this.field1993 ? -1 : 1;
            }
        } else if (client.field844 == arg1.field3645) {
            return this.field1993 ? 1 : -1;
        }
        return this.method4862(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3288((class290) arg0, (class290) arg1);
    }
}
