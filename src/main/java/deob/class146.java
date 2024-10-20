package deob;

@ObfuscatedName("eo")
public class class146 extends class289 {

    @ObfuscatedName("eo.n")
    public final boolean field1950;

    public class146(boolean arg0) {
        this.field1950 = arg0;
    }

    @ObfuscatedName("eo.n(Lkx;Lkx;S)I")
    public int method3119(class293 arg0, class293 arg1) {
        if (client.field630 == arg0.field3701 && client.field630 == arg1.field3701) {
            return this.field1950 ? arg0.method5125().method5263(arg1.method5125()) : arg1.method5125().method5263(arg0.method5125());
        } else {
            return this.method5147(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3119((class293) arg0, (class293) arg1);
    }
}
