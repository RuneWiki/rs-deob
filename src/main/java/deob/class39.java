package deob;

@ObfuscatedName("bn")
public class class39 extends class49 {

    @ObfuscatedName("bn.af")
    public class363 field272 = new class363();

    @ObfuscatedName("bn.an")
    public class363 field273 = new class363();

    @ObfuscatedName("bn.aw")
    public int field274 = 0;

    @ObfuscatedName("bn.ac")
    public int field275 = -1;

    @ObfuscatedName("bn.af(Lbp;)V")
    public final synchronized void method739(class49 arg0) {
        this.field272.method6325(arg0);
    }

    @ObfuscatedName("bn.an(Lbp;)V")
    public final synchronized void method761(class49 arg0) {
        arg0.method7651();
    }

    @ObfuscatedName("bn.aw()V")
    public void method723() {
        if (this.field274 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field273.method6329(); var1 != null; var1 = (class55) this.field273.method6338()) {
            var1.field412 -= this.field274;
        }
        this.field275 -= this.field274;
        this.field274 = 0;
    }

    @ObfuscatedName("bn.ac(Lrp;Lcs;)V")
    public void method724(class449 arg0, class55 arg1) {
        while (this.field273.field4355 != arg0 && ((class55) arg0).field412 <= arg1.field412) {
            arg0 = arg0.field4746;
        }
        class363.method6351(arg1, arg0);
        this.field275 = ((class55) this.field273.field4355.field4746).field412;
    }

    @ObfuscatedName("bn.au(Lcs;)V")
    public void method730(class55 arg0) {
        arg0.method7651();
        arg0.method1049();
        class449 var2 = this.field273.field4355.field4746;
        if (this.field273.field4355 == var2) {
            this.field275 = -1;
        } else {
            this.field275 = ((class55) var2).field412;
        }
    }

    @ObfuscatedName("bn.ab()Lbp;")
    public class49 method726() {
        return (class49) this.field272.method6329();
    }

    @ObfuscatedName("bn.aq()Lbp;")
    public class49 method727() {
        return (class49) this.field272.method6338();
    }

    @ObfuscatedName("bn.al()I")
    public int method728() {
        return 0;
    }

    @ObfuscatedName("bn.at([III)V")
    public final synchronized void method729(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field275 < 0) {
                this.method745(arg0, arg1, arg2);
                return;
            }
            if (this.field274 + arg2 < this.field275) {
                this.field274 += arg2;
                this.method745(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field275 - this.field274;
            this.method745(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field274 += var4;
            this.method723();
            class55 var5 = (class55) this.field273.method6329();
            synchronized (var5) {
                int var7 = var5.method1046(this);
                if (var7 < 0) {
                    var5.field412 = 0;
                    this.method730(var5);
                } else {
                    var5.field412 = var7;
                    this.method724(var5.field4746, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bn.aa([III)V")
    public void method745(int[] arg0, int arg1, int arg2) {
        for (class49 var4 = (class49) this.field272.method6329(); var4 != null; var4 = (class49) this.field272.method6338()) {
            var4.method994(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bn.ay(I)V")
    public final synchronized void method755(int arg0) {
        do {
            if (this.field275 < 0) {
                this.method731(arg0);
                return;
            }
            if (this.field274 + arg0 < this.field275) {
                this.field274 += arg0;
                this.method731(arg0);
                return;
            }
            int var2 = this.field275 - this.field274;
            this.method731(var2);
            arg0 -= var2;
            this.field274 += var2;
            this.method723();
            class55 var3 = (class55) this.field273.method6329();
            synchronized (var3) {
                int var5 = var3.method1046(this);
                if (var5 < 0) {
                    var3.field412 = 0;
                    this.method730(var3);
                } else {
                    var3.field412 = var5;
                    this.method724(var3.field4746, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bn.ao(I)V")
    public void method731(int arg0) {
        for (class49 var2 = (class49) this.field272.method6329(); var2 != null; var2 = (class49) this.field272.method6338()) {
            var2.method755(arg0);
        }
    }
}
