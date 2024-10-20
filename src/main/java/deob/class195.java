package deob;

@ObfuscatedName("hn")
public class class195 extends class488 {

    @ObfuscatedName("hn.al")
    public static class304 field2036 = new class304(64);

    @ObfuscatedName("hn.ai")
    public static class304 field2037 = new class304(30);

    @ObfuscatedName("hn.ar")
    public int field2050;

    @ObfuscatedName("hn.as")
    public int field2039;

    @ObfuscatedName("hn.aa")
    public int field2040 = -1;

    @ObfuscatedName("hn.az")
    public short[] field2041;

    @ObfuscatedName("hn.ao")
    public short[] field2042;

    @ObfuscatedName("hn.au")
    public short[] field2045;

    @ObfuscatedName("hn.ak")
    public short[] field2044;

    @ObfuscatedName("hn.ah")
    public int field2038 = 128;

    @ObfuscatedName("hn.aj")
    public int field2034 = 128;

    @ObfuscatedName("hn.af")
    public int field2047 = 0;

    @ObfuscatedName("hn.ax")
    public int field2048 = 0;

    @ObfuscatedName("hn.an")
    public int field2049 = 0;

    @ObfuscatedName("hn.aw(Luq;I)V")
    public void method3452(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3466(arg0, var2);
        }
    }

    @ObfuscatedName("hn.al(Luq;II)V")
    public void method3466(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2039 = arg0.method8593();
        } else if (arg1 == 2) {
            this.field2040 = arg0.method8593();
        } else if (arg1 == 4) {
            this.field2038 = arg0.method8593();
        } else if (arg1 == 5) {
            this.field2034 = arg0.method8593();
        } else if (arg1 == 6) {
            this.field2047 = arg0.method8593();
        } else if (arg1 == 7) {
            this.field2048 = arg0.method8591();
        } else if (arg1 == 8) {
            this.field2049 = arg0.method8591();
        } else if (arg1 == 40) {
            int var3 = arg0.method8591();
            this.field2041 = new short[var3];
            this.field2042 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2041[var4] = (short) arg0.method8593();
                this.field2042[var4] = (short) arg0.method8593();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8591();
            this.field2045 = new short[var5];
            this.field2044 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2045[var6] = (short) arg0.method8593();
                this.field2044[var6] = (short) arg0.method8593();
            }
        }
    }

    @ObfuscatedName("hn.ai(IB)Lkz;")
    public final class285 method3453(int arg0) {
        class285 var2 = this.method3454();
        if (var2 == null) {
            return null;
        }
        class285 var3;
        if (this.field2040 == -1 || arg0 == -1) {
            var3 = var2.method5169(true);
        } else {
            var3 = class207.method3902(this.field2040).method3727(var2, arg0);
        }
        if (this.field2038 != 128 || this.field2034 != 128) {
            var3.method5171(this.field2038, this.field2034, this.field2038);
        }
        if (this.field2047 != 0) {
            if (this.field2047 == 90) {
                var3.method5251();
            }
            if (this.field2047 == 180) {
                var3.method5251();
                var3.method5251();
            }
            if (this.field2047 == 270) {
                var3.method5251();
                var3.method5251();
                var3.method5251();
            }
        }
        return var3;
    }

    @ObfuscatedName("hn.ar(I)Lkz;")
    public final class285 method3454() {
        class285 var1 = (class285) field2037.method5414((long) this.field2050);
        if (var1 == null) {
            class267 var2 = class267.method4644(Statics.field2035, this.field2039, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2041 != null) {
                for (int var3 = 0; var3 < this.field2041.length; var3++) {
                    var2.method4664(this.field2041[var3], this.field2042[var3]);
                }
            }
            if (this.field2045 != null) {
                for (int var4 = 0; var4 < this.field2045.length; var4++) {
                    var2.method4666(this.field2045[var4], this.field2044[var4]);
                }
            }
            var1 = var2.method4723(this.field2048 + 64, this.field2049 + 850, -30, -50, -30);
            field2037.method5421(var1, (long) this.field2050);
        }
        return var1;
    }
}
