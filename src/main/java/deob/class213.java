package deob;

@ObfuscatedName("ie")
public class class213 extends class489 {

    @ObfuscatedName("ie.af")
    public static class304 field2175 = new class304(64);

    @ObfuscatedName("ie.at")
    public static class304 field2176 = new class304(30);

    @ObfuscatedName("ie.an")
    public int field2177;

    @ObfuscatedName("ie.ao")
    public int field2190;

    @ObfuscatedName("ie.ab")
    public int field2183 = -1;

    @ObfuscatedName("ie.aw")
    public short[] field2180;

    @ObfuscatedName("ie.ad")
    public short[] field2181;

    @ObfuscatedName("ie.al")
    public short[] field2182;

    @ObfuscatedName("ie.as")
    public short[] field2184;

    @ObfuscatedName("ie.ag")
    public int field2179 = 128;

    @ObfuscatedName("ie.ai")
    public int field2178 = 128;

    @ObfuscatedName("ie.ax")
    public int field2186 = 0;

    @ObfuscatedName("ie.ar")
    public int field2187 = 0;

    @ObfuscatedName("ie.aj")
    public int field2188 = 0;

    @ObfuscatedName("ec.az(IB)Lie;")
    public static class213 method2771(int arg0) {
        class213 var1 = (class213) field2175.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2185.method6328(13, arg0);
        class213 var3 = new class213();
        var3.field2177 = arg0;
        if (var2 != null) {
            var3.method3610(new class535(var2));
        }
        field2175.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.ah(Lur;B)V")
    public void method3610(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3608(arg0, var2);
        }
    }

    @ObfuscatedName("ie.af(Lur;II)V")
    public void method3608(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2190 = arg0.method8670();
        } else if (arg1 == 2) {
            this.field2183 = arg0.method8670();
        } else if (arg1 == 4) {
            this.field2179 = arg0.method8670();
        } else if (arg1 == 5) {
            this.field2178 = arg0.method8670();
        } else if (arg1 == 6) {
            this.field2186 = arg0.method8670();
        } else if (arg1 == 7) {
            this.field2187 = arg0.method8462();
        } else if (arg1 == 8) {
            this.field2188 = arg0.method8462();
        } else if (arg1 == 40) {
            int var3 = arg0.method8462();
            this.field2180 = new short[var3];
            this.field2181 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2180[var4] = (short) arg0.method8670();
                this.field2181[var4] = (short) arg0.method8670();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8462();
            this.field2182 = new short[var5];
            this.field2184 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2182[var6] = (short) arg0.method8670();
                this.field2184[var6] = (short) arg0.method8670();
            }
        }
    }

    @ObfuscatedName("ie.at(II)Ljn;")
    public final class256 method3609(int arg0) {
        class256 var2 = this.method3612();
        if (var2 == null) {
            return null;
        }
        class256 var3;
        if (this.field2183 == -1 || arg0 == -1) {
            var3 = var2.method4668(true);
        } else {
            var3 = class225.method288(this.field2183).method3899(var2, arg0);
        }
        if (this.field2179 != 128 || this.field2178 != 128) {
            var3.method4709(this.field2179, this.field2178, this.field2179);
        }
        if (this.field2186 != 0) {
            if (this.field2186 == 90) {
                var3.method4689();
            }
            if (this.field2186 == 180) {
                var3.method4689();
                var3.method4689();
            }
            if (this.field2186 == 270) {
                var3.method4689();
                var3.method4689();
                var3.method4689();
            }
        }
        return var3;
    }

    @ObfuscatedName("ie.an(I)Ljn;")
    public final class256 method3612() {
        class256 var1 = (class256) field2176.method5336((long) this.field2177);
        if (var1 == null) {
            class238 var2 = class238.method4116(Statics.field2174, this.field2190, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2180 != null) {
                for (int var3 = 0; var3 < this.field2180.length; var3++) {
                    var2.method4131(this.field2180[var3], this.field2181[var3]);
                }
            }
            if (this.field2182 != null) {
                for (int var4 = 0; var4 < this.field2182.length; var4++) {
                    var2.method4135(this.field2182[var4], this.field2184[var4]);
                }
            }
            var1 = var2.method4138(this.field2187 + 64, this.field2188 + 850, -30, -50, -30);
            field2176.method5346(var1, (long) this.field2177);
        }
        return var1;
    }
}
