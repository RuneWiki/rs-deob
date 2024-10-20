package deob;

@ObfuscatedName("fk")
public class class173 {

    @ObfuscatedName("fk.q")
    public class178 field2815 = new class178();

    @ObfuscatedName("fk.c")
    public class178 field2816;

    public class173() {
        this.field2815.field2828 = this.field2815;
        this.field2815.field2827 = this.field2815;
    }

    @ObfuscatedName("fk.q(Lfu;)V")
    public void method3243(class178 arg0) {
        if (arg0.field2827 != null) {
            arg0.method3305();
        }
        arg0.field2827 = this.field2815.field2827;
        arg0.field2828 = this.field2815;
        arg0.field2827.field2828 = arg0;
        arg0.field2828.field2827 = arg0;
    }

    @ObfuscatedName("fk.c()Lfu;")
    public class178 method3251() {
        class178 var1 = this.field2815.field2828;
        if (this.field2815 == var1) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var1.field2828;
            return var1;
        }
    }

    @ObfuscatedName("fk.p()Lfu;")
    public class178 method3245() {
        class178 var1 = this.field2816;
        if (this.field2815 == var1) {
            this.field2816 = null;
            return null;
        } else {
            this.field2816 = var1.field2828;
            return var1;
        }
    }
}
