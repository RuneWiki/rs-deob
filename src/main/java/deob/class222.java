package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("ij")
public class class222 implements class30 {

    @ObfuscatedName("ij.at")
    public class344 field2341 = null;

    @ObfuscatedName("ij.ah")
    public boolean field2342 = false;

    @ObfuscatedName("ij.ar")
    public boolean field2343 = false;

    @ObfuscatedName("ij.av(Lnn;I)V")
    public void method3928(class344 arg0) {
        if (arg0 == null) {
            this.method3929();
            return;
        }
        if (this.field2341 != arg0) {
            this.method3929();
            this.field2341 = arg0;
        }
        class340 var2 = arg0.method6118();
        if (var2 == null) {
            return;
        }
        if (!var2.field3594.method5991() && var2.field3593 != null) {
            class88 var3 = new class88();
            var3.method2241(arg0);
            var3.method2239(var2.field3593);
            client.method3906().method6547(var3);
        }
        var2.field3594.method5712(true);
    }

    @ObfuscatedName("ij.ax(S)Lnn;")
    public class344 method3942() {
        return this.field2341;
    }

    @ObfuscatedName("ij.as(I)V")
    public void method3929() {
        if (this.field2341 == null) {
            return;
        }
        class340 var1 = this.field2341.method6118();
        class344 var2 = this.field2341;
        this.field2341 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3594.method5991() && var1.field3593 != null) {
            class88 var3 = new class88();
            var3.method2241(var2);
            var3.method2239(var1.field3593);
            client.method3906().method6547(var3);
        }
        var1.field3594.method5712(false);
    }

    @ObfuscatedName("ij.at(IS)Z")
    public boolean method453(int arg0) {
        if (this.field2341 == null) {
            return false;
        }
        class28 var2 = this.field2341.method6041();
        if (var2 == null) {
            return false;
        }
        if (var2.method416(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2343 = true;
                    break;
                case 82:
                    this.field2342 = true;
                    break;
                default:
                    if (this.method3930(arg0)) {
                        client.method3158(this.field2341);
                    }
            }
        }
        return var2.method403(arg0);
    }

    @ObfuscatedName("ij.ah(II)Z")
    public boolean method455(int arg0) {
        switch(arg0) {
            case 81:
                this.field2343 = false;
                return false;
            case 82:
                this.field2342 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("ij.ar(CI)Z")
    public boolean method447(char arg0) {
        if (this.field2341 == null) {
            return false;
        } else if (class397.method6174(arg0)) {
            class342 var2 = this.field2341.method6039();
            if (var2 == null || !var2.method5745()) {
                return false;
            }
            class28 var3 = this.field2341.method6041();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method406(arg0) && var2.method5729(arg0)) {
                    client.method3158(this.field2341);
                }
                return var3.method404(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("ij.ao(ZB)Z")
    public boolean method445(boolean arg0) {
        return false;
    }

    @ObfuscatedName("ij.ay(IB)Z")
    public boolean method3930(int arg0) {
        if (this.field2341 == null) {
            return false;
        }
        class342 var2 = this.field2341.method6039();
        if (var2 == null || !var2.method5745()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3929();
                return true;
            case 48:
                if (this.field2342) {
                    var2.method5785();
                }
                return true;
            case 65:
                if (this.field2342) {
                    Clipboard var10 = Statics.field3544.method492();
                    var2.method5754(var10);
                }
                return true;
            case 66:
                if (this.field2342) {
                    Clipboard var8 = Statics.field3544.method492();
                    var2.method5753(var8);
                }
                return true;
            case 67:
                if (this.field2342) {
                    Clipboard var6 = Statics.field3544.method492();
                    var2.method5897(var6);
                }
                return true;
            case 84:
                if (var2.method5774() == 0) {
                    var2.method5729(10);
                } else if (this.field2343 && var2.method5777()) {
                    var2.method5729(10);
                } else {
                    class340 var3 = this.field2341.method6118();
                    class88 var4 = new class88();
                    var4.method2241(this.field2341);
                    var4.method2239(var3.field3596);
                    client.method3906().method6547(var4);
                    this.method3929();
                }
                return true;
            case 85:
                if (this.field2342) {
                    var2.method5779();
                } else {
                    var2.method5719();
                }
                return true;
            case 96:
                if (this.field2342) {
                    var2.method5743(this.field2343);
                } else {
                    var2.method5741(this.field2343);
                }
                return true;
            case 97:
                if (this.field2342) {
                    var2.method5744(this.field2343);
                } else {
                    var2.method5742(this.field2343);
                }
                return true;
            case 98:
                if (this.field2342) {
                    var2.method5756();
                } else {
                    var2.method5953(this.field2343);
                }
                return true;
            case 99:
                if (this.field2342) {
                    var2.method5757();
                } else {
                    var2.method5746(this.field2343);
                }
                return true;
            case 101:
                if (this.field2342) {
                    var2.method5733();
                } else {
                    var2.method5731();
                }
                return true;
            case 102:
                if (this.field2342) {
                    var2.method5916(this.field2343);
                } else {
                    var2.method5791(this.field2343);
                }
                return true;
            case 103:
                if (this.field2342) {
                    var2.method5740(this.field2343);
                } else {
                    var2.method5738(this.field2343);
                }
                return true;
            case 104:
                if (this.field2342) {
                    var2.method5947(this.field2343);
                } else {
                    var2.method5747(this.field2343);
                }
                return true;
            case 105:
                if (this.field2342) {
                    var2.method5857(this.field2343);
                } else {
                    var2.method5748(this.field2343);
                }
                return true;
            default:
                return false;
        }
    }
}
