package deob;

@ObfuscatedName("fg")
public class class159 extends class287 {

    @ObfuscatedName("fg.m")
    public final boolean field1980;

    public class159(boolean arg0) {
        this.field1980 = arg0;
    }

    @ObfuscatedName("fg.m(Lke;Lke;I)I")
    public int method3105(class291 arg0, class291 arg1) {
        if (arg0.field3703 == 0 || arg1.field3703 == 0) {
            return this.method5011(arg0, arg1);
        } else if (this.field1980) {
            return arg0.method4997().method5134(arg1.method4997());
        } else {
            return arg1.method4997().method5134(arg0.method4997());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3105((class291) arg0, (class291) arg1);
    }
}
