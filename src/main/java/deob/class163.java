package deob;

@ObfuscatedName("fh")
public class class163 extends class365 {

    @ObfuscatedName("fh.f")
    public static class236 field1757 = new class236(64);

    @ObfuscatedName("fh.j")
    public static class236 field1758 = new class236(30);

    @ObfuscatedName("fh.m")
    public int field1759;

    @ObfuscatedName("fh.k")
    public int field1770;

    @ObfuscatedName("fh.t")
    public int field1761 = -1;

    @ObfuscatedName("fh.a")
    public short[] field1765;

    @ObfuscatedName("fh.e")
    public short[] field1763;

    @ObfuscatedName("fh.i")
    public short[] field1756;

    @ObfuscatedName("fh.y")
    public short[] field1762;

    @ObfuscatedName("fh.w")
    public int field1766 = 128;

    @ObfuscatedName("fh.g")
    public int field1764 = 128;

    @ObfuscatedName("fh.v")
    public int field1767 = 0;

    @ObfuscatedName("fh.s")
    public int field1769 = 0;

    @ObfuscatedName("fh.c")
    public int field1768 = 0;

    @ObfuscatedName("fs.l(Lkl;Lkl;I)V")
    public static void method2731(class290 arg0, class290 arg1) {
        Statics.field1760 = arg0;
        Statics.field1755 = arg1;
    }

    @ObfuscatedName("fh.f(Lot;I)V")
    public void method2804(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2817(arg0, var2);
        }
    }

    @ObfuscatedName("fh.j(Lot;II)V")
    public void method2817(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1770 = arg0.method6284();
        } else if (arg1 == 2) {
            this.field1761 = arg0.method6284();
        } else if (arg1 == 4) {
            this.field1766 = arg0.method6284();
        } else if (arg1 == 5) {
            this.field1764 = arg0.method6284();
        } else if (arg1 == 6) {
            this.field1767 = arg0.method6284();
        } else if (arg1 == 7) {
            this.field1769 = arg0.method6272();
        } else if (arg1 == 8) {
            this.field1768 = arg0.method6272();
        } else if (arg1 == 40) {
            int var3 = arg0.method6272();
            this.field1765 = new short[var3];
            this.field1763 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1765[var4] = (short) arg0.method6284();
                this.field1763[var4] = (short) arg0.method6284();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6272();
            this.field1756 = new short[var5];
            this.field1762 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1756[var6] = (short) arg0.method6284();
                this.field1762[var6] = (short) arg0.method6284();
            }
        }
    }

    @ObfuscatedName("fh.m(II)Lhl;")
    public final class220 method2814(int arg0) {
        class220 var2 = (class220) field1758.method4223((long) this.field1759);
        if (var2 == null) {
            class206 var3 = class206.method3692(Statics.field1755, this.field1770, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1765 != null) {
                for (int var4 = 0; var4 < this.field1765.length; var4++) {
                    var3.method3663(this.field1765[var4], this.field1763[var4]);
                }
            }
            if (this.field1756 != null) {
                for (int var5 = 0; var5 < this.field1756.length; var5++) {
                    var3.method3664(this.field1756[var5], this.field1762[var5]);
                }
            }
            var2 = var3.method3671(this.field1769 + 64, this.field1768 + 850, -30, -50, -30);
            field1758.method4225(var2, (long) this.field1759);
        }
        class220 var6;
        if (this.field1761 == -1 || arg0 == -1) {
            var6 = var2.method4071(true);
        } else {
            var6 = class172.method2708(this.field1761).method3095(var2, arg0);
        }
        if (this.field1766 != 128 || this.field1764 != 128) {
            var6.method4068(this.field1766, this.field1764, this.field1766);
        }
        if (this.field1767 != 0) {
            if (this.field1767 == 90) {
                var6.method4098();
            }
            if (this.field1767 == 180) {
                var6.method4098();
                var6.method4098();
            }
            if (this.field1767 == 270) {
                var6.method4098();
                var6.method4098();
                var6.method4098();
            }
        }
        return var6;
    }

    @ObfuscatedName("jh.k(I)V")
    public static void method4671() {
        field1757.method4226();
        field1758.method4226();
    }
}
