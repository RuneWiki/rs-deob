package deob;

@ObfuscatedName("ij")
public class class222 extends class500 {

    @ObfuscatedName("ij.az")
    public static class312 field2248 = new class312(64);

    @ObfuscatedName("ij.af")
    public static class312 field2250 = new class312(64);

    @ObfuscatedName("ij.aa")
    public static class312 field2252 = new class312(20);

    @ObfuscatedName("ij.av")
    public int field2254 = -1;

    @ObfuscatedName("ij.aq")
    public int field2268 = 16777215;

    @ObfuscatedName("ij.ap")
    public int field2262 = 70;

    @ObfuscatedName("ij.ae")
    public int field2257 = -1;

    @ObfuscatedName("ij.ax")
    public int field2258 = -1;

    @ObfuscatedName("ij.ay")
    public int field2259 = -1;

    @ObfuscatedName("ij.au")
    public int field2251 = -1;

    @ObfuscatedName("ij.as")
    public int field2261 = 0;

    @ObfuscatedName("ij.aw")
    public int field2246 = 0;

    @ObfuscatedName("ij.ad")
    public int field2260 = -1;

    @ObfuscatedName("ij.ai")
    public String field2264 = "";

    @ObfuscatedName("ij.an")
    public int field2265 = -1;

    @ObfuscatedName("ij.am")
    public int field2266 = 0;

    @ObfuscatedName("ij.ar")
    public int[] field2267;

    @ObfuscatedName("ij.ag")
    public int field2263 = -1;

    @ObfuscatedName("ij.bs")
    public int field2269 = -1;

    @ObfuscatedName("as.ak(IB)Lij;")
    public static class222 method256(int arg0) {
        class222 var1 = (class222) field2248.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2256.method6573(32, arg0);
        class222 var3 = new class222();
        if (var2 != null) {
            var3.method3829(new class546(var2));
        }
        field2248.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.al(Lua;I)V")
    public void method3829(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3830(arg0, var2);
        }
    }

    @ObfuscatedName("ij.aj(Lua;IB)V")
    public void method3830(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2254 = arg0.method8814();
        } else if (arg1 == 2) {
            this.field2268 = arg0.method8790();
        } else if (arg1 == 3) {
            this.field2257 = arg0.method8814();
        } else if (arg1 == 4) {
            this.field2259 = arg0.method8814();
        } else if (arg1 == 5) {
            this.field2258 = arg0.method8814();
        } else if (arg1 == 6) {
            this.field2251 = arg0.method8814();
        } else if (arg1 == 7) {
            this.field2261 = arg0.method8926();
        } else if (arg1 == 8) {
            this.field2264 = arg0.method8968();
        } else if (arg1 == 9) {
            this.field2262 = arg0.method8798();
        } else if (arg1 == 10) {
            this.field2246 = arg0.method8926();
        } else if (arg1 == 11) {
            this.field2260 = 0;
        } else if (arg1 == 12) {
            this.field2265 = arg0.method8796();
        } else if (arg1 == 13) {
            this.field2266 = arg0.method8926();
        } else if (arg1 == 14) {
            this.field2260 = arg0.method8798();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2263 = arg0.method8798();
            if (this.field2263 == 65535) {
                this.field2263 = -1;
            }
            this.field2269 = arg0.method8798();
            if (this.field2269 == 65535) {
                this.field2269 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8798();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8796();
            this.field2267 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2267[var5] = arg0.method8798();
                if (this.field2267[var5] == 65535) {
                    this.field2267[var5] = -1;
                }
            }
            this.field2267[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ij.az(I)Lij;")
    public final class222 method3859() {
        int var1 = -1;
        if (this.field2263 != -1) {
            var1 = class346.method5576(this.field2263);
        } else if (this.field2269 != -1) {
            var1 = class346.field3710[this.field2269];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2267.length - 1) {
            var2 = this.field2267[var1];
        } else {
            var2 = this.field2267[this.field2267.length - 1];
        }
        return var2 == -1 ? null : method256(var2);
    }

    @ObfuscatedName("ij.af(II)Ljava/lang/String;")
    public String method3858(int arg0) {
        String var2 = this.field2264;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class415.method2859(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ij.aa(I)Lvc;")
    public class560 method3832() {
        if (this.field2257 < 0) {
            return null;
        }
        class560 var1 = (class560) field2250.method5570((long) this.field2257);
        if (var1 != null) {
            return var1;
        }
        class560 var2 = class561.method8728(Statics.field3637, this.field2257, 0);
        if (var2 != null) {
            field2250.method5564(var2, (long) this.field2257);
        }
        return var2;
    }

    @ObfuscatedName("ij.at(I)Lvc;")
    public class560 method3831() {
        if (this.field2258 < 0) {
            return null;
        }
        class560 var1 = (class560) field2250.method5570((long) this.field2258);
        if (var1 != null) {
            return var1;
        }
        class560 var2 = class561.method8728(Statics.field3637, this.field2258, 0);
        if (var2 != null) {
            field2250.method5564(var2, (long) this.field2258);
        }
        return var2;
    }

    @ObfuscatedName("ij.ab(B)Lvc;")
    public class560 method3834() {
        if (this.field2259 < 0) {
            return null;
        }
        class560 var1 = (class560) field2250.method5570((long) this.field2259);
        if (var1 != null) {
            return var1;
        }
        class560 var2 = class561.method8728(Statics.field3637, this.field2259, 0);
        if (var2 != null) {
            field2250.method5564(var2, (long) this.field2259);
        }
        return var2;
    }

    @ObfuscatedName("ij.ac(B)Lvc;")
    public class560 method3835() {
        if (this.field2251 < 0) {
            return null;
        }
        class560 var1 = (class560) field2250.method5570((long) this.field2251);
        if (var1 != null) {
            return var1;
        }
        class560 var2 = class561.method8728(Statics.field3637, this.field2251, 0);
        if (var2 != null) {
            field2250.method5564(var2, (long) this.field2251);
        }
        return var2;
    }

    @ObfuscatedName("ij.ao(B)Lqb;")
    public class431 method3842() {
        if (this.field2254 == -1) {
            return null;
        }
        class431 var1 = (class431) field2252.method5570((long) this.field2254);
        if (var1 != null) {
            return var1;
        }
        class387 var2 = Statics.field3637;
        class387 var3 = Statics.field2247;
        int var4 = this.field2254;
        class431 var5;
        if (class561.method2638(var2, var4, 0)) {
            byte[] var6 = var3.method6573(var4, 0);
            class431 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class431 var8 = new class431(var6, Statics.field5452, Statics.field5455, Statics.field5454, Statics.field5457, Statics.field1489, Statics.field1976);
                Statics.field5452 = null;
                Statics.field5455 = null;
                Statics.field5454 = null;
                Statics.field5457 = null;
                Statics.field1489 = null;
                Statics.field1976 = (byte[][]) null;
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2252.method5564(var5, (long) this.field2254);
        }
        return var5;
    }

    @ObfuscatedName("gd.ah(I)V")
    public static void method3329() {
        field2248.method5572();
        field2250.method5572();
        field2252.method5572();
    }
}
