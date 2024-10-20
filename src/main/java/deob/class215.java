package deob;

@ObfuscatedName("ip")
public class class215 extends class500 {

    @ObfuscatedName("ip.aj")
    public static class312 field2192 = new class312(64);

    @ObfuscatedName("ip.az")
    public static class312 field2193 = new class312(30);

    @ObfuscatedName("ip.af")
    public int field2206;

    @ObfuscatedName("ip.aa")
    public int field2195;

    @ObfuscatedName("ip.at")
    public int field2196 = -1;

    @ObfuscatedName("ip.ab")
    public short[] field2197;

    @ObfuscatedName("ip.ac")
    public short[] field2198;

    @ObfuscatedName("ip.ao")
    public short[] field2191;

    @ObfuscatedName("ip.ah")
    public short[] field2200;

    @ObfuscatedName("ip.av")
    public int field2201 = 128;

    @ObfuscatedName("ip.aq")
    public int field2207 = 128;

    @ObfuscatedName("ip.ap")
    public int field2203 = 0;

    @ObfuscatedName("ip.ae")
    public int field2204 = 0;

    @ObfuscatedName("ip.ax")
    public int field2199 = 0;

    @ObfuscatedName("ik.ak(II)Lip;")
    public static class215 method3870(int arg0) {
        class215 var1 = (class215) field2192.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2074.method6573(13, arg0);
        class215 var3 = new class215();
        var3.field2206 = arg0;
        if (var2 != null) {
            var3.method3724(new class546(var2));
        }
        field2192.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.al(Lua;B)V")
    public void method3724(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3726(arg0, var2);
        }
    }

    @ObfuscatedName("ip.aj(Lua;IB)V")
    public void method3726(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2195 = arg0.method8798();
        } else if (arg1 == 2) {
            this.field2196 = arg0.method8798();
        } else if (arg1 == 4) {
            this.field2201 = arg0.method8798();
        } else if (arg1 == 5) {
            this.field2207 = arg0.method8798();
        } else if (arg1 == 6) {
            this.field2203 = arg0.method8798();
        } else if (arg1 == 7) {
            this.field2204 = arg0.method8796();
        } else if (arg1 == 8) {
            this.field2199 = arg0.method8796();
        } else if (arg1 == 40) {
            int var3 = arg0.method8796();
            this.field2197 = new short[var3];
            this.field2198 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2197[var4] = (short) arg0.method8798();
                this.field2198[var4] = (short) arg0.method8798();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8796();
            this.field2191 = new short[var5];
            this.field2200 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2191[var6] = (short) arg0.method8798();
                this.field2200[var6] = (short) arg0.method8798();
            }
        }
    }

    @ObfuscatedName("ip.az(IS)Lkb;")
    public final class264 method3727(int arg0) {
        class264 var2 = this.method3728();
        if (var2 == null) {
            return null;
        }
        class264 var3;
        if (this.field2196 == -1 || arg0 == -1) {
            var3 = var2.method4803(true);
        } else {
            var3 = class227.method4744(this.field2196).method4014(var2, arg0);
        }
        if (this.field2201 != 128 || this.field2207 != 128) {
            var3.method4822(this.field2201, this.field2207, this.field2201);
        }
        if (this.field2203 != 0) {
            if (this.field2203 == 90) {
                var3.method4871();
            }
            if (this.field2203 == 180) {
                var3.method4871();
                var3.method4871();
            }
            if (this.field2203 == 270) {
                var3.method4871();
                var3.method4871();
                var3.method4871();
            }
        }
        return var3;
    }

    @ObfuscatedName("ip.af(I)Lkb;")
    public final class264 method3728() {
        class264 var1 = (class264) field2193.method5570((long) this.field2206);
        if (var1 == null) {
            class243 var2 = class243.method4274(Statics.field2208, this.field2195, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2197 != null) {
                for (int var3 = 0; var3 < this.field2197.length; var3++) {
                    var2.method4253(this.field2197[var3], this.field2198[var3]);
                }
            }
            if (this.field2191 != null) {
                for (int var4 = 0; var4 < this.field2191.length; var4++) {
                    var2.method4280(this.field2191[var4], this.field2200[var4]);
                }
            }
            var1 = var2.method4252(this.field2204 + 64, this.field2199 + 850, -30, -50, -30);
            field2193.method5564(var1, (long) this.field2206);
        }
        return var1;
    }
}
