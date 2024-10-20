package deob;

@ObfuscatedName("fs")
public class class162 extends class286 {

    @ObfuscatedName("fs.n")
    public final boolean field1983;

    public class162(boolean arg0) {
        this.field1983 = arg0;
    }

    @ObfuscatedName("fs.n(Lky;Lky;B)I")
    public int method3281(class290 arg0, class290 arg1) {
        if (client.field844 == arg0.field3645 && client.field844 == arg1.field3645) {
            return this.field1983 ? arg0.method4851().method4967(arg1.method4851()) : arg1.method4851().method4967(arg0.method4851());
        } else {
            return this.method4862(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3281((class290) arg0, (class290) arg1);
    }
}
