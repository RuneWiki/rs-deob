package deob;

@ObfuscatedName("lq")
public final class class302 {

    @ObfuscatedName("lq.am")
    public class485 field3148 = new class485();

    @ObfuscatedName("lq.ap")
    public int field3149;

    @ObfuscatedName("lq.af")
    public int field3150;

    @ObfuscatedName("lq.aj")
    public class504 field3151;

    @ObfuscatedName("lq.aq")
    public class399 field3152 = new class399();

    public class302(int arg0) {
        this.field3149 = arg0;
        this.field3150 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3151 = new class504(var2);
    }

    @ObfuscatedName("lq.am(J)Lsc;")
    public class485 method5400(long arg0) {
        class485 var3 = (class485) this.field3151.method8286(arg0);
        if (var3 != null) {
            this.field3152.method6815(var3);
        }
        return var3;
    }

    @ObfuscatedName("lq.ap(J)V")
    public void method5401(long arg0) {
        class485 var3 = (class485) this.field3151.method8286(arg0);
        if (var3 != null) {
            var3.method7988();
            var3.method7986();
            this.field3150++;
        }
    }

    @ObfuscatedName("lq.af(Lsc;J)V")
    public void method5402(class485 arg0, long arg1) {
        if (this.field3150 == 0) {
            class485 var4 = this.field3152.method6806();
            var4.method7988();
            var4.method7986();
            if (this.field3148 == var4) {
                class485 var5 = this.field3152.method6806();
                var5.method7988();
                var5.method7986();
            }
        } else {
            this.field3150--;
        }
        this.field3151.method8292(arg0, arg1);
        this.field3152.method6815(arg0);
    }

    @ObfuscatedName("lq.aj()V")
    public void method5403() {
        this.field3152.method6805();
        this.field3151.method8284();
        this.field3148 = new class485();
        this.field3150 = this.field3149;
    }
}
