package deob;

@ObfuscatedName("ps")
public class class398 {

    @ObfuscatedName("ps.az")
    public class493 field4540 = new class493();

    @ObfuscatedName("ps.ah")
    public class493 field4541;

    public class398() {
        this.field4540.field4950 = this.field4540;
        this.field4540.field4952 = this.field4540;
    }

    @ObfuscatedName("ps.az()V")
    public void method6610() {
        while (true) {
            class493 var1 = this.field4540.field4950;
            if (this.field4540 == var1) {
                this.field4541 = null;
                return;
            }
            var1.method7855();
        }
    }

    @ObfuscatedName("ps.ah(Lsu;)V")
    public void method6581(class493 arg0) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        arg0.field4952 = this.field4540.field4952;
        arg0.field4950 = this.field4540;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
    }

    @ObfuscatedName("ps.af(Lsu;)V")
    public void method6583(class493 arg0) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        arg0.field4952 = this.field4540;
        arg0.field4950 = this.field4540.field4950;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
    }

    @ObfuscatedName("ps.at(Lsu;Lsu;)V")
    public static void method6579(class493 arg0, class493 arg1) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        arg0.field4952 = arg1.field4952;
        arg0.field4950 = arg1;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
    }

    @ObfuscatedName("ps.an()Lsu;")
    public class493 method6616() {
        class493 var1 = this.field4540.field4950;
        if (this.field4540 == var1) {
            return null;
        } else {
            var1.method7855();
            return var1;
        }
    }

    @ObfuscatedName("ps.ao()Lsu;")
    public class493 method6585() {
        class493 var1 = this.field4540.field4952;
        if (this.field4540 == var1) {
            return null;
        } else {
            var1.method7855();
            return var1;
        }
    }

    @ObfuscatedName("ps.ab()Lsu;")
    public class493 method6591() {
        class493 var1 = this.field4540.field4950;
        if (this.field4540 == var1) {
            this.field4541 = null;
            return null;
        } else {
            this.field4541 = var1.field4950;
            return var1;
        }
    }

    @ObfuscatedName("ps.aw()Lsu;")
    public class493 method6596() {
        class493 var1 = this.field4540.field4952;
        if (this.field4540 == var1) {
            this.field4541 = null;
            return null;
        } else {
            this.field4541 = var1.field4952;
            return var1;
        }
    }

    @ObfuscatedName("ps.ad()Lsu;")
    public class493 method6605() {
        class493 var1 = this.field4541;
        if (this.field4540 == var1) {
            this.field4541 = null;
            return null;
        } else {
            this.field4541 = var1.field4950;
            return var1;
        }
    }

    @ObfuscatedName("ps.al()Lsu;")
    public class493 method6584() {
        class493 var1 = this.field4541;
        if (this.field4540 == var1) {
            this.field4541 = null;
            return null;
        } else {
            this.field4541 = var1.field4952;
            return var1;
        }
    }

    @ObfuscatedName("ps.as()Z")
    public boolean method6614() {
        return this.field4540.field4950 == this.field4540;
    }
}
