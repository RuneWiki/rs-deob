package deob;

@ObfuscatedName("el")
public class class150 extends class289 {

    @ObfuscatedName("el.n")
    public final boolean field1972;

    public class150(boolean arg0) {
        this.field1972 = arg0;
    }

    @ObfuscatedName("el.n(Lkx;Lkx;B)I")
    public int method3165(class293 arg0, class293 arg1) {
        if (arg0.field3701 == 0) {
            if (arg1.field3701 != 0) {
                return this.field1972 ? 1 : -1;
            }
        } else if (arg1.field3701 == 0) {
            return this.field1972 ? -1 : 1;
        }
        return this.method5147(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3165((class293) arg0, (class293) arg1);
    }
}
