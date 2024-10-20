package deob;

@ObfuscatedName("ho")
public class class198 extends class457 {

    @ObfuscatedName("ho.av")
    public static class287 field2064 = new class287(64);

    @ObfuscatedName("ho.as")
    public static class287 field2062 = new class287(30);

    @ObfuscatedName("ho.ax")
    public int field2069;

    @ObfuscatedName("ho.ap")
    public int field2067;

    @ObfuscatedName("ho.ab")
    public int field2068 = -1;

    @ObfuscatedName("ho.ak")
    public short[] field2070;

    @ObfuscatedName("ho.ae")
    public short[] field2078;

    @ObfuscatedName("ho.af")
    public short[] field2077;

    @ObfuscatedName("ho.ao")
    public short[] field2072;

    @ObfuscatedName("ho.aa")
    public int field2073 = 128;

    @ObfuscatedName("ho.aj")
    public int field2074 = 128;

    @ObfuscatedName("ho.ad")
    public int field2075 = 0;

    @ObfuscatedName("ho.ac")
    public int field2076 = 0;

    @ObfuscatedName("ho.ag")
    public int field2065 = 0;

    @ObfuscatedName("cq.at(Lnq;Lnq;I)V")
    public static void method1794(class357 arg0, class357 arg1) {
        Statics.field2079 = arg0;
        Statics.field2063 = arg1;
    }

    @ObfuscatedName("cu.an(II)Lho;")
    public static class198 method983(int arg0) {
        class198 var1 = (class198) field2064.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2079.method6080(13, arg0);
        class198 var3 = new class198();
        var3.field2069 = arg0;
        if (var2 != null) {
            var3.method3432(new class501(var2));
        }
        field2064.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.av(Ltz;I)V")
    public void method3432(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3433(arg0, var2);
        }
    }

    @ObfuscatedName("ho.as(Ltz;II)V")
    public void method3433(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2067 = arg0.method8195();
        } else if (arg1 == 2) {
            this.field2068 = arg0.method8195();
        } else if (arg1 == 4) {
            this.field2073 = arg0.method8195();
        } else if (arg1 == 5) {
            this.field2074 = arg0.method8195();
        } else if (arg1 == 6) {
            this.field2075 = arg0.method8195();
        } else if (arg1 == 7) {
            this.field2076 = arg0.method8129();
        } else if (arg1 == 8) {
            this.field2065 = arg0.method8129();
        } else if (arg1 == 40) {
            int var3 = arg0.method8129();
            this.field2070 = new short[var3];
            this.field2078 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2070[var4] = (short) arg0.method8195();
                this.field2078[var4] = (short) arg0.method8195();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8129();
            this.field2077 = new short[var5];
            this.field2072 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2077[var6] = (short) arg0.method8195();
                this.field2072[var6] = (short) arg0.method8195();
            }
        }
    }

    @ObfuscatedName("ho.ax(II)Ljd;")
    public final class239 method3438(int arg0) {
        class239 var2 = this.method3437();
        class239 var3;
        if (this.field2068 == -1 || arg0 == -1) {
            var3 = var2.method4412(true);
        } else {
            var3 = class208.method4648(this.field2068).method3723(var2, arg0);
        }
        if (this.field2073 != 128 || this.field2074 != 128) {
            var3.method4430(this.field2073, this.field2074, this.field2073);
        }
        if (this.field2075 != 0) {
            if (this.field2075 == 90) {
                var3.method4427();
            }
            if (this.field2075 == 180) {
                var3.method4427();
                var3.method4427();
            }
            if (this.field2075 == 270) {
                var3.method4427();
                var3.method4427();
                var3.method4427();
            }
        }
        return var3;
    }

    @ObfuscatedName("ho.ap(B)Ljd;")
    public final class239 method3437() {
        class239 var1 = (class239) field2062.method5121((long) this.field2069);
        if (var1 == null) {
            class221 var2 = class221.method3913(Statics.field2063, this.field2067, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2070 != null) {
                for (int var3 = 0; var3 < this.field2070.length; var3++) {
                    var2.method3995(this.field2070[var3], this.field2078[var3]);
                }
            }
            if (this.field2077 != null) {
                for (int var4 = 0; var4 < this.field2077.length; var4++) {
                    var2.method3965(this.field2077[var4], this.field2072[var4]);
                }
            }
            var1 = var2.method3934(this.field2076 + 64, this.field2065 + 850, -30, -50, -30);
            field2062.method5123(var1, (long) this.field2069);
        }
        return var1;
    }

    @ObfuscatedName("kb.ab(B)V")
    public static void method5025() {
        field2064.method5124();
        field2062.method5124();
    }
}
