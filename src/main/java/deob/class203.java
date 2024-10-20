package deob;

@ObfuscatedName("gh")
public class class203 {

    @ObfuscatedName("gh.a")
    public class212 field3154 = new class212();

    @ObfuscatedName("gh.d")
    public class212 field3153;

    public class203() {
        this.field3154.field3170 = this.field3154;
        this.field3154.field3172 = this.field3154;
    }

    @ObfuscatedName("gh.a()V")
    public void method3611() {
        while (true) {
            class212 var1 = this.field3154.field3170;
            if (this.field3154 == var1) {
                this.field3153 = null;
                return;
            }
            var1.method3729();
        }
    }

    @ObfuscatedName("gh.d(Lhr;)V")
    public void method3612(class212 arg0) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        arg0.field3172 = this.field3154.field3172;
        arg0.field3170 = this.field3154;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
    }

    @ObfuscatedName("gh.v(Lhr;)V")
    public void method3640(class212 arg0) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        arg0.field3172 = this.field3154;
        arg0.field3170 = this.field3154.field3170;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
    }

    @ObfuscatedName("gh.r(Lhr;Lhr;)V")
    public static void method3614(class212 arg0, class212 arg1) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        arg0.field3172 = arg1.field3172;
        arg0.field3170 = arg1;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
    }

    @ObfuscatedName("gh.z()Lhr;")
    public class212 method3615() {
        class212 var1 = this.field3154.field3170;
        if (this.field3154 == var1) {
            return null;
        } else {
            var1.method3729();
            return var1;
        }
    }

    @ObfuscatedName("gh.t()Lhr;")
    public class212 method3616() {
        class212 var1 = this.field3154.field3172;
        if (this.field3154 == var1) {
            return null;
        } else {
            var1.method3729();
            return var1;
        }
    }

    @ObfuscatedName("gh.n()Lhr;")
    public class212 method3617() {
        class212 var1 = this.field3154.field3170;
        if (this.field3154 == var1) {
            this.field3153 = null;
            return null;
        } else {
            this.field3153 = var1.field3170;
            return var1;
        }
    }

    @ObfuscatedName("gh.i()Lhr;")
    public class212 method3618() {
        class212 var1 = this.field3154.field3172;
        if (this.field3154 == var1) {
            this.field3153 = null;
            return null;
        } else {
            this.field3153 = var1.field3172;
            return var1;
        }
    }

    @ObfuscatedName("gh.g()Lhr;")
    public class212 method3632() {
        class212 var1 = this.field3153;
        if (this.field3154 == var1) {
            this.field3153 = null;
            return null;
        } else {
            this.field3153 = var1.field3170;
            return var1;
        }
    }

    @ObfuscatedName("gh.m()Lhr;")
    public class212 method3642() {
        class212 var1 = this.field3153;
        if (this.field3154 == var1) {
            this.field3153 = null;
            return null;
        } else {
            this.field3153 = var1.field3172;
            return var1;
        }
    }
}
