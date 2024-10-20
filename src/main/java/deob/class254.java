package deob;

@ObfuscatedName("iw")
public class class254 extends class185 {

    @ObfuscatedName("iw.k")
    public static class155 field3243 = new class155(64);

    @ObfuscatedName("iw.d")
    public static class155 field3240 = new class155(30);

    @ObfuscatedName("iw.w")
    public int field3241;

    @ObfuscatedName("iw.v")
    public int field3242;

    @ObfuscatedName("iw.q")
    public int field3244 = -1;

    @ObfuscatedName("iw.z")
    public short[] field3249;

    @ObfuscatedName("iw.t")
    public short[] field3247;

    @ObfuscatedName("iw.e")
    public short[] field3246;

    @ObfuscatedName("iw.s")
    public short[] field3238;

    @ObfuscatedName("iw.p")
    public int field3248 = 128;

    @ObfuscatedName("iw.n")
    public int field3250 = 128;

    @ObfuscatedName("iw.u")
    public int field3239 = 0;

    @ObfuscatedName("iw.h")
    public int field3251 = 0;

    @ObfuscatedName("iw.g")
    public int field3252 = 0;

    @ObfuscatedName("bq.x(II)Liw;")
    public static class254 method1049(int arg0) {
        class254 var1 = (class254) field3243.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3245.method3869(13, arg0);
        class254 var3 = new class254();
        var3.field3241 = arg0;
        if (var2 != null) {
            var3.method4102(new class310(var2));
        }
        field3243.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.m(Lkb;B)V")
    public void method4102(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4100(arg0, var2);
        }
    }

    @ObfuscatedName("iw.k(Lkb;IB)V")
    public void method4100(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3242 = arg0.method5139();
        } else if (arg1 == 2) {
            this.field3244 = arg0.method5139();
        } else if (arg1 == 4) {
            this.field3248 = arg0.method5139();
        } else if (arg1 == 5) {
            this.field3250 = arg0.method5139();
        } else if (arg1 == 6) {
            this.field3239 = arg0.method5139();
        } else if (arg1 == 7) {
            this.field3251 = arg0.method5137();
        } else if (arg1 == 8) {
            this.field3252 = arg0.method5137();
        } else if (arg1 == 40) {
            int var3 = arg0.method5137();
            this.field3249 = new short[var3];
            this.field3247 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3249[var4] = (short) arg0.method5139();
                this.field3247[var4] = (short) arg0.method5139();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5137();
            this.field3246 = new short[var5];
            this.field3238 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3246[var6] = (short) arg0.method5139();
                this.field3238[var6] = (short) arg0.method5139();
            }
        }
    }

    @ObfuscatedName("iw.d(II)Lel;")
    public final class137 method4099(int arg0) {
        class137 var2 = (class137) field3240.method3146((long) this.field3241);
        if (var2 == null) {
            class131 var3 = class131.method2615(Statics.field3237, this.field3242, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3249 != null) {
                for (int var4 = 0; var4 < this.field3249.length; var4++) {
                    var3.method2629(this.field3249[var4], this.field3247[var4]);
                }
            }
            if (this.field3246 != null) {
                for (int var5 = 0; var5 < this.field3246.length; var5++) {
                    var3.method2681(this.field3246[var5], this.field3238[var5]);
                }
            }
            var2 = var3.method2636(this.field3251 + 64, this.field3252 + 850, -30, -50, -30);
            field3240.method3152(var2, (long) this.field3241);
        }
        class137 var6;
        if (this.field3244 == -1 || arg0 == -1) {
            var6 = var2.method2763(true);
        } else {
            var6 = class269.method4110(this.field3244).method4447(var2, arg0);
        }
        if (this.field3248 != 128 || this.field3250 != 128) {
            var6.method2717(this.field3248, this.field3250, this.field3248);
        }
        if (this.field3239 != 0) {
            if (this.field3239 == 90) {
                var6.method2719();
            }
            if (this.field3239 == 180) {
                var6.method2719();
                var6.method2719();
            }
            if (this.field3239 == 270) {
                var6.method2719();
                var6.method2719();
                var6.method2719();
            }
        }
        return var6;
    }
}
