package deob;

@ObfuscatedName("gw")
public class class199 {

    @ObfuscatedName("gw.m")
    public class208 field3078 = new class208();

    @ObfuscatedName("gw.l")
    public class208 field3077;

    public class199() {
        this.field3078.field3094 = this.field3078;
        this.field3078.field3093 = this.field3078;
    }

    @ObfuscatedName("gw.m()V")
    public void method3605() {
        while (true) {
            class208 var1 = this.field3078.field3094;
            if (this.field3078 == var1) {
                this.field3077 = null;
                return;
            }
            var1.method3702();
        }
    }

    @ObfuscatedName("gw.l(Lgs;)V")
    public void method3606(class208 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3702();
        }
        arg0.field3093 = this.field3078.field3093;
        arg0.field3094 = this.field3078;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    @ObfuscatedName("gw.y(Lgs;)V")
    public void method3633(class208 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3702();
        }
        arg0.field3093 = this.field3078;
        arg0.field3094 = this.field3078.field3094;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    @ObfuscatedName("gw.u(Lgs;Lgs;)V")
    public static void method3610(class208 arg0, class208 arg1) {
        if (arg0.field3093 != null) {
            arg0.method3702();
        }
        arg0.field3093 = arg1.field3093;
        arg0.field3094 = arg1;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    @ObfuscatedName("gw.k()Lgs;")
    public class208 method3609() {
        class208 var1 = this.field3078.field3094;
        if (this.field3078 == var1) {
            return null;
        } else {
            var1.method3702();
            return var1;
        }
    }

    @ObfuscatedName("gw.j()Lgs;")
    public class208 method3625() {
        class208 var1 = this.field3078.field3093;
        if (this.field3078 == var1) {
            return null;
        } else {
            var1.method3702();
            return var1;
        }
    }

    @ObfuscatedName("gw.i()Lgs;")
    public class208 method3611() {
        class208 var1 = this.field3078.field3094;
        if (this.field3078 == var1) {
            this.field3077 = null;
            return null;
        } else {
            this.field3077 = var1.field3094;
            return var1;
        }
    }

    @ObfuscatedName("gw.x()Lgs;")
    public class208 method3612() {
        class208 var1 = this.field3078.field3093;
        if (this.field3078 == var1) {
            this.field3077 = null;
            return null;
        } else {
            this.field3077 = var1.field3093;
            return var1;
        }
    }

    @ObfuscatedName("gw.g()Lgs;")
    public class208 method3613() {
        class208 var1 = this.field3077;
        if (this.field3078 == var1) {
            this.field3077 = null;
            return null;
        } else {
            this.field3077 = var1.field3094;
            return var1;
        }
    }

    @ObfuscatedName("gw.e()Lgs;")
    public class208 method3614() {
        class208 var1 = this.field3077;
        if (this.field3078 == var1) {
            this.field3077 = null;
            return null;
        } else {
            this.field3077 = var1.field3093;
            return var1;
        }
    }
}
