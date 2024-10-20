package deob;

@ObfuscatedName("hq")
public class class194 extends class485 {

    @ObfuscatedName("hq.af")
    public static class302 field2019 = new class302(64);

    @ObfuscatedName("hq.aj")
    public static class302 field2022 = new class302(30);

    @ObfuscatedName("hq.aq")
    public int field2031;

    @ObfuscatedName("hq.ar")
    public int field2020;

    @ObfuscatedName("hq.ag")
    public int field2023 = -1;

    @ObfuscatedName("hq.ao")
    public short[] field2024;

    @ObfuscatedName("hq.ae")
    public short[] field2025;

    @ObfuscatedName("hq.aa")
    public short[] field2026;

    @ObfuscatedName("hq.au")
    public short[] field2027;

    @ObfuscatedName("hq.an")
    public int field2028 = 128;

    @ObfuscatedName("hq.ad")
    public int field2029 = 128;

    @ObfuscatedName("hq.ax")
    public int field2030 = 0;

    @ObfuscatedName("hq.aw")
    public int field2018 = 0;

    @ObfuscatedName("hq.az")
    public int field2032 = 0;

    @ObfuscatedName("ef.am(Low;Low;I)V")
    public static void method2903(class375 arg0, class375 arg1) {
        Statics.field2034 = arg0;
        Statics.field1342 = arg1;
    }

    @ObfuscatedName("fy.ap(II)Lhq;")
    public static class194 method3107(int arg0) {
        class194 var1 = (class194) field2019.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2034.method6396(13, arg0);
        class194 var3 = new class194();
        var3.field2031 = arg0;
        if (var2 != null) {
            var3.method3470(new class531(var2));
        }
        field2019.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hq.af(Luk;B)V")
    public void method3470(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3471(arg0, var2);
        }
    }

    @ObfuscatedName("hq.aj(Luk;II)V")
    public void method3471(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2020 = arg0.method8775();
        } else if (arg1 == 2) {
            this.field2023 = arg0.method8775();
        } else if (arg1 == 4) {
            this.field2028 = arg0.method8775();
        } else if (arg1 == 5) {
            this.field2029 = arg0.method8775();
        } else if (arg1 == 6) {
            this.field2030 = arg0.method8775();
        } else if (arg1 == 7) {
            this.field2018 = arg0.method8561();
        } else if (arg1 == 8) {
            this.field2032 = arg0.method8561();
        } else if (arg1 == 40) {
            int var3 = arg0.method8561();
            this.field2024 = new short[var3];
            this.field2025 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2024[var4] = (short) arg0.method8775();
                this.field2025[var4] = (short) arg0.method8775();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8561();
            this.field2026 = new short[var5];
            this.field2027 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2026[var6] = (short) arg0.method8775();
                this.field2027[var6] = (short) arg0.method8775();
            }
        }
    }

    @ObfuscatedName("hq.aq(IB)Lko;")
    public final class283 method3472(int arg0) {
        class283 var2 = this.method3473();
        class283 var3;
        if (this.field2023 == -1 || arg0 == -1) {
            var3 = var2.method5133(true);
        } else {
            var3 = class205.method73(this.field2023).method3770(var2, arg0);
        }
        if (this.field2028 != 128 || this.field2029 != 128) {
            var3.method5153(this.field2028, this.field2029, this.field2028);
        }
        if (this.field2030 != 0) {
            if (this.field2030 == 90) {
                var3.method5148();
            }
            if (this.field2030 == 180) {
                var3.method5148();
                var3.method5148();
            }
            if (this.field2030 == 270) {
                var3.method5148();
                var3.method5148();
                var3.method5148();
            }
        }
        return var3;
    }

    @ObfuscatedName("hq.ar(I)Lko;")
    public final class283 method3473() {
        class283 var1 = (class283) field2022.method5400((long) this.field2031);
        if (var1 == null) {
            class265 var2 = class265.method4650(Statics.field1342, this.field2020, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2024 != null) {
                for (int var3 = 0; var3 < this.field2024.length; var3++) {
                    var2.method4664(this.field2024[var3], this.field2025[var3]);
                }
            }
            if (this.field2026 != null) {
                for (int var4 = 0; var4 < this.field2026.length; var4++) {
                    var2.method4665(this.field2026[var4], this.field2027[var4]);
                }
            }
            var1 = var2.method4672(this.field2018 + 64, this.field2032 + 850, -30, -50, -30);
            field2022.method5402(var1, (long) this.field2031);
        }
        return var1;
    }
}
