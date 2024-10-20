package deob;

@ObfuscatedName("eh")
public class class153 extends class298 {

    @ObfuscatedName("eh.o")
    public final boolean field2152;

    public class153(boolean arg0) {
        this.field2152 = arg0;
    }

    @ObfuscatedName("eh.o(Lkv;Lkv;B)I")
    public int method2883(class302 arg0, class302 arg1) {
        if (client.field871 == arg0.field3848 && client.field871 == arg1.field3848) {
            return this.field2152 ? arg0.field3846 - arg1.field3846 : arg1.field3846 - arg0.field3846;
        } else {
            return this.method4894(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2883((class302) arg0, (class302) arg1);
    }
}
