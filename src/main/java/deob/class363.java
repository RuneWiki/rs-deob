package deob;

@ObfuscatedName("nh")
public class class363 {

    @ObfuscatedName("nh.af")
    public class449 field4355 = new class449();

    @ObfuscatedName("nh.an")
    public class449 field4356;

    public class363() {
        this.field4355.field4746 = this.field4355;
        this.field4355.field4747 = this.field4355;
    }

    @ObfuscatedName("nh.af()V")
    public void method6323() {
        while (true) {
            class449 var1 = this.field4355.field4746;
            if (this.field4355 == var1) {
                this.field4356 = null;
                return;
            }
            var1.method7651();
        }
    }

    @ObfuscatedName("nh.an(Lrp;)V")
    public void method6324(class449 arg0) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        arg0.field4747 = this.field4355.field4747;
        arg0.field4746 = this.field4355;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
    }

    @ObfuscatedName("nh.aw(Lrp;)V")
    public void method6325(class449 arg0) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        arg0.field4747 = this.field4355;
        arg0.field4746 = this.field4355.field4746;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
    }

    @ObfuscatedName("nh.ac(Lrp;Lrp;)V")
    public static void method6351(class449 arg0, class449 arg1) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        arg0.field4747 = arg1.field4747;
        arg0.field4746 = arg1;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
    }

    @ObfuscatedName("nh.au()Lrp;")
    public class449 method6327() {
        class449 var1 = this.field4355.field4746;
        if (this.field4355 == var1) {
            return null;
        } else {
            var1.method7651();
            return var1;
        }
    }

    @ObfuscatedName("nh.ab()Lrp;")
    public class449 method6328() {
        class449 var1 = this.field4355.field4747;
        if (this.field4355 == var1) {
            return null;
        } else {
            var1.method7651();
            return var1;
        }
    }

    @ObfuscatedName("nh.aq()Lrp;")
    public class449 method6329() {
        class449 var1 = this.field4355.field4746;
        if (this.field4355 == var1) {
            this.field4356 = null;
            return null;
        } else {
            this.field4356 = var1.field4746;
            return var1;
        }
    }

    @ObfuscatedName("nh.al()Lrp;")
    public class449 method6346() {
        class449 var1 = this.field4355.field4747;
        if (this.field4355 == var1) {
            this.field4356 = null;
            return null;
        } else {
            this.field4356 = var1.field4747;
            return var1;
        }
    }

    @ObfuscatedName("nh.at()Lrp;")
    public class449 method6338() {
        class449 var1 = this.field4356;
        if (this.field4355 == var1) {
            this.field4356 = null;
            return null;
        } else {
            this.field4356 = var1.field4746;
            return var1;
        }
    }

    @ObfuscatedName("nh.aa()Lrp;")
    public class449 method6340() {
        class449 var1 = this.field4356;
        if (this.field4355 == var1) {
            this.field4356 = null;
            return null;
        } else {
            this.field4356 = var1.field4747;
            return var1;
        }
    }
}
