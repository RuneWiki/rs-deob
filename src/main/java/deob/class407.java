package deob;

@ObfuscatedName("pw")
public final class class407 {

    @ObfuscatedName("pw.ab")
    public class502 field4624 = new class502();

    public class407() {
        this.field4624.field5068 = this.field4624;
        this.field4624.field5069 = this.field4624;
    }

    @ObfuscatedName("pw.ab(Lta;)V")
    public void method6881(class502 arg0) {
        if (arg0.field5069 != null) {
            arg0.method8217();
        }
        arg0.field5069 = this.field4624.field5069;
        arg0.field5068 = this.field4624;
        arg0.field5069.field5068 = arg0;
        arg0.field5068.field5069 = arg0;
    }

    @ObfuscatedName("pw.ay(Lta;)V")
    public void method6882(class502 arg0) {
        if (arg0.field5069 != null) {
            arg0.method8217();
        }
        arg0.field5069 = this.field4624;
        arg0.field5068 = this.field4624.field5068;
        arg0.field5069.field5068 = arg0;
        arg0.field5068.field5069 = arg0;
    }

    @ObfuscatedName("pw.an()Lta;")
    public class502 method6883() {
        class502 var1 = this.field4624.field5068;
        return this.field4624 == var1 ? null : var1;
    }
}
