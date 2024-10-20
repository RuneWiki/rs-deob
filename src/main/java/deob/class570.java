package deob;

@ObfuscatedName("vl")
public class class570 {

    @ObfuscatedName("vl.ac")
    public boolean field5554;

    @ObfuscatedName("vl.ae")
    public int field5551 = 0;

    @ObfuscatedName("vl.ag")
    public int[] field5550;

    @ObfuscatedName("vl.am")
    public int[] field5552;

    @ObfuscatedName("vl.ax")
    public int[] field5565;

    @ObfuscatedName("vl.aq")
    public int[] field5553;

    @ObfuscatedName("vl.af")
    public int[] field5558;

    @ObfuscatedName("vl.at")
    public int[] field5555;

    @ObfuscatedName("vl.au")
    public String[] field5556;

    @ObfuscatedName("vl.ar")
    public String[] field5557;

    @ObfuscatedName("vl.al")
    public class570[] field5549;

    @ObfuscatedName("vl.ad")
    public boolean[] field5559;

    @ObfuscatedName("vl.ah")
    public int field5560;

    @ObfuscatedName("vl.ap")
    public int field5561;

    @ObfuscatedName("vl.ab")
    public int field5562;

    @ObfuscatedName("vl.az")
    public int field5548;

    @ObfuscatedName("vl.aa")
    public int field5564;

    @ObfuscatedName("vl.ai")
    public int field5563;

    @ObfuscatedName("vl.ao")
    public long field5566;

    public class570(boolean arg0) {
        int var2 = arg0 ? 500 : 20;
        this.field5554 = arg0;
        this.field5550 = new int[var2];
        this.field5552 = new int[var2];
        this.field5565 = new int[var2];
        this.field5553 = new int[var2];
        this.field5558 = new int[var2];
        this.field5555 = new int[var2];
        this.field5556 = new String[var2];
        this.field5557 = new String[var2];
        this.field5549 = new class570[var2];
        this.field5559 = new boolean[var2];
    }

    @ObfuscatedName("vl.ac(II)Ljava/lang/String;")
    public final String method9584(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (this.field5557[arg0].isEmpty()) {
            return this.field5556[arg0];
        } else {
            return this.field5556[arg0] + class382.field4313 + this.field5557[arg0];
        }
    }

    @ObfuscatedName("vl.ae(I)V")
    public void method9566() {
        this.field5562 = Statics.field160.method7656(class382.field4306);
        for (int var1 = 0; var1 < this.field5551; var1++) {
            int var2 = Statics.field160.method7656(this.method9584(var1));
            if (this.field5549[var1] != null) {
                var2 += 15;
            }
            if (var2 > this.field5562) {
                this.field5562 = var2;
            }
        }
        this.field5562 += 8;
        this.field5548 = this.field5551 * -407222349 + 1609394292;
        if (this.field5554) {
            this.field5548 += -1347660278;
        }
    }

    @ObfuscatedName("vl.ag(III)V")
    public final void method9567(int arg0, int arg1) {
        this.method9566();
        this.field5560 = arg0 - this.field5562 / 2;
        if (this.field5562 + this.field5560 > Statics.field1721) {
            this.field5560 = Statics.field1721 - this.field5562;
        }
        if (this.field5560 < 0) {
            this.field5560 = 0;
        }
        this.field5561 = arg1;
        if (this.field5561 + this.field5548 * 1044396085 > Statics.field1500) {
            this.field5561 = Statics.field1500 - this.field5548 * 1044396085;
        }
        if (this.field5561 < 0) {
            this.field5561 = 0;
        }
        if (this.field5564 != -1 && this.field5549[this.field5564] != null) {
            this.field5549[this.field5564].method9568(this);
        }
    }

    @ObfuscatedName("vl.am(Lvl;I)V")
    public final void method9568(class570 arg0) {
        this.method9566();
        this.field5560 = arg0.field5562 + arg0.field5560;
        if (this.field5562 + this.field5560 > Statics.field1721) {
            this.field5560 = arg0.field5560 - this.field5562;
        }
        if (this.field5560 < 0) {
            this.field5560 = 0;
        }
        int var2 = arg0.field5561 + (arg0.field5551 * 15 - 15 - arg0.field5564 * 15);
        if (arg0.field5554) {
            var2 += 17;
        }
        int var3 = var2 + 19;
        this.field5561 = var2;
        if (this.field5561 + this.field5548 * 1044396085 > Statics.field1500) {
            this.field5561 = var3 - this.field5548 * 1044396085;
        }
        if (this.field5561 < 0) {
            this.field5561 = 0;
        }
    }

