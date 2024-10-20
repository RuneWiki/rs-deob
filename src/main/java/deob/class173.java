package deob;

@ObfuscatedName("fq")
public class class173 {

    @ObfuscatedName("fq.j")
    public class178 field2795 = new class178();

    @ObfuscatedName("fq.r")
    public class178 field2794;

    public class173() {
        this.field2795.field2806 = this.field2795;
        this.field2795.field2807 = this.field2795;
    }

    @ObfuscatedName("fq.j(Lfv;)V")
    public void method3288(class178 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3355();
        }
        arg0.field2807 = this.field2795.field2807;
        arg0.field2806 = this.field2795;
        arg0.field2807.field2806 = arg0;
        arg0.field2806.field2807 = arg0;
    }

    @ObfuscatedName("fq.r()Lfv;")
    public class178 method3289() {
        class178 var1 = this.field2795.field2806;
        if (this.field2795 == var1) {
            this.field2794 = null;
            return null;
        } else {
            this.field2794 = var1.field2806;
            return var1;
        }
    }

    @ObfuscatedName("fq.v()Lfv;")
    public class178 method3290() {
        class178 var1 = this.field2794;
        if (this.field2795 == var1) {
            this.field2794 = null;
            return null;
        } else {
            this.field2794 = var1.field2806;
            return var1;
        }
    }
}
