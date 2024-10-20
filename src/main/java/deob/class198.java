package deob;

@ObfuscatedName("hf")
public class class198 extends class501 {

    @ObfuscatedName("hf.ag")
    public static class313 field2070 = new class313(64);

    @ObfuscatedName("hf.ak")
    public static class313 field2071 = new class313(30);

    @ObfuscatedName("hf.ap")
    public int field2072;

    @ObfuscatedName("hf.an")
    public int field2073;

    @ObfuscatedName("hf.aj")
    public int field2081 = -1;

    @ObfuscatedName("hf.av")
    public short[] field2075;

    @ObfuscatedName("hf.ab")
    public short[] field2076;

    @ObfuscatedName("hf.ai")
    public short[] field2077;

    @ObfuscatedName("hf.ae")
    public short[] field2078;

    @ObfuscatedName("hf.au")
    public int field2079 = 128;

    @ObfuscatedName("hf.ah")
    public int field2068 = 128;

    @ObfuscatedName("hf.az")
    public int field2074 = 0;

    @ObfuscatedName("hf.ax")
    public int field2082 = 0;

    @ObfuscatedName("hf.ac")
    public int field2083 = 0;

    @ObfuscatedName("pe.aq(Lok;Lok;I)V")
    public static void method6771(class388 arg0, class388 arg1) {
        Statics.field2080 = arg0;
        Statics.field2069 = arg1;
    }

    @ObfuscatedName("gw.ad(II)Lhf;")
    public static class198 method3271(int arg0) {
        class198 var1 = (class198) field2070.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2080.method6539(13, arg0);
        class198 var3 = new class198();
        var3.field2072 = arg0;
        if (var2 != null) {
            var3.method3476(new class547(var2));
        }
        field2070.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hf.ag(Lvp;B)V")
    public void method3476(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3464(arg0, var2);
        }
    }

    @ObfuscatedName("hf.ak(Lvp;II)V")
    public void method3464(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2073 = arg0.method8899();
        } else if (arg1 == 2) {
            this.field2081 = arg0.method8899();
        } else if (arg1 == 4) {
            this.field2079 = arg0.method8899();
        } else if (arg1 == 5) {
            this.field2068 = arg0.method8899();
        } else if (arg1 == 6) {
            this.field2074 = arg0.method8899();
        } else if (arg1 == 7) {
            this.field2082 = arg0.method8804();
        } else if (arg1 == 8) {
            this.field2083 = arg0.method8804();
        } else if (arg1 == 40) {
            int var3 = arg0.method8804();
            this.field2075 = new short[var3];
            this.field2076 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2075[var4] = (short) arg0.method8899();
                this.field2076[var4] = (short) arg0.method8899();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8804();
            this.field2077 = new short[var5];
            this.field2078 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2077[var6] = (short) arg0.method8899();
                this.field2078[var6] = (short) arg0.method8899();
            }
        }
    }

    @ObfuscatedName("hf.ap(II)Llv;")
    public final class294 method3467(int arg0) {
        class294 var2 = this.method3468();
        if (var2 == null) {
            return null;
        }
        class294 var3;
        if (this.field2081 == -1 || arg0 == -1) {
            var3 = var2.method5294(true);
        } else {
            var3 = class210.method5910(this.field2081).method3786(var2, arg0);
        }
        if (this.field2079 != 128 || this.field2068 != 128) {
            var3.method5265(this.field2079, this.field2068, this.field2079);
        }
        if (this.field2074 != 0) {
            if (this.field2074 == 90) {
                var3.method5261();
            }
            if (this.field2074 == 180) {
                var3.method5261();
                var3.method5261();
            }
            if (this.field2074 == 270) {
                var3.method5261();
                var3.method5261();
                var3.method5261();
            }
        }
        return var3;
    }

    @ObfuscatedName("hf.an(B)Llv;")
    public final class294 method3468() {
        class294 var1 = (class294) field2071.method5495((long) this.field2072);
        if (var1 == null) {
            class273 var2 = class273.method4687(Statics.field2069, this.field2073, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2075 != null) {
                for (int var3 = 0; var3 < this.field2075.length; var3++) {
                    var2.method4732(this.field2075[var3], this.field2076[var3]);
                }
            }
            if (this.field2077 != null) {
                for (int var4 = 0; var4 < this.field2077.length; var4++) {
                    var2.method4741(this.field2077[var4], this.field2078[var4]);
                }
            }
            var1 = var2.method4682(this.field2082 + 64, this.field2083 + 850, -30, -50, -30);
            field2071.method5498(var1, (long) this.field2072);
        }
        return var1;
    }

    @ObfuscatedName("jq.aj(I)V")
    public static void method4469() {
        field2070.method5500();
        field2071.method5500();
    }
}
