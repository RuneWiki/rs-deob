package deob;

@ObfuscatedName("bj")
public class class39 extends class50 {

    @ObfuscatedName("bj.az")
    public class398 field247 = new class398();

    @ObfuscatedName("bj.ah")
    public class398 field248 = new class398();

    @ObfuscatedName("bj.af")
    public int field249 = 0;

    @ObfuscatedName("bj.at")
    public int field250 = -1;

    @ObfuscatedName("bj.az(Lba;)V")
    public final synchronized void method670(class50 arg0) {
        this.field247.method6583(arg0);
    }

    @ObfuscatedName("bj.ah(Lba;)V")
    public final synchronized void method669(class50 arg0) {
        arg0.method7855();
    }

    @ObfuscatedName("bj.af()V")
    public void method673() {
        if (this.field249 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field248.method6591(); var1 != null; var1 = (class57) this.field248.method6605()) {
            var1.field392 -= this.field249;
        }
        this.field250 -= this.field249;
        this.field249 = 0;
    }

    @ObfuscatedName("bj.at(Lsu;Lcg;)V")
    public void method671(class493 arg0, class57 arg1) {
        while (this.field248.field4540 != arg0 && ((class57) arg0).field392 <= arg1.field392) {
            arg0 = arg0.field4950;
        }
        class398.method6579(arg1, arg0);
        this.field250 = ((class57) this.field248.field4540.field4950).field392;
    }

    @ObfuscatedName("bj.an(Lcg;)V")
    public void method672(class57 arg0) {
        arg0.method7855();
        arg0.method1013();
        class493 var2 = this.field248.field4540.field4950;
        if (this.field248.field4540 == var2) {
            this.field250 = -1;
        } else {
            this.field250 = ((class57) var2).field392;
        }
    }

    @ObfuscatedName("bj.ao()Lba;")
    public class50 method692() {
        return (class50) this.field247.method6591();
    }

    @ObfuscatedName("bj.ab()Lba;")
    public class50 method696() {
        return (class50) this.field247.method6605();
    }

    @ObfuscatedName("bj.aw()I")
    public int method709() {
        return 0;
    }

    @ObfuscatedName("bj.ad([III)V")
    public final synchronized void method667(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field250 < 0) {
                this.method677(arg0, arg1, arg2);
                return;
            }
            if (this.field249 + arg2 < this.field250) {
                this.field249 += arg2;
                this.method677(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field250 - this.field249;
            this.method677(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field249 += var4;
            this.method673();
            class57 var5 = (class57) this.field248.method6591();
            synchronized (var5) {
                int var7 = var5.method1011(this);
                if (var7 < 0) {
                    var5.field392 = 0;
                    this.method672(var5);
                } else {
                    var5.field392 = var7;
                    this.method671(var5.field4950, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bj.al([III)V")
    public void method677(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field247.method6591(); var4 != null; var4 = (class50) this.field247.method6605()) {
            var4.method959(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bj.as(I)V")
    public final synchronized void method678(int arg0) {
        do {
            if (this.field250 < 0) {
                this.method679(arg0);
                return;
            }
            if (this.field249 + arg0 < this.field250) {
                this.field249 += arg0;
                this.method679(arg0);
                return;
            }
            int var2 = this.field250 - this.field249;
            this.method679(var2);
            arg0 -= var2;
            this.field249 += var2;
            this.method673();
            class57 var3 = (class57) this.field248.method6591();
            synchronized (var3) {
                int var5 = var3.method1011(this);
                if (var5 < 0) {
                    var3.field392 = 0;
                    this.method672(var3);
                } else {
                    var3.field392 = var5;
                    this.method671(var3.field4950, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bj.ag(I)V")
    public void method679(int arg0) {
        for (class50 var2 = (class50) this.field247.method6591(); var2 != null; var2 = (class50) this.field247.method6605()) {
            var2.method678(arg0);
        }
    }
}
