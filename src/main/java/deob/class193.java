package deob;

@ObfuscatedName("gu")
public final class class193 {

    @ObfuscatedName("gu.d")
    public class204 field3072 = new class204();

    @ObfuscatedName("gu.p")
    public int field3069;

    @ObfuscatedName("gu.v")
    public int field3071;

    @ObfuscatedName("gu.l")
    public class196 field3070;

    @ObfuscatedName("gu.y")
    public class203 field3073 = new class203();

    public class193(int arg0) {
        this.field3069 = arg0;
        this.field3071 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3070 = new class196(var2);
    }

    @ObfuscatedName("gu.d(J)Lgt;")
    public class204 method3553(long arg0) {
        class204 var3 = (class204) this.field3070.method3588(arg0);
        if (var3 != null) {
            this.field3073.method3670(var3);
        }
        return var3;
    }

    @ObfuscatedName("gu.p(J)V")
    public void method3563(long arg0) {
        class204 var3 = (class204) this.field3070.method3588(arg0);
        if (var3 != null) {
            var3.method3715();
            var3.method3680();
            this.field3071++;
        }
    }

    @ObfuscatedName("gu.v(Lgt;J)V")
    public void method3554(class204 arg0, long arg1) {
        if (this.field3071 == 0) {
            class204 var4 = this.field3073.method3667();
            var4.method3715();
            var4.method3680();
            if (this.field3072 == var4) {
                class204 var5 = this.field3073.method3667();
                var5.method3715();
                var5.method3680();
            }
        } else {
            this.field3071--;
        }
        this.field3070.method3596(arg0, arg1);
        this.field3073.method3670(arg0);
    }

    @ObfuscatedName("gu.l()V")
    public void method3556() {
        this.field3073.method3675();
        this.field3070.method3589();
        this.field3072 = new class204();
        this.field3071 = this.field3069;
    }
}
