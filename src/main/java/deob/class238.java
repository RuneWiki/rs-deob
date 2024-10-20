package deob;

@ObfuscatedName("jb")
public class class238 implements class250 {

    @ObfuscatedName("jb.aw")
    public class225[] field2645;

    @ObfuscatedName("jb.ay")
    public class379 field2643 = new class379();

    @ObfuscatedName("jb.ar")
    public int field2644;

    @ObfuscatedName("jb.am")
    public int field2646 = 0;

    @ObfuscatedName("jb.as")
    public double field2642 = 1.0D;

    @ObfuscatedName("jb.aj")
    public int field2647 = 128;

    @ObfuscatedName("jb.ag")
    public class360 field2648;

    public class238(class360 arg0, class360 arg1, int arg2, double arg3, int arg4) {
        this.field2648 = arg1;
        this.field2644 = arg2;
        this.field2646 = this.field2644;
        this.field2642 = arg3;
        this.field2647 = arg4;
        int[] var7 = arg0.method6126(0);
        if (var7 == null) {
            this.field2645 = new class225[0];
        } else {
            int var8 = var7.length;
            this.field2645 = new class225[arg0.method6127(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class514 var10 = new class514(arg0.method6117(0, var7[var9]));
                this.field2645[var7[var9]] = new class225(var10);
            }
        }
    }

    @ObfuscatedName("jb.aw(I)I")
    public int method4385() {
        if (this.field2645.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class225[] var3 = this.field2645;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class225 var5 = var3[var4];
            if (var5 != null && var5.field2461 != null) {
                var1 += var5.field2461.length;
                int[] var6 = var5.field2461;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2648.method6122(var8)) {
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

    @ObfuscatedName("jb.ay(D)V")
    public void method4386(double arg0) {
        this.field2642 = arg0;
        this.method4398();
    }

    @ObfuscatedName("jb.ar(IB)[I")
    public int[] method4387(int arg0) {
        class225 var2 = this.field2645[arg0];
        if (var2 != null) {
            if (var2.field2467 != null) {
                this.field2643.method6368(var2);
                var2.field2465 = true;
                return var2.field2467;
            }
            boolean var3 = var2.method4027(this.field2642, this.field2647, this.field2648);
            if (var3) {
                if (this.field2646 == 0) {
                    class225 var4 = (class225) this.field2643.method6375();
                    var4.method4022();
                } else {
                    this.field2646--;
                }
                this.field2643.method6368(var2);
                var2.field2465 = true;
                return var2.field2467;
            }
        }
        return null;
    }

    @ObfuscatedName("jb.am(II)I")
    public int method4388(int arg0) {
        return this.field2645[arg0] == null ? 0 : this.field2645[arg0].field2460;
    }

    @ObfuscatedName("jb.as(IB)Z")
    public boolean method4389(int arg0) {
        return this.field2645[arg0].field2456;
    }

    @ObfuscatedName("jb.aj(II)Z")
    public boolean method4390(int arg0) {
        return this.field2647 == 64;
    }

    @ObfuscatedName("jb.ag(B)V")
    public void method4398() {
        for (int var1 = 0; var1 < this.field2645.length; var1++) {
            if (this.field2645[var1] != null) {
                this.field2645[var1].method4022();
            }
        }
        this.field2643 = new class379();
        this.field2646 = this.field2644;
    }

    @ObfuscatedName("jb.az(II)V")
    public void method4392(int arg0) {
        for (int var2 = 0; var2 < this.field2645.length; var2++) {
            class225 var3 = this.field2645[var2];
            if (var3 != null && var3.field2459 != 0 && var3.field2465) {
                var3.method4023(arg0);
                var3.field2465 = false;
            }
        }
    }
}
