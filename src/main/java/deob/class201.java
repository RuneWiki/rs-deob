package deob;

@ObfuscatedName("hz")
public class class201 extends class481 {

    @ObfuscatedName("hz.ao")
    public static class299 field2053 = new class299(64);

    @ObfuscatedName("hz.ab")
    public static class299 field2054 = new class299(64);

    @ObfuscatedName("hz.au")
    public static class299 field2055 = new class299(20);

    @ObfuscatedName("hz.av")
    public int field2059 = -1;

    @ObfuscatedName("hz.ax")
    public int field2062 = 16777215;

    @ObfuscatedName("hz.as")
    public int field2061 = 70;

    @ObfuscatedName("hz.ay")
    public int field2056 = -1;

    @ObfuscatedName("hz.ak")
    public int field2063 = -1;

    @ObfuscatedName("hz.aj")
    public int field2069 = -1;

    @ObfuscatedName("hz.am")
    public int field2052 = -1;

    @ObfuscatedName("hz.aq")
    public int field2066 = 0;

    @ObfuscatedName("hz.ai")
    public int field2067 = 0;

    @ObfuscatedName("hz.aw")
    public int field2068 = -1;

    @ObfuscatedName("hz.ae")
    public String field2050 = "";

    @ObfuscatedName("hz.an")
    public int field2070 = -1;

    @ObfuscatedName("hz.ag")
    public int field2060 = 0;

    @ObfuscatedName("hz.ad")
    public int[] field2072;

    @ObfuscatedName("hz.af")
    public int field2073 = -1;

    @ObfuscatedName("hz.be")
    public int field2074 = -1;

    @ObfuscatedName("fk.at(II)Lhz;")
    public static class201 method3066(int arg0) {
        class201 var1 = (class201) field2053.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2058.method6284(32, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3537(new class527(var2));
        }
        field2053.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.ah(Luj;B)V")
    public void method3537(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3538(arg0, var2);
        }
    }

    @ObfuscatedName("hz.ar(Luj;IB)V")
    public void method3538(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2059 = arg0.method8430();
        } else if (arg1 == 2) {
            this.field2062 = arg0.method8414();
        } else if (arg1 == 3) {
            this.field2056 = arg0.method8430();
        } else if (arg1 == 4) {
            this.field2069 = arg0.method8430();
        } else if (arg1 == 5) {
            this.field2063 = arg0.method8430();
        } else if (arg1 == 6) {
            this.field2052 = arg0.method8430();
        } else if (arg1 == 7) {
            this.field2066 = arg0.method8508();
        } else if (arg1 == 8) {
            this.field2050 = arg0.method8422();
        } else if (arg1 == 9) {
            this.field2061 = arg0.method8412();
        } else if (arg1 == 10) {
            this.field2067 = arg0.method8508();
        } else if (arg1 == 11) {
            this.field2068 = 0;
        } else if (arg1 == 12) {
            this.field2070 = arg0.method8410();
        } else if (arg1 == 13) {
            this.field2060 = arg0.method8508();
        } else if (arg1 == 14) {
            this.field2068 = arg0.method8412();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2073 = arg0.method8412();
            if (this.field2073 == 65535) {
                this.field2073 = -1;
            }
            this.field2074 = arg0.method8412();
            if (this.field2074 == 65535) {
                this.field2074 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8412();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8410();
            this.field2072 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2072[var5] = arg0.method8412();
                if (this.field2072[var5] == 65535) {
                    this.field2072[var5] = -1;
                }
            }
            this.field2072[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hz.ao(B)Lhz;")
    public final class201 method3539() {
        int var1 = -1;
        if (this.field2073 != -1) {
            var1 = class333.method2521(this.field2073);
        } else if (this.field2074 != -1) {
            var1 = class333.field3554[this.field2074];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2072.length - 1) {
            var2 = this.field2072[var1];
        } else {
            var2 = this.field2072[this.field2072.length - 1];
        }
        return var2 == -1 ? null : method3066(var2);
    }

    @ObfuscatedName("hz.ab(IS)Ljava/lang/String;")
    public String method3540(int arg0) {
        String var2 = this.field2050;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class399.method5166(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hz.au(B)Luz;")
    public class541 method3545() {
        if (this.field2056 < 0) {
            return null;
        }
        class541 var1 = (class541) field2054.method5289((long) this.field2056);
        if (var1 != null) {
            return var1;
        }
        class541 var2 = class542.method7349(Statics.field2051, this.field2056, 0);
        if (var2 != null) {
            field2054.method5303(var2, (long) this.field2056);
        }
        return var2;
    }

    @ObfuscatedName("hz.aa(I)Luz;")
    public class541 method3541() {
        if (this.field2063 < 0) {
            return null;
        }
        class541 var1 = (class541) field2054.method5289((long) this.field2063);
        if (var1 != null) {
            return var1;
        }
        class541 var2 = class542.method7349(Statics.field2051, this.field2063, 0);
        if (var2 != null) {
            field2054.method5303(var2, (long) this.field2063);
        }
        return var2;
    }

    @ObfuscatedName("hz.ac(B)Luz;")
    public class541 method3542() {
        if (this.field2069 < 0) {
            return null;
        }
        class541 var1 = (class541) field2054.method5289((long) this.field2069);
        if (var1 != null) {
            return var1;
        }
        class541 var2 = class542.method7349(Statics.field2051, this.field2069, 0);
        if (var2 != null) {
            field2054.method5303(var2, (long) this.field2069);
        }
        return var2;
    }

    @ObfuscatedName("hz.al(I)Luz;")
    public class541 method3550() {
        if (this.field2052 < 0) {
            return null;
        }
        class541 var1 = (class541) field2054.method5289((long) this.field2052);
        if (var1 != null) {
            return var1;
        }
        class541 var2 = class542.method7349(Statics.field2051, this.field2052, 0);
        if (var2 != null) {
            field2054.method5303(var2, (long) this.field2052);
        }
        return var2;
    }

    @ObfuscatedName("hz.az(I)Lpf;")
    public class406 method3544() {
        if (this.field2059 == -1) {
            return null;
        }
        class406 var1 = (class406) field2055.method5289((long) this.field2059);
        if (var1 != null) {
            return var1;
        }
        class371 var2 = Statics.field2051;
        class371 var3 = Statics.field2064;
        int var4 = this.field2059;
        byte[] var5 = var2.method6284(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class542.method3171(var5);
            var6 = true;
        }
        class406 var7;
        if (var6) {
            var7 = class542.method4213(var3.method6284(var4, 0));
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field2055.method5303(var7, (long) this.field2059);
        }
        return var7;
    }

    @ObfuscatedName("client.ap(I)V")
    public static void method1743() {
        field2053.method5292();
        field2054.method5292();
        field2055.method5292();
    }
}
