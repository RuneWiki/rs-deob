package deob;

@ObfuscatedName("hl")
public class class204 extends class457 {

    @ObfuscatedName("hl.as")
    public static class287 field2122 = new class287(64);

    @ObfuscatedName("hl.ax")
    public static class287 field2123 = new class287(64);

    @ObfuscatedName("hl.ap")
    public static class287 field2121 = new class287(20);

    @ObfuscatedName("hl.aa")
    public int field2127 = -1;

    @ObfuscatedName("hl.aj")
    public int field2128 = 16777215;

    @ObfuscatedName("hl.ad")
    public int field2135 = 70;

    @ObfuscatedName("hl.ac")
    public int field2130 = -1;

    @ObfuscatedName("hl.ag")
    public int field2131 = -1;

    @ObfuscatedName("hl.ar")
    public int field2140 = -1;

    @ObfuscatedName("hl.ah")
    public int field2133 = -1;

    @ObfuscatedName("hl.az")
    public int field2134 = 0;

    @ObfuscatedName("hl.au")
    public int field2141 = 0;

    @ObfuscatedName("hl.ai")
    public int field2138 = -1;

    @ObfuscatedName("hl.aq")
    public String field2137 = "";

    @ObfuscatedName("hl.aw")
    public int field2129 = -1;

    @ObfuscatedName("hl.ay")
    public int field2139 = 0;

    @ObfuscatedName("hl.al")
    public int[] field2124;

    @ObfuscatedName("hl.am")
    public int field2136 = -1;

    @ObfuscatedName("hl.bs")
    public int field2142 = -1;

    @ObfuscatedName("mk.at(II)Lhl;")
    public static class204 method5476(int arg0) {
        class204 var1 = (class204) field2122.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2120.method6080(32, arg0);
        class204 var3 = new class204();
        if (var2 != null) {
            var3.method3566(new class501(var2));
        }
        field2122.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hl.an(Ltz;I)V")
    public void method3566(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3548(arg0, var2);
        }
    }

    @ObfuscatedName("hl.av(Ltz;II)V")
    public void method3548(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2127 = arg0.method8148();
        } else if (arg1 == 2) {
            this.field2128 = arg0.method8133();
        } else if (arg1 == 3) {
            this.field2130 = arg0.method8148();
        } else if (arg1 == 4) {
            this.field2140 = arg0.method8148();
        } else if (arg1 == 5) {
            this.field2131 = arg0.method8148();
        } else if (arg1 == 6) {
            this.field2133 = arg0.method8148();
        } else if (arg1 == 7) {
            this.field2134 = arg0.method8268();
        } else if (arg1 == 8) {
            this.field2137 = arg0.method8193();
        } else if (arg1 == 9) {
            this.field2135 = arg0.method8195();
        } else if (arg1 == 10) {
            this.field2141 = arg0.method8268();
        } else if (arg1 == 11) {
            this.field2138 = 0;
        } else if (arg1 == 12) {
            this.field2129 = arg0.method8129();
        } else if (arg1 == 13) {
            this.field2139 = arg0.method8268();
        } else if (arg1 == 14) {
            this.field2138 = arg0.method8195();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2136 = arg0.method8195();
            if (this.field2136 == 65535) {
                this.field2136 = -1;
            }
            this.field2142 = arg0.method8195();
            if (this.field2142 == 65535) {
                this.field2142 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8195();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8129();
            this.field2124 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2124[var5] = arg0.method8195();
                if (this.field2124[var5] == 65535) {
                    this.field2124[var5] = -1;
                }
            }
            this.field2124[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hl.as(I)Lhl;")
    public final class204 method3553() {
        int var1 = -1;
        if (this.field2136 != -1) {
            var1 = class320.method5997(this.field2136);
        } else if (this.field2142 != -1) {
            var1 = class320.field3514[this.field2142];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2124.length - 1) {
            var2 = this.field2124[var1];
        } else {
            var2 = this.field2124[this.field2124.length - 1];
        }
        return var2 == -1 ? null : method5476(var2);
    }

    @ObfuscatedName("hl.ax(II)Ljava/lang/String;")
    public String method3534(int arg0) {
        String var2 = this.field2137;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class385.method2068(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hl.ap(I)Ltm;")
    public class515 method3535() {
        if (this.field2130 < 0) {
            return null;
        }
        class515 var1 = (class515) field2123.method5121((long) this.field2130);
        if (var1 != null) {
            return var1;
        }
        class515 var2 = class516.method2561(Statics.field2119, this.field2130, 0);
        if (var2 != null) {
            field2123.method5123(var2, (long) this.field2130);
        }
        return var2;
    }

    @ObfuscatedName("hl.ab(I)Ltm;")
    public class515 method3536() {
        if (this.field2131 < 0) {
            return null;
        }
        class515 var1 = (class515) field2123.method5121((long) this.field2131);
        if (var1 != null) {
            return var1;
        }
        class515 var2 = class516.method2561(Statics.field2119, this.field2131, 0);
        if (var2 != null) {
            field2123.method5123(var2, (long) this.field2131);
        }
        return var2;
    }

    @ObfuscatedName("hl.ak(I)Ltm;")
    public class515 method3558() {
        if (this.field2140 < 0) {
            return null;
        }
        class515 var1 = (class515) field2123.method5121((long) this.field2140);
        if (var1 != null) {
            return var1;
        }
        class515 var2 = class516.method2561(Statics.field2119, this.field2140, 0);
        if (var2 != null) {
            field2123.method5123(var2, (long) this.field2140);
        }
        return var2;
    }

    @ObfuscatedName("hl.ae(I)Ltm;")
    public class515 method3545() {
        if (this.field2133 < 0) {
            return null;
        }
        class515 var1 = (class515) field2123.method5121((long) this.field2133);
        if (var1 != null) {
            return var1;
        }
        class515 var2 = class516.method2561(Statics.field2119, this.field2133, 0);
        if (var2 != null) {
            field2123.method5123(var2, (long) this.field2133);
        }
        return var2;
    }

    @ObfuscatedName("hl.af(I)Lph;")
    public class392 method3539() {
        if (this.field2127 == -1) {
            return null;
        }
        class392 var1 = (class392) field2121.method5121((long) this.field2127);
        if (var1 != null) {
            return var1;
        }
        class392 var2 = class516.method7332(Statics.field2119, Statics.field2126, this.field2127, 0);
        if (var2 != null) {
            field2121.method5123(var2, (long) this.field2127);
        }
        return var2;
    }

    @ObfuscatedName("ln.ao(I)V")
    public static void method5131() {
        field2122.method5124();
        field2123.method5124();
        field2121.method5124();
    }
}
