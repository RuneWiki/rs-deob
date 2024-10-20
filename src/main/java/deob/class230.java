package deob;

import java.awt.datatransfer.Clipboard;

@ObfuscatedName("it")
public class class230 implements class30 {

    @ObfuscatedName("it.aq")
    public class359 field2438 = null;

    @ObfuscatedName("it.ad")
    public boolean field2436 = false;

    @ObfuscatedName("it.ag")
    public boolean field2437 = false;

    @ObfuscatedName("it.au(Lnx;I)V")
    public void method4014(class359 arg0) {
        if (arg0 == null) {
            this.method4016();
            return;
        }
        if (this.field2438 != arg0) {
            this.method4016();
            this.field2438 = arg0;
        }
        class355 var2 = arg0.method6268();
        if (var2 == null) {
            return;
        }
        if (!var2.field3768.method6011() && var2.field3769 != null) {
            class90 var3 = new class90();
            var3.method2273(arg0);
            var3.method2271(var2.field3769);
            client.method5827().method6794(var3);
        }
        var2.field3768.method6139(true);
    }

    @ObfuscatedName("it.ah(B)Lnx;")
    public class359 method4015() {
        return this.field2438;
    }

    @ObfuscatedName("it.az(I)V")
    public void method4016() {
        if (this.field2438 == null) {
            return;
        }
        class355 var1 = this.field2438.method6268();
        class359 var2 = this.field2438;
        this.field2438 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3768.method6011() && var1.field3769 != null) {
            class90 var3 = new class90();
            var3.method2273(var2);
            var3.method2271(var1.field3769);
            client.method5827().method6794(var3);
        }
        var1.field3768.method6139(false);
    }

    @ObfuscatedName("it.aq(II)Z")
    public boolean method439(int arg0) {
        if (this.field2438 == null) {
            return false;
        }
        class28 var2 = this.field2438.method6316();
        if (var2 == null) {
            return false;
        }
        if (var2.method394(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2437 = true;
                    break;
                case 82:
                    this.field2436 = true;
                    break;
                default:
                    if (this.method4018(arg0)) {
                        client.method7942(this.field2438);
                    }
            }
        }
        return var2.method392(arg0);
    }

    @ObfuscatedName("it.ad(IB)Z")
    public boolean method441(int arg0) {
        switch(arg0) {
            case 81:
                this.field2437 = false;
                return false;
            case 82:
                this.field2436 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("it.ag(CI)Z")
    public boolean method433(char arg0) {
        if (this.field2438 == null) {
            return false;
        } else if (class414.method3814(arg0)) {
            class357 var2 = this.field2438.method6367();
            if (var2 == null || !var2.method6016()) {
                return false;
            }
            class28 var3 = this.field2438.method6316();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method395(arg0) && var2.method5977(arg0)) {
                    client.method7942(this.field2438);
                }
                return var3.method393(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("it.ak(ZS)Z")
    public boolean method434(boolean arg0) {
        return false;
    }

    @ObfuscatedName("it.ax(IB)Z")
    public boolean method4018(int arg0) {
        if (this.field2438 == null) {
            return false;
        }
        class357 var2 = this.field2438.method6367();
        if (var2 == null || !var2.method6016()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method4016();
                return true;
            case 48:
                if (this.field2436) {
                    var2.method6030();
                }
                return true;
            case 65:
                if (this.field2436) {
                    Clipboard var10 = Statics.field4675.method486();
                    var2.method6002(var10);
                }
                return true;
            case 66:
                if (this.field2436) {
                    Clipboard var8 = Statics.field4675.method486();
                    var2.method6001(var8);
                }
                return true;
            case 67:
                if (this.field2436) {
                    Clipboard var6 = Statics.field4675.method486();
                    var2.method6124(var6);
                }
                return true;
            case 84:
                if (var2.method6160() == 0) {
                    var2.method5977(10);
                } else if (this.field2437 && var2.method6026()) {
                    var2.method5977(10);
                } else {
                    class355 var3 = this.field2438.method6268();
                    class90 var4 = new class90();
                    var4.method2273(this.field2438);
                    var4.method2271(var3.field3770);
                    client.method5827().method6794(var4);
                    this.method4016();
                }
                return true;
            case 85:
                if (this.field2436) {
                    var2.method5980();
                } else {
                    var2.method6162();
                }
                return true;
            case 96:
                if (this.field2436) {
                    var2.method5991(this.field2437);
                } else {
                    var2.method6141(this.field2437);
                }
                return true;
            case 97:
                if (this.field2436) {
                    var2.method5978(this.field2437);
                } else {
                    var2.method5990(this.field2437);
                }
                return true;
            case 98:
                if (this.field2436) {
                    var2.method6010();
                } else {
                    var2.method6170(this.field2437);
                }
                return true;
            case 99:
                if (this.field2436) {
                    var2.method6005();
                } else {
                    var2.method5994(this.field2437);
                }
                return true;
            case 101:
                if (this.field2436) {
                    var2.method5958();
                } else {
                    var2.method5979();
                }
                return true;
            case 102:
                if (this.field2436) {
                    var2.method6169(this.field2437);
                } else {
                    var2.method5985(this.field2437);
                }
                return true;
            case 103:
                if (this.field2436) {
                    var2.method5988(this.field2437);
                } else {
                    var2.method5986(this.field2437);
                }
                return true;
            case 104:
                if (this.field2436) {
                    var2.method5983(this.field2437);
                } else {
                    var2.method5995(this.field2437);
                }
                return true;
            case 105:
                if (this.field2436) {
                    var2.method5998(this.field2437);
                } else {
                    var2.method6118(this.field2437);
                }
                return true;
            default:
                return false;
        }
    }
}
