package deob;

@ObfuscatedName("ho")
public class class226 implements class234 {

    @ObfuscatedName("ho.f")
    public class214[] field2644;

    @ObfuscatedName("ho.w")
    public class356 field2642 = new class356();

    @ObfuscatedName("ho.v")
    public int field2643;

    @ObfuscatedName("ho.s")
    public int field2641 = 0;

    @ObfuscatedName("ho.z")
    public double field2645 = 1.0D;

    @ObfuscatedName("ho.j")
    public int field2646 = 128;

    @ObfuscatedName("ho.i")
    public class337 field2647;

    public class226(class337 arg0, class337 arg1, int arg2, double arg3, int arg4) {
        this.field2647 = arg1;
        this.field2643 = arg2;
        this.field2641 = this.field2643;
        this.field2645 = arg3;
        this.field2646 = arg4;
        int[] var7 = arg0.method5981(0);
        int var8 = var7.length;
        this.field2644 = new class214[arg0.method5982(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class474 var10 = new class474(arg0.method5990(0, var7[var9]));
            this.field2644[var7[var9]] = new class214(var10);
        }
    }

    @ObfuscatedName("ho.f(B)I")
    public int method4329() {
        int var1 = 0;
        int var2 = 0;
        class214[] var3 = this.field2644;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class214 var5 = var3[var4];
            if (var5 != null && var5.field2447 != null) {
                var1 += var5.field2447.length;
                int[] var6 = var5.field2447;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2647.method6046(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("ho.w(D)V")
    public void method4309(double arg0) {
        this.field2645 = arg0;
        this.method4307();
    }

    @ObfuscatedName("ho.v(II)[I")
    public int[] method4328(int arg0) {
        class214 var2 = this.field2644[arg0];
        if (var2 != null) {
            if (var2.field2453 != null) {
                this.field2642.method6237(var2);
                var2.field2449 = true;
                return var2.field2453;
            }
            boolean var3 = var2.method3973(this.field2645, this.field2646, this.field2647);
            if (var3) {
                if (this.field2641 == 0) {
                    class214 var4 = (class214) this.field2642.method6266();
                    var4.method3974();
                } else {
                    this.field2641--;
                }
                this.field2642.method6237(var2);
                var2.field2449 = true;
                return var2.field2453;
            }
        }
        return null;
    }

    @ObfuscatedName("ho.s(II)I")
    public int method4304(int arg0) {
        return this.field2644[arg0] == null ? 0 : this.field2644[arg0].field2445;
    }

    @ObfuscatedName("ho.z(IS)Z")
    public boolean method4305(int arg0) {
        return this.field2644[arg0].field2454;
    }

    @ObfuscatedName("ho.j(IB)Z")
    public boolean method4311(int arg0) {
        return this.field2646 == 64;
    }

    @ObfuscatedName("ho.i(I)V")
    public void method4307() {
        for (int var1 = 0; var1 < this.field2644.length; var1++) {
            if (this.field2644[var1] != null) {
                this.field2644[var1].method3974();
            }
        }
        this.field2642 = new class356();
        this.field2641 = this.field2643;
    }

    @ObfuscatedName("ho.n(II)V")
    public void method4308(int arg0) {
        for (int var2 = 0; var2 < this.field2644.length; var2++) {
            class214 var3 = this.field2644[var2];
            if (var3 != null && var3.field2451 != 0 && var3.field2449) {
                var3.method3975(arg0);
                var3.field2449 = false;
            }
        }
    }
}
