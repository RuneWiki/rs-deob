package deob;

@ObfuscatedName("pm")
public final class class410 {

    @ObfuscatedName("pm.ap")
    public class511 field4724 = new class511();

    public class410() {
        this.field4724.field5163 = this.field4724;
        this.field4724.field5164 = this.field4724;
    }

    @ObfuscatedName("pm.ap(Ltp;)V")
    public void method7233(class511 arg0) {
        if (arg0.field5164 != null) {
            arg0.method8665();
        }
        arg0.field5164 = this.field4724.field5164;
        arg0.field5163 = this.field4724;
        arg0.field5164.field5163 = arg0;
        arg0.field5163.field5164 = arg0;
    }

    @ObfuscatedName("pm.aw(Ltp;)V")
    public void method7234(class511 arg0) {
        if (arg0.field5164 != null) {
            arg0.method8665();
        }
        arg0.field5164 = this.field4724;
        arg0.field5163 = this.field4724.field5163;
        arg0.field5164.field5163 = arg0;
        arg0.field5163.field5164 = arg0;
    }

    @ObfuscatedName("pm.ak()Ltp;")
    public class511 method7237() {
        class511 var1 = this.field4724.field5163;
        return this.field4724 == var1 ? null : var1;
    }
}
