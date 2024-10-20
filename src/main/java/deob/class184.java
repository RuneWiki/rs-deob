package deob;

@ObfuscatedName("hq")
public class class184 extends class501 {

    @ObfuscatedName("hq.ak")
    public static class313 field1923 = new class313(64);

    @ObfuscatedName("hq.ap")
    public int field1920 = -1;

    @ObfuscatedName("hq.an")
    public int[] field1917;

    @ObfuscatedName("hq.aj")
    public short[] field1922;

    @ObfuscatedName("hq.av")
    public short[] field1921;

    @ObfuscatedName("hq.ab")
    public short[] field1924;

    @ObfuscatedName("hq.ai")
    public short[] field1925;

    @ObfuscatedName("hq.ae")
    public int[] field1926 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hq.au")
    public boolean field1927 = false;

    @ObfuscatedName("bv.aq(IB)Lhq;")
    public static class184 method826(int arg0) {
        class184 var1 = (class184) field1923.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        } else if (Statics.field1919 == null) {
            return null;
        } else {
            byte[] var2 = Statics.field1919.method6539(3, arg0);
            class184 var3 = new class184();
            if (var2 != null) {
                var3.method3340(new class547(var2));
            }
            field1923.method5498(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("hq.ad(Lvp;I)V")
    public void method3340(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3325(arg0, var2);
        }
    }

    @ObfuscatedName("hq.ag(Lvp;IB)V")
    public void method3325(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1920 = arg0.method8804();
        } else if (arg1 == 2) {
            int var3 = arg0.method8804();
            this.field1917 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1917[var4] = arg0.method8899();
            }
        } else if (arg1 == 3) {
            this.field1927 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8804();
            this.field1922 = new short[var5];
            this.field1921 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1922[var6] = (short) arg0.method8899();
                this.field1921[var6] = (short) arg0.method8899();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8804();
            this.field1924 = new short[var7];
            this.field1925 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1924[var8] = (short) arg0.method8899();
                this.field1925[var8] = (short) arg0.method8899();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1926[arg1 - 60] = arg0.method8899();
        }
    }

    @ObfuscatedName("hq.ak(I)Z")
    public boolean method3329() {
        if (this.field1917 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1917.length; var2++) {
            if (!Statics.field1918.method6541(this.field1917[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hq.ap(I)Lkr;")
    public class273 method3330() {
        if (this.field1917 == null) {
            return null;
        }
        class273[] var1 = new class273[this.field1917.length];
        for (int var2 = 0; var2 < this.field1917.length; var2++) {
            var1[var2] = class273.method4687(Statics.field1918, this.field1917[var2], 0);
        }
        class273 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class273(var1, var1.length);
        }
        if (this.field1922 != null) {
            for (int var4 = 0; var4 < this.field1922.length; var4++) {
                var3.method4732(this.field1922[var4], this.field1921[var4]);
            }
        }
        if (this.field1924 != null) {
            for (int var5 = 0; var5 < this.field1924.length; var5++) {
                var3.method4741(this.field1924[var5], this.field1925[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hq.an(B)Z")
    public boolean method3327() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1926[var2] != -1 && !Statics.field1918.method6541(this.field1926[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hq.aj(I)Lkr;")
    public class273 method3326() {
        class273[] var1 = new class273[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1926[var3] != -1) {
                var1[var2++] = class273.method4687(Statics.field1918, this.field1926[var3], 0);
            }
        }
        class273 var4 = new class273(var1, var2);
        if (this.field1922 != null) {
            for (int var5 = 0; var5 < this.field1922.length; var5++) {
                var4.method4732(this.field1922[var5], this.field1921[var5]);
            }
        }
        if (this.field1924 != null) {
            for (int var6 = 0; var6 < this.field1924.length; var6++) {
                var4.method4741(this.field1924[var6], this.field1925[var6]);
            }
        }
        return var4;
    }
}