    @ObfuscatedName("vl.ax(III)I")
    public final int method9569(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field5551; var3++) {
            int var4 = (this.field5551 - 1 - var3) * 15 + this.field5561 + 14;
            if (this.field5554) {
                var4 += 17;
            }
            if (arg0 > this.field5560 && arg0 < this.field5562 + this.field5560 && arg1 > var4 - 13 && arg1 < var4 + 3) {
                return var3;
            }
        }
        return -1;
    }

    @ObfuscatedName("vl.aq(IB)V")
    public final void method9570(int arg0) {
        if (arg0 >= 0) {
            client.method7191(this.field5550[arg0], this.field5552[arg0], this.field5565[arg0], this.field5553[arg0], this.field5558[arg0], this.field5555[arg0], this.field5556[arg0], this.field5557[arg0], class36.field209, class36.field207);
        }
    }

    @ObfuscatedName("vl.af(III)Z")
    public final boolean method9607(int arg0, int arg1) {
        if (this.field5564 != -1 && this.field5549[this.field5564] != null && this.field5549[this.field5564].method9607(arg0, arg1)) {
            return true;
        } else if (arg0 >= this.field5560 - 10 && arg0 <= this.field5562 + this.field5560 + 10 && arg1 >= this.field5561 - 10 && arg1 <= this.field5561 + this.field5548 * 1044396085 + 10) {
            int var3 = this.method9569(arg0, arg1);
            if (var3 != -1 && this.field5564 != var3) {
                if (this.field5563 != var3) {
                    this.field5563 = var3;
                    this.field5566 = class331.method3482();
                    if (this.field5564 != -1) {
                        this.field5566 += 300L;
                    }
                }
                if (this.field5566 <= class331.method3482()) {
                    this.field5563 = -1;
                    this.method9589();
                    if (this.field5549[var3] != null) {
                        this.field5564 = var3;
                        this.field5549[var3].method9568(this);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("vl.at(IIB)Z")
    public final boolean method9572(int arg0, int arg1) {
        if (this.field5564 != -1 && this.field5549[this.field5564] != null && this.field5549[this.field5564].method9572(arg0, arg1)) {
            return true;
        }
        int var3 = this.method9569(arg0, arg1);
        if (var3 == -1) {
            return false;
        } else {
            this.method9570(var3);
            return true;
        }
    }

    @ObfuscatedName("vl.au(I)V")
    public final void method9586() {
        this.field5564 = -1;
        for (int var1 = 0; var1 < this.field5551; var1++) {
            if (this.field5549[var1] != null) {
                this.field5549[var1].method9586();
            }
        }
    }

    @ObfuscatedName("vl.ar(I)V")
    public final void method9574() {
        int var1 = this.field5560;
        int var2 = this.field5561;
        int var3 = this.field5562;
        int var4 = this.field5548 * 1044396085;
        for (int var5 = 0; var5 < client.field700; var5++) {
            if (client.field736[var5] + client.field734[var5] > var1 && client.field734[var5] < var1 + var3 && client.field751[var5] + client.field737[var5] > var2 && client.field751[var5] < var2 + var4) {
                client.field731[var5] = true;
            }
        }
        this.method9589();
    }

    @ObfuscatedName("vl.al(B)V")
    public final void method9589() {
        if (this.field5564 != -1) {
            if (this.field5549[this.field5564] != null) {
                this.field5549[this.field5564].method9574();
            }
            this.field5564 = -1;
        }
    }

    @ObfuscatedName("vl.ad(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I")
    public final int method9576(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (this.field5551 >= this.field5556.length) {
            return -1;
        }
        this.field5556[this.field5551] = arg0;
        this.field5557[this.field5551] = arg1;
        this.field5565[this.field5551] = arg2;
        this.field5553[this.field5551] = arg3;
        this.field5550[this.field5551] = arg4;
        this.field5552[this.field5551] = arg5;
        this.field5558[this.field5551] = arg6;
        this.field5555[this.field5551] = arg8;
        this.field5559[this.field5551] = arg7;
        this.field5549[this.field5551] = null;
        return ++this.field5551 - 1;
    }

    @ObfuscatedName("vl.ah(I)V")
    public final void method9577() {
        int var1 = this.field5560;
        int var2 = this.field5561;
        int var3 = 6116423;
        class561.method9302(var1, var2, this.field5562, this.field5548 * 1044396085, var3);
        if (this.field5554) {
            class561.method9302(var1 + 1, var2 + 1, this.field5562 - 2, 16, 0);
            class561.method9306(var1 + 1, var2 + 18, this.field5562 - 2, this.field5548 * 1044396085 - 19, 0);
            Statics.field160.method7662(class382.field4306, var1 + 3, var2 + 14, var3, -1);
        } else {
            class561.method9306(var1 + 1, var2 + 1, this.field5562 - 2, this.field5548 * 1044396085 - 2, 0);
        }
        int var4 = class36.field217;
        int var5 = class36.field210;
        for (int var6 = 0; var6 < this.field5551; var6++) {
            int var7 = (this.field5551 - 1 - var6) * 15 + var2 + 14;
            if (this.field5554) {
                var7 += 17;
            }
            int var8 = 16777215;
            if (var4 > var1 && var4 < this.field5562 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
                var8 = 16776960;
            }
            if (this.field5564 == var6 || this.field5563 == var6 && this.field5549[var6] != null) {
                class561.method9302(var1 + 2, var7 - 12, this.field5562 - 4, 15, 7496785);
            }
            Statics.field160.method7662(this.method9584(var6), var1 + 3, var7, var8, 0);
            if (this.field5549[var6] != null) {
                Statics.field160.method7673(62, this.field5562 + var1 - 10, var7, 16777215);
            }
        }
        client.method452(this.field5560, this.field5561, this.field5562, this.field5548 * 1044396085);
        if (this.field5564 != -1 && this.field5549[this.field5564] != null) {
            this.field5549[this.field5564].method9577();
        }
    }
}
