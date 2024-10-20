package deob;

@ObfuscatedName("pd")
public final class class396 {

    @ObfuscatedName("pd.aq")
    public class488 field4516 = new class488();

    public class396() {
        this.field4516.field4913 = this.field4516;
        this.field4516.field4914 = this.field4516;
    }

    @ObfuscatedName("pd.aq(Lsm;)V")
    public void method6669(class488 arg0) {
        if (arg0.field4914 != null) {
            arg0.method7989();
        }
        arg0.field4914 = this.field4516.field4914;
        arg0.field4913 = this.field4516;
        arg0.field4914.field4913 = arg0;
        arg0.field4913.field4914 = arg0;
    }

    @ObfuscatedName("pd.aw(Lsm;)V")
    public void method6671(class488 arg0) {
        if (arg0.field4914 != null) {
            arg0.method7989();
        }
        arg0.field4914 = this.field4516;
        arg0.field4913 = this.field4516.field4913;
        arg0.field4914.field4913 = arg0;
        arg0.field4913.field4914 = arg0;
    }

    @ObfuscatedName("pd.al()Lsm;")
    public class488 method6670() {
        class488 var1 = this.field4516.field4913;
        return this.field4516 == var1 ? null : var1;
    }
}
