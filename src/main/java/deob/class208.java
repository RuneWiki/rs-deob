package deob;

@ObfuscatedName("hw")
public class class208 extends class511 {

    @ObfuscatedName("hw.aj")
    public static class316 field2158 = new class316(64);

    @ObfuscatedName("hw.ai")
    public static class316 field2147 = new class316(64);

    @ObfuscatedName("hw.ay")
    public static class316 field2148 = new class316(20);

    @ObfuscatedName("hw.an")
    public int field2149 = -1;

    @ObfuscatedName("hw.ao")
    public int field2161 = 16777215;

    @ObfuscatedName("hw.af")
    public int field2152 = 70;

    @ObfuscatedName("hw.ar")
    public int field2153 = -1;

    @ObfuscatedName("hw.ab")
    public int field2154 = -1;

    @ObfuscatedName("hw.az")
    public int field2155 = -1;

    @ObfuscatedName("hw.ag")
    public int field2162 = -1;

    @ObfuscatedName("hw.ad")
    public int field2157 = 0;

    @ObfuscatedName("hw.ac")
    public int field2150 = 0;

    @ObfuscatedName("hw.av")
    public int field2143 = -1;

    @ObfuscatedName("hw.ax")
    public String field2160 = "";

    @ObfuscatedName("hw.aq")
    public int field2146 = -1;

    @ObfuscatedName("hw.al")
    public int field2159 = 0;

    @ObfuscatedName("hw.aa")
    public int[] field2163;

    @ObfuscatedName("hw.ah")
    public int field2164 = -1;

    @ObfuscatedName("hw.bh")
    public int field2165 = -1;

    @ObfuscatedName("gd.ap(Lpe;Lpe;Lpe;I)V")
    public static void method3445(class392 arg0, class392 arg1, class392 arg2) {
        Statics.field2156 = arg0;
        Statics.field2144 = arg1;
        Statics.field2151 = arg2;
    }

    @ObfuscatedName("vy.aw(II)Lhw;")
    public static class208 method9196(int arg0) {
        class208 var1 = (class208) field2158.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2156.method7009(32, arg0);
        class208 var3 = new class208();
        if (var2 != null) {
            var3.method3910(new class558(var2));
        }
        field2158.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.ak(Lvl;B)V")
    public void method3910(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3909(arg0, var2);
        }
    }

    @ObfuscatedName("hw.aj(Lvl;II)V")
    public void method3909(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2149 = arg0.method9278();
        } else if (arg1 == 2) {
            this.field2161 = arg0.method9380();
        } else if (arg1 == 3) {
            this.field2153 = arg0.method9278();
        } else if (arg1 == 4) {
            this.field2155 = arg0.method9278();
        } else if (arg1 == 5) {
            this.field2154 = arg0.method9278();
        } else if (arg1 == 6) {
            this.field2162 = arg0.method9278();
        } else if (arg1 == 7) {
            this.field2157 = arg0.method9261();
        } else if (arg1 == 8) {
            this.field2160 = arg0.method9270();
        } else if (arg1 == 9) {
            this.field2152 = arg0.method9260();
        } else if (arg1 == 10) {
            this.field2150 = arg0.method9261();
        } else if (arg1 == 11) {
            this.field2143 = 0;
        } else if (arg1 == 12) {
            this.field2146 = arg0.method9258();
        } else if (arg1 == 13) {
            this.field2159 = arg0.method9261();
        } else if (arg1 == 14) {
            this.field2143 = arg0.method9260();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2164 = arg0.method9260();
            if (this.field2164 == 65535) {
                this.field2164 = -1;
            }
            this.field2165 = arg0.method9260();
            if (this.field2165 == 65535) {
                this.field2165 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method9260();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method9258();
            this.field2163 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2163[var5] = arg0.method9260();
                if (this.field2163[var5] == 65535) {
                    this.field2163[var5] = -1;
                }
            }
            this.field2163[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hw.ai(B)Lhw;")
    public final class208 method3944() {
        int var1 = -1;
        if (this.field2164 != -1) {
            var1 = class350.method2339(this.field2164);
        } else if (this.field2165 != -1) {
            var1 = class350.field3773[this.field2165];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2163.length - 1) {
            var2 = this.field2163[var1];
        } else {
            var2 = this.field2163[this.field2163.length - 1];
        }
        return var2 == -1 ? null : method9196(var2);
    }

    @ObfuscatedName("hw.ay(II)Ljava/lang/String;")
    public String method3913(int arg0) {
        String var2 = this.field2160;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class420.method3044(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hw.as(B)Lvv;")
    public class572 method3914() {
        if (this.field2153 < 0) {
            return null;
        }
        class572 var1 = (class572) field2147.method5928((long) this.field2153);
        if (var1 != null) {
            return var1;
        }
        class572 var2 = class573.method8571(Statics.field2144, this.field2153, 0);
        if (var2 != null) {
            field2147.method5931(var2, (long) this.field2153);
        }
        return var2;
    }

    @ObfuscatedName("hw.ae(B)Lvv;")
    public class572 method3915() {
        if (this.field2154 < 0) {
            return null;
        }
        class572 var1 = (class572) field2147.method5928((long) this.field2154);
        if (var1 != null) {
            return var1;
        }
        class572 var2 = class573.method8571(Statics.field2144, this.field2154, 0);
        if (var2 != null) {
            field2147.method5931(var2, (long) this.field2154);
        }
        return var2;
    }

    @ObfuscatedName("hw.am(I)Lvv;")
    public class572 method3916() {
        if (this.field2155 < 0) {
            return null;
        }
        class572 var1 = (class572) field2147.method5928((long) this.field2155);
        if (var1 != null) {
            return var1;
        }
        class572 var2 = class573.method8571(Statics.field2144, this.field2155, 0);
        if (var2 != null) {
            field2147.method5931(var2, (long) this.field2155);
        }
        return var2;
    }

    @ObfuscatedName("hw.at(I)Lvv;")
    public class572 method3912() {
        if (this.field2162 < 0) {
            return null;
        }
        class572 var1 = (class572) field2147.method5928((long) this.field2162);
        if (var1 != null) {
            return var1;
        }
        class572 var2 = class573.method8571(Statics.field2144, this.field2162, 0);
        if (var2 != null) {
            field2147.method5931(var2, (long) this.field2162);
        }
        return var2;
    }

    @ObfuscatedName("hw.au(I)Lqi;")
    public class436 method3928() {
        if (this.field2149 == -1) {
            return null;
        }
        class436 var1 = (class436) field2148.method5928((long) this.field2149);
        if (var1 != null) {
            return var1;
        }
        class436 var2 = class573.method2351(Statics.field2144, Statics.field2151, this.field2149, 0);
        if (var2 != null) {
            field2148.method5931(var2, (long) this.field2149);
        }
        return var2;
    }

    @ObfuscatedName("er.an(I)V")
    public static void method2945() {
        field2158.method5930();
        field2147.method5930();
        field2148.method5930();
    }
}
