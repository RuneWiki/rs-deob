package deob;

@ObfuscatedName("eg")
public class class156 extends class364 {

    @ObfuscatedName("eg.k")
    public static class236 field1653 = new class236(64);

    @ObfuscatedName("eg.o")
    public int field1654 = -1;

    @ObfuscatedName("eg.g")
    public int[] field1655;

    @ObfuscatedName("eg.z")
    public short[] field1656;

    @ObfuscatedName("eg.a")
    public short[] field1664;

    @ObfuscatedName("eg.u")
    public short[] field1658;

    @ObfuscatedName("eg.e")
    public short[] field1663;

    @ObfuscatedName("eg.l")
    public int[] field1660 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("eg.y")
    public boolean field1661 = false;

    @ObfuscatedName("cb.n(Lkk;Lkk;I)V")
    public static void method2014(class290 arg0, class290 arg1) {
        Statics.field1652 = arg0;
        Statics.field3772 = arg1;
        Statics.field3215 = Statics.field1652.method4720(3);
    }

    @ObfuscatedName("de.c(IB)Leg;")
    public static class156 method2376(int arg0) {
        class156 var1 = (class156) field1653.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1652.method4710(3, arg0);
        class156 var3 = new class156();
        if (var2 != null) {
            var3.method2629(new class400(var2));
        }
        field1653.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eg.m(Lot;I)V")
    public void method2629(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2631(arg0, var2);
        }
    }

    @ObfuscatedName("eg.k(Lot;II)V")
    public void method2631(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1654 = arg0.method6217();
        } else if (arg1 == 2) {
            int var3 = arg0.method6217();
            this.field1655 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1655[var4] = arg0.method6219();
            }
        } else if (arg1 == 3) {
            this.field1661 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6217();
            this.field1656 = new short[var5];
            this.field1664 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1656[var6] = (short) arg0.method6219();
                this.field1664[var6] = (short) arg0.method6219();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6217();
            this.field1658 = new short[var7];
            this.field1663 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1658[var8] = (short) arg0.method6219();
                this.field1663[var8] = (short) arg0.method6219();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1660[arg1 - 60] = arg0.method6219();
        }
    }

    @ObfuscatedName("eg.o(S)Z")
    public boolean method2632() {
        if (this.field1655 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1655.length; var2++) {
            if (!Statics.field3772.method4735(this.field1655[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.g(I)Lgl;")
    public class206 method2633() {
        if (this.field1655 == null) {
            return null;
        }
        class206[] var1 = new class206[this.field1655.length];
        for (int var2 = 0; var2 < this.field1655.length; var2++) {
            var1[var2] = class206.method3631(Statics.field3772, this.field1655[var2], 0);
        }
        class206 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class206(var1, var1.length);
        }
        if (this.field1656 != null) {
            for (int var4 = 0; var4 < this.field1656.length; var4++) {
                var3.method3673(this.field1656[var4], this.field1664[var4]);
            }
        }
        if (this.field1658 != null) {
            for (int var5 = 0; var5 < this.field1658.length; var5++) {
                var3.method3620(this.field1658[var5], this.field1663[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("eg.z(B)Z")
    public boolean method2634() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1660[var2] != -1 && !Statics.field3772.method4735(this.field1660[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.a(I)Lgl;")
    public class206 method2635() {
        class206[] var1 = new class206[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1660[var3] != -1) {
                var1[var2++] = class206.method3631(Statics.field3772, this.field1660[var3], 0);
            }
        }
        class206 var4 = new class206(var1, var2);
        if (this.field1656 != null) {
            for (int var5 = 0; var5 < this.field1656.length; var5++) {
                var4.method3673(this.field1656[var5], this.field1664[var5]);
            }
        }
        if (this.field1658 != null) {
            for (int var6 = 0; var6 < this.field1658.length; var6++) {
                var4.method3620(this.field1658[var6], this.field1663[var6]);
            }
        }
        return var4;
    }
}
