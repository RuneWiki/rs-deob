package deob;

@ObfuscatedName("ay")
public class class36 extends class46 {

    @ObfuscatedName("ay.c")
    public class326 field264 = new class326();

    @ObfuscatedName("ay.l")
    public class326 field263 = new class326();

    @ObfuscatedName("ay.s")
    public int field265 = 0;

    @ObfuscatedName("ay.e")
    public int field266 = -1;

    @ObfuscatedName("ay.c(Lan;)V")
    public final synchronized void method629(class46 arg0) {
        this.field264.method5263(arg0);
    }

    @ObfuscatedName("ay.l(Lan;)V")
    public final synchronized void method630(class46 arg0) {
        arg0.method6167();
    }

    @ObfuscatedName("ay.s()V")
    public void method631() {
        if (this.field265 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field263.method5269(); var1 != null; var1 = (class52) this.field263.method5270()) {
            var1.field408 -= this.field265;
        }
        this.field266 -= this.field265;
        this.field265 = 0;
    }

    @ObfuscatedName("ay.e(Loe;Lam;)V")
    public void method633(class392 arg0, class52 arg1) {
        while (this.field263.field4011 != arg0 && ((class52) arg0).field408 <= arg1.field408) {
            arg0 = arg0.field4300;
        }
        class326.method5289(arg1, arg0);
        this.field266 = ((class52) this.field263.field4011.field4300).field408;
    }

    @ObfuscatedName("ay.r(Lam;)V")
    public void method628(class52 arg0) {
        arg0.method6167();
        arg0.method961();
        class392 var2 = this.field263.field4011.field4300;
        if (this.field263.field4011 == var2) {
            this.field266 = -1;
        } else {
            this.field266 = ((class52) var2).field408;
        }
    }

    @ObfuscatedName("ay.o()Lan;")
    public class46 method634() {
        return (class46) this.field264.method5269();
    }

    @ObfuscatedName("ay.i()Lan;")
    public class46 method647() {
        return (class46) this.field264.method5270();
    }

    @ObfuscatedName("ay.w()I")
    public int method636() {
        return 0;
    }

    @ObfuscatedName("ay.v([III)V")
    public final synchronized void method637(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field266 < 0) {
                this.method638(arg0, arg1, arg2);
                return;
            }
            if (this.field265 + arg2 < this.field266) {
                this.field265 += arg2;
                this.method638(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field266 - this.field265;
            this.method638(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field265 += var4;
            this.method631();
            class52 var5 = (class52) this.field263.method5269();
            synchronized (var5) {
                int var7 = var5.method965(this);
                if (var7 < 0) {
                    var5.field408 = 0;
                    this.method628(var5);
                } else {
                    var5.field408 = var7;
                    this.method633(var5.field4300, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ay.a([III)V")
    public void method638(int[] arg0, int arg1, int arg2) {
        for (class46 var4 = (class46) this.field264.method5269(); var4 != null; var4 = (class46) this.field264.method5270()) {
            var4.method912(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ay.y(I)V")
    public final synchronized void method639(int arg0) {
        do {
            if (this.field266 < 0) {
                this.method640(arg0);
                return;
            }
            if (this.field265 + arg0 < this.field266) {
                this.field265 += arg0;
                this.method640(arg0);
                return;
            }
            int var2 = this.field266 - this.field265;
            this.method640(var2);
            arg0 -= var2;
            this.field265 += var2;
            this.method631();
            class52 var3 = (class52) this.field263.method5269();
            synchronized (var3) {
                int var5 = var3.method965(this);
                if (var5 < 0) {
                    var3.field408 = 0;
                    this.method628(var3);
                } else {
                    var3.field408 = var5;
                    this.method633(var3.field4300, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ay.u(I)V")
    public void method640(int arg0) {
        for (class46 var2 = (class46) this.field264.method5269(); var2 != null; var2 = (class46) this.field264.method5270()) {
            var2.method639(arg0);
        }
    }
}
