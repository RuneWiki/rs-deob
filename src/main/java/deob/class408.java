package deob;

@ObfuscatedName("pr")
public class class408 {

    @ObfuscatedName("pr.ab")
    public class506 field4626 = new class506();

    @ObfuscatedName("pr.ay")
    public class506 field4625;

    public class408() {
        this.field4626.field5074 = this.field4626;
        this.field4626.field5076 = this.field4626;
    }

    @ObfuscatedName("pr.ab()V")
    public void method6898() {
        while (true) {
            class506 var1 = this.field4626.field5074;
            if (this.field4626 == var1) {
                this.field4625 = null;
                return;
            }
            var1.method8218();
        }
    }

    @ObfuscatedName("pr.ay(Ltp;)V")
    public void method6892(class506 arg0) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        arg0.field5076 = this.field4626.field5076;
        arg0.field5074 = this.field4626;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
    }

    @ObfuscatedName("pr.an(Ltp;)V")
    public void method6893(class506 arg0) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        arg0.field5076 = this.field4626;
        arg0.field5074 = this.field4626.field5074;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
    }

    @ObfuscatedName("pr.au(Ltp;Ltp;)V")
    public static void method6923(class506 arg0, class506 arg1) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        arg0.field5076 = arg1.field5076;
        arg0.field5074 = arg1;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
    }

    @ObfuscatedName("pr.ax()Ltp;")
    public class506 method6916() {
        class506 var1 = this.field4626.field5074;
        if (this.field4626 == var1) {
            return null;
        } else {
            var1.method8218();
            return var1;
        }
    }

    @ObfuscatedName("pr.ao()Ltp;")
    public class506 method6895() {
        class506 var1 = this.field4626.field5076;
        if (this.field4626 == var1) {
            return null;
        } else {
            var1.method8218();
            return var1;
        }
    }

    @ObfuscatedName("pr.am()Ltp;")
    public class506 method6907() {
        class506 var1 = this.field4626.field5074;
        if (this.field4626 == var1) {
            this.field4625 = null;
            return null;
        } else {
            this.field4625 = var1.field5074;
            return var1;
        }
    }

    @ObfuscatedName("pr.ac()Ltp;")
    public class506 method6897() {
        class506 var1 = this.field4626.field5076;
        if (this.field4626 == var1) {
            this.field4625 = null;
            return null;
        } else {
            this.field4625 = var1.field5076;
            return var1;
        }
    }

    @ObfuscatedName("pr.ae()Ltp;")
    public class506 method6896() {
        class506 var1 = this.field4625;
        if (this.field4626 == var1) {
            this.field4625 = null;
            return null;
        } else {
            this.field4625 = var1.field5074;
            return var1;
        }
    }

    @ObfuscatedName("pr.ad()Ltp;")
    public class506 method6899() {
        class506 var1 = this.field4625;
        if (this.field4626 == var1) {
            this.field4625 = null;
            return null;
        } else {
            this.field4625 = var1.field5076;
            return var1;
        }
    }

    @ObfuscatedName("pr.aq()Z")
    public boolean method6900() {
        return this.field4626.field5074 == this.field4626;
    }
}
