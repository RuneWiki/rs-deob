package deob;

@ObfuscatedName("em")
public class class156 extends class365 {

    @ObfuscatedName("em.j")
    public static class236 field1660 = new class236(64);

    @ObfuscatedName("em.m")
    public int field1661 = -1;

    @ObfuscatedName("em.k")
    public int[] field1662;

    @ObfuscatedName("em.t")
    public short[] field1663;

    @ObfuscatedName("em.a")
    public short[] field1658;

    @ObfuscatedName("em.e")
    public short[] field1665;

    @ObfuscatedName("em.i")
    public short[] field1668;

    @ObfuscatedName("em.y")
    public int[] field1667 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("em.w")
    public boolean field1671 = false;

    @ObfuscatedName("fc.l(II)Lem;")
    public static class156 method3186(int arg0) {
        class156 var1 = (class156) field1660.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1664.method4756(3, arg0);
        class156 var3 = new class156();
        if (var2 != null) {
            var3.method2683(new class401(var2));
        }
        field1660.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("em.q(Lot;B)V")
    public void method2683(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2694(arg0, var2);
        }
    }

    @ObfuscatedName("em.f(Lot;II)V")
    public void method2694(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1661 = arg0.method6272();
        } else if (arg1 == 2) {
            int var3 = arg0.method6272();
            this.field1662 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1662[var4] = arg0.method6284();
            }
        } else if (arg1 == 3) {
            this.field1671 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6272();
            this.field1663 = new short[var5];
            this.field1658 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1663[var6] = (short) arg0.method6284();
                this.field1658[var6] = (short) arg0.method6284();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6272();
            this.field1665 = new short[var7];
            this.field1668 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1665[var8] = (short) arg0.method6284();
                this.field1668[var8] = (short) arg0.method6284();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1667[arg1 - 60] = arg0.method6284();
        }
    }

    @ObfuscatedName("em.j(I)Z")
    public boolean method2685() {
        if (this.field1662 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1662.length; var2++) {
            if (!Statics.field1657.method4758(this.field1662[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("em.m(I)Lgi;")
    public class206 method2686() {
        if (this.field1662 == null) {
            return null;
        }
        class206[] var1 = new class206[this.field1662.length];
        for (int var2 = 0; var2 < this.field1662.length; var2++) {
            var1[var2] = class206.method3692(Statics.field1657, this.field1662[var2], 0);
        }
        class206 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class206(var1, var1.length);
        }
        if (this.field1663 != null) {
            for (int var4 = 0; var4 < this.field1663.length; var4++) {
                var3.method3663(this.field1663[var4], this.field1658[var4]);
            }
        }
        if (this.field1665 != null) {
            for (int var5 = 0; var5 < this.field1665.length; var5++) {
                var3.method3664(this.field1665[var5], this.field1668[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("em.k(I)Z")
    public boolean method2692() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1667[var2] != -1 && !Statics.field1657.method4758(this.field1667[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("em.t(B)Lgi;")
    public class206 method2688() {
        class206[] var1 = new class206[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1667[var3] != -1) {
                var1[var2++] = class206.method3692(Statics.field1657, this.field1667[var3], 0);
            }
        }
        class206 var4 = new class206(var1, var2);
        if (this.field1663 != null) {
            for (int var5 = 0; var5 < this.field1663.length; var5++) {
                var4.method3663(this.field1663[var5], this.field1658[var5]);
            }
        }
        if (this.field1665 != null) {
            for (int var6 = 0; var6 < this.field1665.length; var6++) {
                var4.method3664(this.field1665[var6], this.field1668[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("er.a(S)V")
    public static void method2537() {
        field1660.method4226();
    }
}
