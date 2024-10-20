package deob;

@ObfuscatedName("hj")
public class class200 extends class511 {

    @ObfuscatedName("hj.ak")
    public static class316 field2083 = new class316(64);

    @ObfuscatedName("hj.aj")
    public static class316 field2084 = new class316(30);

    @ObfuscatedName("hj.ai")
    public int field2081;

    @ObfuscatedName("hj.ay")
    public int field2086;

    @ObfuscatedName("hj.as")
    public int field2087 = -1;

    @ObfuscatedName("hj.ae")
    public short[] field2088;

    @ObfuscatedName("hj.am")
    public short[] field2089;

    @ObfuscatedName("hj.at")
    public short[] field2091;

    @ObfuscatedName("hj.au")
    public short[] field2093;

    @ObfuscatedName("hj.an")
    public int field2092 = 128;

    @ObfuscatedName("hj.ao")
    public int field2082 = 128;

    @ObfuscatedName("hj.af")
    public int field2094 = 0;

    @ObfuscatedName("hj.ar")
    public int field2095 = 0;

    @ObfuscatedName("hj.ab")
    public int field2096 = 0;

    @ObfuscatedName("nl.ap(II)Lhj;")
    public static class200 method6851(int arg0) {
        class200 var1 = (class200) field2083.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2097.method7009(13, arg0);
        class200 var3 = new class200();
        var3.field2081 = arg0;
        if (var2 != null) {
            var3.method3799(new class558(var2));
        }
        field2083.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hj.aw(Lvl;I)V")
    public void method3799(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3798(arg0, var2);
        }
    }

    @ObfuscatedName("hj.ak(Lvl;II)V")
    public void method3798(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2086 = arg0.method9260();
        } else if (arg1 == 2) {
            this.field2087 = arg0.method9260();
        } else if (arg1 == 4) {
            this.field2092 = arg0.method9260();
        } else if (arg1 == 5) {
            this.field2082 = arg0.method9260();
        } else if (arg1 == 6) {
            this.field2094 = arg0.method9260();
        } else if (arg1 == 7) {
            this.field2095 = arg0.method9258();
        } else if (arg1 == 8) {
            this.field2096 = arg0.method9258();
        } else if (arg1 == 40) {
            int var3 = arg0.method9258();
            this.field2088 = new short[var3];
            this.field2089 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2088[var4] = (short) arg0.method9260();
                this.field2089[var4] = (short) arg0.method9260();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method9258();
            this.field2091 = new short[var5];
            this.field2093 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2091[var6] = (short) arg0.method9260();
                this.field2093[var6] = (short) arg0.method9260();
            }
        }
    }

    @ObfuscatedName("hj.aj(II)Ljy;")
    public final class256 method3812(int arg0) {
        class256 var2 = this.method3802();
        if (var2 == null) {
            return null;
        }
        class256 var3;
        if (this.field2087 == -1 || arg0 == -1) {
            var3 = var2.method4998(true);
        } else {
            var3 = class213.method6692(this.field2087).method4096(var2, arg0);
        }
        if (this.field2092 != 128 || this.field2082 != 128) {
            var3.method4999(this.field2092, this.field2082, this.field2092);
        }
        if (this.field2094 != 0) {
            if (this.field2094 == 90) {
                var3.method5073();
            }
            if (this.field2094 == 180) {
                var3.method5073();
                var3.method5073();
            }
            if (this.field2094 == 270) {
                var3.method5073();
                var3.method5073();
                var3.method5073();
            }
        }
        return var3;
    }

    @ObfuscatedName("hj.ai(B)Ljy;")
    public final class256 method3802() {
        class256 var1 = (class256) field2084.method5928((long) this.field2081);
        if (var1 == null) {
            class235 var2 = class235.method4408(Statics.field2098, this.field2086, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2088 != null) {
                for (int var3 = 0; var3 < this.field2088.length; var3++) {
                    var2.method4393(this.field2088[var3], this.field2089[var3]);
                }
            }
            if (this.field2091 != null) {
                for (int var4 = 0; var4 < this.field2091.length; var4++) {
                    var2.method4394(this.field2091[var4], this.field2093[var4]);
                }
            }
            var1 = var2.method4460(this.field2095 + 64, this.field2096 + 850, -30, -50, -30);
            field2084.method5931(var1, (long) this.field2081);
        }
        return var1;
    }
}
