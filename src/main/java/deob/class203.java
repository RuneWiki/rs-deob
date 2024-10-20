package deob;

@ObfuscatedName("gv")
public final class class203 {

    @ObfuscatedName("gv.g")
    public class209 field2482 = new class209();

    @ObfuscatedName("gv.r")
    public int field2481;

    @ObfuscatedName("gv.e")
    public int field2480;

    @ObfuscatedName("gv.q")
    public class205 field2483;

    @ObfuscatedName("gv.c")
    public class197 field2484 = new class197();

    public class203(int arg0) {
        this.field2481 = arg0;
        this.field2480 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2483 = new class205(var2);
    }

    @ObfuscatedName("gv.g(J)Lhy;")
    public class209 method3879(long arg0) {
        class209 var3 = (class209) this.field2483.method3905(arg0);
        if (var3 != null) {
            this.field2484.method3827(var3);
        }
        return var3;
    }

    @ObfuscatedName("gv.r(J)V")
    public void method3878(long arg0) {
        class209 var3 = (class209) this.field2483.method3905(arg0);
        if (var3 != null) {
            var3.method3952();
            var3.method3989();
            this.field2480++;
        }
    }

    @ObfuscatedName("gv.e(Lhy;J)V")
    public void method3885(class209 arg0, long arg1) {
        if (this.field2480 == 0) {
            class209 var4 = this.field2484.method3830();
            var4.method3952();
            var4.method3989();
            if (this.field2482 == var4) {
                class209 var5 = this.field2484.method3830();
                var5.method3952();
                var5.method3989();
            }
        } else {
            this.field2480--;
        }
        this.field2483.method3907(arg0, arg1);
        this.field2484.method3827(arg0);
    }

    @ObfuscatedName("gv.q()V")
    public void method3880() {
        this.field2484.method3826();
        this.field2483.method3908();
        this.field2482 = new class209();
        this.field2480 = this.field2481;
    }
}
