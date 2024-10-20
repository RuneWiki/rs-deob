package deob;

@ObfuscatedName("hf")
public class class202 extends class439 {

    @ObfuscatedName("hf.ab")
    public static class276 field2101 = new class276(64);

    @ObfuscatedName("hf.an")
    public static class276 field2111 = new class276(64);

    @ObfuscatedName("hf.ao")
    public static class276 field2103 = new class276(20);

    @ObfuscatedName("hf.ax")
    public int field2106 = -1;

    @ObfuscatedName("hf.as")
    public int field2100 = 16777215;

    @ObfuscatedName("hf.ay")
    public int field2108 = 70;

    @ObfuscatedName("hf.am")
    public int field2109 = -1;

    @ObfuscatedName("hf.az")
    public int field2110 = -1;

    @ObfuscatedName("hf.ae")
    public int field2105 = -1;

    @ObfuscatedName("hf.au")
    public int field2112 = -1;

    @ObfuscatedName("hf.ag")
    public int field2113 = 0;

    @ObfuscatedName("hf.at")
    public int field2123 = 0;

    @ObfuscatedName("hf.af")
    public int field2115 = -1;

    @ObfuscatedName("hf.ai")
    public String field2116 = "";

    @ObfuscatedName("hf.aw")
    public int field2117 = -1;

    @ObfuscatedName("hf.aa")
    public int field2107 = 0;

    @ObfuscatedName("hf.ah")
    public int[] field2119;

    @ObfuscatedName("hf.ad")
    public int field2120 = -1;

    @ObfuscatedName("hf.bm")
    public int field2121 = -1;

    @ObfuscatedName("hj.aj(II)Lhf;")
    public static class202 method3347(int arg0) {
        class202 var1 = (class202) field2101.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1322.method5860(32, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3516(new class478(var2));
        }
        field2101.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hf.al(Lsy;S)V")
    public void method3516(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3503(arg0, var2);
        }
    }

    @ObfuscatedName("hf.ac(Lsy;IB)V")
    public void method3503(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2106 = arg0.method7922();
        } else if (arg1 == 2) {
            this.field2100 = arg0.method7907();
        } else if (arg1 == 3) {
            this.field2109 = arg0.method7922();
        } else if (arg1 == 4) {
            this.field2105 = arg0.method7922();
        } else if (arg1 == 5) {
            this.field2110 = arg0.method7922();
        } else if (arg1 == 6) {
            this.field2112 = arg0.method7922();
        } else if (arg1 == 7) {
            this.field2113 = arg0.method7882();
        } else if (arg1 == 8) {
            this.field2116 = arg0.method8144();
        } else if (arg1 == 9) {
            this.field2108 = arg0.method7905();
        } else if (arg1 == 10) {
            this.field2123 = arg0.method7882();
        } else if (arg1 == 11) {
            this.field2115 = 0;
        } else if (arg1 == 12) {
            this.field2117 = arg0.method7909();
        } else if (arg1 == 13) {
            this.field2107 = arg0.method7882();
        } else if (arg1 == 14) {
            this.field2115 = arg0.method7905();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2120 = arg0.method7905();
            if (this.field2120 == 65535) {
                this.field2120 = -1;
            }
            this.field2121 = arg0.method7905();
            if (this.field2121 == 65535) {
                this.field2121 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7905();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7909();
            this.field2119 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2119[var5] = arg0.method7905();
                if (this.field2119[var5] == 65535) {
                    this.field2119[var5] = -1;
                }
            }
            this.field2119[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hf.ab(I)Lhf;")
    public final class202 method3504() {
        int var1 = -1;
        if (this.field2120 != -1) {
            var1 = class303.method233(this.field2120);
        } else if (this.field2121 != -1) {
            var1 = class303.field3428[this.field2121];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2119.length - 1) {
            var2 = this.field2119[var1];
        } else {
            var2 = this.field2119[this.field2119.length - 1];
        }
        return var2 == -1 ? null : method3347(var2);
    }

    @ObfuscatedName("hf.an(IB)Ljava/lang/String;")
    public String method3511(int arg0) {
        String var2 = this.field2116;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class368.method6806(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hf.ao(I)Lsn;")
    public class492 method3533() {
        if (this.field2109 < 0) {
            return null;
        }
        class492 var1 = (class492) field2111.method4921((long) this.field2109);
        if (var1 != null) {
            return var1;
        }
        class492 var2 = class493.method4861(Statics.field2102, this.field2109, 0);
        if (var2 != null) {
            field2111.method4923(var2, (long) this.field2109);
        }
        return var2;
    }

    @ObfuscatedName("hf.av(I)Lsn;")
    public class492 method3513() {
        if (this.field2110 < 0) {
            return null;
        }
        class492 var1 = (class492) field2111.method4921((long) this.field2110);
        if (var1 != null) {
            return var1;
        }
        class492 var2 = class493.method4861(Statics.field2102, this.field2110, 0);
        if (var2 != null) {
            field2111.method4923(var2, (long) this.field2110);
        }
        return var2;
    }

    @ObfuscatedName("hf.aq(I)Lsn;")
    public class492 method3508() {
        if (this.field2105 < 0) {
            return null;
        }
        class492 var1 = (class492) field2111.method4921((long) this.field2105);
        if (var1 != null) {
            return var1;
        }
        class492 var2 = class493.method4861(Statics.field2102, this.field2105, 0);
        if (var2 != null) {
            field2111.method4923(var2, (long) this.field2105);
        }
        return var2;
    }

    @ObfuscatedName("hf.ap(B)Lsn;")
    public class492 method3509() {
        if (this.field2112 < 0) {
            return null;
        }
        class492 var1 = (class492) field2111.method4921((long) this.field2112);
        if (var1 != null) {
            return var1;
        }
        class492 var2 = class493.method4861(Statics.field2102, this.field2112, 0);
        if (var2 != null) {
            field2111.method4923(var2, (long) this.field2112);
        }
        return var2;
    }

    @ObfuscatedName("hf.ar(I)Loe;")
    public class375 method3510() {
        if (this.field2106 == -1) {
            return null;
        }
        class375 var1 = (class375) field2103.method4921((long) this.field2106);
        if (var1 != null) {
            return var1;
        }
        class340 var2 = Statics.field2102;
        class340 var3 = Statics.field961;
        int var4 = this.field2106;
        byte[] var5 = var2.method5860(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class493.method3806(var5);
            var6 = true;
        }
        class375 var7;
        if (var6) {
            byte[] var8 = var3.method5860(var4, 0);
            class375 var9;
            if (var8 == null) {
                var9 = null;
            } else {
                class375 var10 = new class375(var8, Statics.field5010, Statics.field125, Statics.field1045, Statics.field1645, Statics.field1881, Statics.field1646);
                class493.method6860();
                var9 = var10;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field2103.method4923(var7, (long) this.field2106);
        }
        return var7;
    }
}
