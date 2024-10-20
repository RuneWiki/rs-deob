package deob;

@ObfuscatedName("ey")
public class class147 extends class289 {

    @ObfuscatedName("ey.n")
    public final boolean field1957;

    public class147(boolean arg0) {
        this.field1957 = arg0;
    }

    @ObfuscatedName("ey.n(Lkx;Lkx;I)I")
    public int method3128(class293 arg0, class293 arg1) {
        if (client.field630 == arg0.field3701) {
            if (client.field630 != arg1.field3701) {
                return this.field1957 ? -1 : 1;
            }
        } else if (client.field630 == arg1.field3701) {
            return this.field1957 ? 1 : -1;
        }
        return this.method5147(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3128((class293) arg0, (class293) arg1);
    }
}
