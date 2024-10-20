package deob;

@ObfuscatedName("br")
public class class39 extends class50 {

    @ObfuscatedName("br.ab")
    public class408 field237 = new class408();

    @ObfuscatedName("br.ay")
    public class408 field235 = new class408();

    @ObfuscatedName("br.an")
    public int field236 = 0;

    @ObfuscatedName("br.au")
    public int field234 = -1;

    @ObfuscatedName("br.ab(Lbb;)V")
    public final synchronized void method675(class50 arg0) {
        this.field237.method6893(arg0);
    }

    @ObfuscatedName("br.ay(Lbb;)V")
    public final synchronized void method676(class50 arg0) {
        arg0.method8218();
    }

    @ObfuscatedName("br.an()V")
    public void method677() {
        if (this.field236 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field235.method6907(); var1 != null; var1 = (class57) this.field235.method6896()) {
            var1.field380 -= this.field236;
        }
        this.field234 -= this.field236;
        this.field236 = 0;
    }

    @ObfuscatedName("br.au(Ltp;Lct;)V")
    public void method678(class506 arg0, class57 arg1) {
        while (this.field235.field4626 != arg0 && ((class57) arg0).field380 <= arg1.field380) {
            arg0 = arg0.field5074;
        }
        class408.method6923(arg1, arg0);
        this.field234 = ((class57) this.field235.field4626.field5074).field380;
    }

    @ObfuscatedName("br.ax(Lct;)V")
    public void method679(class57 arg0) {
        arg0.method8218();
        arg0.method1021();
        class506 var2 = this.field235.field4626.field5074;
        if (this.field235.field4626 == var2) {
            this.field234 = -1;
        } else {
            this.field234 = ((class57) var2).field380;
        }
    }

    @ObfuscatedName("br.ao()Lbb;")
    public class50 method705() {
        return (class50) this.field237.method6907();
    }

    @ObfuscatedName("br.am()Lbb;")
    public class50 method687() {
        return (class50) this.field237.method6896();
    }

    @ObfuscatedName("br.ac()I")
    public int method682() {
        return 0;
    }

    @ObfuscatedName("br.ae([III)V")
    public final synchronized void method683(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field234 < 0) {
                this.method681(arg0, arg1, arg2);
                return;
            }
            if (this.field236 + arg2 < this.field234) {
                this.field236 += arg2;
                this.method681(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field234 - this.field236;
            this.method681(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field236 += var4;
            this.method677();
            class57 var5 = (class57) this.field235.method6907();
            synchronized (var5) {
                int var7 = var5.method1026(this);
                if (var7 < 0) {
                    var5.field380 = 0;
                    this.method679(var5);
                } else {
                    var5.field380 = var7;
                    this.method678(var5.field5074, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("br.ad([III)V")
    public void method681(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field237.method6907(); var4 != null; var4 = (class50) this.field237.method6896()) {
            var4.method965(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("br.aq(I)V")
    public final synchronized void method693(int arg0) {
        do {
            if (this.field234 < 0) {
                this.method708(arg0);
                return;
            }
            if (this.field236 + arg0 < this.field234) {
                this.field236 += arg0;
                this.method708(arg0);
                return;
            }
            int var2 = this.field234 - this.field236;
            this.method708(var2);
            arg0 -= var2;
            this.field236 += var2;
            this.method677();
            class57 var3 = (class57) this.field235.method6907();
            synchronized (var3) {
                int var5 = var3.method1026(this);
                if (var5 < 0) {
                    var3.field380 = 0;
                    this.method679(var3);
                } else {
                    var3.field380 = var5;
                    this.method678(var3.field5074, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("br.al(I)V")
    public void method708(int arg0) {
        for (class50 var2 = (class50) this.field237.method6907(); var2 != null; var2 = (class50) this.field237.method6896()) {
            var2.method693(arg0);
        }
    }
}
