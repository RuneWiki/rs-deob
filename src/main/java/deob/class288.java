package deob;

@ObfuscatedName("le")
public final class class288 {

    @ObfuscatedName("le.au")
    public class469 field3094 = new class469();

    @ObfuscatedName("le.ae")
    public int field3090;

    @ObfuscatedName("le.ao")
    public int field3092;

    @ObfuscatedName("le.at")
    public class488 field3093;

    @ObfuscatedName("le.ac")
    public class383 field3091 = new class383();

    public class288(int arg0) {
        this.field3090 = arg0;
        this.field3092 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3093 = new class488(var2);
    }

    @ObfuscatedName("le.au(J)Lsq;")
    public class469 method5182(long arg0) {
        class469 var3 = (class469) this.field3093.method8008(arg0);
        if (var3 != null) {
            this.field3091.method6532(var3);
        }
        return var3;
    }

    @ObfuscatedName("le.ae(J)V")
    public void method5176(long arg0) {
        class469 var3 = (class469) this.field3093.method8008(arg0);
        if (var3 != null) {
            var3.method7700();
            var3.method7697();
            this.field3092++;
        }
    }

    @ObfuscatedName("le.ao(Lsq;J)V")
    public void method5177(class469 arg0, long arg1) {
        if (this.field3092 == 0) {
            class469 var4 = this.field3091.method6534();
            var4.method7700();
            var4.method7697();
            if (this.field3094 == var4) {
                class469 var5 = this.field3091.method6534();
                var5.method7700();
                var5.method7697();
            }
        } else {
            this.field3092--;
        }
        this.field3093.method8016(arg0, arg1);
        this.field3091.method6532(arg0);
    }

    @ObfuscatedName("le.at()V")
    public void method5175() {
        this.field3091.method6557();
        this.field3093.method8010();
        this.field3094 = new class469();
        this.field3092 = this.field3090;
    }
}
