package deob;

@ObfuscatedName("hj")
public final class class213 {

    @ObfuscatedName("hj.t")
    public class219 field2623 = new class219();

    @ObfuscatedName("hj.q")
    public int field2621;

    @ObfuscatedName("hj.i")
    public int field2622;

    @ObfuscatedName("hj.a")
    public class215 field2624;

    @ObfuscatedName("hj.l")
    public class207 field2620 = new class207();

    public class213(int arg0) {
        this.field2621 = arg0;
        this.field2622 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2624 = new class215(var2);
    }

    @ObfuscatedName("hj.t(J)Lhh;")
    public class219 method3625(long arg0) {
        class219 var3 = (class219) this.field2624.method3677(arg0);
        if (var3 != null) {
            this.field2620.method3573(var3);
        }
        return var3;
    }

    @ObfuscatedName("hj.q(J)V")
    public void method3626(long arg0) {
        class219 var3 = (class219) this.field2624.method3677(arg0);
        if (var3 != null) {
            var3.method3721();
            var3.method3761();
            this.field2622++;
        }
    }

    @ObfuscatedName("hj.i(Lhh;J)V")
    public void method3627(class219 arg0, long arg1) {
        if (this.field2622 == 0) {
            class219 var4 = this.field2620.method3576();
            var4.method3721();
            var4.method3761();
            if (this.field2623 == var4) {
                class219 var5 = this.field2620.method3576();
                var5.method3721();
                var5.method3761();
            }
        } else {
            this.field2622--;
        }
        this.field2624.method3669(arg0, arg1);
        this.field2620.method3573(arg0);
    }

    @ObfuscatedName("hj.a()V")
    public void method3632() {
        this.field2620.method3578();
        this.field2624.method3670();
        this.field2623 = new class219();
        this.field2622 = this.field2621;
    }
}
