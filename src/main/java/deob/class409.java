package deob;

@ObfuscatedName("pq")
public class class409 {

    @ObfuscatedName("pq.ak")
    public class499 field4637 = new class499();

    @ObfuscatedName("pq.al")
    public class499 field4636;

    public class409() {
        this.field4637.field5041 = this.field4637;
        this.field4637.field5040 = this.field4637;
    }

    @ObfuscatedName("pq.ak(Ltq;)V")
    public void method6969(class499 arg0) {
        if (arg0.field5040 != null) {
            arg0.method8181();
        }
        arg0.field5040 = this.field4637.field5040;
        arg0.field5041 = this.field4637;
        arg0.field5040.field5041 = arg0;
        arg0.field5041.field5040 = arg0;
    }

    @ObfuscatedName("pq.al()Ltq;")
    public class499 method6960() {
        class499 var1 = this.field4637.field5041;
        if (this.field4637 == var1) {
            this.field4636 = null;
            return null;
        } else {
            this.field4636 = var1.field5041;
            return var1;
        }
    }

    @ObfuscatedName("pq.aj()Ltq;")
    public class499 method6962() {
        class499 var1 = this.field4636;
        if (this.field4637 == var1) {
            this.field4636 = null;
            return null;
        } else {
            this.field4636 = var1.field5041;
            return var1;
        }
    }
}
