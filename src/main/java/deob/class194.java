package deob;

@ObfuscatedName("gw")
public final class class194 {

    @ObfuscatedName("gw.j")
    public class205 field3091 = new class205();

    @ObfuscatedName("gw.h")
    public int field3087;

    @ObfuscatedName("gw.m")
    public int field3089;

    @ObfuscatedName("gw.z")
    public class197 field3090;

    @ObfuscatedName("gw.x")
    public class204 field3088 = new class204();

    public class194(int arg0) {
        this.field3087 = arg0;
        this.field3089 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3090 = new class197(var2);
    }

    @ObfuscatedName("gw.j(J)Lgt;")
    public class205 method3460(long arg0) {
        class205 var3 = (class205) this.field3090.method3498(arg0);
        if (var3 != null) {
            this.field3088.method3600(var3);
        }
        return var3;
    }

    @ObfuscatedName("gw.h(J)V")
    public void method3465(long arg0) {
        class205 var3 = (class205) this.field3090.method3498(arg0);
        if (var3 != null) {
            var3.method3639();
            var3.method3619();
            this.field3089++;
        }
    }

    @ObfuscatedName("gw.m(Lgt;J)V")
    public void method3462(class205 arg0, long arg1) {
        if (this.field3089 == 0) {
            class205 var4 = this.field3088.method3608();
            var4.method3639();
            var4.method3619();
            if (this.field3091 == var4) {
                class205 var5 = this.field3088.method3608();
                var5.method3639();
                var5.method3619();
            }
        } else {
            this.field3089--;
        }
        this.field3090.method3499(arg0, arg1);
        this.field3088.method3600(arg0);
    }

    @ObfuscatedName("gw.z()V")
    public void method3463() {
        this.field3088.method3605();
        this.field3090.method3500();
        this.field3091 = new class205();
        this.field3089 = this.field3087;
    }
}
