package deob;

@ObfuscatedName("ha")
public class class205 extends class501 {

    @ObfuscatedName("ha.ak")
    public static class313 field2126 = new class313(64);

    @ObfuscatedName("ha.ap")
    public static class313 field2127 = new class313(64);

    @ObfuscatedName("ha.an")
    public static class313 field2128 = new class313(20);

    @ObfuscatedName("ha.au")
    public int field2130 = -1;

    @ObfuscatedName("ha.ah")
    public int field2131 = 16777215;

    @ObfuscatedName("ha.az")
    public int field2132 = 70;

    @ObfuscatedName("ha.ax")
    public int field2133 = -1;

    @ObfuscatedName("ha.ac")
    public int field2123 = -1;

    @ObfuscatedName("ha.al")
    public int field2135 = -1;

    @ObfuscatedName("ha.ay")
    public int field2136 = -1;

    @ObfuscatedName("ha.ao")
    public int field2129 = 0;

    @ObfuscatedName("ha.aa")
    public int field2138 = 0;

    @ObfuscatedName("ha.as")
    public int field2139 = -1;

    @ObfuscatedName("ha.aw")
    public String field2140 = "";

    @ObfuscatedName("ha.at")
    public int field2141 = -1;

    @ObfuscatedName("ha.af")
    public int field2142 = 0;

    @ObfuscatedName("ha.am")
    public int[] field2134;

    @ObfuscatedName("ha.ar")
    public int field2145 = -1;

    @ObfuscatedName("ha.bt")
    public int field2143 = -1;

    @ObfuscatedName("ow.aq(Lok;Lok;Lok;B)V")
    public static void method6463(class388 arg0, class388 arg1, class388 arg2) {
        Statics.field2144 = arg0;
        Statics.field2124 = arg1;
        Statics.field2125 = arg2;
    }

    @ObfuscatedName("ha.ag(Lvp;B)V")
    public void method3594(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3603(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ak(Lvp;IB)V")
    public void method3603(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2130 = arg0.method8773();
        } else if (arg1 == 2) {
            this.field2131 = arg0.method8732();
        } else if (arg1 == 3) {
            this.field2133 = arg0.method8773();
        } else if (arg1 == 4) {
            this.field2135 = arg0.method8773();
        } else if (arg1 == 5) {
            this.field2123 = arg0.method8773();
        } else if (arg1 == 6) {
            this.field2136 = arg0.method8773();
        } else if (arg1 == 7) {
            this.field2129 = arg0.method8731();
        } else if (arg1 == 8) {
            this.field2140 = arg0.method8882();
        } else if (arg1 == 9) {
            this.field2132 = arg0.method8899();
        } else if (arg1 == 10) {
            this.field2138 = arg0.method8731();
        } else if (arg1 == 11) {
            this.field2139 = 0;
        } else if (arg1 == 12) {
            this.field2141 = arg0.method8804();
        } else if (arg1 == 13) {
            this.field2142 = arg0.method8731();
        } else if (arg1 == 14) {
            this.field2139 = arg0.method8899();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2145 = arg0.method8899();
            if (this.field2145 == 65535) {
                this.field2145 = -1;
            }
            this.field2143 = arg0.method8899();
            if (this.field2143 == 65535) {
                this.field2143 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8899();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8804();
            this.field2134 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2134[var5] = arg0.method8899();
                if (this.field2134[var5] == 65535) {
                    this.field2134[var5] = -1;
                }
            }
            this.field2134[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ha.ap(B)Lha;")
    public final class205 method3598() {
        int var1 = -1;
        if (this.field2145 != -1) {
            var1 = class347.method3186(this.field2145);
        } else if (this.field2143 != -1) {
            var1 = class347.field3731[this.field2143];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2134.length - 1) {
            var2 = this.field2134[var1];
        } else {
            var2 = this.field2134[this.field2134.length - 1];
        }
        return var2 == -1 ? null : Statics.method4536(var2);
    }

    @ObfuscatedName("ha.an(IB)Ljava/lang/String;")
    public String method3576(int arg0) {
        String var2 = this.field2140;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class416.method3526(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ha.aj(I)Lvg;")
    public class561 method3577() {
        if (this.field2133 < 0) {
            return null;
        }
        class561 var1 = (class561) field2127.method5495((long) this.field2133);
        if (var1 != null) {
            return var1;
        }
        class561 var2 = class562.method6477(Statics.field2124, this.field2133, 0);
        if (var2 != null) {
            field2127.method5498(var2, (long) this.field2133);
        }
        return var2;
    }

    @ObfuscatedName("ha.av(I)Lvg;")
    public class561 method3578() {
        if (this.field2123 < 0) {
            return null;
        }
        class561 var1 = (class561) field2127.method5495((long) this.field2123);
        if (var1 != null) {
            return var1;
        }
        class561 var2 = class562.method6477(Statics.field2124, this.field2123, 0);
        if (var2 != null) {
            field2127.method5498(var2, (long) this.field2123);
        }
        return var2;
    }

    @ObfuscatedName("ha.ab(I)Lvg;")
    public class561 method3579() {
        if (this.field2135 < 0) {
            return null;
        }
        class561 var1 = (class561) field2127.method5495((long) this.field2135);
        if (var1 != null) {
            return var1;
        }
        class561 var2 = class562.method6477(Statics.field2124, this.field2135, 0);
        if (var2 != null) {
            field2127.method5498(var2, (long) this.field2135);
        }
        return var2;
    }

    @ObfuscatedName("ha.ai(B)Lvg;")
    public class561 method3580() {
        if (this.field2136 < 0) {
            return null;
        }
        class561 var1 = (class561) field2127.method5495((long) this.field2136);
        if (var1 != null) {
            return var1;
        }
        class561 var2 = class562.method6477(Statics.field2124, this.field2136, 0);
        if (var2 != null) {
            field2127.method5498(var2, (long) this.field2136);
        }
        return var2;
    }

    @ObfuscatedName("ha.ae(B)Lqh;")
    public class432 method3581() {
        if (this.field2130 == -1) {
            return null;
        }
        class432 var1 = (class432) field2128.method5495((long) this.field2130);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class562.method3086(Statics.field2124, Statics.field2125, this.field2130, 0);
        if (var2 != null) {
            field2128.method5498(var2, (long) this.field2130);
        }
        return var2;
    }
}
