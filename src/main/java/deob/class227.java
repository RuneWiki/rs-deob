package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("iy")
public class class227 implements class30 {

    @ObfuscatedName("iy.az")
    public class350 field2419 = null;

    @ObfuscatedName("iy.ah")
    public boolean field2417 = false;

    @ObfuscatedName("iy.af")
    public boolean field2418 = false;

    @ObfuscatedName("iy.ax(Lnt;I)V")
    public void method3950(class350 arg0) {
        if (arg0 == null) {
            this.method3952();
            return;
        }
        if (this.field2419 != arg0) {
            this.method3952();
            this.field2419 = arg0;
        }
        class346 var2 = arg0.method6083();
        if (var2 == null) {
            return;
        }
        if (!var2.field3675.method5859() && var2.field3676 != null) {
            class89 var3 = new class89();
            var3.method2207(arg0);
            var3.method2211(var2.field3676);
            client.method2911().method6581(var3);
        }
        var2.field3675.method5886(true);
    }

    @ObfuscatedName("iy.ar(B)Lnt;")
    public class350 method3951() {
        return this.field2419;
    }

    @ObfuscatedName("iy.aj(I)V")
    public void method3952() {
        if (this.field2419 == null) {
            return;
        }
        class346 var1 = this.field2419.method6083();
        class350 var2 = this.field2419;
        this.field2419 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3675.method5859() && var1.field3676 != null) {
            class89 var3 = new class89();
            var3.method2207(var2);
            var3.method2211(var1.field3676);
            client.method2911().method6581(var3);
        }
        var1.field3675.method5886(false);
    }

    @ObfuscatedName("iy.az(II)Z")
    public boolean method407(int arg0) {
        if (this.field2419 == null) {
            return false;
        }
        class28 var2 = this.field2419.method6082();
        if (var2 == null) {
            return false;
        }
        if (var2.method364(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2418 = true;
                    break;
                case 82:
                    this.field2417 = true;
                    break;
                default:
                    if (this.method3955(arg0)) {
                        client.method4817(this.field2419);
                    }
            }
        }
        return var2.method362(arg0);
    }

    @ObfuscatedName("iy.ah(IB)Z")
    public boolean method408(int arg0) {
        switch(arg0) {
            case 81:
                this.field2418 = false;
                return false;
            case 82:
                this.field2417 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("iy.af(CI)Z")
    public boolean method409(char arg0) {
        if (this.field2419 == null) {
            return false;
        } else if (class405.method2464(arg0)) {
            class348 var2 = this.field2419.method6067();
            if (var2 == null || !var2.method5913()) {
                return false;
            }
            class28 var3 = this.field2419.method6082();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method361(arg0) && var2.method5804(arg0)) {
                    client.method4817(this.field2419);
                }
                return var3.method363(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("iy.at(ZB)Z")
    public boolean method411(boolean arg0) {
        return false;
    }

    @ObfuscatedName("iy.au(II)Z")
    public boolean method3955(int arg0) {
        if (this.field2419 == null) {
            return false;
        }
        class348 var2 = this.field2419.method6067();
        if (var2 == null || !var2.method5913()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3952();
                return true;
            case 48:
                if (this.field2417) {
                    var2.method5787();
                }
                return true;
            case 65:
                if (this.field2417) {
                    Clipboard var10 = Statics.field1468.method460();
                    var2.method5820(var10);
                }
                return true;
            case 66:
                if (this.field2417) {
                    Clipboard var8 = Statics.field1468.method460();
                    var2.method5805(var8);
                }
                return true;
            case 67:
                if (this.field2417) {
                    Clipboard var6 = Statics.field1468.method460();
                    var2.method5918(var6);
                }
                return true;
            case 84:
                if (var2.method5974() == 0) {
                    var2.method5804(10);
                } else if (this.field2418 && var2.method5830()) {
                    var2.method5804(10);
                } else {
                    class346 var3 = this.field2419.method6083();
                    class89 var4 = new class89();
                    var4.method2207(this.field2419);
                    var4.method2211(var3.field3678);
                    client.method2911().method6581(var4);
                    this.method3952();
                }
                return true;
            case 85:
                if (this.field2417) {
                    var2.method5784();
                } else {
                    var2.method5782();
                }
                return true;
            case 96:
                if (this.field2417) {
                    var2.method5958(this.field2418);
                } else {
                    var2.method5793(this.field2418);
                }
                return true;
            case 97:
                if (this.field2417) {
                    var2.method5796(this.field2418);
                } else {
                    var2.method5887(this.field2418);
                }
                return true;
            case 98:
                if (this.field2417) {
                    var2.method5991();
                } else {
                    var2.method5815(this.field2418);
                }
                return true;
            case 99:
                if (this.field2417) {
                    var2.method5801();
                } else {
                    var2.method5798(this.field2418);
                }
                return true;
            case 101:
                if (this.field2417) {
                    var2.method5785();
                } else {
                    var2.method5783();
                }
                return true;
            case 102:
                if (this.field2417) {
                    var2.method5791(this.field2418);
                } else {
                    var2.method5789(this.field2418);
                }
                return true;
            case 103:
                if (this.field2417) {
                    var2.method5902(this.field2418);
                } else {
                    var2.method5819(this.field2418);
                }
                return true;
            case 104:
                if (this.field2417) {
                    var2.method5844(this.field2418);
                } else {
                    var2.method5799(this.field2418);
                }
                return true;
            case 105:
                if (this.field2417) {
                    var2.method5802(this.field2418);
                } else {
                    var2.method5800(this.field2418);
                }
                return true;
            default:
                return false;
        }
    }
}
