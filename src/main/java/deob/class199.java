package deob;

@ObfuscatedName("hw")
public class class199 extends class470 {

    @ObfuscatedName("hw.ar")
    public static class289 field2062 = new class289(64);

    @ObfuscatedName("hw.am")
    public static class289 field2064 = new class289(30);

    @ObfuscatedName("hw.as")
    public int field2075;

    @ObfuscatedName("hw.aj")
    public int field2065;

    @ObfuscatedName("hw.ag")
    public int field2061 = -1;

    @ObfuscatedName("hw.az")
    public short[] field2067;

    @ObfuscatedName("hw.av")
    public short[] field2068;

    @ObfuscatedName("hw.ap")
    public short[] field2072;

    @ObfuscatedName("hw.aq")
    public short[] field2070;

    @ObfuscatedName("hw.at")
    public int field2071 = 128;

    @ObfuscatedName("hw.ah")
    public int field2063 = 128;

    @ObfuscatedName("hw.ax")
    public int field2073 = 0;

    @ObfuscatedName("hw.aa")
    public int field2074 = 0;

    @ObfuscatedName("hw.au")
    public int field2077 = 0;

    @ObfuscatedName("hi.aw(IB)Lhw;")
    public static class199 method3394(int arg0) {
        class199 var1 = (class199) field2062.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2069.method6117(13, arg0);
        class199 var3 = new class199();
        var3.field2075 = arg0;
        if (var2 != null) {
            var3.method3440(new class514(var2));
        }
        field2062.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.ay(Lty;B)V")
    public void method3440(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3441(arg0, var2);
        }
    }

    @ObfuscatedName("hw.ar(Lty;II)V")
    public void method3441(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2065 = arg0.method8246();
        } else if (arg1 == 2) {
            this.field2061 = arg0.method8246();
        } else if (arg1 == 4) {
            this.field2071 = arg0.method8246();
        } else if (arg1 == 5) {
            this.field2063 = arg0.method8246();
        } else if (arg1 == 6) {
            this.field2073 = arg0.method8246();
        } else if (arg1 == 7) {
            this.field2074 = arg0.method8244();
        } else if (arg1 == 8) {
            this.field2077 = arg0.method8244();
        } else if (arg1 == 40) {
            int var3 = arg0.method8244();
            this.field2067 = new short[var3];
            this.field2068 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2067[var4] = (short) arg0.method8246();
                this.field2068[var4] = (short) arg0.method8246();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8244();
            this.field2072 = new short[var5];
            this.field2070 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2072[var6] = (short) arg0.method8246();
                this.field2070[var6] = (short) arg0.method8246();
            }
        }
    }

    @ObfuscatedName("hw.am(II)Ljo;")
    public final class241 method3442(int arg0) {
        class241 var2 = this.method3443();
        class241 var3;
        if (this.field2061 == -1 || arg0 == -1) {
            var3 = var2.method4424(true);
        } else {
            var3 = class210.method2904(this.field2061).method3734(var2, arg0);
        }
        if (this.field2071 != 128 || this.field2063 != 128) {
            var3.method4443(this.field2071, this.field2063, this.field2071);
        }
        if (this.field2073 != 0) {
            if (this.field2073 == 90) {
                var3.method4438();
            }
            if (this.field2073 == 180) {
                var3.method4438();
                var3.method4438();
            }
            if (this.field2073 == 270) {
                var3.method4438();
                var3.method4438();
                var3.method4438();
            }
        }
        return var3;
    }

    @ObfuscatedName("hw.as(I)Ljo;")
    public final class241 method3443() {
        class241 var1 = (class241) field2064.method5152((long) this.field2075);
        if (var1 == null) {
            class223 var2 = class223.method3926(Statics.field394, this.field2065, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2067 != null) {
                for (int var3 = 0; var3 < this.field2067.length; var3++) {
                    var2.method3942(this.field2067[var3], this.field2068[var3]);
                }
            }
            if (this.field2072 != null) {
                for (int var4 = 0; var4 < this.field2072.length; var4++) {
                    var2.method3943(this.field2072[var4], this.field2070[var4]);
                }
            }
            var1 = var2.method3950(this.field2074 + 64, this.field2077 + 850, -30, -50, -30);
            field2064.method5149(var1, (long) this.field2075);
        }
        return var1;
    }

    @ObfuscatedName("hh.aj(B)V")
    public static void method3267() {
        field2062.method5146();
        field2064.method5146();
    }
}
