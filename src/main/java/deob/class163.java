package deob;

@ObfuscatedName("fo")
public class class163 extends class285 {

    @ObfuscatedName("fo.x")
    public final boolean field1989;

    public class163(boolean arg0) {
        this.field1989 = arg0;
    }

    @ObfuscatedName("fo.x(Lke;Lke;I)I")
    public int method3204(class289 arg0, class289 arg1) {
        if (client.field681 == arg0.field3611) {
            if (client.field681 != arg1.field3611) {
                return this.field1989 ? -1 : 1;
            }
        } else if (client.field681 == arg1.field3611) {
            return this.field1989 ? 1 : -1;
        }
        return this.method4715(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3204((class289) arg0, (class289) arg1);
    }
}
