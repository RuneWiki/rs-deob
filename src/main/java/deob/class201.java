package deob;

@ObfuscatedName("hy")
public class class201 extends class485 {

    @ObfuscatedName("hy.aj")
    public static class302 field2083 = new class302(64);

    @ObfuscatedName("hy.aq")
    public static class302 field2079 = new class302(64);

    @ObfuscatedName("hy.ar")
    public static class302 field2077 = new class302(20);

    @ObfuscatedName("hy.an")
    public int field2069 = -1;

    @ObfuscatedName("hy.ad")
    public int field2076 = 16777215;

    @ObfuscatedName("hy.ax")
    public int field2070 = 70;

    @ObfuscatedName("hy.aw")
    public int field2078 = -1;

    @ObfuscatedName("hy.az")
    public int field2071 = -1;

    @ObfuscatedName("hy.av")
    public int field2080 = -1;

    @ObfuscatedName("hy.ak")
    public int field2081 = -1;

    @ObfuscatedName("hy.ay")
    public int field2082 = 0;

    @ObfuscatedName("hy.as")
    public int field2090 = 0;

    @ObfuscatedName("hy.ab")
    public int field2084 = -1;

    @ObfuscatedName("hy.ah")
    public String field2085 = "";

    @ObfuscatedName("hy.ai")
    public int field2072 = -1;

    @ObfuscatedName("hy.ac")
    public int field2087 = 0;

    @ObfuscatedName("hy.al")
    public int[] field2088;

    @ObfuscatedName("hy.at")
    public int field2068 = -1;

    @ObfuscatedName("hy.bj")
    public int field2086 = -1;

    @ObfuscatedName("hh.am(II)Lhy;")
    public static class201 method3468(int arg0) {
        class201 var1 = (class201) field2083.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2093.method6396(32, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3577(new class531(var2));
        }
        field2083.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hy.ap(Luk;B)V")
    public void method3577(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3576(arg0, var2);
        }
    }

    @ObfuscatedName("hy.af(Luk;II)V")
    public void method3576(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2069 = arg0.method8721();
        } else if (arg1 == 2) {
            this.field2076 = arg0.method8688();
        } else if (arg1 == 3) {
            this.field2078 = arg0.method8721();
        } else if (arg1 == 4) {
            this.field2080 = arg0.method8721();
        } else if (arg1 == 5) {
            this.field2071 = arg0.method8721();
        } else if (arg1 == 6) {
            this.field2081 = arg0.method8721();
        } else if (arg1 == 7) {
            this.field2082 = arg0.method8564();
        } else if (arg1 == 8) {
            this.field2085 = arg0.method8635();
        } else if (arg1 == 9) {
            this.field2070 = arg0.method8775();
        } else if (arg1 == 10) {
            this.field2090 = arg0.method8564();
        } else if (arg1 == 11) {
            this.field2084 = 0;
        } else if (arg1 == 12) {
            this.field2072 = arg0.method8561();
        } else if (arg1 == 13) {
            this.field2087 = arg0.method8564();
        } else if (arg1 == 14) {
            this.field2084 = arg0.method8775();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2068 = arg0.method8775();
            if (this.field2068 == 65535) {
                this.field2068 = -1;
            }
            this.field2086 = arg0.method8775();
            if (this.field2086 == 65535) {
                this.field2086 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8775();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8561();
            this.field2088 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2088[var5] = arg0.method8775();
                if (this.field2088[var5] == 65535) {
                    this.field2088[var5] = -1;
                }
            }
            this.field2088[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hy.aj(S)Lhy;")
    public final class201 method3606() {
        int var1 = -1;
        if (this.field2068 != -1) {
            var1 = class336.method1124(this.field2068);
        } else if (this.field2086 != -1) {
            var1 = class336.field3598[this.field2086];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2088.length - 1) {
            var2 = this.field2088[var1];
        } else {
            var2 = this.field2088[this.field2088.length - 1];
        }
        return var2 == -1 ? null : method3468(var2);
    }

    @ObfuscatedName("hy.aq(IB)Ljava/lang/String;")
    public String method3578(int arg0) {
        String var2 = this.field2085;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class403.method6548(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hy.ar(I)Luc;")
    public class545 method3605() {
        if (this.field2078 < 0) {
            return null;
        }
        class545 var1 = (class545) field2079.method5400((long) this.field2078);
        if (var1 != null) {
            return var1;
        }
        class545 var2 = class546.method3015(Statics.field4418, this.field2078, 0);
        if (var2 != null) {
            field2079.method5402(var2, (long) this.field2078);
        }
        return var2;
    }

    @ObfuscatedName("hy.ag(B)Luc;")
    public class545 method3580() {
        if (this.field2071 < 0) {
            return null;
        }
        class545 var1 = (class545) field2079.method5400((long) this.field2071);
        if (var1 != null) {
            return var1;
        }
        class545 var2 = class546.method3015(Statics.field4418, this.field2071, 0);
        if (var2 != null) {
            field2079.method5402(var2, (long) this.field2071);
        }
        return var2;
    }

    @ObfuscatedName("hy.ao(B)Luc;")
    public class545 method3581() {
        if (this.field2080 < 0) {
            return null;
        }
        class545 var1 = (class545) field2079.method5400((long) this.field2080);
        if (var1 != null) {
            return var1;
        }
        class545 var2 = class546.method3015(Statics.field4418, this.field2080, 0);
        if (var2 != null) {
            field2079.method5402(var2, (long) this.field2080);
        }
        return var2;
    }

    @ObfuscatedName("hy.ae(B)Luc;")
    public class545 method3582() {
        if (this.field2081 < 0) {
            return null;
        }
        class545 var1 = (class545) field2079.method5400((long) this.field2081);
        if (var1 != null) {
            return var1;
        }
        class545 var2 = class546.method3015(Statics.field4418, this.field2081, 0);
        if (var2 != null) {
            field2079.method5402(var2, (long) this.field2081);
        }
        return var2;
    }

    @ObfuscatedName("hy.aa(I)Lpv;")
    public class410 method3597() {
        if (this.field2069 == -1) {
            return null;
        }
        class410 var1 = (class410) field2077.method5400((long) this.field2069);
        if (var1 != null) {
            return var1;
        }
        class375 var2 = Statics.field4418;
        class375 var3 = Statics.field2089;
        int var4 = this.field2069;
        class410 var5;
        if (class546.method2710(var2, var4, 0)) {
            var5 = class546.method2067(var3.method6396(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2077.method5402(var5, (long) this.field2069);
        }
        return var5;
    }
}
