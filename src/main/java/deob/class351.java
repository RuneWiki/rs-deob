package deob;

@ObfuscatedName("md")
public final class class351 {

    @ObfuscatedName("md.h")
    public class428 field4329 = new class428();

    public class351() {
        this.field4329.field4679 = this.field4329;
        this.field4329.field4677 = this.field4329;
    }

    @ObfuscatedName("md.h(Lpw;)V")
    public void method6068(class428 arg0) {
        if (arg0.field4677 != null) {
            arg0.method7225();
        }
        arg0.field4677 = this.field4329.field4677;
        arg0.field4679 = this.field4329;
        arg0.field4677.field4679 = arg0;
        arg0.field4679.field4677 = arg0;
    }

    @ObfuscatedName("md.e(Lpw;)V")
    public void method6069(class428 arg0) {
        if (arg0.field4677 != null) {
            arg0.method7225();
        }
        arg0.field4677 = this.field4329;
        arg0.field4679 = this.field4329.field4679;
        arg0.field4677.field4679 = arg0;
        arg0.field4679.field4677 = arg0;
    }

    @ObfuscatedName("md.v()Lpw;")
    public class428 method6070() {
        class428 var1 = this.field4329.field4679;
        return this.field4329 == var1 ? null : var1;
    }
}
