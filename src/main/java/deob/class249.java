package deob;

@ObfuscatedName("iq")
public final class class249 {

    @ObfuscatedName("iq.c")
    public class382 field2798 = new class382();

    @ObfuscatedName("iq.b")
    public int field2797;

    @ObfuscatedName("iq.p")
    public int field2796;

    @ObfuscatedName("iq.m")
    public class396 field2799;

    @ObfuscatedName("iq.t")
    public class326 field2800 = new class326();

    public class249(int arg0) {
        this.field2797 = arg0;
        this.field2796 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2799 = new class396(var2);
    }

    @ObfuscatedName("iq.c(J)Lnc;")
    public class382 method4514(long arg0) {
        class382 var3 = (class382) this.field2799.method6429(arg0);
        if (var3 != null) {
            this.field2800.method5441(var3);
        }
        return var3;
    }

    @ObfuscatedName("iq.b(J)V")
    public void method4516(long arg0) {
        class382 var3 = (class382) this.field2799.method6429(arg0);
        if (var3 != null) {
            var3.method6163();
            var3.method6159();
            this.field2796++;
        }
    }

    @ObfuscatedName("iq.p(Lnc;J)V")
    public void method4515(class382 arg0, long arg1) {
        if (this.field2796 == 0) {
            class382 var4 = this.field2800.method5424();
            var4.method6163();
            var4.method6159();
            if (this.field2798 == var4) {
                class382 var5 = this.field2800.method5424();
                var5.method6163();
                var5.method6159();
            }
        } else {
            this.field2796--;
        }
        this.field2799.method6431(arg0, arg1);
        this.field2800.method5441(arg0);
    }

    @ObfuscatedName("iq.m()V")
    public void method4518() {
        this.field2800.method5421();
        this.field2799.method6432();
        this.field2798 = new class382();
        this.field2796 = this.field2797;
    }
}
