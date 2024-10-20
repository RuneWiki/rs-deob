package deob;

@ObfuscatedName("fq")
public final class class20 {

    @ObfuscatedName("fq.b")
    public class6 field224 = new class6();

    @ObfuscatedName("fq.b(Lfk;)V")
    public void method247(class6 arg0) {
        if (arg0.field22 != null) {
            arg0.method51();
        }
        arg0.field22 = this.field224.field22;
        arg0.field23 = this.field224;
        arg0.field22.field23 = arg0;
        arg0.field23.field22 = arg0;
    }

    public class20() {
        this.field224.field23 = this.field224;
        this.field224.field22 = this.field224;
    }

    @ObfuscatedName("fq.k()Lfk;")
    public class6 method248() {
        class6 var1 = this.field224.field23;
        if (this.field224 == var1) {
            return null;
        } else {
            var1.method51();
            return var1;
        }
    }

    @ObfuscatedName("fq.w()Lfk;")
    public class6 method249() {
        class6 var1 = this.field224.field23;
        return this.field224 == var1 ? null : var1;
    }

    @ObfuscatedName("fq.t()V")
    public void method250() {
        while (true) {
            class6 var1 = this.field224.field23;
            if (this.field224 == var1) {
                return;
            }
            var1.method51();
        }
    }

    @ObfuscatedName("fq.h(Lfk;)V")
    public void method255(class6 arg0) {
        if (arg0.field22 != null) {
            arg0.method51();
        }
        arg0.field22 = this.field224;
        arg0.field23 = this.field224.field23;
        arg0.field22.field23 = arg0;
        arg0.field23.field22 = arg0;
    }
}
