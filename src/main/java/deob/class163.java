package deob;

@ObfuscatedName("fu")
public class class163 extends class364 {

    @ObfuscatedName("fu.m")
    public static class236 field1756 = new class236(64);

    @ObfuscatedName("fu.k")
    public static class236 field1760 = new class236(30);

    @ObfuscatedName("fu.o")
    public int field1755;

    @ObfuscatedName("fu.g")
    public int field1766;

    @ObfuscatedName("fu.z")
    public int field1751 = -1;

    @ObfuscatedName("fu.a")
    public short[] field1758;

    @ObfuscatedName("fu.u")
    public short[] field1759;

    @ObfuscatedName("fu.e")
    public short[] field1753;

    @ObfuscatedName("fu.l")
    public short[] field1761;

    @ObfuscatedName("fu.y")
    public int field1762 = 128;

    @ObfuscatedName("fu.v")
    public int field1763 = 128;

    @ObfuscatedName("fu.f")
    public int field1764 = 0;

    @ObfuscatedName("fu.s")
    public int field1765 = 0;

    @ObfuscatedName("fu.h")
    public int field1768 = 0;

    @ObfuscatedName("gc.n(Lkk;Lkk;B)V")
    public static void method3502(class290 arg0, class290 arg1) {
        Statics.field1757 = arg0;
        Statics.field1752 = arg1;
    }

    @ObfuscatedName("ei.c(IB)Lfu;")
    public static class163 method2520(int arg0) {
        class163 var1 = (class163) field1756.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1757.method4710(13, arg0);
        class163 var3 = new class163();
        var3.field1755 = arg0;
        if (var2 != null) {
            var3.method2747(new class400(var2));
        }
        field1756.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fu.m(Lot;I)V")
    public void method2747(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2748(arg0, var2);
        }
    }

    @ObfuscatedName("fu.k(Lot;IB)V")
    public void method2748(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1766 = arg0.method6219();
        } else if (arg1 == 2) {
            this.field1751 = arg0.method6219();
        } else if (arg1 == 4) {
            this.field1762 = arg0.method6219();
        } else if (arg1 == 5) {
            this.field1763 = arg0.method6219();
        } else if (arg1 == 6) {
            this.field1764 = arg0.method6219();
        } else if (arg1 == 7) {
            this.field1765 = arg0.method6217();
        } else if (arg1 == 8) {
            this.field1768 = arg0.method6217();
        } else if (arg1 == 40) {
            int var3 = arg0.method6217();
            this.field1758 = new short[var3];
            this.field1759 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1758[var4] = (short) arg0.method6219();
                this.field1759[var4] = (short) arg0.method6219();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6217();
            this.field1753 = new short[var5];
            this.field1761 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1753[var6] = (short) arg0.method6219();
                this.field1761[var6] = (short) arg0.method6219();
            }
        }
    }

    @ObfuscatedName("fu.o(II)Lhg;")
    public final class220 method2749(int arg0) {
        class220 var2 = (class220) field1760.method4167((long) this.field1755);
        if (var2 == null) {
            class206 var3 = class206.method3631(Statics.field1752, this.field1766, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1758 != null) {
                for (int var4 = 0; var4 < this.field1758.length; var4++) {
                    var3.method3673(this.field1758[var4], this.field1759[var4]);
                }
            }
            if (this.field1753 != null) {
                for (int var5 = 0; var5 < this.field1753.length; var5++) {
                    var3.method3620(this.field1753[var5], this.field1761[var5]);
                }
            }
            var2 = var3.method3627(this.field1765 + 64, this.field1768 + 850, -30, -50, -30);
            field1760.method4169(var2, (long) this.field1755);
        }
        class220 var6;
        if (this.field1751 == -1 || arg0 == -1) {
            var6 = var2.method4016(true);
        } else {
            var6 = class172.method269(this.field1751).method3043(var2, arg0);
        }
        if (this.field1762 != 128 || this.field1763 != 128) {
            var6.method4030(this.field1762, this.field1763, this.field1762);
        }
        if (this.field1764 != 0) {
            if (this.field1764 == 90) {
                var6.method4049();
            }
            if (this.field1764 == 180) {
                var6.method4049();
                var6.method4049();
            }
            if (this.field1764 == 270) {
                var6.method4049();
                var6.method4049();
                var6.method4049();
            }
        }
        return var6;
    }
}
