package deob;

@ObfuscatedName("hb")
public class class200 extends class444 {

    @ObfuscatedName("hb.ac")
    public static class280 field2134 = new class280(64);

    @ObfuscatedName("hb.au")
    public static class280 field2135 = new class280(64);

    @ObfuscatedName("hb.ab")
    public static class280 field2136 = new class280(20);

    @ObfuscatedName("hb.ao")
    public int field2140 = -1;

    @ObfuscatedName("hb.ax")
    public int field2141 = 16777215;

    @ObfuscatedName("hb.ai")
    public int field2143 = 70;

    @ObfuscatedName("hb.ag")
    public int field2156 = -1;

    @ObfuscatedName("hb.ah")
    public int field2144 = -1;

    @ObfuscatedName("hb.av")
    public int field2145 = -1;

    @ObfuscatedName("hb.ar")
    public int field2146 = -1;

    @ObfuscatedName("hb.am")
    public int field2131 = 0;

    @ObfuscatedName("hb.as")
    public int field2148 = 0;

    @ObfuscatedName("hb.aj")
    public int field2155 = -1;

    @ObfuscatedName("hb.ak")
    public String field2151 = "";

    @ObfuscatedName("hb.az")
    public int field2150 = -1;

    @ObfuscatedName("hb.ad")
    public int field2152 = 0;

    @ObfuscatedName("hb.ae")
    public int[] field2153;

    @ObfuscatedName("hb.ap")
    public int field2154 = -1;

    @ObfuscatedName("hb.by")
    public int field2149 = -1;

    @ObfuscatedName("ew.af(IB)Lhb;")
    public static class200 method2898(int arg0) {
        class200 var1 = (class200) field2134.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2138.method6090(32, arg0);
        class200 var3 = new class200();
        if (var2 != null) {
            var3.method3626(new class489(var2));
        }
        field2134.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.an(Lsg;I)V")
    public void method3626(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3627(arg0, var2);
        }
    }

    @ObfuscatedName("hb.aw(Lsg;IB)V")
    public void method3627(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2140 = arg0.method8300();
        } else if (arg1 == 2) {
            this.field2141 = arg0.method8252();
        } else if (arg1 == 3) {
            this.field2156 = arg0.method8300();
        } else if (arg1 == 4) {
            this.field2145 = arg0.method8300();
        } else if (arg1 == 5) {
            this.field2144 = arg0.method8300();
        } else if (arg1 == 6) {
            this.field2146 = arg0.method8300();
        } else if (arg1 == 7) {
            this.field2131 = arg0.method8445();
        } else if (arg1 == 8) {
            this.field2151 = arg0.method8260();
        } else if (arg1 == 9) {
            this.field2143 = arg0.method8250();
        } else if (arg1 == 10) {
            this.field2148 = arg0.method8445();
        } else if (arg1 == 11) {
            this.field2155 = 0;
        } else if (arg1 == 12) {
            this.field2150 = arg0.method8248();
        } else if (arg1 == 13) {
            this.field2152 = arg0.method8445();
        } else if (arg1 == 14) {
            this.field2155 = arg0.method8250();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2154 = arg0.method8250();
            if (this.field2154 == 65535) {
                this.field2154 = -1;
            }
            this.field2149 = arg0.method8250();
            if (this.field2149 == 65535) {
                this.field2149 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8250();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8248();
            this.field2153 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2153[var5] = arg0.method8250();
                if (this.field2153[var5] == 65535) {
                    this.field2153[var5] = -1;
                }
            }
            this.field2153[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hb.ac(B)Lhb;")
    public final class200 method3635() {
        int var1 = -1;
        if (this.field2154 != -1) {
            var1 = class307.method4941(this.field2154);
        } else if (this.field2149 != -1) {
            var1 = class307.field3482[this.field2149];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2153.length - 1) {
            var2 = this.field2153[var1];
        } else {
            var2 = this.field2153[this.field2153.length - 1];
        }
        return var2 == -1 ? null : method2898(var2);
    }

    @ObfuscatedName("hb.au(II)Ljava/lang/String;")
    public String method3629(int arg0) {
        String var2 = this.field2151;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class372.method3397(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hb.ab(I)Ltq;")
    public class503 method3630() {
        if (this.field2156 < 0) {
            return null;
        }
        class503 var1 = (class503) field2135.method5119((long) this.field2156);
        if (var1 != null) {
            return var1;
        }
        class503 var2 = class504.method8178(Statics.field2132, this.field2156, 0);
        if (var2 != null) {
            field2135.method5121(var2, (long) this.field2156);
        }
        return var2;
    }

    @ObfuscatedName("hb.aq(I)Ltq;")
    public class503 method3631() {
        if (this.field2144 < 0) {
            return null;
        }
        class503 var1 = (class503) field2135.method5119((long) this.field2144);
        if (var1 != null) {
            return var1;
        }
        class503 var2 = class504.method8178(Statics.field2132, this.field2144, 0);
        if (var2 != null) {
            field2135.method5121(var2, (long) this.field2144);
        }
        return var2;
    }

    @ObfuscatedName("hb.al(I)Ltq;")
    public class503 method3625() {
        if (this.field2145 < 0) {
            return null;
        }
        class503 var1 = (class503) field2135.method5119((long) this.field2145);
        if (var1 != null) {
            return var1;
        }
        class503 var2 = class504.method8178(Statics.field2132, this.field2145, 0);
        if (var2 != null) {
            field2135.method5121(var2, (long) this.field2145);
        }
        return var2;
    }

    @ObfuscatedName("hb.at(B)Ltq;")
    public class503 method3633() {
        if (this.field2146 < 0) {
            return null;
        }
        class503 var1 = (class503) field2135.method5119((long) this.field2146);
        if (var1 != null) {
            return var1;
        }
        class503 var2 = class504.method8178(Statics.field2132, this.field2146, 0);
        if (var2 != null) {
            field2135.method5121(var2, (long) this.field2146);
        }
        return var2;
    }

    @ObfuscatedName("hb.aa(I)Lon;")
    public class379 method3645() {
        if (this.field2140 == -1) {
            return null;
        }
        class379 var1 = (class379) field2136.method5119((long) this.field2140);
        if (var1 != null) {
            return var1;
        }
        class344 var2 = Statics.field2132;
        class344 var3 = Statics.field2133;
        int var4 = this.field2140;
        byte[] var5 = var2.method6090(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class504.method8185(var5);
            var6 = true;
        }
        class379 var7;
        if (var6) {
            byte[] var8 = var3.method6090(var4, 0);
            class379 var9;
            if (var8 == null) {
                var9 = null;
            } else {
                class379 var10 = new class379(var8, Statics.field5101, Statics.field94, Statics.field1302, Statics.field1644, Statics.field4525, Statics.field2113);
                class504.method7059();
                var9 = var10;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field2136.method5121(var7, (long) this.field2140);
        }
        return var7;
    }

    @ObfuscatedName("qg.ay(I)V")
    public static void method7594() {
        field2134.method5125();
        field2135.method5125();
        field2136.method5125();
    }
}
