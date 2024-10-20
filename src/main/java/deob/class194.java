package deob;

@ObfuscatedName("hh")
public class class194 extends class444 {

    @ObfuscatedName("hh.aw")
    public static class280 field2082 = new class280(64);

    @ObfuscatedName("hh.ac")
    public static class280 field2076 = new class280(30);

    @ObfuscatedName("hh.au")
    public int field2073;

    @ObfuscatedName("hh.ab")
    public int field2077;

    @ObfuscatedName("hh.aq")
    public int field2079 = -1;

    @ObfuscatedName("hh.al")
    public short[] field2080;

    @ObfuscatedName("hh.at")
    public short[] field2075;

    @ObfuscatedName("hh.aa")
    public short[] field2083;

    @ObfuscatedName("hh.ay")
    public short[] field2074;

    @ObfuscatedName("hh.ao")
    public int field2084 = 128;

    @ObfuscatedName("hh.ax")
    public int field2085 = 128;

    @ObfuscatedName("hh.ai")
    public int field2081 = 0;

    @ObfuscatedName("hh.ag")
    public int field2087 = 0;

    @ObfuscatedName("hh.ah")
    public int field2088 = 0;

    @ObfuscatedName("er.af(Lnm;Lnm;I)V")
    public static void method2810(class344 arg0, class344 arg1) {
        Statics.field2078 = arg0;
        Statics.field2086 = arg1;
    }

    @ObfuscatedName("dc.an(II)Lhh;")
    public static class194 method2130(int arg0) {
        class194 var1 = (class194) field2082.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2078.method6090(13, arg0);
        class194 var3 = new class194();
        var3.field2073 = arg0;
        if (var2 != null) {
            var3.method3518(new class489(var2));
        }
        field2082.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.aw(Lsg;B)V")
    public void method3518(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3515(arg0, var2);
        }
    }

    @ObfuscatedName("hh.ac(Lsg;IB)V")
    public void method3515(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2077 = arg0.method8250();
        } else if (arg1 == 2) {
            this.field2079 = arg0.method8250();
        } else if (arg1 == 4) {
            this.field2084 = arg0.method8250();
        } else if (arg1 == 5) {
            this.field2085 = arg0.method8250();
        } else if (arg1 == 6) {
            this.field2081 = arg0.method8250();
        } else if (arg1 == 7) {
            this.field2087 = arg0.method8248();
        } else if (arg1 == 8) {
            this.field2088 = arg0.method8248();
        } else if (arg1 == 40) {
            int var3 = arg0.method8248();
            this.field2080 = new short[var3];
            this.field2075 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2080[var4] = (short) arg0.method8250();
                this.field2075[var4] = (short) arg0.method8250();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8248();
            this.field2083 = new short[var5];
            this.field2074 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2083[var6] = (short) arg0.method8250();
                this.field2074[var6] = (short) arg0.method8250();
            }
        }
    }

    @ObfuscatedName("hh.au(II)Lit;")
    public final class232 method3516(int arg0) {
        class232 var2 = this.method3517();
        class232 var3;
        if (this.field2079 == -1 || arg0 == -1) {
            var3 = var2.method4396(true);
        } else {
            var3 = class204.method2139(this.field2079).method3832(var2, arg0);
        }
        if (this.field2084 != 128 || this.field2085 != 128) {
            var3.method4460(this.field2084, this.field2085, this.field2084);
        }
        if (this.field2081 != 0) {
            if (this.field2081 == 90) {
                var3.method4481();
            }
            if (this.field2081 == 180) {
                var3.method4481();
                var3.method4481();
            }
            if (this.field2081 == 270) {
                var3.method4481();
                var3.method4481();
                var3.method4481();
            }
        }
        return var3;
    }

    @ObfuscatedName("hh.ab(I)Lit;")
    public final class232 method3517() {
        class232 var1 = (class232) field2076.method5119((long) this.field2073);
        if (var1 == null) {
            class214 var2 = class214.method4017(Statics.field2086, this.field2077, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2080 != null) {
                for (int var3 = 0; var3 < this.field2080.length; var3++) {
                    var2.method3971(this.field2080[var3], this.field2075[var3]);
                }
            }
            if (this.field2083 != null) {
                for (int var4 = 0; var4 < this.field2083.length; var4++) {
                    var2.method4022(this.field2083[var4], this.field2074[var4]);
                }
            }
            var1 = var2.method3979(this.field2087 + 64, this.field2088 + 850, -30, -50, -30);
            field2076.method5121(var1, (long) this.field2073);
        }
        return var1;
    }
}
