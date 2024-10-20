package deob;

@ObfuscatedName("jv")
public final class class269 {

    @ObfuscatedName("jv.h")
    public class428 field3034 = new class428();

    @ObfuscatedName("jv.e")
    public int field3033;

    @ObfuscatedName("jv.v")
    public int field3032;

    @ObfuscatedName("jv.x")
    public class443 field3035;

    @ObfuscatedName("jv.m")
    public class357 field3036 = new class357();

    public class269(int arg0) {
        this.field3033 = arg0;
        this.field3032 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3035 = new class443(var2);
    }

    @ObfuscatedName("jv.h(J)Lpw;")
    public class428 method4917(long arg0) {
        class428 var3 = (class428) this.field3035.method7525(arg0);
        if (var3 != null) {
            this.field3036.method6235(var3);
        }
        return var3;
    }

    @ObfuscatedName("jv.e(J)V")
    public void method4916(long arg0) {
        class428 var3 = (class428) this.field3035.method7525(arg0);
        if (var3 != null) {
            var3.method7230();
            var3.method7225();
            this.field3032++;
        }
    }

    @ObfuscatedName("jv.v(Lpw;J)V")
    public void method4925(class428 arg0, long arg1) {
        if (this.field3032 == 0) {
            class428 var4 = this.field3036.method6237();
            var4.method7230();
            var4.method7225();
            if (this.field3034 == var4) {
                class428 var5 = this.field3036.method6237();
                var5.method7230();
                var5.method7225();
            }
        } else {
            this.field3032--;
        }
        this.field3035.method7523(arg0, arg1);
        this.field3036.method6235(arg0);
    }

    @ObfuscatedName("jv.x()V")
    public void method4918() {
        this.field3036.method6234();
        this.field3035.method7512();
        this.field3034 = new class428();
        this.field3032 = this.field3033;
    }
}
