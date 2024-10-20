package deob;

@ObfuscatedName("gy")
public final class class203 {

    @ObfuscatedName("gy.v")
    public class209 field2450 = new class209();

    @ObfuscatedName("gy.s")
    public int field2448;

    @ObfuscatedName("gy.o")
    public int field2449;

    @ObfuscatedName("gy.k")
    public class205 field2447;

    @ObfuscatedName("gy.u")
    public class197 field2451 = new class197();

    public class203(int arg0) {
        this.field2448 = arg0;
        this.field2449 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2447 = new class205(var2);
    }

    @ObfuscatedName("gy.v(J)Lhl;")
    public class209 method3687(long arg0) {
        class209 var3 = (class209) this.field2447.method3735(arg0);
        if (var3 != null) {
            this.field2451.method3631(var3);
        }
        return var3;
    }

    @ObfuscatedName("gy.s(J)V")
    public void method3688(long arg0) {
        class209 var3 = (class209) this.field2447.method3735(arg0);
        if (var3 != null) {
            var3.method3787();
            var3.method3826();
            this.field2449++;
        }
    }

    @ObfuscatedName("gy.o(Lhl;J)V")
    public void method3689(class209 arg0, long arg1) {
        if (this.field2449 == 0) {
            class209 var4 = this.field2451.method3634();
            var4.method3787();
            var4.method3826();
            if (this.field2450 == var4) {
                class209 var5 = this.field2451.method3634();
                var5.method3787();
                var5.method3826();
            }
        } else {
            this.field2449--;
        }
        this.field2447.method3733(arg0, arg1);
        this.field2451.method3631(arg0);
    }

    @ObfuscatedName("gy.k()V")
    public void method3697() {
        this.field2451.method3638();
        this.field2447.method3736();
        this.field2450 = new class209();
        this.field2449 = this.field2448;
    }
}
