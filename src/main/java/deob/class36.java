package deob;

@ObfuscatedName("am")
public class class36 extends class46 {

    @ObfuscatedName("am.c")
    public class336 field262 = new class336();

    @ObfuscatedName("am.p")
    public class336 field263 = new class336();

    @ObfuscatedName("am.f")
    public int field264 = 0;

    @ObfuscatedName("am.n")
    public int field265 = -1;

    @ObfuscatedName("am.c(Lay;)V")
    public final synchronized void method645(class46 arg0) {
        this.field262.method5640(arg0);
    }

    @ObfuscatedName("am.p(Lay;)V")
    public final synchronized void method646(class46 arg0) {
        arg0.method6657();
    }

    @ObfuscatedName("am.f()V")
    public void method651() {
        if (this.field264 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field263.method5647(); var1 != null; var1 = (class52) this.field263.method5649()) {
            var1.field409 -= this.field264;
        }
        this.field265 -= this.field264;
        this.field264 = 0;
    }

    @ObfuscatedName("am.n(Lov;Lau;)V")
    public void method674(class412 arg0, class52 arg1) {
        while (this.field263.field4167 != arg0 && ((class52) arg0).field409 <= arg1.field409) {
            arg0 = arg0.field4505;
        }
        class336.method5644(arg1, arg0);
        this.field265 = ((class52) this.field263.field4167.field4505).field409;
    }

    @ObfuscatedName("am.k(Lau;)V")
    public void method649(class52 arg0) {
        arg0.method6657();
        arg0.method1022();
        class412 var2 = this.field263.field4167.field4505;
        if (this.field263.field4167 == var2) {
            this.field265 = -1;
        } else {
            this.field265 = ((class52) var2).field409;
        }
    }

    @ObfuscatedName("am.w()Lay;")
    public class46 method650() {
        return (class46) this.field262.method5647();
    }

    @ObfuscatedName("am.s()Lay;")
    public class46 method661() {
        return (class46) this.field262.method5649();
    }

    @ObfuscatedName("am.q()I")
    public int method652() {
        return 0;
    }

    @ObfuscatedName("am.m([III)V")
    public final synchronized void method665(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field265 < 0) {
                this.method654(arg0, arg1, arg2);
                return;
            }
            if (this.field264 + arg2 < this.field265) {
                this.field264 += arg2;
                this.method654(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field265 - this.field264;
            this.method654(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field264 += var4;
            this.method651();
            class52 var5 = (class52) this.field263.method5647();
            synchronized (var5) {
                int var7 = var5.method1019(this);
                if (var7 < 0) {
                    var5.field409 = 0;
                    this.method649(var5);
                } else {
                    var5.field409 = var7;
                    this.method674(var5.field4505, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("am.x([III)V")
    public void method654(int[] arg0, int arg1, int arg2) {
        for (class46 var4 = (class46) this.field262.method5647(); var4 != null; var4 = (class46) this.field262.method5649()) {
            var4.method972(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("am.j(I)V")
    public final synchronized void method655(int arg0) {
        do {
            if (this.field265 < 0) {
                this.method644(arg0);
                return;
            }
            if (this.field264 + arg0 < this.field265) {
                this.field264 += arg0;
                this.method644(arg0);
                return;
            }
            int var2 = this.field265 - this.field264;
            this.method644(var2);
            arg0 -= var2;
            this.field264 += var2;
            this.method651();
            class52 var3 = (class52) this.field263.method5647();
            synchronized (var3) {
                int var5 = var3.method1019(this);
                if (var5 < 0) {
                    var3.field409 = 0;
                    this.method649(var3);
                } else {
                    var3.field409 = var5;
                    this.method674(var3.field4505, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("am.v(I)V")
    public void method644(int arg0) {
        for (class46 var2 = (class46) this.field262.method5647(); var2 != null; var2 = (class46) this.field262.method5649()) {
            var2.method655(arg0);
        }
    }
}
