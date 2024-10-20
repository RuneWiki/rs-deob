package deob;

@ObfuscatedName("eh")
public class class144 extends class284 {

    @ObfuscatedName("eh.w")
    public final boolean field1914;

    public class144(boolean arg0) {
        this.field1914 = arg0;
    }

    @ObfuscatedName("eh.w(Lkd;Lkd;I)I")
    public int method2954(class288 arg0, class288 arg1) {
        if (arg0.field3649 == arg1.field3649) {
            return this.method4931(arg0, arg1);
        } else if (this.field1914) {
            return arg0.field3649 - arg1.field3649;
        } else {
            return arg1.field3649 - arg0.field3649;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2954((class288) arg0, (class288) arg1);
    }
}
