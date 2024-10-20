package deob;

@ObfuscatedName("gt")
public final class class205 {

    @ObfuscatedName("gt.v")
    public int field2460;

    @ObfuscatedName("gt.s")
    public class207[] field2456;

    @ObfuscatedName("gt.o")
    public class207 field2458;

    @ObfuscatedName("gt.k")
    public class207 field2459;

    @ObfuscatedName("gt.u")
    public int field2457 = 0;

    public class205(int arg0) {
        this.field2460 = arg0;
        this.field2456 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2456[var2] = new class207();
            var3.field2463 = var3;
            var3.field2465 = var3;
        }
    }

    @ObfuscatedName("gt.v(J)Lgl;")
    public class207 method3735(long arg0) {
        class207 var3 = this.field2456[(int) (arg0 & (long) (this.field2460 - 1))];
        for (this.field2458 = var3.field2463; this.field2458 != var3; this.field2458 = this.field2458.field2463) {
            if (this.field2458.field2464 == arg0) {
                class207 var4 = this.field2458;
                this.field2458 = this.field2458.field2463;
                return var4;
            }
        }
        this.field2458 = null;
        return null;
    }

    @ObfuscatedName("gt.s(Lgl;J)V")
    public void method3733(class207 arg0, long arg1) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        class207 var4 = this.field2456[(int) (arg1 & (long) (this.field2460 - 1))];
        arg0.field2465 = var4.field2465;
        arg0.field2463 = var4;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
        arg0.field2464 = arg1;
    }

    @ObfuscatedName("gt.o()V")
    public void method3736() {
        for (int var1 = 0; var1 < this.field2460; var1++) {
            class207 var2 = this.field2456[var1];
            while (true) {
                class207 var3 = var2.field2463;
                if (var2 == var3) {
                    break;
                }
                var3.method3787();
            }
        }
        this.field2458 = null;
        this.field2459 = null;
    }

    @ObfuscatedName("gt.k()Lgl;")
    public class207 method3741() {
        this.field2457 = 0;
        return this.method3734();
    }

    @ObfuscatedName("gt.u()Lgl;")
    public class207 method3734() {
        if (this.field2457 > 0 && this.field2456[this.field2457 - 1] != this.field2459) {
            class207 var1 = this.field2459;
            this.field2459 = var1.field2463;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2457 >= this.field2460) {
                return null;
            }
            var2 = this.field2456[this.field2457++].field2463;
        } while (this.field2456[this.field2457 - 1] == var2);
        this.field2459 = var2.field2463;
        return var2;
    }
}
