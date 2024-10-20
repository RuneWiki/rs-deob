package deob;

@ObfuscatedName("ic")
public final class class249 {

    @ObfuscatedName("ic.c")
    public class387 field2817 = new class387();

    @ObfuscatedName("ic.l")
    public int field2820;

    @ObfuscatedName("ic.s")
    public int field2818;

    @ObfuscatedName("ic.e")
    public class401 field2816;

    @ObfuscatedName("ic.r")
    public class331 field2819 = new class331();

    public class249(int arg0) {
        this.field2820 = arg0;
        this.field2818 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2816 = new class401(var2);
    }

    @ObfuscatedName("ic.c(J)Lnd;")
    public class387 method4472(long arg0) {
        class387 var3 = (class387) this.field2816.method6448(arg0);
        if (var3 != null) {
            this.field2819.method5428(var3);
        }
        return var3;
    }

    @ObfuscatedName("ic.l(J)V")
    public void method4473(long arg0) {
        class387 var3 = (class387) this.field2816.method6448(arg0);
        if (var3 != null) {
            var3.method6167();
            var3.method6163();
            this.field2818++;
        }
    }

    @ObfuscatedName("ic.s(Lnd;J)V")
    public void method4482(class387 arg0, long arg1) {
        if (this.field2818 == 0) {
            class387 var4 = this.field2819.method5407();
            var4.method6167();
            var4.method6163();
            if (this.field2817 == var4) {
                class387 var5 = this.field2819.method5407();
                var5.method6167();
                var5.method6163();
            }
        } else {
            this.field2818--;
        }
        this.field2816.method6432(arg0, arg1);
        this.field2819.method5428(arg0);
    }

    @ObfuscatedName("ic.e()V")
    public void method4475() {
        this.field2819.method5404();
        this.field2816.method6433();
        this.field2817 = new class387();
        this.field2818 = this.field2820;
    }
}
