package deob;

@ObfuscatedName("gu")
public final class class203 {

    @ObfuscatedName("gu.c")
    public class209 field2449 = new class209();

    @ObfuscatedName("gu.q")
    public int field2450;

    @ObfuscatedName("gu.m")
    public int field2451;

    @ObfuscatedName("gu.j")
    public class205 field2452;

    @ObfuscatedName("gu.g")
    public class197 field2453 = new class197();

    public class203(int arg0) {
        this.field2450 = arg0;
        this.field2451 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2452 = new class205(var2);
    }

    @ObfuscatedName("gu.c(J)Lhc;")
    public class209 method3654(long arg0) {
        class209 var3 = (class209) this.field2452.method3687(arg0);
        if (var3 != null) {
            this.field2453.method3598(var3);
        }
        return var3;
    }

    @ObfuscatedName("gu.q(J)V")
    public void method3645(long arg0) {
        class209 var3 = (class209) this.field2452.method3687(arg0);
        if (var3 != null) {
            var3.method3733();
            var3.method3765();
            this.field2451++;
        }
    }

    @ObfuscatedName("gu.m(Lhc;J)V")
    public void method3646(class209 arg0, long arg1) {
        if (this.field2451 == 0) {
            class209 var4 = this.field2453.method3600();
            var4.method3733();
            var4.method3765();
            if (this.field2449 == var4) {
                class209 var5 = this.field2453.method3600();
                var5.method3733();
                var5.method3765();
            }
        } else {
            this.field2451--;
        }
        this.field2452.method3691(arg0, arg1);
        this.field2453.method3598(arg0);
    }

    @ObfuscatedName("gu.j()V")
    public void method3647() {
        this.field2453.method3611();
        this.field2452.method3689();
        this.field2449 = new class209();
        this.field2451 = this.field2450;
    }
}
