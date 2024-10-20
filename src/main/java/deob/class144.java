package deob;

@ObfuscatedName("ev")
public class class144 extends class286 {

    @ObfuscatedName("ev.g")
    public final boolean field1943;

    public class144(boolean arg0) {
        this.field1943 = arg0;
    }

    @ObfuscatedName("ev.g(Lkv;Lkv;I)I")
    public int method3107(class290 arg0, class290 arg1) {
        if (arg0.field3709 == 0 || arg1.field3709 == 0) {
            return this.method5152(arg0, arg1);
        } else if (this.field1943) {
            return arg0.field3707 - arg1.field3707;
        } else {
            return arg1.field3707 - arg0.field3707;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3107((class290) arg0, (class290) arg1);
    }
}
