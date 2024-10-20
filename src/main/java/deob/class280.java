package deob;

@ObfuscatedName("kh")
public final class class280 {

    @ObfuscatedName("kh.af")
    public class444 field3080 = new class444();

    @ObfuscatedName("kh.an")
    public int field3081;

    @ObfuscatedName("kh.aw")
    public int field3079;

    @ObfuscatedName("kh.ac")
    public class464 field3082;

    @ObfuscatedName("kh.au")
    public class368 field3083 = new class368();

    public class280(int arg0) {
        this.field3081 = arg0;
        this.field3079 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3082 = new class464(var2);
    }

    @ObfuscatedName("kh.af(J)Lrk;")
    public class444 method5119(long arg0) {
        class444 var3 = (class444) this.field3082.method7945(arg0);
        if (var3 != null) {
            this.field3083.method6480(var3);
        }
        return var3;
    }

    @ObfuscatedName("kh.an(J)V")
    public void method5118(long arg0) {
        class444 var3 = (class444) this.field3082.method7945(arg0);
        if (var3 != null) {
            var3.method7651();
            var3.method7640();
            this.field3079++;
        }
    }

    @ObfuscatedName("kh.aw(Lrk;J)V")
    public void method5121(class444 arg0, long arg1) {
        if (this.field3079 == 0) {
            class444 var4 = this.field3083.method6469();
            var4.method7651();
            var4.method7640();
            if (this.field3080 == var4) {
                class444 var5 = this.field3083.method6469();
                var5.method7651();
                var5.method7640();
            }
        } else {
            this.field3079--;
        }
        this.field3082.method7946(arg0, arg1);
        this.field3083.method6480(arg0);
    }

    @ObfuscatedName("kh.ac()V")
    public void method5125() {
        this.field3083.method6463();
        this.field3082.method7947();
        this.field3080 = new class444();
        this.field3079 = this.field3081;
    }
}
