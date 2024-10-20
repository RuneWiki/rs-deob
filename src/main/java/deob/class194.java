package deob;

@ObfuscatedName("gi")
public final class class194 {

    @ObfuscatedName("gi.w")
    public class205 field3090 = new class205();

    @ObfuscatedName("gi.x")
    public int field3088;

    @ObfuscatedName("gi.t")
    public int field3091;

    @ObfuscatedName("gi.p")
    public class197 field3089;

    @ObfuscatedName("gi.e")
    public class204 field3092 = new class204();

    public class194(int arg0) {
        this.field3088 = arg0;
        this.field3091 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3089 = new class197(var2);
    }

    @ObfuscatedName("gi.w(J)Lgs;")
    public class205 method3520(long arg0) {
        class205 var3 = (class205) this.field3089.method3555(arg0);
        if (var3 != null) {
            this.field3092.method3654(var3);
        }
        return var3;
    }

    @ObfuscatedName("gi.x(J)V")
    public void method3519(long arg0) {
        class205 var3 = (class205) this.field3089.method3555(arg0);
        if (var3 != null) {
            var3.method3684();
            var3.method3658();
            this.field3091++;
        }
    }

    @ObfuscatedName("gi.t(Lgs;J)V")
    public void method3522(class205 arg0, long arg1) {
        if (this.field3091 == 0) {
            class205 var4 = this.field3092.method3643();
            var4.method3684();
            var4.method3658();
            if (this.field3090 == var4) {
                class205 var5 = this.field3092.method3643();
                var5.method3684();
                var5.method3658();
            }
        } else {
            this.field3091--;
        }
        this.field3089.method3556(arg0, arg1);
        this.field3092.method3654(arg0);
    }

    @ObfuscatedName("gi.p()V")
    public void method3525() {
        this.field3092.method3646();
        this.field3089.method3557();
        this.field3090 = new class205();
        this.field3091 = this.field3088;
    }
}
