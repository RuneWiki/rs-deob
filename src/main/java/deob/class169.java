package deob;

@ObfuscatedName("fz")
public class class169 extends class382 {

    @ObfuscatedName("fz.b")
    public static class249 field1816 = new class249(64);

    @ObfuscatedName("fz.p")
    public char field1817;

    @ObfuscatedName("fz.m")
    public char field1821;

    @ObfuscatedName("fz.t")
    public String field1820 = class295.field3477;

    @ObfuscatedName("fz.s")
    public int field1819;

    @ObfuscatedName("fz.j")
    public int field1815 = 0;

    @ObfuscatedName("fz.w")
    public int[] field1818;

    @ObfuscatedName("fz.n")
    public int[] field1823;

    @ObfuscatedName("fz.r")
    public String[] field1824;

    @ObfuscatedName("dq.c(II)Lfz;")
    public static class169 method2550(int arg0) {
        class169 var1 = (class169) field1816.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1822.method5053(8, arg0);
        class169 var3 = new class169();
        if (var2 != null) {
            var3.method2973(new class419(var2));
        }
        field1816.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fz.b(Lpi;I)V")
    public void method2973(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method2974(arg0, var2);
        }
    }

    @ObfuscatedName("fz.p(Lpi;IB)V")
    public void method2974(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1817 = (char) arg0.method6781();
        } else if (arg1 == 2) {
            this.field1821 = (char) arg0.method6781();
        } else if (arg1 == 3) {
            this.field1820 = arg0.method6707();
        } else if (arg1 == 4) {
            this.field1819 = arg0.method6675();
        } else if (arg1 == 5) {
            this.field1815 = arg0.method6672();
            this.field1818 = new int[this.field1815];
            this.field1824 = new String[this.field1815];
            for (int var3 = 0; var3 < this.field1815; var3++) {
                this.field1818[var3] = arg0.method6675();
                this.field1824[var3] = arg0.method6707();
            }
        } else if (arg1 == 6) {
            this.field1815 = arg0.method6672();
            this.field1818 = new int[this.field1815];
            this.field1823 = new int[this.field1815];
            for (int var4 = 0; var4 < this.field1815; var4++) {
                this.field1818[var4] = arg0.method6675();
                this.field1823[var4] = arg0.method6675();
            }
        }
    }

    @ObfuscatedName("fz.m(I)I")
    public int method2975() {
        return this.field1815;
    }
}
